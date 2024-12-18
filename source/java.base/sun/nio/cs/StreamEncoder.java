/*
 * Copyright (c) 2001, 2023, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package sun.nio.cs;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import jdk.internal.misc.InternalLock;

public final class StreamEncoder extends Writer {

    private static final int INITIAL_BYTE_BUFFER_CAPACITY = 512;
    private static final int MAX_BYTE_BUFFER_CAPACITY = 8192;

    private volatile boolean closed;

    private void ensureOpen() throws IOException {
        if (closed)
            throw new IOException("Stream closed");
    }

    // Factories for java.io.OutputStreamWriter
    public static StreamEncoder forOutputStreamWriter(OutputStream out,
                                                      Object lock,
                                                      String charsetName)
        throws UnsupportedEncodingException
    {
        try {
            return new StreamEncoder(out, lock, Charset.forName(charsetName));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException x) {
            throw new UnsupportedEncodingException (charsetName);
        }
    }

    public static StreamEncoder forOutputStreamWriter(OutputStream out,
                                                      Object lock,
                                                      Charset cs)
    {
        return new StreamEncoder(out, lock, cs);
    }

    public static StreamEncoder forOutputStreamWriter(OutputStream out,
                                                      Object lock,
                                                      CharsetEncoder enc)
    {
        return new StreamEncoder(out, lock, enc);
    }


    // Factory for java.nio.channels.Channels.newWriter

    public static StreamEncoder forEncoder(WritableByteChannel ch,
                                           CharsetEncoder enc,
                                           int minBufferCap)
    {
        return new StreamEncoder(ch, enc, minBufferCap);
    }


    // -- Public methods corresponding to those in OutputStreamWriter --

    // All synchronization and state/argument checking is done in these public
    // methods; the concrete stream-encoder subclasses defined below need not
    // do any such checking.

    public String getEncoding() {
        if (isOpen())
            return encodingName();
        return null;
    }

    public void flushBuffer() throws IOException {
        Object lock = this.lock;
        if (lock instanceof InternalLock locker) {
            locker.lock();
            try {
                lockedFlushBuffer();
            } finally {
                locker.unlock();
            }
        } else {
            synchronized (lock) {
                lockedFlushBuffer();
            }
        }
    }

    private void lockedFlushBuffer() throws IOException {
        if (isOpen())
            implFlushBuffer();
        else
            throw new IOException("Stream closed");
    }

    public void write(int c) throws IOException {
        char[] cbuf = new char[1];
        cbuf[0] = (char) c;
        write(cbuf, 0, 1);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        Object lock = this.lock;
        if (lock instanceof InternalLock locker) {
            locker.lock();
            try {
                lockedWrite(cbuf, off, len);
            } finally {
                locker.unlock();
            }
        } else {
            synchronized (lock) {
                lockedWrite(cbuf, off, len);
            }
        }
    }

    private void lockedWrite(char[] cbuf, int off, int len) throws IOException {
        ensureOpen();
        if ((off < 0) || (off > cbuf.length) || (len < 0) ||
                ((off + len) > cbuf.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return;
        }
        implWrite(cbuf, off, len);
    }

    /*
    *   str：需要写入的字符串。
        off：从字符串 str 的某个偏移量（off）开始读取。
        len：读取的字符数长度。
    这段代码首先检查参数 len 的合法性（不能为负数）。
    然后创建一个长度为 len 的字符数组 cbuf，并从字符串 str 中提取从偏移量 off 开始，长度为 len 的字符，存储到字符数组 cbuf 中。
    最后，将这个字符数组交给另一个 write 方法，将其写出。
    * */
    public void write(String str, int off, int len) throws IOException {
        if (len < 0)
            //抛出索引越界异常
            throw new IndexOutOfBoundsException();
        //通过 new char[len] 创建一个长度为 len 的字符数组 cbuf。这个字符数组将用于存储从字符串中提取的字符。
        char[] cbuf = new char[len];
        //这行代码使用 String 类的 getChars 方法，将字符串 str 中从 off 偏移量开始的 len 个字符提取出来，存入字符数组 cbuf。
        str.getChars(off, off + len, cbuf, 0);
        //最后调用另一个 write 方法，将存储在字符数组 cbuf 中的字符写出。
        /**
         * cbuf：包含了从字符串中提取的字符的字符数组。
         * 0：从字符数组的起始位置开始写。
         * len：写出的字符数量，即从数组中写出 len 个字符。
         * */
        write(cbuf, 0, len);
    }

    public void write(CharBuffer cb) throws IOException {
        int position = cb.position();
        try {
            Object lock = this.lock;
            if (lock instanceof InternalLock locker) {
                locker.lock();
                try {
                    lockedWrite(cb);
                } finally {
                    locker.unlock();
                }
            } else {
                synchronized (lock) {
                    lockedWrite(cb);
                }
            }
        } finally {
            cb.position(position);
        }
    }

    private void lockedWrite(CharBuffer cb) throws IOException {
        ensureOpen();
        implWrite(cb);
    }

    public void flush() throws IOException {
        Object lock = this.lock;
        if (lock instanceof InternalLock locker) {
            locker.lock();
            try {
                lockedFlush();
            } finally {
                locker.unlock();
            }
        } else {
            synchronized (lock) {
                lockedFlush();
            }
        }
    }

    private void lockedFlush() throws IOException {
        ensureOpen();
        implFlush();
    }

    public void close() throws IOException {
        Object lock = this.lock;
        if (lock instanceof InternalLock locker) {
            locker.lock();
            try {
                lockedClose();
            } finally {
                locker.unlock();
            }
        } else {
            synchronized (lock) {
                lockedClose();
            }
        }
    }

    private void lockedClose() throws IOException {
        if (closed)
            return;
        try {
            implClose();
        } finally {
            closed = true;
        }
    }

    private boolean isOpen() {
        return !closed;
    }


    // -- Charset-based stream encoder impl --

    private final Charset cs;
    private final CharsetEncoder encoder;
    private ByteBuffer bb;
    private final int maxBufferCapacity;

    // Exactly one of these is non-null
    private final OutputStream out;
    private final WritableByteChannel ch;

    // Leftover first char in a surrogate pair
    private boolean haveLeftoverChar = false;
    private char leftoverChar;
    private CharBuffer lcb = null;

    private StreamEncoder(OutputStream out, Object lock, Charset cs) {
        this(out, lock,
            cs.newEncoder()
                .onMalformedInput(CodingErrorAction.REPLACE)
                .onUnmappableCharacter(CodingErrorAction.REPLACE));
    }

    private StreamEncoder(OutputStream out, Object lock, CharsetEncoder enc) {
        super(lock);
        this.out = out;
        this.ch = null;
        this.cs = enc.charset();
        this.encoder = enc;

        this.bb = ByteBuffer.allocate(INITIAL_BYTE_BUFFER_CAPACITY);
        this.maxBufferCapacity = MAX_BYTE_BUFFER_CAPACITY;
    }

    private StreamEncoder(WritableByteChannel ch, CharsetEncoder enc, int mbc) {
        this.out = null;
        this.ch = ch;
        this.cs = enc.charset();
        this.encoder = enc;

        if (mbc > 0) {
            this.bb = ByteBuffer.allocate(mbc);
            this.maxBufferCapacity = mbc;
        } else {
            this.bb = ByteBuffer.allocate(INITIAL_BYTE_BUFFER_CAPACITY);
            this.maxBufferCapacity = MAX_BYTE_BUFFER_CAPACITY;
        }
    }

    private void writeBytes() throws IOException {
        bb.flip();
        int lim = bb.limit();
        int pos = bb.position();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);

        if (rem > 0) {
            if (ch != null) {
                int wc = ch.write(bb);
                assert wc == rem : rem;
            } else {
                out.write(bb.array(), bb.arrayOffset() + pos, rem);
            }
        }
        bb.clear();
    }

    private void flushLeftoverChar(CharBuffer cb, boolean endOfInput)
        throws IOException
    {
        if (!haveLeftoverChar && !endOfInput)
            return;
        if (lcb == null)
            lcb = CharBuffer.allocate(2);
        else
            lcb.clear();
        if (haveLeftoverChar)
            lcb.put(leftoverChar);
        if ((cb != null) && cb.hasRemaining())
            lcb.put(cb.get());
        lcb.flip();
        while (lcb.hasRemaining() || endOfInput) {
            CoderResult cr = encoder.encode(lcb, bb, endOfInput);
            if (cr.isUnderflow()) {
                if (lcb.hasRemaining()) {
                    leftoverChar = lcb.get();
                    if (cb != null && cb.hasRemaining()) {
                        lcb.clear();
                        lcb.put(leftoverChar).put(cb.get()).flip();
                        continue;
                    }
                    return;
                }
                break;
            }
            if (cr.isOverflow()) {
                assert bb.position() > 0;
                writeBytes();
                continue;
            }
            cr.throwException();
        }
        haveLeftoverChar = false;
    }

    void implWrite(char[] cbuf, int off, int len)
        throws IOException
    {
        CharBuffer cb = CharBuffer.wrap(cbuf, off, len);
        implWrite(cb);
    }

    void implWrite(CharBuffer cb)
        throws IOException
    {
        if (haveLeftoverChar) {
            flushLeftoverChar(cb, false);
        }

        growByteBufferIfNeeded(cb.remaining());

        while (cb.hasRemaining()) {
            CoderResult cr = encoder.encode(cb, bb, false);
            if (cr.isUnderflow()) {
                assert (cb.remaining() <= 1) : cb.remaining();
                if (cb.remaining() == 1) {
                    haveLeftoverChar = true;
                    leftoverChar = cb.get();
                }
                break;
            }
            if (cr.isOverflow()) {
                assert bb.position() > 0;
                writeBytes();
                continue;
            }
            cr.throwException();
        }
    }

    /**
     * Grows bb to a capacity to allow len characters be encoded.
     */
    void growByteBufferIfNeeded(int len) throws IOException {
        int cap = bb.capacity();
        if (cap < maxBufferCapacity) {
            int maxBytes = len * Math.round(encoder.maxBytesPerChar());
            int newCap = Math.min(maxBytes, maxBufferCapacity);
            if (newCap > cap) {
                implFlushBuffer();
                bb = ByteBuffer.allocate(newCap);
            }
        }
    }

    void implFlushBuffer() throws IOException {
        if (bb.position() > 0) {
            writeBytes();
        }
    }

    void implFlush() throws IOException {
        implFlushBuffer();
        if (out != null) {
            out.flush();
        }
    }

    void implClose() throws IOException {
        flushLeftoverChar(null, true);
        try {
            for (;;) {
                CoderResult cr = encoder.flush(bb);
                if (cr.isUnderflow())
                    break;
                if (cr.isOverflow()) {
                    assert bb.position() > 0;
                    writeBytes();
                    continue;
                }
                cr.throwException();
            }

            if (bb.position() > 0)
                writeBytes();
            if (ch != null)
                ch.close();
            else {
                try {
                    out.flush();
                } finally {
                    out.close();
                }
            }
        } catch (IOException x) {
            encoder.reset();
            throw x;
        }
    }

    String encodingName() {
        return ((cs instanceof HistoricallyNamedCharset)
            ? ((HistoricallyNamedCharset)cs).historicalName()
            : cs.name());
    }
}

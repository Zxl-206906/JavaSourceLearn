/*
 * Copyright (c) 1996, 2023, Oracle and/or its affiliates. All rights reserved.
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

package java.io;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import jdk.internal.misc.InternalLock;
import sun.nio.cs.StreamEncoder;

/**
 * An OutputStreamWriter is a bridge from character streams to byte streams:
 * Characters written to it are encoded into bytes using a specified {@link
 * Charset charset}.  The charset that it uses
 * may be specified by name or may be given explicitly, or the
 * default charset may be accepted.
 *
 * <p> Each invocation of a write() method causes the encoding converter to be
 * invoked on the given character(s).  The resulting bytes are accumulated in a
 * buffer before being written to the underlying output stream.  Note that the
 * characters passed to the write() methods are not buffered.
 *
 * <p> For top efficiency, consider wrapping an OutputStreamWriter within a
 * BufferedWriter so as to avoid frequent converter invocations.  For example:
 *
 * {@snippet lang=java :
 *     Writer out = new BufferedWriter(new OutputStreamWriter(anOutputStream));
 * }
 *
 * <p> A <i>surrogate pair</i> is a character represented by a sequence of two
 * {@code char} values: A <i>high</i> surrogate in the range '&#92;uD800' to
 * '&#92;uDBFF' followed by a <i>low</i> surrogate in the range '&#92;uDC00' to
 * '&#92;uDFFF'.
 *
 * <p> A <i>malformed surrogate element</i> is a high surrogate that is not
 * followed by a low surrogate or a low surrogate that is not preceded by a
 * high surrogate.
 *
 * <p> This class always replaces malformed surrogate elements and unmappable
 * character sequences with the charset's default <i>substitution sequence</i>.
 * The {@linkplain CharsetEncoder} class should be used when more
 * control over the encoding process is required.
 *
 * @see BufferedWriter
 * @see OutputStream
 * @see Charset
 *
 * @author      Mark Reinhold
 * @since       1.1
 */

public class OutputStreamWriter extends Writer {
    private final StreamEncoder se;

    /**
     * Return the lock object for the given writer's stream encoder.
     * If the writer type is trusted then an internal lock can be used. If the
     * writer type is not trusted then the writer object is the lock.
     */
    private static Object lockFor(OutputStreamWriter writer) {
        Class<?> clazz = writer.getClass();
        if (clazz == OutputStreamWriter.class || clazz == FileWriter.class) {
            return InternalLock.newLockOr(writer);
        } else {
            return writer;
        }
    }

    /**
     * Creates an OutputStreamWriter that uses the named charset.
     *
     * @param  out
     *         An OutputStream
     *
     * @param  charsetName
     *         The name of a supported {@link Charset charset}
     *
     * @throws     UnsupportedEncodingException
     *             If the named encoding is not supported
     */
    public OutputStreamWriter(OutputStream out, String charsetName)
        throws UnsupportedEncodingException
    {
        super(out);
        if (charsetName == null)
            throw new NullPointerException("charsetName");
        se = StreamEncoder.forOutputStreamWriter(out, lockFor(this), charsetName);
    }

    /**
     * Creates an OutputStreamWriter that uses the default character encoding, or
     * where {@code out} is a {@code PrintStream}, the charset used by the print
     * stream.
     *
     * @param  out  An OutputStream
     * @see Charset#defaultCharset()
     */
    public OutputStreamWriter(OutputStream out) {
        super(out);
        se = StreamEncoder.forOutputStreamWriter(out, lockFor(this),
                out instanceof PrintStream ps ? ps.charset() : Charset.defaultCharset());
    }

    /**
     * Creates an OutputStreamWriter that uses the given charset.
     *
     * @param  out
     *         An OutputStream
     *
     * @param  cs
     *         A charset
     *
     * @since 1.4
     */
    public OutputStreamWriter(OutputStream out, Charset cs) {
        super(out);
        if (cs == null)
            throw new NullPointerException("charset");
        se = StreamEncoder.forOutputStreamWriter(out, lockFor(this), cs);
    }

    /**
     * Creates an OutputStreamWriter that uses the given charset encoder.
     *
     * @param  out
     *         An OutputStream
     *
     * @param  enc
     *         A charset encoder
     *
     * @since 1.4
     */
    public OutputStreamWriter(OutputStream out, CharsetEncoder enc) {
        super(out);
        if (enc == null)
            throw new NullPointerException("charset encoder");
        se = StreamEncoder.forOutputStreamWriter(out, lockFor(this), enc);
    }

    /**
     * Returns the name of the character encoding being used by this stream.
     *
     * <p> If the encoding has an historical name then that name is returned;
     * otherwise the encoding's canonical name is returned.
     *
     * <p> If this instance was created with the {@link
     * #OutputStreamWriter(OutputStream, String)} constructor then the returned
     * name, being unique for the encoding, may differ from the name passed to
     * the constructor.  This method may return {@code null} if the stream has
     * been closed. </p>
     *
     * @return The historical name of this encoding, or possibly
     *         {@code null} if the stream has been closed
     *
     * @see Charset
     *
     * @revised 1.4
     */
    public String getEncoding() {
        return se.getEncoding();
    }

    /**
     * Flushes the output buffer to the underlying byte stream, without flushing
     * the byte stream itself.  This method is non-private only so that it may
     * be invoked by PrintStream.
     */
    void flushBuffer() throws IOException {
        se.flushBuffer();
    }

    /**
     * Writes a single character.
     *
     * @throws     IOException  If an I/O error occurs
     */
    public void write(int c) throws IOException {
        se.write(c);
    }

    /**
     * Writes a portion of an array of characters.
     *
     * @param  cbuf  Buffer of characters
     * @param  off   Offset from which to start writing characters
     * @param  len   Number of characters to write
     *
     * @throws  IndexOutOfBoundsException
     *          If {@code off} is negative, or {@code len} is negative,
     *          or {@code off + len} is negative or greater than the length
     *          of the given array
     *
     * @throws  IOException  If an I/O error occurs
     */
    public void write(char[] cbuf, int off, int len) throws IOException {
        se.write(cbuf, off, len);
    }

    /**
     * Writes a portion of a string.
     *
     * @param  str  A String
     * @param  off  Offset from which to start writing characters
     * @param  len  Number of characters to write
     *
     * @throws  IndexOutOfBoundsException
     *          If {@code off} is negative, or {@code len} is negative,
     *          or {@code off + len} is negative or greater than the length
     *          of the given string
     *
     * @throws  IOException  If an I/O error occurs
     */
    // 写入给定字符串中的一部分到输出流中
    public void write(String str, int off, int len) throws IOException {
        se.write(str, off, len);
    }

    @Override
    public Writer append(CharSequence csq, int start, int end) throws IOException {
        if (csq == null) csq = "null";
        return append(csq.subSequence(start, end));
    }

    @Override
    public Writer append(CharSequence csq) throws IOException {
        if (csq instanceof CharBuffer) {
            se.write((CharBuffer) csq);
        } else {
            se.write(String.valueOf(csq));
        }
        return this;
    }

    /**
     * Flushes the stream.
     *
     * @throws     IOException  If an I/O error occurs
     */
    public void flush() throws IOException {
        se.flush();
    }

    public void close() throws IOException {
        se.close();
    }
}

/*
 * Copyright (c) 2022, Oracle and/or its affiliates. All rights reserved.
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
package jdk.internal.classfile;

import java.nio.ByteBuffer;
import java.util.List;

import jdk.internal.classfile.constantpool.ConstantPool;
import jdk.internal.classfile.constantpool.ConstantPoolBuilder;
import jdk.internal.classfile.constantpool.PoolEntry;
import jdk.internal.classfile.impl.BufWriterImpl;

/**
 * Supports writing portions of a classfile to a growable buffer.   Method
 * are provided to write various standard entities (e.g., {@code u2}, {@code u4})
 * to the end of the buffer, as well as to create constant pool entries.
 */
public sealed interface BufWriter
        permits BufWriterImpl {

    /** {@return the constant pool builder associated with this buffer} */
    ConstantPoolBuilder constantPool();

    /**
     * {@return whether the provided constant pool is index-compatible with this
     * one}  This may be because they are the same constant pool, or because this
     * constant pool was copied from the other.
     *
     * @param other the other constant pool
     */
    boolean canWriteDirect(ConstantPool other);

    /**
     * Ensure that the buffer has at least {@code freeBytes} bytes of unused space
     * @param freeBytes the number of bytes to reserve
     */
    void reserveSpace(int freeBytes);

    /**
     * Write an unsigned byte to the buffer
     *
     * @param x the byte value
     */
    void writeU1(int x);

    /**
     * Write an unsigned short to the buffer
     *
     * @param x the short value
     */
    void writeU2(int x);

    /**
     * Write a signed int to the buffer
     *
     * @param x the int value
     */
    void writeInt(int x);

    /**
     * Write a float value to the buffer
     *
     * @param x the float value
     */
    void writeFloat(float x);

    /**
     * Write a long value to the buffer
     *
     * @param x the long value
     */
    void writeLong(long x);

    /**
     * Write a double value to the buffer
     *
     * @param x the int value
     */
    void writeDouble(double x);

    /**
     * Write the contents of a byte array to the buffer
     *
     * @param arr the byte array
     */
    void writeBytes(byte[] arr);

    /**
     * Write the contents of another {@link BufWriter} to the buffer
     *
     * @param other the other {@linkplain BufWriter}
     */
    void writeBytes(BufWriter other);

    /**
     * Write a range of a byte array to the buffer
     *
     * @param arr the byte array
     * @param start the offset within the byte array of the range
     * @param length the length of the range
     */
    void writeBytes(byte[] arr, int start, int length);

    /**
     * Patch a previously written integer value.  Depending on the specified
     * size, the entire value, or the low 1 or 2 bytes, may be written.
     *
     * @param offset the offset at which to patch
     * @param size the size of the integer value being written, in bytes
     * @param value the integer value
     */
    void patchInt(int offset, int size, int value);

    /**
     * Write a 1, 2, 4, or 8 byte integer value to the buffer.  Depending on
     * the specified size, the entire value, or the low 1, 2, or 4 bytes, may
     * be written.
     *
     * @param intSize the size of the integer value being written, in bytes
     * @param intValue the integer value
     */
    void writeIntBytes(int intSize, long intValue);

    /**
     * Write the index of the specified constant pool entry, as a {@code u2},
     * to the buffer
     *
     * @param entry the constant pool entry
     * @throws NullPointerException if the entry is null
     */
    void writeIndex(PoolEntry entry);

    /**
     * Write the index of the specified constant pool entry, as a {@code u2},
     * to the buffer, or zero if the entry is null
     *
     * @param entry the constant pool entry
     */
    void writeIndexOrZero(PoolEntry entry);

    /**
     * Write a list of entities to the buffer.  The length of the list is
     * written as a {@code u2}, followed by the bytes corresponding to each
     * element in the list.  Writing of the entities is delegated to the entry.
     *
     * @param list the entities
     * @param <T> the type of entity
     */
    <T extends WritableElement<?>> void writeList(List<T> list);

    /**
     * Write a list of constant pool entry indexes to the buffer.  The length
     * of the list is written as a {@code u2}, followed by a {@code u2} for each
     * entry in the list.
     *
     * @param list the list of entries
     */
    void writeListIndices(List<? extends PoolEntry> list);

    /**
     * {@return the number of bytes that have been written to the buffer}
     */
    int size();

    /**
     * {@return a {@link java.nio.ByteBuffer ByteBuffer} view of the bytes in the buffer}
     */
    ByteBuffer asByteBuffer();

    /**
     * Copy the contents of the buffer into a byte array.
     *
     * @param array the byte array
     * @param bufferOffset the offset into the array at which to write the
     *                     contents of the buffer
     */
    void copyTo(byte[] array, int bufferOffset);
}

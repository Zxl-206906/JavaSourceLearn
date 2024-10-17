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
package jdk.internal.classfile.impl;

/**
 * An open-chain multimap used to map nonzero hashes to indexes (of either CP
 * elements or BSM entries).  Code transformed from public domain implementation
 * (<a href="http://java-performance.info/">http://java-performance.info/</a>).
 *
 * The internal data structure is an array of 2N int elements, where the first
 * element is the hash and the second is the mapped index.  To look something up
 * in the map, provide a hash value and an index to map it to, and invoke
 * firstToken(hash).  This returns an opaque token that can be provided to
 * nextToken(hash, token) to get the next candidate, or to getElementByToken(token)
 * or getIndexByToken to get the mapped element or index.
 */
public abstract class EntryMap<T> {
    public static final int NO_VALUE = -1;

    /**
     * Keys and values
     */
    private int[] data;

    /**
     * Fill factor, must be between (0 and 1)
     */
    private final float fillFactor;
    /**
     * We will resize a map once it reaches this size
     */
    private int resizeThreshold;
    /**
     * Current map size
     */
    private int size;

    /**
     * Mask to calculate the original position
     */
    private int mask1;
    private int mask2;

    public EntryMap(int size, float fillFactor) {
        if (fillFactor <= 0 || fillFactor >= 1)
            throw new IllegalArgumentException("FillFactor must be in (0, 1)");
        if (size <= 0)
            throw new IllegalArgumentException("Size must be positive!");

        int capacity = arraySize(size, fillFactor);
        this.fillFactor = fillFactor;
        this.resizeThreshold = (int) (capacity * fillFactor);
        this.mask1 = capacity - 1;
        this.mask2 = capacity * 2 - 1;
        data = new int[capacity * 2];
    }

    protected abstract T fetchElement(int index);

    public int firstToken(int hash) {
        if (hash == 0)
            throw new IllegalArgumentException("hash must be nonzero");

        int ix = (hash & mask1) << 1;
        int k = data[ix];

        if (k == 0)
            return NO_VALUE;  //end of chain already
        else if (k == hash)
            return ix;
        else
            return nextToken(hash, ix);
    }

    public int nextToken(int hash, int token) {
        int ix = token;
        while (true) {
            ix = (ix + 2) & mask2; // next index
            int k = data[ix];
            if (k == 0)
                return NO_VALUE;
            else if (k == hash)
                return ix;
        }
    }

    public int getIndexByToken(int token) {
        return data[token + 1];
    }

    public T getElementByToken(int token) {
        return fetchElement(data[token + 1]);
    }

    public void put(int hash, int index) {
        if (hash == 0)
            throw new IllegalArgumentException("hash must be nonzero");

        int ptr = (hash & mask1) << 1;
        int k = data[ptr];
        if (k == 0) {
            data[ptr] = hash;
            data[ptr + 1] = index;
            if (size >= resizeThreshold)
                rehash(data.length * 2); //size is set inside
            else
                ++size;
            return;
        }
        else if (k == hash && data[ptr + 1] == index) {
            return;
        }

        while (true) {
            ptr = (ptr + 2) & mask2; // next index
            k = data[ptr];
            if (k == 0) {
                data[ptr] = hash;
                data[ptr + 1] = index;
                if (size >= resizeThreshold)
                    rehash(data.length * 2); //size is set inside
                else
                    ++size;
                return;
            }
            else if (k == hash && data[ptr + 1] == index) {
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    private void rehash(final int newCapacity) {
        resizeThreshold = (int) (newCapacity / 2 * fillFactor);
        mask1 = newCapacity / 2 - 1;
        mask2 = newCapacity - 1;

        final int oldCapacity = data.length;
        final int[] oldData = data;

        data = new int[newCapacity];
        size = 0;

        for (int i = 0; i < oldCapacity; i += 2) {
            final int oldHash = oldData[i];
            if (oldHash != 0)
                put(oldHash, oldData[i + 1]);
        }
    }

    public static long nextPowerOfTwo( long x ) {
        return 1L << -Long.numberOfLeadingZeros(x - 1);
    }

    public static int arraySize( final int expected, final float f ) {
        final long s = Math.max( 2, nextPowerOfTwo( (long)Math.ceil( expected / f ) ) );
        if ( s > (1 << 30) )
            throw new IllegalArgumentException("Too large (" + expected
                    + " expected elements with load factor " + f + ")" );
        return (int)s;
    }
}

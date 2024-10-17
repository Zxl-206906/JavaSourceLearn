/*
 * Copyright (c) 1999, 2022, Oracle and/or its affiliates. All rights reserved.
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

package javax.security.auth;

/**
 * Objects such as credentials may optionally implement this interface
 * to provide the capability to destroy its contents.
 *
 * @since 1.4
 * @see javax.security.auth.Subject
 */
public interface Destroyable {

    /**
     * Destroy this {@code Object}.
     *
     * <p> Sensitive information associated with this {@code Object}
     * is destroyed or cleared.  Subsequent calls to certain methods
     * on this {@code Object} will result in an
     * {@code IllegalStateException} being thrown.
     *
     * @implSpec
     * The default implementation throws {@code DestroyFailedException}.
     *
     * @exception DestroyFailedException if the destroy operation fails.
     *
     * @exception SecurityException if the caller does not have permission
     *          to destroy this {@code Object}.
     */
    default void destroy() throws DestroyFailedException {
        throw new DestroyFailedException();
    }

    /**
     * Determine if this {@code Object} has been destroyed.
     *
     * @implSpec
     * The default implementation returns false.
     *
     * @return true if this {@code Object} has been destroyed,
     *          false otherwise.
     */
    default boolean isDestroyed() {
        return false;
    }
}
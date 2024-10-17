/*
 * Copyright (c) 2019, 2023, Oracle and/or its affiliates. All rights reserved.
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
 */


package jdk.vm.ci.meta;

import java.util.Arrays;
import java.util.function.Supplier;

import jdk.vm.ci.meta.SpeculationLog.SpeculationReason;

/**
 * An implementation of {@link SpeculationReason} based on encoded values.
 */
public class EncodedSpeculationReason implements SpeculationReason {
    final int groupId;
    final String groupName;
    final Object[] context;
    private SpeculationLog.SpeculationReasonEncoding encoding;

    public EncodedSpeculationReason(int groupId, String groupName, Object[] context) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.context = context;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EncodedSpeculationReason) {
            if (obj instanceof EncodedSpeculationReason) {
                EncodedSpeculationReason that = (EncodedSpeculationReason) obj;
                return this.groupId == that.groupId && Arrays.equals(this.context, that.context);
            }
            return false;
        }
        return false;
    }

    @Override
    public SpeculationLog.SpeculationReasonEncoding encode(Supplier<SpeculationLog.SpeculationReasonEncoding> encodingSupplier) {
        if (encoding == null) {
            encoding = encodingSupplier.get();
            encoding.addInt(groupId);
            encoding.addInt(groupName.hashCode());
            for (Object o : context) {
                if (o == null) {
                    encoding.addInt(0);
                } else {
                    addNonNullObject(encoding, o);
                }
            }
        }
        return encoding;
    }

    static void addNonNullObject(SpeculationLog.SpeculationReasonEncoding encoding, Object o) {
        Class<? extends Object> c = o.getClass();
        if (c == String.class) {
            encoding.addString((String) o);
        } else if (c == Byte.class) {
            encoding.addByte((Byte) o);
        } else if (c == Short.class) {
            encoding.addShort((Short) o);
        } else if (c == Character.class) {
            encoding.addShort((Character) o);
        } else if (c == Integer.class) {
            encoding.addInt((Integer) o);
        } else if (c == Long.class) {
            encoding.addLong((Long) o);
        } else if (c == Float.class) {
            encoding.addInt(Float.floatToRawIntBits((Float) o));
        } else if (c == Double.class) {
            encoding.addLong(Double.doubleToRawLongBits((Double) o));
        } else if (o instanceof Enum) {
            encoding.addInt(((Enum<?>) o).ordinal());
        } else if (o instanceof ResolvedJavaMethod) {
            encoding.addMethod((ResolvedJavaMethod) o);
        } else if (o instanceof ResolvedJavaType) {
            encoding.addType((ResolvedJavaType) o);
        } else if (o instanceof ResolvedJavaField) {
            encoding.addField((ResolvedJavaField) o);
        } else {
            throw new IllegalArgumentException("Unsupported type for encoding: " + c.getName());
        }
    }

    @Override
    public int hashCode() {
        return groupId + Arrays.hashCode(this.context);
    }

    @Override
    public String toString() {
        return String.format("%s@%d%s", groupName, groupId, Arrays.toString(context));
    }
}

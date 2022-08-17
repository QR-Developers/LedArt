/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.ax
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.ax;

public final class Gender
extends Enum<Gender>
implements ax {
    private static final /* synthetic */ Gender[] $VALUES;
    public static final /* enum */ Gender FEMALE;
    public static final /* enum */ Gender MALE;
    public static final /* enum */ Gender UNKNOWN;
    private final int value;

    static {
        Gender gender;
        Gender gender2;
        Gender gender3;
        MALE = gender3 = new Gender(0);
        FEMALE = gender2 = new Gender(1);
        UNKNOWN = gender = new Gender(2);
        $VALUES = new Gender[]{gender3, gender2, gender};
    }

    private Gender(int n3) {
        this.value = n3;
    }

    public static Gender findByValue(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return null;
                }
                return UNKNOWN;
            }
            return FEMALE;
        }
        return MALE;
    }

    public static Gender valueOf(String string) {
        return (Gender)Enum.valueOf(Gender.class, (String)string);
    }

    public static Gender[] values() {
        return (Gender[])$VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}


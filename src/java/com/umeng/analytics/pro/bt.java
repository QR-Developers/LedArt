/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.az
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.umeng.analytics.pro;

import com.umeng.analytics.pro.az;

public class bt
extends az {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private static final long h = 1L;
    protected int g = 0;

    public bt() {
    }

    public bt(int n2) {
        this.g = n2;
    }

    public bt(int n2, String string) {
        super(string);
        this.g = n2;
    }

    public bt(int n2, String string, Throwable throwable) {
        super(string, throwable);
        this.g = n2;
    }

    public bt(int n2, Throwable throwable) {
        super(throwable);
        this.g = n2;
    }

    public bt(String string) {
        super(string);
    }

    public bt(String string, Throwable throwable) {
        super(string, throwable);
    }

    public bt(Throwable throwable) {
        super(throwable);
    }

    public int a() {
        return this.g;
    }
}


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

public class ch
extends az {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private static final long g = 1L;
    protected int f = 0;

    public ch() {
    }

    public ch(int n2) {
        this.f = n2;
    }

    public ch(int n2, String string) {
        super(string);
        this.f = n2;
    }

    public ch(int n2, String string, Throwable throwable) {
        super(string, throwable);
        this.f = n2;
    }

    public ch(int n2, Throwable throwable) {
        super(throwable);
        this.f = n2;
    }

    public ch(String string) {
        super(string);
    }

    public ch(String string, Throwable throwable) {
        super(string, throwable);
    }

    public ch(Throwable throwable) {
        super(throwable);
    }

    public int a() {
        return this.f;
    }
}


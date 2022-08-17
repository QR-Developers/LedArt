/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.cg
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 */
package com.umeng.analytics.pro;

import com.umeng.analytics.pro.cg;

public final class cf
extends cg {
    private byte[] a;
    private int b;
    private int c;

    public cf() {
    }

    public cf(byte[] arrby) {
        this.a(arrby);
    }

    public cf(byte[] arrby, int n2, int n3) {
        this.c(arrby, n2, n3);
    }

    public int a(byte[] arrby, int n2, int n3) {
        int n4 = this.h();
        if (n3 > n4) {
            n3 = n4;
        }
        if (n3 > 0) {
            System.arraycopy((Object)this.a, (int)this.b, (Object)arrby, (int)n2, (int)n3);
            this.a(n3);
        }
        return n3;
    }

    public void a(int n2) {
        this.b = n2 + this.b;
    }

    public void a(byte[] arrby) {
        this.c(arrby, 0, arrby.length);
    }

    public boolean a() {
        return true;
    }

    public void b() {
    }

    public void b(byte[] arrby, int n2, int n3) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    public void c() {
    }

    public void c(byte[] arrby, int n2, int n3) {
        this.a = arrby;
        this.b = n2;
        this.c = n2 + n3;
    }

    public void e() {
        this.a = null;
    }

    public byte[] f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int h() {
        return this.c - this.b;
    }
}


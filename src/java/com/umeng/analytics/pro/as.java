/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.az
 *  com.umeng.analytics.pro.bn
 *  com.umeng.analytics.pro.bs
 *  com.umeng.analytics.pro.bv
 *  com.umeng.analytics.pro.bx
 *  java.lang.String
 */
package com.umeng.analytics.pro;

import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bx;

public class as
extends az {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final bx j = new bx("TApplicationException");
    private static final bn k = new bn("message", 11, 1);
    private static final bn l = new bn("type", 8, 2);
    private static final long m = 1L;
    protected int i = 0;

    public as() {
    }

    public as(int n2) {
        this.i = n2;
    }

    public as(int n2, String string) {
        super(string);
        this.i = n2;
    }

    public as(String string) {
        super(string);
    }

    public static as a(bs bs2) {
        bs2.j();
        String string = null;
        int n2 = 0;
        do {
            bn bn2 = bs2.l();
            byte by2 = bn2.b;
            if (by2 == 0) {
                bs2.k();
                return new as(n2, string);
            }
            short s2 = bn2.c;
            if (s2 != 1) {
                if (s2 != 2) {
                    bv.a((bs)bs2, (byte)by2);
                } else if (by2 == 8) {
                    n2 = bs2.w();
                } else {
                    bv.a((bs)bs2, (byte)by2);
                }
            } else if (by2 == 11) {
                string = bs2.z();
            } else {
                bv.a((bs)bs2, (byte)by2);
            }
            bs2.m();
        } while (true);
    }

    public int a() {
        return this.i;
    }

    public void b(bs bs2) {
        bs2.a(j);
        if (this.getMessage() != null) {
            bs2.a(k);
            bs2.a(this.getMessage());
            bs2.c();
        }
        bs2.a(l);
        bs2.a(this.i);
        bs2.c();
        bs2.d();
        bs2.b();
    }
}


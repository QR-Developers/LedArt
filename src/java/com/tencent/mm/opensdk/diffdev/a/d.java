/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.tencent.mm.opensdk.diffdev.a;

public final class d
extends Enum<d> {
    public static final /* enum */ d b;
    public static final /* enum */ d c;
    public static final /* enum */ d d;
    public static final /* enum */ d e;
    public static final /* enum */ d f;
    public static final /* enum */ d g;
    private static final /* synthetic */ d[] h;
    private int a;

    static {
        d d2;
        d d3;
        d d4;
        d d5;
        d d6;
        d d7;
        b = d7 = new d(402);
        c = d2 = new d(403);
        d = d4 = new d(404);
        e = d5 = new d(405);
        f = d3 = new d(408);
        g = d6 = new d(500);
        h = new d[]{d7, d2, d4, d5, d3, d6};
    }

    private d(int n3) {
        this.a = n3;
    }

    public static d valueOf(String string2) {
        return (d)Enum.valueOf(d.class, (String)string2);
    }

    public static d[] values() {
        return (d[])h.clone();
    }

    public int a() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UUIDStatusCode:");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}


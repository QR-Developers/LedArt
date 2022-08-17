/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package m5;

import android.util.Log;

public class q {
    private byte[] a;
    private int b;

    private q() {
    }

    public static q a(int n5) {
        q q2 = new q();
        q2.a = new byte[n5];
        q2.b = 0;
        return q2;
    }

    private void c(int n5) {
        if (n5 > this.a.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("checkSize::out of memory: ");
            stringBuilder.append(this.a.length);
            Log.d((String)"HDByteBuffer", (String)stringBuilder.toString());
            byte[] arrby = this.a;
            byte[] arrby2 = new byte[arrby.length + Math.max((int)1024, (int)(n5 - arrby.length))];
            byte[] arrby3 = this.a;
            System.arraycopy((Object)arrby3, (int)0, (Object)arrby2, (int)0, (int)arrby3.length);
            this.a = arrby2;
        }
    }

    public byte[] b() {
        return this.a;
    }

    public q d() {
        int n5 = this.b;
        byte[] arrby = new byte[n5];
        System.arraycopy((Object)this.a, (int)0, (Object)arrby, (int)0, (int)n5);
        this.a = arrby;
        return this;
    }

    public int e() {
        return this.a.length;
    }

    public int f() {
        return this.b;
    }

    public void g(byte[] arrby) {
        this.c(this.b + arrby.length);
        System.arraycopy((Object)arrby, (int)0, (Object)this.a, (int)this.b, (int)arrby.length);
        this.b += arrby.length;
    }

    public void h(int n5) {
        this.i(this.b, n5);
        this.b = 2 + this.b;
    }

    public void i(int n5, int n6) {
        this.c(n5 + 2);
        byte[] arrby = this.a;
        arrby[n5] = (byte)(255 & n6 >> 8);
        arrby[n5 + 1] = (byte)(n6 & 255);
    }

    public void j(int n5) {
        this.k(this.b, n5);
        this.b = 3 + this.b;
    }

    public void k(int n5, int n6) {
        this.c(n5 + 3);
        byte[] arrby = this.a;
        arrby[n5] = (byte)(255 & n6 >> 16);
        arrby[n5 + 1] = (byte)(255 & n6 >> 8);
        arrby[n5 + 2] = (byte)(n6 & 255);
    }

    public void l(int n5) {
        this.m(this.b, n5);
        this.b = 4 + this.b;
    }

    public void m(int n5, int n6) {
        this.c(n5 + 4);
        byte[] arrby = this.a;
        arrby[n5] = (byte)(255 & n6 >> 24);
        arrby[n5 + 1] = (byte)(255 & n6 >> 16);
        arrby[n5 + 2] = (byte)(255 & n6 >> 8);
        arrby[n5 + 3] = (byte)(n6 & 255);
    }

    public void n(int n5) {
        this.o(this.b, n5);
        this.b = 1 + this.b;
    }

    public void o(int n5, int n6) {
        this.c(n5 + 1);
        this.a[n5] = (byte)(n6 & 255);
    }

    public void p(int n5) {
        this.b = n5 + this.b;
    }
}


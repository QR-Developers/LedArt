/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.az
 *  com.umeng.analytics.pro.bn
 *  com.umeng.analytics.pro.bo
 *  com.umeng.analytics.pro.bp
 *  com.umeng.analytics.pro.bq
 *  com.umeng.analytics.pro.bs
 *  com.umeng.analytics.pro.bu
 *  com.umeng.analytics.pro.bw
 *  com.umeng.analytics.pro.bx
 *  com.umeng.analytics.pro.cg
 *  java.io.UnsupportedEncodingException
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 */
package com.umeng.analytics.pro;

import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bq;
import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bt;
import com.umeng.analytics.pro.bu;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.cg;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class bl
extends bs {
    protected static final int a = -65536;
    protected static final int b = -2147418112;
    private static final bx h = new bx();
    protected boolean c = false;
    protected boolean d = true;
    protected int e;
    protected boolean f = false;
    private byte[] i = new byte[1];
    private byte[] j = new byte[2];
    private byte[] k = new byte[4];
    private byte[] l = new byte[8];
    private byte[] m = new byte[1];
    private byte[] n = new byte[2];
    private byte[] o = new byte[4];
    private byte[] p = new byte[8];

    public bl(cg cg2) {
        this(cg2, false, true);
    }

    public bl(cg cg2, boolean bl2, boolean bl3) {
        super(cg2);
        this.c = bl2;
        this.d = bl3;
    }

    private int a(byte[] arrby, int n2, int n3) {
        this.d(n3);
        return this.g.d(arrby, n2, n3);
    }

    public ByteBuffer A() {
        int n2 = this.w();
        this.d(n2);
        if (this.g.h() >= n2) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])this.g.f(), (int)this.g.g(), (int)n2);
            this.g.a(n2);
            return byteBuffer;
        }
        byte[] arrby = new byte[n2];
        this.g.d(arrby, 0, n2);
        return ByteBuffer.wrap((byte[])arrby);
    }

    public void a() {
    }

    public void a(byte by2) {
        byte[] arrby = this.i;
        arrby[0] = by2;
        this.g.b(arrby, 0, 1);
    }

    public void a(double d3) {
        this.a(Double.doubleToLongBits((double)d3));
    }

    public void a(int n2) {
        byte[] arrby = this.k;
        arrby[0] = (byte)(255 & n2 >> 24);
        arrby[1] = (byte)(255 & n2 >> 16);
        arrby[2] = (byte)(255 & n2 >> 8);
        arrby[3] = (byte)(n2 & 255);
        this.g.b(arrby, 0, 4);
    }

    public void a(long l2) {
        byte[] arrby = this.l;
        arrby[0] = (byte)(255L & l2 >> 56);
        arrby[1] = (byte)(255L & l2 >> 48);
        arrby[2] = (byte)(255L & l2 >> 40);
        arrby[3] = (byte)(255L & l2 >> 32);
        arrby[4] = (byte)(255L & l2 >> 24);
        arrby[5] = (byte)(255L & l2 >> 16);
        arrby[6] = (byte)(255L & l2 >> 8);
        arrby[7] = (byte)(l2 & 255L);
        this.g.b(arrby, 0, 8);
    }

    public void a(bn bn2) {
        this.a(bn2.b);
        this.a(bn2.c);
    }

    public void a(bo bo2) {
        this.a(bo2.a);
        this.a(bo2.b);
    }

    public void a(bp bp2) {
        this.a(bp2.a);
        this.a(bp2.b);
        this.a(bp2.c);
    }

    public void a(bq bq2) {
        if (this.d) {
            this.a(-2147418112 | bq2.b);
            this.a(bq2.a);
            this.a(bq2.c);
            return;
        }
        this.a(bq2.a);
        this.a(bq2.b);
        this.a(bq2.c);
    }

    public void a(bw bw2) {
        this.a(bw2.a);
        this.a(bw2.b);
    }

    public void a(bx bx2) {
    }

    public void a(String string) {
        try {
            byte[] arrby = string.getBytes("UTF-8");
            this.a(arrby.length);
            this.g.b(arrby, 0, arrby.length);
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void a(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.limit() - byteBuffer.position();
        this.a(n2);
        this.g.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), n2);
    }

    public void a(short s2) {
        byte[] arrby = this.j;
        arrby[0] = (byte)(255 & s2 >> 8);
        arrby[1] = (byte)(s2 & 255);
        this.g.b(arrby, 0, 2);
    }

    public void a(boolean bl2) {
        this.a((byte)bl2);
    }

    public String b(int n2) {
        try {
            this.d(n2);
            byte[] arrby = new byte[n2];
            this.g.d(arrby, 0, n2);
            String string = new String(arrby, "UTF-8");
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void b() {
    }

    public void c() {
    }

    public void c(int n2) {
        this.e = n2;
        this.f = true;
    }

    public void d() {
        this.a((byte)0);
    }

    protected void d(int n2) {
        if (n2 >= 0) {
            if (this.f) {
                int n3;
                this.e = n3 = this.e - n2;
                if (n3 >= 0) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Message length exceeded: ");
                stringBuilder.append(n2);
                throw new bt(stringBuilder.toString());
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative length: ");
        stringBuilder.append(n2);
        throw new bt(stringBuilder.toString());
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public bq h() {
        int n2 = this.w();
        if (n2 < 0) {
            if ((-65536 & n2) == -2147418112) {
                return new bq(this.z(), (byte)(n2 & 255), this.w());
            }
            throw new bt(4, "Bad version in readMessageBegin");
        }
        if (!this.c) {
            return new bq(this.b(n2), this.u(), this.w());
        }
        throw new bt(4, "Missing version in readMessageBegin, old client?");
    }

    public void i() {
    }

    public bx j() {
        return h;
    }

    public void k() {
    }

    public bn l() {
        byte by2 = this.u();
        short s2 = by2 == 0 ? (short)0 : this.v();
        return new bn("", by2, s2);
    }

    public void m() {
    }

    public bp n() {
        return new bp(this.u(), this.u(), this.w());
    }

    public void o() {
    }

    public bo p() {
        return new bo(this.u(), this.w());
    }

    public void q() {
    }

    public bw r() {
        return new bw(this.u(), this.w());
    }

    public void s() {
    }

    public boolean t() {
        return this.u() == 1;
    }

    public byte u() {
        if (this.g.h() >= 1) {
            byte by2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return by2;
        }
        this.a(this.m, 0, 1);
        return this.m[0];
    }

    public short v() {
        byte[] arrby = this.n;
        int n2 = this.g.h();
        int n3 = 0;
        if (n2 >= 2) {
            arrby = this.g.f();
            n3 = this.g.g();
            this.g.a(2);
        } else {
            this.a(this.n, 0, 2);
        }
        return (short)((255 & arrby[n3]) << 8 | 255 & arrby[n3 + 1]);
    }

    public int w() {
        byte[] arrby = this.o;
        int n2 = this.g.h();
        int n3 = 0;
        if (n2 >= 4) {
            arrby = this.g.f();
            n3 = this.g.g();
            this.g.a(4);
        } else {
            this.a(this.o, 0, 4);
        }
        return (255 & arrby[n3]) << 24 | (255 & arrby[n3 + 1]) << 16 | (255 & arrby[n3 + 2]) << 8 | 255 & arrby[n3 + 3];
    }

    public long x() {
        byte[] arrby = this.p;
        int n2 = this.g.h();
        int n3 = 0;
        if (n2 >= 8) {
            arrby = this.g.f();
            n3 = this.g.g();
            this.g.a(8);
        } else {
            this.a(this.p, 0, 8);
        }
        return (long)(255 & arrby[n3]) << 56 | (long)(255 & arrby[n3 + 1]) << 48 | (long)(255 & arrby[n3 + 2]) << 40 | (long)(255 & arrby[n3 + 3]) << 32 | (long)(255 & arrby[n3 + 4]) << 24 | (long)(255 & arrby[n3 + 5]) << 16 | (long)(255 & arrby[n3 + 6]) << 8 | (long)(255 & arrby[n3 + 7]);
    }

    public double y() {
        return Double.longBitsToDouble((long)this.x());
    }

    public String z() {
        int n2 = this.w();
        if (this.g.h() >= n2) {
            try {
                String string = new String(this.g.f(), this.g.g(), n2, "UTF-8");
                this.g.a(n2);
                return string;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw new az("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return this.b(n2);
    }

    public static class a
    implements bu {
        protected boolean a = false;
        protected boolean b = true;
        protected int c;

        public a() {
            this(false, true);
        }

        public a(boolean bl2, boolean bl3) {
            this(bl2, bl3, 0);
        }

        public a(boolean bl2, boolean bl3, int n2) {
            this.a = bl2;
            this.b = bl3;
            this.c = n2;
        }

        public bs a(cg cg2) {
            bl bl2 = new bl(cg2, this.a, this.b);
            int n2 = this.c;
            if (n2 != 0) {
                bl2.c(n2);
            }
            return bl2;
        }
    }

}


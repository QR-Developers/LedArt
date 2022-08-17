/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.ar
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
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 */
package com.umeng.analytics.pro;

import com.umeng.analytics.pro.ar;
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

public class bm
extends bs {
    private static final bx d = new bx("");
    private static final bn e = new bn("", 0, 0);
    private static final byte[] f;
    private static final byte h = -126;
    private static final byte i = 1;
    private static final byte j = 31;
    private static final byte k = -32;
    private static final int l = 5;
    byte[] a = new byte[5];
    byte[] b = new byte[10];
    byte[] c = new byte[1];
    private ar m = new ar(15);
    private short n = 0;
    private bn o = null;
    private Boolean p = null;
    private final long q;
    private byte[] r = new byte[1];

    static {
        byte[] arrby = new byte[16];
        f = arrby;
        arrby[0] = 0;
        arrby[2] = 1;
        arrby[3] = 3;
        arrby[6] = 4;
        arrby[8] = 5;
        arrby[10] = 6;
        arrby[4] = 7;
        arrby[11] = 8;
        arrby[15] = 9;
        arrby[14] = 10;
        arrby[13] = 11;
        arrby[12] = 12;
    }

    public bm(cg cg2) {
        this(cg2, -1L);
    }

    public bm(cg cg2, long l2) {
        super(cg2);
        this.q = l2;
    }

    private int E() {
        int n2 = this.g.h();
        int n3 = 0;
        if (n2 >= 5) {
            byte[] arrby = this.g.f();
            int n4 = this.g.g();
            int n5 = 0;
            int n6 = 0;
            do {
                byte by2 = arrby[n4 + n3];
                n5 |= (by2 & 127) << n6;
                if ((by2 & 128) != 128) {
                    this.g.a(n3 + 1);
                    return n5;
                }
                n6 += 7;
                ++n3;
            } while (true);
        }
        int n7 = 0;
        do {
            byte by3 = this.u();
            n3 |= (by3 & 127) << n7;
            if ((by3 & 128) != 128) {
                return n3;
            }
            n7 += 7;
        } while (true);
    }

    private long F() {
        int n2 = this.g.h();
        long l2 = 0L;
        int n3 = 0;
        if (n2 >= 10) {
            byte[] arrby = this.g.f();
            int n4 = this.g.g();
            long l3 = l2;
            int n5 = 0;
            do {
                byte by2 = arrby[n4 + n3];
                l3 |= (long)(by2 & 127) << n5;
                if ((by2 & 128) != 128) {
                    this.g.a(n3 + 1);
                    return l3;
                }
                n5 += 7;
                ++n3;
            } while (true);
        }
        do {
            byte by3 = this.u();
            l2 |= (long)(by3 & 127) << n3;
            if ((by3 & 128) != 128) {
                return l2;
            }
            n3 += 7;
        } while (true);
    }

    private long a(byte[] arrby) {
        return (255L & (long)arrby[7]) << 56 | (255L & (long)arrby[6]) << 48 | (255L & (long)arrby[5]) << 40 | (255L & (long)arrby[4]) << 32 | (255L & (long)arrby[3]) << 24 | (255L & (long)arrby[2]) << 16 | (255L & (long)arrby[1]) << 8 | 255L & (long)arrby[0];
    }

    private void a(long l2, byte[] arrby, int n2) {
        arrby[n2 + 0] = (byte)(l2 & 255L);
        arrby[n2 + 1] = (byte)(255L & l2 >> 8);
        arrby[n2 + 2] = (byte)(255L & l2 >> 16);
        arrby[n2 + 3] = (byte)(255L & l2 >> 24);
        arrby[n2 + 4] = (byte)(255L & l2 >> 32);
        arrby[n2 + 5] = (byte)(255L & l2 >> 40);
        arrby[n2 + 6] = (byte)(255L & l2 >> 48);
        arrby[n2 + 7] = (byte)(255L & l2 >> 56);
    }

    private void a(bn bn2, byte by2) {
        short s2;
        short s3;
        if (by2 == -1) {
            by2 = this.e(bn2.b);
        }
        if ((s3 = bn2.c) > (s2 = this.n) && s3 - s2 <= 15) {
            this.d(by2 | s3 - s2 << 4);
        } else {
            this.b(by2);
            this.a(bn2.c);
        }
        this.n = bn2.c;
    }

    private void a(byte[] arrby, int n2, int n3) {
        this.b(n3);
        this.g.b(arrby, n2, n3);
    }

    private void b(byte by2) {
        byte[] arrby = this.r;
        arrby[0] = by2;
        this.g.b(arrby);
    }

    private void b(int n2) {
        int n3 = 0;
        do {
            if ((n2 & -128) == 0) {
                byte[] arrby = this.a;
                int n4 = n3 + 1;
                arrby[n3] = (byte)n2;
                this.g.b(arrby, 0, n4);
                return;
            }
            byte[] arrby = this.a;
            int n5 = n3 + 1;
            arrby[n3] = (byte)(128 | n2 & 127);
            n2 >>>= 7;
            n3 = n5;
        } while (true);
    }

    private void b(long l2) {
        int n2 = 0;
        do {
            if ((-128L & l2) == 0L) {
                byte[] arrby = this.b;
                int n3 = n2 + 1;
                arrby[n2] = (byte)l2;
                this.g.b(arrby, 0, n3);
                return;
            }
            byte[] arrby = this.b;
            int n4 = n2 + 1;
            arrby[n2] = (byte)(128L | 127L & l2);
            l2 >>>= 7;
            n2 = n4;
        } while (true);
    }

    private int c(int n2) {
        return n2 << 1 ^ n2 >> 31;
    }

    private long c(long l2) {
        return l2 << 1 ^ l2 >> 63;
    }

    private boolean c(byte by2) {
        int n2 = by2 & 15;
        int n3 = 1;
        if (n2 != n3) {
            if (n2 == 2) {
                return (boolean)n3;
            }
            n3 = 0;
        }
        return (boolean)n3;
    }

    private byte d(byte by2) {
        byte by3 = (byte)(by2 & 15);
        switch (by3) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("don't know what type: ");
                stringBuilder.append((int)by3);
                throw new bt(stringBuilder.toString());
            }
            case 12: {
                return 12;
            }
            case 11: {
                return 13;
            }
            case 10: {
                return 14;
            }
            case 9: {
                return 15;
            }
            case 8: {
                return 11;
            }
            case 7: {
                return 4;
            }
            case 6: {
                return 10;
            }
            case 5: {
                return 8;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 3;
            }
            case 1: 
            case 2: {
                return 2;
            }
            case 0: 
        }
        return 0;
    }

    private long d(long l2) {
        return l2 >>> 1 ^ -(l2 & 1L);
    }

    private void d(int n2) {
        this.b((byte)n2);
    }

    private byte e(byte by2) {
        return f[by2];
    }

    private byte[] e(int n2) {
        if (n2 == 0) {
            return new byte[0];
        }
        byte[] arrby = new byte[n2];
        this.g.d(arrby, 0, n2);
        return arrby;
    }

    private void f(int n2) {
        if (n2 >= 0) {
            long l2 = this.q;
            if (l2 != -1L) {
                if ((long)n2 <= l2) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Length exceeded max allowed: ");
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

    private int g(int n2) {
        return n2 >>> 1 ^ -(n2 & 1);
    }

    public ByteBuffer A() {
        int n2 = this.E();
        this.f(n2);
        if (n2 == 0) {
            return ByteBuffer.wrap((byte[])new byte[0]);
        }
        byte[] arrby = new byte[n2];
        this.g.d(arrby, 0, n2);
        return ByteBuffer.wrap((byte[])arrby);
    }

    public void B() {
        this.m.c();
        this.n = 0;
    }

    public void a() {
    }

    public void a(byte by2) {
        this.b(by2);
    }

    protected void a(byte by2, int n2) {
        if (n2 <= 14) {
            this.d(n2 << 4 | this.e(by2));
            return;
        }
        this.d(240 | this.e(by2));
        this.b(n2);
    }

    public void a(double d3) {
        byte[] arrby = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};
        this.a(Double.doubleToLongBits((double)d3), arrby, 0);
        this.g.b(arrby);
    }

    public void a(int n2) {
        this.b(this.c(n2));
    }

    public void a(long l2) {
        this.b(this.c(l2));
    }

    public void a(bn bn2) {
        if (bn2.b == 2) {
            this.o = bn2;
            return;
        }
        this.a(bn2, (byte)-1);
    }

    public void a(bo bo2) {
        this.a(bo2.a, bo2.b);
    }

    public void a(bp bp2) {
        int n2 = bp2.c;
        if (n2 == 0) {
            this.d(0);
            return;
        }
        this.b(n2);
        this.d(this.e(bp2.a) << 4 | this.e(bp2.b));
    }

    public void a(bq bq2) {
        this.b((byte)-126);
        this.d(1 | -32 & bq2.b << 5);
        this.b(bq2.c);
        this.a(bq2.a);
    }

    public void a(bw bw2) {
        this.a(bw2.a, bw2.b);
    }

    public void a(bx bx2) {
        this.m.a(this.n);
        this.n = 0;
    }

    public void a(String string) {
        try {
            byte[] arrby = string.getBytes("UTF-8");
            this.a(arrby, 0, arrby.length);
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new az("UTF-8 not supported!");
        }
    }

    public void a(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.limit() - byteBuffer.position();
        this.a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), n2);
    }

    public void a(short s2) {
        this.b(this.c(s2));
    }

    public void a(boolean bl2) {
        bn bn2 = this.o;
        byte by2 = 1;
        if (bn2 != null) {
            if (!bl2) {
                by2 = 2;
            }
            this.a(bn2, by2);
            this.o = null;
            return;
        }
        if (!bl2) {
            by2 = 2;
        }
        this.b(by2);
    }

    public void b() {
        this.n = this.m.a();
    }

    public void c() {
    }

    public void d() {
        this.b((byte)0);
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public bq h() {
        byte by2 = this.u();
        if (by2 == -126) {
            byte by3 = this.u();
            byte by4 = (byte)(by3 & 31);
            if (by4 == 1) {
                byte by5 = (byte)(3 & by3 >> 5);
                int n2 = this.E();
                return new bq(this.z(), by5, n2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected version 1 but got ");
            stringBuilder.append((int)by4);
            throw new bt(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected protocol id ");
        stringBuilder.append(Integer.toHexString((int)-126));
        stringBuilder.append(" but got ");
        stringBuilder.append(Integer.toHexString((int)by2));
        throw new bt(stringBuilder.toString());
    }

    public void i() {
    }

    public bx j() {
        this.m.a(this.n);
        this.n = 0;
        return d;
    }

    public void k() {
        this.n = this.m.a();
    }

    public bn l() {
        byte by2 = this.u();
        if (by2 == 0) {
            return e;
        }
        short s2 = (short)((by2 & 240) >> 4);
        short s3 = s2 == 0 ? this.v() : (short)(s2 + this.n);
        byte by3 = (byte)(by2 & 15);
        bn bn2 = new bn("", this.d(by3), s3);
        if (this.c(by2)) {
            Boolean bl2 = by3 == 1 ? Boolean.TRUE : Boolean.FALSE;
            this.p = bl2;
        }
        this.n = bn2.c;
        return bn2;
    }

    public void m() {
    }

    public bp n() {
        int n2 = this.E();
        byte by2 = n2 == 0 ? (byte)0 : this.u();
        return new bp(this.d((byte)(by2 >> 4)), this.d((byte)(by2 & 15)), n2);
    }

    public void o() {
    }

    public bo p() {
        byte by2 = this.u();
        int n2 = 15 & by2 >> 4;
        if (n2 == 15) {
            n2 = this.E();
        }
        return new bo(this.d(by2), n2);
    }

    public void q() {
    }

    public bw r() {
        return new bw(this.p());
    }

    public void s() {
    }

    public boolean t() {
        Boolean bl2 = this.p;
        if (bl2 != null) {
            boolean bl3 = bl2;
            this.p = null;
            return bl3;
        }
        return this.u() == 1;
    }

    public byte u() {
        if (this.g.h() > 0) {
            byte by2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return by2;
        }
        this.g.d(this.c, 0, 1);
        return this.c[0];
    }

    public short v() {
        return (short)this.g(this.E());
    }

    public int w() {
        return this.g(this.E());
    }

    public long x() {
        return this.d(this.F());
    }

    public double y() {
        byte[] arrby = new byte[8];
        this.g.d(arrby, 0, 8);
        return Double.longBitsToDouble((long)this.a(arrby));
    }

    public String z() {
        int n2;
        block5 : {
            n2 = this.E();
            this.f(n2);
            if (n2 == 0) {
                return "";
            }
            try {
                int n3 = this.g.h();
                if (n3 < n2) break block5;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw new az("UTF-8 not supported!");
            }
            String string = new String(this.g.f(), this.g.g(), n2, "UTF-8");
            this.g.a(n2);
            return string;
        }
        String string = new String(this.e(n2), "UTF-8");
        return string;
    }

    public static class a
    implements bu {
        private final long a;

        public a() {
            this.a = -1L;
        }

        public a(int n2) {
            this.a = n2;
        }

        public bs a(cg cg2) {
            return new bm(cg2, this.a);
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  k7.d
 *  u7.g
 *  u7.j
 */
package l8;

import k7.d;
import l8.u;
import u7.g;
import u7.j;

public final class t {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public t f;
    public t g;

    static {
        new a(null);
    }

    public t() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public t(byte[] arrby, int n5, int n6, boolean bl, boolean bl2) {
        j.f((Object)arrby, (String)"data");
        this.a = arrby;
        this.b = n5;
        this.c = n6;
        this.d = bl;
        this.e = bl2;
    }

    public final void a() {
        t t2 = this.g;
        boolean bl = t2 != this;
        if (bl) {
            int n5;
            if (t2 == null) {
                j.m();
            }
            if (!t2.e) {
                return;
            }
            int n6 = this.c - this.b;
            t t5 = this.g;
            if (t5 == null) {
                j.m();
            }
            int n7 = 8192 - t5.c;
            t t6 = this.g;
            if (t6 == null) {
                j.m();
            }
            if (t6.d) {
                n5 = 0;
            } else {
                t t7 = this.g;
                if (t7 == null) {
                    j.m();
                }
                n5 = t7.b;
            }
            if (n6 > n7 + n5) {
                return;
            }
            t t8 = this.g;
            if (t8 == null) {
                j.m();
            }
            this.f(t8, n6);
            this.b();
            u.c.a(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final t b() {
        t t2 = this.f;
        if (t2 == this) {
            t2 = null;
        }
        t t5 = this.g;
        if (t5 == null) {
            j.m();
        }
        t5.f = this.f;
        t t6 = this.f;
        if (t6 == null) {
            j.m();
        }
        t6.g = this.g;
        this.f = null;
        this.g = null;
        return t2;
    }

    public final t c(t t2) {
        j.f((Object)t2, (String)"segment");
        t2.g = this;
        t2.f = this.f;
        t t5 = this.f;
        if (t5 == null) {
            j.m();
        }
        t5.g = t2;
        this.f = t2;
        return t2;
    }

    public final t d() {
        this.d = true;
        t t2 = new t(this.a, this.b, this.c, true, false);
        return t2;
    }

    public final t e(int n5) {
        boolean bl = n5 > 0 && n5 <= this.c - this.b;
        if (bl) {
            t t2;
            if (n5 >= 1024) {
                t2 = this.d();
            } else {
                t2 = u.c.b();
                byte[] arrby = this.a;
                byte[] arrby2 = t2.a;
                int n6 = this.b;
                d.d((byte[])arrby, (byte[])arrby2, (int)0, (int)n6, (int)(n6 + n5), (int)2, null);
            }
            t2.c = n5 + t2.b;
            this.b = n5 + this.b;
            t t5 = this.g;
            if (t5 == null) {
                j.m();
            }
            t5.c(t2);
            return t2;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void f(t t2, int n5) {
        j.f((Object)t2, (String)"sink");
        if (!t2.e) throw new IllegalStateException("only owner can write".toString());
        int n6 = t2.c;
        if (n6 + n5 > 8192) {
            if (t2.d) throw new IllegalArgumentException();
            int n7 = n6 + n5;
            int n8 = t2.b;
            if (n7 - n8 > 8192) throw new IllegalArgumentException();
            byte[] arrby = t2.a;
            d.d((byte[])arrby, (byte[])arrby, (int)0, (int)n8, (int)n6, (int)2, null);
            t2.c -= t2.b;
            t2.b = 0;
        }
        byte[] arrby = this.a;
        byte[] arrby2 = t2.a;
        int n9 = t2.c;
        int n10 = this.b;
        d.c((byte[])arrby, (byte[])arrby2, (int)n9, (int)n10, (int)(n10 + n5));
        t2.c = n5 + t2.c;
        this.b = n5 + this.b;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g4) {
            this();
        }
    }

}


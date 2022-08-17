/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a5.e$a
 *  com.google.gson.g
 *  com.google.gson.j
 *  com.google.gson.l
 *  com.google.gson.m
 *  com.google.gson.o
 *  e5.a
 *  e5.b
 *  java.io.Reader
 *  java.lang.AssertionError
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package a5;

import a5.e;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import e5.b;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
extends e5.a {
    private static final Reader u = new a();
    private static final Object v = new Object();
    private Object[] q = new Object[32];
    private int r = 0;
    private String[] s = new String[32];
    private int[] t = new int[32];

    public e(j j2) {
        super(u);
        this.q0((Object)j2);
    }

    private String P() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(this.L());
        return stringBuilder.toString();
    }

    private void m0(b b2) {
        if (this.a0() == b2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append((Object)b2);
        stringBuilder.append(" but was ");
        stringBuilder.append((Object)this.a0());
        stringBuilder.append(this.P());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private Object n0() {
        return this.q[-1 + this.r];
    }

    private Object o0() {
        int n2;
        Object[] arrobject = this.q;
        this.r = n2 = -1 + this.r;
        Object object = arrobject[n2];
        arrobject[n2] = null;
        return object;
    }

    private void q0(Object object) {
        int n2 = this.r;
        Object[] arrobject = this.q;
        if (n2 == arrobject.length) {
            int n3 = n2 * 2;
            this.q = Arrays.copyOf((Object[])arrobject, (int)n3);
            this.t = Arrays.copyOf((int[])this.t, (int)n3);
            this.s = (String[])Arrays.copyOf((Object[])this.s, (int)n3);
        }
        Object[] arrobject2 = this.q;
        int n4 = this.r;
        this.r = n4 + 1;
        arrobject2[n4] = object;
    }

    public void D() {
        this.m0(b.a);
        this.q0((Object)((g)this.n0()).iterator());
        this.t[-1 + this.r] = 0;
    }

    public void E() {
        this.m0(b.c);
        this.q0((Object)((m)this.n0()).i().iterator());
    }

    public void I() {
        this.m0(b.b);
        this.o0();
        this.o0();
        int n2 = this.r;
        if (n2 > 0) {
            int[] arrn = this.t;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    public void J() {
        this.m0(b.d);
        this.o0();
        this.o0();
        int n2 = this.r;
        if (n2 > 0) {
            int[] arrn = this.t;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    public String L() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        for (int i2 = 0; i2 < this.r; ++i2) {
            Object[] arrobject = this.q;
            if (arrobject[i2] instanceof g) {
                if (!(arrobject[++i2] instanceof Iterator)) continue;
                stringBuilder.append('[');
                stringBuilder.append(this.t[i2]);
                stringBuilder.append(']');
                continue;
            }
            if (!(arrobject[i2] instanceof m) || !(arrobject[++i2] instanceof Iterator)) continue;
            stringBuilder.append('.');
            String[] arrstring = this.s;
            if (arrstring[i2] == null) continue;
            stringBuilder.append(arrstring[i2]);
        }
        return stringBuilder.toString();
    }

    public boolean M() {
        b b2 = this.a0();
        return b2 != b.d && b2 != b.b;
    }

    public boolean Q() {
        this.m0(b.h);
        boolean bl = ((o)this.o0()).h();
        int n2 = this.r;
        if (n2 > 0) {
            int[] arrn = this.t;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return bl;
    }

    public double R() {
        b b2;
        b b3 = this.a0();
        if (b3 != (b2 = b.g) && b3 != b.f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b3);
            stringBuilder.append(this.P());
            throw new IllegalStateException(stringBuilder.toString());
        }
        double d2 = ((o)this.n0()).i();
        if (!this.N() && (Double.isNaN((double)d2) || Double.isInfinite((double)d2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d2);
            throw new NumberFormatException(stringBuilder.toString());
        }
        this.o0();
        int n2 = this.r;
        if (n2 > 0) {
            int[] arrn = this.t;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return d2;
    }

    public int S() {
        b b2;
        b b3 = this.a0();
        if (b3 != (b2 = b.g) && b3 != b.f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b3);
            stringBuilder.append(this.P());
            throw new IllegalStateException(stringBuilder.toString());
        }
        int n2 = ((o)this.n0()).j();
        this.o0();
        int n3 = this.r;
        if (n3 > 0) {
            int[] arrn = this.t;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
        }
        return n2;
    }

    public long T() {
        b b2;
        b b3 = this.a0();
        if (b3 != (b2 = b.g) && b3 != b.f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b3);
            stringBuilder.append(this.P());
            throw new IllegalStateException(stringBuilder.toString());
        }
        long l2 = ((o)this.n0()).k();
        this.o0();
        int n2 = this.r;
        if (n2 > 0) {
            int[] arrn = this.t;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return l2;
    }

    public String U() {
        String string;
        this.m0(b.e);
        Map.Entry entry = (Map.Entry)((Iterator)this.n0()).next();
        this.s[-1 + this.r] = string = (String)entry.getKey();
        this.q0(entry.getValue());
        return string;
    }

    public void W() {
        this.m0(b.i);
        this.o0();
        int n2 = this.r;
        if (n2 > 0) {
            int[] arrn = this.t;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    public String Y() {
        b b2;
        b b3 = this.a0();
        if (b3 != (b2 = b.f) && b3 != b.g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append((Object)b2);
            stringBuilder.append(" but was ");
            stringBuilder.append((Object)b3);
            stringBuilder.append(this.P());
            throw new IllegalStateException(stringBuilder.toString());
        }
        String string = ((o)this.o0()).m();
        int n2 = this.r;
        if (n2 > 0) {
            int[] arrn = this.t;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return string;
    }

    public b a0() {
        if (this.r == 0) {
            return b.j;
        }
        Object object = this.n0();
        if (object instanceof Iterator) {
            boolean bl = this.q[-2 + this.r] instanceof m;
            Iterator iterator = (Iterator)object;
            if (iterator.hasNext()) {
                if (bl) {
                    return b.e;
                }
                this.q0(iterator.next());
                return this.a0();
            }
            if (bl) {
                return b.d;
            }
            return b.b;
        }
        if (object instanceof m) {
            return b.c;
        }
        if (object instanceof g) {
            return b.a;
        }
        if (object instanceof o) {
            o o2 = (o)object;
            if (o2.q()) {
                return b.f;
            }
            if (o2.n()) {
                return b.h;
            }
            if (o2.p()) {
                return b.g;
            }
            throw new AssertionError();
        }
        if (object instanceof l) {
            return b.i;
        }
        if (object == v) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    public void close() {
        Object[] arrobject = new Object[]{v};
        this.q = arrobject;
        this.r = 1;
    }

    public void k0() {
        if (this.a0() == b.e) {
            this.U();
            this.s[-2 + this.r] = "null";
        } else {
            this.o0();
            int n2 = this.r;
            if (n2 > 0) {
                this.s[n2 - 1] = "null";
            }
        }
        int n3 = this.r;
        if (n3 > 0) {
            int[] arrn = this.t;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
        }
    }

    public void p0() {
        this.m0(b.e);
        Map.Entry entry = (Map.Entry)((Iterator)this.n0()).next();
        this.q0(entry.getValue());
        this.q0((Object)new o((String)entry.getKey()));
    }

    public String toString() {
        return e.class.getSimpleName();
    }
}


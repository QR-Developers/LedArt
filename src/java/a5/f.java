/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a5.f$a
 *  com.google.gson.g
 *  com.google.gson.j
 *  com.google.gson.l
 *  com.google.gson.m
 *  com.google.gson.o
 *  e5.c
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package a5;

import a5.f;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import e5.c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f
extends c {
    private static final Writer o = new a();
    private static final o p = new o("closed");
    private final List<j> l = new ArrayList();
    private String m;
    private j n = l.a;

    public f() {
        super(o);
    }

    private j g0() {
        List<j> list = this.l;
        return (j)list.get(-1 + list.size());
    }

    private void h0(j j2) {
        if (this.m != null) {
            if (!j2.e() || this.K()) {
                ((m)this.g0()).h(this.m, j2);
            }
            this.m = null;
            return;
        }
        if (this.l.isEmpty()) {
            this.n = j2;
            return;
        }
        j j3 = this.g0();
        if (j3 instanceof g) {
            ((g)j3).h(j2);
            return;
        }
        throw new IllegalStateException();
    }

    public c F() {
        g g2 = new g();
        this.h0((j)g2);
        this.l.add((Object)g2);
        return this;
    }

    public c G() {
        m m2 = new m();
        this.h0((j)m2);
        this.l.add((Object)m2);
        return this;
    }

    public c I() {
        if (!this.l.isEmpty() && this.m == null) {
            if (this.g0() instanceof g) {
                List<j> list = this.l;
                list.remove(-1 + list.size());
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public c J() {
        if (!this.l.isEmpty() && this.m == null) {
            if (this.g0() instanceof m) {
                List<j> list = this.l;
                list.remove(-1 + list.size());
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public c N(String string) {
        if (!this.l.isEmpty() && this.m == null) {
            if (this.g0() instanceof m) {
                this.m = string;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public c P() {
        this.h0((j)l.a);
        return this;
    }

    public c Z(long l2) {
        this.h0((j)new o((Number)l2));
        return this;
    }

    public c a0(Boolean bl) {
        if (bl == null) {
            return this.P();
        }
        this.h0((j)new o(bl));
        return this;
    }

    public c b0(Number number) {
        double d2;
        if (number == null) {
            return this.P();
        }
        if (!this.M() && (Double.isNaN((double)(d2 = number.doubleValue())) || Double.isInfinite((double)d2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append((Object)number);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.h0((j)new o(number));
        return this;
    }

    public c c0(String string) {
        if (string == null) {
            return this.P();
        }
        this.h0((j)new o(string));
        return this;
    }

    public void close() {
        if (this.l.isEmpty()) {
            this.l.add((Object)p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d0(boolean bl) {
        this.h0((j)new o(Boolean.valueOf((boolean)bl)));
        return this;
    }

    public j f0() {
        if (this.l.isEmpty()) {
            return this.n;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected one JSON element but was ");
        stringBuilder.append(this.l);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void flush() {
    }
}


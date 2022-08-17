/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a5.l$a
 *  com.google.gson.e
 *  com.google.gson.h
 *  com.google.gson.i
 *  com.google.gson.j
 *  com.google.gson.p
 *  com.google.gson.q
 *  com.google.gson.t
 *  com.google.gson.u
 *  d5.a
 *  e5.a
 *  e5.c
 *  java.lang.Object
 *  java.lang.reflect.Type
 *  z4.l
 */
package a5;

import a5.l;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.t;
import com.google.gson.u;
import e5.c;
import java.lang.reflect.Type;

public final class l<T>
extends t<T> {
    private final q<T> a;
    private final i<T> b;
    final e c;
    private final d5.a<T> d;
    private final u e;
    private final l<T> f = new b(this);
    private t<T> g;

    public l(q<T> q2, i<T> i2, e e2, d5.a<T> a2, u u2) {
        this.a = q2;
        this.b = i2;
        this.c = e2;
        this.d = a2;
        this.e = u2;
    }

    private t<T> e() {
        t t2;
        t<T> t3 = this.g;
        if (t3 != null) {
            return t3;
        }
        this.g = t2 = this.c.o(this.e, this.d);
        return t2;
    }

    public T b(e5.a a2) {
        if (this.b == null) {
            return (T)this.e().b(a2);
        }
        j j2 = z4.l.a((e5.a)a2);
        if (j2.e()) {
            return null;
        }
        return (T)this.b.a(j2, this.d.e(), this.f);
    }

    public void d(c c2, T t2) {
        q<T> q2 = this.a;
        if (q2 == null) {
            this.e().d(c2, t2);
            return;
        }
        if (t2 == null) {
            c2.P();
            return;
        }
        z4.l.b((j)q2.a(t2, this.d.e(), this.f), (c)c2);
    }

    private final class b
    implements p,
    h {
        private b(l l2) {
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a5.h$b
 *  com.google.gson.e
 *  com.google.gson.t
 *  com.google.gson.u
 *  d5.a
 *  e5.a
 *  e5.b
 *  e5.c
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  z4.h
 */
package a5;

import a5.h;
import com.google.gson.e;
import com.google.gson.t;
import com.google.gson.u;
import e5.c;
import java.util.ArrayList;

public final class h
extends t<Object> {
    public static final u b = new u(){

        public <T> t<T> a(e e2, d5.a<T> a2) {
            if (a2.c() == Object.class) {
                return new h(e2);
            }
            return null;
        }
    };
    private final e a;

    h(e e2) {
        this.a = e2;
    }

    public Object b(e5.a a2) {
        e5.b b2 = a2.a0();
        switch (b.a[b2.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 6: {
                a2.W();
                return null;
            }
            case 5: {
                return a2.Q();
            }
            case 4: {
                return a2.R();
            }
            case 3: {
                return a2.Y();
            }
            case 2: {
                z4.h h2 = new z4.h();
                a2.E();
                while (a2.M()) {
                    h2.put((Object)a2.U(), this.b(a2));
                }
                a2.J();
                return h2;
            }
            case 1: 
        }
        ArrayList arrayList = new ArrayList();
        a2.D();
        while (a2.M()) {
            arrayList.add(this.b(a2));
        }
        a2.I();
        return arrayList;
    }

    public void d(c c2, Object object) {
        if (object == null) {
            c2.P();
            return;
        }
        t t2 = this.a.n(object.getClass());
        if (t2 instanceof h) {
            c2.G();
            c2.J();
            return;
        }
        t2.d(c2, object);
    }

}


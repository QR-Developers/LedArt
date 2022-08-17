/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.gson.e
 *  com.google.gson.t
 *  com.google.gson.u
 *  d5.a
 *  e5.a
 *  e5.b
 *  e5.c
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Type
 *  java.util.Collection
 *  z4.b
 *  z4.c
 *  z4.i
 */
package a5;

import a5.m;
import com.google.gson.e;
import com.google.gson.t;
import com.google.gson.u;
import e5.c;
import java.lang.reflect.Type;
import java.util.Collection;
import z4.i;

public final class b
implements u {
    private final z4.c a;

    public b(z4.c c2) {
        this.a = c2;
    }

    public <T> t<T> a(e e2, d5.a<T> a2) {
        Type type = a2.e();
        Class class_ = a2.c();
        if (!Collection.class.isAssignableFrom(class_)) {
            return null;
        }
        Type type2 = z4.b.h((Type)type, (Class)class_);
        return new a(e2, type2, e2.m(d5.a.b((Type)type2)), this.a.a(a2));
    }

    private static final class a<E>
    extends t<Collection<E>> {
        private final t<E> a;
        private final i<? extends Collection<E>> b;

        public a(e e2, Type type, t<E> t2, i<? extends Collection<E>> i2) {
            this.a = new m<E>(e2, t2, type);
            this.b = i2;
        }

        public Collection<E> e(e5.a a2) {
            if (a2.a0() == e5.b.i) {
                a2.W();
                return null;
            }
            Collection collection = (Collection)this.b.a();
            a2.D();
            while (a2.M()) {
                collection.add(this.a.b(a2));
            }
            a2.I();
            return collection;
        }

        public void f(c c2, Collection<E> collection) {
            if (collection == null) {
                c2.P();
                return;
            }
            c2.F();
            for (Object object : collection) {
                this.a.d(c2, object);
            }
            c2.I();
        }
    }

}


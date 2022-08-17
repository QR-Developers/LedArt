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
 *  java.lang.reflect.Array
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  z4.b
 */
package a5;

import a5.m;
import com.google.gson.e;
import com.google.gson.t;
import com.google.gson.u;
import e5.b;
import e5.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E>
extends t<Object> {
    public static final u c = new u(){

        public <T> t<T> a(e e2, d5.a<T> a2) {
            Type type = a2.e();
            if (!(type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray())) {
                return null;
            }
            Type type2 = z4.b.g((Type)type);
            return new a(e2, e2.m(d5.a.b((Type)type2)), z4.b.k((Type)type2));
        }
    };
    private final Class<E> a;
    private final t<E> b;

    public a(e e2, t<E> t2, Class<E> class_) {
        this.b = new m<E>(e2, t2, (Type)class_);
        this.a = class_;
    }

    public Object b(e5.a a2) {
        if (a2.a0() == b.i) {
            a2.W();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a2.D();
        while (a2.M()) {
            arrayList.add(this.b.b(a2));
        }
        a2.I();
        int n2 = arrayList.size();
        Object object = Array.newInstance(this.a, (int)n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Array.set((Object)object, (int)i2, (Object)arrayList.get(i2));
        }
        return object;
    }

    public void d(c c2, Object object) {
        if (object == null) {
            c2.P();
            return;
        }
        c2.F();
        int n2 = Array.getLength((Object)object);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = Array.get((Object)object, (int)i2);
            this.b.d(c2, object2);
        }
        c2.I();
    }

}


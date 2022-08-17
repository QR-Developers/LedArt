/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.gson.e
 *  com.google.gson.t
 *  d5.a
 *  e5.a
 *  e5.c
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 */
package a5;

import a5.i;
import com.google.gson.e;
import com.google.gson.t;
import e5.a;
import e5.c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class m<T>
extends t<T> {
    private final e a;
    private final t<T> b;
    private final Type c;

    m(e e2, t<T> t2, Type type) {
        this.a = e2;
        this.b = t2;
        this.c = type;
    }

    private Type e(Type type, Object object) {
        if (object != null && (type == Object.class || type instanceof TypeVariable || type instanceof Class)) {
            type = object.getClass();
        }
        return type;
    }

    public T b(a a2) {
        return (T)this.b.b(a2);
    }

    public void d(c c2, T t2) {
        t<T> t3;
        t<T> t4 = this.b;
        Type type = this.e(this.c, t2);
        if (type != this.c && (t4 = this.a.m(d5.a.b((Type)type))) instanceof i.b && !((t3 = this.b) instanceof i.b)) {
            t4 = t3;
        }
        t4.d(c2, t2);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.gson.e
 *  com.google.gson.i
 *  com.google.gson.q
 *  com.google.gson.t
 *  com.google.gson.u
 *  d5.a
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  y4.b
 *  z4.c
 *  z4.i
 */
package a5;

import a5.l;
import com.google.gson.e;
import com.google.gson.i;
import com.google.gson.q;
import com.google.gson.t;
import com.google.gson.u;
import d5.a;
import java.lang.annotation.Annotation;
import y4.b;
import z4.c;

public final class d
implements u {
    private final c a;

    public d(c c2) {
        this.a = c2;
    }

    public <T> t<T> a(e e2, a<T> a2) {
        b b2 = (b)a2.c().getAnnotation(b.class);
        if (b2 == null) {
            return null;
        }
        return this.b(this.a, e2, a2, b2);
    }

    t<?> b(c c2, e e2, a<?> a2, b b2) {
        l l2;
        Object object = c2.a(a.a((Class)b2.value())).a();
        if (object instanceof t) {
            l2 = (l)((Object)object);
        } else if (object instanceof u) {
            l2 = ((u)object).a(e2, a2);
        } else {
            boolean bl = object instanceof q;
            if (!bl && !(object instanceof i)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid attempt to bind an instance of ");
                stringBuilder.append(object.getClass().getName());
                stringBuilder.append(" as a @JsonAdapter for ");
                stringBuilder.append(a2.toString());
                stringBuilder.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            q q2 = bl ? (q)object : null;
            boolean bl2 = object instanceof i;
            i i2 = null;
            if (bl2) {
                i2 = (i)object;
            }
            i i3 = i2;
            l2 = new l(q2, i3, e2, a2, null);
        }
        if (l2 != null && b2.nullSafe()) {
            l2 = l2.a();
        }
        return l2;
    }
}


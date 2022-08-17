/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a5.i$c
 *  c5.b
 *  com.google.gson.d
 *  com.google.gson.e
 *  com.google.gson.r
 *  com.google.gson.t
 *  com.google.gson.u
 *  d5.a
 *  e5.a
 *  e5.b
 *  e5.c
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.AccessibleObject
 *  java.lang.reflect.Field
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  y4.b
 *  y4.c
 *  z4.b
 *  z4.c
 *  z4.d
 *  z4.i
 *  z4.k
 */
package a5;

import a5.d;
import a5.i;
import a5.m;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import z4.k;

public final class i
implements u {
    private final z4.c a;
    private final com.google.gson.d b;
    private final z4.d c;
    private final d d;
    private final c5.b e = c5.b.a();

    public i(z4.c c2, com.google.gson.d d2, z4.d d3, d d4) {
        this.a = c2;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    private c b(final e e2, final Field field, String string, final d5.a<?> a2, boolean bl, boolean bl2) {
        final boolean bl3 = k.a((Type)a2.c());
        y4.b b2 = (y4.b)field.getAnnotation(y4.b.class);
        t t2 = b2 != null ? this.d.b(this.a, e2, a2, b2) : null;
        final boolean bl4 = t2 != null;
        if (t2 == null) {
            t2 = e2.m(a2);
        }
        final t t3 = t2;
        c c2 = new c(this, string, bl, bl2){

            void a(e5.a a22, Object object) {
                Object object2 = t3.b(a22);
                if (object2 != null || !bl3) {
                    field.set(object, object2);
                }
            }

            void b(e5.c c2, Object object) {
                Object object2 = field.get(object);
                m m2 = bl4 ? t3 : new m(e2, t3, a2.e());
                m2.d(c2, object2);
            }

            public boolean c(Object object) {
                if (!this.b) {
                    return false;
                }
                Object object2 = field.get(object);
                boolean bl = false;
                if (object2 != object) {
                    bl = true;
                }
                return bl;
            }
        };
        return c2;
    }

    static boolean d(Field field, boolean bl, z4.d d2) {
        return !d2.c(field.getType(), bl) && !d2.f(field, bl);
    }

    private Map<String, c> e(e e2, d5.a<?> a2, Class<?> class_) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (class_.isInterface()) {
            return linkedHashMap;
        }
        Type type = a2.e();
        d5.a a3 = a2;
        Class class_2 = class_;
        while (class_2 != Object.class) {
            for (Field field : class_2.getDeclaredFields()) {
                boolean bl = this.c(field, true);
                boolean bl2 = this.c(field, false);
                if (!bl && !bl2) continue;
                this.e.b((AccessibleObject)field);
                Type type2 = z4.b.p((Type)a3.e(), (Class)class_2, (Type)field.getGenericType());
                List<String> list = this.f(field);
                int n2 = list.size();
                c c2 = null;
                int n3 = 0;
                while (n3 < n2) {
                    String string = (String)list.get(n3);
                    boolean bl3 = n3 != 0 ? false : bl;
                    d5.a a4 = d5.a.b((Type)type2);
                    int n4 = n3;
                    Field field2 = field;
                    c c3 = c2;
                    int n5 = n2;
                    List<String> list2 = list;
                    boolean bl4 = bl3;
                    Field field3 = field;
                    c c4 = linkedHashMap.put((Object)string, (Object)this.b(e2, field2, string, a4, bl4, bl2));
                    c2 = c3 == null ? c4 : c3;
                    n3 = n4 + 1;
                    bl = bl3;
                    list = list2;
                    n2 = n5;
                    field = field3;
                }
                c c5 = c2;
                if (c5 == null) {
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)type);
                stringBuilder.append(" declares multiple JSON fields named ");
                stringBuilder.append(c5.a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            a3 = d5.a.b((Type)z4.b.p((Type)a3.e(), class_2, (Type)class_2.getGenericSuperclass()));
            class_2 = a3.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        y4.c c2 = (y4.c)field.getAnnotation(y4.c.class);
        if (c2 == null) {
            return Collections.singletonList((Object)this.b.a(field));
        }
        String string = c2.value();
        String[] arrstring = c2.alternate();
        if (arrstring.length == 0) {
            return Collections.singletonList((Object)string);
        }
        ArrayList arrayList = new ArrayList(1 + arrstring.length);
        arrayList.add((Object)string);
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)arrstring[i2]);
        }
        return arrayList;
    }

    public <T> t<T> a(e e2, d5.a<T> a2) {
        Class class_ = a2.c();
        if (!Object.class.isAssignableFrom(class_)) {
            return null;
        }
        return new b(this.a.a(a2), this.e(e2, a2, class_));
    }

    public boolean c(Field field, boolean bl) {
        return i.d(field, bl, this.c);
    }

    public static final class b<T>
    extends t<T> {
        private final z4.i<T> a;
        private final Map<String, c> b;

        b(z4.i<T> i2, Map<String, c> map) {
            this.a = i2;
            this.b = map;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public T b(e5.a a2) {
            if (a2.a0() == e5.b.i) {
                a2.W();
                return null;
            }
            Object object = this.a.a();
            try {
                a2.E();
                while (a2.M()) {
                    String string = a2.U();
                    c c2 = this.b.get((Object)string);
                    if (c2 != null && c2.c) {
                        c2.a(a2, object);
                        continue;
                    }
                    a2.k0();
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
            catch (IllegalStateException illegalStateException) {
                r r2 = new r((Throwable)illegalStateException);
                throw r2;
            }
            a2.J();
            return (T)object;
        }

        public void d(e5.c c2, T t2) {
            if (t2 == null) {
                c2.P();
                return;
            }
            c2.G();
            try {
                for (c c3 : this.b.values()) {
                    if (!c3.c(t2)) continue;
                    c2.N(c3.a);
                    c3.b(c2, t2);
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                AssertionError assertionError = new AssertionError((Object)illegalAccessException);
                throw assertionError;
            }
            c2.J();
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a5.n
 *  com.google.gson.e
 *  com.google.gson.j
 *  com.google.gson.o
 *  com.google.gson.r
 *  com.google.gson.t
 *  com.google.gson.u
 *  d5.a
 *  e5.a
 *  e5.b
 *  e5.c
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  z4.b
 *  z4.c
 *  z4.f
 *  z4.i
 *  z4.l
 */
package a5;

import a5.m;
import a5.n;
import com.google.gson.e;
import com.google.gson.j;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import e5.b;
import e5.c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import z4.f;
import z4.i;
import z4.l;

public final class g
implements u {
    private final z4.c a;
    final boolean b;

    public g(z4.c c2, boolean bl) {
        this.a = c2;
        this.b = bl;
    }

    private t<?> b(e e2, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return e2.m(d5.a.b((Type)type));
        }
        return n.f;
    }

    public <T> t<T> a(e e2, d5.a<T> a2) {
        Type type = a2.e();
        if (!Map.class.isAssignableFrom(a2.c())) {
            return null;
        }
        Type[] arrtype = z4.b.j((Type)type, (Class)z4.b.k((Type)type));
        t<?> t2 = this.b(e2, arrtype[0]);
        t t3 = e2.m(d5.a.b((Type)arrtype[1]));
        i i2 = this.a.a(a2);
        a a3 = new a(e2, arrtype[0], t2, arrtype[1], t3, i2);
        return a3;
    }

    private final class a<K, V>
    extends t<Map<K, V>> {
        private final t<K> a;
        private final t<V> b;
        private final i<? extends Map<K, V>> c;

        public a(e e2, Type type, t<K> t2, Type type2, t<V> t3, i<? extends Map<K, V>> i2) {
            this.a = new m<K>(e2, t2, type);
            this.b = new m<V>(e2, t3, type2);
            this.c = i2;
        }

        private String e(j j2) {
            if (j2.g()) {
                o o2 = j2.c();
                if (o2.p()) {
                    return String.valueOf((Object)o2.l());
                }
                if (o2.n()) {
                    return Boolean.toString((boolean)o2.h());
                }
                if (o2.q()) {
                    return o2.m();
                }
                throw new AssertionError();
            }
            if (j2.e()) {
                return "null";
            }
            throw new AssertionError();
        }

        public Map<K, V> f(e5.a a2) {
            b b2 = a2.a0();
            if (b2 == b.i) {
                a2.W();
                return null;
            }
            Map map = (Map)this.c.a();
            if (b2 == b.a) {
                a2.D();
                while (a2.M()) {
                    a2.D();
                    Object object = this.a.b(a2);
                    if (map.put(object, this.b.b(a2)) == null) {
                        a2.I();
                        continue;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("duplicate key: ");
                    stringBuilder.append(object);
                    throw new r(stringBuilder.toString());
                }
                a2.I();
                return map;
            }
            a2.E();
            while (a2.M()) {
                f.a.a(a2);
                Object object = this.a.b(a2);
                if (map.put(object, this.b.b(a2)) == null) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("duplicate key: ");
                stringBuilder.append(object);
                throw new r(stringBuilder.toString());
            }
            a2.J();
            return map;
        }

        public void g(c c2, Map<K, V> map) {
            if (map == null) {
                c2.P();
                return;
            }
            if (!g.this.b) {
                c2.G();
                for (Map.Entry entry : map.entrySet()) {
                    c2.N(String.valueOf((Object)entry.getKey()));
                    this.b.d(c2, entry.getValue());
                }
                c2.J();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator iterator = map.entrySet().iterator();
            int n2 = 0;
            boolean bl = false;
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                j j2 = this.a.c(entry.getKey());
                arrayList.add((Object)j2);
                arrayList2.add(entry.getValue());
                boolean bl2 = j2.d() || j2.f();
                bl |= bl2;
            }
            if (bl) {
                c2.F();
                int n3 = arrayList.size();
                while (n2 < n3) {
                    c2.F();
                    l.b((j)((j)arrayList.get(n2)), (c)c2);
                    this.b.d(c2, arrayList2.get(n2));
                    c2.I();
                    ++n2;
                }
                c2.I();
                return;
            }
            c2.G();
            int n4 = arrayList.size();
            while (n2 < n4) {
                c2.N(this.e((j)arrayList.get(n2)));
                this.b.d(c2, arrayList2.get(n2));
                ++n2;
            }
            c2.J();
        }
    }

}


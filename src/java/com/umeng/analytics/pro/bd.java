/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.at
 *  com.umeng.analytics.pro.au
 *  com.umeng.analytics.pro.ba
 *  com.umeng.analytics.pro.bd$1
 *  com.umeng.analytics.pro.bd$a
 *  com.umeng.analytics.pro.bd$c
 *  com.umeng.analytics.pro.bn
 *  com.umeng.analytics.pro.bs
 *  com.umeng.analytics.pro.bx
 *  com.umeng.analytics.pro.ca
 *  com.umeng.analytics.pro.cb
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.umeng.analytics.pro;

import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bd;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class bd<T extends bd<?, ?>, F extends ba>
implements at<T, F> {
    private static final Map<Class<? extends ca>, cb> c;
    protected Object a;
    protected F b;

    static {
        HashMap hashMap;
        c = hashMap = new HashMap();
        hashMap.put(cc.class, (Object)new b(null));
        hashMap.put(cd.class, (Object)new d(null));
    }

    protected bd() {
        this.b = null;
        this.a = null;
    }

    protected bd(F f2, Object object) {
        this.a(f2, object);
    }

    protected bd(bd<T, F> bd2) {
        if (bd2.getClass().equals((Object)this.getClass())) {
            this.b = bd2.b;
            this.a = bd.a(bd2.a);
            return;
        }
        throw new ClassCastException();
    }

    private static Object a(Object object) {
        if (object instanceof at) {
            return ((at)object).deepCopy();
        }
        if (object instanceof ByteBuffer) {
            return au.d((ByteBuffer)((ByteBuffer)object));
        }
        if (object instanceof List) {
            return bd.a((List)object);
        }
        if (object instanceof Set) {
            return bd.a((Set)object);
        }
        if (object instanceof Map) {
            object = bd.a((Map<Object, Object>)((Map)object));
        }
        return object;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add(bd.a(iterator.next()));
        }
        return arrayList;
    }

    private static Map a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(bd.a(entry.getKey()), bd.a(entry.getValue()));
        }
        return hashMap;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            hashSet.add(bd.a(iterator.next()));
        }
        return hashSet;
    }

    public F a() {
        return this.b;
    }

    protected abstract F a(short var1);

    public Object a(int n2) {
        return this.a(this.a((short)n2));
    }

    public Object a(F f2) {
        if (f2 == this.b) {
            return this.b();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot get the value of field ");
        stringBuilder.append(f2);
        stringBuilder.append(" because union's set field is ");
        stringBuilder.append(this.b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected abstract Object a(bs var1, bn var2);

    protected abstract Object a(bs var1, short var2);

    public void a(int n2, Object object) {
        this.a(this.a((short)n2), object);
    }

    public void a(F f2, Object object) {
        this.b(f2, object);
        this.b = f2;
        this.a = object;
    }

    protected abstract void a(bs var1);

    public Object b() {
        return this.a;
    }

    protected abstract void b(F var1, Object var2);

    protected abstract void b(bs var1);

    public boolean b(int n2) {
        return this.b(this.a((short)n2));
    }

    public boolean b(F f2) {
        return this.b == f2;
    }

    protected abstract bn c(F var1);

    public boolean c() {
        return this.b != null;
    }

    public final void clear() {
        this.b = null;
        this.a = null;
    }

    protected abstract bx d();

    public void read(bs bs2) {
        ((cb)c.get((Object)bs2.D())).b().b(bs2, (at)this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" ");
        if (this.a() != null) {
            Object object = this.b();
            stringBuilder.append(this.c(this.a()).a);
            stringBuilder.append(":");
            if (object instanceof ByteBuffer) {
                au.a((ByteBuffer)((ByteBuffer)object), (StringBuilder)stringBuilder);
            } else {
                stringBuilder.append(object.toString());
            }
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }

    public void write(bs bs2) {
        ((cb)c.get((Object)bs2.D())).b().a(bs2, (at)this);
    }

    /*
     * Exception performing whole class analysis.
     */
    private static class b
    implements cb {
        private b() {
        }

        /* synthetic */ b(1 var1_1) {
            this();
        }

        public a a() {
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public /* synthetic */ ca b() {
            return this.a();
        }
    }

    /*
     * Exception performing whole class analysis.
     */
    private static class d
    implements cb {
        private d() {
        }

        /* synthetic */ d(1 var1_1) {
            this();
        }

        public c a() {
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public /* synthetic */ ca b() {
            return this.a();
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.at
 *  com.umeng.analytics.pro.az
 *  com.umeng.analytics.pro.ba
 *  com.umeng.analytics.pro.bf
 *  com.umeng.analytics.pro.bg
 *  com.umeng.analytics.pro.bn
 *  com.umeng.analytics.pro.bs
 *  com.umeng.analytics.pro.bx
 *  com.umeng.analytics.pro.ca
 *  com.umeng.analytics.pro.cb
 *  com.umeng.analytics.pro.cg
 *  com.umeng.commonsdk.statistics.proto.c$1
 *  com.umeng.commonsdk.statistics.proto.c$a
 *  com.umeng.commonsdk.statistics.proto.c$c
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Cloneable
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.EnumMap
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bh;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bt;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cg;
import com.umeng.commonsdk.statistics.proto.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c
implements at<c, e>,
Serializable,
Cloneable {
    public static final Map<e, bf> d;
    private static final long e = -5764118265293965743L;
    private static final bx f;
    private static final bn g;
    private static final bn h;
    private static final bn i;
    private static final Map<Class<? extends ca>, cb> j;
    public Map<String, com.umeng.commonsdk.statistics.proto.b> a;
    public List<com.umeng.commonsdk.statistics.proto.a> b;
    public String c;
    private e[] k;

    static {
        Map map;
        HashMap hashMap;
        f = new bx("IdTracking");
        g = new bn("snapshots", 13, 1);
        h = new bn("journals", 15, 2);
        i = new bn("checksum", 11, 3);
        j = hashMap = new HashMap();
        hashMap.put(cc.class, (Object)new b(null));
        hashMap.put(cd.class, (Object)new d(null));
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((Object)e.a, (Object)new bf("snapshots", 1, (bg)new bi(13, new bg(11), new bk(12, com.umeng.commonsdk.statistics.proto.b.class))));
        enumMap.put((Object)e.b, (Object)new bf("journals", 2, (bg)new bh(15, new bk(12, com.umeng.commonsdk.statistics.proto.a.class))));
        enumMap.put((Object)e.c, (Object)new bf("checksum", 2, new bg(11)));
        d = map = Collections.unmodifiableMap((Map)enumMap);
        bf.a(c.class, (Map)map);
    }

    public c() {
        e[] arre = new e[]{e.b, e.c};
        this.k = arre;
    }

    public c(c c3) {
        e[] arre = new e[]{e.b, e.c};
        this.k = arre;
        if (c3.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : c3.a.entrySet()) {
                hashMap.put((Object)((String)entry.getKey()), (Object)new com.umeng.commonsdk.statistics.proto.b((com.umeng.commonsdk.statistics.proto.b)entry.getValue()));
            }
            this.a = hashMap;
        }
        if (c3.j()) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = c3.b.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)new com.umeng.commonsdk.statistics.proto.a((com.umeng.commonsdk.statistics.proto.a)iterator.next()));
            }
            this.b = arrayList;
        }
        if (c3.m()) {
            this.c = c3.c;
        }
    }

    public c(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this();
        this.a = map;
    }

    private void a(ObjectInputStream objectInputStream) {
        try {
            this.read(new bm(new ce((InputStream)objectInputStream)));
            return;
        }
        catch (az az2) {
            throw new IOException(az2.getMessage());
        }
    }

    private void a(ObjectOutputStream objectOutputStream) {
        try {
            this.write(new bm(new ce((OutputStream)objectOutputStream)));
            return;
        }
        catch (az az2) {
            throw new IOException(az2.getMessage());
        }
    }

    static /* synthetic */ bx o() {
        return f;
    }

    static /* synthetic */ bn p() {
        return g;
    }

    static /* synthetic */ bn q() {
        return h;
    }

    static /* synthetic */ bn r() {
        return i;
    }

    public e a(int n2) {
        return e.a(n2);
    }

    public c a() {
        return new c(this);
    }

    public c a(String string) {
        this.c = string;
        return this;
    }

    public c a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.b = list;
        return this;
    }

    public c a(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this.a = map;
        return this;
    }

    public void a(com.umeng.commonsdk.statistics.proto.a a3) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add((Object)a3);
    }

    public void a(String string, com.umeng.commonsdk.statistics.proto.b b3) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put((Object)string, (Object)b3);
    }

    public void a(boolean bl2) {
        if (!bl2) {
            this.a = null;
        }
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void b(boolean bl2) {
        if (!bl2) {
            this.b = null;
        }
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.b> c() {
        return this.a;
    }

    public void c(boolean bl2) {
        if (!bl2) {
            this.c = null;
        }
    }

    public void clear() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public void d() {
        this.a = null;
    }

    public /* synthetic */ at deepCopy() {
        return this.a();
    }

    public boolean e() {
        return this.a != null;
    }

    public int f() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public /* synthetic */ ba fieldForId(int n2) {
        return this.a(n2);
    }

    public Iterator<com.umeng.commonsdk.statistics.proto.a> g() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public List<com.umeng.commonsdk.statistics.proto.a> h() {
        return this.b;
    }

    public void i() {
        this.b = null;
    }

    public boolean j() {
        return this.b != null;
    }

    public String k() {
        return this.c;
    }

    public void l() {
        this.c = null;
    }

    public boolean m() {
        return this.c != null;
    }

    public void n() {
        if (this.a != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Required field 'snapshots' was not present! Struct: ");
        stringBuilder.append(this.toString());
        throw new bt(stringBuilder.toString());
    }

    public void read(bs bs2) {
        ((cb)j.get((Object)bs2.D())).b().b(bs2, (at)this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IdTracking(");
        stringBuilder.append("snapshots:");
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.a;
        if (map == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(map);
        }
        if (this.j()) {
            stringBuilder.append(", ");
            stringBuilder.append("journals:");
            List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
            if (list == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(list);
            }
        }
        if (this.m()) {
            stringBuilder.append(", ");
            stringBuilder.append("checksum:");
            String string = this.c;
            if (string == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(string);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void write(bs bs2) {
        ((cb)j.get((Object)bs2.D())).b().a(bs2, (at)this);
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

    public static final class e
    extends Enum<e>
    implements ba {
        public static final /* enum */ e a;
        public static final /* enum */ e b;
        public static final /* enum */ e c;
        private static final Map<String, e> d;
        private static final /* synthetic */ e[] g;
        private final short e;
        private final String f;

        static {
            e e3;
            e e4;
            e e5;
            a = e4 = new e(1, "snapshots");
            b = e3 = new e(2, "journals");
            c = e5 = new e(3, "checksum");
            g = new e[]{e4, e3, e5};
            d = new HashMap();
            for (e e6 : EnumSet.allOf(e.class)) {
                d.put((Object)e6.b(), (Object)e6);
            }
        }

        private e(short s2, String string2) {
            this.e = s2;
            this.f = string2;
        }

        public static e a(int n2) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return null;
                    }
                    return c;
                }
                return b;
            }
            return a;
        }

        public static e a(String string) {
            return (e)((Object)d.get((Object)string));
        }

        public static e b(int n2) {
            e e3 = e.a(n2);
            if (e3 != null) {
                return e3;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field ");
            stringBuilder.append(n2);
            stringBuilder.append(" doesn't exist!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public static e valueOf(String string) {
            return (e)Enum.valueOf(e.class, (String)string);
        }

        public static e[] values() {
            return (e[])g.clone();
        }

        public short a() {
            return this.e;
        }

        public String b() {
            return this.f;
        }
    }

}


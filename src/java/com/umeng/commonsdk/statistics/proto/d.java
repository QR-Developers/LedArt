/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.aq
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
 *  com.umeng.commonsdk.statistics.proto.d$1
 *  com.umeng.commonsdk.statistics.proto.d$a
 *  com.umeng.commonsdk.statistics.proto.d$c
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
 *  java.util.Collections
 *  java.util.EnumMap
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bg;
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
import com.umeng.commonsdk.statistics.proto.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d
implements at<d, e>,
Serializable,
Cloneable {
    public static final Map<e, bf> d;
    private static final long e = 2846460275012375038L;
    private static final bx f;
    private static final bn g;
    private static final bn h;
    private static final bn i;
    private static final Map<Class<? extends ca>, cb> j;
    private static final int k;
    public Map<String, com.umeng.commonsdk.statistics.proto.e> a;
    public int b;
    public String c;
    private byte l = 0;

    static {
        Map map;
        HashMap hashMap;
        f = new bx("Imprint");
        g = new bn("property", 13, 1);
        h = new bn("version", 8, 2);
        i = new bn("checksum", 11, 3);
        j = hashMap = new HashMap();
        hashMap.put(cc.class, (Object)new b(null));
        hashMap.put(cd.class, (Object)new d(null));
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((Object)e.a, (Object)new bf("property", 1, (bg)new bi(13, new bg(11), new bk(12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put((Object)e.b, (Object)new bf("version", 1, new bg(8)));
        enumMap.put((Object)e.c, (Object)new bf("checksum", 1, new bg(11)));
        d = map = Collections.unmodifiableMap((Map)enumMap);
        bf.a(d.class, (Map)map);
    }

    public d() {
    }

    public d(d d3) {
        this.l = d3.l;
        if (d3.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : d3.a.entrySet()) {
                hashMap.put((Object)((String)entry.getKey()), (Object)new com.umeng.commonsdk.statistics.proto.e((com.umeng.commonsdk.statistics.proto.e)entry.getValue()));
            }
            this.a = hashMap;
        }
        this.b = d3.b;
        if (d3.k()) {
            this.c = d3.c;
        }
    }

    public d(Map<String, com.umeng.commonsdk.statistics.proto.e> map, int n2, String string) {
        this();
        this.a = map;
        this.b = n2;
        this.b(true);
        this.c = string;
    }

    private void a(ObjectInputStream objectInputStream) {
        try {
            this.l = 0;
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

    static /* synthetic */ bx m() {
        return f;
    }

    static /* synthetic */ bn n() {
        return g;
    }

    static /* synthetic */ bn o() {
        return h;
    }

    static /* synthetic */ bn p() {
        return i;
    }

    public d a() {
        return new d(this);
    }

    public d a(int n2) {
        this.b = n2;
        this.b(true);
        return this;
    }

    public d a(String string) {
        this.c = string;
        return this;
    }

    public d a(Map<String, com.umeng.commonsdk.statistics.proto.e> map) {
        this.a = map;
        return this;
    }

    public void a(String string, com.umeng.commonsdk.statistics.proto.e e3) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put((Object)string, (Object)e3);
    }

    public void a(boolean bl2) {
        if (!bl2) {
            this.a = null;
        }
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public e b(int n2) {
        return e.a(n2);
    }

    public void b(boolean bl2) {
        this.l = aq.a((byte)this.l, (int)0, (boolean)bl2);
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.e> c() {
        return this.a;
    }

    public void c(boolean bl2) {
        if (!bl2) {
            this.c = null;
        }
    }

    public void clear() {
        this.a = null;
        this.b(false);
        this.b = 0;
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
        return this.b;
    }

    public /* synthetic */ ba fieldForId(int n2) {
        return this.b(n2);
    }

    public void g() {
        this.l = aq.b((byte)this.l, (int)0);
    }

    public boolean h() {
        return aq.a((byte)this.l, (int)0);
    }

    public String i() {
        return this.c;
    }

    public void j() {
        this.c = null;
    }

    public boolean k() {
        return this.c != null;
    }

    public void l() {
        if (this.a != null) {
            if (this.c != null) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Required field 'checksum' was not present! Struct: ");
            stringBuilder.append(this.toString());
            throw new bt(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Required field 'property' was not present! Struct: ");
        stringBuilder.append(this.toString());
        throw new bt(stringBuilder.toString());
    }

    public void read(bs bs2) {
        ((cb)j.get((Object)bs2.D())).b().b(bs2, (at)this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Imprint(");
        stringBuilder.append("property:");
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.a;
        if (map == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(map);
        }
        stringBuilder.append(", ");
        stringBuilder.append("version:");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append("checksum:");
        String string = this.c;
        if (string == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string);
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
            a = e3 = new e(1, "property");
            b = e4 = new e(2, "version");
            c = e5 = new e(3, "checksum");
            g = new e[]{e3, e4, e5};
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


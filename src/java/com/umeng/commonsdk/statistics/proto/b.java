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
 *  com.umeng.commonsdk.statistics.proto.b$1
 *  com.umeng.commonsdk.statistics.proto.b$a
 *  com.umeng.commonsdk.statistics.proto.b$c
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
 */
package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bg;
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
import com.umeng.commonsdk.statistics.proto.b;
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

public class b
implements at<b, e>,
Serializable,
Cloneable {
    public static final Map<e, bf> d;
    private static final long e = -6496538196005191531L;
    private static final bx f;
    private static final bn g;
    private static final bn h;
    private static final bn i;
    private static final Map<Class<? extends ca>, cb> j;
    private static final int k = 0;
    private static final int l = 1;
    public String a;
    public long b;
    public int c;
    private byte m = 0;

    static {
        Map map;
        HashMap hashMap;
        f = new bx("IdSnapshot");
        g = new bn("identity", 11, 1);
        h = new bn("ts", 10, 2);
        i = new bn("version", 8, 3);
        j = hashMap = new HashMap();
        hashMap.put(cc.class, (Object)new b(null));
        hashMap.put(cd.class, (Object)new d(null));
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((Object)e.a, (Object)new bf("identity", 1, new bg(11)));
        enumMap.put((Object)e.b, (Object)new bf("ts", 1, new bg(10)));
        enumMap.put((Object)e.c, (Object)new bf("version", 1, new bg(8)));
        d = map = Collections.unmodifiableMap((Map)enumMap);
        bf.a(b.class, (Map)map);
    }

    public b() {
    }

    public b(b b3) {
        this.m = b3.m;
        if (b3.d()) {
            this.a = b3.a;
        }
        this.b = b3.b;
        this.c = b3.c;
    }

    public b(String string, long l2, int n2) {
        this();
        this.a = string;
        this.b = l2;
        this.b(true);
        this.c = n2;
        this.c(true);
    }

    private void a(ObjectInputStream objectInputStream) {
        try {
            this.m = 0;
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

    static /* synthetic */ bx l() {
        return f;
    }

    static /* synthetic */ bn m() {
        return g;
    }

    static /* synthetic */ bn n() {
        return h;
    }

    static /* synthetic */ bn o() {
        return i;
    }

    public b a() {
        return new b(this);
    }

    public b a(int n2) {
        this.c = n2;
        this.c(true);
        return this;
    }

    public b a(long l2) {
        this.b = l2;
        this.b(true);
        return this;
    }

    public b a(String string) {
        this.a = string;
        return this;
    }

    public void a(boolean bl2) {
        if (!bl2) {
            this.a = null;
        }
    }

    public e b(int n2) {
        return e.a(n2);
    }

    public String b() {
        return this.a;
    }

    public void b(boolean bl2) {
        this.m = aq.a((byte)this.m, (int)0, (boolean)bl2);
    }

    public void c() {
        this.a = null;
    }

    public void c(boolean bl2) {
        this.m = aq.a((byte)this.m, (int)1, (boolean)bl2);
    }

    public void clear() {
        this.a = null;
        this.b(false);
        this.b = 0L;
        this.c(false);
        this.c = 0;
    }

    public boolean d() {
        return this.a != null;
    }

    public /* synthetic */ at deepCopy() {
        return this.a();
    }

    public long e() {
        return this.b;
    }

    public void f() {
        this.m = aq.b((byte)this.m, (int)0);
    }

    public /* synthetic */ ba fieldForId(int n2) {
        return this.b(n2);
    }

    public boolean g() {
        return aq.a((byte)this.m, (int)0);
    }

    public int h() {
        return this.c;
    }

    public void i() {
        this.m = aq.b((byte)this.m, (int)1);
    }

    public boolean j() {
        return aq.a((byte)this.m, (int)1);
    }

    public void k() {
        if (this.a != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Required field 'identity' was not present! Struct: ");
        stringBuilder.append(this.toString());
        throw new bt(stringBuilder.toString());
    }

    public void read(bs bs2) {
        ((cb)j.get((Object)bs2.D())).b().b(bs2, (at)this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IdSnapshot(");
        stringBuilder.append("identity:");
        String string = this.a;
        if (string == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string);
        }
        stringBuilder.append(", ");
        stringBuilder.append("ts:");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append("version:");
        stringBuilder.append(this.c);
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
            a = e4 = new e(1, "identity");
            b = e3 = new e(2, "ts");
            c = e5 = new e(3, "version");
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


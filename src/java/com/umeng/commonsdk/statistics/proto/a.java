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
 *  com.umeng.commonsdk.statistics.proto.a$1
 *  com.umeng.commonsdk.statistics.proto.a$a
 *  com.umeng.commonsdk.statistics.proto.a$c
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
import com.umeng.commonsdk.statistics.proto.a;
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

public class a
implements at<a, e>,
Serializable,
Cloneable {
    public static final Map<e, bf> e;
    private static final long f = 9132678615281394583L;
    private static final bx g;
    private static final bn h;
    private static final bn i;
    private static final bn j;
    private static final bn k;
    private static final Map<Class<? extends ca>, cb> l;
    private static final int m;
    public String a;
    public String b;
    public String c;
    public long d;
    private byte n = 0;
    private e[] o;

    static {
        Map map;
        HashMap hashMap;
        g = new bx("IdJournal");
        h = new bn("domain", 11, 1);
        i = new bn("old_id", 11, 2);
        j = new bn("new_id", 11, 3);
        k = new bn("ts", 10, 4);
        l = hashMap = new HashMap();
        hashMap.put(cc.class, (Object)new b(null));
        hashMap.put(cd.class, (Object)new d(null));
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((Object)e.a, (Object)new bf("domain", 1, new bg(11)));
        enumMap.put((Object)e.b, (Object)new bf("old_id", 2, new bg(11)));
        enumMap.put((Object)e.c, (Object)new bf("new_id", 1, new bg(11)));
        enumMap.put((Object)e.d, (Object)new bf("ts", 1, new bg(10)));
        e = map = Collections.unmodifiableMap((Map)enumMap);
        bf.a(a.class, (Map)map);
    }

    public a() {
        e[] arre = new e[]{e.b};
        this.o = arre;
    }

    public a(a a3) {
        e[] arre = new e[]{e.b};
        this.o = arre;
        this.n = a3.n;
        if (a3.d()) {
            this.a = a3.a;
        }
        if (a3.g()) {
            this.b = a3.b;
        }
        if (a3.j()) {
            this.c = a3.c;
        }
        this.d = a3.d;
    }

    public a(String string, String string2, long l2) {
        this();
        this.a = string;
        this.c = string2;
        this.d = l2;
        this.d(true);
    }

    private void a(ObjectInputStream objectInputStream) {
        try {
            this.n = 0;
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
        return g;
    }

    static /* synthetic */ bn p() {
        return h;
    }

    static /* synthetic */ bn q() {
        return i;
    }

    static /* synthetic */ bn r() {
        return j;
    }

    static /* synthetic */ bn s() {
        return k;
    }

    public e a(int n2) {
        return e.a(n2);
    }

    public a a() {
        return new a(this);
    }

    public a a(long l2) {
        this.d = l2;
        this.d(true);
        return this;
    }

    public a a(String string) {
        this.a = string;
        return this;
    }

    public void a(boolean bl2) {
        if (!bl2) {
            this.a = null;
        }
    }

    public a b(String string) {
        this.b = string;
        return this;
    }

    public String b() {
        return this.a;
    }

    public void b(boolean bl2) {
        if (!bl2) {
            this.b = null;
        }
    }

    public a c(String string) {
        this.c = string;
        return this;
    }

    public void c() {
        this.a = null;
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
        this.d(false);
        this.d = 0L;
    }

    public void d(boolean bl2) {
        this.n = aq.a((byte)this.n, (int)0, (boolean)bl2);
    }

    public boolean d() {
        return this.a != null;
    }

    public /* synthetic */ at deepCopy() {
        return this.a();
    }

    public String e() {
        return this.b;
    }

    public void f() {
        this.b = null;
    }

    public /* synthetic */ ba fieldForId(int n2) {
        return this.a(n2);
    }

    public boolean g() {
        return this.b != null;
    }

    public String h() {
        return this.c;
    }

    public void i() {
        this.c = null;
    }

    public boolean j() {
        return this.c != null;
    }

    public long k() {
        return this.d;
    }

    public void l() {
        this.n = aq.b((byte)this.n, (int)0);
    }

    public boolean m() {
        return aq.a((byte)this.n, (int)0);
    }

    public void n() {
        if (this.a != null) {
            if (this.c != null) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Required field 'new_id' was not present! Struct: ");
            stringBuilder.append(this.toString());
            throw new bt(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Required field 'domain' was not present! Struct: ");
        stringBuilder.append(this.toString());
        throw new bt(stringBuilder.toString());
    }

    public void read(bs bs2) {
        ((cb)l.get((Object)bs2.D())).b().b(bs2, (at)this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IdJournal(");
        stringBuilder.append("domain:");
        String string = this.a;
        if (string == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string);
        }
        if (this.g()) {
            stringBuilder.append(", ");
            stringBuilder.append("old_id:");
            String string2 = this.b;
            if (string2 == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(string2);
            }
        }
        stringBuilder.append(", ");
        stringBuilder.append("new_id:");
        String string3 = this.c;
        if (string3 == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string3);
        }
        stringBuilder.append(", ");
        stringBuilder.append("ts:");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void write(bs bs2) {
        ((cb)l.get((Object)bs2.D())).b().a(bs2, (at)this);
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
        public static final /* enum */ e d;
        private static final Map<String, e> e;
        private static final /* synthetic */ e[] h;
        private final short f;
        private final String g;

        static {
            e e3;
            e e4;
            e e5;
            e e6;
            a = e3 = new e(1, "domain");
            b = e4 = new e(2, "old_id");
            c = e6 = new e(3, "new_id");
            d = e5 = new e(4, "ts");
            h = new e[]{e3, e4, e6, e5};
            e = new HashMap();
            for (e e7 : EnumSet.allOf(e.class)) {
                e.put((Object)e7.b(), (Object)e7);
            }
        }

        private e(short s2, String string2) {
            this.f = s2;
            this.g = string2;
        }

        public static e a(int n2) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return null;
                        }
                        return d;
                    }
                    return c;
                }
                return b;
            }
            return a;
        }

        public static e a(String string) {
            return (e)((Object)e.get((Object)string));
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
            return (e[])h.clone();
        }

        public short a() {
            return this.f;
        }

        public String b() {
            return this.g;
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.al$1
 *  com.umeng.analytics.pro.al$a
 *  com.umeng.analytics.pro.al$c
 *  com.umeng.analytics.pro.aq
 *  com.umeng.analytics.pro.at
 *  com.umeng.analytics.pro.au
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
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.EnumMap
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.Map
 */
package com.umeng.analytics.pro;

import com.umeng.analytics.pro.al;
import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.au;
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
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class al
implements at<al, e>,
Serializable,
Cloneable {
    private static final int A = 2;
    private static final int B = 3;
    public static final Map<e, bf> k;
    private static final long l = 420342210744516016L;
    private static final bx m;
    private static final bn n;
    private static final bn o;
    private static final bn p;
    private static final bn q;
    private static final bn r;
    private static final bn s;
    private static final bn t;
    private static final bn u;
    private static final bn v;
    private static final bn w;
    private static final Map<Class<? extends ca>, cb> x;
    private static final int y = 0;
    private static final int z = 1;
    private byte C = 0;
    private e[] D;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    static {
        Map map;
        HashMap hashMap;
        m = new bx("UMEnvelope");
        n = new bn("version", 11, 1);
        o = new bn("address", 11, 2);
        p = new bn("signature", 11, 3);
        q = new bn("serial_num", 8, 4);
        r = new bn("ts_secs", 8, 5);
        s = new bn("length", 8, 6);
        t = new bn("entity", 11, 7);
        u = new bn("guid", 11, 8);
        v = new bn("checksum", 11, 9);
        w = new bn("codex", 8, 10);
        x = hashMap = new HashMap();
        hashMap.put(cc.class, (Object)new b(null));
        hashMap.put(cd.class, (Object)new d(null));
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((Object)e.a, (Object)new bf("version", 1, new bg(11)));
        enumMap.put((Object)e.b, (Object)new bf("address", 1, new bg(11)));
        enumMap.put((Object)e.c, (Object)new bf("signature", 1, new bg(11)));
        enumMap.put((Object)e.d, (Object)new bf("serial_num", 1, new bg(8)));
        enumMap.put((Object)e.e, (Object)new bf("ts_secs", 1, new bg(8)));
        enumMap.put((Object)e.f, (Object)new bf("length", 1, new bg(8)));
        enumMap.put((Object)e.g, (Object)new bf("entity", 1, new bg(11, true)));
        enumMap.put((Object)e.h, (Object)new bf("guid", 1, new bg(11)));
        enumMap.put((Object)e.i, (Object)new bf("checksum", 1, new bg(11)));
        enumMap.put((Object)e.j, (Object)new bf("codex", 2, new bg(8)));
        k = map = Collections.unmodifiableMap((Map)enumMap);
        bf.a(al.class, (Map)map);
    }

    public al() {
        e[] arre = new e[]{e.j};
        this.D = arre;
    }

    public al(al al2) {
        e[] arre = new e[]{e.j};
        this.D = arre;
        this.C = al2.C;
        if (al2.d()) {
            this.a = al2.a;
        }
        if (al2.g()) {
            this.b = al2.b;
        }
        if (al2.j()) {
            this.c = al2.c;
        }
        this.d = al2.d;
        this.e = al2.e;
        this.f = al2.f;
        if (al2.w()) {
            this.g = au.d((ByteBuffer)al2.g);
        }
        if (al2.z()) {
            this.h = al2.h;
        }
        if (al2.C()) {
            this.i = al2.i;
        }
        this.j = al2.j;
    }

    public al(String string, String string2, String string3, int n2, int n3, int n4, ByteBuffer byteBuffer, String string4, String string5) {
        this();
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = n2;
        this.d(true);
        this.e = n3;
        this.e(true);
        this.f = n4;
        this.f(true);
        this.g = byteBuffer;
        this.h = string4;
        this.i = string5;
    }

    static /* synthetic */ bx H() {
        return m;
    }

    static /* synthetic */ bn I() {
        return n;
    }

    static /* synthetic */ bn J() {
        return o;
    }

    static /* synthetic */ bn K() {
        return p;
    }

    static /* synthetic */ bn L() {
        return q;
    }

    static /* synthetic */ bn M() {
        return r;
    }

    static /* synthetic */ bn N() {
        return s;
    }

    static /* synthetic */ bn O() {
        return t;
    }

    static /* synthetic */ bn P() {
        return u;
    }

    static /* synthetic */ bn Q() {
        return v;
    }

    static /* synthetic */ bn R() {
        return w;
    }

    private void a(ObjectInputStream objectInputStream) {
        try {
            this.C = 0;
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

    public String A() {
        return this.i;
    }

    public void B() {
        this.i = null;
    }

    public boolean C() {
        return this.i != null;
    }

    public int D() {
        return this.j;
    }

    public void E() {
        this.C = aq.b((byte)this.C, (int)3);
    }

    public boolean F() {
        return aq.a((byte)this.C, (int)3);
    }

    public void G() {
        if (this.a != null) {
            if (this.b != null) {
                if (this.c != null) {
                    if (this.g != null) {
                        if (this.h != null) {
                            if (this.i != null) {
                                return;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Required field 'checksum' was not present! Struct: ");
                            stringBuilder.append(this.toString());
                            throw new bt(stringBuilder.toString());
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Required field 'guid' was not present! Struct: ");
                        stringBuilder.append(this.toString());
                        throw new bt(stringBuilder.toString());
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Required field 'entity' was not present! Struct: ");
                    stringBuilder.append(this.toString());
                    throw new bt(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Required field 'signature' was not present! Struct: ");
                stringBuilder.append(this.toString());
                throw new bt(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Required field 'address' was not present! Struct: ");
            stringBuilder.append(this.toString());
            throw new bt(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Required field 'version' was not present! Struct: ");
        stringBuilder.append(this.toString());
        throw new bt(stringBuilder.toString());
    }

    public al a() {
        return new al(this);
    }

    public al a(int n2) {
        this.d = n2;
        this.d(true);
        return this;
    }

    public al a(String string) {
        this.a = string;
        return this;
    }

    public al a(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        return this;
    }

    public al a(byte[] arrby) {
        ByteBuffer byteBuffer = arrby == null ? null : ByteBuffer.wrap((byte[])arrby);
        this.a(byteBuffer);
        return this;
    }

    public void a(boolean bl2) {
        if (!bl2) {
            this.a = null;
        }
    }

    public al b(int n2) {
        this.e = n2;
        this.e(true);
        return this;
    }

    public al b(String string) {
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

    public al c(int n2) {
        this.f = n2;
        this.f(true);
        return this;
    }

    public al c(String string) {
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
        this.d = 0;
        this.e(false);
        this.e = 0;
        this.f(false);
        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j(false);
        this.j = 0;
    }

    public al d(int n2) {
        this.j = n2;
        this.j(true);
        return this;
    }

    public al d(String string) {
        this.h = string;
        return this;
    }

    public void d(boolean bl2) {
        this.C = aq.a((byte)this.C, (int)0, (boolean)bl2);
    }

    public boolean d() {
        return this.a != null;
    }

    public /* synthetic */ at deepCopy() {
        return this.a();
    }

    public e e(int n2) {
        return e.a(n2);
    }

    public al e(String string) {
        this.i = string;
        return this;
    }

    public String e() {
        return this.b;
    }

    public void e(boolean bl2) {
        this.C = aq.a((byte)this.C, (int)1, (boolean)bl2);
    }

    public void f() {
        this.b = null;
    }

    public void f(boolean bl2) {
        this.C = aq.a((byte)this.C, (int)2, (boolean)bl2);
    }

    public /* synthetic */ ba fieldForId(int n2) {
        return this.e(n2);
    }

    public void g(boolean bl2) {
        if (!bl2) {
            this.g = null;
        }
    }

    public boolean g() {
        return this.b != null;
    }

    public String h() {
        return this.c;
    }

    public void h(boolean bl2) {
        if (!bl2) {
            this.h = null;
        }
    }

    public void i() {
        this.c = null;
    }

    public void i(boolean bl2) {
        if (!bl2) {
            this.i = null;
        }
    }

    public void j(boolean bl2) {
        this.C = aq.a((byte)this.C, (int)3, (boolean)bl2);
    }

    public boolean j() {
        return this.c != null;
    }

    public int k() {
        return this.d;
    }

    public void l() {
        this.C = aq.b((byte)this.C, (int)0);
    }

    public boolean m() {
        return aq.a((byte)this.C, (int)0);
    }

    public int n() {
        return this.e;
    }

    public void o() {
        this.C = aq.b((byte)this.C, (int)1);
    }

    public boolean p() {
        return aq.a((byte)this.C, (int)1);
    }

    public int q() {
        return this.f;
    }

    public void r() {
        this.C = aq.b((byte)this.C, (int)2);
    }

    public void read(bs bs2) {
        ((cb)x.get((Object)bs2.D())).b().b(bs2, (at)this);
    }

    public boolean s() {
        return aq.a((byte)this.C, (int)2);
    }

    public byte[] t() {
        this.a(au.c((ByteBuffer)this.g));
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("UMEnvelope(");
        stringBuilder.append("version:");
        String string = this.a;
        if (string == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string);
        }
        stringBuilder.append(", ");
        stringBuilder.append("address:");
        String string2 = this.b;
        if (string2 == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string2);
        }
        stringBuilder.append(", ");
        stringBuilder.append("signature:");
        String string3 = this.c;
        if (string3 == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string3);
        }
        stringBuilder.append(", ");
        stringBuilder.append("serial_num:");
        stringBuilder.append(this.d);
        stringBuilder.append(", ");
        stringBuilder.append("ts_secs:");
        stringBuilder.append(this.e);
        stringBuilder.append(", ");
        stringBuilder.append("length:");
        stringBuilder.append(this.f);
        stringBuilder.append(", ");
        stringBuilder.append("entity:");
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            stringBuilder.append("null");
        } else {
            au.a((ByteBuffer)byteBuffer, (StringBuilder)stringBuilder);
        }
        stringBuilder.append(", ");
        stringBuilder.append("guid:");
        String string4 = this.h;
        if (string4 == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string4);
        }
        stringBuilder.append(", ");
        stringBuilder.append("checksum:");
        String string5 = this.i;
        if (string5 == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(string5);
        }
        if (this.F()) {
            stringBuilder.append(", ");
            stringBuilder.append("codex:");
            stringBuilder.append(this.j);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ByteBuffer u() {
        return this.g;
    }

    public void v() {
        this.g = null;
    }

    public boolean w() {
        return this.g != null;
    }

    public void write(bs bs2) {
        ((cb)x.get((Object)bs2.D())).b().a(bs2, (at)this);
    }

    public String x() {
        return this.h;
    }

    public void y() {
        this.h = null;
    }

    public boolean z() {
        return this.h != null;
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
        public static final /* enum */ e e;
        public static final /* enum */ e f;
        public static final /* enum */ e g;
        public static final /* enum */ e h;
        public static final /* enum */ e i;
        public static final /* enum */ e j;
        private static final Map<String, e> k;
        private static final /* synthetic */ e[] n;
        private final short l;
        private final String m;

        static {
            e e3;
            e e4;
            e e5;
            e e6;
            e e7;
            e e8;
            e e9;
            e e10;
            e e11;
            e e12;
            a = e5 = new e(1, "version");
            b = e12 = new e(2, "address");
            c = e4 = new e(3, "signature");
            d = e9 = new e(4, "serial_num");
            e = e8 = new e(5, "ts_secs");
            f = e6 = new e(6, "length");
            g = e11 = new e(7, "entity");
            h = e7 = new e(8, "guid");
            i = e10 = new e(9, "checksum");
            j = e3 = new e(10, "codex");
            n = new e[]{e5, e12, e4, e9, e8, e6, e11, e7, e10, e3};
            k = new HashMap();
            for (e e13 : EnumSet.allOf(e.class)) {
                k.put((Object)e13.b(), (Object)e13);
            }
        }

        private e(short s2, String string2) {
            this.l = s2;
            this.m = string2;
        }

        public static e a(int n2) {
            switch (n2) {
                default: {
                    return null;
                }
                case 10: {
                    return j;
                }
                case 9: {
                    return i;
                }
                case 8: {
                    return h;
                }
                case 7: {
                    return g;
                }
                case 6: {
                    return f;
                }
                case 5: {
                    return e;
                }
                case 4: {
                    return d;
                }
                case 3: {
                    return c;
                }
                case 2: {
                    return b;
                }
                case 1: 
            }
            return a;
        }

        public static e a(String string) {
            return (e)((Object)k.get((Object)string));
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
            return (e[])n.clone();
        }

        public short a() {
            return this.l;
        }

        public String b() {
            return this.m;
        }
    }

}


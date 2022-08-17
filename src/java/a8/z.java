/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.a0
 *  a8.b
 *  a8.b0
 *  a8.c
 *  a8.e
 *  a8.e$a
 *  a8.g
 *  a8.j
 *  a8.k
 *  a8.o
 *  a8.p
 *  a8.r
 *  a8.r$c
 *  a8.w
 *  a8.z$b
 *  b8.b
 *  e8.e
 *  e8.i
 *  j7.n
 *  j8.a
 *  java.lang.Cloneable
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.Proxy
 *  java.net.ProxySelector
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 *  javax.net.SocketFactory
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSocketFactory
 *  javax.net.ssl.X509TrustManager
 *  k7.k
 *  k8.c
 *  k8.c$a
 *  k8.d
 *  okhttp3.internal.platform.h
 *  okhttp3.internal.platform.h$a
 *  u7.g
 *  u7.j
 */
package a8;

import a8.a0;
import a8.b0;
import a8.c;
import a8.e;
import a8.g;
import a8.j;
import a8.k;
import a8.o;
import a8.p;
import a8.q;
import a8.r;
import a8.w;
import a8.z;
import e8.i;
import j7.n;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k8.c;
import k8.d;
import okhttp3.internal.platform.h;

/*
 * Exception performing whole class analysis.
 */
public class z
implements Cloneable,
e.a {
    private static final List<a0> D;
    private static final List<k> E;
    public static final b F;
    private final int A;
    private final int B;
    private final i C;
    private final p a;
    private final j b;
    private final List<w> c;
    private final List<w> d;
    private final r.c e;
    private final boolean f;
    private final a8.b g;
    private final boolean h;
    private final boolean i;
    private final o j;
    private final c k;
    private final q l;
    private final Proxy m;
    private final ProxySelector n;
    private final a8.b o;
    private final SocketFactory p;
    private final SSLSocketFactory q;
    private final X509TrustManager r;
    private final List<k> s;
    private final List<a0> t;
    private final HostnameVerifier u;
    private final g v;
    private final k8.c w;
    private final int x;
    private final int y;
    private final int z;

    static {
        F = new /* Unavailable Anonymous Inner Class!! */;
        Object[] arrobject = new a0[]{a0.e, a0.c};
        D = b8.b.t((Object[])arrobject);
        Object[] arrobject2 = new k[]{k.g, k.h};
        E = b8.b.t((Object[])arrobject2);
    }

    public z() {
        this(new Object(){
            private int A;
            private int B;
            private i C;
            private p a;
            private j b;
            private final List<w> c;
            private final List<w> d;
            private r.c e;
            private boolean f;
            private a8.b g;
            private boolean h;
            private boolean i;
            private o j;
            private c k;
            private q l;
            private Proxy m;
            private ProxySelector n;
            private a8.b o;
            private SocketFactory p;
            private SSLSocketFactory q;
            private X509TrustManager r;
            private List<k> s;
            private List<? extends a0> t;
            private HostnameVerifier u;
            private g v;
            private k8.c w;
            private int x;
            private int y;
            private int z;
            {
                a8.b b2;
                this.a = new p();
                this.b = new j();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = b8.b.e((r)r.a);
                this.f = true;
                this.g = b2 = a8.b.a;
                this.h = true;
                this.i = true;
                this.j = o.a;
                this.l = q.a;
                this.o = b2;
                SocketFactory socketFactory = SocketFactory.getDefault();
                u7.j.b((Object)socketFactory, (String)"SocketFactory.getDefault()");
                this.p = socketFactory;
                b b3 = z.F;
                this.s = b3.b();
                this.t = b3.c();
                this.u = d.a;
                this.v = g.c;
                this.y = 10000;
                this.z = 10000;
                this.A = 10000;
            }
            {
                u7.j.f((Object)z2, (String)"okHttpClient");
                this();
                this.a = z2.n();
                this.b = z2.k();
                k7.k.p(this.c, z2.u());
                k7.k.p(this.d, z2.v());
                this.e = z2.p();
                this.f = z2.D();
                this.g = z2.e();
                this.h = z2.q();
                this.i = z2.r();
                this.j = z2.m();
                z2.f();
                this.l = z2.o();
                this.m = z2.z();
                this.n = z2.B();
                this.o = z2.A();
                this.p = z2.E();
                this.q = z2.q;
                this.r = z2.H();
                this.s = z2.l();
                this.t = z2.y();
                this.u = z2.t();
                this.v = z2.i();
                this.w = z2.h();
                this.x = z2.g();
                this.y = z2.j();
                this.z = z2.C();
                this.A = z2.G();
                this.B = z2.x();
                this.C = z2.s();
            }

            public final int A() {
                return this.z;
            }

            public final boolean B() {
                return this.f;
            }

            public final i C() {
                return this.C;
            }

            public final SocketFactory D() {
                return this.p;
            }

            public final SSLSocketFactory E() {
                return this.q;
            }

            public final int F() {
                return this.A;
            }

            public final X509TrustManager G() {
                return this.r;
            }

            public final a H(HostnameVerifier hostnameVerifier) {
                u7.j.f((Object)hostnameVerifier, (String)"hostnameVerifier");
                if (true ^ u7.j.a((Object)hostnameVerifier, (Object)this.u)) {
                    this.C = null;
                }
                this.u = hostnameVerifier;
                return this;
            }

            public final a I(long l2, TimeUnit timeUnit) {
                u7.j.f((Object)timeUnit, (String)"unit");
                this.z = b8.b.h((String)"timeout", (long)l2, (TimeUnit)timeUnit);
                return this;
            }

            public final a J(long l2, TimeUnit timeUnit) {
                u7.j.f((Object)timeUnit, (String)"unit");
                this.A = b8.b.h((String)"timeout", (long)l2, (TimeUnit)timeUnit);
                return this;
            }

            public final a a(w w2) {
                u7.j.f((Object)w2, (String)"interceptor");
                this.c.add((Object)w2);
                return this;
            }

            public final z b() {
                return new z(this);
            }

            public final a c(long l2, TimeUnit timeUnit) {
                u7.j.f((Object)timeUnit, (String)"unit");
                this.y = b8.b.h((String)"timeout", (long)l2, (TimeUnit)timeUnit);
                return this;
            }

            public final a d(q q2) {
                u7.j.f((Object)q2, (String)"dns");
                if (true ^ u7.j.a((Object)q2, (Object)this.l)) {
                    this.C = null;
                }
                this.l = q2;
                return this;
            }

            public final a8.b e() {
                return this.g;
            }

            public final c f() {
                return this.k;
            }

            public final int g() {
                return this.x;
            }

            public final k8.c h() {
                return this.w;
            }

            public final g i() {
                return this.v;
            }

            public final int j() {
                return this.y;
            }

            public final j k() {
                return this.b;
            }

            public final List<k> l() {
                return this.s;
            }

            public final o m() {
                return this.j;
            }

            public final p n() {
                return this.a;
            }

            public final q o() {
                return this.l;
            }

            public final r.c p() {
                return this.e;
            }

            public final boolean q() {
                return this.h;
            }

            public final boolean r() {
                return this.i;
            }

            public final HostnameVerifier s() {
                return this.u;
            }

            public final List<w> t() {
                return this.c;
            }

            public final List<w> u() {
                return this.d;
            }

            public final int v() {
                return this.B;
            }

            public final List<a0> w() {
                return this.t;
            }

            public final Proxy x() {
                return this.m;
            }

            public final a8.b y() {
                return this.o;
            }

            public final ProxySelector z() {
                return this.n;
            }
        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public z(a var1_1) {
        u7.j.f((Object)var1_1, (String)"builder");
        super();
        this.a = var1_1.n();
        this.b = var1_1.k();
        this.c = b8.b.M(var1_1.t());
        this.d = b8.b.M(var1_1.u());
        this.e = var1_1.p();
        this.f = var1_1.B();
        this.g = var1_1.e();
        this.h = var1_1.q();
        this.i = var1_1.r();
        this.j = var1_1.m();
        var1_1.f();
        this.l = var1_1.o();
        this.m = var1_1.x();
        if (var1_1.x() != null) {
            var3_2 = j8.a.a;
        } else {
            var3_2 = var1_1.z();
            if (var3_2 == null) {
                var3_2 = ProxySelector.getDefault();
            }
            if (var3_2 == null) {
                var3_2 = j8.a.a;
            }
        }
        this.n = var3_2;
        this.o = var1_1.y();
        this.p = var1_1.D();
        var4_3 = var1_1.l();
        this.s = var4_3;
        this.t = var1_1.w();
        this.u = var1_1.s();
        this.x = var1_1.g();
        this.y = var1_1.j();
        this.z = var1_1.A();
        this.A = var1_1.F();
        this.B = var1_1.v();
        var5_4 = var1_1.C();
        if (var5_4 == null) {
            var5_4 = new i();
        }
        this.C = var5_4;
        if (var1_1.E() != null) ** GOTO lbl-1000
        if (!(var4_3 instanceof Collection) || !var4_3.isEmpty()) {
            var15_6 = var4_3.iterator();
            while (var15_6.hasNext()) {
                if (!((k)var15_6.next()).f()) continue;
                var16_5 = false;
                break;
            }
        } else {
            var16_5 = true;
        }
        if (!var16_5) {
            var17_7 = h.c;
            this.r = var18_8 = var17_7.e().p();
            var17_7.e().g(var18_8);
            var19_9 = z.F;
            if (var18_8 == null) {
                u7.j.m();
            }
            this.q = b.a(var19_9, (X509TrustManager)var18_8);
            var20_10 = k8.c.a;
            if (var18_8 == null) {
                u7.j.m();
            }
            this.w = var20_10.a(var18_8);
        } else lbl-1000: // 2 sources:
        {
            this.q = var1_1.E();
            this.w = var1_1.h();
            this.r = var1_1.G();
        }
        if (this.q != null) {
            h.c.e().e(this.q);
        }
        this.v = var1_1.i().e(this.w);
        var6_11 = this.c;
        if (var6_11 == null) {
            var7_15 = new n("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            throw var7_15;
        }
        if (!(true ^ var6_11.contains(null))) {
            var8_14 = new StringBuilder();
            var8_14.append("Null interceptor: ");
            var8_14.append(this.c);
            throw new IllegalStateException(var8_14.toString().toString());
        }
        var11_12 = this.d;
        if (var11_12 == null) throw new n("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (true ^ var11_12.contains(null)) {
            return;
        }
        var12_13 = new StringBuilder();
        var12_13.append("Null network interceptor: ");
        var12_13.append(this.d);
        throw new IllegalStateException(var12_13.toString().toString());
    }

    public static final /* synthetic */ List b() {
        return E;
    }

    public static final /* synthetic */ List c() {
        return D;
    }

    public final a8.b A() {
        return this.o;
    }

    public final ProxySelector B() {
        return this.n;
    }

    public final int C() {
        return this.z;
    }

    public final boolean D() {
        return this.f;
    }

    public final SocketFactory E() {
        return this.p;
    }

    public final SSLSocketFactory F() {
        SSLSocketFactory sSLSocketFactory = this.q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int G() {
        return this.A;
    }

    public final X509TrustManager H() {
        return this.r;
    }

    public e a(b0 b02) {
        u7.j.f((Object)b02, (String)"request");
        return new e8.e(this, b02, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final a8.b e() {
        return this.g;
    }

    public final c f() {
        return this.k;
    }

    public final int g() {
        return this.x;
    }

    public final k8.c h() {
        return this.w;
    }

    public final g i() {
        return this.v;
    }

    public final int j() {
        return this.y;
    }

    public final j k() {
        return this.b;
    }

    public final List<k> l() {
        return this.s;
    }

    public final o m() {
        return this.j;
    }

    public final p n() {
        return this.a;
    }

    public final q o() {
        return this.l;
    }

    public final r.c p() {
        return this.e;
    }

    public final boolean q() {
        return this.h;
    }

    public final boolean r() {
        return this.i;
    }

    public final i s() {
        return this.C;
    }

    public final HostnameVerifier t() {
        return this.u;
    }

    public final List<w> u() {
        return this.c;
    }

    public final List<w> v() {
        return this.d;
    }

    public a w() {
        return new /* invalid duplicate definition of identical inner class */;
    }

    public final int x() {
        return this.B;
    }

    public final List<a0> y() {
        return this.t;
    }

    public final Proxy z() {
        return this.m;
    }

}


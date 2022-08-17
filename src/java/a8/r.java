/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.a0
 *  a8.b0
 *  a8.d0
 *  a8.e
 *  a8.i
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.InetAddress
 *  java.net.InetSocketAddress
 *  java.net.Proxy
 *  java.util.List
 *  u7.g
 *  u7.j
 */
package a8;

import a8.a0;
import a8.b0;
import a8.d0;
import a8.e;
import a8.i;
import a8.r;
import a8.t;
import a8.v;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import u7.g;
import u7.j;

public abstract class r {
    public static final r a;

    static {
        new b(null);
        a = new r(){};
    }

    public void a(e e2) {
        j.f((Object)e2, (String)"call");
    }

    public void b(e e2, IOException iOException) {
        j.f((Object)e2, (String)"call");
        j.f((Object)iOException, (String)"ioe");
    }

    public void c(e e2) {
        j.f((Object)e2, (String)"call");
    }

    public void d(e e2) {
        j.f((Object)e2, (String)"call");
    }

    public void e(e e2, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a02) {
        j.f((Object)e2, (String)"call");
        j.f((Object)inetSocketAddress, (String)"inetSocketAddress");
        j.f((Object)proxy, (String)"proxy");
    }

    public void f(e e2, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a02, IOException iOException) {
        j.f((Object)e2, (String)"call");
        j.f((Object)inetSocketAddress, (String)"inetSocketAddress");
        j.f((Object)proxy, (String)"proxy");
        j.f((Object)iOException, (String)"ioe");
    }

    public void g(e e2, InetSocketAddress inetSocketAddress, Proxy proxy) {
        j.f((Object)e2, (String)"call");
        j.f((Object)inetSocketAddress, (String)"inetSocketAddress");
        j.f((Object)proxy, (String)"proxy");
    }

    public void h(e e2, i i2) {
        j.f((Object)e2, (String)"call");
        j.f((Object)i2, (String)"connection");
    }

    public void i(e e2, i i2) {
        j.f((Object)e2, (String)"call");
        j.f((Object)i2, (String)"connection");
    }

    public void j(e e2, String string, List<InetAddress> list) {
        j.f((Object)e2, (String)"call");
        j.f((Object)string, (String)"domainName");
        j.f(list, (String)"inetAddressList");
    }

    public void k(e e2, String string) {
        j.f((Object)e2, (String)"call");
        j.f((Object)string, (String)"domainName");
    }

    public void l(e e2, v v2, List<Proxy> list) {
        j.f((Object)e2, (String)"call");
        j.f((Object)v2, (String)"url");
        j.f(list, (String)"proxies");
    }

    public void m(e e2, v v2) {
        j.f((Object)e2, (String)"call");
        j.f((Object)v2, (String)"url");
    }

    public void n(e e2, long l2) {
        j.f((Object)e2, (String)"call");
    }

    public void o(e e2) {
        j.f((Object)e2, (String)"call");
    }

    public void p(e e2, IOException iOException) {
        j.f((Object)e2, (String)"call");
        j.f((Object)iOException, (String)"ioe");
    }

    public void q(e e2, b0 b02) {
        j.f((Object)e2, (String)"call");
        j.f((Object)b02, (String)"request");
    }

    public void r(e e2) {
        j.f((Object)e2, (String)"call");
    }

    public void s(e e2, long l2) {
        j.f((Object)e2, (String)"call");
    }

    public void t(e e2) {
        j.f((Object)e2, (String)"call");
    }

    public void u(e e2, IOException iOException) {
        j.f((Object)e2, (String)"call");
        j.f((Object)iOException, (String)"ioe");
    }

    public void v(e e2, d0 d02) {
        j.f((Object)e2, (String)"call");
        j.f((Object)d02, (String)"response");
    }

    public void w(e e2) {
        j.f((Object)e2, (String)"call");
    }

    public void x(e e2, t t2) {
        j.f((Object)e2, (String)"call");
    }

    public void y(e e2) {
        j.f((Object)e2, (String)"call");
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g2) {
            this();
        }
    }

    public static interface c {
        public r a(e var1);
    }

}


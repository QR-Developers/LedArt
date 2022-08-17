/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.g0
 *  a8.g0$a
 *  a8.h
 *  a8.h$b
 *  a8.k$a
 *  a8.k$b
 *  b8.b
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.List
 *  java.util.Objects
 *  javax.net.ssl.SSLSocket
 *  k7.k
 *  l7.a
 *  u7.g
 *  u7.j
 */
package a8;

import a8.g0;
import a8.h;
import a8.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import u7.g;
import u7.j;

/*
 * Exception performing whole class analysis.
 */
public final class k {
    private static final h[] e;
    private static final h[] f;
    public static final k g;
    public static final k h;
    private final boolean a;
    private final boolean b;
    private final String[] c;
    private final String[] d;

    static {
        new /* Unavailable Anonymous Inner Class!! */;
        h h2 = h.q;
        h h3 = h.r;
        h h4 = h.s;
        h h5 = h.k;
        h h6 = h.m;
        h h7 = h.l;
        h h8 = h.n;
        h h9 = h.p;
        h h10 = h.o;
        Object[] arrobject = new h[]{h2, h3, h4, h5, h6, h7, h8, h9, h10};
        e = arrobject;
        Object[] arrobject2 = new h[]{h2, h3, h4, h5, h6, h7, h8, h9, h10, h.i, h.j, h.g, h.h, h.e, h.f, h.d};
        f = arrobject2;
        a a2 = new /* Unavailable Anonymous Inner Class!! */.b((h[])Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
        g0 g02 = g0.b;
        g0 g03 = g0.c;
        g0[] arrg0 = new g0[]{g02, g03};
        a2.e(arrg0).d(true).a();
        g = new /* Unavailable Anonymous Inner Class!! */.b((h[])Arrays.copyOf((Object[])arrobject2, (int)arrobject2.length)).e(new g0[]{g02, g03}).d(true).a();
        a a3 = new /* Unavailable Anonymous Inner Class!! */.b((h[])Arrays.copyOf((Object[])arrobject2, (int)arrobject2.length));
        g0[] arrg02 = new g0[]{g02, g03, g0.d, g0.e};
        a3.e(arrg02).d(true).a();
        h = new /* Unavailable Anonymous Inner Class!! */.a();
    }

    public k(boolean bl, boolean bl2, String[] arrstring, String[] arrstring2) {
        this.a = bl;
        this.b = bl2;
        this.c = arrstring;
        this.d = arrstring2;
    }

    public static final /* synthetic */ String[] a(k k2) {
        return k2.c;
    }

    public static final /* synthetic */ String[] b(k k2) {
        return k2.d;
    }

    private final k g(SSLSocket sSLSocket, boolean bl) {
        Object[] arrobject;
        Object[] arrobject2;
        if (this.c != null) {
            String[] arrstring = sSLSocket.getEnabledCipherSuites();
            j.b((Object)arrstring, (String)"sslSocket.enabledCipherSuites");
            arrobject = b8.b.B((String[])arrstring, (String[])this.c, (Comparator)h.t.c());
        } else {
            arrobject = sSLSocket.getEnabledCipherSuites();
        }
        if (this.d != null) {
            String[] arrstring = sSLSocket.getEnabledProtocols();
            j.b((Object)arrstring, (String)"sslSocket.enabledProtocols");
            arrobject2 = b8.b.B((String[])arrstring, (String[])this.d, (Comparator)l7.a.b());
        } else {
            arrobject2 = sSLSocket.getEnabledProtocols();
        }
        String[] arrstring = sSLSocket.getSupportedCipherSuites();
        j.b((Object)arrstring, (String)"supportedCipherSuites");
        int n2 = b8.b.u((String[])arrstring, (String)"TLS_FALLBACK_SCSV", (Comparator)h.t.c());
        if (bl && n2 != -1) {
            j.b((Object)arrobject, (String)"cipherSuitesIntersection");
            String string = arrstring[n2];
            j.b((Object)string, (String)"supportedCipherSuites[indexOfFallbackScsv]");
            arrobject = b8.b.l((String[])arrobject, (String)string);
        }
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        j.b((Object)arrobject, (String)"cipherSuitesIntersection");
        a a3 = a2.c((String[])Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
        j.b((Object)arrobject2, (String)"tlsVersionsIntersection");
        return a3.f((String[])Arrays.copyOf((Object[])arrobject2, (int)arrobject2.length)).a();
    }

    public final void c(SSLSocket sSLSocket, boolean bl) {
        j.f((Object)sSLSocket, (String)"sslSocket");
        k k2 = this.g(sSLSocket, bl);
        if (k2.i() != null) {
            sSLSocket.setEnabledProtocols(k2.d);
        }
        if (k2.d() != null) {
            sSLSocket.setEnabledCipherSuites(k2.c);
        }
    }

    public final List<h> d() {
        String[] arrstring = this.c;
        if (arrstring != null) {
            ArrayList arrayList = new ArrayList(arrstring.length);
            for (String string : arrstring) {
                arrayList.add((Object)h.t.b(string));
            }
            return k7.k.A((Iterable)arrayList);
        }
        return null;
    }

    public final boolean e(SSLSocket sSLSocket) {
        j.f((Object)sSLSocket, (String)"socket");
        if (!this.a) {
            return false;
        }
        String[] arrstring = this.d;
        if (arrstring != null && !b8.b.r((String[])arrstring, (String[])sSLSocket.getEnabledProtocols(), (Comparator)l7.a.b())) {
            return false;
        }
        String[] arrstring2 = this.c;
        return arrstring2 == null || b8.b.r((String[])arrstring2, (String[])sSLSocket.getEnabledCipherSuites(), (Comparator)h.t.c());
    }

    public boolean equals(Object object) {
        if (!(object instanceof k)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        boolean bl = this.a;
        k k2 = (k)object;
        if (bl != k2.a) {
            return false;
        }
        if (bl) {
            if (!Arrays.equals((Object[])this.c, (Object[])k2.c)) {
                return false;
            }
            if (!Arrays.equals((Object[])this.d, (Object[])k2.d)) {
                return false;
            }
            if (this.b != k2.b) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        if (this.a) {
            Object[] arrobject = this.c;
            int n2 = arrobject != null ? Arrays.hashCode((Object[])arrobject) : 0;
            int n3 = 31 * (527 + n2);
            Object[] arrobject2 = this.d;
            int n4 = 0;
            if (arrobject2 != null) {
                n4 = Arrays.hashCode((Object[])arrobject2);
            }
            return 31 * (n3 + n4) + (true ^ this.b);
        }
        return 17;
    }

    public final List<g0> i() {
        String[] arrstring = this.d;
        if (arrstring != null) {
            ArrayList arrayList = new ArrayList(arrstring.length);
            for (String string : arrstring) {
                arrayList.add((Object)g0.h.a(string));
            }
            return k7.k.A((Iterable)arrayList);
        }
        return null;
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConnectionSpec(");
        stringBuilder.append("cipherSuites=");
        stringBuilder.append(Objects.toString(this.d(), (String)"[all enabled]"));
        stringBuilder.append(", ");
        stringBuilder.append("tlsVersions=");
        stringBuilder.append(Objects.toString(this.i(), (String)"[all enabled]"));
        stringBuilder.append(", ");
        stringBuilder.append("supportsTlsExtensions=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


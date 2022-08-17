/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSession
 */
package b1;

import b1.c;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class b
implements HostnameVerifier {
    public static final /* synthetic */ b a;

    static /* synthetic */ {
        a = new b();
    }

    private /* synthetic */ b() {
    }

    public final boolean verify(String string2, SSLSession sSLSession) {
        return c.a.a(string2, sSLSession);
    }
}


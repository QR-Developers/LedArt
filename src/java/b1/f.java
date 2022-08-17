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

import b1.g;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class f
implements HostnameVerifier {
    public static final /* synthetic */ f a;

    static /* synthetic */ {
        a = new f();
    }

    private /* synthetic */ f() {
    }

    public final boolean verify(String string2, SSLSession sSLSession) {
        return g.a(string2, sSLSession);
    }
}


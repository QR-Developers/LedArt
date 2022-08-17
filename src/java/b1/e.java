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

public final class e
implements HostnameVerifier {
    public static final /* synthetic */ e a;

    static /* synthetic */ {
        a = new e();
    }

    private /* synthetic */ e() {
    }

    public final boolean verify(String string2, SSLSession sSLSession) {
        return c.c.a(string2, sSLSession);
    }
}


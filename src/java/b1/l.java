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

import b1.m;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class l
implements HostnameVerifier {
    public static final /* synthetic */ l a;

    static /* synthetic */ {
        a = new l();
    }

    private /* synthetic */ l() {
    }

    public final boolean verify(String string2, SSLSession sSLSession) {
        return m.a(string2, sSLSession);
    }
}


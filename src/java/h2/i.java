/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h2.j
 *  java.lang.Object
 *  java.lang.String
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSession
 */
package h2;

import h2.j;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class i
implements HostnameVerifier {
    public static final /* synthetic */ i a;

    static /* synthetic */ {
        a = new i();
    }

    private /* synthetic */ i() {
    }

    public final boolean verify(String string, SSLSession sSLSession) {
        return j.a((String)string, (SSLSession)sSLSession);
    }
}


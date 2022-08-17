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

import b1.i;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class h
implements HostnameVerifier {
    public static final /* synthetic */ h a;

    static /* synthetic */ {
        a = new h();
    }

    private /* synthetic */ h() {
    }

    public final boolean verify(String string2, SSLSession sSLSession) {
        return i.a(string2, sSLSession);
    }
}


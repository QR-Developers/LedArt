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

import b1.k;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class j
implements HostnameVerifier {
    public static final /* synthetic */ j a;

    static /* synthetic */ {
        a = new j();
    }

    private /* synthetic */ j() {
    }

    public final boolean verify(String string2, SSLSession sSLSession) {
        return k.a(string2, sSLSession);
    }
}


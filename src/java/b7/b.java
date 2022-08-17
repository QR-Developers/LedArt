/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.wifi.WifiConfiguration
 *  b7.c
 *  java.lang.Object
 *  java.util.Comparator
 */
package b7;

import android.net.wifi.WifiConfiguration;
import b7.c;
import java.util.Comparator;

public final class b
implements Comparator {
    public static final /* synthetic */ b a;

    static /* synthetic */ {
        a = new b();
    }

    private /* synthetic */ b() {
    }

    public final int compare(Object object, Object object2) {
        return c.a((WifiConfiguration)((WifiConfiguration)object), (WifiConfiguration)((WifiConfiguration)object2));
    }
}


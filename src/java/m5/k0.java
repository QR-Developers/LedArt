/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.wifi.WifiConfiguration
 *  java.lang.Object
 *  java.util.Comparator
 */
package m5;

import android.net.wifi.WifiConfiguration;
import java.util.Comparator;
import m5.l0;

public final class k0
implements Comparator {
    public static final /* synthetic */ k0 a;

    static /* synthetic */ {
        a = new k0();
    }

    private /* synthetic */ k0() {
    }

    public final int compare(Object object, Object object2) {
        return l0.a((WifiConfiguration)object, (WifiConfiguration)object2);
    }
}


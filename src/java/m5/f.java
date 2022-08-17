/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Class
 *  java.lang.Object
 */
package m5;

import android.os.SystemClock;

public class f {
    private static volatile f b;
    private long a = 0L;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f b() {
        if (b != null) return b;
        Class<f> class_ = f.class;
        synchronized (f.class) {
            if (b != null) return b;
            b = new f();
            // ** MonitorExit[var1] (shouldn't be in output)
            return b;
        }
    }

    public boolean a() {
        long l3;
        long l5 = SystemClock.elapsedRealtime();
        if (l5 >= (l3 = this.a) && l5 - l3 <= 1000L) {
            return false;
        }
        this.a = l5;
        return true;
    }
}


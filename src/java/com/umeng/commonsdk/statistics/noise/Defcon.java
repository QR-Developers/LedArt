/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.umeng.commonsdk.framework.UMEnvelopeBuild
 *  com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a
 *  com.umeng.commonsdk.statistics.internal.d
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.d;

public class Defcon
implements d {
    private static final int LEVEL_0 = 0;
    private static final int LEVEL_1 = 1;
    private static final int LEVEL_2 = 2;
    private static final int LEVEL_3 = 3;
    private static final long MILLIS_24_HOURS = 86400000L;
    private static final long MILLIS_4_HOURS = 14400000L;
    private static final long MILLIS_8_HOURS = 28800000L;
    private static Defcon instanse;
    private int mLevel = 0;

    private Defcon() {
    }

    public static Defcon getService(Context context) {
        Class<Defcon> class_ = Defcon.class;
        synchronized (Defcon.class) {
            if (instanse == null) {
                instanse = new Defcon();
                String string = UMEnvelopeBuild.imprintProperty((Context)context, (String)"defcon", (String)"0");
                instanse.setLevel(Integer.valueOf((String)string));
            }
            Defcon defcon = instanse;
            // ** MonitorExit[var4_1] (shouldn't be in output)
            return defcon;
        }
    }

    public int getLevel() {
        return this.mLevel;
    }

    public long getReqInterval() {
        int n2 = this.mLevel;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return 0L;
                }
                return 86400000L;
            }
            return 28800000L;
        }
        return 14400000L;
    }

    public long getRetryInterval() {
        if (this.mLevel == 0) {
            return 0L;
        }
        return 300000L;
    }

    public boolean isOpen() {
        return this.mLevel != 0;
    }

    public void onImprintChanged(ImprintHandler.a a3) {
        this.setLevel(Integer.valueOf((String)a3.a("defcon", String.valueOf((int)0))));
    }

    public void setLevel(int n2) {
        if (n2 >= 0 && n2 <= 3) {
            this.mLevel = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.umeng.commonsdk.internal.crash.UMCrashManager
 *  com.umeng.commonsdk.statistics.AnalyticsConstants
 *  com.umeng.commonsdk.statistics.common.DeviceConfig
 *  com.umeng.commonsdk.statistics.idtracking.a
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.a;

public class g
extends a {
    private static final String a = "mac";
    private Context b;

    public g(Context context) {
        super(a);
        this.b = context;
    }

    public String f() {
        try {
            String string = DeviceConfig.getMac((Context)this.b);
            return string;
        }
        catch (Exception exception) {
            if (AnalyticsConstants.UM_DEBUG) {
                exception.printStackTrace();
            }
            UMCrashManager.reportCrash((Context)this.b, (Throwable)exception);
            return null;
        }
    }
}


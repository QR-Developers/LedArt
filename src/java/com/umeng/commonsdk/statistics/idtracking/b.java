/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.umeng.commonsdk.statistics.common.DeviceConfig
 *  com.umeng.commonsdk.statistics.idtracking.a
 *  java.lang.String
 */
package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.a;

public class b
extends a {
    private static final String a = "android_id";
    private Context b;

    public b(Context context) {
        super(a);
        this.b = context;
    }

    public String f() {
        return DeviceConfig.getAndroidId((Context)this.b);
    }
}


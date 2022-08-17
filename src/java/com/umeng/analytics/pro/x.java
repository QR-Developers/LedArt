/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  com.umeng.analytics.AnalyticsConfig
 *  com.umeng.analytics.pro.w
 *  com.umeng.commonsdk.statistics.internal.PreferenceWrapper
 *  com.umeng.commonsdk.utils.UMUtils
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.w;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

class x
implements w {
    private long a = AnalyticsConfig.kContinueSessionMillis;

    x() {
    }

    public long a() {
        return this.a;
    }

    public String a(Context context) {
        String string = UMUtils.getAppkey((Context)context);
        long l2 = System.currentTimeMillis();
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l2);
            stringBuilder.append(string);
            stringBuilder.append("02:00:00:00:00:00");
            return UMUtils.MD5((String)stringBuilder.toString());
        }
        throw new RuntimeException("Appkey is null or empty, Please check!");
    }

    public void a(long l2) {
        this.a = l2;
    }

    public void a(Context context, String string) {
        long l2 = System.currentTimeMillis();
        try {
            SharedPreferences.Editor editor = PreferenceWrapper.getDefault((Context)context).edit();
            editor.putString("session_id", string);
            editor.putLong("session_end_time", 0L);
            editor.putLong("a_start_time", l2);
            editor.putLong("a_end_time", 0L);
            editor.commit();
        }
        catch (Exception exception) {}
    }

    public boolean a(long l2, long l3) {
        long l4 = System.currentTimeMillis();
        if (l2 != 0L && l4 - l2 < this.a) {
            return false;
        }
        return l3 > 0L && l4 - l3 > this.a;
    }
}


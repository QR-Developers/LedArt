/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.umeng.analytics.CoreProtocol$1
 *  com.umeng.analytics.CoreProtocol$a
 *  com.umeng.analytics.pro.o
 *  com.umeng.commonsdk.framework.UMLogDataProtocol
 *  com.umeng.commonsdk.framework.UMSenderStateNotify
 *  java.lang.Object
 *  org.json.JSONObject
 */
package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

/*
 * Exception performing whole class analysis ignored.
 */
public class CoreProtocol
implements UMLogDataProtocol,
UMSenderStateNotify {
    private static Context a;

    static {
    }

    private CoreProtocol() {
    }

    public static CoreProtocol getInstance(Context context) {
        if (a == null && context != null) {
            a = context.getApplicationContext();
        }
        return a.a();
    }

    public void onConnectionAvailable() {
        o.a((Context)a).a();
    }

    public void onSenderIdle() {
        o.a((Context)a).b();
    }

    public void removeCacheData(Object object) {
        o.a((Context)a).a(object);
    }

    public JSONObject setupReportData(long l2) {
        return o.a((Context)a).a(l2);
    }

    public void workEvent(Object object, int n) {
        o.a((Context)a).a(object, n);
    }
}


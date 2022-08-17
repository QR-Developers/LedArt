/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.util.Log
 *  com.umeng.analytics.pro.a
 *  com.umeng.analytics.pro.ab$1
 *  com.umeng.analytics.pro.z
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 */
package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.umeng.analytics.pro.a;
import com.umeng.analytics.pro.ab;
import com.umeng.analytics.pro.z;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ab
implements z {
    private static final String a = "Coolpad";
    private static final String b = "com.coolpad.deviceidsupport";
    private static final String c = "com.coolpad.deviceidsupport.DeviceIdService";
    private static a d;
    private String e = "";
    private CountDownLatch f;
    private Context g;
    private final ServiceConnection h = new 1(this);

    static /* synthetic */ Context a(ab ab2) {
        return ab2.g;
    }

    static /* synthetic */ a a() {
        return d;
    }

    static /* synthetic */ a a(a a3) {
        d = a3;
        return a3;
    }

    static /* synthetic */ String a(ab ab2, String string) {
        ab2.e = string;
        return string;
    }

    static /* synthetic */ String b(ab ab2) {
        return ab2.e;
    }

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(b, c));
            if (!context.bindService(intent, this.h, 1)) {
                Log.e((String)a, (String)"bindService return false");
                return;
            }
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bindService failed. e=");
            stringBuilder.append(throwable.getMessage());
            Log.e((String)a, (String)stringBuilder.toString());
            this.f.countDown();
        }
    }

    static /* synthetic */ CountDownLatch c(ab ab2) {
        return ab2.f;
    }

    private void c(Context context) {
        try {
            Log.d((String)a, (String)"call unbindService.");
            context.unbindService(this.h);
            return;
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unbindService failed. e=");
            stringBuilder.append(throwable.getMessage());
            Log.e((String)a, (String)stringBuilder.toString());
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public String a(Context context) {
        Throwable throwable2222;
        if (context == null) {
            return null;
        }
        this.g = context.getApplicationContext();
        this.f = new CountDownLatch(1);
        this.b(context);
        if (!this.f.await(500L, TimeUnit.MILLISECONDS)) {
            Log.e((String)a, (String)"getOAID time-out");
        }
        String string = this.e;
        this.c(context);
        return string;
        {
            catch (Throwable throwable2222) {
            }
            catch (InterruptedException interruptedException) {}
            {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getOAID interrupted. e=");
                stringBuilder.append(interruptedException.getMessage());
                Log.e((String)a, (String)stringBuilder.toString());
            }
            this.c(context);
            return null;
        }
        this.c(context);
        throw throwable2222;
    }
}


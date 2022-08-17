/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.util.Log
 *  com.umeng.analytics.pro.ag$1
 *  com.umeng.analytics.pro.z
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 */
package com.umeng.analytics.pro;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.umeng.analytics.pro.ag;
import com.umeng.analytics.pro.z;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ag
implements z {
    private static final String a = "DeviceIdService";
    private static final String b = "com.samsung.android.deviceidservice";
    private static final String c = "com.samsung.android.deviceidservice.DeviceIdService";
    private String d = "";
    private CountDownLatch e;
    private final ServiceConnection f = new 1(this);

    static /* synthetic */ String a(ag ag2, String string) {
        ag2.d = string;
        return string;
    }

    static /* synthetic */ CountDownLatch a(ag ag2) {
        return ag2.e;
    }

    private void b(Context context) {
        void var3_5;
        try {
            Intent intent = new Intent();
            intent.setClassName(b, c);
            if (context.bindService(intent, this.f, 1)) {
                return;
            }
            throw new UnsupportedOperationException("not supported service");
        }
        catch (Error error) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bindService failed. e=");
        stringBuilder.append(var3_5.getMessage());
        Log.e((String)a, (String)stringBuilder.toString());
        this.e.countDown();
    }

    private void c(Context context) {
        void var2_4;
        try {
            context.unbindService(this.f);
            return;
        }
        catch (Error error) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unbindService failed. e=");
        stringBuilder.append(var2_4.getMessage());
        Log.e((String)a, (String)stringBuilder.toString());
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
        this.e = new CountDownLatch(1);
        this.b(context);
        if (!this.e.await(500L, TimeUnit.MILLISECONDS)) {
            Log.e((String)a, (String)"getOAID time-out");
        }
        String string = this.d;
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


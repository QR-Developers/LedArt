/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  com.umeng.commonsdk.debug.UMRTLog
 *  com.umeng.commonsdk.framework.UMEnvelopeBuild
 *  com.umeng.commonsdk.framework.UMFrUtils
 *  com.umeng.commonsdk.framework.UMModuleRegister
 *  com.umeng.commonsdk.framework.UMSenderStateNotify
 *  com.umeng.commonsdk.framework.a$1
 *  com.umeng.commonsdk.framework.a$2
 *  com.umeng.commonsdk.framework.a$a
 *  com.umeng.commonsdk.internal.crash.UMCrashManager
 *  com.umeng.commonsdk.statistics.c
 *  com.umeng.commonsdk.statistics.common.DeviceConfig
 *  com.umeng.commonsdk.statistics.common.ULog
 *  com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
 *  java.io.File
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.concurrent.locks.ReentrantLock
 */
package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import com.umeng.commonsdk.framework.a;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Exception performing whole class analysis.
 */
class a
implements UMImprintChangeCallback {
    private static HandlerThread a;
    private static Handler b;
    private static Handler c;
    private static final int d = 200;
    private static final int e = 273;
    private static final int f = 274;
    private static final int g = 512;
    private static final int h = 769;
    private static a i;
    private static ConnectivityManager j;
    private static NetworkInfo k;
    private static IntentFilter l;
    private static boolean m = false;
    private static ArrayList<UMSenderStateNotify> n;
    private static Object o;
    private static ReentrantLock p;
    private static final String q = "report_policy";
    private static final String r = "report_interval";
    private static boolean s = false;
    private static final int t = 15;
    private static final int u = 3;
    private static final int v = 90;
    private static int w;
    private static Object x;
    private static BroadcastReceiver y;

    static {
        o = new Object();
        p = new ReentrantLock();
        s = false;
        w = 15;
        x = new Object();
        y = new 1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a(Context context, Handler handler) {
        Context context2 = UMModuleRegister.getAppContext();
        j = (ConnectivityManager)context2.getSystemService("connectivity");
        c = handler;
        try {
            HandlerThread handlerThread;
            if (a != null) return;
            a = handlerThread = new HandlerThread("NetWorkSender");
            handlerThread.start();
            if (i == null) {
                a a3;
                i = a3 = new /* Unavailable Anonymous Inner Class!! */;
                a3.startWatching();
                ULog.d((String)"--->>> FileMonitor has already started!");
            }
            if (DeviceConfig.checkPermission((Context)context2, (String)"android.permission.ACCESS_NETWORK_STATE") && j != null && l == null) {
                IntentFilter intentFilter;
                l = intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                BroadcastReceiver broadcastReceiver = y;
                if (broadcastReceiver != null) {
                    context2.registerReceiver(broadcastReceiver, l);
                }
            }
            this.n();
            if (b == null) {
                b = new 2(this, a.getLooper());
            }
            ImprintHandler.getImprintService(context).registImprintCallback(q, this);
            ImprintHandler.getImprintService(context).registImprintCallback(r, this);
            return;
        }
        catch (Throwable throwable) {
            UMCrashManager.reportCrash((Context)context, (Throwable)throwable);
        }
    }

    static /* synthetic */ NetworkInfo a(NetworkInfo networkInfo) {
        k = networkInfo;
        return networkInfo;
    }

    static /* synthetic */ void a(int n2) {
        a.c(n2);
    }

    private static void a(int n2, int n3) {
        Handler handler;
        if (m && (handler = b) != null) {
            handler.removeMessages(n2);
            Message message = b.obtainMessage();
            message.what = n2;
            b.sendMessageDelayed(message, (long)n3);
        }
    }

    private static void a(int n2, long l2) {
        Handler handler;
        if (m && (handler = b) != null) {
            Message message = handler.obtainMessage();
            message.what = n2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("--->>> sendMsgDelayed: ");
            stringBuilder.append(l2);
            UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
            b.sendMessageDelayed(message, l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void a(UMSenderStateNotify uMSenderStateNotify) {
        Object object;
        Object object2 = object = o;
        // MONITORENTER : object2
        try {
            if (n == null) {
                n = new ArrayList();
            }
            if (uMSenderStateNotify == null) return;
            {
                for (int i2 = 0; i2 < n.size(); ++i2) {
                    if (uMSenderStateNotify != n.get(i2)) continue;
                    UMRTLog.i((String)"MobclickRT", (String)"--->>> addConnStateObserver: input item has exist.");
                    // MONITOREXIT : object2
                    return;
                }
                n.add((Object)uMSenderStateNotify);
                return;
            }
        }
        catch (Throwable throwable) {
            UMCrashManager.reportCrash((Context)UMModuleRegister.getAppContext(), (Throwable)throwable);
            // MONITOREXIT : object2
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a() {
        Object object;
        Object object2 = object = x;
        synchronized (object2) {
            return s;
        }
    }

    static /* synthetic */ boolean a(boolean bl2) {
        m = bl2;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int b() {
        Object object;
        Object object2 = object = x;
        synchronized (object2) {
            return w;
        }
    }

    private static void b(int n2) {
        Handler handler;
        if (m && (handler = b) != null && !handler.hasMessages(n2)) {
            Message message = b.obtainMessage();
            message.what = n2;
            b.sendMessage(message);
        }
    }

    public static void c() {
    }

    private static void c(int n2) {
        Handler handler;
        if (m && (handler = b) != null) {
            Message message = handler.obtainMessage();
            message.what = n2;
            b.sendMessage(message);
        }
    }

    public static void d() {
        if (p.tryLock()) {
            try {
                a.b(273);
                return;
            }
            finally {
                p.unlock();
            }
        }
    }

    public static void e() {
        a.a(274, 3000);
    }

    static /* synthetic */ ConnectivityManager f() {
        return j;
    }

    static /* synthetic */ NetworkInfo g() {
        return k;
    }

    static /* synthetic */ Object h() {
        return o;
    }

    static /* synthetic */ ArrayList i() {
        return n;
    }

    static /* synthetic */ ReentrantLock j() {
        return p;
    }

    static /* synthetic */ void k() {
        a.r();
    }

    static /* synthetic */ void l() {
        a.q();
    }

    static /* synthetic */ void m() {
        a.p();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        Object object;
        Object object2 = object = x;
        synchronized (object2) {
            if ("11".equals((Object)UMEnvelopeBuild.imprintProperty((Context)UMModuleRegister.getAppContext(), (String)q, (String)""))) {
                UMRTLog.i((String)"MobclickRT", (String)"--->>> switch to report_policy 11");
                s = true;
                w = 15;
                int n2 = Integer.valueOf((String)UMEnvelopeBuild.imprintProperty((Context)UMModuleRegister.getAppContext(), (String)r, (String)"15"));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--->>> set report_interval value to: ");
                stringBuilder.append(n2);
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                w = n2 >= 3 && n2 <= 90 ? n2 * 1000 : 15;
            } else {
                s = false;
            }
            return;
        }
    }

    private static void o() {
        if (a != null) {
            a = null;
        }
        if (b != null) {
            b = null;
        }
        if (c != null) {
            c = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void p() {
        Object object;
        Object object2 = object = o;
        synchronized (object2) {
            int n2;
            ArrayList<UMSenderStateNotify> arrayList = n;
            if (arrayList != null && (n2 = arrayList.size()) > 0) {
                for (int i2 = 0; i2 < n2; ++i2) {
                    ((UMSenderStateNotify)n.get(i2)).onSenderIdle();
                }
            }
            return;
        }
    }

    private static void q() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void r() {
        ULog.d((String)"--->>> handleProcessNext: Enter...");
        if (!m) {
            return;
        }
        Context context = UMModuleRegister.getAppContext();
        try {
            if (UMFrUtils.envelopeFileNumber((Context)context) > 0) {
                File file;
                ULog.d((String)"--->>> The envelope file exists.");
                if (UMFrUtils.envelopeFileNumber((Context)context) > 200) {
                    ULog.d((String)"--->>> Number of envelope files is greater than 200, remove old files first.");
                    UMFrUtils.removeRedundantEnvelopeFiles((Context)context, (int)200);
                }
                if ((file = UMFrUtils.getEnvelopeFile((Context)context)) != null) {
                    String string = file.getPath();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("--->>> Ready to send envelope file [");
                    stringBuilder.append(string);
                    stringBuilder.append("].");
                    ULog.d((String)stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("--->>> send envelope file [ ");
                    stringBuilder2.append(string);
                    stringBuilder2.append("].");
                    UMRTLog.i((String)"MobclickRT", (String)stringBuilder2.toString());
                    if (!new c(context).a(file)) {
                        ULog.d((String)"--->>> Send envelope file failed, abandon and wait next trigger!");
                        return;
                    }
                    ULog.d((String)"--->>> Send envelope file success, delete it.");
                    if (!UMFrUtils.removeEnvelopeFile((File)file)) {
                        ULog.d((String)"--->>> Failed to delete already processed file. We try again after delete failed.");
                        UMFrUtils.removeEnvelopeFile((File)file);
                    }
                    a.c(273);
                    return;
                }
            }
            a.e();
            return;
        }
        catch (Throwable throwable) {
            UMCrashManager.reportCrash((Context)context, (Throwable)throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onImprintValueChanged(String string, String string2) {
        Object object;
        Object object2 = object = x;
        synchronized (object2) {
            if (q.equals((Object)string)) {
                if ("11".equals((Object)string2)) {
                    UMRTLog.i((String)"MobclickRT", (String)"--->>> switch to report_policy 11");
                    s = true;
                } else {
                    s = false;
                }
            }
            if (r.equals((Object)string)) {
                int n2 = Integer.valueOf((String)string2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--->>> set report_interval value to: ");
                stringBuilder.append(n2);
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                w = n2 >= 3 && n2 <= 90 ? n2 * 1000 : 15000;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("--->>> really set report_interval value to: ");
                stringBuilder2.append(w);
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder2.toString());
            }
            return;
        }
    }
}


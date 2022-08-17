/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package com.zui.opendeviceidlibrary;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.zui.deviceidservice.IDeviceidInterface;
import java.util.Objects;

public class OpenDeviceId {
    private static boolean DBG = false;
    private static String TAG = "OpenDeviceId library";
    private CallBack mCallerCallBack = null;
    private ServiceConnection mConnection;
    private Context mContext = null;
    private IDeviceidInterface mDeviceidInterface;

    private void logPrintE(String string2) {
        if (DBG) {
            Log.e((String)TAG, (String)string2);
        }
    }

    private void logPrintI(String string2) {
        if (DBG) {
            Log.i((String)TAG, (String)string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getAAID() {
        Context context = this.mContext;
        if (context == null) {
            this.logPrintI("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        String string2 = context.getPackageName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("liufeng, getAAID package\uff1a");
        stringBuilder.append(string2);
        this.logPrintI(stringBuilder.toString());
        String string3 = null;
        if (string2 != null && !string2.equals((Object)"")) {
            try {
                IDeviceidInterface iDeviceidInterface = this.mDeviceidInterface;
                string3 = null;
                if (iDeviceidInterface == null) return string3;
                string3 = iDeviceidInterface.getAAID(string2);
                if (string3 != null) {
                    if (!"".equals((Object)string3)) return string3;
                }
                if (!this.mDeviceidInterface.createAAIDForPackageName(string2)) return string3;
                return this.mDeviceidInterface.getAAID(string2);
            }
            catch (RemoteException remoteException) {
                this.logPrintE("getAAID error, RemoteException!");
                return string3;
            }
        }
        this.logPrintI("input package is null!");
        return string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getOAID() {
        if (this.mContext != null) {
            IDeviceidInterface iDeviceidInterface = this.mDeviceidInterface;
            if (iDeviceidInterface == null) return null;
            try {
                return iDeviceidInterface.getOAID();
            }
            catch (RemoteException remoteException) {
                this.logPrintE("getOAID error, RemoteException!");
                remoteException.printStackTrace();
            }
            return null;
        }
        this.logPrintE("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getUDID() {
        if (this.mContext != null) {
            IDeviceidInterface iDeviceidInterface = this.mDeviceidInterface;
            if (iDeviceidInterface == null) return null;
            try {
                return iDeviceidInterface.getUDID();
            }
            catch (Exception exception) {
                this.logPrintE("getUDID error, Exception!");
                exception.printStackTrace();
                return null;
            }
            catch (RemoteException remoteException) {
                this.logPrintE("getUDID error, RemoteException!");
                remoteException.printStackTrace();
            }
            return null;
        }
        this.logPrintE("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getVAID() {
        Context context = this.mContext;
        if (context != null) {
            String string2 = context.getPackageName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("liufeng, getVAID package\uff1a");
            stringBuilder.append(string2);
            this.logPrintI(stringBuilder.toString());
            if (string2 != null && !string2.equals((Object)"")) {
                IDeviceidInterface iDeviceidInterface;
                try {
                    iDeviceidInterface = this.mDeviceidInterface;
                    if (iDeviceidInterface == null) return null;
                }
                catch (RemoteException remoteException) {
                    this.logPrintE("getVAID error, RemoteException!");
                    remoteException.printStackTrace();
                    return null;
                }
                return iDeviceidInterface.getVAID(string2);
            } else {
                this.logPrintI("input package is null!");
            }
            return null;
        }
        this.logPrintI("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public int init(Context context, CallBack<String> callBack) {
        Objects.requireNonNull((Object)context, (String)"Context can not be null.");
        this.mContext = context;
        this.mCallerCallBack = callBack;
        this.mConnection = new ServiceConnection(){

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                1 var5_3 = this;
                synchronized (var5_3) {
                    OpenDeviceId.this.mDeviceidInterface = IDeviceidInterface.Stub.asInterface(iBinder);
                    if (OpenDeviceId.this.mCallerCallBack != null) {
                        OpenDeviceId.this.mCallerCallBack.serviceConnected("Deviceid Service Connected", OpenDeviceId.this);
                    }
                    OpenDeviceId.this.logPrintI("Service onServiceConnected");
                    return;
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                OpenDeviceId.this.mDeviceidInterface = null;
                OpenDeviceId.this.logPrintI("Service onServiceDisconnected");
            }
        };
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.mContext.bindService(intent, this.mConnection, 1)) {
            this.logPrintI("bindService Successful!");
            return 1;
        }
        this.logPrintI("bindService Failed!");
        return -1;
    }

    public boolean isSupported() {
        boolean bl;
        block3 : {
            try {
                IDeviceidInterface iDeviceidInterface = this.mDeviceidInterface;
                bl = false;
                if (iDeviceidInterface == null) break block3;
            }
            catch (RemoteException remoteException) {
                this.logPrintE("isSupport error, RemoteException!");
                return false;
            }
            this.logPrintI("Device support opendeviceid");
            bl = this.mDeviceidInterface.isSupport();
        }
        return bl;
    }

    public void setLogEnable(boolean bl) {
        DBG = bl;
    }

    /*
     * Exception decompiling
     */
    public void shutdown() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl13 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:923)
        throw new IllegalStateException("Decompilation failed");
    }

    public static interface CallBack<T> {
        public void serviceConnected(T var1, OpenDeviceId var2);
    }

}


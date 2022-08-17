/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.wifi.WifiManager
 *  android.net.wifi.WifiManager$WifiLock
 *  android.os.IBinder
 *  androidx.annotation.Nullable
 *  com.huidu.applibs.entity.a
 *  com.huidu.applibs.entity.e
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.net.DatagramPacket
 *  java.net.DatagramSocket
 *  java.net.SocketException
 *  l5.b
 *  u5.b
 *  v5.a
 *  v5.b
 *  v5.c
 */
package com.huidu.applibs.service.imp;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.huidu.applibs.entity.e;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import u5.b;
import v5.c;

public class TickService
extends Service {
    private WifiManager.WifiLock a;
    private a b;
    private a c;
    private Thread d;
    private Thread e;

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        WifiManager wifiManager = (WifiManager)this.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            WifiManager.WifiLock wifiLock;
            this.a = wifiLock = wifiManager.createWifiLock("HuiduWifiLock");
            wifiLock.acquire();
        }
    }

    public void onDestroy() {
        a a2;
        super.onDestroy();
        WifiManager.WifiLock wifiLock = this.a;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.a.release();
        }
        if ((a2 = this.b) != null) {
            a2.d();
        }
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        Thread thread;
        Thread thread2;
        if (this.b == null || this.c == null) {
            try {
                this.b = new a((Context)this, (b)new c());
                this.c = new a((Context)this, (b)new v5.a());
            }
            catch (SocketException socketException) {
                socketException.printStackTrace();
            }
        }
        if ((thread = this.d) == null || !thread.isAlive()) {
            Thread thread3;
            this.d = thread3 = new Thread((Runnable)this.b);
            thread3.start();
        }
        if ((thread2 = this.e) == null || !thread2.isAlive()) {
            Thread thread4;
            this.e = thread4 = new Thread((Runnable)this.c);
            thread4.start();
        }
        return super.onStartCommand(intent, n2, n3);
    }

    private static class a
    implements Runnable {
        private boolean a = false;
        private DatagramSocket b;
        private DatagramPacket c;
        private ConnectivityManager d;
        private long e = 0L;
        private b f;

        public a(Context context, b b2) {
            DatagramSocket datagramSocket;
            this.f = b2;
            this.b = datagramSocket = new DatagramSocket();
            datagramSocket.setSoTimeout(2000);
            this.c = new DatagramPacket(new byte[1500], 1500);
            this.d = (ConnectivityManager)context.getSystemService("connectivity");
        }

        private void a() {
            if (v5.b.d() && this.f.a() == 0) {
                return;
            }
            if (this.b()) {
                this.e(this.f.b());
            }
            if (this.f.a() == 0) {
                v5.b.f();
            } else {
                v5.b.b();
            }
            this.e = System.currentTimeMillis();
        }

        @SuppressLint(value={"MissingPermission"})
        private boolean b() {
            block3 : {
                NetworkInfo networkInfo;
                try {
                    networkInfo = this.d.getNetworkInfo(1);
                    if (networkInfo == null) break block3;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return true;
                }
                boolean bl = networkInfo.isConnected();
                if (!bl) break block3;
                return true;
            }
            return false;
        }

        private void c(DatagramPacket datagramPacket) {
            e e2 = this.f.c(datagramPacket);
            if (e2 != null) {
                if (e2.f) {
                    DatagramPacket datagramPacket2;
                    com.huidu.applibs.entity.a a2 = l5.b.d().b(e2.d);
                    if (!(a2 != null && a2.isOnline() || (datagramPacket2 = e2.g) == null)) {
                        this.e(datagramPacket2);
                        return;
                    }
                    l5.b.d().e(e2);
                    return;
                }
                l5.b.d().e(e2);
                DatagramPacket datagramPacket3 = e2.g;
                if (datagramPacket3 != null) {
                    this.e(datagramPacket3);
                }
            }
        }

        private void e(DatagramPacket datagramPacket) {
            try {
                this.b.send(datagramPacket);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }

        public void d() {
            this.a = true;
            try {
                this.b.close();
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }

        /*
         * Exception decompiling
         */
        public void run() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl1 : ALOAD_0 : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
    }

}


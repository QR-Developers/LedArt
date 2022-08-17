/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a7.a
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.net.wifi.ScanResult
 *  android.net.wifi.WifiManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  b7.c
 *  b7.e
 *  b7.e$a
 *  b7.f
 *  b7.g
 *  b7.h
 *  b7.i
 *  b7.j
 *  b7.k
 *  b7.l
 *  c7.a
 *  c7.b
 *  c7.c
 *  com.thanosfisherman.wifiutils.wifiConnect.WifiConnectionReceiver
 *  com.thanosfisherman.wifiutils.wifiScan.WifiScanReceiver
 *  com.thanosfisherman.wifiutils.wifiState.WifiStateReceiver
 *  d7.a
 *  d7.b
 *  e7.a
 *  e7.b
 *  f7.a
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  z6.a
 */
package b7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b7.e;
import b7.f;
import b7.g;
import b7.h;
import b7.i;
import b7.j;
import b7.k;
import b7.l;
import b7.m;
import b7.n;
import com.thanosfisherman.wifiutils.wifiConnect.WifiConnectionReceiver;
import com.thanosfisherman.wifiutils.wifiScan.WifiScanReceiver;
import com.thanosfisherman.wifiutils.wifiState.WifiStateReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class o
implements e,
e.a {
    private static final ExecutorService r = Executors.newSingleThreadExecutor();
    private static long s;
    private static boolean t;
    @NonNull
    private static final String u;
    @NonNull
    private final WifiManager a;
    @NonNull
    private final Context b;
    private long c = 30000L;
    private long d = 30000L;
    private long e = 15000L;
    @NonNull
    private final WifiStateReceiver f;
    @NonNull
    private final WifiConnectionReceiver g;
    @NonNull
    private final WifiScanReceiver h;
    @Nullable
    private String i;
    @Nullable
    private String j;
    @Nullable
    private String k;
    @Nullable
    private ScanResult l;
    @Nullable
    private d7.a m;
    @Nullable
    private c7.a n;
    @Nullable
    private c7.b o;
    @Nullable
    private e7.b p;
    @Nullable
    private f7.a q;

    static {
        t = true;
        u = o.class.getSimpleName();
    }

    private o(@NonNull Context context) {
        WifiManager wifiManager;
        this.b = context;
        this.a = wifiManager = (WifiManager)context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            this.f = new WifiStateReceiver(new e7.a(){

                public void a() {
                    o.O("WIFI ENABLED...");
                    b7.c.x((Context)o.this.b, (BroadcastReceiver)o.this.f);
                    o.this.J();
                }
            });
            this.h = new WifiScanReceiver(new d7.b(){

                public void a() {
                    o.O("GOT SCAN RESULTS");
                    b7.c.x((Context)o.this.b, (BroadcastReceiver)o.this.h);
                    o o2 = o.this;
                    o2.I((List<ScanResult>)o2.x(), null);
                }
            }, this.e);
            this.g = new WifiConnectionReceiver(new c7.c(){

                public void a() {
                    o.O("CONNECTED SUCCESSFULLY");
                    b7.c.x((Context)o.this.b, (BroadcastReceiver)o.this.g);
                    o.this.H(true, 0);
                }

                public void b(int n2) {
                    o.O("DIDN'T CONNECT TO WIFI");
                    b7.c.x((Context)o.this.b, (BroadcastReceiver)o.this.g);
                    o.this.H(false, n2);
                }
            }, wifiManager, this.d);
            return;
        }
        throw new RuntimeException("WifiManager is not supposed to be null");
    }

    private /* synthetic */ void B() {
        b7.c.s((WifiManager)this.a);
    }

    private /* synthetic */ void E(List list, c7.a a2) {
        this.l = a2.a(list);
    }

    private /* synthetic */ void F() {
        this.u(this.l, this.k);
    }

    private void H(boolean bl, int n2) {
        if (!bl) {
            o.v(new n(this));
        }
        z6.a.d((Object)this.o).b((a7.a)new h(bl, n2));
    }

    private void I(List<ScanResult> list, ScanResult scanResult) {
        String string;
        z6.a.d((Object)this.m).b((a7.a)new g(list));
        z6.a.d((Object)this.n).b((a7.a)new f(this, list));
        if (this.q != null && (string = this.j) != null && this.k != null) {
            ScanResult scanResult2;
            this.l = scanResult2 = b7.c.p((String)string, list);
            if (scanResult2 != null && Build.VERSION.SDK_INT >= 21) {
                b7.c.g((WifiManager)this.a, (ScanResult)scanResult2, (String)this.k, (long)this.c, (f7.a)this.q);
                return;
            }
            if (scanResult2 == null) {
                o.O("Couldn't find network. Possibly out of range");
            }
            this.q.a(false);
            return;
        }
        String string2 = this.i;
        if (string2 != null && this.k != null) {
            String string3;
            this.l = scanResult != null ? scanResult : ((string3 = this.j) != null ? b7.c.o((String)string2, (String)string3, list) : b7.c.q((String)string2, list));
            if (this.l != null) {
                o.v(new m(this));
                return;
            }
            this.H(false, 6);
        }
    }

    private void J() {
        z6.a.d((Object)this.p).b((a7.a)j.a);
        if (this.m != null || this.k != null) {
            if (this.i != null && this.k != null) {
                List<ScanResult> list = this.x();
                String string = this.j;
                ScanResult scanResult = string != null ? b7.c.o((String)this.i, (String)string, list) : b7.c.q((String)this.i, list);
                if (scanResult != null) {
                    this.I(list, scanResult);
                    return;
                }
            }
            o.O("START SCANNING....");
            if (o.L() && this.a.startScan()) {
                o.N();
                b7.c.t((Context)this.b, (BroadcastReceiver)this.h.c(), (IntentFilter)new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                return;
            }
            o.O("ERROR COULDN'T SCAN");
            this.I(this.x(), null);
        }
    }

    public static boolean L() {
        Class<o> class_ = o.class;
        synchronized (o.class) {
            long l2 = SystemClock.elapsedRealtime();
            long l3 = s;
            boolean bl = l2 - l3 > 15000L;
            // ** MonitorExit[var6] (shouldn't be in output)
            return bl;
        }
    }

    private void M() {
        b7.c.x((Context)this.b, (BroadcastReceiver)this.f);
        b7.c.x((Context)this.b, (BroadcastReceiver)this.h);
        b7.c.x((Context)this.b, (BroadcastReceiver)this.g);
    }

    public static void N() {
        Class<o> class_ = o.class;
        synchronized (o.class) {
            s = SystemClock.elapsedRealtime();
            // ** MonitorExit[var1] (shouldn't be in output)
            return;
        }
    }

    public static void O(String string) {
        if (t) {
            String string2 = u;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WifiUtils: ");
            stringBuilder.append(string);
            Log.d((String)string2, (String)stringBuilder.toString());
        }
    }

    public static o P(@NonNull Context context) {
        return new o(context);
    }

    public static /* synthetic */ void b(o o2) {
        o2.F();
    }

    public static /* synthetic */ void c(boolean bl, int n2, c7.b b2) {
        b2.a(bl, n2);
    }

    public static /* synthetic */ void d(e7.b b2) {
        b2.a(true);
    }

    public static /* synthetic */ void e(d7.a a2) {
        a2.a((List)new ArrayList());
    }

    public static /* synthetic */ void f(f7.a a2) {
        a2.a(false);
    }

    public static /* synthetic */ void g(List list, d7.a a2) {
        a2.a(list);
    }

    public static /* synthetic */ void h(o o2) {
        o2.B();
    }

    public static /* synthetic */ void i(o o2, List list, c7.a a2) {
        o2.E(list, a2);
    }

    public static /* synthetic */ void j(e7.b b2) {
        b2.a(false);
    }

    private void u(ScanResult scanResult, String string) {
        if (b7.c.f((Context)this.b, (WifiManager)this.a, (ScanResult)scanResult, (String)string)) {
            b7.c.t((Context)this.b, (BroadcastReceiver)this.g.h(scanResult), (IntentFilter)new IntentFilter("android.net.wifi.supplicant.STATE_CHANGE"));
            b7.c.t((Context)this.b, (BroadcastReceiver)this.g, (IntentFilter)new IntentFilter("android.net.wifi.STATE_CHANGE"));
            return;
        }
        this.H(false, 4);
    }

    public static void v(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            r.execute(runnable);
            return;
        }
        runnable.run();
    }

    private List<ScanResult> x() {
        try {
            List list = this.a.getScanResults();
            return list;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new ArrayList();
        }
    }

    @NonNull
    public e K(d7.a a2) {
        this.m = a2;
        return this;
    }

    @NonNull
    public e a(@Nullable c7.b b2) {
        this.o = b2;
        return this;
    }

    public void s() {
        this.h.d();
        this.g.i();
        this.M();
    }

    public void start() {
        this.M();
        this.w(null);
    }

    @NonNull
    public e.a t(@NonNull String string, @NonNull String string2) {
        this.i = string;
        this.k = string2;
        return this;
    }

    public void w(@Nullable e7.b b2) {
        this.p = b2;
        if (this.a.isWifiEnabled()) {
            this.J();
            return;
        }
        if (this.a.setWifiEnabled(true)) {
            b7.c.t((Context)this.b, (BroadcastReceiver)this.f, (IntentFilter)new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
            return;
        }
        z6.a.d((Object)b2).b((a7.a)k.a);
        z6.a.d((Object)this.m).b((a7.a)i.a);
        z6.a.d((Object)this.q).b((a7.a)l.a);
        this.H(false, 5);
        o.O("COULDN'T ENABLE WIFI");
    }

}


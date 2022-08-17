/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.b0
 *  a8.b0$a
 *  a8.d0
 *  a8.e
 *  a8.e0
 *  a8.z
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  cn.huidu.huiduapp.ledart.HuiduApplication
 *  cn.huidu.huiduapp.ledart.entity.model.FirmwareModel
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.ConnectException
 *  java.net.NoRouteToHostException
 *  java.net.PortUnreachableException
 *  java.net.SocketTimeoutException
 *  java.net.UnknownHostException
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.TimeUnit
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSession
 *  m5.p0
 *  m5.x
 *  org.w3c.dom.Document
 *  r5.c
 *  r5.d
 *  r5.e
 *  r5.f
 *  x5.i
 */
package b1;

import a8.b0;
import a8.d0;
import a8.e0;
import a8.q;
import a8.z;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b1.d;
import b1.e;
import cn.huidu.huiduapp.ledart.HuiduApplication;
import cn.huidu.huiduapp.ledart.entity.model.FirmwareModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import m5.p0;
import m5.x;
import org.w3c.dom.Document;
import r5.f;
import x5.i;

public class c {
    private static final String d = "https://service2.led-cloud.cn/firmware/";
    private static final String e;
    private static final String f;
    private static volatile c g;
    private final List<b> a = new ArrayList();
    private ExecutorService b;
    private a c;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d);
        stringBuilder.append("FirmwareUpdateAll.xml");
        e = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(d);
        stringBuilder2.append("FirmwareVersions.xml");
        f = stringBuilder2.toString();
    }

    private c() {
    }

    private void j(Runnable runnable) {
        ExecutorService executorService = this.b;
        if (executorService == null || executorService.isShutdown()) {
            this.b = Executors.newSingleThreadExecutor();
        }
        this.b.execute(runnable);
    }

    private static File k() {
        File file = new File(HuiduApplication.c().getExternalFilesDir(null), "firmware");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c l() {
        if (g != null) return g;
        Class<c> class_ = c.class;
        synchronized (c.class) {
            if (g != null) return g;
            g = new c();
            // ** MonitorExit[var1] (shouldn't be in output)
            return g;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n(int n2, String string2) {
        c c2 = this;
        synchronized (c2) {
            int n3 = 0;
            do {
                if (n3 >= this.a.size()) break;
                b b2 = (b)this.a.get(n3);
                if (b2 != null) {
                    b2.A1(n2, string2);
                }
                ++n3;
            } while (true);
            if (n2 >= 0) {
                if (n2 < 100) return;
            }
            this.c = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void o(int n2) {
        c c2 = this;
        synchronized (c2) {
            int n3 = 0;
            do {
                if (n3 >= this.a.size()) break;
                b b2 = (b)this.a.get(n3);
                if (b2 != null) {
                    b2.r1(n2);
                }
                ++n3;
            } while (true);
            if (n2 >= 0) {
                if (n2 < 100) return;
            }
            this.c = null;
            return;
        }
    }

    public void g(b b2) {
        c c2 = this;
        synchronized (c2) {
            this.a.add((Object)b2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("addDownloadListener::");
            stringBuilder.append(this.a.size());
            Log.d((String)"FirmwareDownloader", (String)stringBuilder.toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h() {
        c c2 = this;
        synchronized (c2) {
            a a2 = this.c;
            if (a2 != null && a2.f()) {
                Log.d((String)"FirmwareDownloader", (String)"checkUpdates: task already running.");
            } else {
                a a3;
                this.c = a3 = new a();
                this.j(a3);
            }
            return;
        }
    }

    public void i(FirmwareModel firmwareModel, String string2) {
        c c2 = this;
        synchronized (c2) {
            c c3 = new c();
            c3.g(firmwareModel, string2);
            this.j(c3);
            return;
        }
    }

    public int m() {
        c c2 = this;
        synchronized (c2) {
            block4 : {
                a a2 = this.c;
                if (a2 == null) break block4;
                int n2 = a2.e();
                return n2;
            }
            return 1000;
        }
    }

    public void p(b b2) {
        c c2 = this;
        synchronized (c2) {
            this.a.remove((Object)b2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("removeDownloadListener::");
            stringBuilder.append(this.a.size());
            Log.d((String)"FirmwareDownloader", (String)stringBuilder.toString());
            return;
        }
    }

    private static class a
    implements Runnable {
        private Handler a = new Handler(Looper.getMainLooper());
        private z b;
        private int c;
        private boolean d;

        a() {
            z.a a2 = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.b = a2.c(10L, timeUnit).J(10L, timeUnit).I(10L, timeUnit).d((q)new i(10L)).H(b1.b.a).b();
        }

        public static /* synthetic */ boolean a(String string2, SSLSession sSLSession) {
            return a.g(string2, sSLSession);
        }

        public static /* synthetic */ void b(int n2) {
            a.h(n2);
        }

        private boolean c(File file, String string2) {
            if (file.exists()) {
                if (file.length() == 0L) {
                    return false;
                }
                String string3 = x.b((File)file);
                if (string3 != null && string3.equals((Object)string2)) {
                    return true;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("checkFileMd5: md5 not match: ");
                stringBuilder.append(string2);
                stringBuilder.append(" <-> ");
                stringBuilder.append(string3);
                stringBuilder.append(", ");
                stringBuilder.append(file.getPath());
                Log.d((String)"FirmwareDownloader", (String)stringBuilder.toString());
            }
            return false;
        }

        private void d() {
            this.k(1);
            r5.c c2 = new r5.c();
            List<f> list = this.j(f);
            if (list == null) {
                Log.d((String)"FirmwareDownloader", (String)"Load version info failed!");
                this.k(-1);
                return;
            }
            for (int i2 = 0; i2 < list.size(); ++i2) {
                c2.k((f)list.get(i2));
            }
            List<r5.e> list2 = this.i(e);
            if (list2 == null) {
                Log.d((String)"FirmwareDownloader", (String)"Load firmware info failed!");
                this.k(-1);
                return;
            }
            File file = c.k();
            boolean bl = false;
            for (int i3 = 0; i3 < list2.size(); ++i3) {
                r5.e e2 = (r5.e)list2.get(i3);
                String string2 = e2.b();
                if (string2 != null && string2.length() == 32) {
                    File file2 = new File(file, e2.c());
                    e2.l(file2.getAbsolutePath());
                    if (this.c(file2, string2)) {
                        e2.i(100);
                    } else {
                        e2.i(0);
                        bl = true;
                    }
                    c2.j(e2);
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid firmware: ");
                stringBuilder.append(e2.c());
                Log.d((String)"FirmwareDownloader", (String)stringBuilder.toString());
            }
            if (bl) {
                this.k(100);
                return;
            }
            this.k(200);
        }

        private static /* synthetic */ boolean g(String string2, SSLSession sSLSession) {
            return true;
        }

        private static /* synthetic */ void h(int n2) {
            c.l().o(n2);
        }

        private List<r5.e> i(String string2) {
            Document document;
            block3 : {
                try {
                    b0 b02 = new b0.a().o(string2).b();
                    document = p0.g((String)this.b.a(b02).T().D().L());
                    if (document != null) break block3;
                    return null;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return null;
                }
            }
            List list = r5.d.d((Document)document);
            return list;
        }

        private List<f> j(String string2) {
            Document document;
            block3 : {
                try {
                    b0 b02 = new b0.a().o(string2).b();
                    document = p0.g((String)this.b.a(b02).T().D().L());
                    if (document != null) break block3;
                    return null;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            List list = r5.d.e((Document)document);
            return list;
        }

        private void k(int n2) {
            if (this.c != n2) {
                this.c = n2;
                this.a.post((Runnable)new b1.a(n2));
            }
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }

        public void run() {
            this.d = true;
            this.d();
            this.d = false;
        }
    }

    public static interface b {
        public void A1(int var1, String var2);

        public void r1(int var1);
    }

    private static class c
    implements Runnable {
        private Handler a = new Handler(Looper.getMainLooper());
        private z b;
        private FirmwareModel c;
        private String d;

        c() {
            z.a a2 = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.b = a2.c(10L, timeUnit).J(10L, timeUnit).I(10L, timeUnit).d((q)new i(10L)).H(e.a).b();
        }

        public static /* synthetic */ boolean a(String string2, SSLSession sSLSession) {
            return c.e(string2, sSLSession);
        }

        public static /* synthetic */ void b(c c2, int n2) {
            c2.f(n2);
        }

        private void d() {
            FirmwareModel firmwareModel = this.c;
            int n2 = 0;
            if (firmwareModel == null) {
                this.h(0);
                return;
            }
            int n3 = firmwareModel.list.size();
            r5.c c2 = new r5.c();
            while (n2 < n3) {
                r5.e e2 = (r5.e)this.c.list.get(n2);
                int n4 = this.c(e2);
                if (n4 == 0) {
                    c2.j(e2);
                    if ((int)(1.0f + (float)(++n2 * 99) / (float)n3) < 100) continue;
                    this.h(100);
                    continue;
                }
                this.h(n4);
                break;
            }
        }

        private static /* synthetic */ boolean e(String string2, SSLSession sSLSession) {
            return true;
        }

        private /* synthetic */ void f(int n2) {
            c.l().n(n2, this.d);
        }

        private void h(int n2) {
            this.a.post((Runnable)new d(this, n2));
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public int c(r5.e e2) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(d);
                stringBuilder.append(e2.c());
                String string2 = stringBuilder.toString();
                b0 b02 = new b0.a().o(string2).b();
                InputStream inputStream = this.b.a(b02).T().D().D();
                File file = new File(e2.d());
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] arrby = new byte[1024];
                do {
                    int n2;
                    if ((n2 = inputStream.read(arrby)) == -1) {
                        inputStream.close();
                        fileOutputStream.close();
                        e2.i(100);
                        return 0;
                    }
                    fileOutputStream.write(arrby, 0, n2);
                } while (true);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (exception instanceof SocketTimeoutException) {
                    return -2;
                }
                if (exception instanceof ConnectException) {
                    return -1;
                }
                if (exception instanceof UnknownHostException) {
                    return -1;
                }
                if (exception instanceof NoRouteToHostException) {
                    return -3;
                }
                if (!(exception instanceof PortUnreachableException)) return -1;
                return -3;
            }
        }

        public void g(FirmwareModel firmwareModel, String string2) {
            this.c = firmwareModel;
            this.d = string2;
        }

        public void run() {
            this.d();
        }
    }

}


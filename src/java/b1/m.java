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
 *  android.content.Context
 *  android.text.TextUtils
 *  b1.m$a
 *  b1.m$b
 *  cn.huidu.huiduapp.ledart.HuiduApplication
 *  cn.huidu.huiduapp.ledart.entity.model.DownloadSourceModel
 *  cn.huidu.huiduapp.ledart.entity.model.DownloadSourceServerModel
 *  com.google.gson.e
 *  e6.a
 *  e6.b
 *  f6.a
 *  g6.a
 *  i6.a
 *  java.io.File
 *  java.io.FileReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSession
 *  m5.o
 *  m5.x
 *  o8.c
 *  p6.b
 *  x5.i
 */
package b1;

import a1.k;
import a8.b0;
import a8.d0;
import a8.e0;
import a8.q;
import a8.z;
import android.content.Context;
import android.text.TextUtils;
import b1.l;
import b1.m;
import cn.huidu.huiduapp.ledart.HuiduApplication;
import cn.huidu.huiduapp.ledart.entity.model.DownloadSourceModel;
import cn.huidu.huiduapp.ledart.entity.model.DownloadSourceServerModel;
import com.google.gson.e;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import m5.o;
import m5.x;
import x5.i;

public class m {
    private static volatile m a;
    private static volatile List<DownloadSourceModel> b;
    private static volatile List<DownloadSourceModel> c;

    public static /* synthetic */ boolean a(String string2, SSLSession sSLSession) {
        return m.p(string2, sSLSession);
    }

    static /* synthetic */ void b(String string2, int n2, String string3) {
        m.t(string2, n2, string3);
    }

    private static File g(String string2, File[] arrfile) {
        for (File file : arrfile) {
            if (!string2.equals((Object)x.b((File)file))) continue;
            return file;
        }
        return null;
    }

    private boolean i(int n2) {
        File file;
        String string2;
        block7 : {
            String string3;
            block6 : {
                string3 = this.n(n2);
                if (n2 != 0) break block6;
                file = new File(string3, "hd_resource.json");
                string2 = "https://service2.led-cloud.cn/Resource/hd_resource.json";
                break block7;
            }
            file = new File(string3, "hd_background.json");
            string2 = "https://service2.led-cloud.cn/Resource/hd_background.json";
        }
        try {
            b0 b02 = new b0.a().o(string2).b();
            z.a a2 = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String string4 = a2.c(10L, timeUnit).J(10L, timeUnit).I(10L, timeUnit).d((q)new i(10L)).H(l.a).b().a(b02).T().D().L();
            if (string4.length() > 0) {
                o.b0((String)string4, (String)file.getAbsolutePath());
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    private void k(DownloadSourceModel downloadSourceModel, int n2) {
        if (downloadSourceModel == null) {
            return;
        }
        String string2 = downloadSourceModel.getPath();
        String string3 = downloadSourceModel.getName();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        String string4 = this.n(n2);
        if (TextUtils.isEmpty((CharSequence)string4)) {
            return;
        }
        e6.b b2 = e6.b.g();
        b2.l(string4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://service2.led-cloud.cn");
        stringBuilder.append(string2);
        p6.b b3 = i6.a.b((String)stringBuilder.toString()).z((Object)"SourceDownload");
        b2.j(string3, true);
        for (int i2 = 0; i2 < b2.d().size(); ++i2) {
            e6.a a2 = (e6.a)b2.d().get(i2);
            if (a2.k() != 5) continue;
            b2.j(a2.o(), true);
        }
        b b4 = new b(this, string4, n2, string2, downloadSourceModel);
        b2.a(string3, string3, b3, (g6.a)b4);
    }

    private String n(int n2) {
        if (n2 == 0) {
            return o.R((Context)HuiduApplication.c());
        }
        return o.m((Context)HuiduApplication.c());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static m o() {
        if (a != null) return a;
        Class<m> class_ = m.class;
        synchronized (m.class) {
            if (a != null) return a;
            a = new m();
            // ** MonitorExit[var1] (shouldn't be in output)
            return a;
        }
    }

    private static /* synthetic */ boolean p(String string2, SSLSession sSLSession) {
        return true;
    }

    private static void q(final File[] arrfile, String string2) {
        if (c == null || c.size() <= 0) {
            c = m.v(HuiduApplication.c(), 1);
        }
        new Thread(){

            public void run() {
                super.run();
                for (int i2 = 0; i2 < c.size(); ++i2) {
                    DownloadSourceModel downloadSourceModel = (DownloadSourceModel)c.get(i2);
                    if (!downloadSourceModel.getPath().equals((Object)String.this) || m.g(downloadSourceModel.getMd5(), arrfile) == null) continue;
                    downloadSourceModel.setLocalFile(true);
                    downloadSourceModel.setDownloading(false);
                    k k2 = new k();
                    k2.c = downloadSourceModel;
                    k2.b = false;
                    k2.a = true;
                    o8.c.c().l((Object)k2);
                }
            }
        }.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void r(Context context) {
        Class<m> class_ = m.class;
        synchronized (m.class) {
            if (c != null) {
                c.clear();
            } else {
                c = new ArrayList();
            }
            c.addAll(m.v(context, 1));
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void s(Context context) {
        Class<m> class_ = m.class;
        synchronized (m.class) {
            if (b != null) {
                b.clear();
            } else {
                b = new ArrayList();
            }
            b.addAll(m.v(context, 0));
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return;
        }
    }

    private static void t(String string2, int n2, String string3) {
        File file = new File(string2);
        if (!file.isDirectory()) {
            return;
        }
        File[] arrfile = file.listFiles();
        if (n2 == 0) {
            m.w(arrfile, string3);
            return;
        }
        m.q(arrfile, string3);
    }

    private static void u(Context context, List<DownloadSourceModel> list, int n2) {
        String string2 = n2 == 0 ? o.R((Context)context) : o.m((Context)context);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        File file = new File(string2);
        if (!file.isDirectory()) {
            return;
        }
        File[] arrfile = file.listFiles();
        List<DownloadSourceServerModel> list2 = m.x(n2, string2);
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            DownloadSourceServerModel downloadSourceServerModel = (DownloadSourceServerModel)list2.get(i2);
            String string3 = downloadSourceServerModel.name;
            String string4 = downloadSourceServerModel.type;
            String string5 = downloadSourceServerModel.preview;
            String string6 = downloadSourceServerModel.path;
            String string7 = downloadSourceServerModel.md5;
            DownloadSourceModel downloadSourceModel = new DownloadSourceModel();
            downloadSourceModel.setName(string3);
            downloadSourceModel.setType(string4);
            downloadSourceModel.setPreview(string5);
            downloadSourceModel.setPath(string6);
            downloadSourceModel.setMd5(string7);
            downloadSourceModel.setDownloading(false);
            if (m.g(string7, arrfile) != null) {
                e6.a a2 = f6.a.c.b(string3);
                if (a2 != null && a2.k() == 4) {
                    downloadSourceModel.setLocalFile(true);
                } else {
                    downloadSourceModel.setLocalFile(false);
                }
            } else {
                downloadSourceModel.setLocalFile(false);
            }
            list.add((Object)downloadSourceModel);
        }
    }

    private static List<DownloadSourceModel> v(Context context, int n2) {
        ArrayList arrayList = new ArrayList();
        try {
            m.u(context, (List<DownloadSourceModel>)arrayList, n2);
            return arrayList;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return arrayList;
        }
    }

    private static void w(final File[] arrfile, String string2) {
        if (b == null || b.size() <= 0) {
            b = m.v(HuiduApplication.c(), 0);
        }
        new Thread(){

            public void run() {
                super.run();
                for (int i2 = 0; i2 < b.size(); ++i2) {
                    DownloadSourceModel downloadSourceModel = (DownloadSourceModel)b.get(i2);
                    if (!downloadSourceModel.getPath().equals((Object)String.this) || m.g(downloadSourceModel.getMd5(), arrfile) == null) continue;
                    downloadSourceModel.setLocalFile(true);
                    downloadSourceModel.setDownloading(false);
                    k k2 = new k();
                    k2.c = downloadSourceModel;
                    k2.b = false;
                    k2.a = true;
                    o8.c.c().l((Object)k2);
                }
            }
        }.start();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static List<DownloadSourceServerModel> x(int var0, String var1_1) {
        if (var0 != 0) ** GOTO lbl5
        try {
            block2 : {
                var2_2 = new File(var1_1, "hd_resource.json");
                break block2;
lbl5: // 1 sources:
                var2_2 = new File(var1_1, "hd_background.json");
            }
            var3_3 = new FileReader(var2_2);
            return (List)new e().j((Reader)var3_3, new a().e());
        }
        catch (Exception var4_5) {
            var4_5.printStackTrace();
            return new ArrayList();
        }
    }

    public void f(DownloadSourceModel downloadSourceModel) {
        this.k(downloadSourceModel, 1);
    }

    public boolean h() {
        return this.i(1);
    }

    public boolean j() {
        return this.i(0);
    }

    public List<DownloadSourceModel> l() {
        if (c == null) {
            return new ArrayList();
        }
        return new ArrayList(c);
    }

    public List<DownloadSourceModel> m() {
        if (b == null) {
            return new ArrayList();
        }
        return new ArrayList(b);
    }

    public void y(DownloadSourceModel downloadSourceModel) {
        this.k(downloadSourceModel, 0);
    }

}


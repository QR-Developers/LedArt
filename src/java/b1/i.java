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
 *  android.util.Log
 *  b1.i$a
 *  b1.i$c
 *  cn.huidu.huiduapp.ledart.HuiduApplication
 *  com.google.gson.e
 *  com.huidu.applibs.entity.model.PlayerApkDownloadEvent
 *  com.huidu.applibs.entity.model.PlayerApkFileModel
 *  com.huidu.applibs.entity.model.PlayerApkServerModel
 *  e6.a
 *  e6.b
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

import a8.b0;
import a8.d0;
import a8.e0;
import a8.q;
import a8.z;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import b1.h;
import b1.i;
import cn.huidu.huiduapp.ledart.HuiduApplication;
import com.google.gson.e;
import com.huidu.applibs.entity.model.PlayerApkDownloadEvent;
import com.huidu.applibs.entity.model.PlayerApkFileModel;
import com.huidu.applibs.entity.model.PlayerApkServerModel;
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

public class i {
    private List<PlayerApkFileModel> a;
    private String b = "M10";

    public static /* synthetic */ boolean a(String string2, SSLSession sSLSession) {
        return i.j(string2, sSLSession);
    }

    static /* synthetic */ void d(i i2, Context context, String string2) {
        i2.n(context, string2);
    }

    private static File e(String string2, File[] arrfile) {
        for (File file : arrfile) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("checkSDSourceExist: +++");
            stringBuilder.append(x.b((File)file));
            stringBuilder.append("+++");
            stringBuilder.append(string2);
            Log.d((String)"LcdPlayerApkDownloader", (String)stringBuilder.toString());
            if (!string2.equals((Object)x.b((File)file))) continue;
            return file;
        }
        return null;
    }

    private static /* synthetic */ boolean j(String string2, SSLSession sSLSession) {
        return true;
    }

    private void l(Context context, List<PlayerApkFileModel> list) {
        String string2 = o.G((Context)context, (String)this.b);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        File file = new File(string2);
        if (!file.isDirectory()) {
            return;
        }
        File[] arrfile = file.listFiles();
        List<PlayerApkServerModel> list2 = this.o(context);
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            PlayerApkServerModel playerApkServerModel = (PlayerApkServerModel)list2.get(i2);
            String string3 = playerApkServerModel.versionName;
            int n2 = playerApkServerModel.versionCode;
            String string4 = playerApkServerModel.name;
            String string5 = playerApkServerModel.path;
            String string6 = playerApkServerModel.desc;
            String string7 = playerApkServerModel.descEN;
            String string8 = playerApkServerModel.md5;
            PlayerApkFileModel playerApkFileModel = new PlayerApkFileModel();
            playerApkFileModel.setVersionName(string3);
            playerApkFileModel.setVersionCode(n2);
            playerApkFileModel.setName(string4);
            playerApkFileModel.setPath(string5);
            playerApkFileModel.setDesc(string6);
            playerApkFileModel.setDescEN(string7);
            playerApkFileModel.setMd5(string8);
            playerApkFileModel.setDownloading(false);
            if (i.e(string8, arrfile) != null) {
                playerApkFileModel.setLocalFile(true);
            } else {
                playerApkFileModel.setLocalFile(false);
            }
            list.add((Object)playerApkFileModel);
        }
    }

    private List<PlayerApkFileModel> m(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            this.l(context, (List<PlayerApkFileModel>)arrayList);
            return arrayList;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return arrayList;
        }
    }

    private void n(Context context, final String string2) {
        String string3 = o.G((Context)context, (String)this.b);
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return;
        }
        File file = new File(string3);
        if (!file.isDirectory()) {
            return;
        }
        final File[] arrfile = file.listFiles();
        List<PlayerApkFileModel> list = this.a;
        if (list == null || list.size() <= 0) {
            this.a = this.m(context);
        }
        new Thread(){

            public void run() {
                super.run();
                for (int i2 = 0; i2 < i.this.a.size(); ++i2) {
                    PlayerApkFileModel playerApkFileModel = (PlayerApkFileModel)i.this.a.get(i2);
                    if (!playerApkFileModel.getPath().equals((Object)string2) || i.e(playerApkFileModel.getMd5(), arrfile) == null) continue;
                    playerApkFileModel.setLocalFile(true);
                    playerApkFileModel.setDownloading(false);
                    PlayerApkDownloadEvent playerApkDownloadEvent = new PlayerApkDownloadEvent();
                    playerApkDownloadEvent.success = true;
                    playerApkDownloadEvent.error = false;
                    playerApkDownloadEvent.progress = 100.0f;
                    playerApkDownloadEvent.model = playerApkFileModel;
                    o8.c.c().l((Object)playerApkDownloadEvent);
                }
            }
        }.start();
    }

    private List<PlayerApkServerModel> o(Context context) {
        String string2 = o.G((Context)context, (String)this.b);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return new ArrayList();
        }
        try {
            File file = new File(string2, "Players.json");
            if (!file.exists()) {
                return new ArrayList();
            }
            FileReader fileReader = new FileReader(file);
            List list = (List)new e().j((Reader)fileReader, new a(this).e());
            return list;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new ArrayList();
        }
    }

    public void f(PlayerApkFileModel playerApkFileModel) {
        if (playerApkFileModel == null) {
            return;
        }
        String string2 = playerApkFileModel.getPath();
        String string3 = playerApkFileModel.getName();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        String string4 = o.G((Context)HuiduApplication.c(), (String)this.b);
        if (TextUtils.isEmpty((CharSequence)string4)) {
            return;
        }
        e6.b b2 = e6.b.g();
        b2.l(string4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://service2.led-cloud.cn/");
        stringBuilder.append(this.b);
        stringBuilder.append("/Players");
        stringBuilder.append(string2);
        String string5 = stringBuilder.toString();
        p6.b b3 = i6.a.b((String)string5).z((Object)"LcdPlayerApkDownloader");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("downloadPlayerApkFileWithModel: ");
        stringBuilder2.append(string5);
        Log.d((String)"LcdPlayerApkDownloader", (String)stringBuilder2.toString());
        String string6 = x.c((byte[])string5.getBytes());
        b2.j(string6, true);
        List list = b2.d();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            e6.a a2 = (e6.a)list.get(i2);
            if (a2.k() != 5) continue;
            b2.j(a2.o(), true);
        }
        b2.a(string3, string6, b3, (g6.a)new c(this, string2, playerApkFileModel));
    }

    public boolean g() {
        try {
            File file = new File(o.G((Context)HuiduApplication.c(), (String)this.b), "Players.json");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://service2.led-cloud.cn/");
            stringBuilder.append(this.b);
            stringBuilder.append("/Players/Players.json");
            String string2 = stringBuilder.toString();
            b0 b02 = new b0.a().o(string2).b();
            z.a a2 = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String string3 = a2.c(10L, timeUnit).J(10L, timeUnit).I(10L, timeUnit).d((q)new x5.i(10L)).H(h.a).b().a(b02).T().D().L();
            if (string3.length() > 0) {
                o.b0((String)string3, (String)file.getAbsolutePath());
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public List<PlayerApkFileModel> h() {
        if (this.a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (PlayerApkFileModel playerApkFileModel : this.a) {
            if (!playerApkFileModel.isLocalFile()) continue;
            arrayList.add((Object)playerApkFileModel);
        }
        return arrayList;
    }

    public List<PlayerApkFileModel> i() {
        if (this.a == null) {
            return new ArrayList();
        }
        return new ArrayList(this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k(Context context) {
        Class<i> class_ = i.class;
        synchronized (i.class) {
            List<PlayerApkFileModel> list = this.a;
            if (list != null) {
                list.clear();
            } else {
                this.a = new ArrayList();
            }
            this.a.addAll(this.m(context));
            // ** MonitorExit[var5_2] (shouldn't be in output)
            return;
        }
    }

    public void p(String string2) {
        String string3 = this.b;
        if (string3 == null || !string3.equals((Object)string2)) {
            this.b = string2;
            List<PlayerApkFileModel> list = this.a;
            if (list != null) {
                list.clear();
            }
        }
    }

}


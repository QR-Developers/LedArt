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
 *  b1.k$a
 *  b1.k$c
 *  cn.huidu.huiduapp.ledart.HuiduApplication
 *  com.google.gson.e
 *  com.huidu.applibs.entity.model.ScreenParamsDownloadEvent
 *  com.huidu.applibs.entity.model.ScreenParamsFileModel
 *  com.huidu.applibs.entity.model.ScreenParamsServerModel
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
 *  java.util.Iterator
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
import b1.j;
import b1.k;
import cn.huidu.huiduapp.ledart.HuiduApplication;
import com.google.gson.e;
import com.huidu.applibs.entity.model.ScreenParamsDownloadEvent;
import com.huidu.applibs.entity.model.ScreenParamsFileModel;
import com.huidu.applibs.entity.model.ScreenParamsServerModel;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import m5.o;
import m5.x;
import x5.i;

public class k {
    private List<ScreenParamsFileModel> a;
    private String b = "M10";

    public static /* synthetic */ boolean a(String string2, SSLSession sSLSession) {
        return k.k(string2, sSLSession);
    }

    static /* synthetic */ void d(k k2, Context context, String string2, ScreenParamsFileModel screenParamsFileModel) {
        k2.o(context, string2, screenParamsFileModel);
    }

    private static File e(String string2, File[] arrfile) {
        for (File file : arrfile) {
            if (!string2.equals((Object)x.b((File)file))) continue;
            return file;
        }
        return null;
    }

    private static /* synthetic */ boolean k(String string2, SSLSession sSLSession) {
        return true;
    }

    private void m(Context context, List<ScreenParamsFileModel> list) {
        String string2 = o.Q((Context)context, (String)this.b);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        File file = new File(string2);
        if (!file.isDirectory()) {
            return;
        }
        File[] arrfile = file.listFiles();
        List<ScreenParamsServerModel> list2 = this.p(context);
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            ScreenParamsServerModel screenParamsServerModel = (ScreenParamsServerModel)list2.get(i2);
            String string3 = screenParamsServerModel.name;
            String string4 = screenParamsServerModel.type;
            String string5 = screenParamsServerModel.path;
            String string6 = screenParamsServerModel.desc;
            String string7 = screenParamsServerModel.md5;
            ScreenParamsFileModel screenParamsFileModel = new ScreenParamsFileModel();
            screenParamsFileModel.setName(string3);
            screenParamsFileModel.setType(string4);
            screenParamsFileModel.setPath(string5);
            screenParamsFileModel.setDesc(string6);
            screenParamsFileModel.setMd5(string7);
            screenParamsFileModel.setDownloading(false);
            File file2 = k.e(string7, arrfile);
            if (file2 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("/");
                stringBuilder.append(string4);
                stringBuilder.append("_");
                stringBuilder.append(string3);
                stringBuilder.append(".hd");
                String string8 = stringBuilder.toString();
                if (file2.getAbsolutePath().equals((Object)string8)) {
                    screenParamsFileModel.setLocalFile(true);
                } else {
                    screenParamsFileModel.setLocalFile(false);
                }
            } else {
                screenParamsFileModel.setLocalFile(false);
            }
            list.add((Object)screenParamsFileModel);
        }
    }

    private List<ScreenParamsFileModel> n(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            this.m(context, (List<ScreenParamsFileModel>)arrayList);
            return arrayList;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return arrayList;
        }
    }

    private void o(Context context, final String string2, final ScreenParamsFileModel screenParamsFileModel) {
        String string3 = o.Q((Context)context, (String)this.b);
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return;
        }
        File file = new File(string3);
        if (!file.isDirectory()) {
            return;
        }
        final File[] arrfile = file.listFiles();
        List<ScreenParamsFileModel> list = this.a;
        if (list == null || list.size() <= 0) {
            this.a = this.n(context);
        }
        new Thread(){

            public void run() {
                super.run();
                for (int i2 = 0; i2 < k.this.a.size(); ++i2) {
                    ScreenParamsFileModel screenParamsFileModel2 = (ScreenParamsFileModel)k.this.a.get(i2);
                    if (!screenParamsFileModel2.getPath().equals((Object)string2)) continue;
                    if (k.e(screenParamsFileModel2.getMd5(), arrfile) != null) {
                        screenParamsFileModel2.setLocalFile(true);
                        screenParamsFileModel2.setDownloading(false);
                        ScreenParamsDownloadEvent screenParamsDownloadEvent = new ScreenParamsDownloadEvent();
                        screenParamsDownloadEvent.success = true;
                        screenParamsDownloadEvent.error = false;
                        screenParamsDownloadEvent.progress = 100.0f;
                        screenParamsDownloadEvent.model = screenParamsFileModel2;
                        o8.c.c().l((Object)screenParamsDownloadEvent);
                        return;
                    }
                    ScreenParamsDownloadEvent screenParamsDownloadEvent = new ScreenParamsDownloadEvent();
                    screenParamsDownloadEvent.success = false;
                    screenParamsDownloadEvent.error = true;
                    screenParamsDownloadEvent.errMsg = "";
                    screenParamsDownloadEvent.model = screenParamsFileModel;
                    o8.c.c().l((Object)screenParamsDownloadEvent);
                    Log.d((String)"ScreenParamsDownloader", (String)"onError: +++\u6587\u4ef6MD5\u4e0d\u4e00\u81f4");
                    return;
                }
            }
        }.start();
    }

    private List<ScreenParamsServerModel> p(Context context) {
        String string2 = o.Q((Context)context, (String)this.b);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return new ArrayList();
        }
        try {
            File file = new File(string2, "ScreenParams.json");
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

    public boolean f() {
        try {
            File file = new File(o.Q((Context)HuiduApplication.c(), (String)this.b), "ScreenParams.json");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://service2.led-cloud.cn/");
            stringBuilder.append(this.b);
            stringBuilder.append("/ScreenParams/ScreenParams.json");
            String string2 = stringBuilder.toString();
            b0 b02 = new b0.a().o(string2).b();
            z.a a2 = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String string3 = a2.c(10L, timeUnit).J(10L, timeUnit).I(10L, timeUnit).d((q)new i(10L)).H(j.a).b().a(b02).T().D().L();
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

    public void g(ScreenParamsFileModel screenParamsFileModel) {
        if (screenParamsFileModel == null) {
            return;
        }
        String string2 = screenParamsFileModel.getPath();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(screenParamsFileModel.getType());
        stringBuilder.append("_");
        stringBuilder.append(screenParamsFileModel.getName());
        stringBuilder.append(".hd");
        String string3 = stringBuilder.toString();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        String string4 = o.Q((Context)HuiduApplication.c(), (String)this.b);
        if (TextUtils.isEmpty((CharSequence)string4)) {
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string4);
        stringBuilder2.append("/");
        stringBuilder2.append(string3);
        File file = new File(stringBuilder2.toString());
        if (file.exists()) {
            file.delete();
        }
        e6.b b2 = e6.b.g();
        b2.l(string4);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("https://service2.led-cloud.cn/");
        stringBuilder3.append(this.b);
        stringBuilder3.append("/ScreenParams");
        stringBuilder3.append(string2);
        String string5 = stringBuilder3.toString().replace((CharSequence)"(", (CharSequence)"%28").replace((CharSequence)")", (CharSequence)"%29");
        p6.b b3 = i6.a.b((String)string5).z((Object)"ScreenParamsFileDownload");
        String string6 = x.c((byte[])string5.getBytes());
        b2.j(string6, true);
        List list = b2.d();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            e6.a a2 = (e6.a)list.get(i2);
            if (a2.k() != 5) continue;
            b2.j(a2.o(), true);
        }
        b2.a(string3, string6, b3, (g6.a)new c(this, string2, screenParamsFileModel));
    }

    public List<String> h() {
        if (this.a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            String string2 = ((ScreenParamsFileModel)iterator.next()).getType();
            if (arrayList.contains((Object)string2)) continue;
            arrayList.add((Object)string2);
        }
        return arrayList;
    }

    public List<ScreenParamsFileModel> i(String string2) {
        if (this.a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ScreenParamsFileModel screenParamsFileModel : this.a) {
            if (!screenParamsFileModel.getType().equals((Object)string2) || !screenParamsFileModel.isLocalFile()) continue;
            screenParamsFileModel.setViewType(1);
            arrayList.add((Object)screenParamsFileModel);
        }
        return arrayList;
    }

    public List<ScreenParamsFileModel> j(String string2) {
        if (this.a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ScreenParamsFileModel screenParamsFileModel : this.a) {
            if (!screenParamsFileModel.getType().equals((Object)string2)) continue;
            screenParamsFileModel.setViewType(1);
            arrayList.add((Object)screenParamsFileModel);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(Context context) {
        Class<k> class_ = k.class;
        synchronized (k.class) {
            List<ScreenParamsFileModel> list = this.a;
            if (list != null) {
                list.clear();
            } else {
                this.a = new ArrayList();
            }
            this.a.addAll(this.n(context));
            // ** MonitorExit[var5_2] (shouldn't be in output)
            return;
        }
    }

    public void q(String string2) {
        String string3 = this.b;
        if (string3 == null || !string3.equals((Object)string2)) {
            this.b = string2;
            List<ScreenParamsFileModel> list = this.a;
            if (list != null) {
                list.clear();
            }
        }
    }

}


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
 *  b1.g$a
 *  cn.huidu.huiduapp.ledart.HuiduApplication
 *  com.huidu.applibs.entity.model.FontTypefaceModel
 *  e6.a
 *  e6.b
 *  g6.a
 *  i6.a
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.SSLSession
 *  l5.k
 *  m5.o
 *  p6.b
 *  x5.i
 */
package b1;

import a8.b0;
import a8.d0;
import a8.e;
import a8.e0;
import a8.q;
import a8.z;
import android.content.Context;
import android.text.TextUtils;
import b1.f;
import b1.g;
import cn.huidu.huiduapp.ledart.HuiduApplication;
import com.huidu.applibs.entity.model.FontTypefaceModel;
import e6.b;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import l5.k;
import m5.o;
import x5.i;

public class g {
    private static volatile g a;

    public static /* synthetic */ boolean a(String string2, SSLSession sSLSession) {
        return g.e(string2, sSLSession);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static g d() {
        if (a != null) return a;
        Class<g> class_ = g.class;
        synchronized (g.class) {
            if (a != null) return a;
            a = new g();
            // ** MonitorExit[var1] (shouldn't be in output)
            return a;
        }
    }

    private static /* synthetic */ boolean e(String string2, SSLSession sSLSession) {
        return true;
    }

    public void b(FontTypefaceModel fontTypefaceModel) {
        if (fontTypefaceModel == null) {
            return;
        }
        String string2 = fontTypefaceModel.getFontPath();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        String string3 = o.B((Context)HuiduApplication.c());
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return;
        }
        b b2 = b.g();
        b2.l(string3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://service2.led-cloud.cn/font/");
        stringBuilder.append(string2);
        p6.b b3 = i6.a.b((String)stringBuilder.toString()).z((Object)"FontDown");
        b2.j(string2, true);
        for (int i2 = 0; i2 < b2.d().size(); ++i2) {
            e6.a a2 = (e6.a)b2.d().get(i2);
            if (a2.k() != 5) continue;
            b2.j(a2.o(), true);
        }
        b2.a(string2, string2, b3, (g6.a)new a(this, fontTypefaceModel));
    }

    public boolean c() {
        try {
            String string2 = o.B((Context)HuiduApplication.c());
            String string3 = k.b;
            File file = new File(string2, string3);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://service2.led-cloud.cn/font/");
            stringBuilder.append(string3);
            String string4 = stringBuilder.toString();
            b0 b02 = new b0.a().o(string4).b();
            z.a a2 = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String string5 = a2.c(10L, timeUnit).J(10L, timeUnit).I(10L, timeUnit).d((q)new i(10L)).H(f.a).b().a(b02).T().D().L();
            if (string5.length() > 0) {
                o.b0((String)string5, (String)file.getAbsolutePath());
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }
}


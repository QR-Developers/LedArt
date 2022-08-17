/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.z
 *  android.app.Application
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  androidx.multidex.MultiDex
 *  cn.huidu.huiduapp.ledart.HuiduApplication$a
 *  cn.huidu.huiduapp.ledart.WelcomeActivity
 *  com.bumptech.glide.b
 *  com.scwang.smart.refresh.classics.ClassicsAbstract
 *  com.scwang.smart.refresh.footer.ClassicsFooter
 *  com.scwang.smart.refresh.header.ClassicsHeader
 *  com.scwang.smart.refresh.layout.SmartRefreshLayout
 *  h2.b
 *  h2.m
 *  h2.s0
 *  i6.a
 *  java.lang.Object
 *  java.lang.String
 *  l5.d
 *  s5.e
 *  t6.c
 *  t6.d
 *  t6.f
 *  v6.b
 *  v6.c
 *  w8.b
 *  w8.b$a
 *  x5.i
 *  y0.e
 *  y0.f
 */
package cn.huidu.huiduapp.ledart;

import a8.q;
import a8.z;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.multidex.MultiDex;
import b1.c;
import cn.huidu.huiduapp.ledart.HuiduApplication;
import cn.huidu.huiduapp.ledart.WelcomeActivity;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import h2.m;
import h2.s0;
import s5.e;
import t6.d;
import w8.b;
import x5.i;
import y0.f;

public class HuiduApplication
extends Application {
    private static Application a;

    static {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator((v6.c)f.a);
        SmartRefreshLayout.setDefaultRefreshFooterCreator((v6.b)y0.e.a);
    }

    public static /* synthetic */ t6.c a(Context context, t6.f f2) {
        return HuiduApplication.g(context, f2);
    }

    public static /* synthetic */ d b(Context context, t6.f f2) {
        return HuiduApplication.f(context, f2);
    }

    public static Context c() {
        return a;
    }

    private boolean e() {
        String string;
        SharedPreferences sharedPreferences = this.getSharedPreferences("Application", 0);
        String string2 = sharedPreferences.getString("AppVersion", "1.0");
        if (!string2.equals((Object)(string = h2.b.b((Context)this)))) {
            sharedPreferences.edit().putString("AppVersion", string).apply();
            return true;
        }
        return false;
    }

    private static /* synthetic */ d f(Context context, t6.f f2) {
        f2.g(new int[]{2131099684, 2131099815});
        return new ClassicsHeader(context);
    }

    private static /* synthetic */ t6.c g(Context context, t6.f f2) {
        f2.g(new int[]{2131099684, 2131099815});
        return (t6.c)new ClassicsFooter(context).t(20.0f);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install((Context)this);
    }

    public void d() {
        s0.b((Context)this);
    }

    public void onCreate() {
        super.onCreate();
        a = this;
        i6.a.m((Application)this);
        i6.a.j().a("OkHttpUtils", false).n(60000).o(60000).p(60000);
        i6.a.j().l().d((q)new i(10L));
        b.a.d((Application)this);
        b.a.e((boolean)false);
        boolean bl = this.e();
        l5.d.g().i((Context)this, bl);
        c.l().h();
        m.b().d(this.getApplicationContext());
        e.a();
        WelcomeActivity.o2((WelcomeActivity.f)new a(this));
    }

    public void onLowMemory() {
        super.onLowMemory();
        com.bumptech.glide.b.c((Context)this).b();
    }
}


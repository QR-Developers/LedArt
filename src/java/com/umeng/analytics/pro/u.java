/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.text.TextUtils
 *  com.umeng.analytics.AnalyticsConfig
 *  com.umeng.analytics.pro.i
 *  com.umeng.analytics.pro.i$a
 *  com.umeng.analytics.pro.l
 *  com.umeng.analytics.pro.o
 *  com.umeng.analytics.pro.u$1
 *  com.umeng.analytics.pro.u$a
 *  com.umeng.analytics.pro.v
 *  com.umeng.analytics.pro.y
 *  com.umeng.analytics.pro.y$a
 *  com.umeng.commonsdk.config.FieldManager
 *  com.umeng.commonsdk.debug.UMRTLog
 *  com.umeng.commonsdk.framework.UMLogDataProtocol
 *  com.umeng.commonsdk.framework.UMWorkDispatch
 *  com.umeng.commonsdk.service.UMGlobalContext
 *  com.umeng.commonsdk.statistics.AnalyticsConstants
 *  com.umeng.commonsdk.statistics.common.MLog
 *  com.umeng.commonsdk.statistics.internal.PreferenceWrapper
 *  com.umeng.commonsdk.utils.UMUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  org.json.JSONObject
 */
package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.b;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.u;
import com.umeng.analytics.pro.v;
import com.umeng.analytics.pro.y;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/*
 * Exception performing whole class analysis ignored.
 */
public class u
implements y.a {
    public static final String a = "session_start_time";
    public static final String b = "session_end_time";
    public static final String c = "session_id";
    public static final String d = "pre_session_id";
    public static final String e = "a_start_time";
    public static final String f = "a_end_time";
    public static final String g = "fg_count";
    private static String h;
    private static Context i;
    private static boolean j = false;
    private static long k = 0L;
    private static boolean l = true;
    private static long m;

    static {
    }

    private u() {
        y.a().a((y.a)this);
    }

    public static long a(Context context) {
        long l2;
        l2 = 0L;
        try {
            l2 = PreferenceWrapper.getDefault((Context)context).getLong("fg_count", l2);
        }
        catch (Throwable throwable) {}
        return l2;
    }

    public static u a() {
        return a.a();
    }

    /*
     * Exception decompiling
     */
    private void a(Context var1, String var2, long var3, long var5, long var7) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(String string, long l2) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault((Context)i);
        if (sharedPreferences == null) {
            return;
        }
        long l3 = sharedPreferences.getLong("session_end_time", 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", (Object)string);
            jSONObject.put("__e", l2);
            jSONObject.put("__f", l3);
            double[] arrd = AnalyticsConfig.getLocation();
            if (arrd != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lat", arrd[0]);
                jSONObject2.put("lng", arrd[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put("__d", (Object)jSONObject2);
            }
            Class class_ = Class.forName((String)"android.net.TrafficStats");
            Class class_2 = Integer.TYPE;
            Class[] arrclass = new Class[]{class_2};
            Method method = class_.getMethod("getUidRxBytes", arrclass);
            Method method2 = class_.getMethod("getUidTxBytes", new Class[]{class_2});
            int n2 = u.i.getApplicationInfo().uid;
            if (n2 == -1) {
                return;
            }
            Object[] arrobject = new Object[]{n2};
            long l4 = (Long)method.invoke(null, arrobject);
            Object[] arrobject2 = new Object[]{n2};
            long l5 = (Long)method2.invoke(null, arrobject2);
            if (l4 > 0L && l5 > 0L) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("download_traffic", l4);
                jSONObject3.put("upload_traffic", l5);
                jSONObject.put("__c", (Object)jSONObject3);
            }
            i.a((Context)i).a(string, jSONObject, i.a.e);
            v.a((Context)i);
            l.c((Context)i);
            return;
        }
        catch (Throwable throwable) {}
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault((Context)i);
        if (sharedPreferences != null) {
            long l2 = sharedPreferences.getLong("fg_count", 0L);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            if (editor != null) {
                editor.putLong("fg_count", l2 + 1L);
                editor.commit();
            }
        }
    }

    private void d(Context context) {
        try {
            SharedPreferences.Editor editor = PreferenceWrapper.getDefault((Context)context).edit();
            editor.putLong("fg_count", 0L);
            editor.commit();
        }
        catch (Throwable throwable) {}
    }

    private String e(Context context) {
        String string;
        if (i == null && context != null) {
            i = context.getApplicationContext();
        }
        string = y.a().d(i);
        try {
            this.f(context);
            o.a((Context)i).d(null);
        }
        catch (Throwable throwable) {}
        return string;
    }

    private void f(Context context) {
        o.a((Context)context).b(context);
        o.a((Context)context).d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(Context context, long l2, boolean bl2) {
        String string = y.a().b(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--->>> onInstantSessionInternal: current session id = ");
        stringBuilder.append(string);
        UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        try {
            JSONObject jSONObject;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", l2);
            JSONObject jSONObject3 = b.a().b();
            if (jSONObject3 != null && jSONObject3.length() > 0) {
                jSONObject2.put("__sp", (Object)jSONObject3);
            }
            if ((jSONObject = b.a().c()) != null && jSONObject.length() > 0) {
                jSONObject2.put("__pp", (Object)jSONObject);
            }
            i.a((Context)context).a(string, jSONObject2, i.a.f);
            o.a((Context)context).a((Object)jSONObject2, bl2);
            return string;
        }
        catch (Throwable throwable) {}
        return string;
    }

    public void a(Context context, long l2) {
        SharedPreferences.Editor editor;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault((Context)i);
        if (sharedPreferences != null && (editor = sharedPreferences.edit()) != null) {
            editor.putLong("session_start_time", l2);
            editor.commit();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Context context, Object object) {
        try {
            if (i == null && context != null) {
                i = context.getApplicationContext();
            }
            long l2 = (Long)object;
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault((Context)i);
            if (sharedPreferences == null) {
                return;
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            if (editor == null) {
                return;
            }
            String string = sharedPreferences.getString("versionname", "");
            String string2 = UMUtils.getAppVersionName((Context)i);
            boolean bl2 = TextUtils.isEmpty((CharSequence)string);
            if (bl2) {
                editor.putInt("versioncode", Integer.parseInt((String)UMUtils.getAppVersionCode((Context)context)));
                editor.putString("versionname", string2);
                editor.commit();
            } else if (!string.equals((Object)string2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--->>> onStartSessionInternal: upgrade version: ");
                stringBuilder.append(string);
                stringBuilder.append("-> ");
                stringBuilder.append(string2);
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                int n2 = sharedPreferences.getInt("versioncode", 0);
                String string3 = sharedPreferences.getString("pre_date", "");
                String string4 = sharedPreferences.getString("pre_version", "");
                String string5 = sharedPreferences.getString("versionname", "");
                editor.putInt("versioncode", Integer.parseInt((String)UMUtils.getAppVersionCode((Context)context)));
                editor.putString("versionname", string2);
                editor.putString("vers_date", string3);
                editor.putString("vers_pre_version", string4);
                editor.putString("cur_version", string5);
                editor.putInt("vers_code", n2);
                editor.putString("vers_name", string);
                editor.commit();
                if (l) {
                    l = false;
                }
                if (!j) return;
                j = false;
                this.b(i, l2, true);
                this.b(i, l2);
                return;
            }
            if (j) {
                j = false;
                if (l) {
                    l = false;
                }
                h = this.e(context);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\u521b\u5efa\u65b0\u4f1a\u8bdd: ");
                stringBuilder.append(h);
                MLog.d((String)stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("mSessionChanged flag has been set, Start new session: ");
                stringBuilder2.append(h);
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder2.toString());
                return;
            }
            h = sharedPreferences.getString("session_id", null);
            editor.putLong("a_start_time", l2);
            editor.putLong("a_end_time", 0L);
            editor.commit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u5ef6\u7eed\u4e0a\u4e00\u4e2a\u4f1a\u8bdd: ");
            stringBuilder.append(h);
            MLog.d((String)stringBuilder.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Extend current session: ");
            stringBuilder3.append(h);
            UMRTLog.i((String)"MobclickRT", (String)stringBuilder3.toString());
            if (l) {
                l = false;
                if (FieldManager.allow((String)"header_foreground_count")) {
                    Context context2 = i;
                    UMWorkDispatch.sendEventEx((Context)context2, (int)8213, (UMLogDataProtocol)CoreProtocol.getInstance(context2), null, (long)0L);
                }
            }
            this.f(context);
            o.a((Context)i).a(false);
            return;
        }
        catch (Throwable throwable) {}
    }

    public void a(String string, long l2, long l3, long l4) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        this.a(string, l2);
    }

    public void a(String string, String string2, long l2, long l3, long l4) {
        this.a(i, string2, l2, l3, l4);
        UMRTLog.i((String)"MobclickRT", (String)"saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = i;
            UMWorkDispatch.sendEvent((Context)context, (int)36945, (UMLogDataProtocol)UMProcessDBDatasSender.getInstance(context), (Object)System.currentTimeMillis());
        }
    }

    public String b() {
        return h;
    }

    public void b(Context context, long l2) {
        if (PreferenceWrapper.getDefault((Context)context) == null) {
            return;
        }
        try {
            o.a((Context)i).c(null);
        }
        catch (Throwable throwable) {}
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(Context context, Object object) {
        try {
            if (i == null) {
                i = UMGlobalContext.getAppContext((Context)context);
            }
            long l2 = object == null ? System.currentTimeMillis() : (Long)object;
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault((Context)i);
            if (sharedPreferences == null) {
                return;
            }
            k = sharedPreferences.getLong("a_end_time", 0L);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("------>>> lastActivityEndTime: ");
            stringBuilder.append(k);
            UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
            String string = sharedPreferences.getString("versionname", "");
            String string2 = UMUtils.getAppVersionName((Context)i);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            if (editor == null) {
                return;
            }
            boolean bl2 = TextUtils.isEmpty((CharSequence)string);
            if (!bl2 && !string.equals((Object)string2)) {
                UMRTLog.i((String)"MobclickRT", (String)"--->>> requestNewInstantSessionIf: version upgrade");
                editor.putLong("session_start_time", l2);
                editor.commit();
                o.a((Context)i).a(null, true);
                String string3 = y.a().c(i);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("--->>> force generate new session: session id = ");
                stringBuilder2.append(string3);
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder2.toString());
                j = true;
                this.a(i, l2, true);
                return;
            }
            if (y.a().e(i)) {
                UMRTLog.i((String)"MobclickRT", (String)"--->>> More then 30 sec from last session.");
                j = true;
                editor.putLong("session_start_time", l2);
                editor.commit();
                this.a(i, l2, false);
                return;
            }
            UMRTLog.i((String)"MobclickRT", (String)"--->>> less then 30 sec from last session, do nothing.");
            j = false;
            return;
        }
        catch (Throwable throwable) {}
    }

    /*
     * Exception decompiling
     */
    public boolean b(Context var1, long var2, boolean var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public String c() {
        return this.c(i);
    }

    /*
     * Exception decompiling
     */
    public String c(Context var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl11.1 : GETSTATIC : trying to set 1 previously set to 0
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(Context context, Object object) {
        try {
            if (i == null && context != null) {
                i = context.getApplicationContext();
            }
            long l2 = (Long)object;
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault((Context)context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong("a_start_time", 0L) == 0L) {
                MLog.e((String)"onPause called before onResume");
                return;
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("--->>> onEndSessionInternal: write activity end time = ");
            stringBuilder.append(l2);
            UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
            editor.putLong("a_end_time", l2);
            editor.putLong("session_end_time", l2);
            editor.commit();
            return;
        }
        catch (Throwable throwable) {}
    }
}


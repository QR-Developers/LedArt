/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  com.umeng.analytics.AnalyticsConfig
 *  com.umeng.analytics.MobclickAgent
 *  com.umeng.analytics.MobclickAgent$EScenarioType
 *  com.umeng.analytics.MobclickAgent$PageMode
 *  com.umeng.analytics.b$1
 *  com.umeng.analytics.b$a
 *  com.umeng.analytics.filter.a
 *  com.umeng.analytics.filter.b
 *  com.umeng.analytics.pro.d
 *  com.umeng.analytics.pro.i
 *  com.umeng.analytics.pro.j
 *  com.umeng.analytics.pro.l
 *  com.umeng.analytics.pro.m
 *  com.umeng.analytics.pro.n
 *  com.umeng.analytics.pro.o
 *  com.umeng.analytics.pro.p
 *  com.umeng.analytics.pro.s
 *  com.umeng.analytics.pro.t
 *  com.umeng.analytics.pro.v
 *  com.umeng.analytics.pro.y
 *  com.umeng.common.ISysListener
 *  com.umeng.commonsdk.UMConfigure
 *  com.umeng.commonsdk.config.FieldManager
 *  com.umeng.commonsdk.debug.UMLog
 *  com.umeng.commonsdk.debug.UMRTLog
 *  com.umeng.commonsdk.framework.UMLogDataProtocol
 *  com.umeng.commonsdk.framework.UMWorkDispatch
 *  com.umeng.commonsdk.service.UMGlobalContext
 *  com.umeng.commonsdk.statistics.common.DataHelper
 *  com.umeng.commonsdk.statistics.common.MLog
 *  com.umeng.commonsdk.statistics.internal.PreferenceWrapper
 *  com.umeng.commonsdk.utils.UMUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  javax.microedition.khronos.opengles.GL10
 *  org.json.JSONObject
 */
package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.b;
import com.umeng.analytics.pro.d;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.pro.j;
import com.umeng.analytics.pro.k;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.pro.m;
import com.umeng.analytics.pro.n;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.p;
import com.umeng.analytics.pro.s;
import com.umeng.analytics.pro.t;
import com.umeng.analytics.pro.u;
import com.umeng.analytics.pro.v;
import com.umeng.analytics.pro.y;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

/*
 * Exception performing whole class analysis ignored.
 */
public class b
implements n,
t {
    private static final String A = "umsp_2";
    private static final String B = "umsp_3";
    private static final String C = "umsp_4";
    private static final String D = "umsp_5";
    private static Context a;
    private static final String h = "sp_uapp";
    private static final String i = "prepp_uapp";
    private static final int o = 128;
    private static final int p = 256;
    private static String q = "";
    private static String r = "";
    private static final String s = "ekv_bl";
    private static final String t = "ekv_bl_ver";
    private static final String v = "ekv_wl";
    private static final String w = "ekv_wl_ver";
    private static final String z = "umsp_1";
    private ISysListener b;
    private p c = new p();
    private v d = new v();
    private k e = new k();
    private u f = u.a();
    private l g = null;
    private boolean j = false;
    private volatile JSONObject k = null;
    private volatile JSONObject l = null;
    private volatile JSONObject m = null;
    private boolean n = false;
    private com.umeng.analytics.filter.a u = null;
    private com.umeng.analytics.filter.b x = null;
    private m y = null;

    static {
        Context context = UMGlobalContext.getAppContext();
        if (context != null) {
            a = context.getApplicationContext();
        }
    }

    private b() {
        this.c.a((t)this);
    }

    public static b a() {
        return a.a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(Context var1_1, String var2_2, Map<String, Object> var3_3, long var4_4, boolean var6_5) {
        if (var1_1 != null) ** GOTO lbl5
        try {
            MLog.e((String)"context is null in onEventNoCheck, please check!");
            return;
lbl5: // 1 sources:
            if (b.a == null) {
                b.a = var1_1.getApplicationContext();
            }
            if (!this.j || !this.n) {
                this.a(b.a);
            }
            if (this.c(var2_2)) {
                var8_6 = new StringBuilder();
                var8_6.append("--->>> filter ekv [");
                var8_6.append(var2_2);
                var8_6.append("].");
                UMRTLog.i((String)"MobclickRT", (String)var8_6.toString());
                return;
            }
            var12_7 = "";
            if (this.k == null) {
                this.k = new JSONObject();
            } else {
                var12_7 = this.k.toString();
            }
            var13_8 = var12_7;
            s.a((Context)b.a).a(var2_2, var3_3, var4_4, var13_8, var6_5);
            return;
        }
        catch (Throwable var7_9) {
            if (MLog.DEBUG == false) return;
            MLog.e((Throwable)var7_9);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private void a(String var1, Object var2) {
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
     * Exception decompiling
     */
    private boolean b(String var1, Object var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl35 : ILOAD : trying to set 1 previously set to 0
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

    private boolean c(String string) {
        if (this.u.enabled() && this.u.matchHit(string)) {
            return true;
        }
        if (this.x.enabled()) {
            if (this.x.matchHit(string)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--->>> white list match! id = ");
                stringBuilder.append(string);
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                return false;
            }
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private void i(Context var1) {
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

    void a(double d3, double d4) {
        Context context = a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress((Context)context)) {
            MLog.e((String)"setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.a == null) {
            AnalyticsConfig.a = new double[2];
        }
        double[] arrd = AnalyticsConfig.a;
        arrd[0] = d3;
        arrd[1] = d4;
    }

    void a(long l2) {
        Context context = a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress((Context)context)) {
            MLog.e((String)"setSessionContinueMillis can not be called in child process");
            return;
        }
        AnalyticsConfig.kContinueSessionMillis = l2;
        y.a().a(AnalyticsConfig.kContinueSessionMillis);
    }

    /*
     * Exception decompiling
     */
    public void a(Context var1) {
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

    public void a(Context context, int n2) {
        if (context == null) {
            MLog.e((String)"unexpected null context in setVerticalType");
            return;
        }
        if (a == null) {
            a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress((Context)a)) {
            MLog.e((String)"setVerticalType can not be called in child process");
            return;
        }
        if (!this.j || !this.n) {
            this.a(a);
        }
        AnalyticsConfig.a((Context)a, (int)n2);
    }

    void a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.e((String)"unexpected null context in setScenarioType");
            return;
        }
        if (a == null) {
            a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress((Context)a)) {
            MLog.e((String)"setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            int n2 = eScenarioType.toValue();
            this.a(a, n2);
        }
        if (!this.j || !this.n) {
            this.a(a);
        }
    }

    void a(Context context, String string) {
        if (context == null) {
            UMLog.aq((String)j.w, (int)0, (String)"\\|");
            return;
        }
        if (a == null) {
            a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress((Context)a)) {
            MLog.e((String)"reportError can not be called in child process");
            return;
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.aq((String)j.x, (int)0, (String)"\\|");
            }
            return;
        }
        try {
            if (!this.j || !this.n) {
                this.a(a);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put("error_source", 2);
            jSONObject.put("context", (Object)string);
            jSONObject.put("__ii", (Object)this.f.c());
            Context context2 = a;
            UMWorkDispatch.sendEvent((Context)context2, (int)4106, (UMLogDataProtocol)CoreProtocol.getInstance(context2), (Object)jSONObject);
            return;
        }
        catch (Throwable throwable) {
            if (MLog.DEBUG) {
                MLog.e((Throwable)throwable);
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public void a(Context var1, String var2, Object var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl556.1 : ALOAD : trying to set 0 previously set to 1
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

    public void a(Context context, String string, String string2, long l2, int n2) {
        String string3;
        if (context == null) {
            return;
        }
        try {
            if (a == null) {
                a = context.getApplicationContext();
            }
            if (!this.j || !this.n) {
                this.a(a);
            }
            if (this.c(string)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--->>> filter ekv [");
                stringBuilder.append(string);
                stringBuilder.append("].");
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                return;
            }
            string3 = "";
        }
        catch (Throwable throwable) {
            if (MLog.DEBUG) {
                MLog.e((Throwable)throwable);
            }
            return;
        }
        if (this.k == null) {
            this.k = new JSONObject();
        } else {
            string3 = this.k.toString();
        }
        String string4 = string3;
        s.a((Context)a).a(string, string2, l2, n2, string4);
    }

    public void a(Context context, String string, HashMap<String, Object> hashMap) {
        String string2;
        if (context == null) {
            return;
        }
        try {
            if (a == null) {
                a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)a)) {
                MLog.e((String)"onGKVEvent can not be called in child process");
                return;
            }
            if (!this.j || !this.n) {
                this.a(a);
            }
            string2 = "";
        }
        catch (Throwable throwable) {
            if (MLog.DEBUG) {
                MLog.e((Throwable)throwable);
            }
            return;
        }
        if (this.k == null) {
            this.k = new JSONObject();
        } else {
            string2 = this.k.toString();
        }
        s.a((Context)a).a(string, hashMap, string2);
    }

    public void a(Context context, String string, Map<String, Object> map) {
        this.a(context, string, map, -1L, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(Context context, String string, Map<String, Object> map, long l2) {
        block6 : {
            try {
                boolean bl2 = TextUtils.isEmpty((CharSequence)string);
                if (bl2) {
                    UMLog.aq((String)j.c, (int)0, (String)"\\|");
                    return;
                }
                if (Arrays.asList((Object[])d.aF).contains((Object)string)) {
                    UMLog.aq((String)j.b, (int)0, (String)"\\|");
                    return;
                }
                if (map.isEmpty()) {
                    UMLog.aq((String)j.d, (int)0, (String)"\\|");
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    if (!Arrays.asList((Object[])d.aF).contains(entry.getKey())) continue;
                    UMLog.aq((String)j.e, (int)0, (String)"\\|");
                    return;
                }
            }
            catch (Throwable throwable) {
                if (!MLog.DEBUG) break block6;
                MLog.e((Throwable)throwable);
            }
        }
        this.a(context, string, map, l2, false);
    }

    void a(Context context, Throwable throwable) {
        if (context != null && throwable != null) {
            if (a == null) {
                a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)a)) {
                MLog.e((String)"reportError can not be called in child process");
                return;
            }
            try {
                if (!this.j || !this.n) {
                    this.a(a);
                }
                this.a(a, DataHelper.convertExceptionToString((Throwable)throwable));
                return;
            }
            catch (Exception exception) {
                if (MLog.DEBUG) {
                    MLog.e((Throwable)exception);
                }
                return;
            }
        }
        UMLog.aq((String)j.y, (int)0, (String)"\\|");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(Context var1_1, List<String> var2_2) {
        var5_3 = this;
        // MONITORENTER : var5_3
        if (var1_1 != null) ** GOTO lbl8
        try {
            UMLog.aq((String)j.aj, (int)0, (String)"\\|");
            // MONITOREXIT : var5_3
            return;
lbl8: // 1 sources:
            if (b.a == null) {
                b.a = var1_1.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)b.a)) {
                MLog.e((String)"setFirstLaunchEvent can not be called in child process");
                // MONITOREXIT : var5_3
                return;
            }
            if (!this.j || !this.n) {
                this.a(b.a);
            }
            s.a((Context)b.a).a(var2_2);
            return;
        }
        catch (Throwable var3_4) {
            MLog.e((Throwable)var3_4);
        }
    }

    /*
     * Exception decompiling
     */
    public void a(Context var1, JSONObject var2) {
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

    public void a(ISysListener iSysListener) {
        if (!UMUtils.isMainProgress((Context)a)) {
            MLog.e((String)"setSysListener can not be called in child process");
            return;
        }
        this.b = iSysListener;
    }

    /*
     * Exception decompiling
     */
    public void a(Object var1) {
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
     * Exception decompiling
     */
    void a(String var1) {
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

    void a(String string, String string2) {
        Context context;
        block5 : {
            try {
                context = a;
                if (context != null) break block5;
                return;
            }
            catch (Throwable throwable) {
                if (MLog.DEBUG) {
                    MLog.e((String)" Excepthon  in  onProfileSignIn", (Throwable)throwable);
                }
                return;
            }
        }
        if (!UMUtils.isMainProgress((Context)context)) {
            MLog.e((String)"onProfileSignIn can not be called in child process");
            return;
        }
        long l2 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("provider", (Object)string);
        jSONObject.put("uid", (Object)string2);
        jSONObject.put("ts", l2);
        Context context2 = a;
        UMWorkDispatch.sendEvent((Context)context2, (int)4101, (UMLogDataProtocol)CoreProtocol.getInstance(context2), (Object)jSONObject);
        Context context3 = a;
        UMWorkDispatch.sendEvent((Context)context3, (int)4356, (UMLogDataProtocol)CoreProtocol.getInstance(context3), (Object)jSONObject);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Throwable throwable) {
        try {
            u u2;
            l l2;
            Context context = a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress((Context)context)) {
                MLog.e((String)"onAppCrash can not be called in child process");
                return;
            }
            if (!AnalyticsConfig.enable) {
                return;
            }
            v v2 = this.d;
            if (v2 != null) {
                v2.b();
            }
            l.a((Context)a, (String)"onAppCrash");
            k k2 = this.e;
            if (k2 != null) {
                k2.b();
            }
            if ((l2 = this.g) != null) {
                l2.c();
            }
            if ((u2 = this.f) != null) {
                u2.c(a, System.currentTimeMillis());
            }
            if (throwable != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("error_source", 1);
                jSONObject.put("context", (Object)DataHelper.convertExceptionToString((Throwable)throwable));
                i.a((Context)a).a(this.f.c(), jSONObject.toString(), 1);
            }
            o.a((Context)a).d();
            v.a((Context)a);
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                l.c((Context)a);
            }
            PreferenceWrapper.getDefault((Context)a).edit().commit();
            return;
        }
        catch (Exception exception) {
            if (MLog.DEBUG) {
                MLog.e((String)"Exception in onAppCrash", (Throwable)exception);
            }
            return;
        }
    }

    void a(GL10 gL10) {
        String[] arrstring = UMUtils.getGPU((GL10)gL10);
        if (arrstring.length == 2) {
            AnalyticsConfig.GPU_VENDER = arrstring[0];
            AnalyticsConfig.GPU_RENDERER = arrstring[1];
        }
    }

    void a(boolean bl2) {
        Context context = a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress((Context)context)) {
            MLog.e((String)"setCatchUncaughtExceptions can not be called in child process");
            return;
        }
        if (!AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
            AnalyticsConfig.CATCH_EXCEPTION = bl2;
        }
    }

    public JSONObject b() {
        return this.k;
    }

    void b(Context context) {
        if (context == null) {
            MLog.e((String)"unexpected null context in onResume");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (a == null) {
            a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress((Context)a)) {
            MLog.e((String)"onResume can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.aq((String)j.o, (int)2, (String)"\\|");
        }
        try {
            if (!this.j || !this.n) {
                this.a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.e.a(context.getClass().getName());
            }
            this.h();
            if (UMConfigure.isDebugLog() && context instanceof Activity) {
                q = context.getClass().getName();
                return;
            }
        }
        catch (Throwable throwable) {
            MLog.e((String)"Exception occurred in Mobclick.onResume(). ", (Throwable)throwable);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b(Context var1_1, String var2_2) {
        if (var1_1 != null) ** GOTO lbl5
        try {
            UMLog.aq((String)"MobclickAgent.onDeepLinkReceived\u65b9\u6cd5Context\u53c2\u6570\u4e0d\u80fd\u4e3anull\u3002|\u53c2\u6570Context\u9700\u8981\u6307\u5b9aApplicationContext\u503c\u3002", (int)0, (String)"\\|");
            return;
lbl5: // 1 sources:
            if (b.a == null) {
                b.a = var1_1.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)b.a)) {
                MLog.e((String)"onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.j || !this.n) {
                this.a(b.a);
            }
            if (!TextUtils.isEmpty((CharSequence)var2_2)) {
                var4_3 = new HashMap();
                var4_3.put((Object)"_$!link", (Object)var2_2);
                this.a(b.a, "_$!deep_link", (Map<String, Object>)var4_3, -1L, false);
                return;
            }
            UMLog.aq((String)"MobclickAgent.onDeepLinkReceived\u65b9\u6cd5link\u53c2\u6570\u4e0d\u80fd\u4e3anull\uff0c\u4e5f\u4e0d\u80fd\u4e3a\u7a7a\u5b57\u7b26\u4e32\u3002|\u53c2\u6570link\u5fc5\u987b\u4e3a\u975e\u7a7a\u5b57\u7b26\u4e32\u3002", (int)0, (String)"\\|");
            return;
        }
        catch (Throwable var3_4) {
            if (MLog.DEBUG == false) return;
            MLog.e((Throwable)var3_4);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public void b(Object var1) {
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
     * Exception decompiling
     */
    void b(String var1) {
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

    public JSONObject c() {
        return this.m;
    }

    void c(Context context) {
        block10 : {
            if (context == null) {
                UMLog.aq((String)j.p, (int)0, (String)"\\|");
                return;
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                return;
            }
            if (a == null) {
                a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)a)) {
                MLog.e((String)"onPause can not be called in child process");
                return;
            }
            if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
                UMLog.aq((String)j.q, (int)2, (String)"\\|");
            }
            try {
                if (!this.j || !this.n) {
                    this.a(context);
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                    this.e.b(context.getClass().getName());
                }
                this.i();
            }
            catch (Throwable throwable) {
                if (!MLog.DEBUG) break block10;
                MLog.e((String)"Exception occurred in Mobclick.onRause(). ", (Throwable)throwable);
            }
        }
        if (UMConfigure.isDebugLog() && context instanceof Activity) {
            r = context.getClass().getName();
        }
    }

    void c(Context context, String string) {
        if (context == null) {
            UMLog.aq((String)"MobclickAgent.setSecret\u65b9\u6cd5\u53c2\u6570context\u4e0d\u80fd\u4e3anull|\u53c2\u6570Context\u9700\u8981\u6307\u5b9aApplicationContext\u503c\u3002", (int)0, (String)"\\|");
            return;
        }
        if (a == null) {
            a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress((Context)a)) {
            MLog.e((String)"setSecret can not be called in child process");
            return;
        }
        if (!this.j || !this.n) {
            this.a(a);
        }
        AnalyticsConfig.a((Context)a, (String)string);
    }

    public JSONObject d() {
        return this.l;
    }

    /*
     * Exception decompiling
     */
    void d(Context var1) {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void d(Context var1_1, String var2_2) {
        var7_3 = this;
        // MONITORENTER : var7_3
        if (var1_1 != null) ** GOTO lbl8
        try {
            UMLog.aq((String)j.ah, (int)0, (String)"\\|");
            // MONITOREXIT : var7_3
            return;
lbl8: // 1 sources:
            if (b.a == null) {
                b.a = var1_1.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)b.a)) {
                MLog.e((String)"unregisterSuperProperty can not be called in child process");
                // MONITOREXIT : var7_3
                return;
            }
            if (!this.j || !this.n) {
                this.a(b.a);
            }
            if (TextUtils.isEmpty((CharSequence)var2_2)) {
                UMLog.aq((String)j.ag, (int)0, (String)"\\|");
                // MONITOREXIT : var7_3
                return;
            }
            if (!(var2_2.equals((Object)"umsp_1") || var2_2.equals((Object)"umsp_2") || var2_2.equals((Object)"umsp_3") || var2_2.equals((Object)"umsp_4") || var2_2.equals((Object)"umsp_5"))) {
                MLog.e((String)"please check key or value, must be correct!");
                // MONITOREXIT : var7_3
                return;
            }
            if (this.k == null) {
                this.k = new JSONObject();
            }
            if (!this.k.has(var2_2)) return;
            {
                this.k.remove(var2_2);
                var6_4 = b.a;
                UMWorkDispatch.sendEvent((Context)var6_4, (int)8197, (UMLogDataProtocol)CoreProtocol.getInstance(var6_4), (Object)var2_2);
                return;
            }
        }
        catch (Throwable var3_5) {
            var3_5.printStackTrace();
        }
    }

    /*
     * Exception decompiling
     */
    public Object e(Context var1, String var2) {
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

    public String e(Context context) {
        b b3 = this;
        synchronized (b3) {
            block9 : {
                block8 : {
                    if (context == null) {
                        UMLog.aq((String)j.ai, (int)0, (String)"\\|");
                        return null;
                    }
                    try {
                        if (a == null) {
                            a = context.getApplicationContext();
                        }
                        if (UMUtils.isMainProgress((Context)a)) break block8;
                        MLog.e((String)"getSuperProperties can not be called in child process");
                        return null;
                    }
                    catch (Throwable throwable) {}
                }
                if (this.k == null) break block9;
                String string = this.k.toString();
                return string;
            }
            this.k = new JSONObject();
            return null;
        }
    }

    public void e() {
        this.l = null;
    }

    public String f() {
        if (!UMUtils.isMainProgress((Context)a)) {
            MLog.e((String)"getOnResumedActivityName can not be called in child process");
            return null;
        }
        return q;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(Context context) {
        b b3 = this;
        synchronized (b3) {
            if (context == null) {
                UMLog.aq((String)j.ah, (int)0, (String)"\\|");
                return;
            }
            if (a == null) {
                a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)a)) {
                MLog.e((String)"clearSuperProperties can not be called in child process");
                return;
            }
            if (!this.j || !this.n) {
                this.a(a);
            }
            this.k = new JSONObject();
            Context context2 = a;
            UMWorkDispatch.sendEvent((Context)context2, (int)8196, (UMLogDataProtocol)CoreProtocol.getInstance(context2), null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(Context context, String string) {
        b b3 = this;
        synchronized (b3) {
            if (context == null) {
                UMLog.aq((String)j.an, (int)0, (String)"\\|");
                return;
            }
            if (a == null) {
                a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)a)) {
                MLog.e((String)"unregisterPreProperty can not be called in child process");
                return;
            }
            if (!this.j || !this.n) {
                this.a(a);
            }
            if (this.m == null) {
                this.m = new JSONObject();
            }
            if (string != null && string.length() > 0) {
                if (this.m.has(string)) {
                    this.m.remove(string);
                    Context context2 = a;
                    UMWorkDispatch.sendEvent((Context)context2, (int)8200, (UMLogDataProtocol)CoreProtocol.getInstance(context2), (Object)this.m.toString());
                } else if (UMConfigure.isDebugLog()) {
                    UMLog.aq((String)j.ao, (int)0, (String)"\\|");
                }
                return;
            }
            MLog.e((String)"please check propertics, property is null!");
            return;
        }
    }

    public String g() {
        if (!UMUtils.isMainProgress((Context)a)) {
            MLog.e((String)"getOnPausedActivityName can not be called in child process");
            return null;
        }
        return r;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(Context context) {
        b b3 = this;
        synchronized (b3) {
            if (context == null) {
                UMLog.aq((String)j.ap, (int)0, (String)"\\|");
                return;
            }
            if (a == null) {
                a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress((Context)a)) {
                MLog.e((String)"clearPreProperties can not be called in child process");
                return;
            }
            if (!this.j || !this.n) {
                this.a(a);
            }
            if (this.m.length() > 0) {
                Context context2 = a;
                UMWorkDispatch.sendEvent((Context)context2, (int)8201, (UMLogDataProtocol)CoreProtocol.getInstance(context2), null);
            }
            this.m = new JSONObject();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public JSONObject h(Context var1) {
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
     * Exception decompiling
     */
    public void h() {
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
     * Exception decompiling
     */
    public void i() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl45.1 : ALOAD_0 : trying to set 1 previously set to 0
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

    void j() {
        Context context;
        block5 : {
            try {
                context = a;
                if (context != null) break block5;
                return;
            }
            catch (Throwable throwable) {
                if (MLog.DEBUG) {
                    MLog.e((String)" Excepthon  in  onProfileSignOff", (Throwable)throwable);
                }
                return;
            }
        }
        if (!UMUtils.isMainProgress((Context)context)) {
            MLog.e((String)"onProfileSignOff can not be called in child process");
            return;
        }
        long l2 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ts", l2);
        Context context2 = a;
        UMWorkDispatch.sendEvent((Context)context2, (int)4102, (UMLogDataProtocol)CoreProtocol.getInstance(context2), (Object)jSONObject);
        Context context3 = a;
        UMWorkDispatch.sendEvent((Context)context3, (int)4356, (UMLogDataProtocol)CoreProtocol.getInstance(context3), (Object)jSONObject);
    }

    /*
     * Exception decompiling
     */
    public void k() {
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
     * Exception decompiling
     */
    public JSONObject l() {
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
     * Exception decompiling
     */
    public void m() {
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

    public void n() {
        UMRTLog.i((String)"MobclickRT", (String)"--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable) {
            if (!FieldManager.b()) {
                return;
            }
            if (FieldManager.allow((String)"header_ekv_send_on_exit")) {
                if (!UMWorkDispatch.eventHasExist((int)8210)) {
                    UMRTLog.i((String)"MobclickRT", (String)"--->>> \u9000\u51fa\u65f6\u53d1\u9001\u7b56\u7565 \u88ab\u89e6\u53d1\uff01");
                    Context context = a;
                    UMWorkDispatch.sendEvent((Context)context, (int)8210, (UMLogDataProtocol)CoreProtocol.getInstance(context), null);
                    return;
                }
            } else {
                UMRTLog.i((String)"MobclickRT", (String)"--->>> \u9000\u51fa\u53d1\u9001\u7b56\u7565: \u4e91\u63a7\u63a7\u5236\u5b57\u5173\u95ed\u3002\u529f\u80fd\u4e0d\u751f\u6548");
            }
        }
    }
}


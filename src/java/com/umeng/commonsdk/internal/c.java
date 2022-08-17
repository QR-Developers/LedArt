/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  com.umeng.commonsdk.UMConfigureImpl
 *  com.umeng.commonsdk.a
 *  com.umeng.commonsdk.config.FieldManager
 *  com.umeng.commonsdk.debug.UMRTLog
 *  com.umeng.commonsdk.framework.UMEnvelopeBuild
 *  com.umeng.commonsdk.framework.UMLogDataProtocol
 *  com.umeng.commonsdk.framework.UMWorkDispatch
 *  com.umeng.commonsdk.internal.b
 *  com.umeng.commonsdk.internal.c$1
 *  com.umeng.commonsdk.internal.c$2
 *  com.umeng.commonsdk.listener.OnGetOaidListener
 *  com.umeng.commonsdk.service.UMGlobalContext
 *  com.umeng.commonsdk.statistics.UMServerURL
 *  com.umeng.commonsdk.utils.UMUtils
 *  com.umeng.commonsdk.utils.onMessageSendListener
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  org.json.JSONObject
 */
package com.umeng.commonsdk.internal;

import android.content.Context;
import android.os.Build;
import com.umeng.analytics.CoreProtocol;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.a;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.b;
import com.umeng.commonsdk.internal.c;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.lang.reflect.Method;
import org.json.JSONObject;

public class c
implements UMLogDataProtocol {
    public static final String a = "um_policy_grant";
    public static final String b = "preInitInvokedFlag";
    public static final String c = "policyGrantInvokedFlag";
    public static final String d = "policyGrantResult";
    private static int f = 1;
    private static final String g = "info";
    private static final String h = "stat";
    private static Class<?> i;
    private static Method j;
    private static Method k;
    private static Method l;
    private static boolean m;
    private Context e;

    static {
        c.c();
    }

    public c(Context context) {
        if (context != null) {
            this.e = context.getApplicationContext();
        }
    }

    private static Class<?> a(String string) {
        try {
            Class class_ = Class.forName((String)string);
            return class_;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", (Object)UMGlobalContext.getInstance((Context)context).getAppkey());
            jSONObject.put("app_version", (Object)UMGlobalContext.getInstance((Context)context).getAppVersion());
            jSONObject.put("os", (Object)"Android");
            JSONObject jSONObject2 = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader((Context)context, (JSONObject)jSONObject, null, (String)UMServerURL.ZCFG_PATH);
            if (jSONObject2 != null && jSONObject2.has("exception")) {
                UMRTLog.e((String)"MobclickRT", (String)"--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587\u5931\u8d25.");
                return;
            }
            UMRTLog.e((String)"MobclickRT", (String)"--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587 \u6210\u529f!!!");
            return;
        }
        catch (Throwable throwable) {}
    }

    private static void a(Context context, OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        new Thread((Runnable)new 2(context.getApplicationContext(), onGetOaidListener)).start();
    }

    /*
     * Exception decompiling
     */
    public static String b() {
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

    private static void b(Context context) {
        new Thread((Runnable)new 1(context)).start();
    }

    /*
     * Exception decompiling
     */
    private static void c() {
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

    private static void c(final Context context) {
        if (FieldManager.allow((String)"header_device_oaid") && Build.VERSION.SDK_INT > 28) {
            c.a(context, new OnGetOaidListener(){

                /*
                 * Exception decompiling
                 */
                public void onGetOaid(String var1) {
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
            });
        }
    }

    /*
     * Exception decompiling
     */
    private void d() {
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
    private void d(Context var1) {
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

    private void e() {
        if (!m) {
            if (FieldManager.allow((String)"header_device_oaid") && Build.VERSION.SDK_INT > 28) {
                m = true;
                OnGetOaidListener onGetOaidListener = new OnGetOaidListener(){

                    /*
                     * Exception decompiling
                     */
                    public void onGetOaid(String var1) {
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
                };
                c.a(this.e, onGetOaidListener);
                return;
            }
        } else if (!FieldManager.allow((String)"header_device_oaid")) {
            m = false;
        }
    }

    /*
     * Exception decompiling
     */
    private static void e(Context var0) {
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

    private void f() {
        if (FieldManager.allow((String)"header_device_oaid") && Build.VERSION.SDK_INT > 28) {
            m = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init((Context)this.e);
            f = 1 + f;
            UMRTLog.e((String)"MobclickRT", (String)"--->>> \u8981\u8bfb\u53d6 oaid\uff0c\u9700\u7b49\u5f85\u8bfb\u53d6\u7ed3\u679c.");
            UMConfigureImpl.registerMessageSendListener((onMessageSendListener)new onMessageSendListener(){

                public void onMessageSend() {
                    if (c.this.e != null) {
                        UMWorkDispatch.sendEvent((Context)c.this.e, (int)32790, (UMLogDataProtocol)b.a((Context)c.this.e).a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener((onMessageSendListener)this);
                }
            });
            c.b(this.e);
        }
    }

    private void g() {
        if (f <= 0) {
            this.h();
            this.d(this.e);
        }
    }

    private void h() {
        UMRTLog.e((String)"MobclickRT", (String)"--->>> \u771f\u5b9e\u6784\u5efa\u6761\u4ef6\u6ee1\u8db3\uff0c\u5f00\u59cb\u6784\u5efa\u4e1a\u52a1\u4fe1\u5c01\u3002");
        if (UMUtils.isMainProgress((Context)this.e)) {
            c.e(this.e);
            a.a((Context)this.e);
            Context context = this.e;
            UMWorkDispatch.sendEvent((Context)context, (int)8208, (UMLogDataProtocol)CoreProtocol.getInstance(context), null);
            Context context2 = this.e;
            UMWorkDispatch.sendEvent((Context)context2, (int)32785, (UMLogDataProtocol)b.a((Context)context2).a(), null);
        }
    }

    /*
     * Exception decompiling
     */
    public String a() {
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

    public void removeCacheData(Object object) {
    }

    public JSONObject setupReportData(long l2) {
        return null;
    }

    /*
     * Exception decompiling
     */
    public void workEvent(Object var1, int var2) {
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

}


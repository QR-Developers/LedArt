/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  com.umeng.analytics.AnalyticsConfig
 *  com.umeng.analytics.pro.o
 *  com.umeng.analytics.pro.o$c
 *  com.umeng.analytics.pro.r
 *  com.umeng.analytics.process.DBFileTraversalUtil
 *  com.umeng.analytics.process.UMProcessDBDatasSender$1
 *  com.umeng.analytics.process.UMProcessDBHelper
 *  com.umeng.analytics.process.b
 *  com.umeng.commonsdk.debug.UMRTLog
 *  com.umeng.commonsdk.framework.UMEnvelopeBuild
 *  com.umeng.commonsdk.framework.UMLogDataProtocol
 *  com.umeng.commonsdk.statistics.common.HelperUtils
 *  com.umeng.commonsdk.statistics.internal.PreferenceWrapper
 *  com.umeng.commonsdk.utils.FileLockCallback
 *  com.umeng.commonsdk.utils.FileLockUtil
 *  com.umeng.commonsdk.utils.UMUtils
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONObject
 */
package com.umeng.analytics.process;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.r;
import com.umeng.analytics.process.DBFileTraversalUtil;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.analytics.process.b;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class UMProcessDBDatasSender
implements UMLogDataProtocol {
    public static final int UM_PROCESS_CONSTRUCTMESSAGE = 36946;
    public static final int UM_PROCESS_EVENT_KEY = 36945;
    private static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
    private static UMProcessDBDatasSender mInstance;
    private Context mContext;
    private List<Integer> mGeneralBodyIds;
    private FileLockUtil mLockUtil = new FileLockUtil();
    private o.c mPolicySelector;

    private UMProcessDBDatasSender() {
    }

    private void constructMessage() {
        if (this.defconProcesserHandler() != 0) {
            return;
        }
        this.mLockUtil.doFileOperateion(b.b((Context)this.mContext, (String)""), (FileLockCallback)new ConstructMessageCallback());
    }

    private int defconProcesserHandler() {
        int n2 = r.a().a(this.mContext);
        if (n2 != 0) {
            try {
                DBFileTraversalUtil.traverseDBFiles((String)b.a((Context)this.mContext), (FileLockCallback)new ReplaceCallback(), null);
            }
            catch (Exception exception) {}
            UMProcessDBHelper.getInstance((Context)this.mContext).deleteEventDatas("_main_", null, null);
        }
        return n2;
    }

    /*
     * Exception decompiling
     */
    private JSONObject generalBody() {
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
     * Lifted jumps to return sites
     */
    private JSONObject generalHeader() {
        block13 : {
            block12 : {
                var1_1 = new JSONObject();
                try {
                    if (AnalyticsConfig.mWrapperType != null && (var28_2 = AnalyticsConfig.mWrapperVersion) != null) {
                        var1_1.put("wrapper_version", (Object)var28_2);
                        var1_1.put("wrapper_type", (Object)AnalyticsConfig.mWrapperType);
                    }
                    var1_1.put("vertical_type", AnalyticsConfig.getVerticalType((Context)this.mContext));
                    var4_3 = AnalyticsConfig.getVerticalType((Context)this.mContext);
                    var5_4 = "9.4.4";
                    if (var4_3 == 1) {
                        var26_5 = AnalyticsConfig.getGameSdkVersion((Context)this.mContext);
                        if (!TextUtils.isEmpty((CharSequence)var26_5)) break block12;
                        break block13;
                    }
                    var1_1.put("sdk_version", (Object)var5_4);
lbl14: // 2 sources:
                    do {
                        var7_6 = this.mGeneralBodyIds.size();
                        var8_7 = "";
                        if (var7_6 > 0 && (var25_8 = UMProcessDBHelper.getInstance((Context)this.mContext).readVersionInfoFromColumId((Integer)this.mGeneralBodyIds.get(0))) != null) {
                            var8_7 = var25_8.optString("__av");
                            var9_9 = var25_8.optString("__vc");
                        } else {
                            var9_9 = var8_7;
                        }
                        if (var10_10 = TextUtils.isEmpty((CharSequence)var8_7)) {
                            var1_1.put("app_version", (Object)UMUtils.getAppVersionName((Context)this.mContext));
                        } else {
                            var1_1.put("app_version", (Object)var8_7);
                        }
                        var12_11 = TextUtils.isEmpty((CharSequence)var9_9);
                        if (var12_11) {
                            var1_1.put("version_code", (Object)UMUtils.getAppVersionCode((Context)this.mContext));
                        } else {
                            var1_1.put("version_code", (Object)var9_9);
                        }
                        var14_12 = HelperUtils.MD5((String)AnalyticsConfig.getSecretKey((Context)this.mContext));
                        if (!TextUtils.isEmpty((CharSequence)var14_12)) {
                            var1_1.put("secret", (Object)var14_12);
                        }
                        var15_13 = UMEnvelopeBuild.imprintProperty((Context)this.mContext, (String)"pr_ve", null);
                        var16_14 = PreferenceWrapper.getDefault((Context)this.mContext);
                        var1_1.put("$pr_ve", (Object)UMEnvelopeBuild.imprintProperty((Context)this.mContext, (String)"pr_ve", null));
                        var1_1.put("$ud_da", (Object)UMEnvelopeBuild.imprintProperty((Context)this.mContext, (String)"ud_da", null));
                        var1_1.put("pro_ver", (Object)"1.0.0");
                        if (TextUtils.isEmpty((CharSequence)var15_13) == false) return var1_1;
                        var1_1.put("$pr_ve", (Object)var16_14.getString("vers_pre_version", "0"));
                        var1_1.put("$ud_da", (Object)var16_14.getString("vers_date", new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()))));
                        return var1_1;
                        break;
                    } while (true);
                }
                catch (Throwable var2_15) {
                    var2_15.printStackTrace();
                }
                return var1_1;
            }
            var5_4 = var26_5;
        }
        var1_1.put("sdk_version", (Object)var5_4);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static UMProcessDBDatasSender getInstance(Context context) {
        if (mInstance == null) {
            Class<UMProcessDBDatasSender> class_ = UMProcessDBDatasSender.class;
            // MONITORENTER : com.umeng.analytics.process.UMProcessDBDatasSender.class
            if (mInstance == null) {
                mInstance = new UMProcessDBDatasSender();
            }
            // MONITOREXIT : class_
        }
        UMProcessDBDatasSender uMProcessDBDatasSender = mInstance;
        uMProcessDBDatasSender.mContext = context;
        return uMProcessDBDatasSender;
    }

    public void removeCacheData(Object object) {
        List<Integer> list;
        if (object != null && (list = this.mGeneralBodyIds) != null) {
            JSONObject jSONObject;
            if (list.size() == 0) {
                return;
            }
            JSONObject jSONObject2 = (JSONObject)object;
            if (jSONObject2.has("analytics") && (jSONObject = jSONObject2.optJSONObject("analytics")) != null && jSONObject.length() > 0 && jSONObject.has("ekv")) {
                UMProcessDBHelper.getInstance((Context)this.mContext).deleteMainProcessEventDatasByIds(this.mGeneralBodyIds);
                this.mGeneralBodyIds.clear();
            }
        }
    }

    /*
     * Exception decompiling
     */
    public JSONObject setupReportData(long var1) {
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

    public void workEvent(Object object, int n2) {
        if (!UMUtils.isMainProgress((Context)this.mContext)) {
            return;
        }
        switch (n2) {
            default: {
                return;
            }
            case 36946: {
                UMRTLog.i((String)"MobclickRT", (String)"--->>> recv UM_PROCESS_CONSTRUCTMESSAGE msg.");
                this.constructMessage();
                return;
            }
            case 36945: 
        }
        executor.schedule((Runnable)new 1(this), 5L, TimeUnit.SECONDS);
    }

    private class ConstructMessageCallback
    implements FileLockCallback {
        private ConstructMessageCallback() {
        }

        public boolean onFileLock(File file, int n2) {
            return false;
        }

        public boolean onFileLock(String string) {
            UMProcessDBDatasSender uMProcessDBDatasSender = UMProcessDBDatasSender.this;
            JSONObject jSONObject = uMProcessDBDatasSender.setupReportData(UMEnvelopeBuild.maxDataSpace((Context)uMProcessDBDatasSender.mContext));
            if (jSONObject != null) {
                JSONObject jSONObject2;
                if (jSONObject.length() < 1) {
                    return true;
                }
                JSONObject jSONObject3 = (JSONObject)jSONObject.opt("header");
                JSONObject jSONObject4 = (JSONObject)jSONObject.opt("content");
                if (UMProcessDBDatasSender.this.mContext != null && jSONObject3 != null && jSONObject4 != null && (jSONObject2 = UMEnvelopeBuild.buildEnvelopeWithExtHeader((Context)UMProcessDBDatasSender.this.mContext, (JSONObject)jSONObject3, (JSONObject)jSONObject4)) != null) {
                    UMProcessDBDatasSender.this.removeCacheData((Object)jSONObject2);
                }
            }
            return true;
        }

        public boolean onFileLock(String string, Object object) {
            return false;
        }
    }

    private class ReplaceCallback
    implements FileLockCallback {
        private ReplaceCallback() {
        }

        public boolean onFileLock(File file, int n2) {
            return false;
        }

        public boolean onFileLock(String string) {
            if (TextUtils.isEmpty((CharSequence)string)) {
                return true;
            }
            if (string.startsWith("ua_")) {
                string = string.replaceFirst("ua_", "");
            }
            String string2 = string.replace((CharSequence)".db", (CharSequence)"");
            UMProcessDBHelper.getInstance((Context)UMProcessDBDatasSender.this.mContext).deleteEventDatas(string2, null, null);
            return true;
        }

        public boolean onFileLock(String string, Object object) {
            return false;
        }
    }

}


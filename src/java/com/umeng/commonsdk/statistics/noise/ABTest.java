/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.umeng.commonsdk.framework.UMEnvelopeBuild
 *  com.umeng.commonsdk.statistics.common.MLog
 *  com.umeng.commonsdk.statistics.idtracking.Envelope
 *  com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a
 *  com.umeng.commonsdk.statistics.internal.d
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.d;

public class ABTest
implements d {
    private static ABTest instance;
    private Context context = null;
    private boolean isInTest = false;
    private int mGroup = -1;
    private int mInterval = -1;
    private String mPoli = null;
    private int mPolicy = -1;
    private float mProb07 = 0.0f;
    private float mProb13 = 0.0f;

    private ABTest(Context context, String string, int n2) {
        this.context = context;
        this.onExperimentChanged(string, n2);
    }

    public static ABTest getService(Context context) {
        Class<ABTest> class_ = ABTest.class;
        synchronized (ABTest.class) {
            if (instance == null) {
                instance = new ABTest(context, UMEnvelopeBuild.imprintProperty((Context)context, (String)"client_test", null), Integer.valueOf((String)UMEnvelopeBuild.imprintProperty((Context)context, (String)"test_report_interval", (String)"0")));
            }
            ABTest aBTest = instance;
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return aBTest;
        }
    }

    /*
     * Exception decompiling
     */
    private void parseFIXED(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl125.1 : ILOAD : trying to set 1 previously set to 0
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
     * Exception decompiling
     */
    private void parseSig7(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl147.1 : ICONST_0 : trying to set 1 previously set to 0
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

    private float prob(String string, int n2) {
        int n3 = n2 * 2;
        if (string == null) {
            return 0.0f;
        }
        return (float)Integer.valueOf((String)string.substring(n3, n3 + 5), (int)16).intValue() / 1048576.0f;
    }

    public static boolean validate(String string) {
        int n2;
        int n3;
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        String[] arrstring = string.split("\\|");
        if (arrstring.length != 6) {
            return false;
        }
        if (arrstring[0].startsWith("SIG7") && arrstring[1].split(",").length == arrstring[5].split(",").length) {
            return true;
        }
        return arrstring[0].startsWith("FIXED") && (n2 = arrstring[5].split(",").length) >= (n3 = Integer.parseInt((String)arrstring[1])) && n3 >= 1;
    }

    public int getGroup() {
        return this.mGroup;
    }

    public String getGroupInfo() {
        if (!this.isInTest) {
            return "error";
        }
        return String.valueOf((int)this.mGroup);
    }

    public int getTestInterval() {
        return this.mInterval;
    }

    public String getTestName() {
        return this.mPoli;
    }

    public int getTestPolicy() {
        return this.mPolicy;
    }

    public boolean isInTest() {
        return this.isInTest;
    }

    public void onExperimentChanged(String string, int n2) {
        this.mInterval = n2;
        String string2 = Envelope.getSignature((Context)this.context);
        if (!TextUtils.isEmpty((CharSequence)string2) && !TextUtils.isEmpty((CharSequence)string)) {
            try {
                this.mProb13 = this.prob(string2, 12);
                this.mProb07 = this.prob(string2, 6);
                if (string.startsWith("SIG7")) {
                    this.parseSig7(string);
                    return;
                }
                if (string.startsWith("FIXED")) {
                    this.parseFIXED(string);
                    return;
                }
            }
            catch (Exception exception) {
                this.isInTest = false;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("v:");
                stringBuilder.append(string);
                MLog.e((String)stringBuilder.toString(), (Throwable)exception);
            }
            return;
        }
        this.isInTest = false;
    }

    public void onImprintChanged(ImprintHandler.a a3) {
        this.onExperimentChanged(a3.a("client_test", null), Integer.valueOf((String)a3.a("test_report_interval", "0")));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" p13:");
        stringBuilder.append(this.mProb13);
        stringBuilder.append(" p07:");
        stringBuilder.append(this.mProb07);
        stringBuilder.append(" policy:");
        stringBuilder.append(this.mPolicy);
        stringBuilder.append(" interval:");
        stringBuilder.append(this.mInterval);
        return stringBuilder.toString();
    }
}


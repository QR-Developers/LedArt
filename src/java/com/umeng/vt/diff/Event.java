/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  com.umeng.analytics.MobclickAgent
 *  com.umeng.commonsdk.debug.UMRTLog
 *  com.umeng.tunnel.UMChannelAgent
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package com.umeng.vt.diff;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.tunnel.UMChannelAgent;
import java.util.Map;

public class Event {
    private static final int MAX_PROPERTY_LENGTH = 128;

    public static void commit(Context context, View view, String string2, Map<String, Object> map, Boolean bl) {
        boolean bl2 = bl;
        Integer n2 = 1;
        if (bl2) {
            if (UMChannelAgent.init()) {
                if (view != null) {
                    String string3 = Event.textPropertyFromView(view);
                    if (!TextUtils.isEmpty((CharSequence)string3)) {
                        map.put((Object)"_$!text", (Object)string3);
                    }
                    map.put((Object)"_$!pg", (Object)view.getContext().getClass().getName());
                } else {
                    map.put((Object)"_$!pg", (Object)context.getClass().getName());
                }
                map.put((Object)"_$!style", (Object)n2);
                map.put((Object)"_$!uapp_pg", (Object)Event.getPageName());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("config:\u4e8b\u4ef6\u540d: ");
                stringBuilder.append(string2);
                UMRTLog.e((String)"MobclickRT", (String)stringBuilder.toString());
                if (map.containsKey((Object)"_$!text")) {
                    String string4 = (String)map.get((Object)"_$!text");
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("config:\u4e8b\u4ef6\u540d: ");
                    stringBuilder2.append(string2);
                    stringBuilder2.append("; \u53c2\u6570\uff1a");
                    stringBuilder2.append(string4);
                    UMRTLog.e((String)"MobclickRT", (String)stringBuilder2.toString());
                }
                if (map.containsKey((Object)"_$!pg")) {
                    String string5 = (String)map.get((Object)"_$!pg");
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("config:\u4e8b\u4ef6\u540d: ");
                    stringBuilder3.append(string2);
                    stringBuilder3.append("; \u9875\u9762\uff1a");
                    stringBuilder3.append(string5);
                    UMRTLog.e((String)"MobclickRT", (String)stringBuilder3.toString());
                }
                if (map.containsKey((Object)"_$!uapp_pg")) {
                    String string6 = (String)map.get((Object)"_$!uapp_pg");
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("config:\u4e8b\u4ef6\u540d: ");
                    stringBuilder4.append(string2);
                    stringBuilder4.append("; UApp\u9875\u9762\u8def\u5f84\uff1a");
                    stringBuilder4.append(string6);
                    UMRTLog.e((String)"MobclickRT", (String)stringBuilder4.toString());
                }
                UMChannelAgent.onDebugEvent((Context)context, (String)string2, map);
                return;
            }
        } else {
            if (view != null) {
                String string7 = Event.textPropertyFromView(view);
                if (!TextUtils.isEmpty((CharSequence)string7)) {
                    map.put((Object)"_$!text", (Object)string7);
                }
                map.put((Object)"_$!pg", (Object)view.getContext().getClass().getName());
            } else {
                map.put((Object)"_$!pg", (Object)context.getClass().getName());
            }
            map.put((Object)"_$!style", (Object)n2);
            map.put((Object)"_$!uapp_pg", (Object)Event.getPageName());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("release:\u4e8b\u4ef6\u540d: ");
            stringBuilder.append(string2);
            UMRTLog.e((String)"MobclickRT", (String)stringBuilder.toString());
            if (map.containsKey((Object)"_$!text")) {
                String string8 = (String)map.get((Object)"_$!text");
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("release:\u4e8b\u4ef6\u540d: ");
                stringBuilder5.append(string2);
                stringBuilder5.append("; \u53c2\u6570\uff1a");
                stringBuilder5.append(string8);
                UMRTLog.e((String)"MobclickRT", (String)stringBuilder5.toString());
            }
            if (map.containsKey((Object)"_$!pg")) {
                String string9 = (String)map.get((Object)"_$!pg");
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("release:\u4e8b\u4ef6\u540d: ");
                stringBuilder6.append(string2);
                stringBuilder6.append("; \u9875\u9762\uff1a");
                stringBuilder6.append(string9);
                UMRTLog.e((String)"MobclickRT", (String)stringBuilder6.toString());
            }
            if (map.containsKey((Object)"_$!uapp_pg")) {
                String string10 = (String)map.get((Object)"_$!uapp_pg");
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append("release:\u4e8b\u4ef6\u540d: ");
                stringBuilder7.append(string2);
                stringBuilder7.append("; UApp\u9875\u9762\u8def\u5f84\uff1a");
                stringBuilder7.append(string10);
                UMRTLog.e((String)"MobclickRT", (String)stringBuilder7.toString());
            }
            MobclickAgent.onEventObject((Context)context, (String)string2, map);
        }
    }

    public static String getActivityName(View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper)context).getBaseContext();
            }
            if (context instanceof Activity) {
                return context.getClass().getCanonicalName();
            }
        }
        return null;
    }

    public static String getPageName() {
        String string2 = PageNameMonitor.getInstance().getCurrenPageName();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string2 = "";
        }
        return string2;
    }

    public static String getPageName(View view) {
        String string2 = Event.getPageName();
        if (string2 == null || string2.equals((Object)"") || string2.equals((Object)"VT")) {
            String string3 = Event.getActivityName(view);
            if (string3 != null && !string3.equals((Object)"")) {
                return string3;
            }
            string2 = "VT";
        }
        return string2;
    }

    public static void init(Context context, String string2, String string3, int n2, String string4) {
    }

    public static void openDebug(String string2) {
    }

    /*
     * Exception decompiling
     */
    private static void reflectTrack(Context var0, String var1, Map<String, Object> var2) {
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

    private static String textPropertyFromView(View view) {
        String string2;
        if (view instanceof TextView) {
            CharSequence charSequence = ((TextView)view).getText();
            string2 = null;
            if (charSequence != null) {
                return charSequence.toString();
            }
        } else {
            boolean bl = view instanceof ViewGroup;
            string2 = null;
            if (bl) {
                StringBuilder stringBuilder = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup)view;
                int n2 = viewGroup.getChildCount();
                boolean bl2 = false;
                for (int i2 = 0; i2 < n2 && stringBuilder.length() < 128; ++i2) {
                    String string3 = Event.textPropertyFromView(viewGroup.getChildAt(i2));
                    if (string3 == null || string3.length() <= 0) continue;
                    if (bl2) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(string3);
                    bl2 = true;
                }
                if (stringBuilder.length() > 128) {
                    return stringBuilder.substring(0, 128);
                }
                string2 = null;
                if (bl2) {
                    string2 = stringBuilder.toString();
                }
            }
        }
        return string2;
    }
}


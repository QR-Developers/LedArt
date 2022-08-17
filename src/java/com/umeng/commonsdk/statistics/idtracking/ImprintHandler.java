/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.umeng.analytics.pro.at
 *  com.umeng.analytics.pro.aw
 *  com.umeng.analytics.pro.bc
 *  com.umeng.commonsdk.debug.UMRTLog
 *  com.umeng.commonsdk.internal.crash.UMCrashManager
 *  com.umeng.commonsdk.statistics.AnalyticsConstants
 *  com.umeng.commonsdk.statistics.common.DataHelper
 *  com.umeng.commonsdk.statistics.common.HelperUtils
 *  com.umeng.commonsdk.statistics.common.ULog
 *  com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a
 *  com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
 *  com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
 *  com.umeng.commonsdk.statistics.internal.d
 *  com.umeng.commonsdk.utils.FileLockCallback
 *  com.umeng.commonsdk.utils.FileLockUtil
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 */
package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.statistics.proto.d;
import com.umeng.commonsdk.statistics.proto.e;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Exception performing whole class analysis.
 */
public class ImprintHandler
implements FileLockCallback {
    private static final String a = "ImprintHandler";
    private static Object b;
    private static final String c = ".imprint";
    private static final byte[] d;
    private static Map<String, ArrayList<UMImprintChangeCallback>> f;
    private static Object g;
    private static ImprintHandler j;
    private static Context k;
    private static FileLockUtil l;
    private static final int m = 0;
    private static final int n = 1;
    private static Map<String, UMImprintPreProcessCallback> o;
    private static Object p;
    private com.umeng.commonsdk.statistics.internal.d e;
    private a h;
    private d i;

    static {
        b = new Object();
        d = "pbl0".getBytes();
        f = new HashMap();
        g = new Object();
        j = null;
        o = new HashMap();
        p = new Object();
    }

    private ImprintHandler(Context context) {
        this.h = new /* Unavailable Anonymous Inner Class!! */;
        this.i = null;
        k = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private d a(d d3, d d4, Map<String, String> map) {
        if (d4 == null) {
            return d3;
        }
        Map<String, e> map2 = d3.c();
        Iterator iterator = d4.c().entrySet().iterator();
        do {
            Object object;
            if (!iterator.hasNext()) {
                d3.a(d4.f());
                d3.a(this.a(d3));
                return d3;
            }
            Map.Entry entry = (Map.Entry)iterator.next();
            if (((e)entry.getValue()).d()) {
                Object object2;
                String string = (String)entry.getKey();
                String string2 = ((e)entry.getValue()).a;
                Object object3 = object2 = p;
                // MONITORENTER : object3
                boolean bl2 = TextUtils.isEmpty((CharSequence)string);
                boolean bl3 = false;
                if (!bl2) {
                    boolean bl4 = o.containsKey((Object)string);
                    bl3 = false;
                    if (bl4) {
                        UMImprintPreProcessCallback uMImprintPreProcessCallback = (UMImprintPreProcessCallback)o.get((Object)string);
                        bl3 = false;
                        if (uMImprintPreProcessCallback != null) {
                            boolean bl5 = uMImprintPreProcessCallback.onPreProcessImprintKey(string, string2);
                            bl3 = false;
                            if (bl5) {
                                bl3 = true;
                            }
                        }
                    }
                }
                // MONITOREXIT : object3
                if (!bl3) {
                    Object object4;
                    map2.put(entry.getKey(), entry.getValue());
                    Object object5 = object4 = g;
                    // MONITORENTER : object5
                    if (!TextUtils.isEmpty((CharSequence)string) && f.containsKey((Object)string) && (ArrayList)f.get((Object)string) != null) {
                        map.put((Object)string, (Object)string2);
                    }
                    // MONITOREXIT : object5
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--->>> merge: [");
                stringBuilder.append(string);
                stringBuilder.append("] should be ignored.");
                UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                continue;
            }
            String string = (String)entry.getKey();
            Object object6 = object = g;
            // MONITORENTER : object6
            if (!TextUtils.isEmpty((CharSequence)string) && f.containsKey((Object)string)) {
                ArrayList arrayList = (ArrayList)f.get((Object)string);
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                        ((UMImprintChangeCallback)arrayList.get(i2)).onImprintValueChanged(string, null);
                    }
                }
            }
            // MONITOREXIT : object6
            map2.remove((Object)string);
            this.h.a(string);
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void a(File file) {
        if (this.i == null) {
            return;
        }
        try {
            Object object;
            Object object2 = object = b;
            // MONITORENTER : object2
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        byte[] arrby = new bc().a((at)this.i);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(arrby);
            fileOutputStream.flush();
            return;
        }
        finally {
            HelperUtils.safeClose((OutputStream)fileOutputStream);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void a(String string, UMImprintChangeCallback uMImprintChangeCallback) {
        Object object;
        Object object2 = object = g;
        // MONITORENTER : object2
        try {
            int n2;
            ArrayList arrayList;
            int n3;
            boolean bl2 = f.containsKey((Object)string);
            if (!bl2) {
                arrayList = new ArrayList();
                n3 = arrayList.size();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--->>> addCallback: before add: callbacks size is: ");
                stringBuilder.append(n3);
                ULog.i((String)stringBuilder.toString());
            } else {
                ArrayList arrayList2 = (ArrayList)f.get((Object)string);
                int n4 = arrayList2.size();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--->>> addCallback: before add: callbacks size is: ");
                stringBuilder.append(n4);
                ULog.i((String)stringBuilder.toString());
                for (n2 = 0; n2 < n4; ++n2) {
                    if (uMImprintChangeCallback != arrayList2.get(n2)) continue;
                    ULog.i((String)"--->>> addCallback: callback has exist, just exit");
                    // MONITOREXIT : object2
                    return;
                }
                arrayList2.add((Object)uMImprintChangeCallback);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("--->>> addCallback: after add: callbacks size is: ");
                stringBuilder2.append(arrayList2.size());
                ULog.i((String)stringBuilder2.toString());
                return;
            }
            while (n2 < n3) {
                if (uMImprintChangeCallback == arrayList.get(n2)) {
                    ULog.i((String)"--->>> addCallback: callback has exist, just exit");
                    // MONITOREXIT : object2
                    return;
                }
                ++n2;
            }
            arrayList.add((Object)uMImprintChangeCallback);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("--->>> addCallback: after add: callbacks size is: ");
            stringBuilder.append(arrayList.size());
            ULog.i((String)stringBuilder.toString());
            f.put((Object)string, (Object)arrayList);
            return;
        }
        catch (Throwable throwable) {
            UMCrashManager.reportCrash((Context)k, (Throwable)throwable);
            // MONITOREXIT : object2
            return;
        }
    }

    private boolean a(String string, String string2) {
        if (string == null) {
            return string2 == null;
        }
        return string.equals((Object)string2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void b(String var0, UMImprintChangeCallback var1_1) {
        if (TextUtils.isEmpty((CharSequence)var0) != false) return;
        if (var1_1 == null) {
            return;
        }
        var22_3 = var2_2 = ImprintHandler.g;
        // MONITORENTER : var22_3
        try {
            if (ImprintHandler.f.containsKey((Object)var0) && (var5_4 = (ArrayList)ImprintHandler.f.get((Object)var0)).size() > 0) {
                var6_5 = var5_4.size();
                var7_6 = new StringBuilder();
                var7_6.append("--->>> removeCallback: before remove: callbacks size is: ");
                var7_6.append(var6_5);
                ULog.i((String)var7_6.toString());
                var10_7 = 0;
            }
            ** GOTO lbl40
        }
        catch (Throwable var3_11) {
            UMCrashManager.reportCrash((Context)ImprintHandler.k, (Throwable)var3_11);
            return;
        }
        do {
            block12 : {
                block11 : {
                    if (var10_7 >= var6_5) break block11;
                    if (var1_1 != var5_4.get(var10_7)) break block12;
                    var11_8 = new StringBuilder();
                    var11_8.append("--->>> removeCallback: remove index ");
                    var11_8.append(var10_7);
                    ULog.i((String)var11_8.toString());
                    var5_4.remove(var10_7);
                }
                var15_9 = new StringBuilder();
                var15_9.append("--->>> removeCallback: after remove: callbacks size is: ");
                var15_9.append(var5_4.size());
                ULog.i((String)var15_9.toString());
                if (var5_4.size() == 0) {
                    var18_10 = new StringBuilder();
                    var18_10.append("--->>> removeCallback: remove key from map: key = ");
                    var18_10.append(var0);
                    ULog.i((String)var18_10.toString());
                    ImprintHandler.f.remove((Object)var0);
                    return;
                }
lbl40: // 3 sources:
                // MONITOREXIT : var22_3
                return;
            }
            ++var10_7;
        } while (true);
    }

    private boolean c(d d3) {
        if (!d3.i().equals((Object)this.a(d3))) {
            return false;
        }
        for (e e3 : d3.c().values()) {
            byte[] arrby = DataHelper.reverseHexString((String)e3.h());
            byte[] arrby2 = this.a(e3);
            for (int i2 = 0; i2 < 4; ++i2) {
                if (arrby[i2] == arrby2[i2]) continue;
                return false;
            }
        }
        return true;
    }

    private d d(d d3) {
        Map<String, e> map = d3.c();
        if (map.containsKey((Object)"umtt")) {
            map.remove((Object)"umtt");
            this.h.a("umtt");
            d3.a(d3.f());
            d3.a(this.a(d3));
        }
        return d3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private d e(d d3) {
        Map<String, e> map = d3.c();
        ArrayList arrayList = new ArrayList(map.size() / 2);
        for (Map.Entry entry : map.entrySet()) {
            UMImprintPreProcessCallback uMImprintPreProcessCallback;
            Object object;
            Object object2;
            if (!((e)entry.getValue()).d()) {
                arrayList.add(entry.getKey());
                continue;
            }
            String string = (String)entry.getKey();
            String string2 = ((e)entry.getValue()).a;
            Object object3 = object = p;
            // MONITORENTER : object3
            boolean bl2 = !TextUtils.isEmpty((CharSequence)string) && o.containsKey((Object)string) && (uMImprintPreProcessCallback = (UMImprintPreProcessCallback)o.get((Object)string)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(string, string2);
            // MONITOREXIT : object3
            if (bl2) {
                arrayList.add((Object)string);
            }
            Object object4 = object2 = g;
            // MONITORENTER : object4
            if (!TextUtils.isEmpty((CharSequence)string) && f.containsKey((Object)string)) {
                ArrayList arrayList2 = (ArrayList)f.get((Object)string);
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
                        ((UMImprintChangeCallback)arrayList2.get(i2)).onImprintValueChanged(string, string2);
                    }
                }
            }
            // MONITOREXIT : object4
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object object;
            ArrayList arrayList3;
            String string = (String)iterator.next();
            Object object5 = object = g;
            // MONITORENTER : object5
            if (!TextUtils.isEmpty((CharSequence)string) && f.containsKey((Object)string) && (arrayList3 = (ArrayList)f.get((Object)string)) != null) {
                for (int i3 = 0; i3 < arrayList3.size(); ++i3) {
                    ((UMImprintChangeCallback)arrayList3.get(i3)).onImprintValueChanged(string, null);
                }
            }
            // MONITOREXIT : object5
            map.remove((Object)string);
        }
        return d3;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void e() {
        FileInputStream fileInputStream;
        Throwable throwable;
        block18 : {
            byte[] arrby;
            block16 : {
                block17 : {
                    block15 : {
                        Object object;
                        File file = new File(k.getFilesDir(), c);
                        Object object2 = object = b;
                        // MONITORENTER : object2
                        if (file.exists()) break block15;
                        // MONITOREXIT : object2
                        return;
                    }
                    fileInputStream = k.openFileInput(c);
                    try {
                        arrby = HelperUtils.readStreamToByteArray((InputStream)fileInputStream);
                        break block16;
                    }
                    catch (Exception exception) {
                        break block17;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        fileInputStream = null;
                        break block18;
                    }
                    catch (Exception exception) {
                        fileInputStream = null;
                    }
                }
                try {
                    void var4_8;
                    var4_8.printStackTrace();
                    arrby = null;
                }
                catch (Throwable throwable3) {}
            }
            HelperUtils.safeClose((InputStream)fileInputStream);
            if (arrby == null) return;
            try {
                d d3 = new d();
                new aw().a((at)d3, arrby);
                this.i = d3;
                this.h.a(d3);
                this.i = this.d(this.i);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return;
        }
        HelperUtils.safeClose((InputStream)fileInputStream);
        throw throwable;
    }

    public static ImprintHandler getImprintService(Context context) {
        Class<ImprintHandler> class_ = ImprintHandler.class;
        synchronized (ImprintHandler.class) {
            if (j == null) {
                j = new ImprintHandler(context);
                l = new FileLockUtil();
                File file = new File(k.getFilesDir(), c);
                l.doFileOperateion(file, (FileLockCallback)j, 0);
            }
            ImprintHandler imprintHandler = j;
            // ** MonitorExit[var4_1] (shouldn't be in output)
            return imprintHandler;
        }
    }

    public String a(d d3) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : new TreeMap(d3.c()).entrySet()) {
            stringBuilder.append((String)entry.getKey());
            if (((e)entry.getValue()).d()) {
                stringBuilder.append(((e)entry.getValue()).b());
            }
            stringBuilder.append(((e)entry.getValue()).e());
            stringBuilder.append(((e)entry.getValue()).h());
        }
        stringBuilder.append(d3.b);
        return HelperUtils.MD5((String)stringBuilder.toString()).toLowerCase(Locale.US);
    }

    public void a(com.umeng.commonsdk.statistics.internal.d d3) {
        this.e = d3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String string) {
        Object object;
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        Object object2 = object = p;
        synchronized (object2) {
            try {
                if (o.containsKey((Object)string)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("--->>> unregistPreProcessCallback: unregist [");
                    stringBuilder.append(string);
                    stringBuilder.append("] success.");
                    UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                    f.remove((Object)string);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("--->>> unregistPreProcessCallback: can't find [");
                    stringBuilder.append(string);
                    stringBuilder.append("], pls regist first.");
                    UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                }
            }
            catch (Throwable throwable) {
                UMCrashManager.reportCrash((Context)k, (Throwable)throwable);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] a() {
        d d3;
        try {
            ImprintHandler imprintHandler = this;
            synchronized (imprintHandler) {
                d3 = this.i;
                if (d3 != null) break block5;
            }
        }
        catch (Throwable throwable) {
            UMCrashManager.reportCrash((Context)k, (Throwable)throwable);
            return null;
        }
        {
            block5 : {
                return null;
            }
            if (d3.b() > 0) return new bc().a((at)this.i);
            return null;
        }
    }

    public byte[] a(e e3) {
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)8);
        byteBuffer.order(null);
        byteBuffer.putLong(e3.e());
        byte[] arrby = byteBuffer.array();
        byte[] arrby2 = d;
        byte[] arrby3 = new byte[4];
        for (int i2 = 0; i2 < 4; ++i2) {
            arrby3[i2] = (byte)(arrby[i2] ^ arrby2[i2]);
        }
        return arrby3;
    }

    public d b() {
        ImprintHandler imprintHandler = this;
        synchronized (imprintHandler) {
            d d3 = this.i;
            return d3;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b(d var1_1) {
        block13 : {
            if (var1_1 == null) {
                if (AnalyticsConstants.UM_DEBUG == false) return;
                UMRTLog.d((String)"MobclickRT", (String)"Imprint is null");
                return;
            }
            if (!this.c(var1_1)) {
                if (AnalyticsConstants.UM_DEBUG == false) return;
                UMRTLog.e((String)"MobclickRT", (String)"Imprint is not valid");
                return;
            }
            var3_2 = new HashMap();
            var26_3 = this;
            // MONITORENTER : var26_3
            var5_4 = this.i;
            var6_5 = this.d(var1_1);
            var7_6 = var5_4 == null ? null : var5_4.i();
            var8_7 = var5_4 == null ? this.e(var6_5) : this.a(var5_4, var6_5, (Map<String, String>)var3_2);
            this.i = var8_7;
            var9_8 = var8_7 == null ? null : var8_7.i();
            var10_9 = true ^ this.a(var7_6, var9_8);
            // MONITOREXIT : var26_3
            var11_10 = this.i;
            if (var11_10 == null || !var10_9) break block13;
            this.h.a(var11_10);
            var25_11 = this.e;
            if (var25_11 != null) {
                var25_11.onImprintChanged(this.h);
            }
        }
        if (var3_2.size() <= 0) return;
        var27_13 = var12_12 = ImprintHandler.g;
        // MONITORENTER : var27_13
        var14_14 = var3_2.entrySet().iterator();
        block7 : do lbl-1000: // 4 sources:
        {
            if (!var14_14.hasNext()) {
                // MONITOREXIT : var27_13
                return;
            }
            var15_15 = (Map.Entry)var14_14.next();
            var16_16 = (String)var15_15.getKey();
            var17_17 = (String)var15_15.getValue();
            if (TextUtils.isEmpty((CharSequence)var16_16) || !ImprintHandler.f.containsKey((Object)var16_16)) ** GOTO lbl-1000
            var18_18 = new StringBuilder();
            var18_18.append("--->>> target imprint key is: ");
            var18_18.append(var16_16);
            var18_18.append("; value is: ");
            var18_18.append(var17_17);
            ULog.i((String)var18_18.toString());
            var23_19 = (ArrayList)ImprintHandler.f.get((Object)var16_16);
            if (var23_19 == null) ** GOTO lbl-1000
            var24_20 = 0;
            do {
                if (var24_20 >= var23_19.size()) continue block7;
                ((UMImprintChangeCallback)var23_19.get(var24_20)).onImprintValueChanged(var16_16, var17_17);
                ++var24_20;
            } while (true);
            break;
        } while (true);
        {
            catch (Throwable var4_21) {}
            {
                // MONITOREXIT : var26_3
                throw var4_21;
            }
        }
    }

    public a c() {
        return this.h;
    }

    /*
     * Exception decompiling
     */
    public void d() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl29 : GETSTATIC : trying to set 1 previously set to 0
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

    public boolean onFileLock(File file, int n2) {
        if (n2 == 0) {
            j.e();
            return true;
        }
        if (n2 == 1) {
            j.a(file);
        }
        return true;
    }

    public boolean onFileLock(String string) {
        return false;
    }

    public boolean onFileLock(String string, Object object) {
        return false;
    }

    public void registImprintCallback(String string, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty((CharSequence)string) && uMImprintChangeCallback != null) {
            ImprintHandler.a(string, uMImprintChangeCallback);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registPreProcessCallback(String string, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (!TextUtils.isEmpty((CharSequence)string) && uMImprintPreProcessCallback != null) {
            Object object;
            Object object2 = object = p;
            synchronized (object2) {
                try {
                    if (!o.containsKey((Object)string)) {
                        o.put((Object)string, (Object)uMImprintPreProcessCallback);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("--->>> registPreProcessCallback: key : ");
                        stringBuilder.append(string);
                        stringBuilder.append(" regist success.");
                        UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("--->>> key : ");
                        stringBuilder.append(string);
                        stringBuilder.append(" PreProcesser has registed!");
                        UMRTLog.i((String)"MobclickRT", (String)stringBuilder.toString());
                    }
                }
                catch (Throwable throwable) {
                    UMCrashManager.reportCrash((Context)k, (Throwable)throwable);
                }
                return;
            }
        }
    }

    public void unregistImprintCallback(String string, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty((CharSequence)string) && uMImprintChangeCallback != null) {
            ImprintHandler.b(string, uMImprintChangeCallback);
        }
    }
}


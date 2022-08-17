/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  com.huidu.applibs.R
 *  com.huidu.applibs.R$string
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Hashtable
 *  java.util.List
 *  java.util.Map
 */
package m5;

import android.content.Context;
import android.content.res.AssetManager;
import com.huidu.applibs.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class g {
    public static List<Map<String, Object>> a;
    public static List<Map<String, Object>> b;
    private static final g c;

    static {
        c = new g();
    }

    private g() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String b(String string, Context context) {
        try {
            InputStream inputStream = context.getAssets().open(string);
            byte[] arrby = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            do {
                int n5;
                if ((n5 = inputStream.read(arrby)) == -1) {
                    String string2 = new String(byteArrayOutputStream.toByteArray());
                    inputStream.close();
                    byteArrayOutputStream.close();
                    return string2;
                }
                byteArrayOutputStream.write(arrby, 0, n5);
            } while (true);
        }
        catch (IOException iOException) {
            return "";
        }
    }

    public static String c(Context context, int n5) {
        if (context == null) {
            return "--";
        }
        if (n5 != 0) {
            if (n5 != 1) {
                if (n5 != 2) {
                    return "--";
                }
                return context.getString(R.string.tricolor);
            }
            return context.getString(R.string.double_color);
        }
        return context.getString(R.string.simple_color);
    }

    private static void d(Context context) {
        List<Map<String, Object>> list;
        List<Map<String, Object>> list2 = a;
        if (list2 == null || list2.size() <= 0) {
            a = g.h(g.b("fonts/ColorsSetting.json", context));
        }
        if ((list = b) == null || list.size() <= 0) {
            b = g.h(g.b("fonts/SimpleColorsSetting.json", context));
        }
    }

    public static String f(Context context, int n5) {
        if (context == null) {
            return "--";
        }
        switch (n5) {
            default: {
                return "--";
            }
            case 8: {
                return context.getString(R.string.sc_area_info_gray_mode_7);
            }
            case 7: {
                return context.getString(R.string.sc_area_info_gray_mode_6);
            }
            case 6: {
                return context.getString(R.string.sc_area_info_gray_mode_5);
            }
            case 5: {
                return context.getString(R.string.sc_area_info_gray_mode_4);
            }
            case 4: {
                return context.getString(R.string.sc_area_info_gray_mode_3);
            }
            case 3: {
                return context.getString(R.string.sc_area_info_gray_mode_2);
            }
            case 2: {
                return context.getString(R.string.sc_area_info_gray_mode_1);
            }
            case 1: 
        }
        return context.getString(R.string.sc_area_info_gray_mode_0);
    }

    public static g g(Context context) {
        g.d(context);
        return c;
    }

    /*
     * Exception decompiling
     */
    private static List<Map<String, Object>> h(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl100.1 : ALOAD_1 : trying to set 1 previously set to 0
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

    public List<Map<String, Object>> a() {
        return a;
    }

    public List<Map<String, Object>> e(int n5, int n6) {
        List<Map<String, Object>> list = n5 == 2 && n6 == 8 ? a : b;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (Map map : list) {
                int n7 = (Integer)map.get((Object)"colorLevel");
                int n8 = (Integer)map.get((Object)"grayLevel");
                if (n5 < n7 || n6 < n8) continue;
                arrayList.add((Object)map);
            }
        }
        if (arrayList.size() <= 0) {
            Hashtable hashtable = new Hashtable();
            hashtable.put((Object)"colorValue", (Object)"#000000");
            hashtable.put((Object)"color", (Object)-16777216);
            arrayList.add((Object)hashtable);
            Hashtable hashtable2 = new Hashtable();
            hashtable2.put((Object)"colorValue", (Object)"#ffffff");
            hashtable2.put((Object)"color", (Object)-1);
            arrayList.add((Object)hashtable2);
        }
        return arrayList;
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.util.Log
 *  com.huidu.applibs.entity.model.FontTypefaceModel
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  l5.k
 *  w8.b
 */
package m5;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.huidu.applibs.entity.model.FontTypefaceModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import l5.k;
import m5.o;
import w8.b;

public class p {
    private static final String[] a = new String[]{"simsun.ttc", "simfang.ttf", "ARIAL.TTF", "ArialUnicodeMS.ttf"};

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(String string2) {
        AssetManager assetManager = b.a().getAssets();
        String[] arrstring = a;
        int n5 = arrstring.length;
        int n6 = 0;
        while (n6 < n5) {
            String string3 = arrstring[n6];
            try {
                File file = new File(string2, string3);
                if (!file.exists() || file.length() <= 0L) {
                    int n7;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("copyFontAssets: ");
                    stringBuilder.append(string3);
                    Log.d((String)"FontFileUtils", (String)stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("fonts/");
                    stringBuilder2.append(string3);
                    InputStream inputStream = assetManager.open(stringBuilder2.toString());
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] arrby = new byte[1024];
                    while ((n7 = inputStream.read(arrby)) != -1) {
                        fileOutputStream.write(arrby, 0, n7);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            ++n6;
        }
        return;
    }

    public static String b(String string2) {
        String string3 = o.B((Context)b.a());
        p.a(string3);
        FontTypefaceModel fontTypefaceModel = k.f((Context)b.a()).h(string2);
        if (!fontTypefaceModel.isLocalFont()) {
            Log.w((String)"FontFileUtils", (String)"getPathOfFont: font file not download!");
            return new File(string3, a[0]).getAbsolutePath();
        }
        return new File(string3, fontTypefaceModel.getFontPath()).getAbsolutePath();
    }

    public static boolean c(String string2) {
        if (string2 == null) {
            return false;
        }
        String string3 = string2.toUpperCase();
        boolean bl = "DEFAULT".equals((Object)string3);
        boolean bl2 = false;
        if (!bl) {
            boolean bl3 = "SANS_SERIF".equals((Object)string3);
            bl2 = false;
            if (!bl3) {
                boolean bl4 = "MONOSPACE".equals((Object)string3);
                bl2 = false;
                if (!bl4) {
                    boolean bl5 = "SERIF".equals((Object)string3);
                    bl2 = false;
                    if (!bl5) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }
}


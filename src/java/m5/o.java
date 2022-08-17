/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.os.Handler
 *  android.os.Message
 *  com.huidu.applibs.entity.a
 *  com.huidu.applibs.entity.enumeration.CardType
 *  java.io.BufferedReader
 *  java.io.BufferedWriter
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.FileWriter
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.io.StringReader
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package m5;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Message;
import com.huidu.applibs.entity.enumeration.CardType;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class o {
    public static long A(String string2) {
        File file = new File(string2);
        boolean bl = file.exists();
        long l3 = 0L;
        if (bl) {
            if (file.isDirectory()) {
                File[] arrfile = file.listFiles();
                int n5 = arrfile.length;
                for (int i5 = 0; i5 < n5; ++i5) {
                    l3 += o.A(arrfile[i5].getAbsolutePath());
                }
            } else {
                l3 += file.length();
            }
        }
        return l3;
    }

    public static String B(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        stringBuilder.append(File.separator);
        stringBuilder.append("FontLibrary");
        return o.V(stringBuilder.toString());
    }

    public static String C(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append("/LcdProgramFile");
        return o.V(stringBuilder.toString());
    }

    public static String D(Context context, String string2) {
        String string3 = o.v(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("/SendFiles/local/");
        stringBuilder.append(string2.replace((CharSequence)"+", (CharSequence)"Plus").replace((CharSequence)"-", (CharSequence)""));
        return o.V(stringBuilder.toString());
    }

    public static String E(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append(File.separator);
        stringBuilder.append("Log");
        return o.V(stringBuilder.toString());
    }

    private static String F(Context context, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        String string4 = File.separator;
        stringBuilder.append(string4);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        String string5 = stringBuilder.toString();
        String string6 = string2.replace((CharSequence)"+", (CharSequence)"Plus").replace((CharSequence)"-", (CharSequence)"");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string5);
        stringBuilder2.append(string6);
        String string7 = stringBuilder2.toString();
        File file = new File(string7);
        if (!file.exists() && !file.isDirectory()) {
            file.mkdirs();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string7);
        stringBuilder3.append("/config.xml");
        return stringBuilder3.toString();
    }

    public static String G(Context context, String string2) {
        String string3 = o.w(context, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("/Players/");
        stringBuilder.append(string2);
        return o.V(stringBuilder.toString());
    }

    public static String H(Context context, String string2) {
        return o.F(context, string2, "rtsp");
    }

    public static String I(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        stringBuilder.append("/SCNeonBackground");
        return o.V(stringBuilder.toString());
    }

    public static String J(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        String string2 = File.separator;
        stringBuilder.append(string2);
        stringBuilder.append("FPGAFile");
        String string3 = stringBuilder.toString();
        o.V(string3);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string3);
        stringBuilder2.append(string2);
        stringBuilder2.append("smart.ss");
        return stringBuilder2.toString();
    }

    public static String K(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        stringBuilder.append(File.separator);
        stringBuilder.append("SCHardwareSet");
        String string2 = stringBuilder.toString();
        o.V(string2);
        return string2;
    }

    public static String L(Context context) {
        return new File(o.K(context), "tagFile.json").getAbsolutePath();
    }

    public static String M(Context context) {
        return new File(o.K(context), "version.json").getAbsolutePath();
    }

    public static String N(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        stringBuilder.append(File.separator);
        stringBuilder.append("UserSmart");
        String string2 = stringBuilder.toString();
        o.V(string2);
        return string2;
    }

    public static String O(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append("/UnzipProgram");
        return o.V(stringBuilder.toString());
    }

    public static String P(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append("/UnzipProgram/ReadBack");
        return o.V(stringBuilder.toString());
    }

    public static String Q(Context context, String string2) {
        String string3 = o.w(context, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("/ScreenParams/");
        stringBuilder.append(string2);
        return o.V(stringBuilder.toString());
    }

    public static String R(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        stringBuilder.append(File.separator);
        stringBuilder.append("SourceFile");
        return o.V(stringBuilder.toString());
    }

    public static String S(Context context, String string2) {
        return o.F(context, string2, "throw");
    }

    public static String T(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append("/Xr809Flash");
        return o.V(stringBuilder.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static List<String> U(String string2) {
        int n5;
        ArrayList arrayList = new ArrayList();
        String[] arrstring = new File(string2).list();
        if (arrstring == null) return arrayList;
        try {
            if (arrstring.length <= 0) return arrayList;
            n5 = 0;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        do {
            if (n5 >= arrstring.length) return arrayList;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("/");
            stringBuilder.append(arrstring[n5]);
            arrayList.add((Object)stringBuilder.toString());
            ++n5;
        } while (true);
        return arrayList;
    }

    public static String V(String string2) {
        File file = new File(string2);
        if (!(file.exists() || file.isDirectory() || file.mkdirs())) {
            return null;
        }
        return file.getAbsolutePath();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static byte[] W(Context context, String string2) {
        void var4_13;
        InputStream inputStream;
        block15 : {
            void var2_10;
            InputStream inputStream2;
            block14 : {
                int n5;
                inputStream2 = context.getAssets().open(string2);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] arrby = new byte[1024];
                while ((n5 = inputStream2.read(arrby)) != -1) {
                    byteArrayOutputStream.write(arrby, 0, n5);
                }
                byte[] arrby2 = byteArrayOutputStream.toByteArray();
                try {
                    inputStream2.close();
                    return arrby2;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    return arrby2;
                }
                catch (IOException iOException) {
                    break block14;
                }
                catch (Throwable throwable) {
                    inputStream = null;
                    break block15;
                }
                catch (IOException iOException) {
                    inputStream2 = null;
                }
            }
            var2_10.printStackTrace();
            if (inputStream2 == null) return null;
            try {
                inputStream2.close();
                return null;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return null;
            catch (Throwable throwable) {
                inputStream = inputStream2;
            }
        }
        if (inputStream == null) throw var4_13;
        try {
            inputStream.close();
            throw var4_13;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw var4_13;
        }
    }

    public static String X(Context context, String string2) {
        byte[] arrby = o.W(context, string2);
        if (arrby != null) {
            return new String(arrby);
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static byte[] Y(String string2) {
        FileInputStream fileInputStream;
        void var3_12;
        block15 : {
            FileInputStream fileInputStream2;
            void var6_9;
            block14 : {
                int n5;
                if (!o.l(string2)) return null;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                fileInputStream2 = new FileInputStream(string2);
                byte[] arrby = new byte[1024];
                while ((n5 = fileInputStream2.read(arrby)) != -1) {
                    byteArrayOutputStream.write(arrby, 0, n5);
                }
                byte[] arrby2 = byteArrayOutputStream.toByteArray();
                try {
                    fileInputStream2.close();
                    return arrby2;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    return arrby2;
                }
                catch (IOException iOException) {
                    break block14;
                }
                catch (Throwable throwable) {
                    fileInputStream = null;
                    break block15;
                }
                catch (IOException iOException) {
                    fileInputStream2 = null;
                }
            }
            var6_9.printStackTrace();
            if (fileInputStream2 == null) return null;
            try {
                fileInputStream2.close();
                return null;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return null;
            }
            catch (Throwable throwable) {
                fileInputStream = fileInputStream2;
            }
        }
        if (fileInputStream == null) throw var3_12;
        try {
            fileInputStream.close();
            throw var3_12;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        throw var3_12;
    }

    private static void Z(Handler handler, int n5) {
        Message message = Message.obtain();
        message.what = 8;
        message.arg1 = n5;
        handler.sendMessage(message);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String a(String var0) {
        block13 : {
            if (o.l(var0) == false) return "";
            var1_1 = null;
            var2_2 = new StringBuilder();
            var3_3 = new BufferedReader((Reader)new InputStreamReader((InputStream)new FileInputStream(var0), "UTF-8"));
            while ((var8_4 = var3_3.readLine()) != null) {
                var2_2.append(var8_4);
            }
            var3_3.close();
            return var2_2.toString();
            catch (Throwable var6_5) {
                var1_1 = var3_3;
                break block13;
            }
            catch (IOException var4_8) {
                var1_1 = var3_3;
                ** GOTO lbl-1000
            }
            catch (Throwable var6_6) {
                break block13;
            }
            catch (IOException var4_9) {
                // empty catch block
            }
lbl-1000: // 2 sources:
            {
                var4_10.printStackTrace();
                if (var1_1 == null) return var2_2.toString();
            }
            try {
                var1_1.close();
                return var2_2.toString();
            }
            catch (IOException var5_11) {
                var5_11.printStackTrace();
            }
            return var2_2.toString();
        }
        if (var1_1 == null) throw var6_7;
        try {
            var1_1.close();
            throw var6_7;
        }
        catch (IOException var7_12) {
            var7_12.printStackTrace();
        }
        throw var6_7;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean a0(byte[] var0, String var1_1) {
        block13 : {
            var2_2 = null;
            var3_3 = new FileOutputStream(var1_1);
            var3_3.write(var0);
            try {
                var3_3.close();
                return true;
            }
            catch (IOException var8_4) {
                var8_4.printStackTrace();
                return true;
            }
            catch (Throwable var6_5) {
                var2_2 = var3_3;
                break block13;
            }
            catch (Exception var4_8) {
                var2_2 = var3_3;
                ** GOTO lbl-1000
            }
            catch (Throwable var6_6) {
                break block13;
            }
            catch (Exception var4_9) {
                // empty catch block
            }
lbl-1000: // 2 sources:
            {
                var4_10.printStackTrace();
                if (var2_2 == null) return false;
            }
            try {
                var2_2.close();
                return false;
            }
            catch (IOException var5_11) {
                var5_11.printStackTrace();
            }
            return false;
        }
        if (var2_2 == null) throw var6_7;
        try {
            var2_2.close();
            throw var6_7;
        }
        catch (IOException var7_12) {
            var7_12.printStackTrace();
        }
        throw var6_7;
    }

    private static String b(byte[] arrby) {
        char[] arrc = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arrc2 = new char[2 * arrby.length];
        int n5 = arrby.length;
        int n6 = 0;
        for (int i5 = 0; i5 < n5; ++i5) {
            byte by = arrby[i5];
            int n7 = n6 + 1;
            arrc2[n6] = arrc[15 & by >>> 4];
            n6 = n7 + 1;
            arrc2[n7] = arrc[by & 15];
        }
        return new String(arrc2).toLowerCase();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b0(String string2, String string3) {
        try {
            File file = new File(string3);
            if (file.exists()) {
                file.delete();
            }
            BufferedReader bufferedReader = new BufferedReader((Reader)new StringReader(string2));
            BufferedWriter bufferedWriter = new BufferedWriter((Writer)new FileWriter(file));
            char[] arrc = new char[1024];
            do {
                int n5;
                if ((n5 = bufferedReader.read(arrc)) == -1) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    bufferedReader.close();
                    return;
                }
                bufferedWriter.write(arrc, 0, n5);
            } while (true);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public static void c(Handler handler, Context context) {
        c c4 = new c();
        String string2 = o.v(context);
        c4.b = o.A(string2);
        c4.c = string2;
        o.Z(handler, 0);
        while (c4.a < c4.b) {
            o.j(handler, c4, string2);
        }
        o.Z(handler, 100);
    }

    public static void d(String string2) {
        File file = new File(string2);
        if (file.exists()) {
            if (!file.isDirectory()) {
                return;
            }
            File[] arrfile = file.listFiles();
            if (arrfile != null) {
                if (arrfile.length == 0) {
                    return;
                }
                int n5 = arrfile.length;
                for (int i5 = 0; i5 < n5; ++i5) {
                    o.h(arrfile[i5].getAbsolutePath());
                }
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void e(Context context, String string2, String string3) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        void var6_11;
        block26 : {
            block27 : {
                void var4_16;
                block28 : {
                    InputStream inputStream2;
                    block25 : {
                        block24 : {
                            int n5;
                            inputStream = null;
                            inputStream2 = context.getAssets().open(string2);
                            fileOutputStream = new FileOutputStream(string3);
                            byte[] arrby = new byte[1024];
                            while ((n5 = inputStream2.read(arrby)) != -1) {
                                fileOutputStream.write(arrby, 0, n5);
                            }
                            try {
                                inputStream2.close();
                            }
                            catch (IOException iOException) {
                                iOException.printStackTrace();
                            }
                            fileOutputStream.close();
                            return;
                            catch (Throwable throwable) {
                                break block24;
                            }
                            catch (Exception exception) {
                                break block25;
                            }
                            catch (Throwable throwable) {
                                fileOutputStream = null;
                            }
                        }
                        inputStream = inputStream2;
                        break block26;
                        catch (Exception exception) {
                            fileOutputStream = null;
                        }
                    }
                    inputStream = inputStream2;
                    break block28;
                    catch (Throwable throwable) {
                        inputStream = null;
                        fileOutputStream = null;
                        break block26;
                    }
                    catch (Exception exception) {
                        fileOutputStream = null;
                    }
                }
                var4_16.printStackTrace();
                if (inputStream == null) break block27;
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            if (fileOutputStream == null) return;
            try {
                fileOutputStream.close();
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        if (fileOutputStream == null) throw var6_11;
        try {
            fileOutputStream.close();
            throw var6_11;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw var6_11;
        }
    }

    public static File f(File file, File file2, String string2) {
        File file3 = new File(file2.getPath(), string2);
        if (file.exists()) {
            int n5;
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] arrby = new byte[1444];
            while ((n5 = fileInputStream.read(arrby)) != -1) {
                fileOutputStream.write(arrby, 0, n5);
            }
            fileInputStream.close();
        }
        return file3;
    }

    public static boolean g(File file) {
        String[] arrstring;
        if (file != null && file.isDirectory() && (arrstring = file.list()) != null) {
            int n5 = arrstring.length;
            for (int i5 = 0; i5 < n5; ++i5) {
                if (o.g(new File(file, arrstring[i5]))) continue;
                return false;
            }
            return file.delete();
        }
        if (file != null) {
            return file.delete();
        }
        return false;
    }

    public static void h(String string2) {
        o.k(string2);
    }

    private static boolean i(File file) {
        if (file != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file.getAbsolutePath());
            stringBuilder.append(System.currentTimeMillis());
            File file2 = new File(stringBuilder.toString());
            file.renameTo(file2);
            return file2.delete();
        }
        return false;
    }

    public static void j(Handler handler, c c4, String string2) {
        File file = new File(c4.c);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] arrfile = file.listFiles();
                int n5 = arrfile.length;
                for (int i5 = 0; i5 < n5; ++i5) {
                    c4.c = arrfile[i5].getAbsolutePath();
                    o.j(handler, c4, string2);
                }
                if (!file.getAbsoluteFile().getPath().equals((Object)string2)) {
                    c4.a += file.length();
                    o.i(file);
                    return;
                }
            } else {
                double d4 = c4.a;
                Double.isNaN((double)d4);
                double d6 = d4 * 1.0;
                double d7 = 10L * c4.b;
                Double.isNaN((double)d7);
                int n6 = (int)(1000.0 * (d6 / d7));
                c4.c = file.getAbsolutePath();
                c4.a += file.length();
                o.i(file);
                double d8 = c4.a;
                Double.isNaN((double)d8);
                double d9 = d8 * 1.0;
                double d10 = 10L * c4.b;
                Double.isNaN((double)d10);
                int n7 = (int)(1000.0 * (d9 / d10));
                if (n7 > n6) {
                    if (n7 > 0) {
                        o.Z(handler, n7);
                        return;
                    }
                    if (n7 >= 99) {
                        o.Z(handler, 99);
                    }
                }
            }
        }
    }

    public static void k(String string2) {
        File file = new File(string2);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] arrfile = file.listFiles();
                int n5 = arrfile.length;
                for (int i5 = 0; i5 < n5; ++i5) {
                    o.k(arrfile[i5].getPath());
                }
                file.delete();
                return;
            }
            file.delete();
        }
    }

    public static boolean l(String string2) {
        if (string2 != null && string2.length() != 0) {
            return new File(string2).exists();
        }
        return false;
    }

    public static String m(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        stringBuilder.append(File.separator);
        stringBuilder.append("BgImage");
        return o.V(stringBuilder.toString());
    }

    public static long n(Context context) {
        return o.A(o.v(context));
    }

    public static String o(Context context) {
        String string2 = o.w(context, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("/cardList.json");
        return stringBuilder.toString();
    }

    public static String p(Context context, CardType cardType) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        stringBuilder.append("/CardModels");
        String string2 = o.V(stringBuilder.toString());
        if (cardType == CardType.SIMPLE_COLOR) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append("/simple_color_models.json");
            return stringBuilder2.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string2);
        stringBuilder3.append("/full_color_models.json");
        return stringBuilder3.toString();
    }

    public static String q(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append("/CloudGifCache");
        return o.V(stringBuilder.toString());
    }

    public static String r(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append("/config/");
        return o.V(stringBuilder.toString());
    }

    public static String s(Context context, com.huidu.applibs.entity.a a3, b b3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append("/config");
        String string2 = stringBuilder.toString();
        o.V(string2);
        String string3 = a3.getCardId().replace((CharSequence)"+", (CharSequence)"Plus").replace((CharSequence)"-", (CharSequence)"");
        if (CardType.SIMPLE_COLOR == a3.getType()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append("/");
            stringBuilder2.append(string3);
            stringBuilder2.append(b3.toString());
            stringBuilder2.append(".json");
            return stringBuilder2.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string2);
        stringBuilder3.append("/");
        stringBuilder3.append(string3);
        stringBuilder3.append(b3.toString());
        stringBuilder3.append(".xml");
        return stringBuilder3.toString();
    }

    public static String t(Context context) {
        String string2 = o.w(context, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("/DeviceExtInfoList.json");
        return stringBuilder.toString();
    }

    public static String u(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.v(context));
        stringBuilder.append(File.separator);
        stringBuilder.append("export");
        return o.V(stringBuilder.toString());
    }

    public static String v(Context context) {
        File file = context.getExternalCacheDir();
        if (file == null) {
            file = context.getExternalCacheDir();
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        if (file != null) {
            return file.getPath();
        }
        return "";
    }

    public static String w(Context context, String string2) {
        File file = context.getExternalFilesDir(string2);
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        if (file != null) {
            return file.getPath();
        }
        return "";
    }

    public static String x(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o.w(context, null));
        stringBuilder.append("/FCNeonBackground");
        return o.V(stringBuilder.toString());
    }

    /*
     * Exception decompiling
     */
    public static String y(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl72 : ALOAD_2 : trying to set 1 previously set to 0
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

    public static String z(String string2) {
        int n5;
        if (string2 != null && string2.length() > 0 && (n5 = string2.lastIndexOf(46)) > -1 && n5 < string2.length()) {
            string2 = string2.substring(0, n5);
        }
        return string2;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a;
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        private static final /* synthetic */ b[] d;

        static {
            b b3;
            b b4;
            b b5;
            a = b3 = new b();
            b = b4 = new b();
            c = b5 = new b();
            d = new b[]{b3, b4, b5};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])d.clone();
        }
    }

    private static class c {
        public long a;
        public long b;
        public String c;

        private c() {
        }
    }

}


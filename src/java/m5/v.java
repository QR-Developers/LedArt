/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 *  android.util.Log
 *  java.io.BufferedOutputStream
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.OutputStream
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 */
package m5;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import m5.o;

public class v {
    public static boolean a = true;

    public static void a(Context context, String string2) {
        if (string2 == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new SimpleDateFormat("HH:mm:ss", Locale.US).format(new Date()));
        stringBuilder.append("\r\n");
        stringBuilder.append(string2);
        stringBuilder.append("\r\n");
        try {
            String string3 = v.c(context);
            if (Environment.getExternalStorageState().equals((Object)"mounted")) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)new FileOutputStream(string3, true));
                bufferedOutputStream.write(stringBuilder.toString().getBytes());
                bufferedOutputStream.close();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void b(Context context, Throwable throwable) {
        if (throwable == null) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter((Writer)stringWriter));
        v.a(context, stringWriter.toString());
    }

    private static String c(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date()));
        stringBuilder.append(".txt");
        String string2 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(o.E(context));
        stringBuilder2.append(File.separator);
        stringBuilder2.append(string2);
        return stringBuilder2.toString();
    }

    public static void d(Context context, String string2) {
        if (string2 != null) {
            if (!a) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("writeTestLog::");
            stringBuilder.append(string2);
            Log.d((String)"LogHelper", (String)stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            Locale locale = Locale.US;
            stringBuilder2.append(new SimpleDateFormat("HH:mm:ss", locale).format(new Date()));
            stringBuilder2.append("\r\n");
            stringBuilder2.append(string2);
            stringBuilder2.append("\r\n");
            try {
                String string3 = o.E(context);
                String string4 = new SimpleDateFormat("yyyy-MM-dd", locale).format(new Date());
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("huidu_test_log_");
                stringBuilder3.append(string4);
                stringBuilder3.append(".txt");
                File file = new File(string3, stringBuilder3.toString());
                if (Environment.getExternalStorageState().equals((Object)"mounted")) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)new FileOutputStream(file, true));
                    bufferedOutputStream.write(stringBuilder2.toString().getBytes());
                    bufferedOutputStream.close();
                    return;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import android.util.Log;

public class w {
    public static int a = 6;

    public static boolean a(int n5) {
        return n5 <= a;
    }

    public static void b(String string2, String string3) {
        if (w.a(5)) {
            Log.d((String)string2, (String)string3);
        }
    }

    public static void c(String string2) {
        if (w.a(2)) {
            Log.e((String)"huidu_tag", (String)string2);
        }
    }
}


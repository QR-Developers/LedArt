/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import android.content.Context;
import android.content.SharedPreferences;

public class c0 {
    private Context a;

    public c0(Context context) {
        this.a = context;
    }

    public int a(int n5) {
        Context context = this.a;
        if (context == null) {
            return 1;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ProgramConfig", 0);
        if (n5 == 1) {
            return sharedPreferences.getInt("FcProgramNameIndex", 1);
        }
        return sharedPreferences.getInt("ScProgramNameIndex", 1);
    }

    public void b(int n5, int n6) {
        Context context = this.a;
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ProgramConfig", 0);
        if (n6 == 1) {
            sharedPreferences.edit().putInt("FcProgramNameIndex", n5).apply();
            return;
        }
        sharedPreferences.edit().putInt("ScProgramNameIndex", n5).apply();
    }
}


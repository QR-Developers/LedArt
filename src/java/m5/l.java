/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  java.lang.Object
 */
package m5;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class l {
    public static int a(Context context, float f4) {
        return (int)(0.5f + f4 * context.getResources().getDisplayMetrics().density);
    }
}


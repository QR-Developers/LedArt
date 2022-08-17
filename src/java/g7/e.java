/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  java.lang.Double
 *  java.lang.Object
 */
package g7;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class e {
    public static float a(Context context, float f2) {
        double d2 = context.getResources().getDisplayMetrics().density;
        Double.isNaN((double)d2);
        double d3 = d2 + 0.5;
        double d4 = f2;
        Double.isNaN((double)d4);
        return (float)(d3 * d4);
    }
}


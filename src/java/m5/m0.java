/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;

public class m0 {
    public static int a(Context context, float f4) {
        return (int)(0.5f + f4 * context.getResources().getDisplayMetrics().density);
    }

    public static float b(Context context, float f4) {
        return f4 * context.getResources().getDisplayMetrics().density;
    }

    public static int[] c(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        int n5 = arrn[1];
        view.getLocationOnScreen(arrn);
        if (n5 == arrn[1]) {
            arrn[1] = arrn[1] - m0.d(view.getContext());
        }
        return arrn;
    }

    public static int d(Context context) {
        int n5 = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (n5 > 0) {
            return context.getResources().getDimensionPixelSize(n5);
        }
        return 0;
    }

    public static int e(Context context, float f4) {
        return (int)(0.5f + f4 * context.getResources().getDisplayMetrics().scaledDensity);
    }
}


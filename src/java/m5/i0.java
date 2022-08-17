/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

public class i0 {
    public static int a(Context context) {
        int n5 = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (n5 > 0) {
            return context.getResources().getDimensionPixelSize(n5);
        }
        return 0;
    }

    public static void b(Activity activity) {
        int n5 = Build.VERSION.SDK_INT;
        if (n5 >= 19) {
            activity.getWindow().clearFlags(1024);
            activity.getWindow().addFlags(67108864);
            if (n5 >= 21) {
                activity.getWindow().clearFlags(67108864);
                activity.getWindow().getDecorView().setSystemUiVisibility(1280);
                activity.getWindow().addFlags(Integer.MIN_VALUE);
                activity.getWindow().setStatusBarColor(Color.parseColor((String)"#00000000"));
            }
        }
    }

    public static void c(Window window, int n5) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(n5);
        }
    }

    public static void d(Window window) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            window.clearFlags(1024);
            window.addFlags(67108864);
        }
    }
}


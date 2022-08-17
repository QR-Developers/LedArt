/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.IBinder
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class t {
    public static void a(Activity activity) {
        InputMethodManager inputMethodManager;
        View view = activity.getCurrentFocus();
        if (view == null) {
            view = new View((Context)activity);
        }
        if ((inputMethodManager = (InputMethodManager)activity.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void b(Context context, View view) {
        if (context != null) {
            if (view == null) {
                return;
            }
            InputMethodManager inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
            if (inputMethodManager == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void c(Activity activity) {
        InputMethodManager inputMethodManager;
        View view = activity.getCurrentFocus();
        if (view == null) {
            view = new View((Context)activity);
        }
        if ((inputMethodManager = (InputMethodManager)activity.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 2);
    }

    public static void d(Context context, View view) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 2);
    }
}


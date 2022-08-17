/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  java.lang.Object
 */
package m5;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public class f0 {
    private View a;
    private int b;
    private FrameLayout.LayoutParams c;
    private int d;
    private boolean e = true;
    private int f;

    private f0(Activity activity) {
        View view;
        this.a = view = ((FrameLayout)activity.findViewById(16908290)).getChildAt(0);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(){

            public void onGlobalLayout() {
                if (f0.this.e) {
                    f0 f02 = f0.this;
                    f02.d = f02.a.getHeight();
                    f0.this.e = false;
                }
                f0.this.h();
            }
        });
        this.c = (FrameLayout.LayoutParams)this.a.getLayoutParams();
    }

    public static void f(Activity activity) {
        new f0(activity);
    }

    private int g() {
        Rect rect = new Rect();
        this.a.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    private void h() {
        int n5 = this.g();
        if (n5 != this.b) {
            int n6 = this.a.getRootView().getHeight();
            int n7 = n6 - n5;
            this.c.height = n7 > n6 / 4 ? (Build.VERSION.SDK_INT >= 19 ? n6 - n7 + this.f : n6 - n7) : this.d;
            this.a.requestLayout();
            this.b = n5;
        }
    }

}


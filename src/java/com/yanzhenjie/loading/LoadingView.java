/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 *  g7.b
 *  g7.c
 *  g7.d
 */
package com.yanzhenjie.loading;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import g7.b;
import g7.c;
import g7.d;

public class LoadingView
extends ImageView {
    private c a;
    private b b;

    public LoadingView(Context context) {
        super(context);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        c c2;
        super(context, attributeSet);
        this.b = new b(context);
        this.a = c2 = new c((d)this.b);
        this.setImageDrawable((Drawable)c2);
    }

    private void b() {
        c c2 = this.a;
        if (c2 != null) {
            c2.start();
        }
    }

    private void c() {
        c c2 = this.a;
        if (c2 != null) {
            c2.stop();
        }
    }

    public void a(int n2, int n3, int n4) {
        this.b.w(n2, n3, n4);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
    }

    protected void onVisibilityChanged(View view, int n2) {
        super.onVisibilityChanged(view, n2);
        if (n2 == 0) {
            this.b();
            return;
        }
        this.c();
    }
}


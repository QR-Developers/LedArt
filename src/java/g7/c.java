/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  java.lang.Object
 *  java.lang.Runnable
 */
package g7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import g7.d;

public class c
extends Drawable
implements Animatable {
    private final d a;
    private final Drawable.Callback b;

    public c(d d2) {
        Drawable.Callback callback;
        this.b = callback = new Drawable.Callback(){

            public void invalidateDrawable(Drawable drawable) {
                c.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
                c.this.scheduleSelf(runnable, l2);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                c.this.unscheduleSelf(runnable);
            }
        };
        this.a = d2;
        d2.j(callback);
    }

    public void draw(Canvas canvas) {
        if (!this.getBounds().isEmpty()) {
            this.a.d(canvas);
        }
    }

    public int getIntrinsicHeight() {
        return (int)this.a.g;
    }

    public int getIntrinsicWidth() {
        return (int)this.a.f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.a.f();
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.i(rect);
    }

    public void setAlpha(int n2) {
        this.a.h(n2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.k(colorFilter);
    }

    public void start() {
        this.a.m();
    }

    public void stop() {
        this.a.n();
    }

}


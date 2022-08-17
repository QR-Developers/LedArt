/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.view.animation.LinearInterpolator
 *  java.lang.Float
 *  java.lang.Object
 */
package g7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import g7.e;

public abstract class d {
    private final ValueAnimator.AnimatorUpdateListener a = new ValueAnimator.AnimatorUpdateListener(){

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.c(((Float)valueAnimator.getAnimatedValue()).floatValue());
            d.this.e();
        }
    };
    protected final Rect b = new Rect();
    private Drawable.Callback c;
    private ValueAnimator d;
    protected long e;
    protected float f;
    protected float g;

    public d(Context context) {
        float f2;
        this.g = f2 = e.a(context, 56.0f);
        this.f = f2;
        this.e = 1333L;
        this.l();
    }

    private void e() {
        this.c.invalidateDrawable(null);
    }

    private void l() {
        ValueAnimator valueAnimator;
        this.d = valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        valueAnimator.setRepeatCount(-1);
        this.d.setRepeatMode(1);
        this.d.setDuration(this.e);
        this.d.setInterpolator((TimeInterpolator)new LinearInterpolator());
        this.d.addUpdateListener(this.a);
    }

    protected void b(Animator.AnimatorListener animatorListener) {
        this.d.addListener(animatorListener);
    }

    protected abstract void c(float var1);

    protected abstract void d(Canvas var1);

    boolean f() {
        return this.d.isRunning();
    }

    protected abstract void g();

    protected abstract void h(int var1);

    void i(Rect rect) {
        this.b.set(rect);
    }

    void j(Drawable.Callback callback) {
        this.c = callback;
    }

    protected abstract void k(ColorFilter var1);

    void m() {
        this.g();
        this.d.addUpdateListener(this.a);
        this.d.setRepeatCount(-1);
        this.d.setDuration(this.e);
        this.d.start();
    }

    void n() {
        this.d.removeUpdateListener(this.a);
        this.d.setRepeatCount(0);
        this.d.setDuration(0L);
        this.d.end();
    }

}


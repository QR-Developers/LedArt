/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.os.SystemClock
 *  android.view.View
 *  cn.huidu.singlecolor.model.area.AnimationWordArea
 *  cn.huidu.singlecolor.model.effect.ExtBackground
 *  cn.huidu.singlecolor.model.widget.AnimationWord
 *  cn.huidu.singlecolor.view.WidgetView
 *  java.lang.Object
 *  java.lang.String
 *  t2.a
 *  u2.a
 *  u2.e
 */
package cn.huidu.singlecolor.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.View;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.area.AnimationWordArea;
import cn.huidu.singlecolor.model.effect.ExtBackground;
import cn.huidu.singlecolor.model.widget.AnimationWord;
import cn.huidu.singlecolor.view.WidgetView;
import t2.a;
import u2.e;

@SuppressLint(value={"ViewConstructor"})
public class AnimationWordWidget
extends WidgetView {
    private AnimationWordArea c;
    private AnimationWord d;
    private u2.a e = new u2.a();
    private e f;
    private boolean g;
    private long h;

    public AnimationWordWidget(Context context, a a2) {
        super(context, a2);
        this.f = new e(context);
    }

    public boolean d(Object object) {
        if (object == this.d) {
            this.g();
            return true;
        }
        return false;
    }

    public void g() {
        ExtBackground extBackground = this.c.extBackground;
        boolean bl = extBackground != null && extBackground.enableColorful;
        this.g = bl;
        if (bl) {
            this.f.c(extBackground.colorfulImagePath, extBackground.colorfulSpeed, this.b.getColorLevel(), this.b.getGrayLevel());
        } else {
            this.f.b();
        }
        AnimationWordArea animationWordArea = this.c;
        int n2 = animationWordArea.width;
        int n3 = animationWordArea.height;
        float f2 = this.b.getScale();
        this.e.y(this.c.getAnimationWord(), n2, n3, f2, this.c.extBackground.enableColorful);
    }

    protected void onDetachedFromWindow() {
        View.super.onDetachedFromWindow();
        this.f.b();
    }

    protected void onDraw(Canvas canvas) {
        if (this.c != null) {
            long l2 = SystemClock.elapsedRealtime();
            long l3 = l2 - this.h;
            if (l3 > 3000L || l3 < 0L) {
                l3 = 0L;
            }
            this.h = l2;
            if (this.g) {
                this.f.d(canvas);
                this.e.w(canvas, l3);
                this.f.a(canvas);
            } else {
                this.e.w(canvas, l3);
            }
        }
        this.invalidate();
    }

    public void setModel(Area area) {
        AnimationWordArea animationWordArea;
        super.setModel(area);
        this.c = animationWordArea = (AnimationWordArea)area;
        this.d = animationWordArea.getAnimationWord();
    }
}


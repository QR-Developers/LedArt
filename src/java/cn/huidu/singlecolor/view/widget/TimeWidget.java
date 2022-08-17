/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.os.SystemClock
 *  android.view.View
 *  cn.huidu.cpplibs.image.HScale
 *  cn.huidu.singlecolor.model.area.TimeArea
 *  cn.huidu.singlecolor.model.widget.Time
 *  cn.huidu.singlecolor.view.WidgetView
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  l5.k
 *  t2.a
 *  u2.j
 *  w2.d
 */
package cn.huidu.singlecolor.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.View;
import cn.huidu.cpplibs.image.HScale;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.area.TimeArea;
import cn.huidu.singlecolor.model.widget.Time;
import cn.huidu.singlecolor.view.WidgetView;
import l5.k;
import t2.a;
import u2.j;
import w2.d;

@SuppressLint(value={"ViewConstructor"})
public class TimeWidget
extends WidgetView {
    private Context c;
    private j d;
    private TimeArea e;
    private Time f;
    private Rect g = new Rect();
    private boolean h;
    private boolean i;

    public TimeWidget(Context context, a a2) {
        super(context, a2);
        this.c = context;
        this.d = new j();
    }

    public static /* synthetic */ void h(TimeWidget timeWidget) {
        timeWidget.j();
    }

    private void i() {
        new Thread((Runnable)new d(this)).start();
    }

    private /* synthetic */ void j() {
        while (this.h) {
            SystemClock.sleep((long)10L);
            if (this.i) continue;
            this.k();
            this.postInvalidate();
        }
    }

    private void k() {
        this.d.h();
    }

    public boolean d(Object object) {
        if (object == this.e.getTime()) {
            this.g();
            return true;
        }
        return false;
    }

    public void e() {
        super.e();
        this.i = false;
    }

    public void f() {
        super.f();
        this.i = true;
    }

    public void g() {
        TimeArea timeArea = this.e;
        if (timeArea != null) {
            this.d.i(timeArea.getContentWidth(), this.e.getContentHeight());
            this.d.h();
            this.invalidate();
        }
    }

    protected void onAttachedToWindow() {
        View.super.onAttachedToWindow();
        if (!this.h) {
            this.h = true;
        }
        this.i();
    }

    protected void onDetachedFromWindow() {
        View.super.onDetachedFromWindow();
        if (this.h) {
            this.h = false;
        }
    }

    protected void onDraw(Canvas canvas) {
        View.super.onDraw(canvas);
        this.d.g();
        Bitmap bitmap = this.d.d();
        if (bitmap != null) {
            Bitmap bitmap2 = HScale.c((Bitmap)bitmap, (int)((int)(0.5f + this.b.getScale())), (int)0);
            this.g.set(0, 0, canvas.getWidth(), canvas.getHeight());
            canvas.drawBitmap(bitmap2, null, this.g, null);
        }
    }

    public void setDisableAnim(boolean bl) {
        this.i = bl;
    }

    public void setModel(Area area) {
        Time time;
        TimeArea timeArea;
        this.e = timeArea = (TimeArea)area;
        this.f = time = timeArea.getTime();
        if (time.typeface == null) {
            time.typeface = k.f((Context)this.c).g("\u5b8b\u4f53");
        }
        this.d.j(this.f);
    }
}


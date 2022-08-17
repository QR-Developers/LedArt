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
 *  android.util.Log
 *  android.view.View
 *  cn.huidu.cpplibs.image.HScale
 *  cn.huidu.singlecolor.model.area.ClockArea
 *  cn.huidu.singlecolor.model.widget.Clock
 *  cn.huidu.singlecolor.view.WidgetView
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  l5.k
 *  t2.a
 *  u2.d
 *  w2.a
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
import android.util.Log;
import android.view.View;
import cn.huidu.cpplibs.image.HScale;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.area.ClockArea;
import cn.huidu.singlecolor.model.widget.Clock;
import cn.huidu.singlecolor.view.WidgetView;
import l5.k;
import t2.a;
import u2.d;

@SuppressLint(value={"ViewConstructor"})
public class ClockWidget
extends WidgetView {
    private Context c;
    private d d;
    private ClockArea e;
    private Clock f;
    private Rect g = new Rect();
    private boolean h;
    private boolean i;

    public ClockWidget(Context context, a a2) {
        super(context, a2);
        this.c = context;
        this.d = new d();
    }

    public static /* synthetic */ void h(ClockWidget clockWidget) {
        clockWidget.j();
    }

    private void i() {
        new Thread((Runnable)new w2.a(this)).start();
    }

    private /* synthetic */ void j() {
        while (this.h) {
            SystemClock.sleep((long)1000L);
            if (this.i) continue;
            this.k();
            this.postInvalidate();
        }
    }

    private void k() {
        this.d.v();
    }

    public boolean d(Object object) {
        if (object == this.d.k()) {
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
        Log.d((String)"ClockWidget", (String)"onUpdateData::");
        ClockArea clockArea = this.e;
        if (clockArea != null) {
            this.d.w(clockArea.getContentWidth(), this.e.getContentHeight());
            this.d.v();
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
        this.d.u();
        Bitmap bitmap = this.d.l();
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
        Clock clock;
        ClockArea clockArea;
        this.e = clockArea = (ClockArea)area;
        this.f = clock = clockArea.getClock();
        if (clock.typeface == null) {
            clock.typeface = k.f((Context)this.c).g("\u5b8b\u4f53");
        }
        this.d.x(this.f);
    }
}


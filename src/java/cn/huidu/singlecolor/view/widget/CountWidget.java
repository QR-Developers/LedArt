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
 *  android.util.Log
 *  android.view.View
 *  cn.huidu.cpplibs.image.HScale
 *  cn.huidu.singlecolor.model.area.CountArea
 *  cn.huidu.singlecolor.model.widget.Count
 *  cn.huidu.singlecolor.view.WidgetView
 *  java.lang.Object
 *  java.lang.String
 *  l5.k
 *  t2.a
 *  u2.f
 */
package cn.huidu.singlecolor.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import cn.huidu.cpplibs.image.HScale;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.area.CountArea;
import cn.huidu.singlecolor.model.widget.Count;
import cn.huidu.singlecolor.view.WidgetView;
import l5.k;
import t2.a;
import u2.f;

@SuppressLint(value={"ViewConstructor"})
public class CountWidget
extends WidgetView {
    private Context c;
    private f d;
    private CountArea e;
    private Count f;
    private Rect g = new Rect();
    private boolean h;

    public CountWidget(Context context, a a2) {
        super(context, a2);
        this.c = context;
        this.d = new f();
    }

    public boolean d(Object object) {
        if (object == this.e.getCount()) {
            this.g();
            return true;
        }
        return false;
    }

    public void e() {
        super.e();
    }

    public void f() {
        super.f();
    }

    public void g() {
        Log.d((String)"CountWidget", (String)"onUpdateData::");
        CountArea countArea = this.e;
        if (countArea != null) {
            this.d.d(countArea.getContentWidth(), this.e.getContentHeight());
            this.invalidate();
        }
    }

    protected void onAttachedToWindow() {
        View.super.onAttachedToWindow();
        if (!this.h) {
            this.h = true;
        }
    }

    protected void onDetachedFromWindow() {
        View.super.onDetachedFromWindow();
        if (this.h) {
            this.h = false;
        }
    }

    protected void onDraw(Canvas canvas) {
        View.super.onDraw(canvas);
        this.d.c();
        Bitmap bitmap = this.d.b();
        if (bitmap != null) {
            Bitmap bitmap2 = HScale.c((Bitmap)bitmap, (int)((int)(0.5f + this.b.getScale())), (int)0);
            this.g.set(0, 0, canvas.getWidth(), canvas.getHeight());
            canvas.drawBitmap(bitmap2, null, this.g, null);
        }
    }

    public void setDisableAnim(boolean bl) {
    }

    public void setModel(Area area) {
        Count count;
        CountArea countArea;
        this.e = countArea = (CountArea)area;
        this.f = count = countArea.getCount();
        if (count.typeface == null) {
            count.typeface = k.f((Context)this.c).g("\u5b8b\u4f53");
        }
        this.d.e(this.f);
    }
}


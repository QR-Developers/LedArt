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
 *  android.view.View
 *  cn.huidu.cpplibs.image.HScale
 *  cn.huidu.singlecolor.model.area.TemperatureHumidityArea
 *  cn.huidu.singlecolor.model.widget.TemperatureHumidity
 *  cn.huidu.singlecolor.view.WidgetView
 *  java.lang.Object
 *  java.lang.String
 *  l5.k
 *  t2.a
 *  u2.i
 */
package cn.huidu.singlecolor.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import cn.huidu.cpplibs.image.HScale;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.area.TemperatureHumidityArea;
import cn.huidu.singlecolor.model.widget.TemperatureHumidity;
import cn.huidu.singlecolor.view.WidgetView;
import l5.k;
import t2.a;
import u2.i;

@SuppressLint(value={"ViewConstructor"})
public class TemperatureHumidityWidget
extends WidgetView {
    private Context c;
    private i d;
    private TemperatureHumidityArea e;
    private TemperatureHumidity f;
    private Rect g = new Rect();
    private boolean h;

    public TemperatureHumidityWidget(Context context, a a2) {
        super(context, a2);
        this.c = context;
        this.d = new i();
    }

    public boolean d(Object object) {
        if (object == this.e.getTemperatureHumidity()) {
            this.g();
            return true;
        }
        return false;
    }

    public void g() {
        TemperatureHumidityArea temperatureHumidityArea = this.e;
        if (temperatureHumidityArea != null) {
            this.d.h(temperatureHumidityArea.getContentWidth(), this.e.getContentHeight());
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
        this.d.g();
        Bitmap bitmap = this.d.f();
        if (bitmap != null) {
            Bitmap bitmap2 = HScale.c((Bitmap)bitmap, (int)((int)(0.5f + this.b.getScale())), (int)0);
            this.g.set(0, 0, canvas.getWidth(), canvas.getHeight());
            canvas.drawBitmap(bitmap2, null, this.g, null);
        }
    }

    public void setModel(Area area) {
        TemperatureHumidityArea temperatureHumidityArea;
        TemperatureHumidity temperatureHumidity;
        this.e = temperatureHumidityArea = (TemperatureHumidityArea)area;
        this.f = temperatureHumidity = temperatureHumidityArea.getTemperatureHumidity();
        if (temperatureHumidity.typeface == null) {
            temperatureHumidity.typeface = k.f((Context)this.c).g("\u5b8b\u4f53");
        }
        this.d.i(this.f);
    }
}


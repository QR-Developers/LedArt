/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.util.Log
 *  android.view.View
 *  cn.huidu.singlecolor.model.area.TextArea
 *  cn.huidu.singlecolor.model.effect.Effects
 *  cn.huidu.singlecolor.model.effect.ExtBackground
 *  cn.huidu.singlecolor.model.widget.Text
 *  cn.huidu.singlecolor.view.WidgetView
 *  java.lang.Object
 *  java.lang.String
 *  s2.u
 *  s2.u$a
 *  s2.u$e
 *  t2.a
 *  u2.e
 *  u2.g
 *  u2.h
 *  w2.c
 */
package cn.huidu.singlecolor.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.area.TextArea;
import cn.huidu.singlecolor.model.effect.Effects;
import cn.huidu.singlecolor.model.effect.ExtBackground;
import cn.huidu.singlecolor.model.widget.Text;
import cn.huidu.singlecolor.view.WidgetView;
import s2.u;
import t2.a;
import u2.e;
import u2.g;
import u2.h;
import w2.c;

@SuppressLint(value={"ViewConstructor"})
public class TextWidget
extends WidgetView
implements h.a {
    private TextArea c;
    private Text d;
    private h e;
    private e f;
    private boolean g;
    private int h;
    private r2.c i;

    public TextWidget(Context context, a a2) {
        h h2;
        super(context, a2);
        this.e = h2 = new h(true);
        h2.j0((h.a)this);
        this.f = new e(context);
    }

    public static /* synthetic */ void h(TextWidget textWidget, int n2, Bitmap bitmap) {
        textWidget.i(n2, bitmap);
    }

    private /* synthetic */ void i(int n2, Bitmap bitmap) {
        this.e.f0(bitmap, n2);
    }

    @Override
    public int a() {
        return this.h;
    }

    @Override
    public void b(int n2) {
        u.e e2 = new u.e();
        e2.a = this.i;
        e2.b = this.c.getContentWidth();
        e2.c = this.c.getContentHeight();
        e2.e = n2;
        e2.d = (int)this.b.getScale();
        u.f((u.e)e2, (u.a)new c(this, n2));
    }

    @Override
    public Effects c(int n2) {
        return this.d.effects;
    }

    public boolean d(Object object) {
        if (object == this.d) {
            this.g();
            return true;
        }
        return false;
    }

    public void g() {
        r2.c c2;
        Log.d((String)"TextWidget", (String)"onUpdateData::");
        ExtBackground extBackground = this.c.extBackground;
        boolean bl = extBackground != null && extBackground.enableColorful;
        this.g = bl;
        if (bl) {
            this.f.c(extBackground.colorfulImagePath, extBackground.colorfulSpeed, this.b.getColorLevel(), this.b.getGrayLevel());
        } else {
            this.f.b();
        }
        this.i = c2 = new r2.c(this.d, false, this.g);
        c2.d(this.getContext(), this.c.getContentWidth(), this.c.getContentHeight());
        r2.c c3 = this.i;
        this.h = c3.w;
        this.d.fontSize = (int)c3.f;
        this.e.l0(0);
    }

    protected void onDetachedFromWindow() {
        View.super.onDetachedFromWindow();
        Log.d((String)"TextWidget", (String)"onDetachedFromWindow::");
        this.f.b();
    }

    protected void onDraw(Canvas canvas) {
        TextArea textArea = this.c;
        if (textArea != null) {
            if (this.g) {
                this.f.d(canvas);
                h h2 = this.e;
                TextArea textArea2 = this.c;
                h2.d0(canvas, textArea2.width, textArea2.height);
                this.f.a(canvas);
            } else {
                this.e.d0(canvas, textArea.width, textArea.height);
            }
        }
        this.invalidate();
    }

    public void setModel(Area area) {
        TextArea textArea;
        this.c = textArea = (TextArea)area;
        this.d = textArea.getText();
    }
}


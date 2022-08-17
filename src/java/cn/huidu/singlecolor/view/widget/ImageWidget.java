/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.view.View
 *  cn.huidu.singlecolor.model.Node
 *  cn.huidu.singlecolor.model.area.ImageArea
 *  cn.huidu.singlecolor.model.effect.Effects
 *  cn.huidu.singlecolor.model.widget.Image
 *  cn.huidu.singlecolor.view.WidgetView
 *  java.lang.Object
 *  java.lang.String
 *  m0.c
 *  s2.u
 *  s2.u$a
 *  s2.u$d
 *  t2.a
 *  u2.h
 *  w2.b
 */
package cn.huidu.singlecolor.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.Node;
import cn.huidu.singlecolor.model.area.ImageArea;
import cn.huidu.singlecolor.model.effect.Effects;
import cn.huidu.singlecolor.model.widget.Image;
import cn.huidu.singlecolor.view.WidgetView;
import m0.c;
import s2.u;
import t2.a;
import u2.h;
import w2.b;

@SuppressLint(value={"ViewConstructor"})
public class ImageWidget
extends WidgetView
implements h.a {
    private ImageArea c;
    private h d;
    private c e;

    public ImageWidget(Context context, a a2) {
        h h2;
        super(context, a2);
        this.d = h2 = new h(false);
        h2.j0((h.a)this);
    }

    public static /* synthetic */ void h(ImageWidget imageWidget, int n2, Bitmap bitmap) {
        imageWidget.i(n2, bitmap);
    }

    private /* synthetic */ void i(int n2, Bitmap bitmap) {
        this.d.f0(bitmap, n2);
    }

    @Override
    public int a() {
        ImageArea imageArea = this.c;
        if (imageArea == null) {
            return 0;
        }
        return imageArea.childCount();
    }

    @Override
    public void b(int n2) {
        Image image = (Image)this.c.getChild(n2);
        u.d d2 = new u.d();
        d2.a = image.path;
        d2.b = this.c.getContentWidth();
        d2.c = this.c.getContentHeight();
        d2.f = this.b.getColorLevel();
        d2.e = this.b.getGrayLevel();
        d2.d = (int)this.b.getScale();
        u.e((u.d)d2, (u.a)new b(this, n2));
    }

    @Override
    public Effects c(int n2) {
        Image image = (Image)this.c.getChild(n2);
        this.d.k0(image.isGif);
        if (image.isGif) {
            c c2;
            c c3 = this.e;
            if (c3 != null) {
                c3.o();
                this.e = null;
            }
            this.e = c2 = new c();
            c2.j(this.getContext());
            this.e.k(image.path, image.isAsset);
            this.e.l(false);
            this.e.g(this.c.getContentWidth(), this.c.getContentHeight());
            this.e.m((int)this.b.getScale());
            this.e.i(this.b.getColorLevel(), this.b.getGrayLevel());
            this.e.n();
        }
        return image.effects;
    }

    public boolean d(Object object) {
        int n2;
        if (object instanceof Image && (n2 = this.c.indexOf((Node)((Image)object))) != -1) {
            this.d.l0(n2);
            return true;
        }
        return false;
    }

    public void g() {
        c c2 = this.e;
        if (c2 != null) {
            c2.o();
            this.e = null;
        }
        this.d.l0(0);
    }

    @Override
    public Bitmap getGifFrame() {
        c c2 = this.e;
        if (c2 == null) {
            return null;
        }
        return c2.c();
    }

    @Override
    public int getGifLoopCount() {
        c c2 = this.e;
        if (c2 == null) {
            return 0;
        }
        return c2.e();
    }

    protected void onDetachedFromWindow() {
        View.super.onDetachedFromWindow();
        c c2 = this.e;
        if (c2 != null) {
            c2.o();
        }
    }

    protected void onDraw(Canvas canvas) {
        ImageArea imageArea = this.c;
        if (imageArea != null) {
            this.d.d0(canvas, imageArea.width, imageArea.height);
        }
        this.invalidate();
    }

    public void setModel(Area area) {
        this.c = (ImageArea)area;
    }
}


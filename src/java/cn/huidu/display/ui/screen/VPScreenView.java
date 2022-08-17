/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  androidx.annotation.NonNull
 *  cn.huidu.display.R
 *  cn.huidu.display.R$id
 *  cn.huidu.display.R$layout
 *  cn.huidu.display.ui.screen.OperateMaskView
 *  cn.huidu.display.ui.screen.OperateMaskView$a
 *  cn.huidu.display.ui.screen.VPScreenView$a
 *  cn.huidu.display.ui.screen.VPScreenView$b
 *  cn.huidu.display.ui.screen.VPScreenView$c
 *  cn.huidu.display.ui.screen.WindowAreaView
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  r0.b
 */
package cn.huidu.display.ui.screen;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import cn.huidu.display.R;
import cn.huidu.display.ui.screen.OperateMaskView;
import cn.huidu.display.ui.screen.VPScreenView;
import cn.huidu.display.ui.screen.WindowAreaView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class VPScreenView
extends FrameLayout
implements ViewTreeObserver.OnGlobalLayoutListener,
OperateMaskView.a {
    private FrameLayout a;
    private FrameLayout b;
    private OperateMaskView c;
    private float d;
    private int e;
    private int f;
    private float g;
    private int h;
    private int i;
    private List<r0.b> j;
    private r0.b k;
    private a l;
    private b m;
    private c n;

    public VPScreenView(@NonNull Context context) {
        super(context);
        this.o(context);
    }

    public VPScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o(context);
    }

    private void c(r0.b b2) {
        WindowAreaView windowAreaView = new WindowAreaView(this.getContext());
        windowAreaView.b(b2, this.getAreaList().size());
        this.b.addView((View)windowAreaView);
        windowAreaView.d(this.d);
        windowAreaView.e(this.getAreaList().size());
    }

    private float l() {
        float f2 = 0.8f * (float)this.e;
        float f3 = (float)this.f / 3.0f;
        return Math.min((float)(f2 / (float)this.h), (float)(f3 / (float)this.i));
    }

    private void m(r0.b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = b2.f();
        int n7 = b2.g();
        int n8 = b2.e();
        int n9 = b2.b();
        if (n6 < 0) {
            b2.m(0);
        }
        if (n7 < 0) {
            b2.n(0);
        }
        if ((n5 = n8 + b2.f()) > (n3 = this.h)) {
            b2.l(n3 - b2.f());
        }
        if ((n4 = n9 + b2.g()) > (n2 = this.i)) {
            b2.h(n2 - b2.g());
        }
    }

    private float n(float f2, float f3) {
        if (Math.abs((float)f3) < Math.abs((float)f2)) {
            f2 = f3;
        }
        return f2;
    }

    private void o(Context context) {
        OperateMaskView operateMaskView;
        LayoutInflater.from((Context)context).inflate(R.layout.window_screen_layout, (ViewGroup)this);
        this.c = operateMaskView = (OperateMaskView)this.findViewById(R.id.cover_view);
        operateMaskView.setCallback((OperateMaskView.a)this);
        this.a = (FrameLayout)this.findViewById(R.id.border_view);
        this.b = (FrameLayout)this.findViewById(R.id.container);
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.e = displayMetrics.widthPixels;
        this.f = displayMetrics.heightPixels;
        this.g = 8.0f * displayMetrics.density;
        this.j = new ArrayList();
    }

    private float r(float f2) {
        if (f2 > (float)(this.getWidth() - this.a.getPaddingLeft())) {
            f2 = this.getWidth() - this.a.getPaddingLeft();
        }
        if (f2 < (float)(this.a.getPaddingRight() - this.a.getWidth())) {
            f2 = this.a.getPaddingRight() - this.a.getWidth();
        }
        return f2;
    }

    private float s(float f2) {
        if (f2 > (float)(this.getHeight() - this.a.getPaddingTop())) {
            f2 = this.getHeight() - this.a.getPaddingTop();
        }
        if (f2 < (float)(this.a.getPaddingBottom() - this.a.getHeight())) {
            f2 = this.a.getPaddingBottom() - this.a.getHeight();
        }
        return f2;
    }

    private void y(int n2, int n3, float f2) {
        int n4 = (int)(0.5f + f2 * (float)n2);
        int n5 = (int)(0.5f + f2 * (float)n3);
        int n6 = this.a.getPaddingTop();
        int n7 = this.a.getPaddingBottom();
        int n8 = this.a.getPaddingLeft();
        int n9 = this.a.getPaddingRight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.a.getLayoutParams();
        layoutParams.width = n9 + (n4 + n8);
        layoutParams.height = n7 + (n5 + n6);
        this.a.requestLayout();
    }

    public float a(View view, float f2) {
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < this.b.getChildCount(); ++i2) {
            View view2 = this.b.getChildAt(i2);
            if (view2 == view) continue;
            f3 = this.n(this.n(f3, (float)view2.getLeft() - f2), (float)view2.getRight() - f2);
        }
        int n2 = this.b.getWidth();
        float f4 = this.n(f3, 0.0f - f2);
        float f5 = n2;
        float f6 = this.n(this.n(f4, f5 / 2.0f - f2), f5 - f2);
        float f7 = Math.abs((float)f6) FCMPG this.g;
        float f8 = 0.0f;
        if (f7 < 0) {
            f8 = f6;
        }
        return f8;
    }

    public float b(View view, float f2) {
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < this.b.getChildCount(); ++i2) {
            View view2 = this.b.getChildAt(i2);
            if (view2 == view) continue;
            f3 = this.n(this.n(f3, (float)view2.getTop() - f2), (float)view2.getBottom() - f2);
        }
        int n2 = this.b.getHeight();
        float f4 = this.n(f3, 0.0f - f2);
        float f5 = n2;
        float f6 = this.n(this.n(f4, f5 / 2.0f - f2), f5 - f2);
        float f7 = Math.abs((float)f6) FCMPG this.g;
        float f8 = 0.0f;
        if (f7 < 0) {
            f8 = f6;
        }
        return f8;
    }

    public void d() {
        Log.d((String)"ScreenView", (String)"onZoomStart::");
        this.b.setVisibility(4);
    }

    public void e() {
        Log.d((String)"ScreenView", (String)"onZoomEnd::");
        this.b.setVisibility(0);
        float f2 = this.d;
        float f3 = f2 > 1.0f ? (float)Math.round((float)f2) : (float)Math.round((float)(f2 * 10.0f)) / 10.0f;
        this.setScale(f3);
    }

    public float f(float f2) {
        float f3 = this.a.getX();
        float f4 = this.r(f2 + f3);
        this.a.setX(f4);
        return f4 - f3;
    }

    public float g(float f2) {
        float f3 = this.a.getY();
        float f4 = this.s(f2 + f3);
        this.a.setY(f4);
        return f4 - f3;
    }

    public List<r0.b> getAreaList() {
        return this.j;
    }

    public int getScreenHeight() {
        return this.i;
    }

    public int getScreenWidth() {
        return this.h;
    }

    public void h(View view) {
        WindowAreaView windowAreaView = (WindowAreaView)view;
        windowAreaView.c(this.d);
        this.m(windowAreaView.getModel());
        b b2 = this.m;
        if (b2 != null) {
            b2.H(windowAreaView.getModel());
        }
    }

    public void i(View view) {
        WindowAreaView windowAreaView = (WindowAreaView)view;
        windowAreaView.c(this.d);
        this.m(windowAreaView.getModel());
        b b2 = this.m;
        if (b2 != null) {
            b2.C1(windowAreaView.getModel());
        }
    }

    public void j(float f2, float f3) {
        float f4;
        float f5;
        if (Math.abs((float)f2) > Math.abs((float)f3)) {
            int n2 = this.h;
            f4 = f2 + (float)n2 * this.d;
            f5 = n2;
        } else {
            int n3 = this.i;
            f4 = f3 + (float)n3 * this.d;
            f5 = n3;
        }
        float f6 = f4 / f5;
        if (f6 < 0.1f) {
            f6 = 0.1f;
        }
        if (f6 > 20.0f) {
            f6 = 20.0f;
        }
        if (this.d != f6) {
            this.d = f6;
            this.y(this.h, this.i, f6);
        }
    }

    public void k(float f2, float f3) {
        WindowAreaView windowAreaView;
        int n2 = -1 + this.b.getChildCount();
        do {
            windowAreaView = null;
            if (n2 < 0 || f2 > (float)(windowAreaView = (WindowAreaView)this.b.getChildAt(n2)).getLeft() && f2 < (float)windowAreaView.getRight() && f3 > (float)windowAreaView.getTop() && f3 < (float)windowAreaView.getBottom()) break;
            --n2;
        } while (true);
        if (windowAreaView != null) {
            r0.b b2 = windowAreaView.getModel();
            this.w(b2);
            a a2 = this.l;
            if (a2 != null) {
                a2.F(b2);
                return;
            }
        } else {
            this.c.b();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }

    public void onGlobalLayout() {
        FrameLayout frameLayout = this.a;
        frameLayout.setX(this.r(frameLayout.getX()));
        FrameLayout frameLayout2 = this.a;
        frameLayout2.setY(this.s(frameLayout2.getY()));
        int[] arrn = new int[2];
        this.b.getLocationInWindow(arrn);
        this.c.q(arrn[0], arrn[1], this.b.getWidth(), this.b.getHeight());
    }

    public boolean p() {
        return this.c.d();
    }

    public boolean q() {
        return this.c.e();
    }

    public void setAreaList(List<r0.b> list) {
        this.j.clear();
        if (list != null) {
            this.j.addAll(list);
        }
        this.b.removeAllViews();
        Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            this.c((r0.b)iterator.next());
        }
    }

    public void setOnAreaClickListener(a a2) {
        this.l = a2;
    }

    public void setOnAreaDragListener(b b2) {
        this.m = b2;
    }

    public void setOnScreenScaleChangedListener(c c2) {
        this.n = c2;
    }

    public void setScale(float f2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setScale::");
        stringBuilder.append(f2);
        Log.d((String)"ScreenView", (String)stringBuilder.toString());
        if (f2 < 0.1f) {
            f2 = 0.1f;
        }
        if (f2 > 20.0f) {
            f2 = 20.0f;
        }
        this.d = f2;
        this.y(this.h, this.i, f2);
        for (int i2 = 0; i2 < this.b.getChildCount(); ++i2) {
            ((WindowAreaView)this.b.getChildAt(i2)).d(f2);
        }
        float f3 = this.d;
        float f4 = f3 * 64.0f;
        float f5 = f3 * 64.0f;
        this.c.p(f4, f5);
        c c2 = this.n;
        if (c2 != null) {
            c2.f(f2);
        }
    }

    public void t(boolean bl) {
        this.c.f(bl);
    }

    public void u(boolean bl) {
        this.c.g(bl);
    }

    public void v() {
        for (int i2 = 0; i2 < this.b.getChildCount(); ++i2) {
            WindowAreaView windowAreaView = (WindowAreaView)this.b.getChildAt(i2);
            windowAreaView.d(this.d);
            windowAreaView.e(this.getAreaList().size());
            boolean bl = windowAreaView.getModel() == this.k;
            windowAreaView.setSelectedStyle(bl);
        }
    }

    public void w(r0.b b2) {
        this.k = b2;
        WindowAreaView windowAreaView = null;
        for (int i2 = 0; i2 < this.b.getChildCount(); ++i2) {
            WindowAreaView windowAreaView2 = (WindowAreaView)this.b.getChildAt(i2);
            if (windowAreaView2.getModel() == b2) {
                windowAreaView2.setSelectedStyle(true);
                windowAreaView = windowAreaView2;
                continue;
            }
            windowAreaView2.setSelectedStyle(false);
        }
        if (windowAreaView != null) {
            this.b.bringChildToFront(windowAreaView);
            this.c.o(windowAreaView);
        }
    }

    public void x(int n2, int n3) {
        this.h = n2;
        this.i = n3;
        this.setScale(this.l());
    }
}


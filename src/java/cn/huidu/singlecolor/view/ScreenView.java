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
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  androidx.annotation.NonNull
 *  cn.huidu.singlecolor.R
 *  cn.huidu.singlecolor.R$id
 *  cn.huidu.singlecolor.R$layout
 *  cn.huidu.singlecolor.model.Node
 *  cn.huidu.singlecolor.view.AreaView
 *  cn.huidu.singlecolor.view.ProgramView
 *  cn.huidu.singlecolor.view.ScreenView$a
 *  cn.huidu.singlecolor.view.ScreenView$b
 *  cn.huidu.singlecolor.view.ScreenView$c
 *  cn.huidu.singlecolor.view.operate.ScreenCoverView
 *  cn.huidu.singlecolor.view.operate.ScreenCoverView$a
 *  cn.huidu.singlecolor.view.operate.ScreenCoverView$b
 *  cn.huidu.singlecolor.view.operate.ScreenCoverView$c
 *  cn.huidu.singlecolor.view.operate.ScreenCoverView$d
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  t2.a
 */
package cn.huidu.singlecolor.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import cn.huidu.singlecolor.R;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.Node;
import cn.huidu.singlecolor.model.Program;
import cn.huidu.singlecolor.model.Screen;
import cn.huidu.singlecolor.view.AreaView;
import cn.huidu.singlecolor.view.ProgramView;
import cn.huidu.singlecolor.view.ScreenView;
import cn.huidu.singlecolor.view.operate.ScreenCoverView;

public class ScreenView
extends FrameLayout
implements ScreenCoverView.a,
ScreenCoverView.b,
ScreenCoverView.c,
ScreenCoverView.d,
ViewTreeObserver.OnGlobalLayoutListener,
t2.a {
    private int a = 20;
    private int b = 1;
    private Screen c;
    private FrameLayout d;
    private ScreenCoverView e;
    private ProgramView f;
    private float g;
    private int h;
    private int i;
    private a j;
    private b k;
    private c l;

    public ScreenView(@NonNull Context context) {
        super(context);
        this.n();
    }

    public ScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n();
    }

    private void n() {
        ScreenCoverView screenCoverView;
        LayoutInflater.from((Context)this.getContext()).inflate(R.layout.screen_view, (ViewGroup)this);
        this.d = (FrameLayout)this.findViewById(R.id.program_container);
        this.e = screenCoverView = (ScreenCoverView)this.findViewById(R.id.cover_view);
        screenCoverView.setOnDragListener((ScreenCoverView.b)this);
        this.e.setOnMoveListener((ScreenCoverView.c)this);
        this.e.setOnZoomListener((ScreenCoverView.d)this);
        this.e.setOnAreaClickListener((ScreenCoverView.a)this);
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.h = displayMetrics.widthPixels;
        this.i = displayMetrics.heightPixels;
    }

    private void p(int n2, int n3, float f2) {
        int n4 = (int)(0.5f + f2 * (float)n2);
        int n5 = (int)(0.5f + f2 * (float)n3);
        int n6 = this.d.getPaddingTop();
        int n7 = this.d.getPaddingBottom();
        int n8 = this.d.getPaddingLeft();
        int n9 = this.d.getPaddingRight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.d.getLayoutParams();
        layoutParams.width = n9 + (n4 + n8);
        layoutParams.height = n7 + (n5 + n6);
        this.d.requestLayout();
    }

    public void a() {
        b b2 = this.k;
        if (b2 != null) {
            b2.a();
        }
    }

    public void b() {
        b b2 = this.k;
        if (b2 != null) {
            b2.b();
        }
    }

    public void c() {
        b b2 = this.k;
        if (b2 != null) {
            b2.c();
        }
    }

    public void d() {
        Log.d((String)"ScreenView", (String)"onZoomStart::");
        ProgramView programView = this.f;
        if (programView != null) {
            programView.setVisibility(4);
        }
    }

    public void e() {
        Log.d((String)"ScreenView", (String)"onZoomEnd::");
        if (this.f != null) {
            this.b = 1;
            this.setScale((int)(0.5f + this.g));
            this.f.setVisibility(0);
        }
    }

    public float f(float f2) {
        float f3 = this.d.getX();
        float f4 = f2 + f3;
        if (f4 > (float)(this.getWidth() - this.d.getPaddingLeft())) {
            f4 = this.getWidth() - this.d.getPaddingLeft();
        }
        if (f4 < (float)(this.d.getPaddingRight() - this.d.getWidth())) {
            f4 = this.d.getPaddingRight() - this.d.getWidth();
        }
        this.d.setX(f4);
        return f4 - f3;
    }

    public float g(float f2) {
        float f3 = this.d.getY();
        float f4 = f2 + f3;
        if (f4 > (float)(this.getHeight() - this.d.getPaddingTop())) {
            f4 = this.getHeight() - this.d.getPaddingTop();
        }
        if (f4 < (float)(this.d.getPaddingBottom() - this.d.getHeight())) {
            f4 = this.d.getPaddingBottom() - this.d.getHeight();
        }
        this.d.setY(f4);
        return f4 - f3;
    }

    public int getColorLevel() {
        Screen screen = this.c;
        if (screen == null) {
            return 0;
        }
        return screen.colorLevel;
    }

    public FrameLayout getContainer() {
        return this.d;
    }

    public int getGrayLevel() {
        Screen screen = this.c;
        if (screen == null) {
            return 1;
        }
        return screen.grayLevel;
    }

    public Screen getModel() {
        return this.c;
    }

    public float getScale() {
        return this.g;
    }

    public int getScreenHeight() {
        Screen screen = this.c;
        if (screen == null) {
            return 0;
        }
        return screen.height;
    }

    public int getScreenWidth() {
        Screen screen = this.c;
        if (screen == null) {
            return 0;
        }
        return screen.width;
    }

    public void h(float f2) {
        float f3;
        int n2;
        float f4;
        Screen screen = this.c;
        int n3 = screen.width;
        float f5 = n3;
        int n4 = this.h;
        if (f5 > (float)(n4 / 3)) {
            f5 = n4 / 3;
        }
        if (f5 <= 0.0f) {
            f5 = 256.0f;
        }
        if ((f4 = (f3 = this.g) + f2 / f5) < 1.0f) {
            f4 = 1.0f;
        }
        if (f4 > (float)(n2 = this.a)) {
            f4 = n2;
        }
        if (f3 != f4) {
            this.g = f4;
            this.p(n3, screen.height, f4);
        }
    }

    public void i(AreaView areaView) {
        a a2 = this.j;
        if (a2 != null) {
            a2.t1(areaView.getModel());
        }
    }

    public int j() {
        int n2;
        this.b = n2 = Math.max((int)Math.round((float)(80.0f / (float)this.c.width)), (int)Math.round((float)(80.0f / (float)this.c.height)));
        if (n2 < 1) {
            this.b = 1;
        }
        int n3 = this.h;
        int n4 = this.i / 4;
        float f2 = n3;
        Screen screen = this.c;
        return (int)Math.min((float)(f2 / (float)screen.width), (float)((float)n4 / (float)screen.height));
    }

    public void k() {
        ProgramView programView = this.f;
        if (programView != null) {
            programView.setFrontAreaView(null);
        }
        this.e.b();
    }

    public void l(Area area) {
        ProgramView programView = this.f;
        if (programView == null) {
            return;
        }
        AreaView areaView = programView.b(area);
        if (areaView == null) {
            Log.d((String)"ScreenView", (String)"editArea::area view not found!");
            return;
        }
        this.f.setFrontAreaView(areaView);
        this.e.d(areaView);
    }

    public boolean m(MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }

    public void o(Area area) {
        ProgramView programView = this.f;
        if (programView == null) {
            return;
        }
        AreaView areaView = programView.b(area);
        if (areaView == null) {
            Log.d((String)"ScreenView", (String)"selectArea::area view not found!");
            return;
        }
        this.f.setFrontAreaView(areaView);
        this.e.q(areaView);
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
        float f2 = this.d.getX();
        if (f2 > (float)(this.getWidth() - this.d.getPaddingLeft())) {
            f2 = this.getWidth() - this.d.getPaddingLeft();
        }
        if (f2 < (float)(this.d.getPaddingRight() - this.d.getWidth())) {
            f2 = this.d.getPaddingRight() - this.d.getWidth();
        }
        this.d.setX(f2);
        float f3 = this.d.getY();
        if (f3 > (float)(this.getHeight() - this.d.getPaddingTop())) {
            f3 = this.getHeight() - this.d.getPaddingTop();
        }
        if (f3 < (float)(this.d.getPaddingBottom() - this.d.getHeight())) {
            f3 = this.d.getPaddingBottom() - this.d.getHeight();
        }
        this.d.setY(f3);
        this.e.s();
    }

    public void q(int n2) {
        ProgramView programView;
        Program program = (Program)this.c.getChild(n2);
        if (program == null) {
            Log.d((String)"ScreenView", (String)"switchProgram::illegal program index!");
            return;
        }
        this.f = programView = new ProgramView(this.getContext(), (t2.a)this);
        programView.setModel(program);
        this.d.removeAllViews();
        this.d.addView((View)this.f);
        this.f.e();
        this.c.lastEditProgram = n2;
        this.e.b();
        this.e.setProgramView(this.f);
    }

    public void r(Object object) {
        ProgramView programView;
        Log.d((String)"ScreenView", (String)"onUpdateData::");
        if (object instanceof Screen) {
            Screen screen = this.c;
            if (object != screen) {
                this.setModel(screen);
            } else {
                screen.correctProgramSize();
                Screen screen2 = this.c;
                this.p(screen2.width, screen2.height, this.g);
                ProgramView programView2 = this.f;
                if (programView2 != null) {
                    programView2.e();
                }
            }
        }
        if (object instanceof Program) {
            ProgramView programView3 = this.f;
            Program program = programView3 != null ? programView3.getModel() : null;
            if (object != program) {
                this.q(this.c.indexOf((Node)((Program)((Object)object))));
                return;
            }
            this.e.b();
        }
        if ((programView = this.f) != null) {
            programView.a(object);
        }
    }

    public void setModel(Screen screen) {
        this.c = screen;
        if (screen != null) {
            for (int i2 = 0; i2 < this.c.childCount(); ++i2) {
                Program program = (Program)this.c.getChild(i2);
                if (program == null) continue;
                Screen screen2 = this.c;
                program.width = screen2.width;
                program.height = screen2.height;
            }
        }
        this.setScale(this.j());
    }

    public void setOnAreaClickListener(a a2) {
        this.j = a2;
    }

    public void setOnAreaDragListener(b b2) {
        this.k = b2;
    }

    public void setOnScreenScaleChangedListener(c c2) {
        this.l = c2;
    }

    public void setScale(int n2) {
        ScreenCoverView screenCoverView;
        c c2;
        int n3;
        float f2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setScale::");
        stringBuilder.append(n2);
        Log.d((String)"ScreenView", (String)stringBuilder.toString());
        int n4 = this.b;
        if (n2 < n4) {
            n2 = n4;
        }
        if (n2 > (n3 = this.a)) {
            n2 = n3;
        }
        this.g = f2 = (float)n2;
        Screen screen = this.c;
        this.p(screen.width, screen.height, f2);
        ProgramView programView = this.f;
        if (programView != null) {
            programView.e();
        }
        if ((screenCoverView = this.e) != null) {
            screenCoverView.setScale(f2);
        }
        if ((c2 = this.l) != null) {
            c2.B(n2);
        }
    }
}


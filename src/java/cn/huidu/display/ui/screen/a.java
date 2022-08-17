/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PathEffect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  cn.huidu.display.ui.screen.a$a
 *  java.lang.Double
 *  java.lang.Math
 */
package cn.huidu.display.ui.screen;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import cn.huidu.display.ui.screen.a;

public class a
extends u0.a {
    private int n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;

    public a(View view) {
        super(view);
    }

    private void h(Canvas canvas, float f2, float f3) {
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setColor(-1);
        canvas.drawCircle(f2, f3, 20.0f, this.a);
        double d2 = 20.0f;
        Double.isNaN((double)d2);
        float f4 = (float)(d2 * 0.8);
        this.a.setColor(-13395457);
        canvas.drawCircle(f2, f3, f4, this.a);
    }

    private void i(Canvas canvas, float f2, float f3, float f4, float f5) {
        this.a.setAntiAlias(true);
        this.a.setColor(-16724737);
        this.a.setStrokeWidth(4.0f);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setPathEffect(this.b);
        canvas.drawRect(f2, f3, f4, f5, this.a);
        this.a.setPathEffect(null);
    }

    private void j(Canvas canvas, float f2, float f3) {
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setColor(-1);
            canvas.drawRoundRect(f2 - 18.0f, f3 - 18.0f, f2 + 18.0f, f3 + 18.0f, 3.0f, 3.0f, this.a);
            this.a.setColor(-13395457);
            canvas.drawRoundRect(f2 - 14.400001f, f3 - 14.400001f, f2 + 14.400001f, f3 + 14.400001f, 3.0f, 3.0f, this.a);
            return;
        }
        this.a.setColor(-1);
        canvas.drawRect(f2 - 18.0f, f3 - 18.0f, f2 + 18.0f, f3 + 18.0f, this.a);
        this.a.setColor(-13395457);
        canvas.drawRect(f2 - 14.400001f, f3 - 14.400001f, f2 + 14.400001f, f3 + 14.400001f, this.a);
    }

    private void k(float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        if (this.q) {
            return;
        }
        float f10 = this.e;
        float f11 = this.d;
        float f12 = f10 - f11;
        float f13 = this.g;
        float f14 = this.f;
        float f15 = f13 - f14;
        this.d = f5 = f11 + f2;
        this.e = f10 + f2;
        float f16 = this.l;
        if (f5 < f16) {
            this.d = f16;
            this.e = f16 + f12;
        }
        if ((f4 = this.e) > (f7 = this.j) - f16) {
            float f17;
            this.e = f17 = f7 - f16;
            this.d = f17 - f12;
        }
        this.f = f9 = f14 + f3;
        this.g = f13 + f3;
        if (f9 < f16) {
            this.f = f16;
            this.g = f16 + f15;
        }
        if ((f8 = this.g) > (f6 = this.k) - f16) {
            float f18;
            this.g = f18 = f6 - f16;
            this.f = f18 - f15;
        }
    }

    private void l(float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        if (this.r) {
            return;
        }
        this.g = f6 = f2 + this.g;
        float f7 = this.f;
        float f8 = this.p;
        if (f6 < f7 + f8) {
            this.g = f7 + f8;
        }
        if ((f4 = this.g) > (f3 = this.k) - (f5 = this.l)) {
            this.g = f3 - f5;
        }
    }

    private void m(float f2) {
        if (!this.q) {
            float f3;
            float f4;
            float f5;
            float f6;
            if (this.r) {
                return;
            }
            this.d = f6 = f2 + this.d;
            float f7 = this.l;
            if (f6 < f7) {
                this.d = f7;
            }
            if ((f4 = this.d) > (f5 = this.e) - (f3 = this.o)) {
                this.d = f5 - f3;
            }
        }
    }

    private void n(float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        if (this.r) {
            return;
        }
        this.e = f6 = f2 + this.e;
        float f7 = this.d;
        float f8 = this.o;
        if (f6 < f7 + f8) {
            this.e = f7 + f8;
        }
        if ((f4 = this.e) > (f3 = this.j) - (f5 = this.l)) {
            this.e = f3 - f5;
        }
    }

    private void o(float f2) {
        if (!this.q) {
            float f3;
            float f4;
            float f5;
            float f6;
            if (this.r) {
                return;
            }
            this.f = f6 = f2 + this.f;
            float f7 = this.l;
            if (f6 < f7) {
                this.f = f7;
            }
            if ((f4 = this.f) > (f5 = this.g) - (f3 = this.p)) {
                this.f = f5 - f3;
            }
        }
    }

    private void s() {
        int n2 = Math.round((float)this.d);
        int n3 = Math.round((float)this.f);
        int n4 = Math.round((float)this.e);
        int n5 = Math.round((float)this.g);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.c.getLayoutParams();
        marginLayoutParams.leftMargin = n2;
        marginLayoutParams.topMargin = n3;
        marginLayoutParams.width = n4 - n2;
        marginLayoutParams.height = n5 - n3;
        this.c.requestLayout();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Canvas var1_1) {
        var2_2 = this.d;
        var3_3 = this.h;
        var4_4 = var2_2 + var3_3;
        var5_5 = this.f;
        var6_6 = this.i;
        var7_7 = var5_5 + var6_6;
        var8_8 = var3_3 + this.e;
        var9_9 = var6_6 + this.g;
        var10_10 = (var8_8 + var4_4) / 2.0f;
        var11_11 = (var9_9 + var7_7) / 2.0f;
        this.i(var1_1, var4_4, var7_7, var8_8, var9_9);
        this.h(var1_1, var4_4, var7_7);
        this.h(var1_1, var8_8, var7_7);
        this.h(var1_1, var8_8, var9_9);
        this.h(var1_1, var4_4, var9_9);
        if (var8_8 - var4_4 > 100.0f) {
            this.j(var1_1, var10_10, var7_7);
            this.j(var1_1, var10_10, var9_9);
        }
        if (var9_9 - var7_7 > 100.0f) {
            this.j(var1_1, var4_4, var11_11);
            this.j(var1_1, var8_8, var11_11);
        }
        if ((var12_12 = this.n) <= 0) return;
        switch (var12_12) {
            default: {
                var4_4 = 0.0f;
                var7_7 = 0.0f;
                break;
            }
            case 6: {
                var7_7 = var9_9;
                ** GOTO lbl44
            }
            case 5: {
                var4_4 = var8_8;
            }
            case 7: {
                var7_7 = var9_9;
                break;
            }
            case 4: {
                var4_4 = var8_8;
            }
            case 8: {
                var7_7 = var11_11;
                break;
            }
            case 3: {
                var4_4 = var8_8;
                break;
            }
lbl44: // 2 sources:
            case 2: {
                var4_4 = var10_10;
            }
            case 1: 
        }
        this.a.setColor(1308622847);
        var1_1.drawCircle(var4_4, var7_7, 100.0f, this.a);
    }

    @Override
    public void e() {
        float f2;
        float f3;
        float f4;
        float f5;
        super.e();
        float f6 = this.d;
        float f7 = this.l;
        if (f6 < f7) {
            this.d = f7;
        }
        if (this.f < f7) {
            this.f = f7;
        }
        if ((f3 = this.e) > (f4 = this.j) - f7) {
            this.e = f4 - f7;
        }
        if ((f5 = this.g) > (f2 = this.k) - f7) {
            this.g = f2 - f7;
        }
    }

    protected float g(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f6 * f6;
        float f8 = f5 - f3;
        return (float)Math.sqrt((double)(f7 + f8 * f8));
    }

    public void p(a a2) {
        if (a2 == null) {
            this.n = -1;
            return;
        }
        switch (this.n) {
            default: {
                break;
            }
            case 8: {
                float f2 = this.d;
                this.d = f2 + a2.a(this.c, f2);
                break;
            }
            case 7: {
                float f3 = this.d;
                this.d = f3 + a2.a(this.c, f3);
                float f4 = this.g;
                this.g = f4 + a2.b(this.c, f4);
                break;
            }
            case 6: {
                float f5 = this.g;
                this.g = f5 + a2.b(this.c, f5);
                break;
            }
            case 5: {
                float f6 = this.e;
                this.e = f6 + a2.a(this.c, f6);
                float f7 = this.g;
                this.g = f7 + a2.b(this.c, f7);
                break;
            }
            case 4: {
                float f8 = this.e;
                this.e = f8 + a2.a(this.c, f8);
                break;
            }
            case 3: {
                float f9 = this.e;
                this.e = f9 + a2.a(this.c, f9);
                float f10 = this.f;
                this.f = f10 + a2.b(this.c, f10);
                break;
            }
            case 2: {
                float f11 = this.f;
                this.f = f11 + a2.b(this.c, f11);
                break;
            }
            case 1: {
                float f12 = this.d;
                this.d = f12 + a2.a(this.c, f12);
                float f13 = this.f;
                this.f = f13 + a2.b(this.c, f13);
            }
        }
        this.s();
        this.n = -1;
    }

    public void q(float f2, float f3) {
        switch (this.n) {
            default: {
                break;
            }
            case 8: {
                this.m(f2);
                break;
            }
            case 7: {
                this.m(f2);
                this.l(f3);
                break;
            }
            case 6: {
                this.l(f3);
                break;
            }
            case 5: {
                this.n(f2);
                this.l(f3);
                break;
            }
            case 4: {
                this.n(f2);
                break;
            }
            case 3: {
                this.n(f2);
                this.o(f3);
                break;
            }
            case 2: {
                this.o(f3);
                break;
            }
            case 1: {
                this.m(f2);
                this.o(f3);
                break;
            }
            case 0: {
                this.k(f2, f3);
            }
        }
        this.s();
    }

    public boolean r(float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        this.n = -1;
        float f9 = this.d;
        float f10 = this.h;
        float f11 = f9 + f10;
        float f12 = this.f;
        float f13 = this.i;
        float f14 = f12 + f13;
        float f15 = f10 + this.e;
        float f16 = f13 + this.g;
        float f17 = (f11 + f15) / 2.0f;
        float f18 = (f14 + f16) / 2.0f;
        float f19 = this.m;
        float f20 = 2.0f * f19;
        float f21 = f11 - f20;
        float f22 = Float.MAX_VALUE;
        if (f2 > f21 && f2 < f11 + f19 && f3 > f14 - f20 && f3 < f14 + f19 && (f6 = this.g(f2, f3, f11, f14)) < f22) {
            this.n = 1;
            f22 = f6;
        }
        if (f2 > (f7 = f15 - f19) && f2 < f15 + f20 && f3 > f14 - f20 && f3 < f14 + f19 && (f8 = this.g(f2, f3, f15, f14)) < f22) {
            this.n = 3;
            f22 = f8;
        }
        if (f2 > f7 && f2 < f15 + f20 && f3 > f16 - f19 && f3 < f16 + f20 && (f5 = this.g(f2, f3, f15, f16)) < f22) {
            this.n = 5;
            f22 = f5;
        }
        if (f2 > f21 && f2 < f11 + f19 && f3 > f16 - f19 && f3 < f16 + f20 && (f4 = this.g(f2, f3, f11, f16)) < f22) {
            this.n = 7;
            f22 = f4;
        }
        if (f15 - f11 > 100.0f) {
            float f23;
            float f24;
            if (f2 > f11 && f2 < f15 && f3 > f14 - f20 && f3 < f14 + f19 && (f24 = this.g(f2, f3, f17, f14)) < f22) {
                this.n = 2;
                f22 = f24;
            }
            if (f2 > f11 && f2 < f15 && f3 > f16 - f19 && f3 < f16 + f20 && (f23 = this.g(f2, f3, f17, f16)) < f22) {
                this.n = 6;
                f22 = f23;
            }
        }
        if (f16 - f14 > 100.0f) {
            float f25;
            float f26;
            if (f3 > f14 && f3 < f16 && f2 > f21 && f2 < f19 + f11 && (f26 = this.g(f2, f3, f11, f18)) < f22) {
                this.n = 8;
                f22 = f26;
            }
            if (f3 > f14 && f3 < f16 && f2 > f7 && f2 < f20 + f15 && (f25 = this.g(f2, f3, f15, f18)) < f22) {
                this.n = 4;
                f22 = f25;
            }
        }
        if (f2 > f11 && f2 < f15 && f3 > f14 && f3 < f16 && this.g(f2, f3, f17, f18) < f22) {
            this.n = 0;
        }
        return this.n != -1;
    }

    public void t(boolean bl, boolean bl2) {
        this.q = bl;
        this.r = bl2;
    }

    public void u(float f2, float f3) {
        this.o = f2;
        this.p = f3;
    }
}


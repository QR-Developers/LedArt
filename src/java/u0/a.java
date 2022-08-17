/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.DashPathEffect
 *  android.graphics.Paint
 *  android.graphics.PathEffect
 *  android.view.View
 *  java.lang.Object
 *  u0.b
 */
package u0;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.view.View;
import u0.b;

public class a
implements b {
    protected Paint a = new Paint();
    protected final PathEffect b;
    protected final View c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected float i;
    protected float j;
    protected float k;
    protected float l;
    protected float m = 50.0f;

    public a(View view) {
        this.c = view;
        this.e();
        this.b = new DashPathEffect(new float[]{12.0f, 8.0f}, 0.0f);
    }

    public void a(Canvas canvas) {
        float f2 = this.d;
        float f3 = this.h;
        float f4 = f2 + f3;
        float f5 = this.f;
        float f6 = this.i;
        float f7 = f5 + f6;
        float f8 = f3 + this.e;
        float f9 = f6 + this.g;
        this.a.setAntiAlias(true);
        this.a.setColor(-16724737);
        this.a.setStrokeWidth(4.0f);
        this.a.setPathEffect(this.b);
        canvas.drawLine(f4, f7, f8, f7, this.a);
        canvas.drawLine(f8, f7, f8, f9, this.a);
        canvas.drawLine(f8, f9, f4, f9, this.a);
        canvas.drawLine(f4, f9, f4, f7, this.a);
    }

    public void b(float f2, float f3) {
        this.h = f2;
        this.i = f3;
    }

    public void c(float f2, float f3) {
        this.j = f2;
        this.k = f3;
        this.e();
    }

    public View d() {
        return this.c;
    }

    public void e() {
        this.d = this.c.getLeft();
        this.e = this.c.getRight();
        this.f = this.c.getTop();
        this.g = this.c.getBottom();
    }

    public void f(float f2) {
        this.m = f2 * 20.0f;
    }
}


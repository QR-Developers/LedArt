/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  androidx.annotation.ColorInt
 *  java.lang.Object
 *  java.lang.String
 */
package f3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;

public class e {
    private Drawable a;
    private Drawable b;
    private String c;
    private ColorStateList d;
    private int e;
    private Typeface f;
    private int g;
    private int h = -2;
    private int i = -2;
    private int j = 0;

    public e(Context context) {
    }

    public Drawable a() {
        return this.a;
    }

    public int b() {
        return this.i;
    }

    public Drawable c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return this.e;
    }

    public Typeface g() {
        return this.f;
    }

    public ColorStateList h() {
        return this.d;
    }

    public int i() {
        return this.j;
    }

    public int j() {
        return this.h;
    }

    public e k(@ColorInt int n2) {
        this.a = new ColorDrawable(n2);
        return this;
    }

    public e l(int n2) {
        this.i = n2;
        return this;
    }

    public e m(String string) {
        this.c = string;
        return this;
    }

    public e n(@ColorInt int n2) {
        this.d = ColorStateList.valueOf((int)n2);
        return this;
    }

    public e o(int n2) {
        this.h = n2;
        return this;
    }
}


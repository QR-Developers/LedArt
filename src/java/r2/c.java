/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Paint
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  cn.huidu.singlecolor.model.effect.Effects
 *  cn.huidu.singlecolor.model.widget.Text
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.UUID
 *  l5.k
 *  n0.c
 */
package r2;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import cn.huidu.singlecolor.model.effect.Effects;
import cn.huidu.singlecolor.model.widget.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import l5.k;
import r2.b;

public class c {
    public String a;
    public int b;
    public boolean c;
    public String d;
    public Typeface e;
    public float f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public List<CharSequence> x;
    public UUID y;

    public c(Text text, boolean bl, boolean bl2) {
        int n2 = text.effects.effect;
        this.b = n2 != 202 && n2 != 203 ? (n2 == 204 ? 2 : 0) : 1;
        String string = text.reverseOrder ? c.c(text.content) : text.content;
        this.a = string;
        this.d = text.fontName;
        this.f = text.fontSize;
        int n3 = bl2 ? -1 : text.fontColor;
        this.g = n3;
        int[] arrn = bl2 ? null : (text.reverseOrder ? c.b(text.fontColors) : text.fontColors);
        this.m = arrn;
        int n4 = bl ? text.bgColor : 0;
        this.h = n4;
        this.i = text.bold;
        this.j = text.italic;
        this.k = text.underline;
        this.n = text.align;
        this.v = text.lineCount;
        this.o = text.rotate;
        this.p = text.canvasRotate;
        this.q = text.letterSpacing;
        this.r = text.lineSpacing;
        this.s = text.xElongate;
        this.t = text.yElongate;
        this.u = text.centerCorrection;
        this.l = text.mirror;
        this.c = bl ^ true;
        this.x = new ArrayList();
        this.w = 0;
    }

    private static int a(String string, Paint paint, int n2) {
        int n3 = 0;
        int n4 = 400;
        int n5 = -1;
        while (n3 <= n4) {
            n5 = n3 + n4 >> 1;
            paint.setTextSize((float)n5);
            int n6 = n0.c.b((String)string, (Paint)paint).c();
            if (Math.abs((int)(n6 - n2)) < 2) {
                return n5;
            }
            if (n6 < n2) {
                n3 = n5 + 1;
                continue;
            }
            n4 = n5 - 1;
        }
        return n5;
    }

    private static int[] b(int[] arrn) {
        if (arrn != null && arrn.length > 0) {
            int[] arrn2 = new int[arrn.length];
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                arrn2[i2] = arrn[-1 + (arrn.length - i2)];
            }
            return arrn2;
        }
        return arrn;
    }

    private static String c(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            string = new StringBuffer(string).reverse().toString();
        }
        return string;
    }

    public void d(Context context, int n2, int n3) {
        this.e = k.f((Context)context).g(this.d);
        this.y = UUID.randomUUID();
        if (this.v == 1) {
            TextPaint textPaint = new TextPaint();
            b.o((Paint)textPaint, this);
            this.f = c.a(this.a, (Paint)textPaint, n3);
        }
        if (this.b == 0) {
            this.x = b.s(this, n2, n3);
        }
        this.w = b.b(this, n2, n3);
    }
}


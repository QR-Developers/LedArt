/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.SpannableStringBuilder
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  n0.b
 *  n0.c
 *  s2.f
 */
package r2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import m5.b0;
import s2.f;

public class b {
    public static int b(r2.c c2, int n2, int n3) {
        boolean bl = b.k(c2, n2, n3, 0, null);
        int n4 = 0;
        if (bl) {
            n4 = c2.w;
        }
        return n4;
    }

    public static CharSequence c(r2.c c2) {
        String string = c2.a;
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        int[] arrn = c2.m;
        if (arrn != null) {
            if (arrn.length != string.length()) {
                return string;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)string);
            r2.a.b((CharSequence)spannableStringBuilder, c2.g, arrn);
            return spannableStringBuilder;
        }
        return string;
    }

    private static boolean d(r2.c c2, int n2, int n3, int n4, a a2) {
        int n5;
        int n6;
        int n7 = n4;
        int n8 = c2.p;
        if (n8 != 90 && n8 != 270) {
            n5 = n2;
            n6 = n3;
        } else {
            n6 = n2;
            n5 = n3;
        }
        TextPaint textPaint = new TextPaint();
        b.o((Paint)textPaint, c2);
        List<CharSequence> list = c2.x;
        if (a2 == null) {
            c2.w = list.size();
            return true;
        }
        int n9 = list.size();
        String string = "Text2Image";
        if (n7 >= n9) {
            Log.d((String)string, (String)"drawMultiPageText::illegal page index!");
            return false;
        }
        Canvas canvas = new Canvas();
        int n10 = 0;
        while (n10 < list.size()) {
            Canvas canvas2;
            int n11;
            String string2;
            if (n7 != -1 && n7 != n10) {
                n11 = n10;
                canvas2 = canvas;
                string2 = string;
            } else {
                CharSequence charSequence = (CharSequence)list.get(n10);
                Layout.Alignment alignment = b.l(c2.n);
                int n12 = n5;
                n11 = n10;
                Canvas canvas3 = canvas;
                string2 = string;
                StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, n12, alignment, 1.0f, 0.0f, false);
                Bitmap bitmap = f.a((int)n5, (int)n6);
                if (bitmap == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("drawMultiPageText::create bitmap failed: ");
                    stringBuilder.append(n5);
                    stringBuilder.append("-");
                    stringBuilder.append(n6);
                    Log.d((String)string2, (String)stringBuilder.toString());
                    return false;
                }
                float f2 = b.n(n6, staticLayout.getHeight(), c2.n) + (float)c2.u;
                bitmap.eraseColor(c2.h);
                canvas2 = canvas3;
                canvas2.setBitmap(bitmap);
                canvas2.save();
                canvas2.translate(0.0f, f2);
                staticLayout.draw(canvas2);
                canvas2.restore();
                if (c2.l) {
                    bitmap = f.d((Bitmap)bitmap);
                }
                if (n8 != 0) {
                    bitmap = f.e((Bitmap)bitmap, (int)(-n8));
                }
                a2.a(bitmap);
            }
            n10 = n11 + 1;
            string = string2;
            canvas = canvas2;
            n7 = n4;
        }
        return true;
    }

    private static boolean e(r2.c c2, int n2, int n3, int n4, a a2) {
        int n5;
        int n6;
        int n7 = n4;
        int n8 = c2.p;
        if (n8 != 90 && n8 != 270) {
            n6 = n2;
            n5 = n3;
        } else {
            n5 = n2;
            n6 = n3;
        }
        Paint paint = new Paint();
        b.o(paint, c2);
        List<c> list = b.t(c2, paint, n6, n5);
        if (a2 == null) {
            c2.w = list.size();
            return true;
        }
        int n9 = list.size();
        String string = "Text2Image";
        if (n7 >= n9) {
            Log.d((String)string, (String)"drawMultiPageTextS::illegal page index!");
            return false;
        }
        Canvas canvas = new Canvas();
        RectF rectF = new RectF();
        int n10 = ((c)list.get((int)0)).e;
        Bitmap bitmap = f.a((int)n10, (int)n10);
        int n11 = 0;
        while (n11 < list.size()) {
            int n12;
            int n13;
            int n14;
            String string2;
            List<c> list2;
            int n15;
            if (n7 != -1 && n7 != n11) {
                n15 = n8;
                n13 = n6;
                n12 = n5;
                list2 = list;
                string2 = string;
                n14 = n11;
            } else {
                c c3 = (c)list.get(n11);
                Bitmap bitmap2 = f.a((int)n6, (int)n5);
                if (bitmap2 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("drawMultiPageText::create bitmap failed: ");
                    stringBuilder.append(n6);
                    stringBuilder.append("-");
                    stringBuilder.append(n5);
                    Log.d((String)string, (String)stringBuilder.toString());
                    return false;
                }
                bitmap2.eraseColor(c2.h);
                canvas.setBitmap(bitmap2);
                float f2 = n5;
                float f3 = c3.b;
                n12 = n5;
                float f4 = b.n(f2, f3, c2.n) + (float)c2.u;
                for (int i2 = 0; i2 < c3.d(); ++i2) {
                    b b2 = c3.c(i2);
                    List<c> list3 = list;
                    float f5 = n6;
                    int n16 = n6;
                    float f6 = b2.b;
                    String string3 = string;
                    float f7 = b.m(f5, f6, c2.n);
                    if (f7 > 0.0f) {
                        f7 += (float)b2.d / 2.0f;
                    }
                    for (int i3 = 0; i3 < b2.d(); ++i3) {
                        d d2 = b2.c(i3);
                        int n17 = n11;
                        paint.setColor(d2.b);
                        String string4 = d2.a;
                        int n18 = c2.o;
                        int n19 = n8;
                        Bitmap bitmap3 = b.j(paint, string4, n18, d2.e, bitmap);
                        rectF.set(f7, f4, f7 + (float)d2.c, f4 + (float)d2.d);
                        canvas.drawBitmap(bitmap3, null, rectF, null);
                        f7 += (float)d2.c;
                        if (!b.p(d2.a)) {
                            f7 += (float)b2.d;
                        }
                        n11 = n17;
                        n8 = n19;
                    }
                    int n20 = n8;
                    f4 += (float)(b2.c + c3.c);
                    list = list3;
                    n6 = n16;
                    string = string3;
                    n8 = n20;
                }
                int n21 = n8;
                n13 = n6;
                list2 = list;
                string2 = string;
                n14 = n11;
                if (c2.l) {
                    bitmap2 = f.d((Bitmap)bitmap2);
                }
                n15 = n21;
                if (n21 != 0) {
                    bitmap2 = f.e((Bitmap)bitmap2, (int)(-n15));
                }
                a2.a(bitmap2);
            }
            n11 = n14 + 1;
            n8 = n15;
            n5 = n12;
            list = list2;
            n6 = n13;
            string = string2;
            n7 = n4;
        }
        return true;
    }

    private static boolean f(r2.c c2, int n2, int n3, int n4, a a2) {
        int n5;
        int n6;
        int n7 = c2.p;
        if (n7 != 90 && n7 != 270) {
            n6 = n2;
            n5 = n3;
        } else {
            n5 = n2;
            n6 = n3;
        }
        TextPaint textPaint = new TextPaint();
        b.o((Paint)textPaint, c2);
        CharSequence charSequence = b.q(b.c(c2));
        float f2 = textPaint.measureText(charSequence, 0, charSequence.length());
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, (int)(10.0f + f2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int n8 = (int)Math.ceil((double)(f2 / (float)n6));
        boolean bl = true;
        if (a2 == null) {
            c2.w = n8;
            return bl;
        }
        if (n4 >= n8) {
            Log.d((String)"Text2Image", (String)"drawSingleLineText::illegal page index!");
            return false;
        }
        n0.b b2 = n0.c.a((Layout)staticLayout, (float)f2);
        float f3 = b.n(n5, b2.c(), c2.n) + (float)b2.b() + (float)c2.u;
        Canvas canvas = new Canvas();
        for (int i2 = 0; i2 < n8; ++i2) {
            if (n4 == -1 || n4 == i2) {
                boolean bl2;
                int n9;
                boolean bl3 = n7 == 180 || n7 == 90;
                boolean bl4 = bl3 ^ c2.l;
                int n10 = i2 * n6;
                if (bl4) {
                    n10 = (int)(f2 - (float)(n6 * (i2 + 1)));
                }
                if (bl4) {
                    bl2 = n10 < 0;
                } else {
                    boolean bl5 = (float)(n10 + n6) > f2;
                    bl2 = bl5;
                }
                if (c2.c && bl2) {
                    if (bl4) {
                        n9 = n10 + n6;
                        n10 = 0;
                    } else {
                        n9 = (int)(0.5f + (f2 - (float)n10));
                    }
                } else {
                    n9 = n6;
                }
                Bitmap bitmap = f.a((int)n9, (int)n5);
                if (bitmap == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("drawSingleLineText::create bitmap failed: ");
                    stringBuilder.append(n6);
                    stringBuilder.append("-");
                    stringBuilder.append(n5);
                    Log.d((String)"Text2Image", (String)stringBuilder.toString());
                    return false;
                }
                bitmap.eraseColor(c2.h);
                canvas.setBitmap(bitmap);
                canvas.save();
                canvas.translate((float)(-n10), f3);
                staticLayout.draw(canvas);
                canvas.restore();
                if (c2.l) {
                    bitmap = f.d((Bitmap)bitmap);
                }
                if (n7 != 0) {
                    bitmap = f.e((Bitmap)bitmap, (int)(-n7));
                }
                a2.a(bitmap);
            }
            bl = true;
        }
        return bl;
    }

    private static boolean g(r2.c c2, int n2, int n3, int n4, a a2) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = n4;
        int n10 = c2.p;
        if (n10 != 90 && n10 != 270) {
            n5 = n2;
            n7 = n3;
        } else {
            n7 = n2;
            n5 = n3;
        }
        Paint paint = new Paint();
        b.o(paint, c2);
        String string = b.r(c2.a);
        n0.b b2 = n0.c.b((String)string, (Paint)paint);
        int n11 = 2 + b2.c();
        float f2 = 1 + b2.a();
        int n12 = n11 + c2.s;
        if (n12 < 1) {
            n12 = 1;
        }
        if ((n8 = n11 + c2.t) < 1) {
            n8 = 1;
        }
        if ((n6 = c2.q) + n12 < 1) {
            n6 = 1 - n12;
        }
        int n13 = n12 + n6;
        int n14 = n13 * string.length() - n6;
        float f3 = (float)n14 / (float)n5;
        int n15 = n12;
        int n16 = (int)Math.ceil((double)f3);
        if (a2 == null) {
            c2.w = n16;
            return true;
        }
        String string2 = "Text2Image";
        if (n9 >= n16) {
            Log.d((String)string2, (String)"drawSingleLineTextS::illegal page index!");
            return false;
        }
        int[] arrn = c2.m;
        Canvas canvas = new Canvas();
        int n17 = n13;
        RectF rectF = new RectF();
        Bitmap bitmap = f.a((int)n11, (int)n11);
        float f4 = f2;
        int n18 = 0;
        while (n18 < n16) {
            int n19;
            Bitmap bitmap2;
            Canvas canvas2;
            int n20;
            int n21;
            int n22;
            int n23;
            String string3;
            float f5;
            int n24;
            int n25;
            int n26;
            Bitmap bitmap3 = bitmap;
            if (n9 != -1 && n9 != n18) {
                n23 = n15;
                n25 = n16;
                n22 = n5;
                n21 = n7;
                n19 = n18;
                string3 = string2;
                n24 = n8;
                n20 = n14;
                n26 = n17;
                f5 = f4;
                bitmap2 = bitmap3;
                canvas2 = canvas;
            } else {
                int n27;
                int n28 = n18 * n5;
                boolean bl = n10 == 180 || n10 == 90;
                if (bl ^ c2.l) {
                    n28 = n5 * (n16 - 1 - n18);
                }
                if (c2.c && n28 + n5 > n14) {
                    n27 = (int)(0.5f + (float)(n14 - n28));
                    n25 = n16;
                } else {
                    n25 = n16;
                    n27 = n5;
                }
                Bitmap bitmap4 = f.a((int)n27, (int)n7);
                if (bitmap4 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("drawSingleLineTextS::create bitmap failed: ");
                    stringBuilder.append(n5);
                    stringBuilder.append("-");
                    stringBuilder.append(n7);
                    Log.d((String)string2, (String)stringBuilder.toString());
                    return false;
                }
                n22 = n5;
                bitmap4.eraseColor(c2.h);
                canvas.setBitmap(bitmap4);
                canvas.save();
                float f6 = -n28;
                string3 = string2;
                canvas.translate(f6, 0.0f);
                float f7 = n7;
                float f8 = n8;
                n21 = n7;
                float f9 = b.n(f7, f8, c2.n) + (float)c2.u;
                n24 = n8;
                n20 = n14;
                float f10 = 0.0f;
                for (int i2 = 0; i2 < string.length(); ++i2) {
                    float f11;
                    int n29;
                    float f12;
                    int n30;
                    Bitmap bitmap5;
                    int n31 = n15;
                    int n32 = n18;
                    rectF.set(f10, f9, f10 + (float)n31, f9 + f8);
                    float f13 = rectF.right;
                    float f14 = n28;
                    if (!(f13 - f14 < 0.0f) && !(rectF.left - f14 > (float)n27)) {
                        if (arrn != null && i2 < arrn.length) {
                            paint.setColor(arrn[i2]);
                        } else {
                            paint.setColor(c2.g);
                        }
                        String string4 = string.substring(i2, i2 + 1);
                        int n33 = c2.o;
                        n29 = n27;
                        f12 = f4;
                        f11 = f9;
                        bitmap5 = bitmap3;
                        canvas.drawBitmap(b.j(paint, string4, n33, f12, bitmap5), null, rectF, null);
                        n30 = n17;
                    } else {
                        n29 = n27;
                        n30 = n17;
                        f12 = f4;
                        f11 = f9;
                        bitmap5 = bitmap3;
                    }
                    f10 += (float)n30;
                    bitmap3 = bitmap5;
                    n17 = n30;
                    f9 = f11;
                    n18 = n32;
                    f4 = f12;
                    n15 = n31;
                    n27 = n29;
                }
                n23 = n15;
                n19 = n18;
                n26 = n17;
                f5 = f4;
                bitmap2 = bitmap3;
                canvas.restore();
                if (c2.l) {
                    bitmap4 = f.d((Bitmap)bitmap4);
                }
                if (n10 != 0) {
                    bitmap4 = f.e((Bitmap)bitmap4, (int)(-n10));
                }
                canvas2 = canvas;
                a2.a(bitmap4);
            }
            int n34 = n19 + 1;
            f4 = f5;
            bitmap = bitmap2;
            canvas = canvas2;
            n17 = n26;
            n5 = n22;
            string2 = string3;
            n7 = n21;
            n8 = n24;
            n14 = n20;
            n15 = n23;
            n9 = n4;
            n18 = n34;
            n16 = n25;
        }
        return true;
    }

    private static boolean h(r2.c c2, int n2, int n3, int n4, a a2) {
        int n5;
        int n6;
        int n7 = c2.p;
        int n8 = 270;
        if (n7 != 90 && n7 != n8) {
            n5 = n2;
            n6 = n3;
        } else {
            n6 = n2;
            n5 = n3;
        }
        TextPaint textPaint = new TextPaint();
        b.o((Paint)textPaint, c2);
        CharSequence charSequence = b.u(b.c(c2));
        Layout.Alignment alignment = b.l(c2.n);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, n5, alignment, 1.0f, 0.0f, false);
        int n9 = staticLayout.getHeight();
        int n10 = (int)Math.ceil((double)((float)n9 / (float)n6));
        if (a2 == null) {
            c2.w = n10;
            return true;
        }
        if (n4 >= n10) {
            Log.d((String)"Text2Image", (String)"drawSinglePageText::illegal page index!");
            return false;
        }
        Canvas canvas = new Canvas();
        for (int i2 = 0; i2 < n10; ++i2) {
            if (n4 == -1 || n4 == i2) {
                int n11;
                Bitmap bitmap;
                int n12 = n6 * i2;
                if (n7 == 180 || n7 == n8) {
                    n12 = n6 * (n10 - 1 - i2);
                }
                if ((bitmap = f.a((int)n5, (int)(n11 = c2.c && n12 + n6 > n9 ? 2 + (n9 - n12) : n6))) == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("drawSinglePageText::create bitmap failed: ");
                    stringBuilder.append(n5);
                    stringBuilder.append("-");
                    stringBuilder.append(n6);
                    Log.d((String)"Text2Image", (String)stringBuilder.toString());
                    return false;
                }
                bitmap.eraseColor(c2.h);
                canvas.setBitmap(bitmap);
                canvas.save();
                canvas.translate(0.0f, (float)(-n12));
                staticLayout.draw(canvas);
                canvas.restore();
                if (c2.l) {
                    bitmap = f.d((Bitmap)bitmap);
                }
                if (n7 != 0) {
                    bitmap = f.e((Bitmap)bitmap, (int)(-n7));
                }
                a2.a(bitmap);
            }
            n8 = 270;
        }
        return true;
    }

    private static boolean i(r2.c c2, int n2, int n3, int n4, a a2) {
        int n5;
        int n6;
        int n7 = n4;
        int n8 = c2.p;
        if (n8 != 90 && n8 != 270) {
            n6 = n2;
            n5 = n3;
        } else {
            n5 = n2;
            n6 = n3;
        }
        Paint paint = new Paint();
        b.o(paint, c2);
        List<c> list = b.t(c2, paint, n6, Integer.MAX_VALUE);
        int n9 = 0;
        c c3 = (c)list.get(0);
        int n10 = c3.e;
        int n11 = c3.b;
        int n12 = (int)Math.ceil((double)((float)n11 / (float)n5));
        if (a2 == null) {
            c2.w = n12;
            return true;
        }
        String string = "Text2Image";
        if (n7 >= n12) {
            Log.d((String)string, (String)"drawSinglePageText::illegal page index!");
            return false;
        }
        Canvas canvas = new Canvas();
        RectF rectF = new RectF();
        Bitmap bitmap = f.a((int)n10, (int)n10);
        while (n9 < n12) {
            int n13;
            String string2;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            if (n7 != -1 && n7 != n9) {
                n17 = n8;
                n16 = n6;
                n14 = n5;
                n13 = n9;
                n18 = n11;
                n15 = n12;
                string2 = string;
            } else {
                int n19;
                Bitmap bitmap2;
                block18 : {
                    boolean bl = n8 == 180 || n8 == 270;
                    int n20 = n5 * n9;
                    if (bl) {
                        n20 = n5 * (n12 - 1 - n9);
                    }
                    int n21 = n20;
                    int n22 = c2.c && n21 + n5 > n11 ? 2 + (n11 - n21) : n5;
                    n18 = n11;
                    bitmap2 = f.a((int)n6, (int)n22);
                    if (bitmap2 == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("drawSinglePageText::create bitmap failed: ");
                        stringBuilder.append(n6);
                        stringBuilder.append("-");
                        stringBuilder.append(n5);
                        Log.d((String)string, (String)stringBuilder.toString());
                        return false;
                    }
                    n14 = n5;
                    bitmap2.eraseColor(c2.h);
                    canvas.setBitmap(bitmap2);
                    canvas.save();
                    float f2 = -n21;
                    n15 = n12;
                    float f3 = 0.0f;
                    canvas.translate(0.0f, f2);
                    string2 = string;
                    for (int i2 = 0; i2 < c3.d(); ++i2) {
                        int n23;
                        int n24;
                        b b2 = c3.c(i2);
                        n13 = n9;
                        float f4 = n21;
                        float f5 = f3 - f4;
                        int n25 = n21;
                        if (f5 > (float)n22) {
                            n19 = n8;
                            n16 = n6;
                            break block18;
                        }
                        int n26 = b2.c;
                        int n27 = n22;
                        if (f3 + (float)n26 - f4 < 0.0f) {
                            f3 += (float)(n26 + c3.c);
                            n24 = n8;
                            n23 = n6;
                        } else {
                            float f6 = b.m(n6, b2.b, c2.n);
                            if (f6 > 0.0f) {
                                f6 += (float)b2.d / 2.0f;
                            }
                            for (int i3 = 0; i3 < b2.d(); ++i3) {
                                d d2 = b2.c(i3);
                                int n28 = n6;
                                paint.setColor(d2.b);
                                String string3 = d2.a;
                                int n29 = c2.o;
                                int n30 = n8;
                                Bitmap bitmap3 = b.j(paint, string3, n29, d2.e, bitmap);
                                rectF.set(f6, f3, f6 + (float)d2.c, f3 + (float)d2.d);
                                canvas.drawBitmap(bitmap3, null, rectF, null);
                                f6 += (float)d2.c;
                                if (!b.p(d2.a)) {
                                    f6 += (float)b2.d;
                                }
                                n6 = n28;
                                n8 = n30;
                            }
                            n24 = n8;
                            n23 = n6;
                            f3 += (float)(b2.c + c3.c);
                        }
                        n9 = n13;
                        n22 = n27;
                        n21 = n25;
                        n6 = n23;
                        n8 = n24;
                    }
                    n19 = n8;
                    n16 = n6;
                    n13 = n9;
                }
                canvas.restore();
                if (c2.l) {
                    bitmap2 = f.d((Bitmap)bitmap2);
                }
                n17 = n19;
                if (n19 != 0) {
                    bitmap2 = f.e((Bitmap)bitmap2, (int)(-n17));
                }
                a2.a(bitmap2);
            }
            n9 = n13 + 1;
            n5 = n14;
            n8 = n17;
            n11 = n18;
            n12 = n15;
            string = string2;
            n6 = n16;
            n7 = n4;
        }
        return true;
    }

    private static Bitmap j(Paint paint, String string, int n2, float f2, Bitmap bitmap) {
        Canvas canvas = new Canvas();
        bitmap.eraseColor(0);
        canvas.setBitmap(bitmap);
        float f3 = paint.measureText(string);
        canvas.drawText(string, ((float)canvas.getWidth() - f3) / 2.0f, f2, paint);
        return f.e((Bitmap)bitmap, (int)(-n2));
    }

    public static boolean k(r2.c c2, int n2, int n3, int n4, a a2) {
        boolean bl = false;
        if (c2 != null) {
            bl = false;
            if (n2 > 0) {
                if (n3 <= 0) {
                    return false;
                }
                if (c2.r == 0 && c2.q == 0 && c2.o == 0 && c2.s == 0 && c2.t == 0) {
                    boolean bl2;
                    int n5 = c2.b;
                    if (n5 != 0) {
                        if (n5 != 1) {
                            if (n5 != 2) {
                                return false;
                            }
                            int n6 = c2.p;
                            bl2 = n6 != 90 && n6 != 270 ? b.h(c2, n2, n3, n4, a2) : b.f(c2, n2, n3, n4, a2);
                        } else {
                            int n7 = c2.p;
                            bl2 = n7 != 90 && n7 != 270 ? b.f(c2, n2, n3, n4, a2) : b.h(c2, n2, n3, n4, a2);
                        }
                    } else {
                        bl2 = b.d(c2, n2, n3, n4, a2);
                    }
                    return bl2;
                }
                int n8 = c2.b;
                if (n8 != 0) {
                    if (n8 != 1) {
                        if (n8 != 2) {
                            return false;
                        }
                        int n9 = c2.p;
                        if (n9 != 90 && n9 != 270) {
                            return b.i(c2, n2, n3, n4, a2);
                        }
                        return b.g(c2, n2, n3, n4, a2);
                    }
                    int n10 = c2.p;
                    if (n10 != 90 && n10 != 270) {
                        return b.g(c2, n2, n3, n4, a2);
                    }
                    return b.i(c2, n2, n3, n4, a2);
                }
                bl = b.e(c2, n2, n3, n4, a2);
            }
        }
        return bl;
    }

    private static Layout.Alignment l(int n2) {
        int n3 = n2 & 255;
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private static float m(float f2, float f3, int n2) {
        int n3 = n2 & 255;
        float f4 = 0.0f;
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    return 0.0f;
                }
                return (f2 - f3) / 2.0f;
            }
            f4 = f2 - f3;
        }
        return f4;
    }

    private static float n(float f2, float f3, int n2) {
        int n3 = n2 & 65280;
        float f4 = 0.0f;
        if (n3 != 256) {
            if (n3 != 512) {
                if (n3 != 768) {
                    return 0.0f;
                }
                return (f2 - f3) / 2.0f;
            }
            f4 = f2 - f3;
        }
        return f4;
    }

    public static void o(Paint paint, r2.c c2) {
        Typeface typeface = c2.e;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        paint.setTextSize(Math.max((float)c2.f, (float)12.0f));
        paint.setColor(c2.g);
        paint.setUnderlineText(c2.k);
        if (c2.i && !typeface.isBold()) {
            paint.setFakeBoldText(true);
        } else {
            paint.setFakeBoldText(false);
        }
        if (c2.j && !typeface.isItalic()) {
            paint.setTextSkewX(-0.25f);
            return;
        }
        paint.setTextSkewX(0.0f);
    }

    private static boolean p(String string) {
        return b0.d(string) || string.length() <= 0;
        {
        }
    }

    public static CharSequence q(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            int n2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            while ((n2 = spannableStringBuilder.toString().indexOf("\n")) >= 0) {
                if (n2 >= spannableStringBuilder.length()) {
                    return spannableStringBuilder;
                }
                spannableStringBuilder.delete(n2, n2 + 1);
            }
            return spannableStringBuilder;
        }
        return "";
    }

    public static String r(String string) {
        if (string != null) {
            if (string.length() == 0) {
                return "";
            }
            return string.replace((CharSequence)"\n", (CharSequence)"");
        }
        return "";
    }

    /*
     * Exception decompiling
     */
    public static List<CharSequence> s(r2.c var0, int var1, int var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl110 : ALOAD_3 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:923)
        throw new IllegalStateException("Decompilation failed");
    }

    private static List<c> t(r2.c c2, Paint paint, int n2, int n3) {
        String string = b.v(c2.a);
        n0.b b2 = n0.c.b((String)string, (Paint)paint);
        int n4 = 2 + b2.c();
        float f2 = 1 + b2.a();
        int n5 = n4 + c2.s;
        int n6 = n5 < 1 ? 1 : n5;
        int n7 = n4 + c2.t;
        int n8 = n7 < 1 ? 1 : n7;
        int n9 = c2.q;
        if (n9 + n6 < 1) {
            n9 = 1 - n6;
        }
        int n10 = n9;
        int n11 = c2.r;
        if (n11 + n8 < 1) {
            n11 = 1 - n8;
        }
        int n12 = n11;
        int[] arrn = c2.m;
        int n13 = c2.g;
        ArrayList arrayList = new ArrayList();
        c c3 = new c(n12, n3);
        c3.e = n4;
        arrayList.add((Object)c3);
        b b3 = new b(n8, n10, n2);
        c3.a(b3);
        int n14 = 0;
        c c4 = c3;
        while (n14 < string.length()) {
            int n15 = n14 + 1;
            String string2 = string.substring(n14, n15);
            int n16 = arrn != null && n14 < arrn.length ? arrn[n14] : n13;
            int n17 = n13;
            int n18 = n16;
            String string3 = string;
            c c5 = c4;
            int n19 = n6;
            int n20 = n6;
            ArrayList arrayList2 = arrayList;
            int n21 = n8;
            int[] arrn2 = arrn;
            d d2 = new d(string2, n18, n19, n21, f2);
            if (!b3.b(d2)) {
                b3 = new b(n8, n10, n2);
                if (!c5.b(b3)) {
                    c4 = new c(n12, n3);
                    arrayList2.add((Object)c4);
                } else {
                    c4 = c5;
                }
                c4.a(b3);
            } else {
                c4 = c5;
            }
            b3.a(d2);
            n13 = n17;
            arrayList = arrayList2;
            n14 = n15;
            string = string3;
            arrn = arrn2;
            n6 = n20;
        }
        return arrayList;
    }

    public static CharSequence u(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            int n2;
            for (n2 = charSequence.length(); n2 > 0 && charSequence.charAt(n2 - 1) == '\n'; --n2) {
            }
            if (n2 < charSequence.length()) {
                charSequence = charSequence.subSequence(0, n2);
            }
            return charSequence;
        }
        return "";
    }

    public static String v(String string) {
        if (string != null && string.length() != 0) {
            int n2;
            for (n2 = string.length(); n2 > 0 && string.charAt(n2 - 1) == '\n'; --n2) {
            }
            if (n2 < string.length()) {
                string = string.substring(0, n2);
            }
            return string;
        }
        return "";
    }

    public static interface a {
        public void a(Bitmap var1);
    }

    private static class b {
        final List<d> a = new ArrayList();
        int b;
        int c;
        int d;
        int e;
        boolean f = false;

        public b(int n2, int n3, int n4) {
            this.c = n2;
            this.d = n3;
            this.e = n4;
        }

        public void a(d d2) {
            String string = d2.a;
            if (string.equals((Object)"\n")) {
                this.f = true;
                return;
            }
            this.a.add((Object)d2);
            this.b += d2.c;
            if (!b.p(string)) {
                this.b += this.d;
            }
        }

        public boolean b(d d2) {
            boolean bl;
            block5 : {
                block4 : {
                    if (this.f) {
                        return false;
                    }
                    int n2 = this.b;
                    if (n2 == 0) break block4;
                    int n3 = n2 + d2.c + this.d;
                    int n4 = this.e;
                    bl = false;
                    if (n3 >= n4) break block5;
                }
                bl = true;
            }
            return bl;
        }

        public d c(int n2) {
            return (d)this.a.get(n2);
        }

        public int d() {
            return this.a.size();
        }
    }

    private static class c {
        final List<b> a = new ArrayList();
        int b;
        int c;
        int d;
        int e;

        public c(int n2, int n3) {
            this.c = n2;
            this.d = n3;
        }

        public void a(b b2) {
            this.a.add((Object)b2);
            this.b += b2.c + this.c;
        }

        public boolean b(b b2) {
            int n2 = this.b;
            return n2 == 0 || n2 + b2.c + this.c < this.d;
            {
            }
        }

        public b c(int n2) {
            return (b)this.a.get(n2);
        }

        public int d() {
            return this.a.size();
        }
    }

    private static class d {
        String a;
        int b;
        int c;
        int d;
        float e;

        public d(String string, int n2, int n3, int n4, float f2) {
            this.a = string;
            this.b = n2;
            this.c = n3;
            this.d = n4;
            this.e = f2;
        }
    }

}


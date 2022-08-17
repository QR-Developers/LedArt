/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.text.DynamicLayout
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.TextPaint
 *  android.text.style.AlignmentSpan
 *  android.text.style.AlignmentSpan$Standard
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.AlignmentSpan;

public class e {
    public static Bitmap a(int n5, int n6, int n7, String string) {
        int n8;
        SpannableString spannableString = new SpannableString((CharSequence)string);
        spannableString.setSpan((Object)new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, spannableString.length(), 18);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float)n7);
        textPaint.setColor(-65536);
        DynamicLayout dynamicLayout = new DynamicLayout((CharSequence)spannableString, textPaint, n5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, false);
        int n9 = dynamicLayout.getHeight() > n6 ? dynamicLayout.getHeight() : n6;
        Bitmap bitmap = Bitmap.createBitmap((int)n5, (int)n9, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0);
        if (n9 <= n6) {
            canvas.translate(0.0f, (float)((n9 - dynamicLayout.getHeight()) / 2));
            n8 = 0;
        } else {
            n8 = (n9 - n6) / 2;
        }
        dynamicLayout.draw(canvas);
        return Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)n8, (int)n5, (int)n6);
    }
}


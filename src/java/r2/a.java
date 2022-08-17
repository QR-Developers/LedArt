/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.Spanned
 *  android.text.style.ForegroundColorSpan
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 */
package r2;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

public class a {
    public static int[] a(CharSequence charSequence, int n2, int[] arrn) {
        ForegroundColorSpan[] arrforegroundColorSpan;
        Spanned spanned;
        if (arrn == null || arrn.length != charSequence.length()) {
            arrn = new int[charSequence.length()];
        }
        int n3 = 0;
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = n2;
        }
        if (charSequence instanceof Spanned && (arrforegroundColorSpan = (ForegroundColorSpan[])(spanned = (Spanned)charSequence).getSpans(0, charSequence.length(), ForegroundColorSpan.class)) != null && arrforegroundColorSpan.length > 0) {
            int n4 = arrforegroundColorSpan.length;
            while (n3 < n4) {
                ForegroundColorSpan foregroundColorSpan = arrforegroundColorSpan[n3];
                if (foregroundColorSpan.getSpanTypeId() > 0) {
                    int n5 = spanned.getSpanEnd((Object)foregroundColorSpan);
                    int n6 = foregroundColorSpan.getForegroundColor();
                    for (int i3 = spanned.getSpanStart((Object)foregroundColorSpan); i3 < n5; ++i3) {
                        if (i3 < 0 || i3 >= arrn.length) continue;
                        arrn[i3] = n6;
                    }
                }
                ++n3;
            }
        }
        return arrn;
    }

    public static void b(CharSequence charSequence, int n2, int[] arrn) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder)charSequence;
        if (arrn != null && arrn.length == charSequence.length()) {
            int n3 = 0;
            int n4 = 0;
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                if (arrn[i2] == n4) continue;
                spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n4), n3, i2, 34);
                n4 = arrn[i2];
                n3 = i2;
            }
            if (n3 < arrn.length) {
                spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n4), n3, arrn.length, 34);
                return;
            }
        } else {
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n2), 0, spannableStringBuilder.length(), 34);
        }
    }
}


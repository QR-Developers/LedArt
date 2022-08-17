/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.text.Spannable
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.TypefaceSpan
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package m5;

import android.graphics.Point;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import java.util.ArrayList;
import java.util.List;

public class g0 {
    public static int a(Spannable spannable, int n5) {
        ForegroundColorSpan[] arrforegroundColorSpan = (ForegroundColorSpan[])spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class);
        if (arrforegroundColorSpan != null && arrforegroundColorSpan.length > 0) {
            return arrforegroundColorSpan[0].getForegroundColor();
        }
        return n5;
    }

    public static String b(Spannable spannable, String string) {
        TypefaceSpan[] arrtypefaceSpan = (TypefaceSpan[])spannable.getSpans(0, spannable.length(), TypefaceSpan.class);
        if (arrtypefaceSpan != null && arrtypefaceSpan.length > 0) {
            return arrtypefaceSpan[0].getFamily();
        }
        return string;
    }

    public static int c(Spannable spannable, int n5) {
        AbsoluteSizeSpan[] arrabsoluteSizeSpan = (AbsoluteSizeSpan[])spannable.getSpans(0, spannable.length(), AbsoluteSizeSpan.class);
        if (arrabsoluteSizeSpan != null && arrabsoluteSizeSpan.length > 0) {
            return arrabsoluteSizeSpan[0].getSize();
        }
        return n5;
    }

    public static List<Point> d(Spannable spannable, Class class_) {
        int n5 = spannable.length();
        byte[] arrby = new byte[n5];
        int n6 = spannable.length();
        int n7 = 0;
        Object[] arrobject = spannable.getSpans(0, n6, class_);
        for (int i5 = 0; i5 < arrobject.length; ++i5) {
            int n8 = spannable.getSpanEnd(arrobject[i5]);
            for (int i6 = spannable.getSpanStart((Object)arrobject[i5]); i6 < n8; ++i6) {
                if (i6 < 0 || i6 >= n5) continue;
                arrby[i6] = 1;
            }
        }
        for (int i7 = 0; i7 < n5; ++i7) {
            if (spannable.charAt(i7) != '\n') continue;
            arrby[i7] = 1;
        }
        ArrayList arrayList = new ArrayList();
        int n9 = 0;
        while (n7 < n5) {
            if (arrby[n7] != 0) {
                if (n7 > n9) {
                    arrayList.add((Object)new Point(n9, n7));
                }
                n9 = n7 + 1;
            }
            ++n7;
        }
        if (n9 < n5) {
            arrayList.add((Object)new Point(n9, n5));
        }
        return arrayList;
    }

    public static void e(Spannable spannable, int n5) {
        List<Point> list = g0.d(spannable, ForegroundColorSpan.class);
        for (int i5 = 0; i5 < list.size(); ++i5) {
            Point point = (Point)list.get(i5);
            spannable.setSpan((Object)new ForegroundColorSpan(n5), point.x, point.y, 34);
        }
    }

    public static void f(Spannable spannable, int n5) {
        List<Point> list = g0.d(spannable, AbsoluteSizeSpan.class);
        for (int i5 = 0; i5 < list.size(); ++i5) {
            Point point = (Point)list.get(i5);
            spannable.setSpan((Object)new AbsoluteSizeSpan(n5), point.x, point.y, 34);
        }
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.Spannable
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.AlignmentSpan
 *  android.text.style.AlignmentSpan$Standard
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.BitSet
 */
package h3;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.BitSet;

public class l0 {
    public static int a(Spannable spannable, int n2, int n3) {
        BackgroundColorSpan[] arrbackgroundColorSpan = (BackgroundColorSpan[])spannable.getSpans(n2, n3, BackgroundColorSpan.class);
        if (arrbackgroundColorSpan != null && arrbackgroundColorSpan.length > 0) {
            return arrbackgroundColorSpan[0].getBackgroundColor();
        }
        return 0;
    }

    public static String b(Spannable spannable) {
        if (spannable == null) {
            return "left";
        }
        AlignmentSpan.Standard[] arrstandard = (AlignmentSpan.Standard[])spannable.getSpans(0, spannable.length(), AlignmentSpan.Standard.class);
        if (arrstandard != null && arrstandard.length > 0) {
            Layout.Alignment alignment = arrstandard[0].getAlignment();
            if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                return "left";
            }
            if (alignment == Layout.Alignment.ALIGN_OPPOSITE) {
                return "right";
            }
            if (alignment == Layout.Alignment.ALIGN_CENTER) {
                return "center";
            }
        }
        return "left";
    }

    public static int c(Spannable spannable, int n2, int n3) {
        ForegroundColorSpan[] arrforegroundColorSpan = (ForegroundColorSpan[])spannable.getSpans(n2, n3, ForegroundColorSpan.class);
        if (arrforegroundColorSpan != null && arrforegroundColorSpan.length > 0) {
            return arrforegroundColorSpan[0].getForegroundColor();
        }
        return -65536;
    }

    public static int d(Spannable spannable, int n2, int n3) {
        AbsoluteSizeSpan[] arrabsoluteSizeSpan = (AbsoluteSizeSpan[])spannable.getSpans(n2, n3, AbsoluteSizeSpan.class);
        if (arrabsoluteSizeSpan != null && arrabsoluteSizeSpan.length > 0) {
            return arrabsoluteSizeSpan[0].getSize();
        }
        return 24;
    }

    public static boolean e(Spannable spannable, int n2, int n3) {
        if (n2 > n3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isBoldInRange::selStart > selEnd: ");
            stringBuilder.append(n2);
            stringBuilder.append(", ");
            stringBuilder.append(n3);
            Log.d((String)"SpannableUtil", (String)stringBuilder.toString());
            return false;
        }
        StyleSpan[] arrstyleSpan = (StyleSpan[])spannable.getSpans(n2, n3, StyleSpan.class);
        if (arrstyleSpan != null) {
            if (arrstyleSpan.length == 0) {
                return false;
            }
            if (n2 == n3) {
                for (StyleSpan styleSpan : arrstyleSpan) {
                    if (styleSpan.getStyle() != 1 && styleSpan.getStyle() != 3 || spannable.getSpanStart((Object)styleSpan) >= n2 || spannable.getSpanEnd((Object)styleSpan) < n3) continue;
                    return true;
                }
                return false;
            }
            BitSet bitSet = new BitSet(spannable.length());
            bitSet.set(0, spannable.length(), true);
            for (StyleSpan styleSpan : arrstyleSpan) {
                if (styleSpan.getStyle() != 1 && styleSpan.getStyle() != 3) continue;
                bitSet.set(spannable.getSpanStart((Object)styleSpan), spannable.getSpanEnd((Object)styleSpan), false);
            }
            return bitSet.get(n2, n3).isEmpty();
        }
        return false;
    }

    public static boolean f(Spannable spannable, int n2, int n3) {
        if (n2 > n3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isItalicInRange::selStart > selEnd: ");
            stringBuilder.append(n2);
            stringBuilder.append(", ");
            stringBuilder.append(n3);
            Log.d((String)"SpannableUtil", (String)stringBuilder.toString());
            return false;
        }
        StyleSpan[] arrstyleSpan = (StyleSpan[])spannable.getSpans(n2, n3, StyleSpan.class);
        if (arrstyleSpan != null) {
            if (arrstyleSpan.length == 0) {
                return false;
            }
            if (n2 == n3) {
                for (StyleSpan styleSpan : arrstyleSpan) {
                    if (styleSpan.getStyle() != 2 && styleSpan.getStyle() != 3 || spannable.getSpanStart((Object)styleSpan) >= n2 || spannable.getSpanEnd((Object)styleSpan) < n3) continue;
                    return true;
                }
                return false;
            }
            BitSet bitSet = new BitSet(spannable.length());
            bitSet.set(0, spannable.length(), true);
            for (StyleSpan styleSpan : arrstyleSpan) {
                if (styleSpan.getStyle() != 2 && styleSpan.getStyle() != 3) continue;
                bitSet.set(spannable.getSpanStart((Object)styleSpan), spannable.getSpanEnd((Object)styleSpan), false);
            }
            return bitSet.get(n2, n3).isEmpty();
        }
        return false;
    }

    public static boolean g(Spannable spannable, int n2, int n3) {
        if (n2 > n3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isUnderlineInRange::selStart > selEnd: ");
            stringBuilder.append(n2);
            stringBuilder.append(", ");
            stringBuilder.append(n3);
            Log.d((String)"SpannableUtil", (String)stringBuilder.toString());
            return false;
        }
        UnderlineSpan[] arrunderlineSpan = (UnderlineSpan[])spannable.getSpans(n2, n3, UnderlineSpan.class);
        if (arrunderlineSpan != null) {
            if (arrunderlineSpan.length == 0) {
                return false;
            }
            if (n2 == n3) {
                for (UnderlineSpan underlineSpan : arrunderlineSpan) {
                    if (underlineSpan.getSpanTypeId() <= 0 || spannable.getSpanStart((Object)underlineSpan) >= n2 || spannable.getSpanEnd((Object)underlineSpan) < n3) continue;
                    return true;
                }
                return false;
            }
            BitSet bitSet = new BitSet(spannable.length());
            bitSet.set(0, spannable.length(), true);
            for (UnderlineSpan underlineSpan : arrunderlineSpan) {
                if (underlineSpan.getSpanTypeId() <= 0) continue;
                bitSet.set(spannable.getSpanStart((Object)underlineSpan), spannable.getSpanEnd((Object)underlineSpan), false);
            }
            return bitSet.get(n2, n3).isEmpty();
        }
        return false;
    }
}


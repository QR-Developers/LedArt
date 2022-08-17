/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.DecimalFormat
 */
package m5;

import java.text.DecimalFormat;

public class e0 {
    public static String a(long l3) {
        String string;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (l3 >= 0x40000000L) {
            double d4 = l3;
            Double.isNaN((double)d4);
            Double d6 = d4 * 1.0 / 1.073741824E9;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(decimalFormat.format((Object)d6));
            stringBuilder.append(" GB");
            string = stringBuilder.toString();
        } else if (l3 >= 0x100000L) {
            double d7 = l3;
            Double.isNaN((double)d7);
            Double d8 = d7 * 1.0 / 1048576.0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(decimalFormat.format((Object)d8));
            stringBuilder.append(" MB");
            string = stringBuilder.toString();
        } else if (l3 >= 1024L) {
            double d9 = l3;
            Double.isNaN((double)d9);
            Double d10 = d9 * 1.0 / 1024.0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(decimalFormat.format((Object)d10));
            stringBuilder.append(" KB");
            string = stringBuilder.toString();
        } else {
            double d11 = l3;
            Double.isNaN((double)d11);
            Double d12 = d11 * 1.0;
            if (0.0 == d12) {
                string = "0 B";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(decimalFormat.format((Object)d12));
                stringBuilder.append(" B");
                string = stringBuilder.toString();
            }
        }
        if (string.contains((CharSequence)",")) {
            string = string.replace((CharSequence)",", (CharSequence)".");
        }
        return string;
    }
}


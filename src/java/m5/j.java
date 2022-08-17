/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.TimeZone
 */
package m5;

import android.util.Log;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class j {
    public static Calendar a() {
        int n5;
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getDefault();
        int n6 = 11;
        calendar.set(n6, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        if (!timeZone.useDaylightTime()) {
            calendar.set(2, 0);
            calendar.set(5, 1);
            return calendar;
        }
        int n7 = calendar.get(1);
        block0 : do {
            n5 = 0;
            if (n6 < 0) break;
            calendar.set(2, n6);
            for (int i5 = j.c((int)n7, (int)(n6 + 1)); i5 > 0; --i5) {
                calendar.set(5, i5);
                if (!timeZone.inDaylightTime(calendar.getTime())) continue;
                n5 = 0;
                break block0;
            }
            --n6;
        } while (true);
        while (n5 < 24) {
            calendar.set(10, n5);
            if (!timeZone.inDaylightTime(calendar.getTime())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getDSTEnd:: hour: ");
                stringBuilder.append(n5);
                Log.d((String)"DSTUtils", (String)stringBuilder.toString());
                return calendar;
            }
            ++n5;
        }
        return calendar;
    }

    public static Calendar b() {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getDefault();
        int n5 = 0;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        if (!timeZone.useDaylightTime()) {
            calendar.set(2, 0);
            calendar.set(5, 1);
            return calendar;
        }
        int n6 = calendar.get(1);
        int n7 = 0;
        block0 : while (n7 < 12) {
            calendar.set(2, n7);
            int n8 = j.c(n6, ++n7);
            for (int i5 = 1; i5 <= n8; ++i5) {
                calendar.set(5, i5);
                if (timeZone.inDaylightTime(calendar.getTime())) break block0;
            }
        }
        calendar.add(5, -1);
        while (n5 < 24) {
            calendar.set(10, n5);
            if (timeZone.inDaylightTime(calendar.getTime())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getDSTStart:: hour: ");
                stringBuilder.append(n5);
                Log.d((String)"DSTUtils", (String)stringBuilder.toString());
                return calendar;
            }
            ++n5;
        }
        return calendar;
    }

    public static int c(int n5, int n6) {
        if (n6 != 1) {
            if (n6 != 2) {
                if (n6 != 3 && n6 != 5 && n6 != 10 && n6 != 12 && n6 != 7 && n6 != 8) {
                    return 30;
                }
            } else {
                if (n5 % 4 == 0 && n5 % 100 != 0) {
                    return 29;
                }
                return 28;
            }
        }
        return 31;
    }
}


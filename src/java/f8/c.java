/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  b8.b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.text.DateFormat
 *  java.text.ParsePosition
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 *  java.util.TimeZone
 *  u7.j
 */
package f8;

import b8.b;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import u7.j;

public final class c {
    private static final a a = new ThreadLocal<DateFormat>(){

        protected DateFormat a() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(b.e);
            return simpleDateFormat;
        }
    };
    private static final String[] b;
    private static final DateFormat[] c;

    static {
        String[] arrstring = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        b = arrstring;
        c = new DateFormat[arrstring.length];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Date a(String string) {
        String[] arrstring;
        j.f((Object)string, (String)"$this$toHttpDateOrNull");
        if (string.length() == 0) {
            return null;
        }
        boolean bl = false;
        if (bl) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat)a.get()).parse(string, parsePosition);
        if (parsePosition.getIndex() == string.length()) {
            return date;
        }
        String[] arrstring2 = arrstring = b;
        synchronized (arrstring2) {
            Date date2;
            int n2 = arrstring.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                DateFormat[] arrdateFormat = c;
                DateFormat dateFormat = arrdateFormat[i2];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(b[i2], Locale.US);
                    dateFormat.setTimeZone(b.e);
                    arrdateFormat[i2] = dateFormat;
                }
                parsePosition.setIndex(0);
                date2 = dateFormat.parse(string, parsePosition);
                int n3 = parsePosition.getIndex();
                if (n3 == 0) continue;
            }
            return date2;
            return null;
        }
    }

    public static final String b(Date date) {
        j.f((Object)date, (String)"$this$toHttpDateString");
        String string = ((DateFormat)a.get()).format(date);
        j.b((Object)string, (String)"STANDARD_DATE_FORMAT.get().format(this)");
        return string;
    }

}


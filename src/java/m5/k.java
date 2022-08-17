/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Locale
 *  java.util.TimeZone
 */
package m5;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class k {
    public static boolean a(String string2, int n5) {
        String string3 = string2.substring(0, 2);
        String string4 = string2.substring(3, 5);
        int n6 = string3.startsWith("0") ? Integer.parseInt((String)string3.substring(1, 2)) : Integer.parseInt((String)string3);
        int n7 = string4.startsWith("0") ? Integer.parseInt((String)string4.substring(1, 2)) : Integer.parseInt((String)string4);
        int n8 = n6 * 3600 + n7 * 60 - n5;
        boolean bl = false;
        if (n8 >= 0) {
            bl = true;
        }
        return bl;
    }

    public static String b(Date date, String string2) {
        return new SimpleDateFormat(string2, Locale.ENGLISH).format(date);
    }

    public static String c(Calendar calendar) {
        return new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(calendar.getTime());
    }

    public static String d() {
        return k.b(new Date(System.currentTimeMillis()), "yyyy-MM-dd");
    }

    public static Date e(int n5) {
        int n6 = n5 / 3600;
        int n7 = n5 % 3600;
        int n8 = n7 / 60;
        int n9 = n7 % 60;
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{n6, n8, n9};
        String string2 = String.format((Locale)locale, (String)"%02d:%02d:%02d", (Object[])arrobject);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        try {
            Date date = simpleDateFormat.parse(string2);
            return date;
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
            return null;
        }
    }

    public static Calendar f(String string2) {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        try {
            date = simpleDateFormat.parse(string2);
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
            date = null;
        }
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        return calendar;
    }

    public static long g() {
        TimeZone timeZone = TimeZone.getDefault();
        long l3 = (long)timeZone.getRawOffset() / 1000L;
        if (timeZone.useDaylightTime()) {
            l3 += 3600L;
        }
        return l3;
    }

    public static String h(long l3) {
        Date date = new Date(l3);
        return new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(date);
    }

    /*
     * Exception decompiling
     */
    public static String i(long var0, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl29 : ALOAD : trying to set 1 previously set to 0
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

    public static String j(int n5) {
        int n6 = n5 / 3600;
        int n7 = n5 - n6 * 3600;
        int n8 = n7 / 60;
        int n9 = n7 - n8 * 60;
        Locale locale = Locale.ENGLISH;
        Object[] arrobject = new Object[]{n6, n8, n9};
        return String.format((Locale)locale, (String)"%02d:%02d:%02d", (Object[])arrobject);
    }

    public static long k(Calendar calendar) {
        return (long)TimeZone.getDefault().getRawOffset() + calendar.getTimeInMillis();
    }

    public static int l(Calendar calendar) {
        return 3600 * calendar.get(11) + 60 * calendar.get(12) + calendar.get(13);
    }

    public static long m() {
        return (long)TimeZone.getDefault().getRawOffset() / 1000L;
    }

    public static int n(Date date) {
        String[] arrstring = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date).split(":");
        String string2 = arrstring[0].startsWith("0") ? arrstring[0].substring(1) : arrstring[0];
        int n5 = Integer.valueOf((String)string2);
        String string3 = arrstring[1].startsWith("0") ? arrstring[1].substring(1) : arrstring[1];
        int n6 = Integer.valueOf((String)string3);
        return n5 * 3600 + n6 * 60;
    }

    public static int o(Date date) {
        String[] arrstring = new SimpleDateFormat("HH:mm:ss", Locale.US).format(date).split(":");
        String string2 = arrstring[0].startsWith("0") ? arrstring[0].substring(1) : arrstring[0];
        int n5 = Integer.valueOf((String)string2);
        String string3 = arrstring[1].startsWith("0") ? arrstring[1].substring(1) : arrstring[1];
        int n6 = Integer.valueOf((String)string3);
        String string4 = arrstring[2].startsWith("0") ? arrstring[2].substring(1) : arrstring[2];
        return Integer.valueOf((String)string4) + (n5 * 3600 + n6 * 60);
    }

    public static int p(String string2) {
        int n5;
        int n6;
        int n7;
        try {
            String[] arrstring = string2.split("[:]");
            n5 = Integer.parseInt((String)arrstring[0]);
            n7 = Integer.parseInt((String)arrstring[1]);
            n6 = Integer.parseInt((String)arrstring[2]);
        }
        catch (Exception exception) {
            return 0;
        }
        return n6 + (n5 * 3600 + n7 * 60);
    }

    public static long q(boolean bl) {
        Calendar calendar = Calendar.getInstance();
        int n5 = bl ? 0 : 23;
        calendar.set(11, n5);
        int n6 = bl ? 0 : 59;
        calendar.set(12, n6);
        int n7 = bl ? 0 : 59;
        calendar.set(13, n7);
        return calendar.getTimeInMillis() + 1000L * k.m();
    }

    public static Date r(String string2) {
        return new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).parse(string2, new ParsePosition(0));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean s(String string2, String string3) {
        Date date2;
        Date date;
        block5 : {
            void var4_7;
            block6 : {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                date2 = null;
                date = simpleDateFormat.parse(string2);
                try {
                    date2 = simpleDateFormat.parse(string3);
                    break block5;
                }
                catch (ParseException parseException) {
                    break block6;
                }
                catch (ParseException parseException) {
                    date = null;
                }
            }
            var4_7.printStackTrace();
        }
        if (date.getTime() > date2.getTime()) {
            return true;
        }
        date.getTime();
        date2.getTime();
        return false;
    }

    public static boolean t(int n5, String string2) {
        String string3 = string2.substring(0, 2);
        String string4 = string2.substring(3, 5);
        int n6 = string3.startsWith("0") ? Integer.parseInt((String)string3.substring(1, 2)) : Integer.parseInt((String)string3);
        int n7 = string4.startsWith("0") ? Integer.parseInt((String)string4.substring(1, 2)) : Integer.parseInt((String)string4);
        int n8 = n6 * 3600 + n7 * 60 - n5;
        boolean bl = false;
        if (n8 < 0) {
            bl = true;
        }
        return bl;
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.util.Date
 *  java.util.GregorianCalendar
 *  java.util.TimeZone
 */
package b5;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class a {
    private static final TimeZone a = TimeZone.getTimeZone((String)"UTC");

    private static boolean a(String string, int n2, char c2) {
        return n2 < string.length() && string.charAt(n2) == c2;
    }

    private static int b(String string, int n2) {
        while (n2 < string.length()) {
            char c2 = string.charAt(n2);
            if (c2 >= '0') {
                if (c2 > '9') {
                    return n2;
                }
                ++n2;
                continue;
            }
            return n2;
        }
        return string.length();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date c(String string, ParsePosition parsePosition) {
        int n2;
        TimeZone timeZone;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        block31 : {
            char c2;
            int n10;
            block30 : {
                String string2;
                void var2_42;
                block33 : {
                    block34 : {
                        block25 : {
                            int n11;
                            int n12;
                            int n13;
                            block28 : {
                                int n14;
                                block29 : {
                                    char c3;
                                    block27 : {
                                        int n15;
                                        block26 : {
                                            int n16;
                                            block24 : {
                                                int n17;
                                                block23 : {
                                                    int n18 = parsePosition.getIndex();
                                                    n17 = n18 + 4;
                                                    n8 = a.d(string, n18, n17);
                                                    if (!a.a(string, n17, '-')) break block23;
                                                    ++n17;
                                                }
                                                n16 = n17 + 2;
                                                n5 = a.d(string, n17, n16);
                                                if (!a.a(string, n16, '-')) break block24;
                                                ++n16;
                                            }
                                            n10 = n16 + 2;
                                            n9 = a.d(string, n16, n10);
                                            boolean bl = a.a(string, n10, 'T');
                                            if (!bl && string.length() <= n10) {
                                                GregorianCalendar gregorianCalendar = new GregorianCalendar(n8, n5 - 1, n9);
                                                parsePosition.setIndex(n10);
                                                return gregorianCalendar.getTime();
                                            }
                                            if (!bl) break block25;
                                            int n19 = n10 + 1;
                                            n15 = n19 + 2;
                                            n13 = a.d(string, n19, n15);
                                            if (!a.a(string, n15, ':')) break block26;
                                            ++n15;
                                        }
                                        n12 = n15 + 2;
                                        n11 = a.d(string, n15, n12);
                                        if (!a.a(string, n12, ':')) break block27;
                                        ++n12;
                                    }
                                    if (string.length() <= n12 || (c3 = string.charAt(n12)) == 'Z' || c3 == '+' || c3 == '-') break block28;
                                    n14 = n12 + 2;
                                    n4 = a.d(string, n12, n14);
                                    if (n4 > 59 && n4 < 63) {
                                        n4 = 59;
                                    }
                                    if (!a.a(string, n14, '.')) break block29;
                                    int n20 = n14 + 1;
                                    int n21 = a.b(string, n20 + 1);
                                    int n22 = Math.min((int)n21, (int)(n20 + 3));
                                    int n23 = a.d(string, n20, n22);
                                    int n24 = n22 - n20;
                                    if (n24 != 1) {
                                        if (n24 == 2) {
                                            n23 *= 10;
                                        }
                                    } else {
                                        n23 *= 100;
                                    }
                                    n2 = n11;
                                    n7 = n23;
                                    n6 = n13;
                                    n10 = n21;
                                    break block33;
                                }
                                n2 = n11;
                                n6 = n13;
                                n10 = n14;
                                n7 = 0;
                                break block33;
                            }
                            n2 = n11;
                            n6 = n13;
                            n10 = n12;
                            break block34;
                        }
                        n6 = 0;
                        n2 = 0;
                    }
                    n7 = 0;
                    n4 = 0;
                }
                try {
                    if (string.length() <= n10) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    c2 = string.charAt(n10);
                    if (c2 != 'Z') break block30;
                    timeZone = a;
                    n3 = n10 + 1;
                    break block31;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                }
                catch (NumberFormatException numberFormatException) {
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    // empty catch block
                }
                if (string == null) {
                    string2 = null;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append('\"');
                    stringBuilder.append(string);
                    stringBuilder.append('\"');
                    string2 = stringBuilder.toString();
                }
                String string3 = var2_42.getMessage();
                if (string3 == null || string3.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("(");
                    stringBuilder.append(var2_42.getClass().getName());
                    stringBuilder.append(")");
                    string3 = stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to parse date [");
                stringBuilder.append(string2);
                stringBuilder.append("]: ");
                stringBuilder.append(string3);
                ParseException parseException = new ParseException(stringBuilder.toString(), parsePosition.getIndex());
                parseException.initCause((Throwable)var2_42);
                throw parseException;
            }
            if (c2 != '+' && c2 != '-') {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid time zone indicator '");
                stringBuilder.append(c2);
                stringBuilder.append("'");
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            String string4 = string.substring(n10);
            if (string4.length() < 5) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string4);
                stringBuilder.append("00");
                string4 = stringBuilder.toString();
            }
            n3 = n10 + string4.length();
            if ("+0000".equals((Object)string4) || "+00:00".equals((Object)string4)) {
                timeZone = a;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("GMT");
                stringBuilder.append(string4);
                String string5 = stringBuilder.toString();
                TimeZone timeZone2 = TimeZone.getTimeZone((String)string5);
                String string6 = timeZone2.getID();
                if (!string6.equals((Object)string5) && !string6.replace((CharSequence)":", (CharSequence)"").equals((Object)string5)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Mismatching time zone indicator: ");
                    stringBuilder2.append(string5);
                    stringBuilder2.append(" given, resolves to ");
                    stringBuilder2.append(timeZone2.getID());
                    throw new IndexOutOfBoundsException(stringBuilder2.toString());
                }
                timeZone = timeZone2;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, n8);
        gregorianCalendar.set(2, n5 - 1);
        gregorianCalendar.set(5, n9);
        gregorianCalendar.set(11, n6);
        gregorianCalendar.set(12, n2);
        gregorianCalendar.set(13, n4);
        gregorianCalendar.set(14, n7);
        parsePosition.setIndex(n3);
        return gregorianCalendar.getTime();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int d(String string, int n2, int n3) {
        if (n2 >= 0 && n3 <= string.length() && n2 <= n3) {
            int n4;
            int n5;
            if (n2 < n3) {
                n5 = n2 + 1;
                int n6 = Character.digit((char)string.charAt(n2), (int)10);
                if (n6 < 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid number: ");
                    stringBuilder.append(string.substring(n2, n3));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                n4 = -n6;
            } else {
                n5 = n2;
                n4 = 0;
            }
            while (n5 < n3) {
                int n7 = n5 + 1;
                int n8 = Character.digit((char)string.charAt(n5), (int)10);
                if (n8 < 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid number: ");
                    stringBuilder.append(string.substring(n2, n3));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                n4 = n4 * 10 - n8;
                n5 = n7;
            }
            return -n4;
        }
        NumberFormatException numberFormatException = new NumberFormatException(string);
        throw numberFormatException;
    }
}


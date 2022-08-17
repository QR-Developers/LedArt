/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlSerializer
 */
package m5;

import android.util.Base64;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

public class q0 {
    public static boolean a(char c4) {
        return c4 >= '0' && c4 <= '9' || c4 >= 'a' && c4 <= 'f';
    }

    public static boolean b(String string2) {
        if (string2 != null) {
            if (string2.length() == 0) {
                return false;
            }
            for (int i5 = 0; i5 < string2.length(); ++i5) {
                if (q0.a(string2.charAt(i5))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static String c(XmlPullParser xmlPullParser, String string2) {
        try {
            String string3 = new String(Base64.decode((String)xmlPullParser.getAttributeValue(null, string2), (int)0));
            return string3;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static boolean d(XmlPullParser xmlPullParser, String string2) {
        String string3 = xmlPullParser.getAttributeValue(null, string2);
        return string3 != null && Boolean.parseBoolean((String)string3);
    }

    public static int e(XmlPullParser xmlPullParser, String string2) {
        try {
            int n5 = Integer.parseInt((String)xmlPullParser.getAttributeValue(null, string2));
            return n5;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public static String f(XmlPullParser xmlPullParser, String string2) {
        try {
            String string3 = xmlPullParser.getAttributeValue(null, string2);
            return string3;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static String g(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string2 != null) {
            for (int i5 = 0; i5 < string2.length(); ++i5) {
                char c4 = string2.charAt(i5);
                if (c4 < '\t' || c4 == '\u000b' || c4 == '\f' || c4 > '\r' && c4 < ' ') continue;
                if ((c4 <= '\ud7ff' || c4 >= '\ue000') && c4 != '\ufffe' && c4 != '\uffff') {
                    stringBuilder.append(c4);
                    continue;
                }
                stringBuilder.append("#");
                stringBuilder.append(Integer.toHexString((int)c4));
                stringBuilder.append("#$");
            }
        }
        return stringBuilder.toString();
    }

    public static String h(String string2) {
        if (string2 != null && string2.length() != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i5 = 0; i5 < string2.length(); ++i5) {
                int n5;
                String string3;
                int n6;
                char c4 = string2.charAt(i5);
                if (c4 == '#' && (n5 = i5 + 6) < string2.length() && string2.charAt(n6 = i5 + 5) == '#' && string2.charAt(n5) == '$' && q0.b(string3 = string2.substring(i5 + 1, n6))) {
                    stringBuilder.append((char)Integer.valueOf((String)string3, (int)16).intValue());
                    i5 = n5;
                    continue;
                }
                stringBuilder.append(c4);
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public static void i(XmlSerializer xmlSerializer, String string2, int n5) {
        q0.j(xmlSerializer, string2, String.valueOf((int)n5));
    }

    public static void j(XmlSerializer xmlSerializer, String string2, String string3) {
        if (string3 != null) {
            try {
                xmlSerializer.attribute(null, string2, string3);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void k(XmlSerializer xmlSerializer, String string2, boolean bl) {
        q0.j(xmlSerializer, string2, String.valueOf((boolean)bl));
    }

    public static void l(XmlSerializer xmlSerializer, String string2, String string3) {
        if (string3 != null) {
            try {
                xmlSerializer.attribute(null, string2, Base64.encodeToString((byte[])string3.getBytes(), (int)0));
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static String m(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string2 != null) {
            for (int i5 = 0; i5 < string2.length(); ++i5) {
                char c4 = string2.charAt(i5);
                if (c4 < '\t' || c4 == '\u000b' || c4 == '\f' || c4 > '\r' && c4 < ' ' || c4 > '\ud7ff' && c4 < '\ue000' || c4 == '\ufffe' || c4 == '\uffff') continue;
                stringBuilder.append(c4);
            }
        }
        return stringBuilder.toString();
    }
}


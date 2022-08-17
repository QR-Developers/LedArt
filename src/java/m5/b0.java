/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

public class b0 {
    public static boolean a(String string) {
        char[] arrc = string.toCharArray();
        for (int i5 = 0; i5 < arrc.length; ++i5) {
            if (arrc[i5] != '\u0000') continue;
            return true;
        }
        return false;
    }

    public static boolean b(String string) {
        if (string == null) {
            return false;
        }
        char[] arrc = string.toCharArray();
        for (int i5 = 0; i5 < arrc.length; ++i5) {
            char c4 = arrc[i5];
            if ((c4 <= '@' || c4 >= '[') && (c4 <= '`' || c4 >= '{')) continue;
            return true;
        }
        return false;
    }

    public static boolean c(String string) {
        if (string == null) {
            return false;
        }
        char[] arrc = string.toCharArray();
        for (int i5 = 0; i5 < arrc.length; ++i5) {
            char c4 = arrc[i5];
            if (c4 <= '/' || c4 >= ':') continue;
            return true;
        }
        return false;
    }

    public static boolean d(String string) {
        char[] arrc = string.toCharArray();
        int n5 = arrc.length;
        for (int i5 = 0; i5 < n5; ++i5) {
            if (arrc[i5] != ' ') continue;
            return true;
        }
        return false;
    }

    public static boolean e(String string) {
        if (string == null) {
            return false;
        }
        char[] arrc = string.toCharArray();
        for (int i5 = 0; i5 < arrc.length; ++i5) {
            char c4 = arrc[i5];
            if (!(c4 >= ' ' && c4 < '0' || c4 > '9' && c4 < 'A' || c4 > 'Z' && c4 < 'a') && (c4 <= 'z' || c4 >= '')) continue;
            return true;
        }
        return false;
    }

    public static boolean f(String string) {
        if (string.length() < 8) {
            return false;
        }
        boolean bl = string.matches("^[a-z0-9A-Z]+$");
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = b0.c(string);
            bl2 = false;
            if (bl3) {
                boolean bl4 = b0.b(string);
                bl2 = false;
                if (bl4) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public static boolean g(String string) {
        if (string == null) {
            return true;
        }
        if (string.length() < 8) {
            return true;
        }
        if (b0.a(string)) {
            return true;
        }
        int n5 = b0.b(string);
        if (b0.c(string)) {
            ++n5;
        }
        if (b0.e(string)) {
            ++n5;
        }
        return n5 < 2;
    }
}


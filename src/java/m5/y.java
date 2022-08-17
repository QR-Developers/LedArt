/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package m5;

public class y {
    public static int a(int n5) {
        if (n5 < 0) {
            return 0;
        }
        if (n5 <= 48) {
            return n5;
        }
        if (n5 > 48 && n5 <= 51) {
            return 51;
        }
        if (n5 <= 97) {
            return n5 + 1;
        }
        return 100;
    }

    public static int b(int n5) {
        if (n5 < 0) {
            return 0;
        }
        if (n5 <= 48) {
            return n5;
        }
        if (n5 > 48 && n5 <= 51) {
            return 50;
        }
        if (n5 <= 97) {
            return n5 - 1;
        }
        return 98;
    }
}


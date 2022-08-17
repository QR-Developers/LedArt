/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

public class h0 {
    public static int a(String string2) {
        if (string2 == null) {
            return 0;
        }
        try {
            int n5 = Integer.parseInt((String)string2);
            return n5;
        }
        catch (Exception exception) {
            return 0;
        }
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package m5;

import java.util.Objects;

public class n {
    public static <T extends Enum<T>> T a(Class<T> class_, int n5) {
        Enum[] arrenum = (Enum[])class_.getEnumConstants();
        Objects.requireNonNull((Object)arrenum);
        return (T)arrenum[n5];
    }

    public static <T extends Enum<T>> T b(Class<T> class_, String string2) {
        return (T)Enum.valueOf(class_, (String)string2);
    }
}


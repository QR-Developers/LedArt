/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  e9.a
 *  e9.d
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 */
package a9;

import android.database.Cursor;
import e9.d;
import java.util.LinkedHashMap;

final class a {
    public static <T> T a(d<T> d2, Cursor cursor) {
        Object object = d2.a();
        LinkedHashMap linkedHashMap = d2.c();
        int n2 = cursor.getColumnCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            e9.a a2 = (e9.a)linkedHashMap.get((Object)cursor.getColumnName(i2));
            if (a2 == null) continue;
            a2.i(object, cursor, i2);
        }
        return (T)object;
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Object
 *  java.lang.Short
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;

public class l
implements e<Short> {
    public a a() {
        return a.b;
    }

    public Object d(Short s2) {
        return s2;
    }

    public Short e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return cursor.getShort(n2);
    }
}


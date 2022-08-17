/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Long
 *  java.lang.Object
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;

public class k
implements e<Long> {
    public a a() {
        return a.b;
    }

    public Object d(Long l2) {
        return l2;
    }

    public Long e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return cursor.getLong(n2);
    }
}


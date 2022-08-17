/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Double
 *  java.lang.Object
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;

public class h
implements e<Double> {
    public a a() {
        return a.c;
    }

    public Object d(Double d2) {
        return d2;
    }

    public Double e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return cursor.getDouble(n2);
    }
}


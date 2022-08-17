/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Float
 *  java.lang.Object
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;

public class i
implements e<Float> {
    public a a() {
        return a.c;
    }

    public Object d(Float f2) {
        return f2;
    }

    public Float e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return Float.valueOf((float)cursor.getFloat(n2));
    }
}


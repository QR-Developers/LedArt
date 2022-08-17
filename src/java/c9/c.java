/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Byte
 *  java.lang.Object
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;

public class c
implements e<Byte> {
    public a a() {
        return a.b;
    }

    public Object d(Byte by) {
        return by;
    }

    public Byte e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return (byte)cursor.getInt(n2);
    }
}


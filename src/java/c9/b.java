/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Object
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;

public class b
implements e<byte[]> {
    public a a() {
        return a.e;
    }

    public Object d(byte[] arrby) {
        return arrby;
    }

    public byte[] e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return cursor.getBlob(n2);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Boolean
 *  java.lang.Object
 */
package c9;

import android.database.Cursor;
import c9.e;

public class a
implements e<Boolean> {
    public d9.a a() {
        return d9.a.b;
    }

    public Object d(Boolean bl) {
        if (bl == null) {
            return null;
        }
        return (int)bl.booleanValue();
    }

    public Boolean e(Cursor cursor, int n2) {
        int n3;
        if (cursor.isNull(n2)) {
            return null;
        }
        int n4 = cursor.getInt(n2);
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return (boolean)n3;
    }
}


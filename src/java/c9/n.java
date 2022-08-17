/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Object
 *  java.lang.String
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;

public class n
implements e<String> {
    public a a() {
        return a.d;
    }

    public Object d(String string) {
        return string;
    }

    public String e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return cursor.getString(n2);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Object
 *  java.sql.Date
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;
import java.sql.Date;

public class m
implements e<Date> {
    public a a() {
        return a.b;
    }

    public Object d(Date date) {
        if (date == null) {
            return null;
        }
        return date.getTime();
    }

    public Date e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return new Date(cursor.getLong(n2));
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  c9.e
 *  d9.a
 *  java.lang.Character
 *  java.lang.Object
 */
package c9;

import android.database.Cursor;
import c9.e;
import d9.a;

public class d
implements e<Character> {
    public a a() {
        return a.b;
    }

    public Object d(Character c2) {
        if (c2 == null) {
            return null;
        }
        return (int)c2.charValue();
    }

    public Character e(Cursor cursor, int n2) {
        if (cursor.isNull(n2)) {
            return null;
        }
        return Character.valueOf((char)((char)cursor.getInt(n2)));
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a3.h
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Calendar
 *  java.util.Locale
 */
package a3;

import a3.h;
import java.util.Calendar;
import java.util.Locale;

public class b
implements h {
    private final Calendar b;

    public b(Calendar calendar) {
        calendar.get(7);
        this.b = calendar;
    }

    public CharSequence a(int n2) {
        this.b.set(7, n2);
        return this.b.getDisplayName(7, 1, Locale.getDefault());
    }
}


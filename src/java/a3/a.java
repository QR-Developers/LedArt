/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a3.h
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package a3;

import a3.h;

public class a
implements h {
    private final CharSequence[] b;

    public a(CharSequence[] arrcharSequence) {
        if (arrcharSequence != null) {
            if (arrcharSequence.length == 7) {
                this.b = arrcharSequence;
                return;
            }
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
        throw new IllegalArgumentException("Cannot be null");
    }

    public CharSequence a(int n2) {
        return this.b[n2 - 1];
    }
}


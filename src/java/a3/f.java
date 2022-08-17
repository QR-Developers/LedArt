/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a3.g
 *  android.text.SpannableStringBuilder
 *  cn.huidu.view.dateview.b
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package a3;

import a3.g;
import android.text.SpannableStringBuilder;
import cn.huidu.view.dateview.b;

public class f
implements g {
    private final CharSequence[] a;

    public f(CharSequence[] arrcharSequence) {
        if (arrcharSequence != null) {
            if (arrcharSequence.length >= 12) {
                this.a = arrcharSequence;
                return;
            }
            throw new IllegalArgumentException("Label array is too short");
        }
        throw new IllegalArgumentException("Label array cannot be null");
    }

    public CharSequence a(b b2) {
        return new SpannableStringBuilder().append(this.a[b2.h()]).append((CharSequence)" ").append((CharSequence)String.valueOf((int)b2.i()));
    }
}


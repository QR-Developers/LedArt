/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a3.g
 *  cn.huidu.view.dateview.b
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 */
package a3;

import a3.g;
import cn.huidu.view.dateview.b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class d
implements g {
    private final DateFormat a = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());

    public CharSequence a(b b2) {
        return this.a.format(b2.f());
    }
}


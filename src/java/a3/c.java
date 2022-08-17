/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a3.e
 *  androidx.annotation.NonNull
 *  cn.huidu.view.dateview.b
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 */
package a3;

import a3.e;
import androidx.annotation.NonNull;
import cn.huidu.view.dateview.b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class c
implements e {
    private final DateFormat b = new SimpleDateFormat("d", Locale.getDefault());

    @NonNull
    public String a(@NonNull b b2) {
        return this.b.format(b2.f());
    }
}


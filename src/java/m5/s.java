/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import android.graphics.BitmapFactory;

public class s {
    public static a a(String string2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile((String)string2, (BitmapFactory.Options)options);
        a a3 = new a();
        a3.a = options.outMimeType;
        return a3;
    }

    public static class a {
        public String a;
    }

}


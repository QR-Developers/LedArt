/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.util.Base64
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.cloud.api.entity.setting;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class ImageCheckCodeDTO {
    public String image;
    public boolean pass;
    public String signature;

    public Bitmap getBitmap() {
        try {
            byte[] arrby = Base64.decode((String)this.image, (int)0);
            Bitmap bitmap = BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length);
            return bitmap;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}


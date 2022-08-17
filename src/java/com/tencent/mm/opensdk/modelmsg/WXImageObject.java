/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  com.tencent.mm.opensdk.utils.Log
 *  com.tencent.mm.opensdk.utils.b
 *  java.io.ByteArrayOutputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.tencent.mm.opensdk.modelmsg;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class WXImageObject
implements WXMediaMessage.IMediaObject {
    private static final int CONTENT_LENGTH_LIMIT = 26214400;
    private static final int PATH_LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXImageObject";
    public byte[] imageData;
    public String imagePath;

    public WXImageObject() {
    }

    public WXImageObject(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, (OutputStream)byteArrayOutputStream);
            this.imageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WXImageObject <init>, exception:");
            stringBuilder.append(exception.getMessage());
            Log.e((String)TAG, (String)stringBuilder.toString());
            return;
        }
    }

    public WXImageObject(byte[] arrby) {
        this.imageData = arrby;
    }

    private int getFileSize(String string) {
        return b.a((String)string);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean checkArgs() {
        String string;
        String string2;
        byte[] arrby = this.imageData;
        if (arrby != null && arrby.length != 0 || (string2 = this.imagePath) != null && string2.length() != 0) {
            byte[] arrby2 = this.imageData;
            if (arrby2 != null && arrby2.length > 26214400) {
                string = "checkArgs fail, content is too large";
            } else {
                String string3 = this.imagePath;
                if (string3 != null && string3.length() > 10240) {
                    string = "checkArgs fail, path is invalid";
                } else {
                    String string4 = this.imagePath;
                    if (string4 == null) return true;
                    if (this.getFileSize(string4) <= 26214400) return true;
                    string = "checkArgs fail, image content is too large";
                }
            }
        } else {
            string = "checkArgs fail, all arguments are null";
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wximageobject_imageData", this.imageData);
        bundle.putString("_wximageobject_imagePath", this.imagePath);
    }

    public void setImagePath(String string) {
        this.imagePath = string;
    }

    public int type() {
        return 2;
    }

    public void unserialize(Bundle bundle) {
        this.imageData = bundle.getByteArray("_wximageobject_imageData");
        this.imagePath = bundle.getString("_wximageobject_imagePath");
    }
}


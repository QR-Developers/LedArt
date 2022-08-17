/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  com.tencent.mm.opensdk.utils.Log
 *  com.tencent.mm.opensdk.utils.b
 *  java.lang.Object
 *  java.lang.String
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;

public class WXAppExtendObject
implements WXMediaMessage.IMediaObject {
    private static final int CONTENT_LENGTH_LIMIT = 10485760;
    private static final int EXTINFO_LENGTH_LIMIT = 2048;
    private static final int PATH_LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXAppExtendObject";
    public String extInfo;
    public byte[] fileData;
    public String filePath;

    public WXAppExtendObject() {
    }

    public WXAppExtendObject(String string, String string2) {
        this.extInfo = string;
        this.filePath = string2;
    }

    public WXAppExtendObject(String string, byte[] arrby) {
        this.extInfo = string;
        this.fileData = arrby;
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
        byte[] arrby;
        String string3 = this.extInfo;
        if (string3 != null && string3.length() != 0 || (string = this.filePath) != null && string.length() != 0 || (arrby = this.fileData) != null && arrby.length != 0) {
            String string4 = this.extInfo;
            if (string4 != null && string4.length() > 2048) {
                string2 = "checkArgs fail, extInfo is invalid";
            } else {
                String string5 = this.filePath;
                if (string5 != null && string5.length() > 10240) {
                    string2 = "checkArgs fail, filePath is invalid";
                } else {
                    String string6 = this.filePath;
                    if (string6 != null && this.getFileSize(string6) > 10485760) {
                        string2 = "checkArgs fail, fileSize is too large";
                    } else {
                        byte[] arrby2 = this.fileData;
                        if (arrby2 == null) return true;
                        if (arrby2.length <= 10485760) return true;
                        string2 = "checkArgs fail, fileData is too large";
                    }
                }
            }
        } else {
            string2 = "checkArgs fail, all arguments is null";
        }
        Log.e((String)TAG, (String)string2);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxappextendobject_extInfo", this.extInfo);
        bundle.putByteArray("_wxappextendobject_fileData", this.fileData);
        bundle.putString("_wxappextendobject_filePath", this.filePath);
    }

    public int type() {
        return 7;
    }

    public void unserialize(Bundle bundle) {
        this.extInfo = bundle.getString("_wxappextendobject_extInfo");
        this.fileData = bundle.getByteArray("_wxappextendobject_fileData");
        this.filePath = bundle.getString("_wxappextendobject_filePath");
    }
}


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

public class WXFileObject
implements WXMediaMessage.IMediaObject {
    private static final int CONTENT_LENGTH_LIMIT = 1920991232;
    private static final String TAG = "MicroMsg.SDK.WXFileObject";
    private int contentLengthLimit = 1920991232;
    public byte[] fileData;
    public String filePath;

    public WXFileObject() {
        this.fileData = null;
        this.filePath = null;
    }

    public WXFileObject(String string) {
        this.filePath = string;
    }

    public WXFileObject(byte[] arrby) {
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
        byte[] arrby = this.fileData;
        if (arrby != null && arrby.length != 0 || (string2 = this.filePath) != null && string2.length() != 0) {
            byte[] arrby2 = this.fileData;
            if (arrby2 != null && arrby2.length > this.contentLengthLimit) {
                string = "checkArgs fail, fileData is too large";
            } else {
                String string3 = this.filePath;
                if (string3 == null) return true;
                if (this.getFileSize(string3) <= this.contentLengthLimit) return true;
                string = "checkArgs fail, fileSize is too large";
            }
        } else {
            string = "checkArgs fail, both arguments is null";
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxfileobject_fileData", this.fileData);
        bundle.putString("_wxfileobject_filePath", this.filePath);
    }

    public void setContentLengthLimit(int n) {
        this.contentLengthLimit = n;
    }

    public void setFileData(byte[] arrby) {
        this.fileData = arrby;
    }

    public void setFilePath(String string) {
        this.filePath = string;
    }

    public int type() {
        return 6;
    }

    public void unserialize(Bundle bundle) {
        this.fileData = bundle.getByteArray("_wxfileobject_fileData");
        this.filePath = bundle.getString("_wxfileobject_filePath");
    }
}


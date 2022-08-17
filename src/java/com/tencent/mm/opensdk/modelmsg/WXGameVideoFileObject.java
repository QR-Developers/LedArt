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

public class WXGameVideoFileObject
implements WXMediaMessage.IMediaObject {
    private static final int FILE_SIZE_LIMIT = 104857600;
    private static final String TAG = "MicroMsg.SDK.WXGameVideoFileObject";
    private static final int URL_LENGTH_LIMIT = 10240;
    public String filePath;
    public String thumbUrl;
    public String videoUrl;

    public WXGameVideoFileObject() {
        this.filePath = null;
        this.videoUrl = null;
        this.thumbUrl = null;
    }

    public WXGameVideoFileObject(String string, String string2, String string3) {
        this.filePath = string;
        this.videoUrl = string2;
        this.thumbUrl = string3;
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
        String string2 = this.filePath;
        if (string2 != null && string2.length() != 0) {
            if (this.getFileSize(this.filePath) > 104857600) {
                string = "checkArgs fail, video file size is too large";
            } else {
                String string3 = this.videoUrl;
                if (string3 != null && string3.length() > 10240) {
                    string = "checkArgs fail, videoUrl is too long";
                } else {
                    String string4 = this.thumbUrl;
                    if (string4 == null) return true;
                    if (string4.length() <= 10240) return true;
                    string = "checkArgs fail, thumbUrl is too long";
                }
            }
        } else {
            string = "checkArgs fail, filePath is null";
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxvideofileobject_filePath", this.filePath);
        bundle.putString("_wxvideofileobject_cdnUrl", this.videoUrl);
        bundle.putString("_wxvideofileobject_thumbUrl", this.thumbUrl);
    }

    public int type() {
        return 39;
    }

    public void unserialize(Bundle bundle) {
        this.filePath = bundle.getString("_wxvideofileobject_filePath");
        this.videoUrl = bundle.getString("_wxvideofileobject_cdnUrl");
        this.thumbUrl = bundle.getString("_wxvideofileobject_thumbUrl");
    }
}


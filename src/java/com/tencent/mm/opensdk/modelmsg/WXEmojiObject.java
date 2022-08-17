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

public class WXEmojiObject
implements WXMediaMessage.IMediaObject {
    private static final int CONTENT_LENGTH_LIMIT = 10485760;
    private static final String TAG = "MicroMsg.SDK.WXEmojiObject";
    public byte[] emojiData;
    public String emojiPath;

    public WXEmojiObject() {
        this.emojiData = null;
        this.emojiPath = null;
    }

    public WXEmojiObject(String string) {
        this.emojiPath = string;
    }

    public WXEmojiObject(byte[] arrby) {
        this.emojiData = arrby;
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
        byte[] arrby = this.emojiData;
        if (arrby != null && arrby.length != 0 || (string2 = this.emojiPath) != null && string2.length() != 0) {
            byte[] arrby2 = this.emojiData;
            if (arrby2 != null && arrby2.length > 10485760) {
                string = "checkArgs fail, emojiData is too large";
            } else {
                String string3 = this.emojiPath;
                if (string3 == null) return true;
                if (this.getFileSize(string3) <= 10485760) return true;
                string = "checkArgs fail, emojiSize is too large";
            }
        } else {
            string = "checkArgs fail, both arguments is null";
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxemojiobject_emojiData", this.emojiData);
        bundle.putString("_wxemojiobject_emojiPath", this.emojiPath);
    }

    public void setEmojiData(byte[] arrby) {
        this.emojiData = arrby;
    }

    public void setEmojiPath(String string) {
        this.emojiPath = string;
    }

    public int type() {
        return 8;
    }

    public void unserialize(Bundle bundle) {
        this.emojiData = bundle.getByteArray("_wxemojiobject_emojiData");
        this.emojiPath = bundle.getString("_wxemojiobject_emojiPath");
    }
}


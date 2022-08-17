/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  com.tencent.mm.opensdk.utils.Log
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;

public class WXDesignerSharedObject
implements WXMediaMessage.IMediaObject {
    private static final String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
    public String designerName;
    public String designerRediretctUrl;
    public int designerUIN;
    public String thumburl;
    public String url;

    public WXDesignerSharedObject() {
    }

    public WXDesignerSharedObject(String string, int n, String string2, String string3) {
        this.url = string2;
        this.thumburl = string;
        this.designerUIN = n;
        this.designerName = string3;
    }

    public boolean checkArgs() {
        if (this.designerUIN != 0 && !TextUtils.isEmpty((CharSequence)this.thumburl) && !TextUtils.isEmpty((CharSequence)this.url)) {
            return true;
        }
        Log.e((String)TAG, (String)"checkArgs fail, packageid or thumburl is invalid");
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxemojisharedobject_thumburl", this.thumburl);
        bundle.putInt("_wxemojisharedobject_designer_uin", this.designerUIN);
        bundle.putString("_wxemojisharedobject_designer_name", this.designerName);
        bundle.putString("_wxemojisharedobject_designer_rediretcturl", this.designerRediretctUrl);
        bundle.putString("_wxemojisharedobject_url", this.url);
    }

    public int type() {
        return 25;
    }

    public void unserialize(Bundle bundle) {
        this.thumburl = bundle.getString("_wxwebpageobject_thumburl");
        this.designerUIN = bundle.getInt("_wxemojisharedobject_designer_uin");
        this.designerName = bundle.getString("_wxemojisharedobject_designer_name");
        this.designerRediretctUrl = bundle.getString("_wxemojisharedobject_designer_rediretcturl");
        this.url = bundle.getString("_wxwebpageobject_url");
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  com.tencent.mm.opensdk.utils.Log
 *  com.tencent.mm.opensdk.utils.b
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.io.Serializable;
import java.util.HashMap;

public class WXWebpageObject
implements WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXWebpageObject";
    public String canvasPageXml;
    public String extInfo;
    public HashMap<String, String> extraInfoMap = null;
    public boolean isSecretMessage = false;
    public String webpageUrl;

    public WXWebpageObject() {
    }

    public WXWebpageObject(String string) {
        this.webpageUrl = string;
    }

    public boolean checkArgs() {
        String string = this.webpageUrl;
        if (string != null && string.length() != 0 && this.webpageUrl.length() <= 10240) {
            return true;
        }
        Log.e((String)TAG, (String)"checkArgs fail, webpageUrl is invalid");
        return false;
    }

    public String getExtra(String string, String string2) {
        HashMap<String, String> hashMap = this.extraInfoMap;
        if (hashMap != null) {
            String string3 = (String)hashMap.get((Object)string);
            if (string3 != null) {
                string2 = string3;
            }
            return string2;
        }
        return null;
    }

    public void putExtra(String string, String string2) {
        if (this.extraInfoMap == null) {
            this.extraInfoMap = new HashMap();
        }
        if (!b.b((String)string)) {
            this.extraInfoMap.put((Object)string, (Object)string2);
        }
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxwebpageobject_extInfo", this.extInfo);
        bundle.putString("_wxwebpageobject_webpageUrl", this.webpageUrl);
        bundle.putString("_wxwebpageobject_canvaspagexml", this.canvasPageXml);
        bundle.putBoolean("_wxwebpageobject_issecretmsg", this.isSecretMessage);
        HashMap<String, String> hashMap = this.extraInfoMap;
        if (hashMap != null) {
            bundle.putSerializable("_wxwebpageobject_extrainfo", hashMap);
        }
    }

    public int type() {
        return 5;
    }

    public void unserialize(Bundle bundle) {
        this.extInfo = bundle.getString("_wxwebpageobject_extInfo");
        this.webpageUrl = bundle.getString("_wxwebpageobject_webpageUrl");
        this.canvasPageXml = bundle.getString("_wxwebpageobject_canvaspagexml");
        this.isSecretMessage = bundle.getBoolean("_wxwebpageobject_issecretmsg");
        Serializable serializable = bundle.getSerializable("_wxwebpageobject_extrainfo");
        if (serializable != null) {
            this.extraInfoMap = (HashMap)serializable;
        }
    }
}


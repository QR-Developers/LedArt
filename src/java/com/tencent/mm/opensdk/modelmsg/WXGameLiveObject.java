/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  com.tencent.mm.opensdk.utils.b
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.b;
import java.io.Serializable;
import java.util.HashMap;

public class WXGameLiveObject
implements WXMediaMessage.IMediaObject {
    private static final String TAG = "MicroMsg.SDK.WXGameObject";
    public HashMap<String, String> extraInfoMap = new HashMap();

    public boolean checkArgs() {
        return true;
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
        HashMap<String, String> hashMap = this.extraInfoMap;
        if (hashMap != null) {
            bundle.putSerializable("_wxgame_extrainfo", hashMap);
        }
    }

    public int type() {
        return 70;
    }

    public void unserialize(Bundle bundle) {
        this.extraInfoMap = (HashMap)bundle.getSerializable("_wxgame_extrainfo");
    }
}


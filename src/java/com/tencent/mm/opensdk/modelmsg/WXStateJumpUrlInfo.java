/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo
 *  com.tencent.mm.opensdk.utils.Log
 *  java.lang.Object
 *  java.lang.String
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.mm.opensdk.utils.Log;

public class WXStateJumpUrlInfo
implements WXStateSceneDataObject.IWXStateJumpInfo {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";
    public String jumpUrl;

    /*
     * Enabled aggressive block sorting
     */
    public boolean checkArgs() {
        String string;
        String string2 = this.jumpUrl;
        if (string2 != null && string2.length() > 0) {
            if (this.jumpUrl.length() < 10240) {
                return true;
            }
            string = "checkArgs fail, jumpUrl is invalid";
        } else {
            string = "checkArgs fail, jumpUrl is null";
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("wx_state_jump_url", this.jumpUrl);
    }

    public int type() {
        return 1;
    }

    public void unserialize(Bundle bundle) {
        this.jumpUrl = bundle.getString("wx_state_jump_url", "");
    }
}


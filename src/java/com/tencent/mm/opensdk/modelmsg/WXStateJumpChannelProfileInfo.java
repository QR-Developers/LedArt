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

public class WXStateJumpChannelProfileInfo
implements WXStateSceneDataObject.IWXStateJumpInfo {
    private static final String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";
    private static final int USERNAME_LENGTH_LIMIT = 1024;
    public String username;

    /*
     * Enabled aggressive block sorting
     */
    public boolean checkArgs() {
        String string;
        String string2 = this.username;
        if (string2 != null && string2.length() > 0) {
            if (this.username.length() < 1024) {
                return true;
            }
            string = "checkArgs fail, username length exceed limit";
        } else {
            string = "checkArgs fail, username is null";
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("wx_state_jump_channel_profile_username", this.username);
    }

    public int type() {
        return 3;
    }

    public void unserialize(Bundle bundle) {
        this.username = bundle.getString("wx_state_jump_channel_profile_username", "");
    }
}


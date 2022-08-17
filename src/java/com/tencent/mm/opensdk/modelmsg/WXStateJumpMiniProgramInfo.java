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

public class WXStateJumpMiniProgramInfo
implements WXStateSceneDataObject.IWXStateJumpInfo {
    private static final String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";
    public int miniProgramType;
    public String path;
    public String username;

    public boolean checkArgs() {
        String string = this.username;
        if (string != null && string.length() > 0) {
            return true;
        }
        Log.e((String)TAG, (String)"checkArgs fail, username is null");
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("wx_state_jump_mini_program_username", this.username);
        bundle.putString("wx_state_jump_mini_program_path", this.path);
        bundle.putInt("wx_state_jump_mini_program_type", this.miniProgramType);
    }

    public int type() {
        return 2;
    }

    public void unserialize(Bundle bundle) {
        this.username = bundle.getString("wx_state_jump_mini_program_username", "");
        this.path = bundle.getString("wx_state_jump_mini_program_path", "");
        this.miniProgramType = bundle.getInt("wx_state_jump_mini_program_type", 0);
    }
}


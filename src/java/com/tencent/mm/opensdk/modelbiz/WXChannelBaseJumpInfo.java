/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo
 *  com.tencent.mm.opensdk.utils.Log
 *  java.lang.Object
 *  java.lang.String
 */
package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo;
import com.tencent.mm.opensdk.utils.Log;

public abstract class WXChannelBaseJumpInfo
implements IWXChannelJumpInfo {
    private static final String TAG = "MicroMsg.SDK.WXChannelBaseJumpInfo";
    private static final int WORDING_LENGTH_LIMIT = 1024;
    public String extra;
    public String wording;

    public boolean checkArgs() {
        String string = this.wording;
        if (string != null && string.length() >= 1024) {
            Log.e((String)TAG, (String)"checkArgs fail, wording is invalid");
            return false;
        }
        return true;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("wx_channel_jump_base_wording", this.wording);
        bundle.putString("wx_channel_jump_base_extra", this.extra);
    }

    public void unserialize(Bundle bundle) {
        this.wording = bundle.getString("wx_channel_jump_base_wording");
        this.extra = bundle.getString("wx_channel_jump_base_extra");
    }
}


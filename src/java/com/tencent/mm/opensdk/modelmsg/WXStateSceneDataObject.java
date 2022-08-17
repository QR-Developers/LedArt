/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.SendMessageToWX
 *  com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject
 *  com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo
 *  com.tencent.mm.opensdk.utils.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.mm.opensdk.utils.Log;

public class WXStateSceneDataObject
implements SendMessageToWX.IWXSceneDataObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXStateSceneDataObject";
    private static final String WX_STATE_JUMP_INFO_KEY_IDENTIFIER = "_wxapi_scene_data_state_jump_info_identifier";
    public String stateId;
    public IWXStateJumpInfo stateJumpInfo;
    public String stateTitle;
    public String token;

    public boolean checkArgs() {
        String string = this.stateId;
        if (string != null && string.length() > 10240) {
            Log.e((String)TAG, (String)"checkArgs fail, stateId is invalid");
            return false;
        }
        String string2 = this.stateTitle;
        if (string2 != null && string2.length() > 10240) {
            Log.e((String)TAG, (String)"checkArgs fail, stateId is invalid");
            return false;
        }
        String string3 = this.token;
        if (string3 != null && string3.length() > 10240) {
            Log.e((String)TAG, (String)"checkArgs fail, stateId is invalid");
            return false;
        }
        IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo == null) {
            Log.e((String)TAG, (String)"checkArgs fail, statsJumpInfo is null");
            return false;
        }
        return iWXStateJumpInfo.checkArgs();
    }

    public int getJumpType() {
        IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo != null) {
            return iWXStateJumpInfo.type();
        }
        return 0;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxapi_scene_data_state_id", this.stateId);
        bundle.putString("_wxapi_scene_data_state_title", this.stateTitle);
        bundle.putString("_wxapi_scene_data_state_token", this.token);
        IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo != null) {
            bundle.putString(WX_STATE_JUMP_INFO_KEY_IDENTIFIER, iWXStateJumpInfo.getClass().getName());
            this.stateJumpInfo.serialize(bundle);
        }
    }

    public void unserialize(Bundle bundle) {
        this.stateId = bundle.getString("_wxapi_scene_data_state_id");
        this.stateTitle = bundle.getString("_wxapi_scene_data_state_title");
        this.token = bundle.getString("_wxapi_scene_data_state_token");
        String string = bundle.getString(WX_STATE_JUMP_INFO_KEY_IDENTIFIER);
        if (string != null) {
            try {
                IWXStateJumpInfo iWXStateJumpInfo;
                this.stateJumpInfo = iWXStateJumpInfo = Class.forName((String)string).newInstance();
                iWXStateJumpInfo.unserialize(bundle);
                return;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("get WXSceneDataObject from bundle failed: unknown ident ");
                stringBuilder.append(string);
                stringBuilder.append(", ex = ");
                stringBuilder.append(exception.getMessage());
                Log.e((String)TAG, (String)stringBuilder.toString());
            }
        }
    }
}


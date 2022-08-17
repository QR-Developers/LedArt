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

public class WXMiniProgramObject
implements WXMediaMessage.IMediaObject {
    public static final int MINIPROGRAM_TYPE_PREVIEW = 2;
    public static final int MINIPROGRAM_TYPE_TEST = 1;
    public static final int MINIPTOGRAM_TYPE_RELEASE = 0;
    private static final String TAG = "MicroMsg.SDK.WXMiniProgramObject";
    public int disableforward = 0;
    private HashMap<String, String> extraInfoMap = null;
    public boolean isSecretMessage = false;
    public boolean isUpdatableMessage = false;
    public int miniprogramType = 0;
    public String path;
    public String userName;
    public String webpageUrl;
    public boolean withShareTicket;

    /*
     * Enabled aggressive block sorting
     */
    public boolean checkArgs() {
        String string;
        if (b.b((String)this.webpageUrl)) {
            string = "webPageUrl is null";
        } else if (b.b((String)this.userName)) {
            string = "userName is null";
        } else {
            int n = this.miniprogramType;
            if (n >= 0 && n <= 2) {
                return true;
            }
            string = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
        }
        Log.e((String)TAG, (String)string);
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
        bundle.putString("_wxminiprogram_webpageurl", this.webpageUrl);
        bundle.putString("_wxminiprogram_username", this.userName);
        bundle.putString("_wxminiprogram_path", this.path);
        bundle.putBoolean("_wxminiprogram_withsharetiket", this.withShareTicket);
        bundle.putInt("_wxminiprogram_type", this.miniprogramType);
        bundle.putInt("_wxminiprogram_disableforward", this.disableforward);
        bundle.putBoolean("_wxminiprogram_isupdatablemsg", this.isUpdatableMessage);
        bundle.putBoolean("_wxminiprogram_issecretmsg", this.isSecretMessage);
        HashMap<String, String> hashMap = this.extraInfoMap;
        if (hashMap != null) {
            bundle.putSerializable("_wxminiprogram_extrainfo", hashMap);
        }
    }

    public int type() {
        return 36;
    }

    public void unserialize(Bundle bundle) {
        this.webpageUrl = bundle.getString("_wxminiprogram_webpageurl");
        this.userName = bundle.getString("_wxminiprogram_username");
        this.path = bundle.getString("_wxminiprogram_path");
        this.withShareTicket = bundle.getBoolean("_wxminiprogram_withsharetiket");
        this.miniprogramType = bundle.getInt("_wxminiprogram_type");
        this.disableforward = bundle.getInt("_wxminiprogram_disableforward");
        this.isUpdatableMessage = bundle.getBoolean("_wxminiprogram_isupdatablemsg");
        this.isSecretMessage = bundle.getBoolean("_wxminiprogram_issecretmsg");
        this.extraInfoMap = (HashMap)bundle.getSerializable("_wxminiprogram_extrainfo");
    }
}


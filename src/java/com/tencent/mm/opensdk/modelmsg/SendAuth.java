/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.channel.a.a;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;

public final class SendAuth {
    private SendAuth() {
    }

    public static class Options {
        public static final int INVALID_FLAGS = -1;
        public String callbackClassName;
        public int callbackFlags = -1;

        public void fromBundle(Bundle bundle) {
            this.callbackClassName = a.a(bundle, "_wxapi_sendauth_options_callback_classname");
            this.callbackFlags = a.a(bundle, "_wxapi_sendauth_options_callback_flags", -1);
        }

        public void toBundle(Bundle bundle) {
            bundle.putString("_wxapi_sendauth_options_callback_classname", this.callbackClassName);
            bundle.putInt("_wxapi_sendauth_options_callback_flags", this.callbackFlags);
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.tencent.mm.opensdk.openapi.WXApiImplV10
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.tencent.mm.opensdk.openapi;

import android.content.Context;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXApiImplV10;
import com.tencent.mm.opensdk.utils.Log;

public class WXAPIFactory {
    private static final String TAG = "MicroMsg.PaySdk.WXFactory";

    private WXAPIFactory() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(WXAPIFactory.class.getSimpleName());
        stringBuilder.append(" should not be instantiated");
        throw new RuntimeException(stringBuilder.toString());
    }

    public static IWXAPI createWXAPI(Context context, String string2) {
        return WXAPIFactory.createWXAPI(context, string2, true);
    }

    public static IWXAPI createWXAPI(Context context, String string2, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("createWXAPI, appId = ");
        stringBuilder.append(string2);
        stringBuilder.append(", checkSignature = ");
        stringBuilder.append(bl);
        Log.d(TAG, stringBuilder.toString());
        return WXAPIFactory.createWXAPI(context, string2, bl, 2);
    }

    public static IWXAPI createWXAPI(Context context, String string2, boolean bl, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("createWXAPI, appId = ");
        stringBuilder.append(string2);
        stringBuilder.append(", checkSignature = ");
        stringBuilder.append(bl);
        stringBuilder.append(", launchMode = ");
        stringBuilder.append(n2);
        Log.d(TAG, stringBuilder.toString());
        return new WXApiImplV10(context, string2, bl, n2);
    }
}


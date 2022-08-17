/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.tencent.mm.opensdk.diffdev;

public final class OAuthErrCode
extends Enum<OAuthErrCode> {
    private static final /* synthetic */ OAuthErrCode[] $VALUES;
    public static final /* enum */ OAuthErrCode WechatAuth_Err_Auth_Stopped;
    public static final /* enum */ OAuthErrCode WechatAuth_Err_Cancel;
    public static final /* enum */ OAuthErrCode WechatAuth_Err_JsonDecodeErr;
    public static final /* enum */ OAuthErrCode WechatAuth_Err_NetworkErr;
    public static final /* enum */ OAuthErrCode WechatAuth_Err_NormalErr;
    public static final /* enum */ OAuthErrCode WechatAuth_Err_OK;
    public static final /* enum */ OAuthErrCode WechatAuth_Err_Timeout;
    private int code;

    static {
        OAuthErrCode oAuthErrCode;
        OAuthErrCode oAuthErrCode2;
        OAuthErrCode oAuthErrCode3;
        OAuthErrCode oAuthErrCode4;
        OAuthErrCode oAuthErrCode5;
        OAuthErrCode oAuthErrCode6;
        OAuthErrCode oAuthErrCode7;
        WechatAuth_Err_OK = oAuthErrCode7 = new OAuthErrCode(0);
        WechatAuth_Err_NormalErr = oAuthErrCode3 = new OAuthErrCode(-1);
        WechatAuth_Err_NetworkErr = oAuthErrCode2 = new OAuthErrCode(-2);
        WechatAuth_Err_JsonDecodeErr = oAuthErrCode = new OAuthErrCode(-3);
        WechatAuth_Err_Cancel = oAuthErrCode5 = new OAuthErrCode(-4);
        WechatAuth_Err_Timeout = oAuthErrCode4 = new OAuthErrCode(-5);
        WechatAuth_Err_Auth_Stopped = oAuthErrCode6 = new OAuthErrCode(-6);
        $VALUES = new OAuthErrCode[]{oAuthErrCode7, oAuthErrCode3, oAuthErrCode2, oAuthErrCode, oAuthErrCode5, oAuthErrCode4, oAuthErrCode6};
    }

    private OAuthErrCode(int n3) {
        this.code = n3;
    }

    public static OAuthErrCode valueOf(String string2) {
        return (OAuthErrCode)Enum.valueOf(OAuthErrCode.class, (String)string2);
    }

    public static OAuthErrCode[] values() {
        return (OAuthErrCode[])$VALUES.clone();
    }

    public int getCode() {
        return this.code;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OAuthErrCode:");
        stringBuilder.append(this.code);
        return stringBuilder.toString();
    }
}


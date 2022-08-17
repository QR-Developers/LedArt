/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.app.PendingIntent$OnFinished
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.Signature
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  com.tencent.mm.opensdk.channel.MMessageActV2
 *  com.tencent.mm.opensdk.channel.MMessageActV2$Args
 *  com.tencent.mm.opensdk.channel.a.a
 *  com.tencent.mm.opensdk.channel.a.a$a
 *  com.tencent.mm.opensdk.modelbase.BaseReq
 *  com.tencent.mm.opensdk.modelbase.BaseResp
 *  com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo
 *  com.tencent.mm.opensdk.modelbiz.SubscribeMessage
 *  com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg
 *  com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo
 *  com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo
 *  com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed
 *  com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive
 *  com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile
 *  com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo
 *  com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert
 *  com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram
 *  com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken
 *  com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage
 *  com.tencent.mm.opensdk.modelbiz.WXNontaxPay
 *  com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView
 *  com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview
 *  com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat
 *  com.tencent.mm.opensdk.modelbiz.WXPayInsurance
 *  com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram
 *  com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment
 *  com.tencent.mm.opensdk.modelbiz.WXQRCodePay
 *  com.tencent.mm.opensdk.modelmsg.SendMessageToWX
 *  com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$1
 *  com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$2
 *  com.tencent.mm.opensdk.openapi.IWXAPI
 *  com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
 *  com.tencent.mm.opensdk.openapi.MMSharedPreferences
 *  com.tencent.mm.opensdk.openapi.WXApiImplComm
 *  com.tencent.mm.opensdk.utils.ILog
 *  com.tencent.mm.opensdk.utils.Log
 *  com.tencent.mm.opensdk.utils.b
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URLEncoder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.Future
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONObject
 */
package com.tencent.mm.opensdk.openapi;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.a.a;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage;
import com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg;
import com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo;
import com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo;
import com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile;
import com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo;
import com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken;
import com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.mm.opensdk.modelbiz.WXNontaxPay;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview;
import com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat;
import com.tencent.mm.opensdk.modelbiz.WXPayInsurance;
import com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram;
import com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment;
import com.tencent.mm.opensdk.modelbiz.WXQRCodePay;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.BaseWXApiImplV10;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.MMSharedPreferences;
import com.tencent.mm.opensdk.openapi.WXApiImplComm;
import com.tencent.mm.opensdk.utils.ILog;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

class BaseWXApiImplV10
implements IWXAPI {
    protected static final String TAG = "MicroMsg.SDK.WXApiImplV10";
    private static String wxappPayEntryClassname;
    protected String appId;
    protected boolean checkSignature = false;
    protected Context context;
    protected boolean detached = false;
    private int launchMode = 2;
    private int wxSdkVersion;

    BaseWXApiImplV10(Context context, String string, boolean bl2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<init>, appId = ");
        stringBuilder.append(string);
        stringBuilder.append(", checkSignature = ");
        stringBuilder.append(bl2);
        stringBuilder.append(", launchMode = ");
        stringBuilder.append(n);
        Log.d((String)TAG, (String)stringBuilder.toString());
        this.context = context;
        this.appId = string;
        this.checkSignature = bl2;
        this.launchMode = n;
        b.a = context.getApplicationContext();
    }

    static /* synthetic */ int access$002(BaseWXApiImplV10 baseWXApiImplV10, int n) {
        baseWXApiImplV10.wxSdkVersion = n;
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean checkSumConsistent(byte[] arrby, byte[] arrby2) {
        block4 : {
            String string;
            block5 : {
                block3 : {
                    if (arrby == null || arrby.length == 0 || arrby2 == null || arrby2.length == 0) break block3;
                    if (arrby.length == arrby2.length) break block4;
                    string = "checkSumConsistent fail, length is different";
                    break block5;
                }
                string = "checkSumConsistent fail, invalid arguments";
            }
            Log.e((String)TAG, (String)string);
            return false;
        }
        int n = 0;
        while (n < arrby.length) {
            if (arrby[n] != arrby2[n]) {
                return false;
            }
            ++n;
        }
        return true;
    }

    private boolean createChatroom(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/createChatroom");
        String[] arrstring = new String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_create_chatroom_group_id", ""), bundle.getString("_wxapi_create_chatroom_chatroom_name", ""), bundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_create_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String finderShareVideoJumpInfoToString(IWXChannelJumpInfo iWXChannelJumpInfo) {
        JSONObject jSONObject;
        String string;
        String string2;
        block7 : {
            block6 : {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("jumpType", iWXChannelJumpInfo.type());
                    boolean bl2 = iWXChannelJumpInfo instanceof WXChannelBaseJumpInfo;
                    if (!bl2) return jSONObject.toString();
                }
                catch (Exception exception) {
                    return "";
                }
                jSONObject.put("wording", (Object)((WXChannelBaseJumpInfo)iWXChannelJumpInfo).wording);
                jSONObject.put("extra", (Object)((WXChannelBaseJumpInfo)iWXChannelJumpInfo).extra);
                boolean bl3 = iWXChannelJumpInfo instanceof WXChannelJumpMiniProgramInfo;
                if (!bl3) break block6;
                jSONObject.put("username", (Object)((WXChannelJumpMiniProgramInfo)iWXChannelJumpInfo).username);
                string2 = ((WXChannelJumpMiniProgramInfo)iWXChannelJumpInfo).path;
                string = "path";
                break block7;
            }
            if (!(iWXChannelJumpInfo instanceof WXChannelJumpUrlInfo)) return jSONObject.toString();
            string2 = ((WXChannelJumpUrlInfo)iWXChannelJumpInfo).url;
            string = "url";
        }
        jSONObject.put(string, (Object)string2);
        return jSONObject.toString();
    }

    private String getTokenFromWX(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk");
        String[] arrstring = new String[]{this.appId, "638058496"};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null && cursor.moveToFirst()) {
            String string = cursor.getString(0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getTokenFromWX token is ");
            stringBuilder.append(string);
            Log.i((String)TAG, (String)stringBuilder.toString());
            cursor.close();
            return string;
        }
        Log.e((String)TAG, (String)"getTokenFromWX , token is null , if your app targetSdkVersion >= 30, include 'com.tencent.mm' in a set of <package> elements inside the <queries> element");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean handleWxInternalRespType(String string, IWXAPIEventHandler iWXAPIEventHandler) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleWxInternalRespType, extInfo = ");
        stringBuilder.append(string);
        Log.i((String)TAG, (String)stringBuilder.toString());
        try {
            Uri uri = Uri.parse((String)string);
            String string2 = uri.getQueryParameter("wx_internal_resptype");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("handleWxInternalRespType, respType = ");
            stringBuilder2.append(string2);
            Log.i((String)TAG, (String)stringBuilder2.toString());
            if (b.b((String)string2)) {
                Log.e((String)TAG, (String)"handleWxInternalRespType fail, respType is null");
                return false;
            }
            boolean bl2 = string2.equals((Object)"subscribemessage");
            if (bl2) {
                SubscribeMessage.Resp resp = new SubscribeMessage.Resp();
                String string3 = uri.getQueryParameter("ret");
                if (string3 != null && string3.length() > 0) {
                    resp.errCode = b.a((String)string3, (int)0);
                }
                resp.openId = uri.getQueryParameter("openid");
                resp.templateID = uri.getQueryParameter("template_id");
                resp.scene = b.a((String)uri.getQueryParameter("scene"), (int)0);
                resp.action = uri.getQueryParameter("action");
                resp.reserved = uri.getQueryParameter("reserved");
                iWXAPIEventHandler.onResp((BaseResp)resp);
                return true;
            }
            boolean bl3 = string2.contains((CharSequence)"invoice_auth_insert");
            if (bl3) {
                WXInvoiceAuthInsert.Resp resp = new WXInvoiceAuthInsert.Resp();
                String string4 = uri.getQueryParameter("ret");
                if (string4 != null && string4.length() > 0) {
                    resp.errCode = b.a((String)string4, (int)0);
                }
                resp.wxOrderId = uri.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp((BaseResp)resp);
                return true;
            }
            if (string2.contains((CharSequence)"payinsurance")) {
                WXPayInsurance.Resp resp = new WXPayInsurance.Resp();
                String string5 = uri.getQueryParameter("ret");
                if (string5 != null && string5.length() > 0) {
                    resp.errCode = b.a((String)string5, (int)0);
                }
                resp.wxOrderId = uri.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp((BaseResp)resp);
                return true;
            }
            if (string2.contains((CharSequence)"nontaxpay")) {
                WXNontaxPay.Resp resp = new WXNontaxPay.Resp();
                String string6 = uri.getQueryParameter("ret");
                if (string6 != null && string6.length() > 0) {
                    resp.errCode = b.a((String)string6, (int)0);
                }
                resp.wxOrderId = uri.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp((BaseResp)resp);
                return true;
            }
            if (!"subscribeminiprogrammsg".equals((Object)string2) && !"5".equals((Object)string2)) {
                Log.e((String)TAG, (String)"this open sdk version not support the request type");
                return false;
            }
            SubscribeMiniProgramMsg.Resp resp = new SubscribeMiniProgramMsg.Resp();
            String string7 = uri.getQueryParameter("ret");
            if (string7 != null && string7.length() > 0) {
                resp.errCode = b.a((String)string7, (int)0);
            }
            resp.openId = uri.getQueryParameter("openid");
            resp.unionId = uri.getQueryParameter("unionid");
            resp.nickname = uri.getQueryParameter("nickname");
            resp.errStr = uri.getQueryParameter("errmsg");
            iWXAPIEventHandler.onResp((BaseResp)resp);
            return true;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("handleWxInternalRespType fail, ex = ");
            stringBuilder3.append(exception.getMessage());
            Log.e((String)TAG, (String)stringBuilder3.toString());
            return false;
        }
    }

    private boolean joinChatroom(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/joinChatroom");
        String[] arrstring = new String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_join_chatroom_group_id", ""), bundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_join_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private void launchWXIfNeed() {
        if (Build.VERSION.SDK_INT >= 29 && this.launchMode == 2) {
            this.launchWXUsingPendingIntent();
            return;
        }
        this.openWXApp();
    }

    private void launchWXUsingPendingIntent() {
        if (!this.detached) {
            if (!this.isWXAppInstalled()) {
                Log.e((String)TAG, (String)"openWXApp failed, not installed or signature check failed");
                return;
            }
            try {
                Log.i((String)TAG, (String)"launchWXUsingPendingIntent");
                Intent intent = this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                PendingIntent.getActivity((Context)this.context, (int)1, (Intent)intent, (int)134217728).send(this.context, 2, null, (PendingIntent.OnFinished)new 2(this), null);
                return;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("launchWXUsingPendingIntent pendingIntent send failed: ");
                stringBuilder.append(exception.getMessage());
                Log.e((String)TAG, (String)stringBuilder.toString());
                this.openWXApp();
                return;
            }
        }
        throw new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
    }

    private boolean sendAddCardToWX(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/addCardToWX");
        String[] arrstring = new String[]{this.appId, bundle.getString("_wxapi_add_card_to_wx_card_list"), bundle.getString("_wxapi_basereq_transaction")};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendChooseCardFromWX(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX");
        String[] arrstring = new String[]{bundle.getString("_wxapi_choose_card_from_wx_card_app_id"), bundle.getString("_wxapi_choose_card_from_wx_card_location_id"), bundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), bundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), bundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), bundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), bundle.getString("_wxapi_choose_card_from_wx_card_card_id"), bundle.getString("_wxapi_choose_card_from_wx_card_card_type"), bundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), bundle.getString("_wxapi_basereq_transaction")};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendFinderOpenFeed(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        Log.i((String)TAG, (String)"sendFinderOpenFeed");
        WXChannelOpenFeed.Req req = (WXChannelOpenFeed.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/finderOpenFeed");
        String[] arrstring = new String[]{this.appId, req.feedID, req.nonceID, String.valueOf((boolean)req.notGetReleatedList)};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendFinderOpenLive(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        Log.i((String)TAG, (String)"sendFinderOpenLive");
        WXChannelOpenLive.Req req = (WXChannelOpenLive.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/finderOpenLive");
        String[] arrstring = new String[]{this.appId, req.feedID, req.nonceID};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendFinderOpenProfile(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        Log.i((String)TAG, (String)"sendFinderOpenProfile");
        WXChannelOpenProfile.Req req = (WXChannelOpenProfile.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/finderOpenProfile");
        String[] arrstring = new String[]{this.appId, req.userName};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendFinderShareVideo(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        Log.i((String)TAG, (String)"sendFinderShareVideo");
        WXChannelShareVideo.Req req = (WXChannelShareVideo.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/finderShareVideo");
        String[] arrstring = new String[]{this.appId, req.videoPath, "", "", req.extData, this.finderShareVideoJumpInfoToString(req.jumpInfo)};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendHandleScanResult(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/handleScanResult");
        String[] arrstring = new String[]{this.appId, bundle.getString("_wxapi_scan_qrcode_result")};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendInvoiceAuthInsert(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXInvoiceAuthInsert.Req req = (WXInvoiceAuthInsert.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
        Object[] arrobject = new Object[]{URLEncoder.encode((String)req.url)};
        String string = URLEncoder.encode((String)String.format((String)"url=%s", (Object[])arrobject));
        String[] arrstring = new String[]{this.appId, String.valueOf((int)2), string};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendJumpToOfflinePayReq(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay");
        String[] arrstring = new String[]{this.appId};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendLaunchWXMiniprogram(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXLaunchMiniProgram.Req req = (WXLaunchMiniProgram.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram");
        String[] arrstring = new String[5];
        arrstring[0] = this.appId;
        arrstring[1] = req.userName;
        arrstring[2] = req.path;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(req.miniprogramType);
        stringBuilder.append("");
        arrstring[3] = stringBuilder.toString();
        arrstring[4] = req.extData;
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendLaunchWXMiniprogramWithToken(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXLaunchMiniProgramWithToken.Req req = (WXLaunchMiniProgramWithToken.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogramWithToken");
        String[] arrstring = new String[]{this.appId, req.token};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendNonTaxPay(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXNontaxPay.Req req = (WXNontaxPay.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
        Object[] arrobject = new Object[]{URLEncoder.encode((String)req.url)};
        String string = URLEncoder.encode((String)String.format((String)"url=%s", (Object[])arrobject));
        String[] arrstring = new String[]{this.appId, String.valueOf((int)3), string};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendOpenBusiLuckyMoney(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney");
        String[] arrstring = new String[]{this.appId, bundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), bundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), bundle.getString("_wxapi_open_busi_lucky_money_signType"), bundle.getString("_wxapi_open_busi_lucky_money_signature"), bundle.getString("_wxapi_open_busi_lucky_money_package")};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendOpenBusinessView(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXOpenBusinessView.Req req = (WXOpenBusinessView.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openBusinessView");
        String[] arrstring = new String[]{this.appId, req.businessType, req.query, req.extInfo, req.transaction, req.openId};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendOpenBusinessWebview(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXOpenBusinessWebview.Req req = (WXOpenBusinessWebview.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openBusinessWebview");
        HashMap<String, String> hashMap = req.queryInfo;
        String string = hashMap != null && hashMap.size() > 0 ? new JSONObject(req.queryInfo).toString() : "";
        String[] arrstring = new String[3];
        arrstring[0] = this.appId;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(req.businessType);
        stringBuilder.append("");
        arrstring[1] = stringBuilder.toString();
        arrstring[2] = string;
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendOpenCustomerServiceChat(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXOpenCustomerServiceChat.Req req = (WXOpenCustomerServiceChat.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openCustomerServiceChat");
        String[] arrstring = new String[]{this.appId, req.corpId, req.url};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendOpenRankListReq(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        Cursor cursor = context.getContentResolver().query(Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, new String[0], null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendOpenWebview(Context context, Bundle bundle) {
        this.launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openWebview");
        String[] arrstring = new String[]{this.appId, bundle.getString("_wxapi_jump_to_webview_url"), bundle.getString("_wxapi_basereq_transaction")};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendPayInSurance(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXPayInsurance.Req req = (WXPayInsurance.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
        Object[] arrobject = new Object[]{URLEncoder.encode((String)req.url)};
        String string = URLEncoder.encode((String)String.format((String)"url=%s", (Object[])arrobject));
        String[] arrstring = new String[]{this.appId, String.valueOf((int)4), string};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean sendPayReq(Context context, Bundle bundle) {
        if (wxappPayEntryClassname == null) {
            wxappPayEntryClassname = new MMSharedPreferences(context).getString("_wxapp_pay_entry_classname_", null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pay, set wxappPayEntryClassname = ");
            stringBuilder.append(wxappPayEntryClassname);
            Log.d((String)TAG, (String)stringBuilder.toString());
            if (wxappPayEntryClassname == null) {
                try {
                    wxappPayEntryClassname = context.getPackageManager().getApplicationInfo((String)"com.tencent.mm", (int)128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("get from metaData failed : ");
                    stringBuilder2.append(exception.getMessage());
                    Log.e((String)TAG, (String)stringBuilder2.toString());
                }
            }
            if (wxappPayEntryClassname == null) {
                Log.e((String)TAG, (String)"pay fail, wxappPayEntryClassname is null");
                return false;
            }
        }
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.bundle = bundle;
        args.targetPkgName = "com.tencent.mm";
        args.targetClassName = wxappPayEntryClassname;
        args.launchMode = this.launchMode;
        String string = this.getTokenFromWX(context);
        if (string == null) return MMessageActV2.send((Context)context, (MMessageActV2.Args)args);
        try {
            args.token = string;
            return MMessageActV2.send((Context)context, (MMessageActV2.Args)args);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getTokenFromWX fail, exception = ");
            stringBuilder.append((Object)exception);
            Log.e((String)TAG, (String)stringBuilder.toString());
        }
        return MMessageActV2.send((Context)context, (MMessageActV2.Args)args);
    }

    private boolean sendPreloadWXMiniProgramEnvironment(Context context, BaseReq baseReq) {
        WXPreloadMiniProgramEnvironment.Req req = (WXPreloadMiniProgramEnvironment.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogramEnvironment");
        String[] arrstring = new String[]{this.appId, req.extData};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendPreloadWXMiniprogram(Context context, BaseReq baseReq) {
        WXPreloadMiniProgram.Req req = (WXPreloadMiniProgram.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogram");
        String[] arrstring = new String[5];
        arrstring[0] = this.appId;
        arrstring[1] = req.userName;
        arrstring[2] = req.path;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(req.miniprogramType);
        stringBuilder.append("");
        arrstring[3] = stringBuilder.toString();
        arrstring[4] = req.extData;
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendQRCodePayReq(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        WXQRCodePay.Req req = (WXQRCodePay.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/QRCodePay");
        String[] arrstring = new String[]{this.appId, req.codeContent, req.extraMsg};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendSubscribeMessage(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        SubscribeMessage.Req req = (SubscribeMessage.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
        String[] arrstring = new String[]{this.appId, String.valueOf((int)1), String.valueOf((int)req.scene), req.templateID, req.reserved};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendSubscribeMiniProgramMsg(Context context, BaseReq baseReq) {
        this.launchWXIfNeed();
        SubscribeMiniProgramMsg.Req req = (SubscribeMiniProgramMsg.Req)baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
        String[] arrstring = new String[]{this.appId, String.valueOf((int)5), req.miniProgramAppId};
        Cursor cursor = contentResolver.query(uri, null, null, arrstring, null);
        if (cursor != null) {
            cursor.close();
        }
        return true;
    }

    private boolean sendToWxaRedirectingPage(Context context, BaseReq baseReq) {
        block2 : {
            this.launchWXIfNeed();
            WXLaunchWxaRedirectingPage.Req req = (WXLaunchWxaRedirectingPage.Req)baseReq;
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = Uri.parse((String)"content://com.tencent.mm.sdk.comm.provider/launchWxaOpenApiRedirectingPage");
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, (Object)this.appId);
            arrayList.addAll((Collection)Arrays.asList((Object[])req.toArray()));
            Cursor cursor = contentResolver.query(uri, null, null, (String[])arrayList.toArray((Object[])new String[0]), null);
            if (cursor == null) break block2;
            cursor.close();
        }
        return true;
    }

    public void detach() {
        Log.d((String)TAG, (String)"detach");
        this.detached = true;
        this.context = null;
    }

    public int getWXAppSupportAPI() {
        if (!this.detached) {
            if (!this.isWXAppInstalled()) {
                Log.e((String)TAG, (String)"open wx app failed, not installed or signature check failed");
                return 0;
            }
            this.wxSdkVersion = 0;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            b.e.submit((Runnable)new 1(this, countDownLatch));
            try {
                countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            }
            catch (InterruptedException interruptedException) {
                Log.w((String)TAG, (String)interruptedException.getMessage());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("wxSdkVersion = ");
            stringBuilder.append(this.wxSdkVersion);
            Log.d((String)TAG, (String)stringBuilder.toString());
            if (this.wxSdkVersion == 0) {
                try {
                    this.wxSdkVersion = this.context.getPackageManager().getApplicationInfo((String)"com.tencent.mm", (int)128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("OPEN_SDK_VERSION = ");
                    stringBuilder2.append(this.wxSdkVersion);
                    Log.d((String)TAG, (String)stringBuilder2.toString());
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("get from metaData failed : ");
                    stringBuilder3.append(exception.getMessage());
                    Log.e((String)TAG, (String)stringBuilder3.toString());
                }
            }
            return this.wxSdkVersion;
        }
        throw new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
    }

    /*
     * Exception decompiling
     */
    public boolean handleIntent(Intent var1_1, IWXAPIEventHandler var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:478)
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:61)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:372)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:923)
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean isWXAppInstalled() {
        if (!this.detached) {
            boolean bl2;
            PackageInfo packageInfo;
            block4 : {
                bl2 = false;
                try {
                    packageInfo = this.context.getPackageManager().getPackageInfo("com.tencent.mm", 64);
                    if (packageInfo != null) break block4;
                    return false;
                }
                catch (Exception exception) {}
            }
            bl2 = WXApiImplComm.validateAppSignature((Context)this.context, (Signature[])packageInfo.signatures, (boolean)this.checkSignature);
            return bl2;
        }
        throw new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean openWXApp() {
        String string;
        if (this.detached) {
            IllegalStateException illegalStateException = new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
            throw illegalStateException;
        }
        if (!this.isWXAppInstalled()) {
            string = "open wx app failed, not installed or signature check failed";
        } else {
            try {
                Context context = this.context;
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
                return true;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("startActivity fail, exception = ");
                stringBuilder.append(exception.getMessage());
                string = stringBuilder.toString();
            }
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public boolean registerApp(String string) {
        return this.registerApp(string, 0L);
    }

    public boolean registerApp(String string, long l2) {
        if (!this.detached) {
            if (!WXApiImplComm.validateAppSignatureForPackage((Context)this.context, (String)"com.tencent.mm", (boolean)this.checkSignature)) {
                Log.e((String)TAG, (String)"register app failed for wechat app signature check failed");
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("registerApp, appId = ");
            stringBuilder.append(string);
            Log.d((String)TAG, (String)stringBuilder.toString());
            if (string != null) {
                this.appId = string;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("registerApp, appId = ");
            stringBuilder2.append(string);
            Log.d((String)TAG, (String)stringBuilder2.toString());
            if (string != null) {
                this.appId = string;
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("register app ");
            stringBuilder3.append(this.context.getPackageName());
            Log.d((String)TAG, (String)stringBuilder3.toString());
            a.a a3 = new a.a();
            a3.a = "com.tencent.mm";
            a3.b = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER";
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("weixin://registerapp?appid=");
            stringBuilder4.append(this.appId);
            a3.c = stringBuilder4.toString();
            a3.d = l2;
            return a.a((Context)this.context, (a.a)a3);
        }
        throw new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean sendReq(BaseReq var1_1) {
        block47 : {
            block48 : {
                block46 : {
                    block45 : {
                        block44 : {
                            if (this.detached) {
                                var2_25 = new IllegalStateException("sendReq fail, WXMsgImpl has been detached");
                                throw var2_25;
                            }
                            if (WXApiImplComm.validateAppSignatureForPackage((Context)this.context, (String)"com.tencent.mm", (boolean)this.checkSignature)) break block44;
                            var32_2 = "sendReq failed for wechat app signature check failed";
                            break block45;
                        }
                        if (var1_1.getType() == 2) {
                            var33_3 = (SendMessageToWX.Req)var1_1;
                            if (var33_3.scene == 4 && (var34_4 = var33_3.sceneDataObject) instanceof WXStateSceneDataObject) {
                                var35_5 = (WXStateSceneDataObject)var34_4;
                                var36_6 = var33_3.message;
                                if (var36_6.mediaObject == null) {
                                    var36_6.mediaObject = new WXTextObject();
                                }
                                if (var33_3.message.getType() == 1 && ((var37_7 = var35_5.stateTitle) == null || var37_7.length() <= 0)) {
                                    var35_5.stateTitle = ((WXTextObject)var33_3.message.mediaObject).text;
                                }
                            }
                        }
                        if (var1_1.checkArgs()) break block46;
                        var32_2 = "sendReq checkArgs fail";
                    }
                    Log.e((String)"MicroMsg.SDK.WXApiImplV10", (String)var32_2);
                    return false;
                }
                var3_8 = new StringBuilder();
                var3_8.append("sendReq, req type = ");
                var3_8.append(var1_1.getType());
                Log.i((String)"MicroMsg.SDK.WXApiImplV10", (String)var3_8.toString());
                var6_9 = new Bundle();
                var1_1.toBundle(var6_9);
                if (var1_1.getType() == 5) return this.sendPayReq(this.context, var6_9);
                if (var1_1.getType() == 27) {
                    return this.sendPayReq(this.context, var6_9);
                }
                if (var1_1.getType() == 9) {
                    return this.sendAddCardToWX(this.context, var6_9);
                }
                if (var1_1.getType() == 16) {
                    return this.sendChooseCardFromWX(this.context, var6_9);
                }
                if (var1_1.getType() == 11) {
                    return this.sendOpenRankListReq(this.context, var6_9);
                }
                if (var1_1.getType() == 12) {
                    return this.sendOpenWebview(this.context, var6_9);
                }
                if (var1_1.getType() == 25) {
                    return this.sendOpenBusinessWebview(this.context, var1_1);
                }
                if (var1_1.getType() == 13) {
                    return this.sendOpenBusiLuckyMoney(this.context, var6_9);
                }
                if (var1_1.getType() == 14) {
                    return this.createChatroom(this.context, var6_9);
                }
                if (var1_1.getType() == 15) {
                    return this.joinChatroom(this.context, var6_9);
                }
                if (var1_1.getType() == 17) {
                    return this.sendHandleScanResult(this.context, var6_9);
                }
                if (var1_1.getType() == 18) {
                    return this.sendSubscribeMessage(this.context, var1_1);
                }
                if (var1_1.getType() == 28) {
                    return this.sendPreloadWXMiniprogram(this.context, var1_1);
                }
                if (var1_1.getType() == 29) {
                    return this.sendLaunchWXMiniprogramWithToken(this.context, var1_1);
                }
                if (var1_1.getType() == 23) {
                    return this.sendSubscribeMiniProgramMsg(this.context, var1_1);
                }
                if (var1_1.getType() == 19) {
                    return this.sendLaunchWXMiniprogram(this.context, var1_1);
                }
                if (var1_1.getType() == 32) {
                    return this.sendPreloadWXMiniProgramEnvironment(this.context, var1_1);
                }
                if (var1_1.getType() == 30) {
                    return this.sendToWxaRedirectingPage(this.context, var1_1);
                }
                if (var1_1.getType() == 26) {
                    return this.sendOpenBusinessView(this.context, var1_1);
                }
                if (var1_1.getType() == 33) {
                    return this.sendFinderShareVideo(this.context, var1_1);
                }
                if (var1_1.getType() == 34) {
                    return this.sendFinderOpenProfile(this.context, var1_1);
                }
                if (var1_1.getType() == 35) {
                    return this.sendFinderOpenLive(this.context, var1_1);
                }
                if (var1_1.getType() == 36) {
                    return this.sendFinderOpenFeed(this.context, var1_1);
                }
                if (var1_1.getType() == 37) {
                    return this.sendOpenCustomerServiceChat(this.context, var1_1);
                }
                if (var1_1.getType() == 38) {
                    return this.sendQRCodePayReq(this.context, var1_1);
                }
                if (var1_1.getType() == 20) {
                    return this.sendInvoiceAuthInsert(this.context, var1_1);
                }
                if (var1_1.getType() == 21) {
                    return this.sendNonTaxPay(this.context, var1_1);
                }
                if (var1_1.getType() == 22) {
                    return this.sendPayInSurance(this.context, var1_1);
                }
                if (var1_1.getType() == 24) {
                    return this.sendJumpToOfflinePayReq(this.context, var6_9);
                }
                if (var1_1.getType() != 2) break block47;
                var16_10 = (SendMessageToWX.Req)var1_1;
                var17_11 = var16_10.message.getType();
                if (!b.a((int)var17_11)) break block47;
                if (this.getWXAppSupportAPI() >= 620756993) break block48;
                var18_12 = new WXWebpageObject();
                ** GOTO lbl96
            }
            if (var17_11 == 46 && this.getWXAppSupportAPI() < 620953856) {
                var18_12 = new WXWebpageObject();
lbl96: // 2 sources:
                var18_12.webpageUrl = var6_9.getString("_wxminiprogram_webpageurl");
                var16_10.message.mediaObject = var18_12;
            } else {
                var20_13 = (WXMiniProgramObject)var16_10.message.mediaObject;
                var21_14 = new StringBuilder();
                var21_14.append(var20_13.userName);
                var21_14.append("@app");
                var20_13.userName = var21_14.toString();
                var24_15 = var20_13.path;
                if (!b.b((String)var24_15)) {
                    var25_16 = var24_15.split("\\?");
                    if (var25_16.length > 1) {
                        var26_17 = new StringBuilder();
                        var26_17.append(var25_16[0]);
                        var26_17.append(".html?");
                        var29_18 = var25_16[1];
                    } else {
                        var26_17 = new StringBuilder();
                        var26_17.append(var25_16[0]);
                        var29_18 = ".html";
                    }
                    var26_17.append(var29_18);
                    var20_13.path = var26_17.toString();
                }
            }
            var19_19 = var16_10.scene;
            if (var19_19 != 3 && var19_19 != 1) {
                var16_10.scene = 0;
            }
            var1_1.toBundle(var6_9);
        }
        var7_20 = new MMessageActV2.Args();
        var7_20.bundle = var6_9;
        var8_21 = new StringBuilder();
        var8_21.append("weixin://sendreq?appid=");
        var8_21.append(this.appId);
        var7_20.content = var8_21.toString();
        var7_20.targetPkgName = "com.tencent.mm";
        var7_20.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
        var7_20.launchMode = this.launchMode;
        try {
            var15_22 = this.getTokenFromWX(this.context);
            if (var15_22 == null) return MMessageActV2.send((Context)this.context, (MMessageActV2.Args)var7_20);
            var7_20.token = var15_22;
            return MMessageActV2.send((Context)this.context, (MMessageActV2.Args)var7_20);
        }
        catch (Exception var11_23) {
            var12_24 = new StringBuilder();
            var12_24.append("getTokenFromWX fail, exception = ");
            var12_24.append((Object)var11_23);
            Log.e((String)"MicroMsg.SDK.WXApiImplV10", (String)var12_24.toString());
        }
        return MMessageActV2.send((Context)this.context, (MMessageActV2.Args)var7_20);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean sendResp(BaseResp baseResp) {
        block8 : {
            String string;
            block7 : {
                block6 : {
                    if (this.detached) {
                        IllegalStateException illegalStateException = new IllegalStateException("sendResp fail, WXMsgImpl has been detached");
                        throw illegalStateException;
                    }
                    if (WXApiImplComm.validateAppSignatureForPackage((Context)this.context, (String)"com.tencent.mm", (boolean)this.checkSignature)) break block6;
                    string = "sendResp failed for wechat app signature check failed";
                    break block7;
                }
                if (baseResp.checkArgs()) break block8;
                string = "sendResp checkArgs fail";
            }
            Log.e((String)TAG, (String)string);
            return false;
        }
        Bundle bundle = new Bundle();
        baseResp.toBundle(bundle);
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.bundle = bundle;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("weixin://sendresp?appid=");
        stringBuilder.append(this.appId);
        args.content = stringBuilder.toString();
        args.targetPkgName = "com.tencent.mm";
        args.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
        try {
            String string = this.getTokenFromWX(this.context);
            if (string == null) return MMessageActV2.send((Context)this.context, (MMessageActV2.Args)args);
            args.token = string;
            return MMessageActV2.send((Context)this.context, (MMessageActV2.Args)args);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("getTokenFromWX fail, exception = ");
            stringBuilder2.append((Object)exception);
            Log.e((String)TAG, (String)stringBuilder2.toString());
        }
        return MMessageActV2.send((Context)this.context, (MMessageActV2.Args)args);
    }

    public void setLogImpl(ILog iLog) {
        Log.setLogImpl((ILog)iLog);
    }

    public void unregisterApp() {
        if (!this.detached) {
            if (!WXApiImplComm.validateAppSignatureForPackage((Context)this.context, (String)"com.tencent.mm", (boolean)this.checkSignature)) {
                Log.e((String)TAG, (String)"unregister app failed for wechat app signature check failed");
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unregisterApp, appId = ");
            stringBuilder.append(this.appId);
            Log.d((String)TAG, (String)stringBuilder.toString());
            String string = this.appId;
            if (string != null && string.length() != 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("unregister app ");
                stringBuilder2.append(this.context.getPackageName());
                Log.d((String)TAG, (String)stringBuilder2.toString());
                a.a a3 = new a.a();
                a3.a = "com.tencent.mm";
                a3.b = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_UNREGISTER";
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("weixin://unregisterapp?appid=");
                stringBuilder3.append(this.appId);
                a3.c = stringBuilder3.toString();
                a.a((Context)this.context, (a.a)a3);
                return;
            }
            Log.e((String)TAG, (String)"unregisterApp fail, appId is empty");
            return;
        }
        throw new IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
    }
}


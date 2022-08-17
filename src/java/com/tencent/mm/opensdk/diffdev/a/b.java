/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Base64
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Void
 *  java.util.concurrent.Executor
 *  org.json.JSONObject
 */
package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.diffdev.a.c;
import com.tencent.mm.opensdk.utils.Log;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public class b
extends AsyncTask<Void, Void, a> {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private OAuthListener f;
    private c g;

    public b(String string2, String string3, String string4, String string5, String string6, OAuthListener oAuthListener) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = oAuthListener;
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c c2 = this.g;
        if (c2 == null) {
            return this.cancel(true);
        }
        return c2.cancel(true);
    }

    protected Object doInBackground(Object[] arrobject) {
        (Void[])arrobject;
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        Object[] arrobject2 = new Object[]{this.a, this.c, this.d, this.b, this.e};
        String string2 = String.format((String)"https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", (Object[])arrobject2);
        long l = System.currentTimeMillis();
        byte[] arrby = com.tencent.mm.opensdk.channel.a.a.a(string2, 60000);
        Object[] arrobject3 = new Object[]{string2, System.currentTimeMillis() - l};
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format((String)"doInBackground, url = %s, time consumed = %d(ms)", (Object[])arrobject3));
        return a.a(arrby);
    }

    protected void onPostExecute(Object object) {
        a a2 = (a)object;
        OAuthErrCode oAuthErrCode = a2.a;
        if (oAuthErrCode == OAuthErrCode.WechatAuth_Err_OK) {
            c c2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onPostExecute, get qrcode success imgBufSize = ");
            stringBuilder.append(a2.e.length);
            Log.d("MicroMsg.SDK.GetQRCodeTask", stringBuilder.toString());
            this.f.onAuthGotQrcode(a2.d, a2.e);
            this.g = c2 = new c(a2.b, this.f);
            if (Build.VERSION.SDK_INT >= 11) {
                c2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
                return;
            }
            c2.execute((Object[])new Void[0]);
            return;
        }
        Log.e("MicroMsg.SDK.GetQRCodeTask", String.format((String)"onPostExecute, get qrcode fail, OAuthErrCode = %s", (Object[])new Object[]{oAuthErrCode}));
        this.f.onAuthFinish(a2.a, null);
    }

    static class a {
        public OAuthErrCode a;
        public String b;
        public String c;
        public String d;
        public byte[] e;

        private a() {
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public static a a(byte[] var0) {
            var1_1 = new a();
            if (var0 == null || var0.length == 0) ** GOTO lbl42
            var3_2 = new String(var0, "utf-8");
            try {
                var4_3 = new JSONObject(var3_2);
                var8_4 = var4_3.getInt("errcode");
                if (var8_4 != 0) {
                    var13_5 = new Object[]{var8_4};
                    Log.e("MicroMsg.SDK.GetQRCodeResult", String.format((String)"resp errcode = %d", (Object[])var13_5));
                    var1_1.a = OAuthErrCode.WechatAuth_Err_NormalErr;
                    var4_3.optString("errmsg");
                    return var1_1;
                }
                var9_6 = var4_3.getJSONObject("qrcode").getString("qrcodebase64");
                if (var9_6 != null && var9_6.length() != 0) {
                    var10_7 = Base64.decode((String)var9_6, (int)0);
                    if (var10_7 != null && var10_7.length != 0) {
                        var1_1.a = OAuthErrCode.WechatAuth_Err_OK;
                        var1_1.e = var10_7;
                        var1_1.b = var4_3.getString("uuid");
                        var1_1.c = var11_8 = var4_3.getString("appname");
                        var12_9 = new Object[]{var1_1.b, var11_8, var1_1.e.length};
                        Log.d("MicroMsg.SDK.GetQRCodeResult", String.format((String)"parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", (Object[])var12_9));
                        return var1_1;
                    }
                    Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                    var1_1.a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                    return var1_1;
                }
                Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                var1_1.a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                return var1_1;
            }
            catch (Exception var5_10) {
                block8 : {
                    block7 : {
                        var6_11 = new Object[]{var5_10.getMessage()};
                        var7_12 = String.format((String)"parse json fail, ex = %s", (Object[])var6_11);
                        break block7;
                        catch (Exception var15_14) {
                            var16_15 = new Object[]{var15_14.getMessage()};
                            var7_12 = String.format((String)"parse fail, build String fail, ex = %s", (Object[])var16_15);
                        }
                    }
                    Log.e("MicroMsg.SDK.GetQRCodeResult", var7_12);
                    var2_13 = OAuthErrCode.WechatAuth_Err_NormalErr;
                    break block8;
lbl42: // 1 sources:
                    Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                    var2_13 = OAuthErrCode.WechatAuth_Err_NetworkErr;
                }
                var1_1.a = var2_13;
                return var1_1;
            }
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.app.PendingIntent$OnFinished
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.tencent.mm.opensdk.channel;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.mm.opensdk.channel.a.a;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;

public class MMessageActV2 {
    public static final String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
    public static final String MM_ENTRY_PACKAGE_NAME = "com.tencent.mm";
    public static final String MM_MSG_ENTRY_CLASS_NAME = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
    private static final String TAG = "MicroMsg.SDK.MMessageAct";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean send(Context context, Args args) {
        String string2;
        if (context != null && args != null) {
            if (b.b(args.targetPkgName)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("send fail, invalid targetPkgName, targetPkgName = ");
                stringBuilder.append(args.targetPkgName);
                string2 = stringBuilder.toString();
            } else {
                Intent intent;
                block11 : {
                    if (b.b(args.targetClassName)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(args.targetPkgName);
                        stringBuilder.append(DEFAULT_ENTRY_CLASS_NAME);
                        args.targetClassName = stringBuilder.toString();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("send, targetPkgName = ");
                    stringBuilder.append(args.targetPkgName);
                    stringBuilder.append(", targetClassName = ");
                    stringBuilder.append(args.targetClassName);
                    stringBuilder.append(", launchMode = ");
                    stringBuilder.append(args.launchMode);
                    Log.d(TAG, stringBuilder.toString());
                    intent = new Intent();
                    intent.setClassName(args.targetPkgName, args.targetClassName);
                    Bundle bundle = args.bundle;
                    if (bundle != null) {
                        intent.putExtras(bundle);
                    }
                    String string3 = context.getPackageName();
                    intent.putExtra("_mmessage_sdkVersion", 638058496);
                    intent.putExtra("_mmessage_appPackage", string3);
                    intent.putExtra("_mmessage_content", args.content);
                    intent.putExtra("_mmessage_checksum", a.a(args.content, 638058496, string3));
                    intent.putExtra("_message_token", args.token);
                    int n2 = args.flags;
                    if (n2 == -1) {
                        intent.addFlags(268435456).addFlags(134217728);
                    } else {
                        intent.setFlags(n2);
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29 && args.launchMode == 2) {
                            MMessageActV2.sendUsingPendingIntent(context, intent);
                            break block11;
                        }
                        context.startActivity(intent);
                    }
                    catch (Exception exception) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("send fail, ex = ");
                        stringBuilder2.append(exception.getMessage());
                        string2 = stringBuilder2.toString();
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("send mm message, intent=");
                stringBuilder.append((Object)intent);
                Log.d(TAG, stringBuilder.toString());
                return true;
            }
        } else {
            string2 = "send fail, invalid argument";
        }
        Log.e(TAG, string2);
        return false;
    }

    private static void sendUsingPendingIntent(Context context, Intent intent) {
        try {
            Log.i(TAG, "sendUsingPendingIntent");
            PendingIntent.getActivity((Context)context, (int)3, (Intent)intent, (int)134217728).send(context, 4, null, new PendingIntent.OnFinished(){

                public void onSendFinished(PendingIntent pendingIntent, Intent intent, int n2, String string2, Bundle bundle) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("sendUsingPendingIntent onSendFinished resultCode: ");
                    stringBuilder.append(n2);
                    stringBuilder.append(", resultData: ");
                    stringBuilder.append(string2);
                    Log.i(MMessageActV2.TAG, stringBuilder.toString());
                }
            }, null);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sendUsingPendingIntent fail, ex = ");
            stringBuilder.append(exception.getMessage());
            Log.e(TAG, stringBuilder.toString());
            context.startActivity(intent);
            return;
        }
    }

    public static class Args {
        public static final int INVALID_FLAGS = -1;
        public Bundle bundle;
        public String content;
        public int flags = -1;
        public int launchMode = 2;
        public String targetClassName;
        public String targetPkgName;
        public String token;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("targetPkgName:");
            stringBuilder.append(this.targetPkgName);
            stringBuilder.append(", targetClassName:");
            stringBuilder.append(this.targetClassName);
            stringBuilder.append(", content:");
            stringBuilder.append(this.content);
            stringBuilder.append(", flags:");
            stringBuilder.append(this.flags);
            stringBuilder.append(", bundle:");
            stringBuilder.append((Object)this.bundle);
            return stringBuilder.toString();
        }
    }

}


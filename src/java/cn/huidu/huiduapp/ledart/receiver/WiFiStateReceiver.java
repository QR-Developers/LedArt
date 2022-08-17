/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.wifi.WifiInfo
 *  android.os.Parcelable
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  o8.c
 *  v5.b
 */
package cn.huidu.huiduapp.ledart.receiver;

import a1.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.os.Parcelable;
import android.util.Log;
import o8.c;
import v5.b;

public class WiFiStateReceiver
extends BroadcastReceiver {
    private static String a;

    public void onReceive(Context context, Intent intent) {
        String string = intent.getAction();
        if (string == null) {
            return;
        }
        if (!string.equals((Object)"android.net.wifi.WIFI_STATE_CHANGED")) {
            String string2;
            if (!string.equals((Object)"android.net.wifi.STATE_CHANGE")) {
                return;
            }
            WifiInfo wifiInfo = (WifiInfo)intent.getParcelableExtra("wifiInfo");
            if (!(wifiInfo == null || (string2 = a) != null && string2.equals((Object)wifiInfo.getSSID()))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onReceive::Network changed: ");
                stringBuilder.append(wifiInfo.getSSID());
                stringBuilder.append(", previous: ");
                stringBuilder.append(a);
                Log.d((String)"WiFiStateReceiver", (String)stringBuilder.toString());
                a = wifiInfo.getSSID();
                b.e();
                c.c().l((Object)new m(3));
                return;
            }
        } else {
            int n2 = intent.getIntExtra("wifi_state", 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onReceive:: wifi state changed: ");
            stringBuilder.append(n2);
            Log.d((String)"WiFiStateReceiver", (String)stringBuilder.toString());
            if (n2 == 1) {
                b.e();
                c.c().l((Object)new m(2));
                return;
            }
            if (n2 == 3) {
                c.c().l((Object)new m(1));
            }
        }
    }
}


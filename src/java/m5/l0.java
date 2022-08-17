/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.wifi.ScanResult
 *  android.net.wifi.WifiConfiguration
 *  android.net.wifi.WifiInfo
 *  android.net.wifi.WifiManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.BitSet
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 */
package m5;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import m5.k0;

public class l0 {
    private WifiManager a;
    private int b;

    public l0(Context context) {
        this.a = (WifiManager)context.getApplicationContext().getSystemService("wifi");
        this.b = 12000;
    }

    public static /* synthetic */ int a(WifiConfiguration wifiConfiguration, WifiConfiguration wifiConfiguration2) {
        return l0.j(wifiConfiguration, wifiConfiguration2);
    }

    private static boolean b(@NonNull WifiManager wifiManager, @Nullable WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            boolean bl = l0.d(wifiManager, wifiConfiguration);
            boolean bl2 = false;
            if (bl) {
                boolean bl3 = wifiManager.reassociate();
                bl2 = false;
                if (bl3) {
                    bl2 = true;
                }
            }
            return bl2;
        }
        int n5 = wifiConfiguration.priority;
        int n6 = 1 + l0.e(wifiManager);
        if (n6 > 99999) {
            n6 = l0.m(wifiManager);
            if ((wifiConfiguration = l0.i(wifiManager, wifiConfiguration)) == null) {
                return false;
            }
        }
        wifiConfiguration.priority = n6;
        int n7 = wifiManager.updateNetwork(wifiConfiguration);
        if (n7 == -1) {
            return false;
        }
        if (!wifiManager.enableNetwork(n7, false)) {
            wifiConfiguration.priority = n5;
            return false;
        }
        if (!wifiManager.saveConfiguration()) {
            wifiConfiguration.priority = n5;
            return false;
        }
        WifiConfiguration wifiConfiguration2 = l0.i(wifiManager, wifiConfiguration);
        boolean bl = false;
        if (wifiConfiguration2 != null) {
            boolean bl4 = l0.d(wifiManager, wifiConfiguration2);
            bl = false;
            if (bl4) {
                boolean bl5 = wifiManager.reassociate();
                bl = false;
                if (bl5) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    @NonNull
    private static String c(@NonNull String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return "";
        }
        int n5 = -1 + string2.length();
        if (n5 >= 0) {
            if (string2.charAt(0) == '\"' && string2.charAt(n5) == '\"') {
                return string2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\"");
            stringBuilder.append(string2);
            stringBuilder.append("\"");
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    private static boolean d(@NonNull WifiManager wifiManager, @Nullable WifiConfiguration wifiConfiguration) {
        List list = wifiManager.getConfiguredNetworks();
        boolean bl = false;
        if (list != null) {
            bl = false;
            if (wifiConfiguration != null) {
                if (list.isEmpty()) {
                    return false;
                }
                Iterator iterator = list.iterator();
                boolean bl2 = false;
                while (iterator.hasNext()) {
                    WifiConfiguration wifiConfiguration2 = (WifiConfiguration)iterator.next();
                    int n5 = wifiConfiguration2.networkId;
                    if (n5 == wifiConfiguration.networkId) {
                        bl = wifiManager.enableNetwork(n5, true);
                        continue;
                    }
                    if (bl2) continue;
                    long l3 = SystemClock.uptimeMillis();
                    boolean bl3 = wifiManager.disableNetwork(wifiConfiguration2.networkId);
                    long l5 = SystemClock.uptimeMillis() - l3;
                    if (bl3 && l5 <= 600L) continue;
                    bl2 = true;
                }
            }
        }
        return bl;
    }

    private static int e(@NonNull WifiManager wifiManager) {
        Iterator iterator = wifiManager.getConfiguredNetworks().iterator();
        int n5 = 0;
        while (iterator.hasNext()) {
            int n6 = ((WifiConfiguration)iterator.next()).priority;
            if (n6 <= n5) continue;
            n5 = n6;
        }
        return n5;
    }

    private static String f(@NonNull ScanResult scanResult) {
        String string2 = scanResult.capabilities;
        String string3 = "OPEN";
        if (string2 == null) {
            Log.d((String)"WiFiReconnectHelper", (String)"ScanResult capabilities is null!");
            return string3;
        }
        if (string2.contains((CharSequence)"WEP")) {
            string3 = "WEP";
        }
        if (scanResult.capabilities.contains((CharSequence)"PSK")) {
            string3 = "PSK";
        }
        if (scanResult.capabilities.contains((CharSequence)"EAP")) {
            string3 = "EAP";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ScanResult capabilities ");
        stringBuilder.append(scanResult.capabilities);
        stringBuilder.append(", security: ");
        stringBuilder.append(string3);
        Log.d((String)"WiFiReconnectHelper", (String)stringBuilder.toString());
        return string3;
    }

    private static String g(@NonNull WifiConfiguration wifiConfiguration) {
        BitSet bitSet = wifiConfiguration.allowedKeyManagement;
        String string2 = "OPEN";
        if (bitSet == null) {
            Log.d((String)"WiFiReconnectHelper", (String)"WifiConfiguration allowedKeyManagement is null!");
            return string2;
        }
        if (bitSet.get(0) && wifiConfiguration.wepKeys[0] != null) {
            string2 = "WEP";
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            string2 = "EAP";
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            string2 = "PSK";
        }
        return string2;
    }

    @Nullable
    private static WifiConfiguration h(@NonNull WifiManager wifiManager, @NonNull ScanResult scanResult) {
        String string2;
        if (scanResult.BSSID != null && (string2 = scanResult.SSID) != null && !string2.isEmpty()) {
            if (scanResult.BSSID.isEmpty()) {
                return null;
            }
            String string3 = l0.c(scanResult.SSID);
            String string4 = scanResult.BSSID;
            String string5 = l0.f(scanResult);
            List list = wifiManager.getConfiguredNetworks();
            if (list == null) {
                return null;
            }
            for (WifiConfiguration wifiConfiguration : list) {
                String string6;
                if (!string4.equals((Object)wifiConfiguration.BSSID) && !string3.equals((Object)wifiConfiguration.SSID) || (string6 = l0.g(wifiConfiguration)) == null || !string6.equals((Object)string5)) continue;
                return wifiConfiguration;
            }
        }
        return null;
    }

    @Nullable
    private static WifiConfiguration i(@NonNull WifiManager wifiManager, @NonNull WifiConfiguration wifiConfiguration) {
        String string2 = wifiConfiguration.SSID;
        if (string2 != null) {
            if (string2.isEmpty()) {
                return null;
            }
            List list = wifiManager.getConfiguredNetworks();
            if (list == null) {
                return null;
            }
            String string3 = wifiConfiguration.BSSID;
            if (string3 == null) {
                string3 = "";
            }
            String string4 = l0.g(wifiConfiguration);
            for (WifiConfiguration wifiConfiguration2 : list) {
                String string5;
                if (!string3.equals((Object)wifiConfiguration2.BSSID) && !string2.equals((Object)wifiConfiguration2.SSID) || (string5 = l0.g(wifiConfiguration2)) == null || !string5.equals((Object)string4)) continue;
                return wifiConfiguration2;
            }
        }
        return null;
    }

    private static /* synthetic */ int j(WifiConfiguration wifiConfiguration, WifiConfiguration wifiConfiguration2) {
        return wifiConfiguration.priority - wifiConfiguration2.priority;
    }

    private static ScanResult k(List<ScanResult> list, String string2) {
        if (string2 != null && list != null) {
            if (list.isEmpty()) {
                return null;
            }
            for (int i5 = 0; i5 < list.size(); ++i5) {
                ScanResult scanResult = (ScanResult)list.get(i5);
                if (!string2.equals((Object)l0.o(scanResult.SSID))) continue;
                return scanResult;
            }
        }
        return null;
    }

    private static int m(@NonNull WifiManager wifiManager) {
        List list = wifiManager.getConfiguredNetworks();
        l0.n((List<WifiConfiguration>)list);
        int n5 = list.size();
        int n6 = 0;
        while (n6 < n5) {
            WifiConfiguration wifiConfiguration = (WifiConfiguration)list.get(n6);
            wifiConfiguration.priority = n6++;
            wifiManager.updateNetwork(wifiConfiguration);
        }
        wifiManager.saveConfiguration();
        return n5;
    }

    private static void n(@NonNull List<WifiConfiguration> list) {
        Collections.sort(list, (Comparator)k0.a);
    }

    @Nullable
    private static String o(@Nullable String string2) {
        if (string2 != null && !string2.isEmpty()) {
            string2 = string2.replaceAll("^\"*", "").replaceAll("\"*$", "");
        }
        return string2;
    }

    private boolean p(WifiManager wifiManager, String string2) {
        if (wifiManager != null) {
            if (string2 == null) {
                return false;
            }
            SystemClock.sleep((long)3000L);
            long l3 = SystemClock.elapsedRealtime();
            while (SystemClock.elapsedRealtime() - l3 < (long)this.b) {
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                if (wifiInfo != null && wifiInfo.getBSSID() != null && wifiInfo.getIpAddress() != 0) {
                    return string2.equals((Object)wifiInfo.getBSSID());
                }
                SystemClock.sleep((long)500L);
            }
        }
        return false;
    }

    public boolean l(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reconnect: ");
        stringBuilder.append(string2);
        Log.d((String)"WiFiReconnectHelper", (String)stringBuilder.toString());
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return false;
        }
        ScanResult scanResult = l0.k((List<ScanResult>)this.a.getScanResults(), string2);
        if (scanResult == null) {
            Log.d((String)"WiFiReconnectHelper", (String)"reconnect: scan result not found!");
            return false;
        }
        WifiConfiguration wifiConfiguration = l0.h(this.a, scanResult);
        if (wifiConfiguration == null) {
            Log.d((String)"WiFiReconnectHelper", (String)"reconnect: wifi config not found!");
            return false;
        }
        if (!l0.b(this.a, wifiConfiguration)) {
            Log.d((String)"WiFiReconnectHelper", (String)"reconnect: connect failed!");
            return false;
        }
        return this.p(this.a, scanResult.BSSID);
    }
}


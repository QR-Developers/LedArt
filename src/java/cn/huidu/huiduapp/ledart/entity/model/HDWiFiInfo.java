/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.wifi.ScanResult
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

import android.net.wifi.ScanResult;
import java.io.Serializable;

public class HDWiFiInfo
implements Serializable {
    public static final int WIFI_TYPE_FC = 1;
    public static final int WIFI_TYPE_OTHER = 0;
    public static final int WIFI_TYPE_SC = 2;
    private String mCapabilities;
    private int mLevel;
    private String mModelName;
    private String mSSID;
    private int mWiFiType;

    public HDWiFiInfo(ScanResult scanResult) {
        this.mSSID = scanResult.SSID;
        this.mLevel = scanResult.level;
        this.mCapabilities = scanResult.capabilities;
    }

    public String getCapabilities() {
        return this.mCapabilities;
    }

    public int getLevel() {
        return this.mLevel;
    }

    public String getModelName() {
        return this.mModelName;
    }

    public String getSSID() {
        return this.mSSID;
    }

    public int getWiFiType() {
        return this.mWiFiType;
    }

    public void setCapabilities(String string) {
        this.mCapabilities = string;
    }

    public void setLevel(int n2) {
        this.mLevel = n2;
    }

    public void setModelName(String string) {
        this.mModelName = string;
    }

    public void setSSID(String string) {
        this.mSSID = string;
    }

    public void setWiFiType(int n2) {
        this.mWiFiType = n2;
    }
}


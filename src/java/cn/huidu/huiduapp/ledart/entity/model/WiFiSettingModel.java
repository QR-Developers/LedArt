/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

import android.text.TextUtils;

public class WiFiSettingModel {
    public APModel ap;
    public StationModel station;

    public static boolean isTextEqual(String string, String string2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return TextUtils.isEmpty((CharSequence)string2);
        }
        return string.equals((Object)string2);
    }

    public static class APModel {
        public String ip;
        public String netmask;
        public String password;
        public String ssid;

        public boolean equals(APModel aPModel) {
            return aPModel != null && WiFiSettingModel.isTextEqual(aPModel.ssid, this.ssid) && WiFiSettingModel.isTextEqual(aPModel.password, this.password) && WiFiSettingModel.isTextEqual(aPModel.ip, this.ip) && WiFiSettingModel.isTextEqual(aPModel.netmask, this.netmask);
        }
    }

    public static class StationModel {
        public String enable;
        public String password;
        public String ssid;
        public Integer status;

        public boolean equals(StationModel stationModel) {
            return stationModel != null && WiFiSettingModel.isTextEqual(stationModel.enable, this.enable) && WiFiSettingModel.isTextEqual(stationModel.ssid, this.ssid) && WiFiSettingModel.isTextEqual(stationModel.password, this.password);
        }
    }

}


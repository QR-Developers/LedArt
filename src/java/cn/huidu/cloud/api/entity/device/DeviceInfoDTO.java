/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  y4.c
 */
package cn.huidu.cloud.api.entity.device;

import java.util.List;
import y4.c;

public class DeviceInfoDTO {
    public Object details;
    public boolean isOnline;
    public float lat;
    public float lng;
    public String name;
    public String sn;
    public int state;
    public int type;

    public static class BrightnessInfo {
        public List<BrightnessSetting> custom;
        public int fixed;
        public String mode;
    }

    public static class BrightnessSetting {
        public String end;
        public String start;
        public int value;
    }

    public static class EnableTimerInfo {
        public boolean enable;
        public String time;
    }

    public static class FCDetails {
        public BrightnessInfo brightness;
        public int cpuType;
        public String fpgaVersion;
        public HdmiInfo hdmi;
        public int height;
        public int keyMode;
        public Float lat;
        public Float lng;
        public boolean locked;
        public int mutliScreenSync;
        public int networkAccess;
        public int playMode;
        public List<RelayInfo> relay;
        public int rotation;
        public Integer state;
        public StorageInfo storage;
        @c(value="switch")
        public List<OnOffSetting> switchInfo;
        public TimeInfo time;
        public String version;
        public int volume;
        public int width;
        public WirelessInfo wirelessInfo;
    }

    public static class FaceDetectInfo {
        public int cameraCount;
        public boolean countVisitors;
        public boolean enable;
        public FaceDetectPreviewInfo preview;
        public int reportInterval;
        public boolean reportVisitors;
    }

    public static class FaceDetectPreviewInfo {
        public String alignment;
        public int height;
        public boolean showFaceInfo;
        public boolean showFaceRect;
        public boolean showVisitors;
        public int width;
    }

    public static class GPSInfo {
        public int acquisitionCycle;
        public boolean realTime;
        public int reportingCycle;
    }

    public static class HdmiInfo {
        public boolean hdmiFirst;
        public List<HdmiSetting> time;
    }

    public static class HdmiSetting {
        public String end;
        public String start;
    }

    public static class LCDDetails {
        public BrightnessInfo brightness;
        public String cpu;
        public int cpuType;
        public LcdEthernetInfo ethernet;
        public FaceDetectInfo faceDetect;
        public String heartbeatTime;
        public int height;
        public Float lat;
        public Float lng;
        public boolean locked;
        public boolean multiScreenSync;
        public int networkAccess;
        public EnableTimerInfo playLog;
        public String ram;
        public EnableTimerInfo restartTimer;
        public String rom;
        public int rotation;
        public int state;
        public StorageInfo storage;
        @c(value="switch")
        public List<OnOffSetting> switchInfo;
        public long syncTime;
        public TimeInfo time;
        public long uptime;
        public String version;
        public LcdVersionInfo versionInfo;
        public int volume;
        public int width;
        public WifiInfo wifi;
    }

    public static class LcdEthernetInfo {
        public boolean dhcp;
        public String dns;
        public String gateway;
        public String ip;
        public String mac;
        public String mask;
    }

    public static class LcdVersionInfo {
        public String android;
        public long buildTime;
        public String kernel;
        public String magicPlayer;
        public String programList;
        public int sdk;
        public String settings;
    }

    public static class OnOffSetting {
        public String off;
        public String on;
    }

    public static class Position {
        public float lat;
        public float lng;
    }

    public static class RealTimeInfo {
        public Position position;
        public int state;
        public String time;
    }

    public static class RelayInfo {
        public String name;
        public int state;
        public boolean syncSwitch;
        public List<OnOffSetting> time;
    }

    public static class SCDetails {
        public BrightnessInfo brightness;
        public int height;
        public boolean locked;
        public int playMode;
        public int state;
        @c(value="switch")
        public List<OnOffSetting> switchInfo;
        public int type;
        public String version;
        public int width;
    }

    public static class StorageInfo {
        public long free;
        public long total;
    }

    public static class TimeInfo {
        public boolean dst;
        public String server;
        public String sync;
        public String timeZone;
    }

    public static class WifiApInfo {
        public boolean enable;
        public String password;
        public String ssid;
    }

    public static class WifiInfo {
        public WifiApInfo ap;
        public String mode;
        public WifiStationInfo station;
    }

    public static class WifiStationInfo {
        public boolean dhcp;
        public String dns;
        public boolean enable;
        public String gateway;
        public String ip;
        public String mac;
        public String mask;
        public String ssid;
    }

    public static class WirelessInfo {
        public String ICCID;
        public String IMEI;
        public String IMSI;
        public int db;
        public String manufacturer;
        public String module;
        public int networkType;
        public String operator;
        public boolean simcard;
        public int singalStrength;
        public int status;
        public String version;
    }

}


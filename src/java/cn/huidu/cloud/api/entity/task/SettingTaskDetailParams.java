/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.ArrayList
 *  y4.c
 */
package cn.huidu.cloud.api.entity.task;

import cn.huidu.cloud.api.entity.device.DeviceInfoDTO;
import cn.huidu.cloud.api.entity.task.TimeTaskParams;
import java.util.ArrayList;
import y4.c;

public class SettingTaskDetailParams {
    public DeviceInfoDTO.BrightnessInfo brightness;
    public DeviceInfoDTO.FaceDetectInfo faceDetect;
    public DeviceInfoDTO.GPSInfo gps;
    public DeviceInfoDTO.HdmiInfo hdmi;
    public Integer heartbeat;
    public Boolean multiScreenSync;
    public DeviceInfoDTO.EnableTimerInfo playLogReport;
    public Integer playMode;
    public DeviceInfoDTO.RealTimeInfo realtime;
    public DeviceInfoDTO.RelayInfo relay;
    public DeviceInfoDTO.EnableTimerInfo restartTimer;
    @c(value="switch")
    public ArrayList<DeviceInfoDTO.OnOffSetting> switchList;
    public TimeTaskParams time;
    public Integer volume;
}


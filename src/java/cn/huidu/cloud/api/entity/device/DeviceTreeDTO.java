/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package cn.huidu.cloud.api.entity.device;

import cn.huidu.cloud.api.entity.device.DeviceSummaryDTO;
import java.util.List;

public class DeviceTreeDTO {
    public List<DeviceTreeDTO> children;
    public List<DeviceSummaryDTO> devices;
    public int id;
    public String title;
    public int total;
}


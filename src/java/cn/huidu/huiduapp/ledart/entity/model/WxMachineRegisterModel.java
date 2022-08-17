/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class WxMachineRegisterModel {
    public String information;
    public String machineId;
    public String system;
    public String wechatOpenid;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WxMachineRegisterModel{machineId='");
        stringBuilder.append(this.machineId);
        stringBuilder.append('\'');
        stringBuilder.append(", wechatOpenid='");
        stringBuilder.append(this.wechatOpenid);
        stringBuilder.append('\'');
        stringBuilder.append(", system='");
        stringBuilder.append(this.system);
        stringBuilder.append('\'');
        stringBuilder.append(", information='");
        stringBuilder.append(this.information);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


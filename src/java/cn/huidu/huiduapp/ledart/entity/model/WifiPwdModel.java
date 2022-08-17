/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

import java.io.Serializable;

public class WifiPwdModel
implements Serializable {
    private String date;
    private String pwd;
    private String ssid;

    public WifiPwdModel(String string, String string2) {
        this.pwd = string;
        this.date = string2;
    }

    public WifiPwdModel(String string, String string2, String string3) {
        this.ssid = string;
        this.pwd = string2;
        this.date = string3;
    }

    public String getDate() {
        return this.date;
    }

    public String getPwd() {
        return this.pwd;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setDate(String string) {
        this.date = string;
    }

    public void setPwd(String string) {
        this.pwd = string;
    }

    public void setSsid(String string) {
        this.ssid = string;
    }
}


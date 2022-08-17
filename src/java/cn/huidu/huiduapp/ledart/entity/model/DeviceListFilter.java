/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.entity.model;

import java.io.Serializable;

public class DeviceListFilter
implements Serializable {
    public static final int DEVICE_TYPE_ALL = 0;
    public static final int DEVICE_TYPE_FC = 2;
    public static final int DEVICE_TYPE_LC = 3;
    public static final int DEVICE_TYPE_SC = 1;
    private int mDeviceType;
    private boolean mOnline;
    private boolean mSupportIsXR809 = true;
    private boolean mSupportRemoteCtrl;
    private boolean mSupportThrow;
    private boolean mSupportVideo;
    private boolean mSupportWiFi;

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public boolean isOnline() {
        return this.mOnline;
    }

    public boolean isSupportRemoteCtrl() {
        return this.mSupportRemoteCtrl;
    }

    public boolean isSupportThrow() {
        return this.mSupportThrow;
    }

    public boolean isSupportVideo() {
        return this.mSupportVideo;
    }

    public boolean isSupportWiFi() {
        return this.mSupportWiFi;
    }

    public boolean isSupportXR809() {
        return this.mSupportIsXR809;
    }

    public void setDeviceType(int n2) {
        this.mDeviceType = n2;
    }

    public void setOnline(boolean bl) {
        this.mOnline = bl;
    }

    public void setSupportRemoteCtrl(boolean bl) {
        this.mSupportRemoteCtrl = bl;
    }

    public void setSupportThrow(boolean bl) {
        this.mSupportThrow = bl;
    }

    public void setSupportVideo(boolean bl) {
        this.mSupportVideo = bl;
    }

    public void setSupportWiFi(boolean bl) {
        this.mSupportWiFi = bl;
    }

    public void setSupportXR809(boolean bl) {
        this.mSupportIsXR809 = bl;
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.lcd.transmit.adapter.LCMultiScreenSyncInfo
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

import cn.huidu.lcd.transmit.adapter.LCMultiScreenSyncInfo;

public class LCSetTimeSendModel {
    private String mCardId;
    private LCMultiScreenSyncInfo mScreenSyncInfo;

    public String getCardId() {
        return this.mCardId;
    }

    public LCMultiScreenSyncInfo getScreenSyncInfo() {
        return this.mScreenSyncInfo;
    }

    public void setCardId(String string) {
        this.mCardId = string;
    }

    public void setScreenSyncInfo(LCMultiScreenSyncInfo lCMultiScreenSyncInfo) {
        this.mScreenSyncInfo = lCMultiScreenSyncInfo;
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.huidu.applibs.common.model.CardConfig
 *  com.huidu.applibs.entity.a
 *  com.huidu.applibs.entity.d
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

import com.huidu.applibs.common.model.CardConfig;
import com.huidu.applibs.entity.a;
import com.huidu.applibs.entity.d;

public class CardForSendModel {
    public static final int STATE_FOR_SEND = 0;
    public static final int STATE_OFFLINE = 1;
    public static final int STATE_RESEND = 5;
    public static final int STATE_SENDING = 2;
    public static final int STATE_SEND_FAILED = 3;
    public static final int STATE_SEND_SUCCESS = 4;
    private boolean isOnline;
    private String mCardId;
    private String mCardIp;
    private String mCardModel;
    private String mCardName;
    private int mErrorCode;
    private String mErrorMessage;
    private String mFirmwareVersion;
    private int mHeight;
    private String mPassword;
    private String mPlayTaskId;
    private float mProgress;
    private int mState;
    private int mWidth;

    public static CardForSendModel fromCard(CardConfig cardConfig) {
        CardForSendModel cardForSendModel = new CardForSendModel();
        cardForSendModel.mCardName = cardConfig.getCardName();
        cardForSendModel.mCardId = cardConfig.getCardId();
        cardForSendModel.mCardIp = cardConfig.getIp();
        cardForSendModel.mCardModel = cardConfig.getModelName();
        cardForSendModel.mFirmwareVersion = cardConfig.getFirmwareVersion();
        if (cardConfig.getIsOnline().equals((Object)"true")) {
            cardForSendModel.isOnline = true;
        } else if (cardConfig.getIsOnline().equals((Object)"false")) {
            cardForSendModel.isOnline = false;
        }
        cardForSendModel.mWidth = cardConfig.getWidth();
        cardForSendModel.mHeight = cardConfig.getHeight();
        if ("true".equals((Object)cardConfig.getIsOnline())) {
            cardForSendModel.mState = 0;
            return cardForSendModel;
        }
        cardForSendModel.mState = 1;
        return cardForSendModel;
    }

    public static CardForSendModel fromCard(a a2) {
        CardForSendModel cardForSendModel = new CardForSendModel();
        cardForSendModel.mCardName = a2.getName();
        cardForSendModel.mCardId = a2.getCardId();
        cardForSendModel.mCardIp = a2.getIpAddress();
        cardForSendModel.mCardModel = a2.getModelName();
        cardForSendModel.mFirmwareVersion = a2.getVersion();
        cardForSendModel.isOnline = a2.isOnline();
        cardForSendModel.mWidth = a2.getSize().b();
        cardForSendModel.mHeight = a2.getSize().a();
        if (a2.isOnline()) {
            cardForSendModel.mState = 0;
            return cardForSendModel;
        }
        cardForSendModel.mState = 1;
        return cardForSendModel;
    }

    public String getCardId() {
        return this.mCardId;
    }

    public String getCardIp() {
        return this.mCardIp;
    }

    public String getCardModel() {
        return this.mCardModel;
    }

    public String getCardName() {
        return this.mCardName;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public String getFirmwareVersion() {
        return this.mFirmwareVersion;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public String getPassword() {
        return this.mPassword;
    }

    public String getPlayTaskId() {
        return this.mPlayTaskId;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public int getState() {
        return this.mState;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public void setCardId(String string) {
        this.mCardId = string;
    }

    public void setCardIp(String string) {
        this.mCardIp = string;
    }

    public void setCardModel(String string) {
        this.mCardModel = string;
    }

    public void setCardName(String string) {
        this.mCardName = string;
    }

    public void setErrorCode(int n2) {
        this.mErrorCode = n2;
    }

    public void setErrorMessage(String string) {
        this.mErrorMessage = string;
    }

    public void setFirmwareVersion(String string) {
        this.mFirmwareVersion = string;
    }

    public void setHeight(int n2) {
        this.mHeight = n2;
    }

    public void setOnline(boolean bl) {
        this.isOnline = bl;
    }

    public void setPassword(String string) {
        this.mPassword = string;
    }

    public void setPlayTaskId(String string) {
        this.mPlayTaskId = string;
    }

    public void setProgress(float f2) {
        this.mProgress = f2;
    }

    public void setState(int n2) {
        this.mState = n2;
    }

    public void setWidth(int n2) {
        this.mWidth = n2;
    }
}


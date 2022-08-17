/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 */
package cn.huidu.huiduapp.ledart.entity.model;

import java.util.Date;

public class ProgramInfo {
    private String mCardModel;
    private int mCardType;
    private int mColorLevel;
    private int mGrayLevel;
    private int mHeight;
    private String mProgramId;
    private String mProgramName;
    private Date mUpdateTime;
    private int mWidth;

    public String getCardModel() {
        return this.mCardModel;
    }

    public int getCardType() {
        return this.mCardType;
    }

    public int getColorLevel() {
        return this.mColorLevel;
    }

    public int getGrayLevel() {
        return this.mGrayLevel;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public String getProgramId() {
        return this.mProgramId;
    }

    public String getProgramName() {
        return this.mProgramName;
    }

    public Date getUpdateTime() {
        return this.mUpdateTime;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setCardModel(String string) {
        this.mCardModel = string;
    }

    public void setCardType(int n2) {
        this.mCardType = n2;
    }

    public void setColorLevel(int n2) {
        this.mColorLevel = n2;
    }

    public void setGrayLevel(int n2) {
        this.mGrayLevel = n2;
    }

    public void setHeight(int n2) {
        this.mHeight = n2;
    }

    public void setProgramId(String string) {
        this.mProgramId = string;
    }

    public void setProgramName(String string) {
        this.mProgramName = string;
    }

    public void setUpdateTime(Date date) {
        this.mUpdateTime = date;
    }

    public void setWidth(int n2) {
        this.mWidth = n2;
    }
}


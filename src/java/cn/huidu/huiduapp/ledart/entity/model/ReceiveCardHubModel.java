/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class ReceiveCardHubModel {
    private boolean mChecked;
    private boolean mEnable;
    private String mMode;
    private String mRgb;

    public String getMode() {
        return this.mMode;
    }

    public String getRgb() {
        return this.mRgb;
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public void setChecked(boolean bl) {
        this.mChecked = bl;
    }

    public void setEnable(boolean bl) {
        this.mEnable = bl;
    }

    public void setMode(String string) {
        this.mMode = string;
    }

    public void setRgb(String string) {
        this.mRgb = string;
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class NumberModel {
    private boolean mHighlight;
    private int mNum;
    private boolean mSelectState;

    public int getNum() {
        return this.mNum;
    }

    public boolean isHighlight() {
        return this.mHighlight;
    }

    public boolean isSelectState() {
        return this.mSelectState;
    }

    public void setHighlight(boolean bl) {
        this.mHighlight = bl;
    }

    public void setNum(int n2) {
        this.mNum = n2;
    }

    public void setSelectState(boolean bl) {
        this.mSelectState = bl;
    }
}


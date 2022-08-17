/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class CustomGammaModel {
    private boolean mIsValueItem;
    private boolean mSelectedState;
    private int mValue;

    public String getHexadecimalStr() {
        String string = Integer.toHexString((int)this.mValue);
        while (string.length() < 4) {
            string = String.format((String)"0%s", (Object[])new Object[]{string});
        }
        return string;
    }

    public int getValue() {
        return this.mValue;
    }

    public boolean isSelectedState() {
        return this.mSelectedState;
    }

    public boolean isValueItem() {
        return this.mIsValueItem;
    }

    public void setSelectedState(boolean bl) {
        this.mSelectedState = bl;
    }

    public void setValue(int n2) {
        this.mValue = n2;
    }

    public void setValueItem(boolean bl) {
        this.mIsValueItem = bl;
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class UniversalFoldModel {
    private boolean mChecked;
    private int mCount;
    private Object mData;
    private String mName;
    private int mViewType;
    private boolean mVisible;

    public int getCount() {
        return this.mCount;
    }

    public Object getData() {
        return this.mData;
    }

    public String getName() {
        return this.mName;
    }

    public int getViewType() {
        return this.mViewType;
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public boolean isVisible() {
        return this.mVisible;
    }

    public void setChecked(boolean bl) {
        this.mChecked = bl;
    }

    public void setCount(int n2) {
        this.mCount = n2;
    }

    public void setData(Object object) {
        this.mData = object;
    }

    public void setName(String string) {
        this.mName = string;
    }

    public void setViewType(int n2) {
        this.mViewType = n2;
    }

    public void setVisible(boolean bl) {
        this.mVisible = bl;
    }
}


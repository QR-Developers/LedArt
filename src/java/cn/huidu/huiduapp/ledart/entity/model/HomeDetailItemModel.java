/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  z0.c
 */
package cn.huidu.huiduapp.ledart.entity.model;

import z0.c;

public class HomeDetailItemModel {
    private Integer backgroundResId;
    private c itemType;
    private Integer resId;
    private Integer stringId;
    private Integer viewType;

    public HomeDetailItemModel(Integer n2) {
        this.backgroundResId = n2;
    }

    public HomeDetailItemModel(c c2, Integer n2, Integer n3, Integer n4, Integer n5) {
        this.itemType = c2;
        this.backgroundResId = n2;
        this.resId = n3;
        this.stringId = n4;
        this.viewType = n5;
    }

    public Integer getBackgroundResId() {
        return this.backgroundResId;
    }

    public c getItemType() {
        return this.itemType;
    }

    public Integer getResId() {
        return this.resId;
    }

    public Integer getStringId() {
        return this.stringId;
    }

    public Integer getViewType() {
        return this.viewType;
    }

    public void setBackgroundResId(Integer n2) {
        this.backgroundResId = n2;
    }

    public void setItemType(c c2) {
        this.itemType = c2;
    }

    public void setResId(Integer n2) {
        this.resId = n2;
    }

    public void setStringId(Integer n2) {
        this.stringId = n2;
    }

    public void setViewType(Integer n2) {
        this.viewType = n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HomeDetailItemModel{itemType=");
        stringBuilder.append((Object)this.itemType);
        stringBuilder.append(", backgroundResId=");
        stringBuilder.append((Object)this.backgroundResId);
        stringBuilder.append(", resId=");
        stringBuilder.append((Object)this.resId);
        stringBuilder.append(", stringId=");
        stringBuilder.append((Object)this.stringId);
        stringBuilder.append(", viewType=");
        stringBuilder.append((Object)this.viewType);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


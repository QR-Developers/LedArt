/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.singlecolor.model.Node
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

import cn.huidu.singlecolor.model.Node;

public class FirstMenuItemModel {
    private boolean mCanDelete;
    private Node mNode;
    private boolean mSelectedState;
    private String mTxtName;

    public FirstMenuItemModel(String string, boolean bl, boolean bl2, Node node) {
        this.mTxtName = string;
        this.mCanDelete = bl;
        this.mSelectedState = bl2;
        this.mNode = node;
    }

    public Node getNode() {
        return this.mNode;
    }

    public String getTxtName() {
        return this.mTxtName;
    }

    public boolean isCanDelete() {
        return this.mCanDelete;
    }

    public boolean isSelectedState() {
        return this.mSelectedState;
    }

    public void setCanDelete(boolean bl) {
        this.mCanDelete = bl;
    }

    public void setSelectedState(boolean bl) {
        this.mSelectedState = bl;
    }
}


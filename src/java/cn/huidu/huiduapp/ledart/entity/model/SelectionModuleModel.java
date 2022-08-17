/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

import java.io.Serializable;

public class SelectionModuleModel
implements Serializable {
    private String mModuleName;
    private boolean mSelectState;

    public String getModuleName() {
        return this.mModuleName;
    }

    public boolean isSelectState() {
        return this.mSelectState;
    }

    public void setModuleName(String string) {
        this.mModuleName = string;
    }

    public void setSelectState(boolean bl) {
        this.mSelectState = bl;
    }
}


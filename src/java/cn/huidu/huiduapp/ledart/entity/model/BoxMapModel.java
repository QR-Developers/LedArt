/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package cn.huidu.huiduapp.ledart.entity.model;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BoxMapModel {
    private int mBoxHeight;
    private List<Rect> mBoxList;
    private int mBoxWidth;
    private boolean mChecked;
    private int mColumnCount;
    private int mConnectionType;
    private int mPortNum;
    private int mRowCount;

    public int getBoxHeight() {
        return this.mBoxHeight;
    }

    public List<Rect> getBoxList() {
        if (this.mBoxList == null) {
            this.mBoxList = new ArrayList();
        }
        return this.mBoxList;
    }

    public int getBoxWidth() {
        return this.mBoxWidth;
    }

    public int getColumnCount() {
        return this.mColumnCount;
    }

    public int getConnectionType() {
        return this.mConnectionType;
    }

    public int getPortNum() {
        return this.mPortNum;
    }

    public int getRowCount() {
        return this.mRowCount;
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public void setBoxHeight(int n2) {
        this.mBoxHeight = n2;
    }

    public void setBoxList(List<Rect> list) {
        List<Rect> list2 = this.mBoxList;
        if (list2 != null && list != null) {
            list2.clear();
            this.mBoxList.addAll(list);
            return;
        }
        this.mBoxList = list;
    }

    public void setBoxWidth(int n2) {
        this.mBoxWidth = n2;
    }

    public void setChecked(boolean bl) {
        this.mChecked = bl;
    }

    public void setColumnCount(int n2) {
        this.mColumnCount = n2;
    }

    public void setConnectionType(int n2) {
        this.mConnectionType = n2;
    }

    public void setPortNum(int n2) {
        this.mPortNum = n2;
    }

    public void setRowCount(int n2) {
        this.mRowCount = n2;
    }
}


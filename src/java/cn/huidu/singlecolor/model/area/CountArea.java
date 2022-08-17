/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.singlecolor.model.Node
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.singlecolor.model.area;

import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.Node;
import cn.huidu.singlecolor.model.Widget;
import cn.huidu.singlecolor.model.widget.Count;

public class CountArea
extends Area<Count> {
    @Override
    public CountArea copy() {
        CountArea countArea = new CountArea();
        this.copyTo(countArea);
        countArea.setCount((Count)this.getCount().copy());
        return countArea;
    }

    @Override
    protected Count createChild(String string) {
        return new Count();
    }

    public Count getCount() {
        return (Count)this.getChild(0);
    }

    @Override
    public boolean isChildType(Object object) {
        return object instanceof Count;
    }

    public void setCount(Count count) {
        this.removeAllChild();
        this.addChild((Node)count);
    }
}


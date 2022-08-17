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
import cn.huidu.singlecolor.model.widget.Image;

public class ImageArea
extends Area<Image> {
    @Override
    public ImageArea copy() {
        ImageArea imageArea = new ImageArea();
        this.copyTo(imageArea);
        for (int j = 0; j < this.childCount(); ++j) {
            imageArea.addChild((Node)((Image)this.getChild(j)).copy());
        }
        return imageArea;
    }

    @Override
    protected Image createChild(String string) {
        return new Image();
    }

    @Override
    public boolean isChildType(Object object) {
        return object instanceof Image;
    }
}


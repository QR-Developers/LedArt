/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.singlecolor.model.Node
 *  cn.huidu.singlecolor.model.effect.Background
 *  cn.huidu.singlecolor.model.effect.Border
 *  cn.huidu.singlecolor.model.effect.ExtBackground
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.singlecolor.model;

import cn.huidu.singlecolor.model.Node;
import cn.huidu.singlecolor.model.Widget;
import cn.huidu.singlecolor.model.effect.Background;
import cn.huidu.singlecolor.model.effect.Border;
import cn.huidu.singlecolor.model.effect.ExtBackground;

public abstract class Area<T extends Widget>
extends Node<T> {
    public static final int MIN_HEIGHT = 8;
    public static final int MIN_WIDTH = 8;
    public Background background = new Background();
    public Border border = new Border();
    public ExtBackground extBackground = new ExtBackground();
    public int height;
    public int id;
    public boolean isUnifiedAnimEffect = false;
    public int margin;
    public int width;
    public int x;
    public int y;

    public abstract Area copy();

    public void copyTo(Area area) {
        ExtBackground extBackground;
        Background background;
        area.id = this.id;
        area.x = this.x;
        area.y = this.y;
        area.width = this.width;
        area.height = this.height;
        area.margin = this.margin;
        area.isUnifiedAnimEffect = this.isUnifiedAnimEffect;
        Border border = this.border;
        if (border != null) {
            area.border = border.copy();
        }
        if ((background = this.background) != null) {
            area.background = background.copy();
        }
        if ((extBackground = this.extBackground) != null) {
            area.extBackground = extBackground.copy();
        }
    }

    protected abstract T createChild(String var1);

    public int getBorderSize() {
        Border border = this.border;
        if (border.enable) {
            return border.size;
        }
        return 0;
    }

    public int getContentHeight() {
        int n2 = this.getBorderSize();
        int n3 = this.height - n2 * 2;
        if (n3 <= 0) {
            n3 = 1;
        }
        return n3;
    }

    public int getContentWidth() {
        int n2 = this.getBorderSize();
        int n3 = this.width - n2 * 2;
        if (n3 <= 0) {
            n3 = 1;
        }
        return n3;
    }

    public boolean isChildType(Object object) {
        return object instanceof Widget;
    }

    public void setRect(int n2, int n3, int n4, int n5) {
        this.x = n2;
        this.y = n3;
        this.width = n4;
        this.height = n5;
    }
}


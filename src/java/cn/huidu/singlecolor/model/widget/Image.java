/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.singlecolor.model.effect.Effects
 *  java.lang.String
 */
package cn.huidu.singlecolor.model.widget;

import cn.huidu.singlecolor.model.Widget;
import cn.huidu.singlecolor.model.effect.Effects;

public class Image
extends Widget {
    public boolean drawNeonGif;
    public Effects effects = new Effects();
    public boolean isAsset = false;
    public boolean isGif = false;
    public String path;

    @Override
    public Image copy() {
        Image image = new Image();
        image.path = this.path;
        image.effects = this.effects.copy();
        image.isGif = this.isGif;
        image.isAsset = this.isAsset;
        return image;
    }
}


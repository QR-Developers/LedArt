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
import cn.huidu.singlecolor.model.widget.AnimationWord;

public class AnimationWordArea
extends Area<AnimationWord> {
    @Override
    public Area copy() {
        AnimationWordArea animationWordArea = new AnimationWordArea();
        this.copyTo(animationWordArea);
        animationWordArea.setAnimationWord((AnimationWord)this.getAnimationWord().copy());
        return animationWordArea;
    }

    @Override
    protected AnimationWord createChild(String string) {
        return new AnimationWord();
    }

    public AnimationWord getAnimationWord() {
        return (AnimationWord)this.getChild(0);
    }

    @Override
    public boolean isChildType(Object object) {
        return object instanceof AnimationWord;
    }

    public void setAnimationWord(AnimationWord animationWord) {
        this.removeAllChild();
        this.addChild((Node)animationWord);
    }
}


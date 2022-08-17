/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.String
 *  t5.a
 */
package cn.huidu.singlecolor.model.widget;

import android.content.Context;
import cn.huidu.singlecolor.model.Widget;
import t5.a;

public class AnimationWord
extends Widget {
    public int align = 1;
    public boolean bold = false;
    public int centerCorrection = 0;
    public String content = "";
    public int effectSpeed = 5;
    public int effectType = 0;
    public int fontColor = -65536;
    public String fontName = "Arial";
    public int fontSize = 24;
    public int frameCount = 30;
    public int holdTime = 1;
    public boolean hollow = false;
    public boolean italic = false;
    public int letterSpacing = 0;
    public int playCount = 5;
    public boolean underline = false;

    public static AnimationWord newInstance(Context context) {
        AnimationWord animationWord = new AnimationWord();
        animationWord.fontName = new a(context).a("Arial");
        return animationWord;
    }

    @Override
    public AnimationWord copy() {
        AnimationWord animationWord = new AnimationWord();
        animationWord.content = this.content;
        animationWord.fontName = this.fontName;
        animationWord.fontSize = this.fontSize;
        animationWord.fontColor = this.fontColor;
        animationWord.bold = this.bold;
        animationWord.italic = this.italic;
        animationWord.underline = this.underline;
        animationWord.align = this.align;
        animationWord.effectType = this.effectType;
        animationWord.effectSpeed = this.effectSpeed;
        animationWord.hollow = this.hollow;
        animationWord.playCount = this.playCount;
        animationWord.letterSpacing = this.letterSpacing;
        animationWord.centerCorrection = this.centerCorrection;
        return animationWord;
    }

    public boolean isContinuousEffect() {
        int n = this.effectType;
        return n == 202 || n == 203 || n == 204;
        {
        }
    }
}


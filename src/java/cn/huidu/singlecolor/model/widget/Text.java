/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  cn.huidu.singlecolor.model.effect.Effects
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Locale
 *  t5.a
 */
package cn.huidu.singlecolor.model.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import cn.huidu.singlecolor.model.Widget;
import cn.huidu.singlecolor.model.effect.Effects;
import java.util.Locale;
import t5.a;

public class Text
extends Widget {
    public int align = 769;
    public int bgColor = -16777216;
    public boolean bold = false;
    public int canvasRotate = 0;
    public int centerCorrection = 0;
    public String content = "";
    public Effects effects = new Effects();
    public int fontColor = -65536;
    public int[] fontColors;
    public String fontName = "Arial";
    public int fontSize = 24;
    public boolean italic = false;
    public int letterSpacing = 0;
    public int lineCount = 1;
    public int lineSpacing = 0;
    public boolean mirror = false;
    public boolean reverseOrder = false;
    public int rotate = 0;
    public boolean underline = false;
    public int xElongate = 0;
    public int yElongate = 0;

    public static Text newInstance(Context context) {
        Text text = new Text();
        text.content = "zh".equals((Object)context.getResources().getConfiguration().locale.getLanguage()) ? "\u8bf7\u8f93\u5165" : "Please enter";
        text.fontName = new a(context).a("Arial");
        return text;
    }

    @Override
    public Text copy() {
        Text text = new Text();
        text.content = this.content;
        text.fontName = this.fontName;
        text.fontSize = this.fontSize;
        text.fontColor = this.fontColor;
        text.bgColor = this.bgColor;
        text.bold = this.bold;
        text.italic = this.italic;
        text.underline = this.underline;
        int[] arrn = this.fontColors;
        if (arrn != null) {
            int[] arrn2 = new int[arrn.length];
            text.fontColors = arrn2;
            System.arraycopy((Object)this.fontColors, (int)0, (Object)arrn2, (int)0, (int)arrn2.length);
        }
        text.align = this.align;
        text.lineCount = this.lineCount;
        text.rotate = this.rotate;
        text.canvasRotate = this.canvasRotate;
        text.letterSpacing = this.letterSpacing;
        text.lineSpacing = this.lineSpacing;
        text.xElongate = this.xElongate;
        text.yElongate = this.yElongate;
        text.centerCorrection = this.centerCorrection;
        text.mirror = this.mirror;
        text.reverseOrder = this.reverseOrder;
        text.effects = this.effects.copy();
        return text;
    }

    public CharSequence getAttributeText() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.content);
        r2.a.b((CharSequence)spannableStringBuilder, this.fontColor, this.fontColors);
        return spannableStringBuilder;
    }

    public int getHorizontalAlign() {
        return 255 & this.align;
    }

    public int getVerticalAlign() {
        return 65280 & this.align;
    }

    public void setAttributeText(CharSequence charSequence) {
        this.content = charSequence.toString();
        this.fontColors = r2.a.a(charSequence, this.fontColor, this.fontColors);
    }

    public void setHorizontalAlign(int n) {
        this.align = n | 65280 & this.align;
    }

    public void setTextColor(int n) {
        this.fontColor = n;
        this.fontColors = null;
    }

    public void setTextColor(int n, int n2, int n3) {
        if (!TextUtils.isEmpty((CharSequence)this.content) && n2 < n3) {
            int[] arrn = this.fontColors;
            if (arrn == null || arrn.length != this.content.length()) {
                int[] arrn2;
                this.fontColors = new int[this.content.length()];
                for (int j = 0; j < (arrn2 = this.fontColors).length; ++j) {
                    arrn2[j] = this.fontColor;
                }
            }
            while (n2 < n3) {
                int[] arrn3;
                if (n2 >= 0 && n2 < (arrn3 = this.fontColors).length) {
                    arrn3[n2] = n;
                }
                ++n2;
            }
            return;
        }
        this.setTextColor(n);
    }

    public void setVerticalAlign(int n) {
        this.align = n | 255 & this.align;
    }
}


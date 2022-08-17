/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 *  w8.b
 */
package cn.huidu.singlecolor.model.widget;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import cn.huidu.singlecolor.model.Widget;
import java.util.Locale;
import w8.b;

public class Count
extends Widget {
    public int alignType = 2;
    public int countColor = -65536;
    public float countEnd = 999.0f;
    public float countStart = 0.0f;
    public String countTitle;
    public int decimalPlaces = 0;
    public int fontSize = 15;
    public boolean lastCount = false;
    public float stepping = 1.0f;
    public int titleColor = -65536;
    public int titlePositionX = 0;
    public int titlePositionY = 0;
    public int type = 0;
    public transient Typeface typeface;

    public Count() {
        if ("zh".equals((Object)b.a().getResources().getConfiguration().locale.getLanguage())) {
            this.countTitle = "\u8ba1\u6570";
            return;
        }
        this.countTitle = "Count";
    }

    @Override
    public Count copy() {
        Count count = new Count();
        count.type = this.type;
        count.countTitle = this.countTitle;
        count.titleColor = this.titleColor;
        count.decimalPlaces = this.decimalPlaces;
        count.stepping = this.stepping;
        count.countStart = this.countStart;
        count.countEnd = this.countEnd;
        count.countColor = this.countColor;
        count.lastCount = this.lastCount;
        count.alignType = this.alignType;
        count.titlePositionX = this.titlePositionX;
        count.titlePositionY = this.titlePositionY;
        count.typeface = this.typeface;
        return count;
    }
}


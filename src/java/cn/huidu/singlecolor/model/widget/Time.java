/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.sql.Date
 *  java.util.Date
 *  java.util.Locale
 *  w8.b
 */
package cn.huidu.singlecolor.model.widget;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import cn.huidu.singlecolor.model.Widget;
import java.util.Date;
import java.util.Locale;
import m5.k;
import w8.b;

public class Time
extends Widget {
    public int alignType = 2;
    public boolean cycleTime = false;
    public long dateStamp = k.q(true) / 1000L;
    public long effectiveDateStamp = 0L;
    public int effectiveTimeStamp = 0;
    public int fontSize = 15;
    public boolean showDay = true;
    public boolean showHour = true;
    public boolean showMinute = true;
    public boolean showMs = false;
    public boolean showSecond = true;
    public boolean timeAccumulation = false;
    public int timeColor = -65536;
    public int timeStamp = k.o((Date)new java.sql.Date(System.currentTimeMillis()));
    public int timeStyle = 0;
    public String timeTitle;
    public int timeTitleColor = -65536;
    public int titlePositionX = 0;
    public int titlePositionY = 0;
    public int type = 0;
    public transient Typeface typeface;

    public Time() {
        if ("zh".equals((Object)b.a().getResources().getConfiguration().locale.getLanguage())) {
            this.timeTitle = "\u8ba1\u65f6";
            return;
        }
        this.timeTitle = "Timing";
    }

    @Override
    public Time copy() {
        Time time = new Time();
        time.type = this.type;
        time.timeTitle = this.timeTitle;
        time.timeTitleColor = this.timeTitleColor;
        time.timeStyle = this.timeStyle;
        time.timeStamp = this.timeStamp;
        time.showDay = this.showDay;
        time.showHour = this.showHour;
        time.showMinute = this.showMinute;
        time.showSecond = this.showSecond;
        time.showMs = this.showMs;
        time.timeAccumulation = this.timeAccumulation;
        time.cycleTime = this.cycleTime;
        time.timeColor = this.timeColor;
        time.fontSize = this.fontSize;
        time.alignType = this.alignType;
        time.titlePositionX = this.titlePositionX;
        time.titlePositionY = this.titlePositionY;
        return time;
    }
}


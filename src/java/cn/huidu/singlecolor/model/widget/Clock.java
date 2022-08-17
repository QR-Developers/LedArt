/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  java.lang.String
 */
package cn.huidu.singlecolor.model.widget;

import android.graphics.Typeface;
import cn.huidu.singlecolor.model.Widget;

public class Clock
extends Widget {
    public static final int CLASSIC_CLOCK = 1;
    public static final int NUMERIC_CLOCK;
    public int ampmColor = -65536;
    public int ampmPositionX = 0;
    public int ampmPositionY = 0;
    public boolean changePosition = false;
    public int clockStyle = 0;
    public int dateColor = -65536;
    public int datePositionX = 0;
    public int datePositionY = 0;
    public int dateStyle = 0;
    public final transient String[] dateStyles = new String[]{"YYYY/MM/DD", "MM/DD/YYYY", "DD/MM/YYYY", "Jan DD,YYYY", "DD January,YYYY", "YYYY\u5e74MM\u6708DD\u65e5", "MM\u6708DD\u65e5"};
    public int fontSize = 12;
    public int hourColor = -65536;
    public int hourWidth = 2;
    public int lineCount = 0;
    public int minuteColor = -65536;
    public int minuteWidth = 1;
    public int secondColor = -65536;
    public int secondWidth = 0;
    public boolean showAmPm = false;
    public boolean showDate = true;
    public boolean showTime = true;
    public boolean showTitle = false;
    public boolean showWeek = true;
    public int space = 3;
    public int timeColor = -65536;
    public int timeStyle = 0;
    public final transient String[] timeStyles = new String[]{"HH:mm:ss", "HH:mm", "HH\u65f6mm\u5206ss\u79d2", "HH\u65f6mm\u5206", "HH\u6642mm\u5206ss\u79d2", "HH\u6642mm\u5206", "08:59 AM", "AM 08:59"};
    public int timeZoneId = 0;
    public int timeZoneOffset = -86400;
    public String title;
    public int titleColor = -65536;
    public int type = 0;
    public transient Typeface typeface;
    public int vertical = 0;
    public int weekColor = -65536;
    public int weekPositionX = 0;
    public int weekPositionY = 0;
    public int weekStyle = 0;
    public final transient String[] weekStyles = new String[]{"\u661f\u671f\u4e00", "Mon", "Monday"};

    public static int[] getClockFontSize() {
        int[] arrn = new int[28];
        int n = 9;
        while (n <= 36) {
            arrn[n - 9] = n++;
        }
        return arrn;
    }

    public static int getFontSizePosition(int n) {
        int[] arrn = Clock.getClockFontSize();
        for (int j = 0; j < arrn.length; ++j) {
            if (n != arrn[j]) continue;
            return j;
        }
        return 0;
    }

    @Override
    public Clock copy() {
        Clock clock = new Clock();
        clock.type = this.type;
        clock.title = this.title;
        clock.space = this.space;
        clock.fontSize = this.fontSize;
        clock.vertical = this.vertical;
        clock.lineCount = this.lineCount;
        clock.timeZoneId = this.timeZoneId;
        clock.timeZoneOffset = this.timeZoneOffset;
        clock.showDate = this.showDate;
        clock.showWeek = this.showWeek;
        clock.showTime = this.showTime;
        clock.showTitle = this.showTitle;
        clock.showAmPm = this.showAmPm;
        clock.changePosition = this.changePosition;
        clock.dateStyle = this.dateStyle;
        clock.weekStyle = this.weekStyle;
        clock.timeStyle = this.timeStyle;
        clock.clockStyle = this.clockStyle;
        clock.titleColor = this.titleColor;
        clock.dateColor = this.dateColor;
        clock.weekColor = this.weekColor;
        clock.timeColor = this.timeColor;
        clock.ampmColor = this.ampmColor;
        clock.hourWidth = this.hourWidth;
        clock.minuteWidth = this.minuteWidth;
        clock.secondWidth = this.secondWidth;
        clock.hourColor = this.hourColor;
        clock.minuteColor = this.minuteColor;
        clock.secondColor = this.secondColor;
        clock.datePositionX = this.datePositionX;
        clock.datePositionY = this.datePositionY;
        clock.weekPositionX = this.weekPositionX;
        clock.weekPositionY = this.weekPositionY;
        clock.ampmPositionX = this.ampmPositionX;
        clock.ampmPositionY = this.ampmPositionY;
        return clock;
    }
}


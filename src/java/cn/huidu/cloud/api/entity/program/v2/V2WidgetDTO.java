/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.cloud.api.entity.program.v2.V2WidgetDTO$WeatherCityAttrs
 *  cn.huidu.cloud.api.entity.program.v2.V2WidgetDTO$WeatherTmpAttrs
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package cn.huidu.cloud.api.entity.program.v2;

import cn.huidu.cloud.api.entity.program.v2.V2WidgetDTO;
import java.util.List;
import java.util.Map;

public class V2WidgetDTO {
    private static final String TAG = "V2WidgetDTO";
    public Object attributes;
    public String name;
    public List<V2WidgetDTO> preview;
    public String type;
    public String uuid;

    public static class ButtonAttrs {
        public String backgroundColor;
        public String content;
        public int filletSize;
        public String frameBorderColor;
        public int frameBorderSize;
        public String textColor;
        public int textSize;
    }

    public static class ClockAttrs {
        public boolean adjustType;
        public ClockTextAttrs amPm;
        public ClockItemAttrs date;
        public int duration;
        public ClockTextAttrs fixedText;
        public ClockFontAttrs font;
        public ClockHandColorAttrs handColor;
        public ClockScaleAttrs hourScale;
        public ClockItemAttrs lunar;
        public ClockScaleAttrs minuteScale;
        public List<String> show;
        public boolean singleLine;
        public int space;
        public boolean swapWeek;
        public ClockItemAttrs time;
        public String timeAdjustVal;
        public String timeZone;
        public String type;
        public boolean use12H;
        public ClockItemAttrs week;
    }

    public static class ClockFontAttrs {
        public String family;
        public int size;
    }

    public static class ClockHandColorAttrs {
        public String hour;
        public String minute;
        public String second;
    }

    public static class ClockItemAttrs {
        public Integer color;
        public Integer format;
    }

    public static class ClockScaleAttrs {
        public String color;
        public String type;
    }

    public static class ClockTextAttrs {
        public Integer color;
        public Boolean show;
        public String text;
    }

    public static class DateItemAttrs {
        public String format;
        public boolean visible;
    }

    public static class DateTimeAttrs {
        public DateItemAttrs date;
        public FontStyleAttrs font;
        public LunarItemAttrs lunar;
        public boolean multiLine;
        public boolean smallToLarge;
        public int space;
        public TimeItemAttrs time;
        public WeekItemAttrs week;
    }

    public static class EWatchAttrs {
        public String fillColor;
        public boolean showSecond;
        public String strokeColor;
    }

    public static class EffectAttrs {
        public boolean clearScreen;
        public int duration;
        public boolean endToEnd;
        public int in;
        public int inSpeed;
        public int out;
        public int speed;
    }

    public static class FontAttrs {
        public boolean bold;
        public String color;
        public boolean italic;
        public String name;
        public int size;
        public boolean underline;
    }

    public static class FontStyleAttrs {
        public String color;
        public String family;
        public int size;
    }

    public static class HtmlAttrs {
        public int duration;
        public int refresh;
        public String url;
    }

    public static class ImageAttrs {
        public EffectAttrs effect;
        public boolean keepAspectRatio;
        public String preview;
        public int resourceId;
        public String src;
    }

    public static class LiveStreamAttrs {
        public int duration;
        public String url;
    }

    public static class LunarItemAttrs {
        public boolean visible;
    }

    public static class QrCodeAttrs {
        public String url;
    }

    public static class TextAttrs {
        public String alignment;
        public String backgroundColor;
        public String content;
        public EffectAttrs effect;
        public transient int imageHeight;
        public transient int imageWidth;
        public boolean multiLine;
        public List<String> preview;
        public boolean transparent;
    }

    public static class TimeItemAttrs {
        public String format;
        public boolean use24h;
        public boolean visible;
    }

    public static class TimerAttrs {
        public boolean countDown;
        public FontStyleAttrs font;
        public String format;
        public boolean singleLine;
        public int space;
        public String targetDate;
        public FontStyleAttrs timeFont;
    }

    public static class VideoAttrs {
        public int duration;
        public boolean keepAspectRatio;
        public String preview;
        public int resourceId;
        public String src;
    }

    public static class WeatherAttrs {
        public WeatherItemAttrs aqi;
        public WeatherCityAttrs city;
        public WeatherItemAttrs date;
        public String displayStyle;
        public FontStyleAttrs font;
        public WeatherItemAttrs humidity;
        public boolean singleLine;
        public int space;
        public WeatherTmpAttrs temperature;
        public Map<String, String> translateMap;
        public WeatherItemAttrs weather;
        public WeatherItemAttrs wind;
    }

    public static class WeatherItemAttrs {
        public String color;
        public boolean visible;
    }

    public static class WeekItemAttrs {
        public String[] format;
        public boolean visible;
    }

}


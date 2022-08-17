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

public class TemperatureHumidity
extends Widget {
    public int alignType = 2;
    public boolean changePosition = false;
    public int defaultHumidity = 60;
    public int defaultTemperature = 16;
    public int fontSize = 15;
    public int hardwareType = 1;
    public int humiPositionX = 0;
    public int humiPositionY = 0;
    public int humidityCorrection = 0;
    public String humidityTitle;
    public int humidityTitleColor = -65536;
    public int humidityValueColor = -65536;
    public int lineCount = 1;
    public int tempPositionX = 0;
    public int tempPositionY = 0;
    public int temperatureCorrection = 0;
    public String temperatureTitle;
    public int temperatureTitleColor = -65536;
    public int temperatureUnit = 0;
    public int temperatureValueColor = -65536;
    public int type = 0;
    public transient Typeface typeface;

    public TemperatureHumidity() {
        if ("zh".equals((Object)b.a().getResources().getConfiguration().locale.getLanguage())) {
            this.temperatureTitle = "\u6e29\u5ea6:";
            this.humidityTitle = "\u6e7f\u5ea6:";
            return;
        }
        this.temperatureTitle = "Temperature";
        this.humidityTitle = "Humidity";
    }

    @Override
    public TemperatureHumidity copy() {
        TemperatureHumidity temperatureHumidity = new TemperatureHumidity();
        temperatureHumidity.hardwareType = this.hardwareType;
        temperatureHumidity.type = this.type;
        temperatureHumidity.temperatureTitle = this.temperatureTitle;
        temperatureHumidity.temperatureTitleColor = this.temperatureTitleColor;
        temperatureHumidity.temperatureUnit = this.temperatureUnit;
        temperatureHumidity.temperatureValueColor = this.temperatureValueColor;
        temperatureHumidity.temperatureCorrection = this.temperatureCorrection;
        temperatureHumidity.humidityTitle = this.humidityTitle;
        temperatureHumidity.humidityTitleColor = this.humidityTitleColor;
        temperatureHumidity.humidityValueColor = this.humidityValueColor;
        temperatureHumidity.humidityCorrection = this.humidityCorrection;
        temperatureHumidity.fontSize = this.fontSize;
        temperatureHumidity.alignType = this.alignType;
        temperatureHumidity.lineCount = this.lineCount;
        temperatureHumidity.changePosition = this.changePosition;
        temperatureHumidity.tempPositionX = this.tempPositionX;
        temperatureHumidity.tempPositionY = this.tempPositionY;
        temperatureHumidity.humiPositionX = this.humiPositionX;
        temperatureHumidity.humiPositionY = this.humiPositionY;
        temperatureHumidity.typeface = this.typeface;
        temperatureHumidity.defaultTemperature = this.defaultTemperature;
        temperatureHumidity.defaultHumidity = this.defaultHumidity;
        return temperatureHumidity;
    }
}


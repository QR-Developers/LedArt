/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Paint
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.text.Spannable
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  c1.a
 *  cn.huidu.freetype.FreeTypeUtils
 *  com.coship.fullcolorprogram.enums.SensorType
 *  com.coship.fullcolorprogram.enums.ShowEffectsType
 *  com.coship.fullcolorprogram.enums.TextEffectType
 *  com.coship.fullcolorprogram.enums.VerticalAlignStyle
 *  com.coship.fullcolorprogram.model.AnimationText
 *  com.coship.fullcolorprogram.model.Area
 *  com.coship.fullcolorprogram.model.Clock
 *  com.coship.fullcolorprogram.model.Humidity
 *  com.coship.fullcolorprogram.model.Image
 *  com.coship.fullcolorprogram.model.Node
 *  com.coship.fullcolorprogram.model.Sensor
 *  com.coship.fullcolorprogram.model.Temperature
 *  com.coship.fullcolorprogram.model.Text
 *  com.coship.fullcolorprogram.model.Time
 *  com.huidu.applibs.entity.model.HDFileInfo
 *  h2.g0
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  l5.k
 *  m5.p
 *  m5.u
 *  m5.w
 *  o4.f
 *  o4.f$a
 *  o4.l
 *  o4.r
 */
package c1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Spannable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c1.a;
import cn.huidu.freetype.FreeTypeUtils;
import com.coship.fullcolorprogram.enums.SensorType;
import com.coship.fullcolorprogram.enums.ShowEffectsType;
import com.coship.fullcolorprogram.enums.TextEffectType;
import com.coship.fullcolorprogram.enums.VerticalAlignStyle;
import com.coship.fullcolorprogram.model.AnimationText;
import com.coship.fullcolorprogram.model.Area;
import com.coship.fullcolorprogram.model.Clock;
import com.coship.fullcolorprogram.model.Humidity;
import com.coship.fullcolorprogram.model.Image;
import com.coship.fullcolorprogram.model.Node;
import com.coship.fullcolorprogram.model.Sensor;
import com.coship.fullcolorprogram.model.Temperature;
import com.coship.fullcolorprogram.model.Text;
import com.coship.fullcolorprogram.model.Time;
import com.huidu.applibs.entity.model.HDFileInfo;
import h2.g0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l5.k;
import m5.p;
import m5.u;
import m5.w;
import o4.f;
import o4.l;
import o4.r;

public class b {
    public static /* synthetic */ void a(File file, ArrayList arrayList, Bitmap bitmap) {
        arrayList.add((Object)new HDFileInfo(g0.j((Bitmap)bitmap, (File)file)));
    }

    private static void b(File file, String string2, List<HDFileInfo> list) {
        list.add((Object)new HDFileInfo(file, string2));
    }

    public static List<HDFileInfo> c(Context context, AnimationText animationText, String string2, File file) {
        ArrayList arrayList = new ArrayList();
        File[] arrfile = FreeTypeUtils.c((String)string2, (String)p.b((String)animationText.getFontName()), (String)p.b((String)"Arial Unicode MS"), (int)animationText.getFontSize(), (boolean)animationText.isHollow(), (boolean)animationText.isBold(), (boolean)animationText.isItalic(), (boolean)animationText.isUnderline(), (int)animationText.getCenterCorrection(), (String)file.getAbsolutePath());
        b.b(arrfile[0], "PathData", (List<HDFileInfo>)arrayList);
        b.b(arrfile[1], "DescentVector", (List<HDFileInfo>)arrayList);
        return arrayList;
    }

    @NonNull
    public static List<HDFileInfo> d(Context context, Clock clock, File file, int n2) {
        String[] arrstring;
        String[] arrstring2;
        String[] arrstring3;
        String[] arrstring4;
        ArrayList arrayList = new ArrayList();
        Paint paint = new Paint();
        paint.setTextSize((float)clock.getFontSize());
        if (clock.getFontSize() <= 14) {
            paint.setTypeface(k.f((Context)context).g(clock.getFontName()));
        }
        paint.setColor(clock.getWeekColor());
        int n3 = 1;
        for (int i2 = 1; i2 <= (arrstring3 = r.a).length; ++i2) {
            File file2 = i2 == arrstring3.length ? g0.d((String)arrstring3[0], (Paint)paint, (File)file, (int)n2) : g0.d((String)arrstring3[i2], (Paint)paint, (File)file, (int)n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("_chWeek_");
            stringBuilder.append(i2);
            b.b(file2, stringBuilder.toString(), (List<HDFileInfo>)arrayList);
        }
        for (int i3 = 1; i3 <= (arrstring2 = r.b).length; ++i3) {
            File file3 = i3 == arrstring2.length ? g0.d((String)arrstring2[0], (Paint)paint, (File)file, (int)n2) : g0.d((String)arrstring2[i3], (Paint)paint, (File)file, (int)n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("_enWeek_");
            stringBuilder.append(i3);
            b.b(file3, stringBuilder.toString(), (List<HDFileInfo>)arrayList);
        }
        for (int i4 = 1; i4 <= (arrstring4 = r.c).length; ++i4) {
            File file4 = i4 == arrstring4.length ? g0.d((String)arrstring4[0], (Paint)paint, (File)file, (int)n2) : g0.d((String)arrstring4[i4], (Paint)paint, (File)file, (int)n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("_enWeekSim_");
            stringBuilder.append(i4);
            b.b(file4, stringBuilder.toString(), (List<HDFileInfo>)arrayList);
        }
        paint.setColor(clock.getDateColor());
        while (n3 <= (arrstring = r.d).length) {
            File file5 = g0.d((String)arrstring[n3 - 1], (Paint)paint, (File)file, (int)n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("_dateEnMonth_");
            stringBuilder.append(n3);
            b.b(file5, stringBuilder.toString(), (List<HDFileInfo>)arrayList);
            ++n3;
        }
        boolean bl = "tw".equals((Object)u.b((Context)context));
        b.b(g0.c((String)", /", (Paint)paint, (File)file, (int)n2), "_dateChar", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"0123456789", (Paint)paint, (File)file, (int)n2), "_dateNumber", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"\u5e74\u6708\u65e5", (Paint)paint, (File)file, (int)n2), "_dateCh", (List<HDFileInfo>)arrayList);
        paint.setColor(clock.getTimeColor());
        String string2 = bl ? "\u6642\u5206\u79d2" : "\u65f6\u5206\u79d2";
        b.b(g0.c((String)string2, (Paint)paint, (File)file, (int)n2), "_timeCh", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)":", (Paint)paint, (File)file, (int)n2), "_timeChar", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"0123456789", (Paint)paint, (File)file, (int)n2), "_timeNumber", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"AM", (Paint)paint, (File)file, (int)n2), "_timeAM", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"PM", (Paint)paint, (File)file, (int)n2), "_timePM", (List<HDFileInfo>)arrayList);
        paint.setColor(clock.getAmpmColor());
        b.b(g0.d((String)"AM", (Paint)paint, (File)file, (int)n2), "_AnalogAM", (List<HDFileInfo>)arrayList);
        b.b(g0.d((String)"PM", (Paint)paint, (File)file, (int)n2), "_AnalogPM", (List<HDFileInfo>)arrayList);
        paint.setColor(clock.getLunarColor());
        String string3 = bl ? "\u4e00\u4e8c\u4e09\u56db\u4e94\u516d\u4e03\u516b\u4e5d\u5341\u8fb2\u66c6\u5e74\u6708\u65e5\u521d\u6b63" : "\u4e00\u4e8c\u4e09\u56db\u4e94\u516d\u4e03\u516b\u4e5d\u5341\u519c\u5386\u5e74\u6708\u65e5\u521d\u6b63";
        b.b(g0.c((String)string3, (Paint)paint, (File)file, (int)n2), "_lunar", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"\u5eff", (Paint)paint, (File)file, (int)n2), "_twentyZH", (List<HDFileInfo>)arrayList);
        paint.setColor(clock.getFixedTextColor());
        b.b(g0.d((String)clock.getFixedText(), (Paint)paint, (File)file, (int)n2), "_toptext", (List<HDFileInfo>)arrayList);
        paint.setColor(clock.getHourScaleColor());
        b.b(g0.c((String)"0123456789", (Paint)paint, (File)file, (int)n2), "_hourhandNumber", (List<HDFileInfo>)arrayList);
        return arrayList;
    }

    @NonNull
    public static List<HDFileInfo> e(Context context, Humidity humidity, File file, int n2) {
        ArrayList arrayList = new ArrayList();
        Paint paint = new Paint();
        paint.setTextSize((float)humidity.getTopTextFontSize());
        paint.setColor(humidity.getTopTextColor());
        if (humidity.getTopTextFontSize() <= 14) {
            paint.setTypeface(k.f((Context)context).g(humidity.getTopTextFontName()));
        }
        String string2 = humidity.isShowFixedText() && humidity.getTopText() != null ? humidity.getTopText() : "";
        b.b(g0.d((String)string2, (Paint)paint, (File)file, (int)n2), "topText", (List<HDFileInfo>)arrayList);
        paint.setTextSize((float)humidity.getHumidFontSize());
        paint.setColor(humidity.getHumidColor());
        if (humidity.getHumidFontSize() <= 14) {
            paint.setTypeface(k.f((Context)context).g(humidity.getHumidFontName()));
        }
        b.b(g0.c((String)"%", (Paint)paint, (File)file, (int)n2), "percent", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"0123456789", (Paint)paint, (File)file, (int)n2), "number", (List<HDFileInfo>)arrayList);
        b.b(g0.d((String)context.getString(2131822635), (Paint)paint, (File)file, (int)n2), "UnknownText", (List<HDFileInfo>)arrayList);
        return arrayList;
    }

    @Nullable
    public static File f(Context context, Image image, File file, int n2) {
        String string2 = l.a((Uri)Uri.parse((String)image.getFilePath()), (Context)context);
        if (string2 == null || string2.length() == 0 || !new File(string2).exists()) {
            w.b((String)"FcSendFileHelper", (String)"drawImageFile: Image not exists!");
            string2 = image.getFilePath();
            if (!new File(string2).exists()) {
                return null;
            }
        }
        Area area = (Area)image.getParent();
        boolean bl = area.isBorderEnable();
        int n3 = 0;
        if (bl) {
            n3 = area.getBorderSize();
        }
        int n4 = area.getWidth();
        int n5 = n3 * 2;
        int n6 = n4 - n5;
        int n7 = area.getHeight() - n5;
        Bitmap bitmap = image.isKeepAspectRadio() ? g0.f((String)string2, (int)n6, (int)n7, (int)n2) : g0.e((String)string2, (int)n6, (int)n7);
        if (bitmap == null) {
            w.b((String)"FcSendFileHelper", (String)"drawImageFile: out of memery.");
            return null;
        }
        try {
            File file2 = g0.j((Bitmap)bitmap, (File)file);
            return file2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @NonNull
    public static List<HDFileInfo> g(Context context, Sensor sensor, File file, int n2) {
        Paint paint;
        String string2;
        ArrayList arrayList;
        block6 : {
            SensorType sensorType;
            block9 : {
                String string3;
                block4 : {
                    boolean bl;
                    block8 : {
                        block7 : {
                            block5 : {
                                block3 : {
                                    arrayList = new ArrayList();
                                    paint = new Paint();
                                    bl = "zh".equals((Object)u.b((Context)context));
                                    paint.setTextSize((float)sensor.getFontSize());
                                    paint.setColor(sensor.getTopTextColor());
                                    if (sensor.getFontSize() <= 15) {
                                        paint.setTypeface(k.f((Context)context).g(sensor.getFontName()));
                                    }
                                    String string4 = sensor.getTopText();
                                    string2 = "";
                                    String string5 = string4 != null ? sensor.getTopText() : string2;
                                    b.b(g0.d((String)string5, (Paint)paint, (File)file, (int)n2), "topText", (List<HDFileInfo>)arrayList);
                                    paint.setColor(sensor.getSensorColor());
                                    b.b(g0.c((String)"0123456789.-", (Paint)paint, (File)file, (int)n2), "Value", (List<HDFileInfo>)arrayList);
                                    b.b(g0.d((String)context.getString(2131822635), (Paint)paint, (File)file, (int)n2), "UnknownText", (List<HDFileInfo>)arrayList);
                                    sensorType = sensor.getSensorType();
                                    if (sensorType != SensorType.Temperature) break block3;
                                    string3 = sensor.getTempUnit() == 1 ? "\u2103" : "\u2109";
                                    break block4;
                                }
                                if (sensorType != SensorType.Humidity) break block5;
                                string2 = "%";
                                break block6;
                            }
                            if (sensorType != SensorType.Pressure) break block7;
                            string2 = "kPa";
                            break block6;
                        }
                        if (sensorType != SensorType.LightIntensity) break block8;
                        string2 = "Lux";
                        break block6;
                    }
                    if (sensorType == SensorType.WindSpeed) {
                        string3 = bl ? (sensor.getWindUnit() == 1 ? "\u7c73/\u79d2" : "\u82f1\u91cc/\u5c0f\u65f6") : (sensor.getWindUnit() == 1 ? "m/s" : "MPH");
                    }
                    break block9;
                }
                string2 = string3;
                break block6;
            }
            if (sensorType == SensorType.Noise) {
                string2 = "dB";
            }
        }
        b.b(g0.c((String)string2, (Paint)paint, (File)file, (int)n2), "sensorUnit", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821244), (Paint)paint, (File)file, (int)n2), "AirQuality0", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821334), (Paint)paint, (File)file, (int)n2), "AirQuality1", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821661), (Paint)paint, (File)file, (int)n2), "AirQuality2", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821701), (Paint)paint, (File)file, (int)n2), "AirQuality3", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821381), (Paint)paint, (File)file, (int)n2), "AirQuality4", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822271), (Paint)paint, (File)file, (int)n2), "AirQuality5", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821820), (Paint)paint, (File)file, (int)n2), "windDirection0", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821821), (Paint)paint, (File)file, (int)n2), "windDirection1", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821173), (Paint)paint, (File)file, (int)n2), "windDirection2", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822347), (Paint)paint, (File)file, (int)n2), "windDirection3", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822346), (Paint)paint, (File)file, (int)n2), "windDirection4", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822348), (Paint)paint, (File)file, (int)n2), "windDirection5", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822749), (Paint)paint, (File)file, (int)n2), "windDirection6", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821822), (Paint)paint, (File)file, (int)n2), "windDirection7", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821812), (Paint)paint, (File)file, (int)n2), "noWind", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131821812), (Paint)paint, (File)file, (int)n2), "windGrade0", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822802), (Paint)paint, (File)file, (int)n2), "windGrade1", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822803), (Paint)paint, (File)file, (int)n2), "windGrade2", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822799), (Paint)paint, (File)file, (int)n2), "windGrade3", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822804), (Paint)paint, (File)file, (int)n2), "windGrade4", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822797), (Paint)paint, (File)file, (int)n2), "windGrade5", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822811), (Paint)paint, (File)file, (int)n2), "windGrade6", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822805), (Paint)paint, (File)file, (int)n2), "windGrade7", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822798), (Paint)paint, (File)file, (int)n2), "windGrade8", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822812), (Paint)paint, (File)file, (int)n2), "windGrade9", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822813), (Paint)paint, (File)file, (int)n2), "windGrade10", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822810), (Paint)paint, (File)file, (int)n2), "windGrade11", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)context.getString(2131822800), (Paint)paint, (File)file, (int)n2), "windGrade12", (List<HDFileInfo>)arrayList);
        return arrayList;
    }

    @NonNull
    public static List<HDFileInfo> h(Context context, Temperature temperature, File file, int n2) {
        ArrayList arrayList = new ArrayList();
        Paint paint = new Paint();
        paint.setTextSize((float)temperature.getTopTextFontSize());
        paint.setColor(temperature.getTopTextColor());
        if (temperature.getTopTextFontSize() <= 14) {
            paint.setTypeface(k.f((Context)context).g(temperature.getTopTextFontName()));
        }
        String string2 = temperature.isShowFixedText() && temperature.getTopText() != null ? temperature.getTopText() : "";
        b.b(g0.d((String)string2, (Paint)paint, (File)file, (int)n2), "ToptextImage", (List<HDFileInfo>)arrayList);
        paint.setTextSize((float)temperature.getTempFontSize());
        paint.setColor(temperature.getTempColor());
        if (temperature.getTempFontSize() <= 14) {
            paint.setTypeface(k.f((Context)context).g(temperature.getTempFontName()));
        }
        b.b(g0.c((String)"0123456789", (Paint)paint, (File)file, (int)n2), "NumberImage", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)".", (Paint)paint, (File)file, (int)n2), "PointImage", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"\u2103", (Paint)paint, (File)file, (int)n2), "UnitS", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"\u2109", (Paint)paint, (File)file, (int)n2), "UnitIMageH", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)"-", (Paint)paint, (File)file, (int)n2), "SymbolIMage", (List<HDFileInfo>)arrayList);
        return arrayList;
    }

    @Nullable
    public static List<HDFileInfo> i(Context context, Text text, Area area, File file, int n2) {
        f f2 = new f();
        f2.s(text.getCenterCorrection());
        f2.r(0);
        if (text.getBackgroundColor() == 0) {
            f2.r(n2);
        } else {
            f2.r(text.getBackgroundColor());
        }
        Typeface typeface = k.f((Context)context).g(text.getFontFamily());
        boolean bl = area.isBorderEnable();
        int n3 = 0;
        if (bl) {
            n3 = area.getBorderSize();
        }
        int n4 = area.getWidth();
        int n5 = n3 * 2;
        int n6 = n4 - n5;
        int n7 = area.getHeight() - n5;
        ArrayList arrayList = new ArrayList();
        a a2 = new a(file, arrayList);
        boolean bl2 = text.isSingleLine() ? (text.isStroke() ? (text.isHollow() ? f2.i((CharSequence)text.getStrokeSpannable(), 1, typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), text.isHeadTail(), text.getTextEffectType(), (f.a)a2) : f2.j((CharSequence)text.getSpannable(), (CharSequence)text.getStrokeSpannable(), typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), text.isHeadTail(), text.getTextEffectType(), (f.a)a2)) : f2.i((CharSequence)text.getSpannable(), (int)text.isHollow(), typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), text.isHeadTail(), text.getTextEffectType(), (f.a)a2)) : (text.getInEffectType() == ShowEffectsType.MOVE_UP_CONTINUOUSLY ? (text.isStroke() ? (text.isHollow() ? f2.e((CharSequence)text.getStrokeSpannable(), 1, typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), text.isHeadTail(), (f.a)a2) : f2.f((CharSequence)text.getSpannable(), (CharSequence)text.getStrokeSpannable(), typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), text.isHeadTail(), (f.a)a2)) : f2.e((CharSequence)text.getSpannable(), (int)text.isHollow(), typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), text.isHeadTail(), (f.a)a2)) : (text.isStroke() ? (text.isHollow() ? f2.g((CharSequence)text.getStrokeSpannable(), 1, typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), (f.a)a2) : f2.h((CharSequence)text.getSpannable(), (CharSequence)text.getStrokeSpannable(), typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), (f.a)a2)) : f2.g((CharSequence)text.getSpannable(), (int)text.isHollow(), typeface, n6, n7, text.getVerticalAlignStyle().getValue(), text.getLineCount(), (f.a)a2)));
        if (bl2) {
            return arrayList;
        }
        return null;
    }

    @NonNull
    public static List<HDFileInfo> j(Context context, Time time, File file, int n2) {
        ArrayList arrayList = new ArrayList();
        Paint paint = new Paint();
        paint.setTextSize((float)time.getTopTextFontSize());
        paint.setColor(time.getTopTextColor());
        if (time.getTopTextFontSize() <= 14) {
            paint.setTypeface(k.f((Context)context).g(time.getTopTextFontName()));
        }
        String string2 = time.isShowFixedText() && time.getTopText() != null ? time.getTopText() : "";
        b.b(g0.d((String)string2, (Paint)paint, (File)file, (int)n2), "toptext", (List<HDFileInfo>)arrayList);
        paint.setTextSize((float)time.getTimeUnitFontSize());
        paint.setColor(time.getTimeUnitColor());
        if (time.getTimeUnitFontSize() <= 14) {
            paint.setTypeface(k.f((Context)context).g(time.getTimeUnitFontName()));
        }
        String string3 = context.getString(2131821079);
        String string4 = context.getString(2131821410);
        String string5 = context.getString(2131821664);
        String string6 = context.getString(2131822238);
        b.b(g0.c((String)string3, (Paint)paint, (File)file, (int)n2), "zhday", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)string4, (Paint)paint, (File)file, (int)n2), "zhhour", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)string5, (Paint)paint, (File)file, (int)n2), "zhmin", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)string6, (Paint)paint, (File)file, (int)n2), "zhsec", (List<HDFileInfo>)arrayList);
        b.b(g0.c((String)":", (Paint)paint, (File)file, (int)n2), "point", (List<HDFileInfo>)arrayList);
        paint.setTextSize((float)time.getTimeFontSize());
        paint.setColor(time.getTimeColor());
        if (time.getTimeFontSize() <= 14) {
            paint.setTypeface(k.f((Context)context).g(time.getTimeFontName()));
        }
        b.b(g0.c((String)"0123456789", (Paint)paint, (File)file, (int)n2), "number", (List<HDFileInfo>)arrayList);
        return arrayList;
    }
}


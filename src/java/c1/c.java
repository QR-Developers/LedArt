/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Paint
 *  android.graphics.Point
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.text.TextUtils
 *  cn.huidu.huiduapp.ledart.HuiduApplication
 *  com.coship.fullcolorprogram.enums.BorderEffect
 *  com.coship.fullcolorprogram.enums.BorderType
 *  com.coship.fullcolorprogram.enums.CleanEffectType
 *  com.coship.fullcolorprogram.enums.EffectSpeed
 *  com.coship.fullcolorprogram.enums.NeonBackgroundType
 *  com.coship.fullcolorprogram.enums.PlayType
 *  com.coship.fullcolorprogram.enums.SensorType
 *  com.coship.fullcolorprogram.enums.ShowEffectsType
 *  com.coship.fullcolorprogram.enums.TextEffectType
 *  com.coship.fullcolorprogram.model.AnimationText
 *  com.coship.fullcolorprogram.model.Area
 *  com.coship.fullcolorprogram.model.Clock
 *  com.coship.fullcolorprogram.model.Clock$ClockType
 *  com.coship.fullcolorprogram.model.Humidity
 *  com.coship.fullcolorprogram.model.Image
 *  com.coship.fullcolorprogram.model.Node
 *  com.coship.fullcolorprogram.model.Program
 *  com.coship.fullcolorprogram.model.Screen
 *  com.coship.fullcolorprogram.model.Sensor
 *  com.coship.fullcolorprogram.model.Temperature
 *  com.coship.fullcolorprogram.model.Text
 *  com.coship.fullcolorprogram.model.Time
 *  com.coship.fullcolorprogram.model.Video
 *  com.huidu.applibs.entity.model.HDFileInfo
 *  h2.c
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.List
 *  java.util.UUID
 *  l5.k
 *  m0.b
 *  m5.a0
 *  m5.e
 *  m5.o
 *  m5.q0
 *  m5.w
 *  m5.z
 *  o4.l
 *  o4.r
 *  org.xmlpull.v1.XmlSerializer
 */
package c1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import c1.b;
import cn.huidu.huiduapp.ledart.HuiduApplication;
import com.coship.fullcolorprogram.enums.BorderEffect;
import com.coship.fullcolorprogram.enums.BorderType;
import com.coship.fullcolorprogram.enums.CleanEffectType;
import com.coship.fullcolorprogram.enums.EffectSpeed;
import com.coship.fullcolorprogram.enums.NeonBackgroundType;
import com.coship.fullcolorprogram.enums.PlayType;
import com.coship.fullcolorprogram.enums.SensorType;
import com.coship.fullcolorprogram.enums.ShowEffectsType;
import com.coship.fullcolorprogram.enums.TextEffectType;
import com.coship.fullcolorprogram.model.AnimationText;
import com.coship.fullcolorprogram.model.Area;
import com.coship.fullcolorprogram.model.Clock;
import com.coship.fullcolorprogram.model.Humidity;
import com.coship.fullcolorprogram.model.Image;
import com.coship.fullcolorprogram.model.Node;
import com.coship.fullcolorprogram.model.Program;
import com.coship.fullcolorprogram.model.Screen;
import com.coship.fullcolorprogram.model.Sensor;
import com.coship.fullcolorprogram.model.Temperature;
import com.coship.fullcolorprogram.model.Text;
import com.coship.fullcolorprogram.model.Time;
import com.coship.fullcolorprogram.model.Video;
import com.huidu.applibs.entity.model.HDFileInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import l5.k;
import m5.a0;
import m5.e;
import m5.o;
import m5.q0;
import m5.w;
import m5.z;
import o4.l;
import o4.r;
import org.xmlpull.v1.XmlSerializer;

public class c {
    private HashMap<String, String> a;
    private Context b;
    private boolean c;
    private int d;
    private String e;
    private StringBuilder f;

    public c(Context context) {
        this.b = context;
    }

    private boolean a(XmlSerializer xmlSerializer, AnimationText animationText, File file) {
        xmlSerializer.startTag(null, "animationText");
        xmlSerializer.attribute(null, "action", "add");
        xmlSerializer.startTag(null, "effect");
        xmlSerializer.attribute(null, "holdTime", String.valueOf((int)animationText.getHoldTime()));
        xmlSerializer.attribute(null, "in", String.valueOf((int)animationText.getEffectType()));
        xmlSerializer.attribute(null, "inSpeed", String.valueOf((int)(1 + animationText.getEffectSpeed().ordinal())));
        boolean bl = animationText.isHollow();
        String string2 = "1";
        String string3 = bl ? string2 : "0";
        xmlSerializer.attribute(null, "hollow", string3);
        xmlSerializer.endTag(null, "effect");
        NeonBackgroundType neonBackgroundType = animationText.getBackgroundType();
        if (neonBackgroundType.getValue() > 50) {
            String string4;
            if (neonBackgroundType == NeonBackgroundType.CUSTOM_IMAGE) {
                string4 = animationText.getImagePath();
            } else {
                String string5 = neonBackgroundType.getAssetsFile();
                string4 = h2.c.a((Context)this.b, (String)string5);
            }
            File file2 = this.v((Area)animationText.getParent(), string4, file.getAbsolutePath());
            xmlSerializer.startTag(null, "file");
            xmlSerializer.attribute(null, "path", file2.getName());
            String string6 = l.c((File)file2);
            xmlSerializer.attribute(null, "md5", string6);
            xmlSerializer.attribute(null, "size", Long.toString((long)l.d((File)file2)));
            xmlSerializer.attribute(null, "key", "NeonGifPath");
            xmlSerializer.endTag(null, "file");
            this.a.put((Object)string6, (Object)file2.getName());
        }
        xmlSerializer.startTag(null, "style");
        String string7 = animationText.isColorfulStyle() ? string2 : "0";
        xmlSerializer.attribute(null, "dazzle", string7);
        if (!animationText.isNeonBackground()) {
            string2 = "0";
        }
        xmlSerializer.attribute(null, "neonBg", string2);
        xmlSerializer.attribute(null, "bgEffect", String.valueOf((int)neonBackgroundType.getValue()));
        xmlSerializer.attribute(null, "colorful", String.valueOf((int)animationText.getColorfulType()));
        xmlSerializer.attribute(null, "path", "");
        xmlSerializer.endTag(null, "style");
        String string8 = animationText.getContent();
        String string9 = " ";
        if (string8 != null) {
            string8 = string8.replace((CharSequence)"\n", (CharSequence)"");
            if (!animationText.isHeadTail() && animationText.getEffectType() < 4 && !string8.endsWith(string9)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string8);
                stringBuilder.append(string9);
                string8 = stringBuilder.toString();
            }
        }
        if (string8 != null && string8.length() != 0) {
            string9 = string8;
        }
        String[] arrstring = this.q(string9, animationText);
        xmlSerializer.startTag(null, "textWH");
        xmlSerializer.attribute(null, "w", arrstring[0]);
        xmlSerializer.attribute(null, "h", arrstring[1]);
        xmlSerializer.endTag(null, "textWH");
        xmlSerializer.startTag(null, "textColor");
        xmlSerializer.attribute(null, "color", r.l((int)animationText.getTextColor()));
        xmlSerializer.attribute(null, "size", String.valueOf((int)string9.length()));
        xmlSerializer.endTag(null, "textColor");
        this.c(xmlSerializer, b.c(this.b, animationText, string9, file));
        xmlSerializer.endTag(null, "animationText");
        return true;
    }

    private boolean b(XmlSerializer xmlSerializer, Clock clock, File file, int n2) {
        xmlSerializer.startTag(null, "clock");
        xmlSerializer.attribute(null, "action", "add");
        xmlSerializer.startTag(null, "clockCom");
        xmlSerializer.attribute(null, "clockType", Integer.toString((int)clock.getClockType().ordinal()));
        xmlSerializer.attribute(null, "timeZone", clock.gettimeZone());
        xmlSerializer.attribute(null, "timeAdjust", String.valueOf((int)clock.getTimeAdjust()));
        boolean bl = clock.isUseDaylightSavingTime();
        String string2 = "1";
        String string3 = bl ? string2 : "0";
        xmlSerializer.attribute(null, "isDaylightSavingTime", string3);
        String string4 = clock.getDaylightStart();
        String string5 = "";
        String string6 = string4 == null ? string5 : clock.getDaylightStart();
        xmlSerializer.attribute(null, "start", string6);
        if (clock.getDaylightEnd() != null) {
            string5 = clock.getDaylightEnd();
        }
        xmlSerializer.attribute(null, "end", string5);
        xmlSerializer.endTag(null, "clockCom");
        xmlSerializer.startTag(null, "fixedText");
        String string7 = clock.isFixedTextVisible() ? string2 : "0";
        xmlSerializer.attribute(null, "display", string7);
        xmlSerializer.endTag(null, "fixedText");
        xmlSerializer.startTag(null, "date");
        String string8 = clock.isDateVisible() ? string2 : "0";
        xmlSerializer.attribute(null, "display", string8);
        xmlSerializer.attribute(null, "type", Integer.toString((int)clock.getDateFormat()));
        xmlSerializer.endTag(null, "date");
        xmlSerializer.startTag(null, "time");
        String string9 = clock.isTimeVisible() ? string2 : "0";
        xmlSerializer.attribute(null, "display", string9);
        xmlSerializer.attribute(null, "type", Integer.toString((int)clock.getTimeFormat()));
        xmlSerializer.endTag(null, "time");
        xmlSerializer.startTag(null, "week");
        String string10 = clock.isWeekVisible() ? string2 : "0";
        xmlSerializer.attribute(null, "display", string10);
        xmlSerializer.attribute(null, "type", Integer.toString((int)clock.getWeekFormat()));
        xmlSerializer.endTag(null, "week");
        xmlSerializer.startTag(null, "lunar");
        String string11 = clock.isLunarVisible() ? string2 : "0";
        xmlSerializer.attribute(null, "display", string11);
        xmlSerializer.endTag(null, "lunar");
        xmlSerializer.startTag(null, "timeFormat");
        String string12 = clock.isAmpmVisible() ? "0" : string2;
        xmlSerializer.attribute(null, "isEnableAmPm", string12);
        xmlSerializer.endTag(null, "timeFormat");
        xmlSerializer.startTag(null, "clockTextsSyle");
        xmlSerializer.attribute(null, "space", String.valueOf((int)clock.getSpace()));
        String string13 = clock.isWeekFront() ? "0" : string2;
        xmlSerializer.attribute(null, "swapArea", string13);
        xmlSerializer.endTag(null, "clockTextsSyle");
        if (clock.getClockType() == Clock.ClockType.DIGITAL_CLOCK) {
            xmlSerializer.startTag(null, "digital");
            String string14 = clock.isShowSingleLine() ? "0" : string2;
            xmlSerializer.attribute(null, "displayMode", string14);
            if (clock.isTime24()) {
                string2 = "0";
            }
            xmlSerializer.attribute(null, "timeMode", string2);
            xmlSerializer.endTag(null, "digital");
        } else {
            xmlSerializer.startTag(null, "analog");
            xmlSerializer.attribute(null, "hourHandColor", r.l((int)clock.getHourHandColor()));
            xmlSerializer.attribute(null, "minuteHandColor", r.l((int)clock.getMinuteHandColor()));
            xmlSerializer.attribute(null, "secondHandColor", r.l((int)clock.getSecondHandColor()));
            xmlSerializer.attribute(null, "hourScaleType", Integer.toString((int)clock.getHourScaleType()));
            xmlSerializer.attribute(null, "hourScaleFontName", clock.getHourScaleFName());
            xmlSerializer.attribute(null, "hourScaleFontSize", Integer.toString((int)clock.getFontSize()));
            xmlSerializer.attribute(null, "hourScaleColor", r.l((int)clock.getHourScaleColor()));
            xmlSerializer.attribute(null, "minuteScaleType", Integer.toString((int)clock.getMinuteScaleType()));
            xmlSerializer.attribute(null, "minuteScaleColor", r.l((int)clock.getMinuteScaleColor()));
            xmlSerializer.endTag(null, "analog");
        }
        this.c(xmlSerializer, b.d(this.b, clock, file, n2));
        xmlSerializer.endTag(null, "clock");
        return true;
    }

    private void c(XmlSerializer xmlSerializer, List<HDFileInfo> list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            HDFileInfo hDFileInfo = (HDFileInfo)list.get(i2);
            xmlSerializer.startTag(null, "file");
            xmlSerializer.attribute(null, "size", Long.toString((long)hDFileInfo.length));
            File file = new File(hDFileInfo.path);
            xmlSerializer.attribute(null, "path", file.getName());
            xmlSerializer.attribute(null, "md5", hDFileInfo.md5);
            xmlSerializer.attribute(null, "key", hDFileInfo.key);
            xmlSerializer.endTag(null, "file");
            this.a.put((Object)hDFileInfo.md5, (Object)file.getName());
            if (!this.c) continue;
            this.t(hDFileInfo.path, "image/png");
        }
    }

    private boolean d(XmlSerializer xmlSerializer, Humidity humidity, File file, int n2) {
        xmlSerializer.startTag(null, "humidity");
        xmlSerializer.attribute(null, "action", "add");
        xmlSerializer.startTag(null, "message");
        xmlSerializer.attribute(null, "Space", String.valueOf((int)humidity.getSpace()));
        boolean bl = humidity.isMultiLine();
        String string2 = "1";
        String string3 = bl ? string2 : "0";
        xmlSerializer.attribute(null, "MultiDisplay", string3);
        xmlSerializer.attribute(null, "AdjustValue", String.valueOf((int)humidity.getAdjust()));
        if (!humidity.isSwapArea()) {
            string2 = "0";
        }
        xmlSerializer.attribute(null, "SwapPos", string2);
        xmlSerializer.endTag(null, "message");
        xmlSerializer.startTag(null, "backReadUseTopText");
        String string4 = humidity.isShowFixedText() && !TextUtils.isEmpty((CharSequence)humidity.getTopText()) ? humidity.getTopText() : "";
        xmlSerializer.attribute(null, "TopText", string4);
        xmlSerializer.endTag(null, "backReadUseTopText");
        this.c(xmlSerializer, b.e(this.b, humidity, file, n2));
        xmlSerializer.endTag(null, "humidity");
        return true;
    }

    private boolean e(XmlSerializer xmlSerializer, Image image, File file, int n2) {
        File file2 = !this.r(image.getFilePath()) ? b.f(this.b, image, file, n2) : this.v((Area)image.getParent(), image.getFilePath(), file.getAbsolutePath());
        if (file2 != null && file2.exists()) {
            xmlSerializer.startTag(null, "image");
            xmlSerializer.attribute(null, "action", "add");
            xmlSerializer.startTag(null, "effect");
            xmlSerializer.attribute(null, "holdTime", Integer.toString((int)(10 * image.getHoldTime())));
            xmlSerializer.attribute(null, "in", Integer.toString((int)image.getInEffectType().getValue()));
            xmlSerializer.attribute(null, "out", Integer.toString((int)image.getOutEffectType().getValue()));
            xmlSerializer.attribute(null, "outSpeed", Integer.toString((int)image.getEffectSpeed().ordinal()));
            xmlSerializer.attribute(null, "inSpeed", Integer.toString((int)image.getEffectSpeed().ordinal()));
            xmlSerializer.endTag(null, "effect");
            xmlSerializer.startTag(null, "file");
            xmlSerializer.attribute(null, "size", Long.toString((long)l.d((File)file2)));
            String string2 = l.c((File)file2);
            if (this.c) {
                xmlSerializer.attribute(null, "path", file2.getName());
                this.a.put((Object)string2, (Object)file2.getName());
            } else {
                xmlSerializer.attribute(null, "path", file2.getAbsolutePath());
                this.a.put((Object)string2, (Object)file2.getAbsolutePath());
            }
            xmlSerializer.attribute(null, "md5", string2);
            xmlSerializer.endTag(null, "file");
            if (this.c) {
                this.t(file2.getAbsolutePath(), "image/png");
            }
            xmlSerializer.endTag(null, "image");
            return true;
        }
        this.d = 7;
        return false;
    }

    private boolean f(XmlSerializer xmlSerializer, Program program, File file, int n2, int n3) {
        if (program.getChildCount() > 0) {
            xmlSerializer.startTag(null, "channel");
            String string2 = program.getId();
            if (TextUtils.isEmpty((CharSequence)string2)) {
                string2 = UUID.randomUUID().toString();
            }
            if (this.f.length() > 0) {
                this.f.append(",");
            }
            this.f.append(string2);
            xmlSerializer.attribute(null, "guid", string2);
            String string3 = "action";
            xmlSerializer.attribute(null, string3, "add");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("New program ");
            stringBuilder.append(n3 + 1);
            xmlSerializer.attribute(null, "name", stringBuilder.toString());
            if (program.isEnablePlayControl()) {
                if (program.getPlayMode() == 0) {
                    xmlSerializer.attribute(null, "playMode", "0");
                    xmlSerializer.attribute(null, "playTime", String.valueOf((int)program.getPlayCount()));
                } else {
                    xmlSerializer.attribute(null, "playMode", "1");
                    xmlSerializer.attribute(null, "playTime", String.valueOf((Object)program.getPlayDuration()));
                }
                if (program.isPlayByTime()) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(program.getStartTime());
                    stringBuilder2.append("-");
                    stringBuilder2.append(program.getEndTime());
                    xmlSerializer.attribute(null, "showTime", stringBuilder2.toString());
                }
                if (program.isPlayByDate()) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(program.getStartDate());
                    stringBuilder3.append("~");
                    stringBuilder3.append(program.getEndDate());
                    xmlSerializer.attribute(null, "showDate", stringBuilder3.toString());
                }
                xmlSerializer.attribute(null, "showWeek", program.getPlayWeek());
            }
            boolean bl = program.isBorderEnable();
            String string4 = "speed";
            String string5 = "frame";
            if (bl) {
                xmlSerializer.startTag(null, string5);
                xmlSerializer.attribute(null, string4, String.valueOf((int)program.getBorderSpeed()));
                xmlSerializer.attribute(null, "effect", program.getBorderEffect().getValue());
                xmlSerializer.attribute(null, program.getBorderType().getValue(), program.getBorderValue());
                xmlSerializer.endTag(null, string5);
            }
            int n4 = program.getWidth();
            int n5 = program.getHeight();
            int n6 = 0;
            while (n6 < program.getChildCount()) {
                int n7;
                String string6;
                Area area = (Area)program.getChildAt(n6);
                xmlSerializer.startTag(null, "area");
                xmlSerializer.attribute(null, string3, "add");
                String string7 = String.valueOf((int)n6);
                String string8 = "area";
                xmlSerializer.attribute(null, "index", string7);
                if (area.isBorderEnable()) {
                    xmlSerializer.startTag(null, string5);
                    xmlSerializer.attribute(null, string4, String.valueOf((int)area.getBorderSpeed()));
                    xmlSerializer.attribute(null, "effect", area.getBorderEffect().getValue());
                    xmlSerializer.attribute(null, area.getBorderType().getValue(), area.getBorderValue());
                    xmlSerializer.endTag(null, string5);
                }
                xmlSerializer.startTag(null, "rectangle");
                int n8 = area.getX();
                int n9 = area.getY();
                int n10 = area.getWidth();
                int n11 = area.getHeight();
                if (program.isBorderEnable()) {
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    int n16 = program.getBorderSize();
                    n7 = n6;
                    if (n8 < n16) {
                        int n17 = n8 + n10;
                        string6 = string5;
                        if (n17 > n4 - n16) {
                            n10 = n4 - n16 * 2;
                            n8 = n16;
                        }
                    } else {
                        string6 = string5;
                    }
                    if (n8 < n16) {
                        n8 = n16;
                    }
                    if ((n12 = n8 + n10) > (n14 = n4 - n16)) {
                        n8 = n14 - n10;
                    }
                    if (n9 < n16 && n9 + n11 > n5 - n16) {
                        n11 = n5 - n16 * 2;
                        n9 = n16;
                    }
                    if (n9 < n16) {
                        n9 = n16;
                    }
                    if ((n15 = n9 + n11) > (n13 = n5 - n16)) {
                        n9 = n13 - n11;
                    }
                } else {
                    n7 = n6;
                    string6 = string5;
                }
                xmlSerializer.attribute(null, "width", String.valueOf((int)n10));
                xmlSerializer.attribute(null, "height", String.valueOf((int)n11));
                xmlSerializer.attribute(null, "x", String.valueOf((int)n8));
                xmlSerializer.attribute(null, "y", String.valueOf((int)n9));
                xmlSerializer.endTag(null, "rectangle");
                xmlSerializer.startTag(null, "render");
                xmlSerializer.attribute(null, "alpha", "255");
                xmlSerializer.endTag(null, "render");
                xmlSerializer.startTag(null, "materials");
                for (int i2 = 0; i2 < area.getChildCount(); ++i2) {
                    int n18;
                    String string9;
                    String string10;
                    String string11;
                    String string12;
                    boolean bl2;
                    Node node = area.getChildAt(i2);
                    if (node instanceof Clock) {
                        bl2 = this.b(xmlSerializer, (Clock)node, file, n2);
                        string11 = string3;
                        n18 = n7;
                        string9 = string6;
                        string10 = string8;
                        string12 = string4;
                    } else if (node instanceof Text) {
                        Text text = (Text)node;
                        String string13 = string8;
                        Area area2 = area;
                        n18 = n7;
                        string11 = string3;
                        string9 = string6;
                        string10 = string13;
                        string12 = string4;
                        bl2 = this.i(xmlSerializer, text, area2, file, n2);
                        area = area2;
                    } else {
                        string11 = string3;
                        n18 = n7;
                        string9 = string6;
                        string10 = string8;
                        Area area3 = area;
                        string12 = string4;
                        if (node instanceof Video) {
                            Video video = (Video)node;
                            area = area3;
                            bl2 = this.k(xmlSerializer, video, area, file);
                        } else {
                            area = area3;
                            bl2 = node instanceof Image ? this.e(xmlSerializer, (Image)node, file, n2) : (node instanceof Temperature ? this.h(xmlSerializer, (Temperature)node, file, n2) : (node instanceof Humidity ? this.d(xmlSerializer, (Humidity)node, file, n2) : (node instanceof Time ? this.j(xmlSerializer, (Time)node, file, n2) : (node instanceof AnimationText ? this.a(xmlSerializer, (AnimationText)node, file) : (node instanceof Sensor ? this.g(xmlSerializer, (Sensor)node, file, n2) : false)))));
                        }
                    }
                    if (!bl2) {
                        return false;
                    }
                    string8 = string10;
                    string3 = string11;
                    string4 = string12;
                    string6 = string9;
                    n7 = n18;
                }
                String string14 = string3;
                int n19 = n7;
                String string15 = string6;
                String string16 = string8;
                xmlSerializer.endTag(null, "materials");
                xmlSerializer.endTag(null, string16);
                n6 = n19 + 1;
                string3 = string14;
                string5 = string15;
            }
            xmlSerializer.endTag(null, "channel");
        }
        return true;
    }

    private boolean g(XmlSerializer xmlSerializer, Sensor sensor, File file, int n2) {
        xmlSerializer.startTag(null, "sensor");
        xmlSerializer.attribute(null, "action", "add");
        xmlSerializer.attribute(null, "name", "sensor1");
        xmlSerializer.startTag(null, "para");
        xmlSerializer.attribute(null, "type", sensor.getSensorType().value());
        xmlSerializer.attribute(null, "swap", String.valueOf((int)sensor.isSwapPosition()));
        xmlSerializer.attribute(null, "multiLine", String.valueOf((boolean)sensor.isMultiline()));
        xmlSerializer.attribute(null, "showLevel", String.valueOf((boolean)sensor.isShowLevel()));
        xmlSerializer.attribute(null, "highPrecision", String.valueOf((boolean)sensor.isHighPrecision()));
        xmlSerializer.attribute(null, "spacing", String.valueOf((int)sensor.getSpacing()));
        xmlSerializer.attribute(null, "tempUnit", String.valueOf((int)sensor.getTempUnit()));
        if (sensor.getSensorType() == SensorType.WindSpeed) {
            if (sensor.getWindUnit() == 1) {
                xmlSerializer.attribute(null, "adjust", String.valueOf((int)sensor.getAdjust()));
            } else if (sensor.getWindUnit() == 2) {
                xmlSerializer.attribute(null, "adjust", String.valueOf((int)(1000 * sensor.getAdjust() / 3600)));
            } else {
                double d2 = sensor.getAdjust();
                Double.isNaN((double)d2);
                xmlSerializer.attribute(null, "adjust", String.valueOf((int)((int)(d2 * 2.236936))));
            }
        } else {
            xmlSerializer.attribute(null, "adjust", String.valueOf((int)sensor.getAdjust()));
        }
        xmlSerializer.attribute(null, "windGrade", String.valueOf((int)0));
        xmlSerializer.attribute(null, "windName", String.valueOf((int)0));
        xmlSerializer.attribute(null, "windUnit", String.valueOf((int)sensor.getWindUnit()));
        xmlSerializer.endTag(null, "para");
        this.c(xmlSerializer, b.g(this.b, sensor, file, n2));
        xmlSerializer.endTag(null, "sensor");
        return true;
    }

    private boolean h(XmlSerializer xmlSerializer, Temperature temperature, File file, int n2) {
        xmlSerializer.startTag(null, "temperature");
        xmlSerializer.attribute(null, "action", "add");
        xmlSerializer.startTag(null, "message");
        xmlSerializer.attribute(null, "space", String.valueOf((int)temperature.getSpace()));
        boolean bl = temperature.isMultiLine();
        String string2 = "1";
        String string3 = bl ? string2 : "0";
        xmlSerializer.attribute(null, "multiple", string3);
        xmlSerializer.attribute(null, "tempUnit", String.valueOf((int)temperature.getTempUnit()));
        if (!temperature.isSwapArea()) {
            string2 = "0";
        }
        xmlSerializer.attribute(null, "swapArea", string2);
        xmlSerializer.attribute(null, "adjust", String.valueOf((int)temperature.getAdjust()));
        xmlSerializer.endTag(null, "message");
        xmlSerializer.startTag(null, "backReadUseText");
        String string4 = temperature.isShowFixedText() && !TextUtils.isEmpty((CharSequence)temperature.getTopText()) ? temperature.getTopText() : "";
        xmlSerializer.attribute(null, "toptext", string4);
        xmlSerializer.endTag(null, "backReadUseText");
        this.c(xmlSerializer, b.h(this.b, temperature, file, n2));
        xmlSerializer.endTag(null, "temperature");
        return true;
    }

    private boolean i(XmlSerializer xmlSerializer, Text text, Area area, File file, int n2) {
        xmlSerializer.startTag(null, "text");
        xmlSerializer.attribute(null, "action", "add");
        if (text.getBackgroundColor() != 0) {
            xmlSerializer.attribute(null, "background", r.l((int)text.getBackgroundColor()));
        }
        xmlSerializer.startTag(null, "effect");
        xmlSerializer.attribute(null, "holdTime", Integer.toString((int)(10 * text.getHoldTime())));
        if (text.isSingleLine()) {
            xmlSerializer.attribute(null, "in", Integer.toString((int)text.getTextEffectType().getValue()));
            xmlSerializer.attribute(null, "out", Integer.toString((int)text.getTextEffectType().getValue()));
        } else {
            xmlSerializer.attribute(null, "in", Integer.toString((int)text.getInEffectType().getValue()));
            xmlSerializer.attribute(null, "out", Integer.toString((int)text.getOutEffectType().getValue()));
        }
        xmlSerializer.attribute(null, "outSpeed", Integer.toString((int)text.getEffectSpeed().ordinal()));
        xmlSerializer.attribute(null, "inSpeed", Integer.toString((int)text.getEffectSpeed().ordinal()));
        xmlSerializer.endTag(null, "effect");
        List<HDFileInfo> list = b.i(this.b, text, area, file, n2);
        if (list == null && !TextUtils.isEmpty((CharSequence)text.getContent())) {
            this.d = 3;
            return false;
        }
        xmlSerializer.startTag(null, "pageCount");
        String string2 = "0";
        String string3 = list == null ? string2 : Integer.toString((int)list.size());
        xmlSerializer.text(string3);
        xmlSerializer.endTag(null, "pageCount");
        if (list != null) {
            this.c(xmlSerializer, list);
        }
        xmlSerializer.startTag(null, "singleMode");
        String string4 = text.isSingleLine() ? "1" : string2;
        xmlSerializer.text(string4);
        xmlSerializer.endTag(null, "singleMode");
        if (text.isSingleLine() || text.getInEffectType() == ShowEffectsType.MOVE_UP_CONTINUOUSLY) {
            xmlSerializer.startTag(null, "continuousMove");
            if (text.isHeadTail()) {
                string2 = "1";
            }
            xmlSerializer.attribute(null, "headCloseToTail", string2);
            xmlSerializer.attribute(null, "speed", Integer.toString((int)text.getEffectSpeed().ordinal()));
            xmlSerializer.attribute(null, "playType", text.getPlayType().getValue());
            int n3 = a.a[text.getPlayType().ordinal()];
            if (n3 != 1) {
                if (n3 == 2) {
                    xmlSerializer.attribute(null, "byTime", Integer.toString((int)text.getByTime()));
                }
            } else {
                xmlSerializer.attribute(null, "byCount", Integer.toString((int)text.getByCount()));
            }
            xmlSerializer.endTag(null, "continuousMove");
        }
        xmlSerializer.endTag(null, "text");
        return true;
    }

    private boolean j(XmlSerializer xmlSerializer, Time time, File file, int n2) {
        xmlSerializer.startTag(null, "time");
        xmlSerializer.attribute(null, "action", "add");
        xmlSerializer.startTag(null, "displayStyleMessage");
        xmlSerializer.attribute(null, "Space", String.valueOf((int)time.getSpace()));
        xmlSerializer.attribute(null, "DispalyStyle", String.valueOf((int)time.getDisplayStyle()));
        xmlSerializer.attribute(null, "TargetTime", String.valueOf((long)time.getTargetTimeStamp()));
        boolean bl = time.isMultiLine();
        String string2 = "1";
        String string3 = bl ? string2 : "0";
        xmlSerializer.attribute(null, "DisplayMode", string3);
        xmlSerializer.attribute(null, "TimeMode", String.valueOf((int)time.getTimeMode()));
        xmlSerializer.attribute(null, "TimeZone", String.valueOf((Object)time.getTimeZone()));
        if (time.isShowFixedText() && !TextUtils.isEmpty((CharSequence)time.getTopText())) {
            xmlSerializer.attribute(null, "TopText", q0.m((String)time.getTopText()));
        }
        xmlSerializer.endTag(null, "displayStyleMessage");
        xmlSerializer.startTag(null, "checkShow");
        String string4 = time.isShowHour() ? string2 : "0";
        xmlSerializer.attribute(null, "Hour", string4);
        String string5 = time.isShowMinute() ? string2 : "0";
        xmlSerializer.attribute(null, "Minute", string5);
        String string6 = time.isShowDay() ? string2 : "0";
        xmlSerializer.attribute(null, "Day", string6);
        if (!time.isShowSecond()) {
            string2 = "0";
        }
        xmlSerializer.attribute(null, "SetSecond", string2);
        xmlSerializer.endTag(null, "checkShow");
        this.c(xmlSerializer, b.j(this.b, time, file, n2));
        xmlSerializer.endTag(null, "time");
        return true;
    }

    private boolean k(XmlSerializer xmlSerializer, Video video, Area area, File file) {
        String string2 = l.a((Uri)Uri.parse((String)video.getFilePath()), (Context)this.b);
        if (string2 != null && string2.length() != 0) {
            File file2 = new File(string2);
            if (!file2.exists()) {
                this.d = 2;
                return false;
            }
            xmlSerializer.startTag(null, "video");
            xmlSerializer.attribute(null, "action", "add");
            int n2 = (int)(0.5f + (float)a0.a((String)string2) / 1000.0f);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("addVideoNode: duration = ");
            stringBuilder.append(n2);
            stringBuilder.append("s");
            w.b((String)"FcSendXmlHelper", (String)stringBuilder.toString());
            Point point = a0.b((String)string2);
            if (!"D15".equals((Object)this.e) && !"D35".equals((Object)this.e) || point.x <= 16 * area.getWidth() && point.y <= 16 * area.getHeight()) {
                xmlSerializer.startTag(null, "playParams");
                String string3 = "1";
                xmlSerializer.attribute(null, "playTimes", string3);
                xmlSerializer.attribute(null, "duration", String.valueOf((int)n2));
                if (!video.isKeepAspectRadio()) {
                    string3 = "0";
                }
                xmlSerializer.attribute(null, "aspectRatio", string3);
                xmlSerializer.endTag(null, "playParams");
                xmlSerializer.startTag(null, "resolution");
                xmlSerializer.attribute(null, "width", String.valueOf((int)point.x));
                xmlSerializer.attribute(null, "height", String.valueOf((int)point.y));
                xmlSerializer.endTag(null, "resolution");
                String string4 = l.c((File)file2);
                if (this.c) {
                    String string5 = file2.getName().substring(1 + file2.getName().lastIndexOf("."));
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string4);
                    stringBuilder2.append(".");
                    stringBuilder2.append(string5);
                    file2 = o.f((File)file2, (File)file, (String)stringBuilder2.toString());
                }
                xmlSerializer.startTag(null, "file");
                xmlSerializer.attribute(null, "size", Long.toString((long)l.d((File)file2)));
                if (this.c) {
                    xmlSerializer.attribute(null, "path", file2.getName());
                    this.a.put((Object)string4, (Object)new String(file2.getName().getBytes("UTF-8"), "UTF-8"));
                } else {
                    xmlSerializer.attribute(null, "path", file2.getAbsolutePath());
                    this.a.put((Object)string4, (Object)new String(file2.getAbsolutePath().getBytes("UTF-8"), "UTF-8"));
                }
                xmlSerializer.attribute(null, "md5", string4);
                xmlSerializer.endTag(null, "file");
                if (this.c) {
                    this.t(file2.getAbsolutePath(), "*/*");
                }
                xmlSerializer.endTag(null, "video");
                return true;
            }
            this.d = 6;
            return false;
        }
        this.d = 2;
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void l(int var1_1, int var2_2) {
        block16 : {
            block17 : {
                var3_3 = this.b.getString(2131821226);
                if (var2_2 >= 20) {
                    var20_4 = var1_1 / var3_3.length();
                    Double.isNaN((double)var20_4);
                    var4_5 = (int)(var20_4 + 0.5);
                } else {
                    var4_5 = var2_2;
                }
                var5_6 = e.a((int)var1_1, (int)var2_2, (int)var4_5, (String)var3_3);
                var6_7 = new StringBuilder();
                var6_7.append(o.u((Context)this.b));
                var6_7.append(File.separator);
                var6_7.append("notMatchImg.png");
                var10_8 = var6_7.toString();
                var11_9 = new File(var10_8);
                if (var11_9.exists()) {
                    var11_9.delete();
                }
                var12_10 = null;
                var13_11 = new FileOutputStream(var10_8);
                var5_6.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)var13_11);
                var13_11.close();
                catch (Throwable var16_12) {
                    var12_10 = var13_11;
                    break block16;
                }
                catch (IOException var14_15) {
                    var12_10 = var13_11;
                    ** GOTO lbl-1000
                }
                catch (Throwable var16_13) {
                    break block16;
                }
                catch (IOException var14_16) {
                    // empty catch block
                }
lbl-1000: // 2 sources:
                {
                    var14_17.printStackTrace();
                    ** if (var12_10 == null) goto lbl-1000
                }
lbl-1000: // 1 sources:
                {
                    var12_10.close();
                }
lbl-1000: // 2 sources:
                {
                    break block17;
                }
                catch (IOException var15_18) {
                    var15_18.printStackTrace();
                }
            }
            this.t(var10_8, "image/png");
            return;
        }
        if (var12_10 == null) throw var16_14;
        try {
            var12_10.close();
            throw var16_14;
        }
        catch (IOException var17_19) {
            var17_19.printStackTrace();
        }
        throw var16_14;
    }

    private String[] q(String string2, AnimationText animationText) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        Paint paint = new Paint();
        paint.setTextSize((float)animationText.getFontSize());
        Typeface typeface = k.f((Context)HuiduApplication.c()).g(animationText.getFontName());
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        int n2 = animationText.getFontSize();
        int n3 = 0;
        while (n3 < string2.length()) {
            int n4 = n3 + 1;
            int n5 = Math.round((float)paint.measureText(string2, n3, n4));
            if (animationText.isItalic()) {
                int n6 = animationText.getEffectType();
                if (!(n6 == 0 || n6 == 1 ? n3 != string2.length() - 1 : n6 == 2 || n6 == 3)) {
                    n5 += (int)(0.3f * (float)n5);
                }
            } else {
                ++n5;
            }
            if (n3 != 0) {
                stringBuilder.append("|");
                stringBuilder2.append("|");
            }
            stringBuilder.append(n5);
            stringBuilder2.append(n2);
            n3 = n4;
        }
        String[] arrstring = new String[]{stringBuilder.toString(), stringBuilder2.toString()};
        return arrstring;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean r(String string2) {
        try {
            fileInputStream = new FileInputStream(string2);
            stringBuilder = new StringBuilder();
        }
        catch (IOException iOException2) {
            iOException = iOException2;
            stringBuilder = null;
            ** GOTO lbl21
        }
        catch (FileNotFoundException fileNotFoundException3) {
            fileNotFoundException = fileNotFoundException3;
            stringBuilder = null;
            ** GOTO lbl23
        }
        for (i2 = 0; i2 < 6; ++i2) {
            block7 : {
                try {
                    stringBuilder.append((char)fileInputStream.read());
                    continue;
                }
                catch (IOException iOException3) {
                }
                catch (FileNotFoundException fileNotFoundException2) {
                    break block7;
                }
lbl21: // 2 sources:
                iOException.printStackTrace();
                break;
            }
            fileNotFoundException.printStackTrace();
            break;
        }
        if (stringBuilder.toString().toUpperCase().startsWith("GIF") == false) return false;
        return true;
    }

    private boolean s(Screen screen) {
        if (screen == null) {
            return true;
        }
        for (int i2 = 0; i2 < screen.getChildCount(); ++i2) {
            Program program = (Program)screen.getChildAt(i2);
            for (int i3 = 0; i3 < program.getChildCount(); ++i3) {
                if (((Area)program.getChildAt(i3)).getChildCount() <= 0) continue;
                return false;
            }
        }
        return true;
    }

    private void t(String string2, String string3) {
        new z(this.b, string2, string3).a();
    }

    private File v(Area area, String string2, String string3) {
        int n2 = area.isBorderEnable() ? area.getBorderSize() : 0;
        int n3 = area.getWidth();
        int n4 = n2 * 2;
        return new File(m0.b.c((String)string2, (int)(n3 - n4), (int)(area.getHeight() - n4), (String)string3));
    }

    /*
     * Exception decompiling
     */
    public File m(Screen var1_1, File var2_2, boolean var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 18[FORLOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:923)
        throw new IllegalStateException("Decompilation failed");
    }

    public int n() {
        return this.d;
    }

    public HashMap<String, String> o() {
        return this.a;
    }

    public String p() {
        StringBuilder stringBuilder = this.f;
        if (stringBuilder != null) {
            return stringBuilder.toString();
        }
        return "";
    }

    public void u(boolean bl) {
        this.c = bl;
    }

}


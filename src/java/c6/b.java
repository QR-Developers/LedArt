/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.util.Log
 *  b6.a
 *  com.huidu.applibs.entity.model.fullcolor.HwConfig
 *  com.huidu.applibs.entity.model.fullcolor.HwConfig$RawData
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  org.w3c.dom.Element
 */
package c6;

import android.os.Handler;
import android.util.Log;
import b6.a;
import c6.c;
import com.huidu.applibs.entity.model.fullcolor.HwConfig;
import java.util.ArrayList;
import java.util.List;
import m5.o0;
import m5.p0;
import org.w3c.dom.Element;

public class b
extends c {
    public b(Handler handler, int n) {
        super(handler, n);
    }

    private void n(Element element) {
        Element element2;
        Log.d((String)"SdkHwSet", (String)"onReceiveGetHwConfigAnswer: ");
        HwConfig hwConfig = new HwConfig();
        Element[] arrelement = p0.d(element, "Raw");
        if (arrelement != null) {
            ArrayList arrayList = new ArrayList();
            for (Element element3 : arrelement) {
                String string = p0.f(element3, "Value");
                boolean bl = p0.b(element3, "Save");
                boolean bl2 = p0.b(element3, "ModifyBrightness");
                boolean bl3 = p0.b(element3, "ModifyRotation");
                HwConfig.RawData rawData = new HwConfig.RawData();
                rawData.setValue(string);
                rawData.setSave(bl);
                rawData.setModifyBrightness(bl2);
                rawData.setModifyRotation(bl3);
                arrayList.add((Object)rawData);
            }
            hwConfig.setRawDataList((List)arrayList);
        }
        if ((element2 = p0.c(element, "Screen")) != null) {
            int n = p0.e(element2, "Rotation");
            int n2 = p0.e(element2, "FramebufferWidth");
            int n3 = p0.e(element2, "FramebufferHeight");
            int n4 = p0.e(element2, "ScreenWidth");
            int n5 = p0.e(element2, "ScreenHeight");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onReceiveGetHwConfigAnswer: rotation: ");
            stringBuilder.append(n);
            stringBuilder.append(", width: ");
            stringBuilder.append(n4);
            stringBuilder.append(", height: ");
            stringBuilder.append(n5);
            stringBuilder.append(", fbWidth: ");
            stringBuilder.append(n2);
            stringBuilder.append(", fbHeight: ");
            stringBuilder.append(n3);
            Log.d((String)"SdkHwSet", (String)stringBuilder.toString());
            hwConfig.setRotation(n);
            hwConfig.setFrameBufferWidth(n2);
            hwConfig.setFrameBufferHeight(n3);
            hwConfig.setScreenWidth(n4);
            hwConfig.setScreenHeight(n5);
        }
        this.g(a.a, (Object)hwConfig);
    }

    private void o(Element element) {
        Log.d((String)"SdkHwSet", (String)"onReceiveSetHwConfigAnswer: ");
        this.g(a.a, null);
    }

    @Override
    protected void f(Element element, boolean bl) {
        String string = o0.i(element, "method");
        if ("GetBoxHwConfig".equals((Object)string)) {
            this.n(element);
            return;
        }
        if ("ReplaceBoxHwConfig".equals((Object)string)) {
            this.o(element);
        }
    }

    public void m() {
        this.h(this.l("    <in method=\"GetBoxHwConfig\"/>\n"), false);
    }

    public void p(List<HwConfig.RawData> list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("    <in method=\"ReplaceBoxHwConfig\">\n");
        for (HwConfig.RawData rawData : list) {
            stringBuilder.append("        <Raw ");
            stringBuilder.append("Value = \"");
            stringBuilder.append(rawData.getValue());
            stringBuilder.append("\" ");
            stringBuilder.append("Save = \"");
            stringBuilder.append(rawData.isSave());
            stringBuilder.append("\" ");
            stringBuilder.append("/>\n");
        }
        stringBuilder.append("    </in>\n");
        this.h(this.l(stringBuilder.toString()), true);
    }
}


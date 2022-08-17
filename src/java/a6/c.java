/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  com.huidu.applibs.entity.model.fullcolor.LightInfo
 *  com.huidu.applibs.entity.model.fullcolor.LightInfo$LightInfoMode
 *  com.huidu.applibs.entity.model.fullcolor.LightInfo$LightPloyItem
 *  com.huidu.applibs.entity.model.fullcolor.LightInfo$LightSensorItem
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  org.w3c.dom.Element
 *  org.w3c.dom.Node
 *  org.w3c.dom.NodeList
 *  y5.a
 *  z5.h$b
 */
package a6;

import a6.a;
import android.os.Handler;
import com.huidu.applibs.entity.model.fullcolor.LightInfo;
import java.util.ArrayList;
import java.util.List;
import m5.o0;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import z5.h;

public class c
extends a {
    public c(Handler handler, int n) {
        super(handler, n);
    }

    private void k0(Element element, String string) {
        LightInfo lightInfo = new LightInfo();
        String string2 = o0.j(element, "mode", "value");
        int n = o0.f(element, "default", "value");
        int n2 = o0.f(element, "sensor", "min");
        int n3 = o0.f(element, "sensor", "max");
        int n4 = o0.f(element, "sensor", "time");
        lightInfo.setMode(LightInfo.LightInfoMode.map((String)string2));
        lightInfo.setDefaultValue(n);
        LightInfo.LightSensorItem lightSensorItem = new LightInfo.LightSensorItem();
        lightSensorItem.setMinLevel(n2);
        lightSensorItem.setMaxLevel(n3);
        lightSensorItem.setAdjustTime(n4);
        lightInfo.setSensor(lightSensorItem);
        ArrayList arrayList = new ArrayList();
        NodeList nodeList = element.getElementsByTagName("item");
        for (int j = 0; j < nodeList.getLength(); ++j) {
            Element element2 = (Element)nodeList.item(j);
            boolean bl = o0.e(element2, "enable");
            String string3 = o0.i(element2, "start");
            int n5 = o0.e(element2, "percent");
            LightInfo.LightPloyItem lightPloyItem = new LightInfo.LightPloyItem();
            boolean bl2 = true;
            if (bl != bl2) {
                bl2 = false;
            }
            lightPloyItem.setEnable(bl2);
            lightPloyItem.setStart(y5.a.n((String)string3));
            lightPloyItem.setPercent(n5);
            arrayList.add((Object)lightPloyItem);
        }
        lightInfo.setPloys((List)arrayList);
        this.m((Object)lightInfo);
    }

    private void l0(Element element, String string) {
        if (!"0".equals((Object)string) && !"kSuccess".equals((Object)string)) {
            this.B(h.b.x, -1);
            return;
        }
        this.A(h.b.a);
    }

    @Override
    protected void f0(Element element) {
        String string = o0.i(element, "method");
        String string2 = o0.i(element, "result");
        if ("SetLuminancePloy".equals((Object)string)) {
            this.l0(element, string2);
            return;
        }
        if ("GetLuminancePloy".equals((Object)string)) {
            this.k0(element, string2);
        }
    }

    public void j0() {
        c c2 = this;
        synchronized (c2) {
            this.T(this.e0("    <in method=\"GetLuminancePloy\"/>\n"), false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m0(LightInfo lightInfo) {
        c c2 = this;
        synchronized (c2) {
            StringBuilder stringBuilder = new StringBuilder();
            String string = "    <in method=\"SetLuminancePloy\">\n        <mode value=\"##mode\"/>\n        <default value=\"##default\"/>\n        <ploy>\n".replace((CharSequence)"##mode", (CharSequence)lightInfo.getMode().value()).replace((CharSequence)"##default", (CharSequence)String.valueOf((int)lightInfo.getDefaultValue()));
            String string2 = "        </ploy>\n        <sensor min=\"##min\" max=\"##max\" time=\"##time\"/>\n    </in>\n".replace((CharSequence)"##min", (CharSequence)String.valueOf((int)lightInfo.getSensor().getMinLevel())).replace((CharSequence)"##max", (CharSequence)String.valueOf((int)lightInfo.getSensor().getMaxLevel())).replace((CharSequence)"##time", (CharSequence)String.valueOf((int)lightInfo.getSensor().getAdjustTime()));
            stringBuilder.append(string);
            List list = lightInfo.getPloys();
            if (list != null && list.size() > 0) {
                for (int j = 0; j < list.size(); ++j) {
                    LightInfo.LightPloyItem lightPloyItem = (LightInfo.LightPloyItem)list.get(j);
                    String string3 = lightPloyItem.isEnable() ? "1" : "0";
                    stringBuilder.append("            <item enable=\"##enable\" start=\"##start\" percent=\"##percent\"/>\n".replace((CharSequence)"##enable", (CharSequence)string3).replace((CharSequence)"##start", (CharSequence)y5.a.f((int)lightPloyItem.getStart())).replace((CharSequence)"##percent", (CharSequence)String.valueOf((int)lightPloyItem.getPercent())));
                }
            }
            stringBuilder.append(string2);
            this.T(this.e0(stringBuilder.toString()), true);
            return;
        }
    }
}


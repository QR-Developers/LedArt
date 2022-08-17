/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  com.huidu.applibs.entity.model.fullcolor.VolumeInfo
 *  com.huidu.applibs.entity.model.fullcolor.VolumeInfo$VolumeInfoMode
 *  com.huidu.applibs.entity.model.fullcolor.VolumeInfo$VolumePloyItem
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
import com.huidu.applibs.entity.model.fullcolor.VolumeInfo;
import java.util.ArrayList;
import java.util.List;
import m5.o0;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import z5.h;

public class g
extends a {
    public g(Handler handler, int n) {
        super(handler, n);
    }

    private void k0(Element element, String string) {
        VolumeInfo volumeInfo = new VolumeInfo();
        String string2 = o0.j(element, "mode", "value");
        int n = o0.f(element, "volume", "precent");
        volumeInfo.setMode(VolumeInfo.VolumeInfoMode.map((String)string2));
        volumeInfo.setDefaultValue(n);
        ArrayList arrayList = new ArrayList();
        NodeList nodeList = element.getElementsByTagName("item");
        for (int j = 0; j < nodeList.getLength(); ++j) {
            Element element2 = (Element)nodeList.item(j);
            boolean bl = o0.e(element2, "enable");
            String string3 = o0.i(element2, "start");
            int n2 = o0.e(element2, "percent");
            VolumeInfo.VolumePloyItem volumePloyItem = new VolumeInfo.VolumePloyItem();
            boolean bl2 = true;
            if (bl != bl2) {
                bl2 = false;
            }
            volumePloyItem.setEnable(bl2);
            volumePloyItem.setStart(y5.a.n((String)string3));
            volumePloyItem.setPercent(n2);
            arrayList.add((Object)volumePloyItem);
        }
        volumeInfo.setPloys((List)arrayList);
        this.m((Object)volumeInfo);
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
        if ("SetSystemVolume".equals((Object)string)) {
            this.l0(element, string2);
            return;
        }
        if ("GetSystemVolume".equals((Object)string)) {
            this.k0(element, string2);
        }
    }

    public void j0() {
        g g2 = this;
        synchronized (g2) {
            this.T(this.e0("    <in method=\"GetSystemVolume\"/>\n"), false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m0(VolumeInfo volumeInfo) {
        g g2 = this;
        synchronized (g2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("    <in method=\"SetSystemVolume\">\n        <mode value=\"##mode\"/>\n        <volume precent=\"##default\"/>\n        <ploy>\n".replace((CharSequence)"##mode", (CharSequence)volumeInfo.getMode().value()).replace((CharSequence)"##default", (CharSequence)String.valueOf((int)volumeInfo.getDefaultValue())));
            List list = volumeInfo.getPloys();
            if (list != null && list.size() > 0) {
                for (int j = 0; j < list.size(); ++j) {
                    VolumeInfo.VolumePloyItem volumePloyItem = (VolumeInfo.VolumePloyItem)list.get(j);
                    String string = volumePloyItem.isEnable() ? "1" : "0";
                    stringBuilder.append("            <item enable=\"##enable\" start=\"##start\" percent=\"##percent\"/>\n".replace((CharSequence)"##enable", (CharSequence)string).replace((CharSequence)"##start", (CharSequence)y5.a.f((int)volumePloyItem.getStart())).replace((CharSequence)"##percent", (CharSequence)String.valueOf((int)volumePloyItem.getPercent())));
                }
            }
            stringBuilder.append("        </ploy>\n    </in>\n");
            this.T(this.e0(stringBuilder.toString()), true);
            return;
        }
    }
}


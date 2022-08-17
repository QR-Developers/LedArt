/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  com.huidu.applibs.entity.model.fullcolor.ScreenOnOffInfo
 *  com.huidu.applibs.entity.model.fullcolor.ScreenOnOffInfo$ScreenOnOffItem
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
import com.huidu.applibs.entity.model.fullcolor.ScreenOnOffInfo;
import java.util.ArrayList;
import java.util.List;
import m5.o0;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import z5.h;

public class e
extends a {
    public e(Handler handler, int n) {
        super(handler, n);
    }

    private void k0(Element element, String string) {
        if (!"0".equals((Object)string) && !"kSuccess".equals((Object)string)) {
            this.B(h.b.x, -1);
            return;
        }
        this.A(h.b.a);
    }

    private void l0(Element element, String string) {
        ScreenOnOffInfo screenOnOffInfo = new ScreenOnOffInfo();
        boolean bl = o0.b(element, "open", "enable");
        boolean bl2 = o0.b(element, "ploy", "enable");
        screenOnOffInfo.setOpen(bl);
        screenOnOffInfo.setEnable(bl2);
        NodeList nodeList = element.getElementsByTagName("item");
        ArrayList arrayList = new ArrayList();
        for (int j = 0; j < nodeList.getLength(); ++j) {
            Element element2 = (Element)nodeList.item(j);
            boolean bl3 = o0.e(element2, "enable");
            String string2 = o0.i(element2, "start");
            String string3 = o0.i(element2, "end");
            ScreenOnOffInfo.ScreenOnOffItem screenOnOffItem = new ScreenOnOffInfo.ScreenOnOffItem();
            boolean bl4 = true;
            if (bl3 != bl4) {
                bl4 = false;
            }
            screenOnOffItem.setEnable(bl4);
            screenOnOffItem.setStart(y5.a.n((String)string2));
            screenOnOffItem.setEnd(y5.a.n((String)string3));
            arrayList.add((Object)screenOnOffItem);
        }
        screenOnOffInfo.setPloys((List)arrayList);
        this.m((Object)screenOnOffInfo);
    }

    private void m0(Element element, String string) {
        if (!"0".equals((Object)string) && !"kSuccess".equals((Object)string)) {
            this.B(h.b.x, -1);
            return;
        }
        this.A(h.b.a);
    }

    private void n0(Element element, String string) {
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
        if ("GetSwitchTime".equals((Object)string)) {
            this.l0(element, string2);
            return;
        }
        if ("SetSwitchTime".equals((Object)string)) {
            this.n0(element, string2);
            return;
        }
        if ("OpenScreen".equals((Object)string)) {
            this.m0(element, string2);
            return;
        }
        if ("CloseScreen".equals((Object)string)) {
            this.k0(element, string2);
        }
    }

    public void j0() {
        this.T(this.e0("    <in method=\"GetSwitchTime\"/>\n"), false);
    }

    public void o0(ScreenOnOffInfo screenOnOffInfo) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("    <in method=\"SetSwitchTime\">\n        <open enable=\"##open\"/>\n        <ploy enable=\"##ploy\">\n".replace((CharSequence)"##open", (CharSequence)String.valueOf((boolean)screenOnOffInfo.isOpen())).replace((CharSequence)"##ploy", (CharSequence)String.valueOf((boolean)screenOnOffInfo.isEnable())));
        for (int j = 0; j < screenOnOffInfo.getPloys().size(); ++j) {
            ScreenOnOffInfo.ScreenOnOffItem screenOnOffItem = (ScreenOnOffInfo.ScreenOnOffItem)screenOnOffInfo.getPloys().get(j);
            String string = screenOnOffItem.isEnable() ? "1" : "0";
            stringBuilder.append("            <item enable=\"##enable\" start=\"##start\" end=\"##end\"/>\n".replace((CharSequence)"##enable", (CharSequence)string).replace((CharSequence)"##start", (CharSequence)y5.a.f((int)screenOnOffItem.getStart())).replace((CharSequence)"##end", (CharSequence)y5.a.f((int)screenOnOffItem.getEnd())));
        }
        stringBuilder.append("        </ploy>\n    </in>\n");
        this.T(this.e0(stringBuilder.toString()), true);
    }
}


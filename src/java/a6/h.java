/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.util.Log
 *  com.huidu.applibs.entity.model.fullcolor.WifiInfo
 *  com.huidu.applibs.entity.model.fullcolor.WifiInfo$ApInfo
 *  com.huidu.applibs.entity.model.fullcolor.WifiInfo$StationInfo
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  org.w3c.dom.Element
 *  y5.a
 *  z5.h$b
 */
package a6;

import a6.a;
import android.os.Handler;
import android.util.Log;
import com.huidu.applibs.entity.model.fullcolor.WifiInfo;
import java.util.ArrayList;
import java.util.List;
import m5.o0;
import org.w3c.dom.Element;
import z5.h;

public class h
extends a {
    private boolean D;
    private String E;
    private String F;

    public h(Handler handler, int n) {
        super(handler, n);
    }

    private void k0(Element element) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10 = "value";
        int n = o0.f(element, "mode", string10);
        boolean bl = o0.b(element, "valid", string10);
        boolean bl2 = o0.b(element, "enable", string10);
        Element element2 = o0.c(element, "ap");
        String string11 = "ssid";
        String string12 = o0.j(element2, string11, string10);
        String string13 = "passwd";
        String string14 = o0.j(element2, string13, string10);
        int n2 = o0.f(element2, "channel", string10);
        String string15 = o0.j(element2, "encryption", string10);
        String string16 = "dhcp";
        boolean bl3 = o0.f(element2, string16, "auto");
        boolean bl4 = o0.b(element2, "isHideSsid", string10);
        String string17 = "ip";
        String string18 = o0.j(element2, string17, "addr");
        String string19 = o0.j(element2, "netmask", "addr");
        String string20 = "gateway";
        String string21 = o0.j(element2, string20, "addr");
        String string22 = o0.j(element2, "dns", "addr");
        String string23 = "mac";
        String string24 = o0.j(element2, string23, "addr");
        Element element3 = o0.c(element, "station");
        int n3 = o0.f(element3, "current", "index");
        Element[] arrelement = o0.d(o0.c(element3, "list"), "item");
        ArrayList arrayList = new ArrayList();
        String string25 = "";
        if (arrelement != null) {
            String string26;
            String string27;
            String string28;
            String string29;
            String string30;
            String string31;
            String string32;
            String string33 = string31 = (string30 = (string28 = (string32 = (string29 = (string27 = (string26 = string25))))));
            for (int j = 0; j < arrelement.length; ++j) {
                String string34 = o0.j(arrelement[j], string11, string10);
                String string35 = string11;
                String string36 = o0.j(arrelement[j], string13, string10);
                String string37 = string13;
                Element element4 = arrelement[j];
                int n4 = n3;
                String string38 = o0.j(element4, "signal", string10);
                String string39 = o0.j(arrelement[j], string16, "auto");
                String string40 = string16;
                String string41 = o0.j(arrelement[j], string23, string10);
                String string42 = string10;
                String string43 = o0.j(arrelement[j], string17, "addr");
                String string44 = string17;
                String string45 = o0.j(arrelement[j], "netmask", "addr");
                String string46 = string23;
                String string47 = o0.j(arrelement[j], string20, "addr");
                String string48 = string20;
                String string49 = o0.j(arrelement[j], "dns", "addr");
                Element[] arrelement2 = arrelement;
                WifiInfo.StationInfo stationInfo = new WifiInfo.StationInfo();
                stationInfo.setSSID(string34);
                stationInfo.setPassword(string36);
                stationInfo.setSignal(string38);
                stationInfo.setDhcp(string39);
                stationInfo.setMac(string41);
                stationInfo.setDns(string49);
                stationInfo.setGateway(string47);
                stationInfo.setIp(string43);
                stationInfo.setNetmask(string45);
                arrayList.add((Object)stationInfo);
                if (j == n4) {
                    string30 = string45;
                    string25 = string34;
                    string28 = string43;
                    string27 = string38;
                    string26 = string36;
                    string31 = string47;
                    string29 = string39;
                    string33 = string49;
                    string32 = string41;
                }
                n3 = n4;
                string11 = string35;
                string13 = string37;
                string16 = string40;
                string10 = string42;
                string17 = string44;
                string23 = string46;
                string20 = string48;
                arrelement = arrelement2;
            }
            string6 = string25;
            string8 = string26;
            string7 = string27;
            string5 = string29;
            string3 = string32;
            string2 = string28;
            string = string30;
            string4 = string31;
            string9 = string33;
        } else {
            string = string2 = (string4 = (string9 = (string3 = (string5 = (string7 = (string8 = (string6 = string25)))))));
        }
        WifiInfo wifiInfo = new WifiInfo();
        wifiInfo.setMode(n);
        wifiInfo.setValid(bl);
        wifiInfo.setEnable(bl2);
        WifiInfo.ApInfo apInfo = new WifiInfo.ApInfo();
        apInfo.setSSID(string12);
        apInfo.setPassword(string14);
        apInfo.setChannel(n2);
        apInfo.setEncryption(string15);
        boolean bl5 = true;
        if (bl3 != bl5) {
            bl5 = false;
        }
        apInfo.setDhcp(bl5);
        apInfo.setHideSsid(bl4);
        apInfo.setIp(string18);
        apInfo.setNetmask(string19);
        apInfo.setGateway(string21);
        apInfo.setDns(string22);
        apInfo.setMac(string24);
        wifiInfo.setAp(apInfo);
        WifiInfo.StationInfo stationInfo = new WifiInfo.StationInfo();
        stationInfo.setSSID(string6);
        stationInfo.setPassword(string8);
        stationInfo.setSignal(string7);
        stationInfo.setDhcp(string5);
        stationInfo.setMac(string3);
        stationInfo.setDns(string9);
        stationInfo.setGateway(string4);
        stationInfo.setIp(string2);
        stationInfo.setNetmask(string);
        stationInfo.setDropDownList((List)arrayList);
        wifiInfo.setStationInfo(stationInfo);
        if (this.D) {
            this.D = false;
            apInfo.setPassword(this.E);
            this.l0(wifiInfo);
            return;
        }
        this.m((Object)wifiInfo);
    }

    @Override
    protected void A(h.b b2) {
        if (b2 == h.b.f && "SetWifiInfo".equals((Object)this.F) && this.C) {
            b2 = h.b.a;
        }
        z5.h.super.A(b2);
    }

    @Override
    protected void f0(Element element) {
        String string = o0.i(element, "method");
        if ("GetWifiInfo".equals((Object)string)) {
            this.k0(element);
            return;
        }
        if ("SetWifiInfo".equals((Object)string)) {
            this.A(h.b.a);
        }
    }

    public void j0() {
        this.T(this.e0("    <in method=\"GetWifiInfo\"/>\n"), false);
        this.F = "GetWifiInfo";
    }

    public void l0(WifiInfo wifiInfo) {
        String string = "    <in method=\"SetWifiInfo\">\n        <mode value=\"##mode\"/>\n        <modifyEnable />\n        <ap>\n            <ssid value=\"##ap_ssid\"/>\n            <passwd value=\"##ap_passwd\"/>\n            <channel value=\"##ap_channel\"/>\n            <encryption value=\"##ap_en\"/>\n            <isHideSsid value=\"##ap_hideSsid\"/>\n            <dhcp auto=\"##ap_dhcp\"/>\n            <ip addr=\"##ap_ip\"/>\n            <netmask addr=\"##ap_netmask\"/>\n            <gateway addr=\"##ap_gateway\"/>\n            <dns addr=\"##ap_dns\"/>\n        </ap>\n        <station>\n            <ssid value=\"##sta_ssid\"/>\n            <passwd value=\"##sta_passwd\"/>\n            <mac value=\"##sta_mac\"/>\n            <dhcp auto=\"##sta_dhcp\"/>\n            <ip addr=\"##sta_ip\"/>\n            <netmask addr=\"##sta_netmask\"/>\n            <gateway addr=\"##sta_gateway\"/>\n            <dns addr=\"##sta_dns\"/>\n        </station>\n    </in>\n".replace((CharSequence)"##mode", (CharSequence)String.valueOf((int)wifiInfo.getMode()));
        WifiInfo.ApInfo apInfo = wifiInfo.getAp();
        String string2 = string.replace((CharSequence)"##ap_ssid", (CharSequence)y5.a.o((String)apInfo.getSSID())).replace((CharSequence)"##ap_passwd", (CharSequence)y5.a.o((String)apInfo.getPassword())).replace((CharSequence)"##ap_channel", (CharSequence)String.valueOf((int)apInfo.getChannel())).replace((CharSequence)"##ap_en", (CharSequence)apInfo.getEncryption());
        String string3 = apInfo.isHideSsid() ? "true" : "false";
        String string4 = string2.replace((CharSequence)"##ap_hideSsid", (CharSequence)string3);
        String string5 = apInfo.isDhcp() ? "1" : "0";
        String string6 = string4.replace((CharSequence)"##ap_dhcp", (CharSequence)string5).replace((CharSequence)"##ap_ip", (CharSequence)apInfo.getIp()).replace((CharSequence)"##ap_netmask", (CharSequence)apInfo.getNetmask()).replace((CharSequence)"##ap_gateway", (CharSequence)apInfo.getGateway()).replace((CharSequence)"##ap_dns", (CharSequence)apInfo.getDns());
        WifiInfo.StationInfo stationInfo = wifiInfo.getStationInfo();
        String string7 = string6.replace((CharSequence)"##sta_ssid", (CharSequence)stationInfo.getSSID()).replace((CharSequence)"##sta_passwd", (CharSequence)stationInfo.getPassword()).replace((CharSequence)"##sta_mac", (CharSequence)stationInfo.getMac()).replace((CharSequence)"##sta_dhcp", (CharSequence)stationInfo.isDhcp()).replace((CharSequence)"##sta_ip", (CharSequence)stationInfo.getIp()).replace((CharSequence)"##sta_netmask", (CharSequence)stationInfo.getNetmask()).replace((CharSequence)"##sta_gateway", (CharSequence)stationInfo.getGateway()).replace((CharSequence)"##sta_dns", (CharSequence)stationInfo.getDns());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setWifiInfo: +++");
        stringBuilder.append(string7);
        Log.d((String)"PnWifi", (String)stringBuilder.toString());
        this.T(this.e0(string7), true);
        this.F = "SetWifiInfo";
    }

    public void m0(String string) {
        this.j0();
        this.D = true;
        this.E = string;
    }
}


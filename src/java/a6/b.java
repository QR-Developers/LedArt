/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  com.huidu.applibs.entity.model.fullcolor.TimeInfo
 *  com.huidu.applibs.entity.model.fullcolor.TimeInfo$SyncType
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  org.w3c.dom.Element
 *  y5.a
 *  z5.h$b
 */
package a6;

import a6.a;
import android.os.Handler;
import com.huidu.applibs.entity.model.fullcolor.TimeInfo;
import m5.o0;
import org.w3c.dom.Element;
import z5.h;

public class b
extends a {
    public b(Handler handler, int n) {
        super(handler, n);
    }

    private void k0(Element element, String string) {
        String string2 = o0.j(element, "timezone", "value");
        boolean bl = o0.b(element, "summer", "enable");
        String string3 = o0.j(element, "sync", "value");
        String string4 = o0.j(element, "time", "value");
        TimeInfo timeInfo = new TimeInfo();
        timeInfo.setTimeZone(string2);
        timeInfo.setSummer(bl);
        timeInfo.setSyncType(TimeInfo.SyncType.parse((String)string3));
        timeInfo.setTime(y5.a.m((String)string4));
        this.m((Object)timeInfo);
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
        if ("SetTimeInfo".equals((Object)string)) {
            this.l0(element, string2);
            return;
        }
        if ("GetTimeInfo".equals((Object)string)) {
            this.k0(element, string2);
        }
    }

    public void j0() {
        b b2 = this;
        synchronized (b2) {
            this.T(this.e0("    <in method=\"GetTimeInfo\"/>\n"), false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m0(TimeInfo timeInfo) {
        b b2 = this;
        synchronized (b2) {
            String string = "    <in method=\"SetTimeInfo\">\n        <timezone value=\"##timezone\"/>\n        <summer enable=\"##summer\"/>\n        <sync value=\"##sync\"/>\n        <time value=\"##time\"/>\n    </in>\n".replace((CharSequence)"##timezone", (CharSequence)String.valueOf((Object)timeInfo.getTimeZone()));
            String string2 = timeInfo.isSummer() ? "true" : "false";
            String string3 = string.replace((CharSequence)"##summer", (CharSequence)string2).replace((CharSequence)"##sync", (CharSequence)TimeInfo.SyncType.valueOf((TimeInfo.SyncType)timeInfo.getSyncType()));
            String string4 = "";
            if (timeInfo.isEnableTime()) {
                string4 = y5.a.e((long)timeInfo.getTime());
            }
            this.T(this.e0(string3.replace((CharSequence)"##time", (CharSequence)string4)), true);
            return;
        }
    }
}


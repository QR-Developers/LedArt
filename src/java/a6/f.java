/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.util.Base64
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.w3c.dom.Element
 *  z5.h$b
 */
package a6;

import a6.a;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import m5.o0;
import m5.q0;
import org.w3c.dom.Element;
import z5.h;

public class f
extends a {
    public f(Handler handler, int n) {
        super(handler, n);
    }

    private void k0(Element element, String string) {
        this.m(String.valueOf((boolean)o0.b(element, "enable", "value")));
    }

    private void l0(Element element, String string) {
        String string2 = o0.j(element, "name", "value");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onReceiveGetDeviceNameAnswer: ");
        stringBuilder.append(string2);
        Log.d((String)"PnSystemEnv", (String)stringBuilder.toString());
        this.m(string2);
    }

    private void m0(Element element, String string) {
        this.m(o0.j(element, "status", "value"));
    }

    private void n0(Element element, String string) {
        if (!"0".equals((Object)string) && !"kSuccess".equals((Object)string)) {
            this.B(h.b.x, -1);
            return;
        }
        this.A(h.b.a);
    }

    private void o0(Element element, String string) {
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
        if ("GetDeviceName".equals((Object)string)) {
            this.l0(element, string2);
            return;
        }
        if ("SetDeviceName".equals((Object)string)) {
            this.o0(element, string2);
            return;
        }
        if ("GetPlayStatus".equals((Object)string)) {
            this.m0(element, string2);
            return;
        }
        if ("SetDeviceLockerPassword".equals((Object)string)) {
            this.n0(element, string2);
            return;
        }
        if ("GetDeviceLockerEnable".equals((Object)string)) {
            this.k0(element, string2);
        }
    }

    public void j0() {
        this.T(this.e0("    <in method=\"GetDeviceLockerEnable\"/>\n"), false);
    }

    public void p0(String string) {
        this.T(this.e0("    <in method=\"SetDeviceLockerPassword\">\n        <password value=\"##password\"/>\n    </in>\n".replace((CharSequence)"##password", (CharSequence)Base64.encodeToString((byte[])string.getBytes(), (int)2))), true);
    }

    public void q0(String string) {
        this.T(this.e0("    <in method=\"SetDeviceName\">\n        <name value=\"##name\"/>\n    </in>\n".replace((CharSequence)"##name", (CharSequence)q0.m(string))), true);
    }

    public void r0() {
        this.T(this.e0("    <in method=\"GetDeviceName\"/>\n"), true);
    }
}


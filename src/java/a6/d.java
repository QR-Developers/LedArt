/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  com.huidu.applibs.entity.a
 *  com.huidu.applibs.entity.model.fullcolor.FullColorCard
 *  com.huidu.applibs.entity.model.fullcolor.ScreenInfo
 *  java.lang.Object
 *  java.lang.String
 *  l5.b
 *  org.w3c.dom.Element
 *  z5.h$b
 */
package a6;

import a6.a;
import android.os.Handler;
import com.huidu.applibs.entity.model.fullcolor.FullColorCard;
import com.huidu.applibs.entity.model.fullcolor.ScreenInfo;
import l5.b;
import m5.o0;
import org.w3c.dom.Element;
import z5.h;

public class d
extends a {
    private ScreenInfo D = new ScreenInfo();

    public d(Handler handler, int n) {
        super(handler, n);
    }

    private void k0(Element element, boolean bl) {
        int n = o0.f(element, "status", "value");
        this.D.setStatus(n);
        this.D.setDeviceLocked(this.f);
        ScreenInfo screenInfo = this.D;
        boolean bl2 = this.s >= 16777222;
        screenInfo.setSupportDeviceLock(bl2);
        if (!bl) {
            this.m((Object)this.D);
        }
    }

    private void l0(Element element, boolean bl) {
        com.huidu.applibs.entity.a a2;
        int n = o0.f(element, "mode", "value");
        int n2 = o0.f(element, "sync", "value");
        int n3 = o0.f(element, "size", "value");
        int n4 = o0.f(element, "index", "value");
        long l = o0.h(element, "space", "value");
        long l2 = o0.h(element, "total", "value");
        int n5 = o0.f(element, "rotation", "value");
        int n6 = o0.f(element, "width", "value");
        int n7 = o0.f(element, "height", "value");
        this.D.setMode(n);
        ScreenInfo screenInfo = this.D;
        boolean bl2 = n2 == 1;
        screenInfo.setSync(bl2);
        this.D.setSize(n3);
        this.D.setIndex(n4);
        this.D.setSpace(l);
        this.D.setTotal(l2);
        this.D.setRotation(n5);
        this.D.setWidth(n6);
        this.D.setHeight(n7);
        this.D.setDeviceLocked(this.f);
        ScreenInfo screenInfo2 = this.D;
        int n8 = this.s;
        boolean bl3 = false;
        if (n8 >= 16777222) {
            bl3 = true;
        }
        screenInfo2.setSupportDeviceLock(bl3);
        if (this.c != null && (a2 = b.d().b(this.c)) instanceof FullColorCard) {
            FullColorCard fullColorCard = (FullColorCard)a2;
            fullColorCard.setAvailableSpace(l);
            fullColorCard.setTotalSpace(l2);
        }
        if (!bl) {
            this.m((Object)this.D);
        }
    }

    @Override
    protected void g0(Element element, boolean bl) {
        String string = o0.i(element, "method");
        String string2 = o0.i(element, "result");
        if (!"0".equals((Object)string2) && !"kSuccess".equals((Object)string2)) {
            this.B(h.b.x, -1);
            return;
        }
        if ("GetScreenInfo".equals((Object)string)) {
            this.l0(element, bl);
            return;
        }
        if ("GetPlayStatus".equals((Object)string)) {
            this.k0(element, bl);
        }
    }

    public void j0() {
        d d2 = this;
        synchronized (d2) {
            this.T(this.e0("    <in method=\"GetScreenInfo\"/>\n    <in method=\"GetPlayStatus\"/>\n"), false);
            return;
        }
    }
}


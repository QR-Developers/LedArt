/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.util.Log
 *  b6.d
 *  b6.d$a
 *  c1.j$a
 *  cn.huidu.hdset.HDSet
 *  com.huidu.applibs.entity.model.fullcolor.FullColorCard
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  w0.d
 *  x0.r
 */
package c1;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import b6.d;
import c1.h;
import c1.i;
import c1.j;
import cn.huidu.hdset.HDSet;
import com.huidu.applibs.entity.model.fullcolor.FullColorCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import x0.r;

public class j
implements Handler.Callback {
    private String a;
    private String b;
    private String c;
    private d d;
    private String e;
    private List<String> f = new ArrayList();
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private Handler l = new Handler(Looper.getMainLooper(), (Handler.Callback)this);
    private b m;
    private int n;
    private boolean o;

    private int A() {
        return this.z() * (this.h / this.i);
    }

    private boolean I() {
        j j2 = this;
        synchronized (j2) {
            String string2;
            boolean bl = this.d != null && (string2 = this.e) != null;
            return bl;
        }
    }

    private /* synthetic */ void L(int n2) {
        b b2 = this.m;
        if (b2 != null) {
            b2.b(n2);
        }
    }

    private /* synthetic */ void M(int n2) {
        b b2 = this.m;
        if (b2 != null) {
            b2.a(n2);
        }
    }

    private void O(String string2) {
        j j2 = this;
        synchronized (j2) {
            try {
                this.e = string2;
                if (!this.f.isEmpty()) {
                    for (String string3 : this.f) {
                        this.d.z(string3.replace((CharSequence)"##GUID", (CharSequence)string2));
                    }
                    this.f.clear();
                }
                return;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void P(w0.d d2) {
        j j2 = this;
        synchronized (j2) {
            boolean bl = TextUtils.isEmpty((CharSequence)this.a);
            if (bl) {
                return;
            }
            List list = d2.h();
            if (d2.c() == 0 && list != null && !list.isEmpty()) {
                if (!this.I()) {
                    this.f.addAll((Collection)list);
                    this.l();
                    return;
                }
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    this.d.z(string2.replace((CharSequence)"##GUID", (CharSequence)this.e));
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("error code: ");
            stringBuilder.append(d2.c());
            stringBuilder.append(", xml list: ");
            stringBuilder.append((Object)list);
            Log.d((String)"HDSetSmartSetting", (String)stringBuilder.toString());
            this.R(-1);
            return;
        }
    }

    private void R(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setErrorCode: ");
        stringBuilder.append(n2);
        Log.d((String)"HDSetSmartSetting", (String)stringBuilder.toString());
        this.l.post((Runnable)new h(this, n2));
    }

    private void U(int n2) {
        this.l.post((Runnable)new i(this, n2));
    }

    public static /* synthetic */ void a(j j2, int n2) {
        j2.L(n2);
    }

    public static /* synthetic */ void b(j j2, int n2) {
        j2.M(n2);
    }

    static /* synthetic */ void c(j j2, String string2) {
        j2.O(string2);
    }

    static /* synthetic */ void d(j j2) {
        j2.n();
    }

    static /* synthetic */ void e(j j2, int n2) {
        j2.R(n2);
    }

    static /* synthetic */ String f(j j2) {
        return j2.c;
    }

    static /* synthetic */ int g(j j2) {
        return j2.n;
    }

    static /* synthetic */ int h(j j2, int n2) {
        j2.n = n2;
        return n2;
    }

    static /* synthetic */ void i(j j2, int n2) {
        j2.U(n2);
    }

    private void l() {
        j j2 = this;
        synchronized (j2) {
            if (this.d == null) {
                d d2;
                this.d = d2 = new d();
                d2.F(this.a);
                this.d.H(this.b);
                this.d.E(true);
                this.d.D((d.a)new a(this));
            }
            this.d.I();
            return;
        }
    }

    private w0.d m(r r2) {
        return HDSet.o((String)this.c, (r)r2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        j j2 = this;
        synchronized (j2) {
            this.e = null;
            d d2 = this.d;
            if (d2 != null) {
                d2.D(null);
                this.d.j();
                this.d = null;
            }
            return;
        }
    }

    public void B() {
        this.n = 1;
        this.P(this.m(new r("initBasic")));
    }

    public void C(int n2) {
        r r2 = new r("initColor");
        r2.a("index", String.valueOf((int)n2));
        this.P(this.m(r2));
    }

    public void D(int n2) {
        r r2 = new r("initDataPolarity");
        r2.a("index", String.valueOf((int)n2));
        this.P(this.m(r2));
    }

    public void E(int n2) {
        r r2 = new r("initOEPolarity");
        r2.a("index", String.valueOf((int)n2));
        this.P(this.m(r2));
    }

    public void F() {
        this.P(this.m(new r("iniRGBHeight")));
    }

    public void G() {
        this.P(this.m(new r("initScanType")));
    }

    public void H() {
        w0.d d2 = this.m(new r("intTrace"));
        r r2 = d2.e();
        if (r2 != null && !this.o) {
            this.j = r2.d();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("initTrace: null point count: ");
            stringBuilder.append(this.j);
            Log.d((String)"HDSetSmartSetting", (String)stringBuilder.toString());
        }
        this.P(d2);
    }

    public boolean J() {
        return this.k;
    }

    public boolean K(int n2) {
        return n2 == this.A();
    }

    public void N(int n2) {
        this.l.removeMessages(1);
        if (n2 >= this.A()) {
            r r2 = new r("nextPointTrace");
            r2.a("nextPoint", String.valueOf((int)n2));
            this.P(this.m(r2));
            return;
        }
        Message message = Message.obtain();
        message.what = 1;
        message.arg1 = n2;
        this.l.sendMessageDelayed(message, 100L);
    }

    public void Q(b b2) {
        this.m = b2;
    }

    public void S(int n2) {
        this.j = n2;
        this.o = true;
        r r2 = new r("setNullPointCount");
        r2.a("nullPointCount", String.valueOf((int)n2));
        this.P(this.m(r2));
    }

    public void T(String string2) {
        this.b = string2;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("handleMessage: NEXT_POINT_TRACE ");
            stringBuilder.append(message.arg1);
            Log.d((String)"HDSetSmartSetting", (String)stringBuilder.toString());
            r r2 = new r("nextPointTrace");
            r2.a("nextPoint", String.valueOf((int)message.arg1));
            this.P(this.m(r2));
            return true;
        }
        return false;
    }

    public void j(FullColorCard fullColorCard, String string2) {
        this.a = fullColorCard != null ? fullColorCard.getIpAddress() : "";
        this.c = string2;
    }

    public void k() {
        this.n = 4;
        this.P(this.m(new r("exit")));
    }

    public void o(int n2, int n3, int n4, boolean bl, boolean bl2, int n5) {
        this.g = n3;
        r r2 = new r("ensureBasic");
        r2.a("moduleType", String.valueOf((int)n2));
        r2.a("cellWidth", String.valueOf((int)n3));
        r2.a("driveChipType", String.valueOf((int)n4));
        String string2 = "1";
        String string3 = bl ? string2 : "0";
        r2.a("greaterThan16Scan", string3);
        if (!bl2) {
            string2 = "0";
        }
        r2.a("greaterThan32Scan", string2);
        r2.a("decode", String.valueOf((int)n5));
        this.P(this.m(r2));
    }

    public void p(int n2, int n3, int n4, int n5) {
        r r2 = new r("ensureColor");
        r2.a("stateA", String.valueOf((int)n2));
        r2.a("stateB", String.valueOf((int)n3));
        r2.a("stateC", String.valueOf((int)n4));
        r2.a("stateD", String.valueOf((int)n5));
        this.P(this.m(r2));
    }

    public void q(int n2) {
        r r2 = new r("ensureDataPolarity");
        r2.a("state", String.valueOf((int)n2));
        w0.d d2 = this.m(r2);
        r r3 = d2.e();
        if (r3 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ensureDataPolarity: next step: ");
            stringBuilder.append(r3.c());
            Log.d((String)"HDSetSmartSetting", (String)stringBuilder.toString());
            this.k = "initColor".equals((Object)r3.c());
        }
        this.P(d2);
    }

    public void r(int n2) {
        r r2 = new r("ensureOEPolarity");
        r2.a("state", String.valueOf((int)n2));
        this.P(this.m(r2));
    }

    public void s(int n2, int n3) {
        this.h = n2;
        r r2 = new r("ensureRGBHeight");
        r2.a("height", String.valueOf((int)n2));
        r2.a("interlaceLine", String.valueOf((int)n3));
        this.P(this.m(r2));
    }

    public void t(int n2) {
        this.i = n2;
        r r2 = new r("ensureScanType");
        r2.a("line", String.valueOf((int)n2));
        this.P(this.m(r2));
    }

    public void u(List<int[]> list, List<Point> list2) {
        this.n = 2;
        r r2 = new r("ensureTrace");
        r2.f(list);
        r2.e(list2);
        this.P(this.m(r2));
    }

    public void v() {
        if (this.n != 0) {
            Log.w((String)"HDSetSmartSetting", (String)"finishTrace: previous action not finish!");
        }
        this.n = 3;
        this.P(this.m(new r("finishTrace")));
    }

    public int w() {
        return this.j;
    }

    public int x() {
        return this.g;
    }

    public int y() {
        return this.h;
    }

    public int z() {
        return this.g * this.i + this.j;
    }

    public static interface b {
        public void a(int var1);

        public void b(int var1);
    }

}


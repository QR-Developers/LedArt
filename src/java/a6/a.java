/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a6.a$a
 *  android.os.Handler
 *  java.io.ByteArrayOutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  org.w3c.dom.Document
 *  org.w3c.dom.Element
 *  org.w3c.dom.Node
 *  org.w3c.dom.NodeList
 *  z5.e
 *  z5.e$a
 *  z5.h$b
 */
package a6;

import a6.a;
import android.os.Handler;
import java.io.ByteArrayOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import m5.o0;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import z5.e;
import z5.h;

public class a
extends h {
    protected String A;
    protected boolean B;
    protected boolean C;
    private short w = 0;
    private byte[] x;
    private int y;
    private ByteArrayOutputStream z;

    public a(Handler handler, int n2) {
        super(handler, n2);
    }

    private void M() {
        e.a a2 = this.t;
        e.a a3 = e.a.e0;
        if (a2 != a3) {
            this.A(h.b.i);
            return;
        }
        if (this.o != a3.b()) {
            this.A(h.b.g);
            return;
        }
        this.t = e.a.d0;
        this.V();
    }

    private void N() {
        e.a a2 = this.t;
        e.a a3 = e.a.d0;
        if (a2 != a3) {
            this.A(h.b.i);
            return;
        }
        if (this.o <= a3.b()) {
            this.A(h.b.g);
            return;
        }
        int n2 = 2 + this.k.position();
        int n3 = this.o - a3.b();
        this.z.write(this.k.array(), n2, n3);
        this.t = e.a.e0;
        this.U();
    }

    private void O() {
        e.a a2 = this.t;
        e.a a3 = e.a.g0;
        if (a2 != a3) {
            this.A(h.b.i);
            return;
        }
        if (this.o != a3.b()) {
            this.A(h.b.g);
            return;
        }
        this.t = e.a.b0;
        this.C = true;
    }

    private void P() {
        e.a a2 = this.t;
        if (a2 != e.a.d0 && a2 != e.a.f0) {
            this.A(h.b.i);
            return;
        }
        if (this.o != e.a.f0.b()) {
            this.A(h.b.g);
            return;
        }
        this.t = e.a.g0;
        this.W();
    }

    private void Q() {
        e.a a2 = this.t;
        e.a a3 = e.a.c0;
        if (a2 != a3) {
            this.A(h.b.i);
            return;
        }
        if (this.o != a3.b()) {
            this.A(h.b.g);
            return;
        }
        this.t = e.a.d0;
        this.V();
    }

    private void R() {
        e.a a2 = this.t;
        e.a a3 = e.a.b0;
        if (a2 != a3) {
            this.A(h.b.i);
            return;
        }
        if (this.o != a3.b()) {
            this.A(h.b.g);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.z;
        if (byteArrayOutputStream == null) {
            this.z = new ByteArrayOutputStream();
        } else {
            byteArrayOutputStream.reset();
        }
        this.t = e.a.c0;
        this.Y();
    }

    private void S() {
        e.a a2 = this.t;
        e.a a3 = e.a.m0;
        if (a2 != a3) {
            this.A(h.b.i);
            return;
        }
        if (this.o != a3.b()) {
            this.A(h.b.g);
            return;
        }
        if (this.k.getInt() != 0) {
            this.A(h.b.l);
            return;
        }
        this.E();
        if (this.s >= 16777222) {
            this.t = e.a.n0;
            this.x();
            return;
        }
        this.a0();
    }

    private void U() {
        if (this.t != e.a.e0) {
            this.A(h.b.i);
            return;
        }
        e.x().e(this.l, this.w);
        this.v();
        this.t = e.a.d0;
    }

    private void V() {
        e.a a2 = this.t;
        e.a a3 = e.a.d0;
        if (a2 != a3) {
            this.A(h.b.i);
            return;
        }
        if (this.y >= this.x.length) {
            this.t = e.a.f0;
            this.X();
            return;
        }
        this.l.clear();
        short s2 = a3.b();
        int n2 = 9216 - s2;
        byte[] arrby = this.x;
        int n3 = arrby.length;
        int n4 = this.y;
        int n5 = n3 - n4;
        if (n5 <= n2) {
            n2 = n5;
        }
        System.arraycopy((Object)arrby, (int)n4, (Object)this.l.array(), (int)s2, (int)n2);
        this.y = n2 + this.y;
        short s3 = (short)(n2 + s2);
        this.l.putShort(s3);
        this.l.putShort(a3.c());
        this.l.putShort(this.w);
        this.l.position(0);
        this.l.limit((int)s3);
        this.v();
        this.t = e.a.e0;
    }

    private void W() {
        if (this.t != e.a.g0) {
            this.A(h.b.i);
            return;
        }
        e.x().f(this.l, this.w);
        this.v();
        this.i0(this.z.toString());
    }

    private void X() {
        if (this.t != e.a.f0) {
            this.A(h.b.i);
            return;
        }
        e.x().g(this.l, this.w);
        this.v();
        this.t = e.a.g0;
    }

    private void Y() {
        if (this.t != e.a.c0) {
            this.A(h.b.i);
            return;
        }
        e.x().h(this.l, this.w);
        this.v();
        this.t = e.a.d0;
    }

    private void Z() {
        this.C = false;
        if (this.t != e.a.b0) {
            this.A(h.b.i);
            return;
        }
        e.x().i(this.l, this.w, (short)0);
        this.v();
        this.t = e.a.c0;
    }

    private void a0() {
        this.b0("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<sdk guid=\"##GUID\">\n    <in method=\"GetIFVersion\">\n        <version value=\"1000000\"/>\n    </in>\n</sdk>");
    }

    private void c0() {
        if (this.t != e.a.l0) {
            this.A(h.b.i);
            return;
        }
        e.x().t(this.l);
        this.v();
        this.t = e.a.m0;
    }

    private void d0() {
        this.b0("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<sdk guid=\"##GUID\">\n    <in method=\"TryLock\"/>\n</sdk>");
    }

    protected void T(String string, boolean bl) {
        this.A = string;
        this.B = bl;
        this.D();
    }

    protected void b0(String string) {
        this.x = string.getBytes();
        this.y = 0;
        this.w = 0;
        this.t = e.a.b0;
        this.Z();
    }

    @Override
    protected void d(boolean bl) {
        if (!bl && this.B) {
            String string = this.d;
            if (string != null && string.length() != 0) {
                this.A(h.b.F);
                return;
            }
            this.A(h.b.E);
            return;
        }
        this.a0();
    }

    protected String e0(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<sdk guid=\"##GUID\">\n");
        stringBuilder.append(string);
        stringBuilder.append("</sdk>");
        return stringBuilder.toString();
    }

    protected void f0(Element element) {
    }

    @Override
    protected void g() {
        switch (a.a[this.u.ordinal()]) {
            default: {
                this.A(h.b.s);
                return;
            }
            case 7: {
                this.P();
                return;
            }
            case 6: {
                this.N();
                return;
            }
            case 5: {
                this.R();
                return;
            }
            case 4: {
                this.O();
                return;
            }
            case 3: {
                this.M();
                return;
            }
            case 2: {
                this.Q();
                return;
            }
            case 1: 
        }
        this.S();
    }

    protected void g0(Element element, boolean bl) {
        this.f0(element);
    }

    protected void h0() {
        this.b0(this.A);
    }

    protected void i0(String string) {
        Document document = o0.k(string);
        if (document == null) {
            this.A(h.b.c);
            return;
        }
        NodeList nodeList = document.getDocumentElement().getElementsByTagName("out");
        int n2 = nodeList.getLength();
        for (int i2 = 0; i2 < n2; ++i2) {
            Element element = (Element)nodeList.item(i2);
            String string2 = element.getAttribute("method");
            String string3 = o0.i(element, "result");
            if (!"kPermissionDenied".equals((Object)string3) && !"49".equals((Object)string3)) {
                if ("GetIFVersion".equals((Object)string2)) {
                    this.d0();
                    continue;
                }
                if ("TryLock".equals((Object)string2)) {
                    this.h0();
                    continue;
                }
                boolean bl = i2 != n2 - 1;
                this.g0(element, bl);
                continue;
            }
            if (this.s >= 16777222) {
                this.A(h.b.E);
                return;
            }
            this.A(h.b.D);
            break;
        }
    }

    @Override
    protected void w() {
        this.t = e.a.l0;
        this.c0();
    }
}


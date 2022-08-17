/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.text.TextUtils
 *  android.util.Log
 *  b6.a
 *  b6.d$a
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.w3c.dom.Document
 *  org.w3c.dom.Element
 *  org.w3c.dom.Node
 *  org.w3c.dom.NodeList
 */
package c6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import b6.a;
import b6.d;
import m5.o0;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class c
implements d.a {
    protected d a;
    protected boolean b;
    protected String c;
    protected Handler d;
    protected int e;
    protected String f;
    protected String g;
    protected boolean h;

    public c(Handler handler, int n2) {
        d d2;
        this.a = d2 = new d();
        d2.D(this);
        this.d = handler;
        this.e = n2;
        this.h = false;
        this.b = false;
    }

    private String e(String string) {
        String string2;
        if (string.contains((CharSequence)"##GUID") && (string2 = this.g) != null) {
            string = string.replace((CharSequence)"##GUID", (CharSequence)string2);
        }
        return string;
    }

    public void a(d d2, String string) {
        Log.d((String)"TransmitModule", (String)"onSdkConnected: ");
        this.g = string;
        this.h = true;
        String string2 = this.c;
        if (string2 != null) {
            this.a.z(this.e(string2));
            this.c = null;
        }
    }

    public void b(d d2, String string) {
        Document document = o0.k(string);
        if (document == null) {
            this.g(a.d, null);
            return;
        }
        Element element = document.getDocumentElement();
        if (!"sdk".equalsIgnoreCase(element.getTagName())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onReceiveMessage: invalid root tag: ");
            stringBuilder.append(element.getTagName());
            Log.d((String)"TransmitModule", (String)stringBuilder.toString());
            return;
        }
        NodeList nodeList = element.getChildNodes();
        int n2 = nodeList.getLength();
        for (int i2 = 0; i2 < n2; ++i2) {
            Node node = nodeList.item(i2);
            if (!(node instanceof Element)) continue;
            Element element2 = (Element)node;
            element2.getAttribute("method");
            String string2 = o0.i(element2, "result");
            if (!TextUtils.isEmpty((CharSequence)string2) && !"kUnsupportMethod".equals((Object)string2)) {
                if (!"kPermissionDenied".equals((Object)string2) && !"49".equals((Object)string2)) {
                    if (!"0".equals((Object)string2) && !"kSuccess".equals((Object)string2)) {
                        this.g(a.e, null);
                        return;
                    }
                    boolean bl = i2 != n2 - 1;
                    this.f(element2, bl);
                    continue;
                }
                this.g(a.g, null);
                return;
            }
            this.g(a.f, null);
            break;
        }
    }

    public void c(d d2, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onError: ");
        stringBuilder.append(n2);
        Log.d((String)"TransmitModule", (String)stringBuilder.toString());
        this.d();
        this.g(n2, null);
    }

    public void d() {
        Log.d((String)"TransmitModule", (String)"End transmit.");
        this.h = false;
        this.a.j();
    }

    protected void f(Element element, boolean bl) {
        throw null;
    }

    protected void g(int n2, Object object) {
        if (!this.b) {
            this.d();
        }
        Message message = Message.obtain();
        message.what = this.e;
        message.arg1 = n2;
        message.arg2 = 1000;
        message.obj = object;
        Bundle bundle = new Bundle();
        bundle.putString("cardId", this.f);
        message.setData(bundle);
        this.d.sendMessage(message);
    }

    protected void h(String string, boolean bl) {
        this.a.E(bl);
        if (this.h) {
            this.a.z(this.e(string));
            return;
        }
        this.c = string;
        this.a.I();
    }

    public void i(String string) {
        this.f = string;
    }

    public void j(String string) {
        this.a.F(string);
    }

    public void k(String string) {
        this.a.H(string);
    }

    protected String l(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<sdk guid=\"##GUID\">\n");
        stringBuilder.append(string);
        stringBuilder.append("</sdk>");
        return stringBuilder.toString();
    }
}


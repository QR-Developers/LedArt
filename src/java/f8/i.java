/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.b0
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  u7.j
 */
package f8;

import a8.b0;
import a8.v;
import java.net.Proxy;
import u7.j;

public final class i {
    public static final i a = new i();

    private i() {
    }

    private final boolean b(b0 b02, Proxy.Type type) {
        return !b02.f() && type == Proxy.Type.HTTP;
    }

    public final String a(b0 b02, Proxy.Type type) {
        j.f((Object)b02, (String)"request");
        j.f((Object)type, (String)"proxyType");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b02.g());
        stringBuilder.append(' ');
        i i2 = a;
        if (i2.b(b02, type)) {
            stringBuilder.append((Object)b02.j());
        } else {
            stringBuilder.append(i2.c(b02.j()));
        }
        stringBuilder.append(" HTTP/1.1");
        String string = stringBuilder.toString();
        j.b((Object)string, (String)"StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(v v2) {
        j.f((Object)v2, (String)"url");
        String string = v2.d();
        String string2 = v2.f();
        if (string2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append('?');
            stringBuilder.append(string2);
            string = stringBuilder.toString();
        }
        return string;
    }
}


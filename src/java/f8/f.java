/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  u7.j
 */
package f8;

import u7.j;

public final class f {
    public static final f a = new f();

    private f() {
    }

    public static final boolean a(String string) {
        j.f((Object)string, (String)"method");
        return !j.a((Object)string, (Object)"GET") && !j.a((Object)string, (Object)"HEAD");
    }

    public static final boolean d(String string) {
        j.f((Object)string, (String)"method");
        return j.a((Object)string, (Object)"POST") || j.a((Object)string, (Object)"PUT") || j.a((Object)string, (Object)"PATCH") || j.a((Object)string, (Object)"PROPPATCH") || j.a((Object)string, (Object)"REPORT");
        {
        }
    }

    public final boolean b(String string) {
        j.f((Object)string, (String)"method");
        return true ^ j.a((Object)string, (Object)"PROPFIND");
    }

    public final boolean c(String string) {
        j.f((Object)string, (String)"method");
        return j.a((Object)string, (Object)"PROPFIND");
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.b0
 *  a8.d0
 *  b8.b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  u7.j
 *  z7.g
 */
package f8;

import a8.b0;
import a8.d0;
import a8.n;
import a8.o;
import a8.u;
import a8.v;
import b8.b;
import java.util.List;
import l8.h;
import u7.j;
import z7.g;

public final class e {
    static {
        h.a a2 = h.e;
        a2.b("\"\\");
        a2.b("\t ,=");
    }

    public static final boolean a(d0 d02) {
        j.f((Object)d02, (String)"$this$promisesBody");
        if (j.a((Object)d02.U().g(), (Object)"HEAD")) {
            return false;
        }
        int n2 = d02.G();
        if ((n2 < 100 || n2 >= 200) && n2 != 204 && n2 != 304) {
            return true;
        }
        if (b.s((d0)d02) == -1L) {
            return g.h((String)"chunked", (String)d0.L((d0)d02, (String)"Transfer-Encoding", null, (int)2, null), (boolean)true);
        }
        return true;
    }

    public static final void b(o o2, v v2, u u2) {
        j.f((Object)o2, (String)"$this$receiveHeaders");
        j.f((Object)v2, (String)"url");
        j.f((Object)u2, (String)"headers");
        if (o2 == o.a) {
            return;
        }
        List<n> list = n.n.e(v2, u2);
        if (list.isEmpty()) {
            return;
        }
        o2.a(v2, list);
    }
}


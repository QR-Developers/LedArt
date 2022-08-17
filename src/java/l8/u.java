/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  u7.j
 */
package l8;

import l8.t;
import u7.j;

public final class u {
    private static t a;
    private static long b;
    public static final u c;

    static {
        c = new u();
    }

    private u() {
    }

    public final void a(t t2) {
        j.f((Object)t2, (String)"segment");
        boolean bl = t2.f == null && t2.g == null;
        if (bl) {
            if (t2.d) {
                return;
            }
            u u2 = this;
            synchronized (u2) {
                long l3 = b;
                long l5 = 8192;
                if (l3 + l5 > 65536L) {
                    return;
                }
                long l6 = l3 + l5;
                b = l6;
                t2.f = a;
                t2.c = 0;
                t2.b = 0;
                a = t2;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final t b() {
        u u2 = this;
        synchronized (u2) {
            block4 : {
                t t2 = a;
                if (t2 == null) break block4;
                a = t2.f;
                t2.f = null;
                b -= (long)8192;
                return t2;
            }
            return new t();
        }
    }
}


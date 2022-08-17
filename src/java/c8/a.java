/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.a0
 *  a8.b0
 *  a8.c
 *  a8.d0
 *  a8.d0$a
 *  a8.e0
 *  a8.w
 *  a8.w$a
 *  b8.b
 *  c8.a$a
 *  c8.b
 *  c8.b$b
 *  java.io.Closeable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  u7.g
 *  u7.j
 */
package c8;

import a8.a0;
import a8.b0;
import a8.c;
import a8.d0;
import a8.e0;
import a8.u;
import a8.w;
import c8.a;
import c8.b;
import java.io.Closeable;
import u7.g;
import u7.j;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public final class a
implements w {
    public static final a a;

    static {
        a = new /* Unavailable Anonymous Inner Class!! */;
    }

    public a(c c2) {
    }

    public d0 a(w.a a2) {
        d0 d02;
        d0 d03;
        block9 : {
            j.f((Object)a2, (String)"chain");
            b b2 = new b.b(System.currentTimeMillis(), a2.S(), null).b();
            b0 b02 = b2.b();
            d03 = b2.a();
            if (b02 == null && d03 == null) {
                return new d0.a().r(a2.S()).p(a0.c).g(504).m("Unsatisfiable Request (only-if-cached)").b(b8.b.c).s(-1L).q(System.currentTimeMillis()).c();
            }
            if (b02 == null) {
                if (d03 == null) {
                    j.m();
                }
                return d03.Q().d(a.b(a, (d0)d03)).c();
            }
            d02 = a2.a(b02);
            if (d03 == null) break block9;
            if (d02 != null && d02.G() == 304) {
                d0.a a3 = d03.Q();
                a a4 = a;
                a3.k(a.a(a4, (u)d03.M(), (u)d02.M())).s(d02.V()).q(d02.T()).d(a.b(a4, (d0)d03)).n(a.b(a4, (d0)d02)).c();
                e0 e02 = d02.D();
                if (e02 == null) {
                    j.m();
                }
                e02.close();
                j.m();
                throw null;
            }
            e0 e03 = d03.D();
            if (e03 != null) {
                b8.b.j((Closeable)e03);
            }
        }
        if (d02 == null) {
            j.m();
        }
        d0.a a5 = d02.Q();
        a a6 = a;
        return a5.d(a.b(a6, (d0)d03)).n(a.b(a6, (d0)d02)).c();
    }
}


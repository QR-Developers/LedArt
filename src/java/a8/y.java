/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.c0
 *  a8.x
 *  a8.x$a
 *  a8.y$b
 *  a8.y$c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  l8.e
 *  l8.f
 *  u7.g
 *  u7.j
 */
package a8;

import a8.c0;
import a8.u;
import a8.x;
import a8.y;
import java.util.List;
import l8.e;
import l8.f;
import l8.h;
import u7.g;
import u7.j;

/*
 * Exception performing whole class analysis.
 */
public final class y
extends c0 {
    public static final x g;
    public static final x h;
    private static final byte[] i;
    private static final byte[] j;
    private static final byte[] k;
    public static final b l;
    private final x b;
    private long c;
    private final h d;
    private final x e;
    private final List<c> f;

    static {
        l = new /* Unavailable Anonymous Inner Class!! */;
        x.a a2 = x.g;
        g = a2.a("multipart/mixed");
        a2.a("multipart/alternative");
        a2.a("multipart/digest");
        a2.a("multipart/parallel");
        h = a2.a("multipart/form-data");
        byte[] arrby = new byte[]{58, 32};
        i = arrby;
        byte[] arrby2 = new byte[]{13, 10};
        j = arrby2;
        byte by = 45;
        byte[] arrby3 = new byte[]{by, by};
        k = arrby3;
    }

    public y(h h2, x x2, List<c> list) {
        j.f((Object)h2, (String)"boundaryByteString");
        j.f((Object)x2, (String)"type");
        j.f(list, (String)"parts");
        this.d = h2;
        this.e = x2;
        this.f = list;
        x.a a2 = x.g;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)x2);
        stringBuilder.append("; boundary=");
        stringBuilder.append(this.j());
        this.b = a2.a(stringBuilder.toString());
        this.c = -1L;
    }

    private final long k(f f2, boolean bl) {
        f f3 = bl ? (f2 = new e()) : null;
        int n2 = this.f.size();
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            long l3;
            x x2;
            c c2 = this.f.get(i2);
            u u2 = c2.d();
            c0 c02 = c2.a();
            if (f2 == null) {
                j.m();
            }
            f2.write(k);
            f2.n(this.d);
            f2.write(j);
            if (u2 != null) {
                int n3 = u2.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    f2.x(u2.b(i3)).write(i).x(u2.f(i3)).write(j);
                }
            }
            if ((x2 = c02.b()) != null) {
                f2.x("Content-Type: ").x(x2.toString()).write(j);
            }
            if ((l3 = c02.a()) != -1L) {
                f2.x("Content-Length: ").y(l3).write(j);
            } else if (bl) {
                if (f3 == null) {
                    j.m();
                }
                f3.D();
                return -1L;
            }
            byte[] arrby = j;
            f2.write(arrby);
            if (bl) {
                l2 += l3;
            } else {
                c02.i(f2);
            }
            f2.write(arrby);
        }
        if (f2 == null) {
            j.m();
        }
        byte[] arrby = k;
        f2.write(arrby);
        f2.n(this.d);
        f2.write(arrby);
        f2.write(j);
        if (bl) {
            if (f3 == null) {
                j.m();
            }
            l2 += f3.a0();
            f3.D();
        }
        return l2;
    }

    public long a() {
        long l2 = this.c;
        if (l2 == -1L) {
            this.c = l2 = this.k(null, true);
        }
        return l2;
    }

    public x b() {
        return this.b;
    }

    public void i(f f2) {
        j.f((Object)f2, (String)"sink");
        this.k(f2, false);
    }

    public final String j() {
        return this.d.u();
    }
}


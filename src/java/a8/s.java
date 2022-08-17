/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.c0
 *  a8.s$b
 *  a8.x
 *  a8.x$a
 *  b8.b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  l8.e
 *  l8.f
 *  u7.g
 *  u7.j
 */
package a8;

import a8.c0;
import a8.s;
import a8.x;
import java.util.List;
import l8.e;
import l8.f;
import u7.g;
import u7.j;

/*
 * Exception performing whole class analysis.
 */
public final class s
extends c0 {
    private static final x d;
    private final List<String> b;
    private final List<String> c;

    static {
        new /* Unavailable Anonymous Inner Class!! */;
        d = x.g.a("application/x-www-form-urlencoded");
    }

    public s(List<String> list, List<String> list2) {
        j.f(list, (String)"encodedNames");
        j.f(list2, (String)"encodedValues");
        this.b = b8.b.M(list);
        this.c = b8.b.M(list2);
    }

    private final long j(f f2, boolean bl) {
        e e2;
        if (bl) {
            e2 = new e();
        } else {
            if (f2 == null) {
                j.m();
            }
            e2 = f2.e();
        }
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                e2.h0(38);
            }
            e2.o0((String)this.b.get(i2));
            e2.h0(61);
            e2.o0((String)this.c.get(i2));
        }
        if (bl) {
            long l2 = e2.a0();
            e2.D();
            return l2;
        }
        return 0L;
    }

    public long a() {
        return this.j(null, true);
    }

    public x b() {
        return d;
    }

    public void i(f f2) {
        j.f((Object)f2, (String)"sink");
        this.j(f2, false);
    }
}


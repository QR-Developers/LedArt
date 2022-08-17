/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InterruptedIOException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.util.concurrent.TimeUnit
 *  l8.z$a
 *  u7.g
 *  u7.j
 */
package l8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import l8.z;
import u7.g;
import u7.j;

public class z {
    public static final z d;
    private boolean a;
    private long b;
    private long c;

    static {
        new b(null);
        d = new a();
    }

    public z a() {
        this.a = false;
        return this;
    }

    public z b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public z d(long l3) {
        this.a = true;
        this.b = l3;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (!Thread.interrupted()) {
            if (this.a) {
                if (this.b - System.nanoTime() > 0L) {
                    return;
                }
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public z g(long l3, TimeUnit timeUnit) {
        j.f((Object)timeUnit, (String)"unit");
        boolean bl = l3 >= 0L;
        if (bl) {
            this.c = timeUnit.toNanos(l3);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("timeout < 0: ");
        stringBuilder.append(l3);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public long h() {
        return this.c;
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g4) {
            this();
        }
    }

}


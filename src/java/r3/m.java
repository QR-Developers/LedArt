/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  h4.f
 *  h4.j
 *  java.lang.Object
 *  java.util.Queue
 *  r3.m$a
 */
package r3;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import h4.f;
import h4.j;
import java.util.Queue;
import r3.m;

public class m<A, B> {
    private final f<b<A>, B> a;

    public m(long l2) {
        this.a = new a(this, l2);
    }

    @Nullable
    public B a(A a2, int n2, int n3) {
        b<A> b2 = b.a(a2, n2, n3);
        Object object = this.a.g(b2);
        b2.c();
        return (B)object;
    }

    public void b(A a2, int n2, int n3, B b2) {
        b<A> b3 = b.a(a2, n2, n3);
        this.a.k(b3, b2);
    }

    @VisibleForTesting
    static final class b<A> {
        private static final Queue<b<?>> d = j.f((int)0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        static <A> b<A> a(A a2, int n2, int n3) {
            Queue<b<?>> queue;
            Queue<b<?>> queue2 = queue = d;
            // MONITORENTER : queue2
            b<A> b2 = (b<A>)queue.poll();
            // MONITOREXIT : queue2
            if (b2 == null) {
                b2 = new b<A>();
            }
            b.super.b(a2, n2, n3);
            return b2;
        }

        private void b(A a2, int n2, int n3) {
            this.c = a2;
            this.b = n2;
            this.a = n3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void c() {
            Queue<b<?>> queue;
            Queue<b<?>> queue2 = queue = d;
            synchronized (queue2) {
                queue.offer((Object)this);
                return;
            }
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof b;
            boolean bl2 = false;
            if (bl) {
                b b2 = (b)object;
                int n2 = this.b;
                int n3 = b2.b;
                bl2 = false;
                if (n2 == n3) {
                    int n4 = this.a;
                    int n5 = b2.a;
                    bl2 = false;
                    if (n4 == n5) {
                        boolean bl3 = this.c.equals(b2.c);
                        bl2 = false;
                        if (bl3) {
                            bl2 = true;
                        }
                    }
                }
            }
            return bl2;
        }

        public int hashCode() {
            return 31 * (31 * this.a + this.b) + this.c.hashCode();
        }
    }

}


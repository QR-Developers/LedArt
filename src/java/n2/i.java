/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  n2.m
 */
package n2;

import n2.m;

public final class i
implements Runnable {
    public final /* synthetic */ m a;
    public final /* synthetic */ long b;

    public /* synthetic */ i(m m5, long l3) {
        this.a = m5;
        this.b = l3;
    }

    public final void run() {
        m.f((m)this.a, (long)this.b);
    }
}


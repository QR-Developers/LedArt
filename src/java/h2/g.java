/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.d0
 *  h2.h
 *  java.lang.Object
 *  java.lang.Runnable
 */
package h2;

import a8.d0;
import h2.h;

public final class g
implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(h h2, d0 d02, Object object) {
        this.a = h2;
        this.b = d02;
        this.c = object;
    }

    public final void run() {
        h.a((h)this.a, (d0)this.b, (Object)this.c);
    }
}


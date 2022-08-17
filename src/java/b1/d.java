/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package b1;

import b1.c;

public final class d
implements Runnable {
    public final /* synthetic */ c.c a;
    public final /* synthetic */ int b;

    public /* synthetic */ d(c.c c2, int n2) {
        this.a = c2;
        this.b = n2;
    }

    public final void run() {
        c.c.b(this.a, this.b);
    }
}


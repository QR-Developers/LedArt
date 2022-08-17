/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c1;

import c1.j;

public final class i
implements Runnable {
    public final /* synthetic */ j a;
    public final /* synthetic */ int b;

    public /* synthetic */ i(j j2, int n2) {
        this.a = j2;
        this.b = n2;
    }

    public final void run() {
        j.b(this.a, this.b);
    }
}


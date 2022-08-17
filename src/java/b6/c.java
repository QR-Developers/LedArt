/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  b6.d
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package b6;

import b6.d;

public final class c
implements Runnable {
    public final /* synthetic */ d a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(d d2, String string2) {
        this.a = d2;
        this.b = string2;
    }

    public final void run() {
        d.b((d)this.a, (String)this.b);
    }
}


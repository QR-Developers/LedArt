/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  n2.m
 */
package n2;

import n2.m;

public final class j
implements Runnable {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;

    public /* synthetic */ j(m m5, String string2) {
        this.a = m5;
        this.b = string2;
    }

    public final void run() {
        m.e((m)this.a, (String)this.b);
    }
}


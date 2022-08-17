/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.e
 *  h2.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 */
package h2;

import a8.e;
import h2.h;

public final class f
implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ f(h h2, e e2, Exception exception) {
        this.a = h2;
        this.b = e2;
        this.c = exception;
    }

    public final void run() {
        h.b((h)this.a, (e)this.b, (Exception)this.c);
    }
}


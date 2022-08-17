/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  r.f
 *  r.i
 */
package r;

import r.f;
import r.i;

public final class e
implements Runnable {
    public final /* synthetic */ f a;
    public final /* synthetic */ i b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ e(f f2, i i2, int n2, String string) {
        this.a = f2;
        this.b = i2;
        this.c = n2;
        this.d = string;
    }

    public final void run() {
        f.b((f)this.a, (i)this.b, (int)this.c, (String)this.d);
    }
}


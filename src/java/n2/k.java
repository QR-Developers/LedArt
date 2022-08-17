/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  n2.m
 */
package n2;

import java.util.List;
import n2.m;

public final class k
implements Runnable {
    public final /* synthetic */ m a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;

    public /* synthetic */ k(m m5, List list, String string2) {
        this.a = m5;
        this.b = list;
        this.c = string2;
    }

    public final void run() {
        m.h((m)this.a, (List)this.b, (String)this.c);
    }
}


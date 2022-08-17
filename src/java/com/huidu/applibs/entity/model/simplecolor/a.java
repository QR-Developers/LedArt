/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.huidu.applibs.entity.model.simplecolor.SimpleColorCard
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.huidu.applibs.entity.model.simplecolor;

import com.huidu.applibs.entity.model.simplecolor.SimpleColorCard;

public final class a
implements Runnable {
    public final /* synthetic */ SimpleColorCard a;
    public final /* synthetic */ short b;

    public /* synthetic */ a(SimpleColorCard simpleColorCard, short s) {
        this.a = simpleColorCard;
        this.b = s;
    }

    public final void run() {
        SimpleColorCard.a((SimpleColorCard)this.a, (short)this.b);
    }
}


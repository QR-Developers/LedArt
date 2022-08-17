/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.ScNewScreenActivity
 *  java.lang.Object
 *  java.lang.Runnable
 */
package d2;

import cn.huidu.huiduapp.ledart.ui.singlecolor.ScNewScreenActivity;
import cn.huidu.singlecolor.model.Screen;

public final class j0
implements Runnable {
    public final /* synthetic */ ScNewScreenActivity a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Screen c;

    public /* synthetic */ j0(ScNewScreenActivity scNewScreenActivity, boolean bl, Screen screen) {
        this.a = scNewScreenActivity;
        this.b = bl;
        this.c = screen;
    }

    public final void run() {
        ScNewScreenActivity.P1((ScNewScreenActivity)this.a, (boolean)this.b, (Screen)this.c);
    }
}


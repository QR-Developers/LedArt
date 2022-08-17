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

public final class i0
implements Runnable {
    public final /* synthetic */ ScNewScreenActivity a;
    public final /* synthetic */ Screen b;

    public /* synthetic */ i0(ScNewScreenActivity scNewScreenActivity, Screen screen) {
        this.a = scNewScreenActivity;
        this.b = screen;
    }

    public final void run() {
        ScNewScreenActivity.T1((ScNewScreenActivity)this.a, (Screen)this.b);
    }
}


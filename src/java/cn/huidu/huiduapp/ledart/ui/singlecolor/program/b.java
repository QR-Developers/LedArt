/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.program.PlugFragment
 *  java.lang.Object
 *  java.lang.Runnable
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.program;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.program.PlugFragment;

public final class b
implements Runnable {
    public final /* synthetic */ PlugFragment.b a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public /* synthetic */ b(PlugFragment.b b2, View view, View view2) {
        this.a = b2;
        this.b = view;
        this.c = view2;
    }

    public final void run() {
        PlugFragment.b.a(this.a, this.b, this.c);
    }
}


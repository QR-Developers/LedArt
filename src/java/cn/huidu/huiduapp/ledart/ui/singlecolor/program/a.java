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

public final class a
implements Runnable {
    public final /* synthetic */ PlugFragment.a a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public /* synthetic */ a(PlugFragment.a a2, View view, View view2) {
        this.a = a2;
        this.b = view;
        this.c = view2;
    }

    public final void run() {
        PlugFragment.a.a(this.a, this.b, this.c);
    }
}


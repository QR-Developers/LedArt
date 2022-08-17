/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundpictureAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundpictureAdapter$g
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundpictureAdapter;

public final class c
implements View.OnClickListener {
    public final /* synthetic */ BackgroundpictureAdapter a;
    public final /* synthetic */ BackgroundpictureAdapter.g b;

    public /* synthetic */ c(BackgroundpictureAdapter backgroundpictureAdapter, BackgroundpictureAdapter.g g2) {
        this.a = backgroundpictureAdapter;
        this.b = g2;
    }

    public final void onClick(View view) {
        BackgroundpictureAdapter.x((BackgroundpictureAdapter)this.a, (BackgroundpictureAdapter.g)this.b, (View)view);
    }
}


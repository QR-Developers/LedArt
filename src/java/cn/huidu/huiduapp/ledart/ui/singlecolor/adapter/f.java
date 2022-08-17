/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundpictureAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundpictureAdapter$f
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundpictureAdapter;

public final class f
implements View.OnLongClickListener {
    public final /* synthetic */ BackgroundpictureAdapter.f a;

    public /* synthetic */ f(BackgroundpictureAdapter.f f2) {
        this.a = f2;
    }

    public final boolean onLongClick(View view) {
        return BackgroundpictureAdapter.f.c((BackgroundpictureAdapter.f)this.a, (View)view);
    }
}


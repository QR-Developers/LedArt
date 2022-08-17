/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageListAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageListAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageListAdapter;

public final class r
implements View.OnClickListener {
    public final /* synthetic */ ImageListAdapter.a a;

    public /* synthetic */ r(ImageListAdapter.a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        ImageListAdapter.a.b((ImageListAdapter.a)this.a, (View)view);
    }
}


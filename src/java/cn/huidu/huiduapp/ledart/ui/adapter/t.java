/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.LocalPictureListAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.LocalPictureListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.LocalPictureListAdapter;

public final class t
implements View.OnClickListener {
    public final /* synthetic */ LocalPictureListAdapter.b a;

    public /* synthetic */ t(LocalPictureListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        LocalPictureListAdapter.b.b((LocalPictureListAdapter.b)this.a, (View)view);
    }
}


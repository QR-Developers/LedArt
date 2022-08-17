/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.PlayerApkListAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.PlayerApkListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.PlayerApkListAdapter;

public final class u
implements View.OnClickListener {
    public final /* synthetic */ PlayerApkListAdapter.b a;

    public /* synthetic */ u(PlayerApkListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        PlayerApkListAdapter.b.b((PlayerApkListAdapter.b)this.a, (View)view);
    }
}


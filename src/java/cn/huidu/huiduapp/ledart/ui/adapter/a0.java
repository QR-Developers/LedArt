/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.ScreenListAdapter
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.ScreenListAdapter;

public final class a0
implements View.OnClickListener {
    public final /* synthetic */ ScreenListAdapter.a a;

    public /* synthetic */ a0(ScreenListAdapter.a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        ScreenListAdapter.a.b(this.a, view);
    }
}


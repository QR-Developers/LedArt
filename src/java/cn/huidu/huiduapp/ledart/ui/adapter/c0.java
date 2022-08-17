/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.ScreenListAdapter
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.ScreenListAdapter;

public final class c0
implements View.OnLongClickListener {
    public final /* synthetic */ ScreenListAdapter.a a;

    public /* synthetic */ c0(ScreenListAdapter.a a2) {
        this.a = a2;
    }

    public final boolean onLongClick(View view) {
        return ScreenListAdapter.a.a(this.a, view);
    }
}


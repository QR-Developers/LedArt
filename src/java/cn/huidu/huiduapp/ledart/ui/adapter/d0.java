/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.ScreenParamsListAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.ScreenParamsListAdapter$c
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.ScreenParamsListAdapter;

public final class d0
implements View.OnClickListener {
    public final /* synthetic */ ScreenParamsListAdapter.c a;

    public /* synthetic */ d0(ScreenParamsListAdapter.c c2) {
        this.a = c2;
    }

    public final void onClick(View view) {
        ScreenParamsListAdapter.c.b((ScreenParamsListAdapter.c)this.a, (View)view);
    }
}


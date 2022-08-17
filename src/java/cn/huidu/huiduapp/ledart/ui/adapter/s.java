/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.HomeDetailAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.HomeDetailAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.HomeDetailAdapter;

public final class s
implements View.OnClickListener {
    public final /* synthetic */ HomeDetailAdapter a;
    public final /* synthetic */ HomeDetailAdapter.a b;
    public final /* synthetic */ int c;

    public /* synthetic */ s(HomeDetailAdapter homeDetailAdapter, HomeDetailAdapter.a a2, int n2) {
        this.a = homeDetailAdapter;
        this.b = a2;
        this.c = n2;
    }

    public final void onClick(View view) {
        HomeDetailAdapter.x((HomeDetailAdapter)this.a, (HomeDetailAdapter.a)this.b, (int)this.c, (View)view);
    }
}


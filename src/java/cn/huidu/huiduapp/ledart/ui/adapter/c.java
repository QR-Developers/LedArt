/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter;

public final class c
implements View.OnClickListener {
    public final /* synthetic */ DeviceListAdapter.b a;

    public /* synthetic */ c(DeviceListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        DeviceListAdapter.b.b((DeviceListAdapter.b)this.a, (View)view);
    }
}


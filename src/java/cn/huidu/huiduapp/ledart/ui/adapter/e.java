/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter$d
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter;

public final class e
implements View.OnClickListener {
    public final /* synthetic */ DeviceListAdapter.d a;

    public /* synthetic */ e(DeviceListAdapter.d d2) {
        this.a = d2;
    }

    public final void onClick(View view) {
        DeviceListAdapter.d.c((DeviceListAdapter.d)this.a, (View)view);
    }
}


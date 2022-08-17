/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter$e
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.DeviceListAdapter;

public final class f
implements View.OnClickListener {
    public final /* synthetic */ DeviceListAdapter.e a;

    public /* synthetic */ f(DeviceListAdapter.e e2) {
        this.a = e2;
    }

    public final void onClick(View view) {
        DeviceListAdapter.e.b((DeviceListAdapter.e)this.a, (View)view);
    }
}


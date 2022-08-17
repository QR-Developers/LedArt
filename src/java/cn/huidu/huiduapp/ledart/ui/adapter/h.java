/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.DeviceListDialogAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.DeviceListDialogAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.DeviceListDialogAdapter;

public final class h
implements View.OnClickListener {
    public final /* synthetic */ DeviceListDialogAdapter.b a;

    public /* synthetic */ h(DeviceListDialogAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        DeviceListDialogAdapter.b.b((DeviceListDialogAdapter.b)this.a, (View)view);
    }
}


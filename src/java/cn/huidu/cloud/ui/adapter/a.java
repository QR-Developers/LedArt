/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudDeviceListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudDeviceListAdapter$a
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudDeviceListAdapter;

public final class a
implements View.OnClickListener {
    public final /* synthetic */ CloudDeviceListAdapter.a a;

    public /* synthetic */ a(CloudDeviceListAdapter.a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        CloudDeviceListAdapter.a.c((CloudDeviceListAdapter.a)this.a, (View)view);
    }
}


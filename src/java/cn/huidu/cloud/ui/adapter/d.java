/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudProgramBindDeviceListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudProgramBindDeviceListAdapter$a
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudProgramBindDeviceListAdapter;

public final class d
implements View.OnClickListener {
    public final /* synthetic */ CloudProgramBindDeviceListAdapter.a a;

    public /* synthetic */ d(CloudProgramBindDeviceListAdapter.a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        CloudProgramBindDeviceListAdapter.a.b((CloudProgramBindDeviceListAdapter.a)this.a, (View)view);
    }
}


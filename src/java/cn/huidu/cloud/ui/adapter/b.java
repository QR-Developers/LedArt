/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  cn.huidu.cloud.ui.adapter.CloudDeviceListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudDeviceListAdapter$a
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.widget.CompoundButton;
import cn.huidu.cloud.ui.adapter.CloudDeviceListAdapter;

public final class b
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CloudDeviceListAdapter.a a;

    public /* synthetic */ b(CloudDeviceListAdapter.a a2) {
        this.a = a2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        CloudDeviceListAdapter.a.b((CloudDeviceListAdapter.a)this.a, (CompoundButton)compoundButton, (boolean)bl);
    }
}


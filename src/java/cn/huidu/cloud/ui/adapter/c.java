/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudDeviceProgramListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudDeviceProgramListAdapter$a
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudDeviceProgramListAdapter;

public final class c
implements View.OnClickListener {
    public final /* synthetic */ CloudDeviceProgramListAdapter.a a;

    public /* synthetic */ c(CloudDeviceProgramListAdapter.a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        CloudDeviceProgramListAdapter.a.b((CloudDeviceProgramListAdapter.a)this.a, (View)view);
    }
}


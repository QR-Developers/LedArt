/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudSwitchListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudSwitchListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudSwitchListAdapter;

public final class m
implements View.OnClickListener {
    public final /* synthetic */ CloudSwitchListAdapter.b a;

    public /* synthetic */ m(CloudSwitchListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        CloudSwitchListAdapter.b.b((CloudSwitchListAdapter.b)this.a, (View)view);
    }
}


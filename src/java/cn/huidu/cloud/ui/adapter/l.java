/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  cn.huidu.cloud.ui.adapter.CloudResourceListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudResourceListAdapter$c
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.widget.CompoundButton;
import cn.huidu.cloud.ui.adapter.CloudResourceListAdapter;

public final class l
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CloudResourceListAdapter.c a;

    public /* synthetic */ l(CloudResourceListAdapter.c c2) {
        this.a = c2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        CloudResourceListAdapter.c.b((CloudResourceListAdapter.c)this.a, (CompoundButton)compoundButton, (boolean)bl);
    }
}


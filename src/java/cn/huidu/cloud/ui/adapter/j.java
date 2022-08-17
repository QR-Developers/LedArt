/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  cn.huidu.cloud.ui.adapter.CloudProgramListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudProgramListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.widget.CompoundButton;
import cn.huidu.cloud.ui.adapter.CloudProgramListAdapter;

public final class j
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CloudProgramListAdapter.b a;

    public /* synthetic */ j(CloudProgramListAdapter.b b2) {
        this.a = b2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        CloudProgramListAdapter.b.c((CloudProgramListAdapter.b)this.a, (CompoundButton)compoundButton, (boolean)bl);
    }
}


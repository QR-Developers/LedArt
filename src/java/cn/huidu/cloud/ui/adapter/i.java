/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudProgramListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudProgramListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudProgramListAdapter;

public final class i
implements View.OnClickListener {
    public final /* synthetic */ CloudProgramListAdapter.b a;

    public /* synthetic */ i(CloudProgramListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        CloudProgramListAdapter.b.b((CloudProgramListAdapter.b)this.a, (View)view);
    }
}


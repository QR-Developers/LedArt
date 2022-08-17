/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudProgramGroupListAdapter
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudProgramGroupListAdapter;

public final class g
implements View.OnClickListener {
    public final /* synthetic */ CloudProgramGroupListAdapter.b a;

    public /* synthetic */ g(CloudProgramGroupListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        CloudProgramGroupListAdapter.b.c(this.a, view);
    }
}


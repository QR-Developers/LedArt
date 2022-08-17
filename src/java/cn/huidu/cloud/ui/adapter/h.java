/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  cn.huidu.cloud.ui.adapter.CloudProgramGroupListAdapter
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudProgramGroupListAdapter;

public final class h
implements View.OnLongClickListener {
    public final /* synthetic */ CloudProgramGroupListAdapter.b a;

    public /* synthetic */ h(CloudProgramGroupListAdapter.b b2) {
        this.a = b2;
    }

    public final boolean onLongClick(View view) {
        return CloudProgramGroupListAdapter.b.b(this.a, view);
    }
}


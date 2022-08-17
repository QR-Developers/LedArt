/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudTaskListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudTaskListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudTaskListAdapter;

public final class p
implements View.OnClickListener {
    public final /* synthetic */ CloudTaskListAdapter.b a;

    public /* synthetic */ p(CloudTaskListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        CloudTaskListAdapter.b.b((CloudTaskListAdapter.b)this.a, (View)view);
    }
}


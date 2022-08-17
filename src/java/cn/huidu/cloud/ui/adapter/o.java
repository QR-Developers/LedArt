/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudTaskEventListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudTaskEventListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudTaskEventListAdapter;

public final class o
implements View.OnClickListener {
    public final /* synthetic */ CloudTaskEventListAdapter.b a;

    public /* synthetic */ o(CloudTaskEventListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        CloudTaskEventListAdapter.b.b((CloudTaskEventListAdapter.b)this.a, (View)view);
    }
}


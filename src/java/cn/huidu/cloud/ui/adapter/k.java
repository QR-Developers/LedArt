/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudResourceListAdapter
 *  cn.huidu.cloud.ui.adapter.CloudResourceListAdapter$c
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudResourceListAdapter;

public final class k
implements View.OnClickListener {
    public final /* synthetic */ CloudResourceListAdapter.c a;

    public /* synthetic */ k(CloudResourceListAdapter.c c2) {
        this.a = c2;
    }

    public final void onClick(View view) {
        CloudResourceListAdapter.c.c((CloudResourceListAdapter.c)this.a, (View)view);
    }
}


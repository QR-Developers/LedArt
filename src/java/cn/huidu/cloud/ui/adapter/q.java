/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudTextFlowAdapter
 *  cn.huidu.cloud.ui.adapter.CloudTextFlowAdapter$a
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudTextFlowAdapter;

public final class q
implements View.OnClickListener {
    public final /* synthetic */ CloudTextFlowAdapter.a a;

    public /* synthetic */ q(CloudTextFlowAdapter.a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        CloudTextFlowAdapter.a.b((CloudTextFlowAdapter.a)this.a, (View)view);
    }
}


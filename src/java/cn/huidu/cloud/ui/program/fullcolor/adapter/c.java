/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.program.fullcolor.adapter.CloudFCWidgetListAdapter
 *  cn.huidu.cloud.ui.program.fullcolor.adapter.CloudFCWidgetListAdapter$b
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.program.fullcolor.adapter;

import android.view.View;
import cn.huidu.cloud.ui.program.fullcolor.adapter.CloudFCWidgetListAdapter;

public final class c
implements View.OnClickListener {
    public final /* synthetic */ CloudFCWidgetListAdapter.b a;

    public /* synthetic */ c(CloudFCWidgetListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        CloudFCWidgetListAdapter.b.b((CloudFCWidgetListAdapter.b)this.a, (View)view);
    }
}


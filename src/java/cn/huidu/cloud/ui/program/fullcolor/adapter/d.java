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

public final class d
implements View.OnClickListener {
    public final /* synthetic */ CloudFCWidgetListAdapter.b a;

    public /* synthetic */ d(CloudFCWidgetListAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        CloudFCWidgetListAdapter.b.c((CloudFCWidgetListAdapter.b)this.a, (View)view);
    }
}


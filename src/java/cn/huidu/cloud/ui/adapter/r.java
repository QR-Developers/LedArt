/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.adapter.CloudTimeZoneAdapter
 *  cn.huidu.cloud.ui.adapter.CloudTimeZoneAdapter$b
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import cn.huidu.cloud.ui.adapter.CloudTimeZoneAdapter;

public final class r
implements View.OnClickListener {
    public final /* synthetic */ CloudTimeZoneAdapter.b a;

    public /* synthetic */ r(CloudTimeZoneAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        CloudTimeZoneAdapter.b.b((CloudTimeZoneAdapter.b)this.a, (View)view);
    }
}


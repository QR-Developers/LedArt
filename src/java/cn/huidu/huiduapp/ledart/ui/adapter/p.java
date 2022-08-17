/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.HardwareScanMoreModel
 *  cn.huidu.huiduapp.ledart.ui.adapter.HardwareScanAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.HardwareScanAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.HardwareScanMoreModel;
import cn.huidu.huiduapp.ledart.ui.adapter.HardwareScanAdapter;

public final class p
implements View.OnClickListener {
    public final /* synthetic */ HardwareScanAdapter.b a;
    public final /* synthetic */ HardwareScanMoreModel b;

    public /* synthetic */ p(HardwareScanAdapter.b b2, HardwareScanMoreModel hardwareScanMoreModel) {
        this.a = b2;
        this.b = hardwareScanMoreModel;
    }

    public final void onClick(View view) {
        HardwareScanAdapter.b.b((HardwareScanAdapter.b)this.a, (HardwareScanMoreModel)this.b, (View)view);
    }
}


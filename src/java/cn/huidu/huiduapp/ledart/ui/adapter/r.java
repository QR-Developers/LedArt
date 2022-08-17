/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.HardwareSmartBrightLinesAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.HardwareSmartBrightLinesAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.NumberModel;
import cn.huidu.huiduapp.ledart.ui.adapter.HardwareSmartBrightLinesAdapter;

public final class r
implements View.OnClickListener {
    public final /* synthetic */ HardwareSmartBrightLinesAdapter.b a;
    public final /* synthetic */ NumberModel b;

    public /* synthetic */ r(HardwareSmartBrightLinesAdapter.b b2, NumberModel numberModel) {
        this.a = b2;
        this.b = numberModel;
    }

    public final void onClick(View view) {
        HardwareSmartBrightLinesAdapter.b.b((HardwareSmartBrightLinesAdapter.b)this.a, (NumberModel)this.b, (View)view);
    }
}


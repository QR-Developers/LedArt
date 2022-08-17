/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.BorderEffectModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderEffectAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderEffectAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.BorderEffectModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderEffectAdapter;

public final class g
implements View.OnClickListener {
    public final /* synthetic */ BorderEffectAdapter.a a;
    public final /* synthetic */ BorderEffectModel b;

    public /* synthetic */ g(BorderEffectAdapter.a a2, BorderEffectModel borderEffectModel) {
        this.a = a2;
        this.b = borderEffectModel;
    }

    public final void onClick(View view) {
        BorderEffectAdapter.a.b((BorderEffectAdapter.a)this.a, (BorderEffectModel)this.b, (View)view);
    }
}


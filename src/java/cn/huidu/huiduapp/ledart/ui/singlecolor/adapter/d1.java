/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.EffectModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextEffectAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextEffectAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.EffectModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextEffectAdapter;

public final class d1
implements View.OnClickListener {
    public final /* synthetic */ TextEffectAdapter.a a;
    public final /* synthetic */ EffectModel b;

    public /* synthetic */ d1(TextEffectAdapter.a a2, EffectModel effectModel) {
        this.a = a2;
        this.b = effectModel;
    }

    public final void onClick(View view) {
        TextEffectAdapter.a.b((TextEffectAdapter.a)this.a, (EffectModel)this.b, (View)view);
    }
}


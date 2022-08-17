/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.EffectModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageEffectAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageEffectAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.EffectModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageEffectAdapter;

public final class q
implements View.OnClickListener {
    public final /* synthetic */ ImageEffectAdapter.a a;
    public final /* synthetic */ EffectModel b;

    public /* synthetic */ q(ImageEffectAdapter.a a2, EffectModel effectModel) {
        this.a = a2;
        this.b = effectModel;
    }

    public final void onClick(View view) {
        ImageEffectAdapter.a.b((ImageEffectAdapter.a)this.a, (EffectModel)this.b, (View)view);
    }
}


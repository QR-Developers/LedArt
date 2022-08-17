/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.BackgroundModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundEffectAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundEffectAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.BackgroundModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BackgroundEffectAdapter;

public final class a
implements View.OnClickListener {
    public final /* synthetic */ BackgroundEffectAdapter.a a;
    public final /* synthetic */ BackgroundModel b;

    public /* synthetic */ a(BackgroundEffectAdapter.a a2, BackgroundModel backgroundModel) {
        this.a = a2;
        this.b = backgroundModel;
    }

    public final void onClick(View view) {
        BackgroundEffectAdapter.a.b((BackgroundEffectAdapter.a)this.a, (BackgroundModel)this.b, (View)view);
    }
}


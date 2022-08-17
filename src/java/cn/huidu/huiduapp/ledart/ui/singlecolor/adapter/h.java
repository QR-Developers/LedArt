/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.CancelBorderTypeModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderTypeAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderTypeAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.CancelBorderTypeModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderTypeAdapter;

public final class h
implements View.OnClickListener {
    public final /* synthetic */ BorderTypeAdapter.a a;
    public final /* synthetic */ CancelBorderTypeModel b;

    public /* synthetic */ h(BorderTypeAdapter.a a2, CancelBorderTypeModel cancelBorderTypeModel) {
        this.a = a2;
        this.b = cancelBorderTypeModel;
    }

    public final void onClick(View view) {
        BorderTypeAdapter.a.b((BorderTypeAdapter.a)this.a, (CancelBorderTypeModel)this.b, (View)view);
    }
}


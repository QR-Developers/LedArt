/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.ClockChooseModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockSettingAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockSettingAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.ClockChooseModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockSettingAdapter;

public final class l
implements View.OnClickListener {
    public final /* synthetic */ ClockSettingAdapter.b a;
    public final /* synthetic */ ClockChooseModel b;

    public /* synthetic */ l(ClockSettingAdapter.b b2, ClockChooseModel clockChooseModel) {
        this.a = b2;
        this.b = clockChooseModel;
    }

    public final void onClick(View view) {
        ClockSettingAdapter.b.b((ClockSettingAdapter.b)this.a, (ClockChooseModel)this.b, (View)view);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.TextMoreModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextAdapter$c
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.TextMoreModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextAdapter;

public final class m0
implements View.OnClickListener {
    public final /* synthetic */ TextAdapter.c a;
    public final /* synthetic */ TextMoreModel b;

    public /* synthetic */ m0(TextAdapter.c c2, TextMoreModel textMoreModel) {
        this.a = c2;
        this.b = textMoreModel;
    }

    public final void onClick(View view) {
        TextAdapter.c.f((TextAdapter.c)this.a, (TextMoreModel)this.b, (View)view);
    }
}


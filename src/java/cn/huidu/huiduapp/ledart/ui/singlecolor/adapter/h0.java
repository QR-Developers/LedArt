/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.TextInputModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.TextInputModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextAdapter;

public final class h0
implements View.OnClickListener {
    public final /* synthetic */ TextAdapter.b a;
    public final /* synthetic */ TextInputModel b;

    public /* synthetic */ h0(TextAdapter.b b2, TextInputModel textInputModel) {
        this.a = b2;
        this.b = textInputModel;
    }

    public final void onClick(View view) {
        TextAdapter.b.b((TextAdapter.b)this.a, (TextInputModel)this.b, (View)view);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.FontAutoModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextFontSizeAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextFontSizeAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.FontAutoModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextFontSizeAdapter;

public final class e1
implements View.OnClickListener {
    public final /* synthetic */ TextFontSizeAdapter.a a;
    public final /* synthetic */ FontAutoModel b;

    public /* synthetic */ e1(TextFontSizeAdapter.a a2, FontAutoModel fontAutoModel) {
        this.a = a2;
        this.b = fontAutoModel;
    }

    public final void onClick(View view) {
        TextFontSizeAdapter.a.b((TextFontSizeAdapter.a)this.a, (FontAutoModel)this.b, (View)view);
    }
}


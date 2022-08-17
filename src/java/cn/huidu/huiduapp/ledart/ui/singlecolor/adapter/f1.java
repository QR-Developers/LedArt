/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.FontSizeModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextFontSizeAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextFontSizeAdapter$c
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.FontSizeModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.TextFontSizeAdapter;

public final class f1
implements View.OnClickListener {
    public final /* synthetic */ TextFontSizeAdapter.c a;
    public final /* synthetic */ FontSizeModel b;

    public /* synthetic */ f1(TextFontSizeAdapter.c c2, FontSizeModel fontSizeModel) {
        this.a = c2;
        this.b = fontSizeModel;
    }

    public final void onClick(View view) {
        TextFontSizeAdapter.c.b((TextFontSizeAdapter.c)this.a, (FontSizeModel)this.b, (View)view);
    }
}


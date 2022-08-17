/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.FontSizeModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockFontSizeAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockFontSizeAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.FontSizeModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockFontSizeAdapter;

public final class k
implements View.OnClickListener {
    public final /* synthetic */ ClockFontSizeAdapter.b a;
    public final /* synthetic */ FontSizeModel b;

    public /* synthetic */ k(ClockFontSizeAdapter.b b2, FontSizeModel fontSizeModel) {
        this.a = b2;
        this.b = fontSizeModel;
    }

    public final void onClick(View view) {
        ClockFontSizeAdapter.b.b((ClockFontSizeAdapter.b)this.a, (FontSizeModel)this.b, (View)view);
    }
}


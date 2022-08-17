/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockFontColorAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockFontColorAdapter$a
 *  com.huidu.applibs.common.model.ColorModel
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ClockFontColorAdapter;
import com.huidu.applibs.common.model.ColorModel;

public final class j
implements View.OnClickListener {
    public final /* synthetic */ ClockFontColorAdapter.a a;
    public final /* synthetic */ ColorModel b;

    public /* synthetic */ j(ClockFontColorAdapter.a a2, ColorModel colorModel) {
        this.a = a2;
        this.b = colorModel;
    }

    public final void onClick(View view) {
        ClockFontColorAdapter.a.b((ClockFontColorAdapter.a)this.a, (ColorModel)this.b, (View)view);
    }
}


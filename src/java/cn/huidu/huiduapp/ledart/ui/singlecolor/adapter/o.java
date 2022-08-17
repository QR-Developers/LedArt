/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.FontColorAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.FontColorAdapter$a
 *  com.huidu.applibs.common.model.ColorModel
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.FontColorAdapter;
import com.huidu.applibs.common.model.ColorModel;

public final class o
implements View.OnClickListener {
    public final /* synthetic */ FontColorAdapter.a a;
    public final /* synthetic */ ColorModel b;

    public /* synthetic */ o(FontColorAdapter.a a2, ColorModel colorModel) {
        this.a = a2;
        this.b = colorModel;
    }

    public final void onClick(View view) {
        FontColorAdapter.a.b((FontColorAdapter.a)this.a, (ColorModel)this.b, (View)view);
    }
}


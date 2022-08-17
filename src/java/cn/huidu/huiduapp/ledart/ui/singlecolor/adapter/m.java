/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ColorPickerAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ColorPickerAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ColorPickerAdapter;

public final class m
implements View.OnClickListener {
    public final /* synthetic */ ColorPickerAdapter.a a;

    public /* synthetic */ m(ColorPickerAdapter.a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        ColorPickerAdapter.a.b((ColorPickerAdapter.a)this.a, (View)view);
    }
}


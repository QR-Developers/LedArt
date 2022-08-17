/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ColorfulTypeAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ColorfulTypeAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ColorfulTypeAdapter;

public final class n
implements View.OnClickListener {
    public final /* synthetic */ ColorfulTypeAdapter a;
    public final /* synthetic */ ColorfulTypeAdapter.b b;

    public /* synthetic */ n(ColorfulTypeAdapter colorfulTypeAdapter, ColorfulTypeAdapter.b b2) {
        this.a = colorfulTypeAdapter;
        this.b = b2;
    }

    public final void onClick(View view) {
        ColorfulTypeAdapter.x((ColorfulTypeAdapter)this.a, (ColorfulTypeAdapter.b)this.b, (View)view);
    }
}


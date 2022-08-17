/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderTypeAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderTypeAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.BorderTypeAdapter;

public final class i
implements View.OnClickListener {
    public final /* synthetic */ BorderTypeAdapter.b a;

    public /* synthetic */ i(BorderTypeAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        BorderTypeAdapter.b.b((BorderTypeAdapter.b)this.a, (View)view);
    }
}


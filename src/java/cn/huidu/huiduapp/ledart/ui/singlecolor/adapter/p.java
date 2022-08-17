/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.FontTypeAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.FontTypeAdapter$b
 *  com.huidu.applibs.entity.model.FontTypefaceModel
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.FontTypeAdapter;
import com.huidu.applibs.entity.model.FontTypefaceModel;

public final class p
implements View.OnClickListener {
    public final /* synthetic */ FontTypeAdapter.b a;
    public final /* synthetic */ FontTypefaceModel b;

    public /* synthetic */ p(FontTypeAdapter.b b2, FontTypefaceModel fontTypefaceModel) {
        this.a = b2;
        this.b = fontTypefaceModel;
    }

    public final void onClick(View view) {
        FontTypeAdapter.b.b((FontTypeAdapter.b)this.a, (FontTypefaceModel)this.b, (View)view);
    }
}


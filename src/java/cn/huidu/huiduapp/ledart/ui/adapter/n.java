/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.FontManagementAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.FontManagementAdapter$a
 *  com.huidu.applibs.entity.model.FontTypefaceModel
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.FontManagementAdapter;
import com.huidu.applibs.entity.model.FontTypefaceModel;

public final class n
implements View.OnClickListener {
    public final /* synthetic */ FontManagementAdapter.a a;
    public final /* synthetic */ FontTypefaceModel b;

    public /* synthetic */ n(FontManagementAdapter.a a2, FontTypefaceModel fontTypefaceModel) {
        this.a = a2;
        this.b = fontTypefaceModel;
    }

    public final void onClick(View view) {
        FontManagementAdapter.a.b((FontManagementAdapter.a)this.a, (FontTypefaceModel)this.b, (View)view);
    }
}


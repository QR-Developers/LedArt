/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.SelectionModuleAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.SelectionModuleAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.SelectionModuleModel;
import cn.huidu.huiduapp.ledart.ui.adapter.SelectionModuleAdapter;

public final class g0
implements View.OnClickListener {
    public final /* synthetic */ SelectionModuleAdapter.b a;
    public final /* synthetic */ SelectionModuleModel b;

    public /* synthetic */ g0(SelectionModuleAdapter.b b2, SelectionModuleModel selectionModuleModel) {
        this.a = b2;
        this.b = selectionModuleModel;
    }

    public final void onClick(View view) {
        SelectionModuleAdapter.b.b((SelectionModuleAdapter.b)this.a, (SelectionModuleModel)this.b, (View)view);
    }
}


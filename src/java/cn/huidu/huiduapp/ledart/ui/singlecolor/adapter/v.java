/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.entity.model.ProgramMoreModel
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ProgramAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ProgramAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.ProgramMoreModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ProgramAdapter;

public final class v
implements View.OnClickListener {
    public final /* synthetic */ ProgramAdapter.b a;
    public final /* synthetic */ ProgramMoreModel b;

    public /* synthetic */ v(ProgramAdapter.b b2, ProgramMoreModel programMoreModel) {
        this.a = b2;
        this.b = programMoreModel;
    }

    public final void onClick(View view) {
        ProgramAdapter.b.d((ProgramAdapter.b)this.a, (ProgramMoreModel)this.b, (View)view);
    }
}


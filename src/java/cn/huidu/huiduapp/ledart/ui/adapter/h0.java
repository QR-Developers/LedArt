/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.SingleSelectAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.SingleSelectAdapter$b
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.SingleSelectAdapter;

public final class h0
implements View.OnClickListener {
    public final /* synthetic */ SingleSelectAdapter.b a;

    public /* synthetic */ h0(SingleSelectAdapter.b b2) {
        this.a = b2;
    }

    public final void onClick(View view) {
        SingleSelectAdapter.b.b((SingleSelectAdapter.b)this.a, (View)view);
    }
}


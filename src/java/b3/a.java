/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.view.dropdownmenu.SingleTextAdapter
 *  cn.huidu.view.dropdownmenu.SingleTextAdapter$TextViewViewHolder
 *  java.lang.Object
 */
package b3;

import android.view.View;
import cn.huidu.view.dropdownmenu.SingleTextAdapter;

public final class a
implements View.OnClickListener {
    public final /* synthetic */ SingleTextAdapter.TextViewViewHolder a;

    public /* synthetic */ a(SingleTextAdapter.TextViewViewHolder textViewViewHolder) {
        this.a = textViewViewHolder;
    }

    public final void onClick(View view) {
        SingleTextAdapter.TextViewViewHolder.b((SingleTextAdapter.TextViewViewHolder)this.a, (View)view);
    }
}


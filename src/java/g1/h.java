/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.ScreenListItemViewHolder
 *  java.lang.Object
 */
package g1;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.ScreenListItemViewHolder;

public final class h
implements View.OnClickListener {
    public final /* synthetic */ ScreenListItemViewHolder a;

    public /* synthetic */ h(ScreenListItemViewHolder screenListItemViewHolder) {
        this.a = screenListItemViewHolder;
    }

    public final void onClick(View view) {
        ScreenListItemViewHolder.d((ScreenListItemViewHolder)this.a, (View)view);
    }
}


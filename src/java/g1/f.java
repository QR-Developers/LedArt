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

public final class f
implements View.OnClickListener {
    public final /* synthetic */ ScreenListItemViewHolder a;

    public /* synthetic */ f(ScreenListItemViewHolder screenListItemViewHolder) {
        this.a = screenListItemViewHolder;
    }

    public final void onClick(View view) {
        ScreenListItemViewHolder.b((ScreenListItemViewHolder)this.a, (View)view);
    }
}


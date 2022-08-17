/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.LcdSendProgramDialogAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.LcdSendProgramDialogAdapter$CardItemViewHolder
 *  java.lang.Object
 */
package g1;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.LcdSendProgramDialogAdapter;

public final class c
implements View.OnClickListener {
    public final /* synthetic */ LcdSendProgramDialogAdapter.CardItemViewHolder a;

    public /* synthetic */ c(LcdSendProgramDialogAdapter.CardItemViewHolder cardItemViewHolder) {
        this.a = cardItemViewHolder;
    }

    public final void onClick(View view) {
        LcdSendProgramDialogAdapter.CardItemViewHolder.c((LcdSendProgramDialogAdapter.CardItemViewHolder)this.a, (View)view);
    }
}


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

public final class b
implements View.OnClickListener {
    public final /* synthetic */ LcdSendProgramDialogAdapter.CardItemViewHolder a;

    public /* synthetic */ b(LcdSendProgramDialogAdapter.CardItemViewHolder cardItemViewHolder) {
        this.a = cardItemViewHolder;
    }

    public final void onClick(View view) {
        LcdSendProgramDialogAdapter.CardItemViewHolder.b((LcdSendProgramDialogAdapter.CardItemViewHolder)this.a, (View)view);
    }
}


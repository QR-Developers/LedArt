/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.CardListViewAdapter
 *  com.huidu.applibs.common.model.CardConfig
 *  java.lang.Object
 */
package g1;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.adapter.CardListViewAdapter;
import com.huidu.applibs.common.model.CardConfig;

public final class a
implements View.OnClickListener {
    public final /* synthetic */ CardListViewAdapter a;
    public final /* synthetic */ CardConfig b;

    public /* synthetic */ a(CardListViewAdapter cardListViewAdapter, CardConfig cardConfig) {
        this.a = cardListViewAdapter;
        this.b = cardConfig;
    }

    public final void onClick(View view) {
        CardListViewAdapter.x((CardListViewAdapter)this.a, (CardConfig)this.b, (View)view);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.view.richeditor.RichEditToolBar
 *  java.lang.Object
 */
package h3;

import android.view.View;
import cn.huidu.view.richeditor.RichEditToolBar;

public final class i0
implements View.OnClickListener {
    public final /* synthetic */ RichEditToolBar a;

    public /* synthetic */ i0(RichEditToolBar richEditToolBar) {
        this.a = richEditToolBar;
    }

    public final void onClick(View view) {
        RichEditToolBar.l((RichEditToolBar)this.a, (View)view);
    }
}


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

public final class s
implements View.OnClickListener {
    public final /* synthetic */ RichEditToolBar a;

    public /* synthetic */ s(RichEditToolBar richEditToolBar) {
        this.a = richEditToolBar;
    }

    public final void onClick(View view) {
        RichEditToolBar.r((RichEditToolBar)this.a, (View)view);
    }
}


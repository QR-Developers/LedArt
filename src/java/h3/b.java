/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.view.richeditor.AnimationTextEditToolBar
 *  java.lang.Object
 */
package h3;

import android.view.View;
import cn.huidu.view.richeditor.AnimationTextEditToolBar;

public final class b
implements View.OnClickListener {
    public final /* synthetic */ AnimationTextEditToolBar a;

    public /* synthetic */ b(AnimationTextEditToolBar animationTextEditToolBar) {
        this.a = animationTextEditToolBar;
    }

    public final void onClick(View view) {
        AnimationTextEditToolBar.e((AnimationTextEditToolBar)this.a, (View)view);
    }
}


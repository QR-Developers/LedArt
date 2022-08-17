/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.ScreenListItemViewHolder
 *  java.lang.Object
 */
package g1;

import android.animation.ValueAnimator;
import cn.huidu.huiduapp.ledart.ui.adapter.ScreenListItemViewHolder;

public final class e
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ScreenListItemViewHolder a;
    public final /* synthetic */ int b;

    public /* synthetic */ e(ScreenListItemViewHolder screenListItemViewHolder, int n2) {
        this.a = screenListItemViewHolder;
        this.b = n2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ScreenListItemViewHolder.h((ScreenListItemViewHolder)this.a, (int)this.b, (ValueAnimator)valueAnimator);
    }
}


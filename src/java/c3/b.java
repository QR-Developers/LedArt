/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.view.inputview.AddAndSubtractInputView
 *  java.lang.Object
 */
package c3;

import android.view.View;
import cn.huidu.view.inputview.AddAndSubtractInputView;

public final class b
implements View.OnClickListener {
    public final /* synthetic */ AddAndSubtractInputView a;

    public /* synthetic */ b(AddAndSubtractInputView addAndSubtractInputView) {
        this.a = addAndSubtractInputView;
    }

    public final void onClick(View view) {
        AddAndSubtractInputView.b((AddAndSubtractInputView)this.a, (View)view);
    }
}


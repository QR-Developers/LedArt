/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.FeedbackImageAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.FeedbackImageAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.FeedbackImageModel;
import cn.huidu.huiduapp.ledart.ui.adapter.FeedbackImageAdapter;

public final class k
implements View.OnLongClickListener {
    public final /* synthetic */ FeedbackImageAdapter.a a;
    public final /* synthetic */ FeedbackImageModel b;

    public /* synthetic */ k(FeedbackImageAdapter.a a2, FeedbackImageModel feedbackImageModel) {
        this.a = a2;
        this.b = feedbackImageModel;
    }

    public final boolean onLongClick(View view) {
        return FeedbackImageAdapter.a.b((FeedbackImageAdapter.a)this.a, (FeedbackImageModel)this.b, (View)view);
    }
}


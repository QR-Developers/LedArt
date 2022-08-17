/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.adapter.FeedbackImageAdapter
 *  cn.huidu.huiduapp.ledart.ui.adapter.FeedbackImageAdapter$a
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.FeedbackImageModel;
import cn.huidu.huiduapp.ledart.ui.adapter.FeedbackImageAdapter;

public final class j
implements View.OnClickListener {
    public final /* synthetic */ FeedbackImageAdapter.a a;
    public final /* synthetic */ FeedbackImageModel b;

    public /* synthetic */ j(FeedbackImageAdapter.a a2, FeedbackImageModel feedbackImageModel) {
        this.a = a2;
        this.b = feedbackImageModel;
    }

    public final void onClick(View view) {
        FeedbackImageAdapter.a.c((FeedbackImageAdapter.a)this.a, (FeedbackImageModel)this.b, (View)view);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageListAdapter
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageListAdapter$c
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor.adapter;

import android.view.View;
import cn.huidu.huiduapp.ledart.entity.model.ImageDragSortingModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.adapter.ImageListAdapter;

public final class s
implements View.OnClickListener {
    public final /* synthetic */ ImageListAdapter.c a;
    public final /* synthetic */ ImageDragSortingModel b;

    public /* synthetic */ s(ImageListAdapter.c c2, ImageDragSortingModel imageDragSortingModel) {
        this.a = c2;
        this.b = imageDragSortingModel;
    }

    public final void onClick(View view) {
        ImageListAdapter.c.b((ImageListAdapter.c)this.a, (ImageDragSortingModel)this.b, (View)view);
    }
}


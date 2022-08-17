/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.viewpager.widget.ViewPager
 */
package cn.huidu.view.dateview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

public class BetterViewPager
extends ViewPager {
    public BetterViewPager(Context context) {
        super(context);
    }

    public BetterViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean bl) {
        this.setChildrenDrawingOrderEnabled(bl);
    }
}


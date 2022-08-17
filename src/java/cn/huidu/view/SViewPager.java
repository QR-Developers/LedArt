/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  androidx.viewpager.widget.ViewPager
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 */
package cn.huidu.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public class SViewPager
extends ViewPager {
    public View a;

    public SViewPager(Context context) {
        super(context);
    }

    public SViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            boolean bl = super.onInterceptTouchEvent(motionEvent);
            return bl;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            boolean bl = super.onTouchEvent(motionEvent);
            return bl;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
}


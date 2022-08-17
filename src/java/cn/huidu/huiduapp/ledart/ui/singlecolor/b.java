/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.BrightnessActivity
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.BrightnessActivity$g
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor;

import android.view.View;
import android.widget.TextView;
import cn.huidu.huiduapp.ledart.ui.singlecolor.BrightnessActivity;

public final class b
implements View.OnClickListener {
    public final /* synthetic */ BrightnessActivity.g a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ b(BrightnessActivity.g g2, TextView textView) {
        this.a = g2;
        this.b = textView;
    }

    public final void onClick(View view) {
        BrightnessActivity.g.a((BrightnessActivity.g)this.a, (TextView)this.b, (View)view);
    }
}


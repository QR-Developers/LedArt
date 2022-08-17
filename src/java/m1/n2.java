/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  cn.huidu.huiduapp.ledart.ui.fullcolor.hardware.FcHardwareSmartActivity
 *  java.lang.Object
 */
package m1;

import android.view.View;
import android.widget.ImageView;
import cn.huidu.huiduapp.ledart.ui.fullcolor.hardware.FcHardwareSmartActivity;

public final class n2
implements View.OnClickListener {
    public final /* synthetic */ FcHardwareSmartActivity a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ n2(FcHardwareSmartActivity fcHardwareSmartActivity, ImageView imageView) {
        this.a = fcHardwareSmartActivity;
        this.b = imageView;
    }

    public final void onClick(View view) {
        FcHardwareSmartActivity.w2((FcHardwareSmartActivity)this.a, (ImageView)this.b, (View)view);
    }
}


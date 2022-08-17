/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.view.HardwareItemColorChannel
 *  java.lang.Object
 */
package g2;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.view.HardwareItemColorChannel;

public final class e
implements View.OnClickListener {
    public final /* synthetic */ HardwareItemColorChannel a;

    public /* synthetic */ e(HardwareItemColorChannel hardwareItemColorChannel) {
        this.a = hardwareItemColorChannel;
    }

    public final void onClick(View view) {
        HardwareItemColorChannel.c((HardwareItemColorChannel)this.a, (View)view);
    }
}


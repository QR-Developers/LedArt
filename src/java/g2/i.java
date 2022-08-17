/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  cn.huidu.huiduapp.ledart.ui.view.HardwareItemRadioGroup
 *  java.lang.Object
 */
package g2;

import android.view.View;
import android.widget.TextView;
import cn.huidu.huiduapp.ledart.ui.view.HardwareItemRadioGroup;

public final class i
implements View.OnClickListener {
    public final /* synthetic */ HardwareItemRadioGroup a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;

    public /* synthetic */ i(HardwareItemRadioGroup hardwareItemRadioGroup, TextView textView, int n2) {
        this.a = hardwareItemRadioGroup;
        this.b = textView;
        this.c = n2;
    }

    public final void onClick(View view) {
        HardwareItemRadioGroup.a((HardwareItemRadioGroup)this.a, (TextView)this.b, (int)this.c, (View)view);
    }
}


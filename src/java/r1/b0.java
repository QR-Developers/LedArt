/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.lcd.ledandroid.LedProgramActivity
 *  java.lang.Object
 */
package r1;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.lcd.ledandroid.LedProgramActivity;

public final class b0
implements View.OnClickListener {
    public final /* synthetic */ LedProgramActivity a;

    public /* synthetic */ b0(LedProgramActivity ledProgramActivity) {
        this.a = ledProgramActivity;
    }

    public final void onClick(View view) {
        LedProgramActivity.U1((LedProgramActivity)this.a, (View)view);
    }
}


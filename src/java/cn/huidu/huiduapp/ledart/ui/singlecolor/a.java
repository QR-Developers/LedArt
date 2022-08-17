/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.BrightnessActivity
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.BrightnessActivity$g
 *  java.lang.Object
 */
package cn.huidu.huiduapp.ledart.ui.singlecolor;

import android.content.DialogInterface;
import cn.huidu.huiduapp.ledart.ui.singlecolor.BrightnessActivity;

public final class a
implements DialogInterface.OnCancelListener {
    public final /* synthetic */ BrightnessActivity.g a;

    public /* synthetic */ a(BrightnessActivity.g g2) {
        this.a = g2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        BrightnessActivity.g.c((BrightnessActivity.g)this.a, (DialogInterface)dialogInterface);
    }
}


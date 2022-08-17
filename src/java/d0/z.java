/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.cloud.ui.program.lcd.CloudLcdProgramActivity
 *  cn.huidu.view.common.CommonHintDialog
 *  cn.huidu.view.common.CommonHintDialog$b
 *  java.lang.Object
 */
package d0;

import cn.huidu.cloud.ui.program.lcd.CloudLcdProgramActivity;
import cn.huidu.view.common.CommonHintDialog;

public final class z
implements CommonHintDialog.b {
    public final /* synthetic */ CloudLcdProgramActivity a;

    public /* synthetic */ z(CloudLcdProgramActivity cloudLcdProgramActivity) {
        this.a = cloudLcdProgramActivity;
    }

    public final void cancel() {
        this.a.finish();
    }
}


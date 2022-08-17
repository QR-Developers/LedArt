/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.component.DeviceLockedPwdDialog
 *  cn.huidu.huiduapp.ledart.ui.component.LcdSoftSpliceSendProgramDialog
 *  h2.n
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package j1;

import cn.huidu.huiduapp.ledart.ui.component.DeviceLockedPwdDialog;
import cn.huidu.huiduapp.ledart.ui.component.LcdSoftSpliceSendProgramDialog;
import h2.n;

public final class z
implements DeviceLockedPwdDialog.a {
    public final /* synthetic */ LcdSoftSpliceSendProgramDialog a;
    public final /* synthetic */ n b;
    public final /* synthetic */ String c;

    public /* synthetic */ z(LcdSoftSpliceSendProgramDialog lcdSoftSpliceSendProgramDialog, n n2, String string) {
        this.a = lcdSoftSpliceSendProgramDialog;
        this.b = n2;
        this.c = string;
    }

    @Override
    public final void a(String string, Boolean bl) {
        LcdSoftSpliceSendProgramDialog.h1((LcdSoftSpliceSendProgramDialog)this.a, (n)this.b, (String)this.c, (String)string, (Boolean)bl);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.component.DeviceLockedPwdDialog
 *  cn.huidu.huiduapp.ledart.ui.component.LcdSendProgramDialog
 *  h2.n
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package j1;

import cn.huidu.huiduapp.ledart.ui.component.DeviceLockedPwdDialog;
import cn.huidu.huiduapp.ledart.ui.component.LcdSendProgramDialog;
import h2.n;

public final class w
implements DeviceLockedPwdDialog.a {
    public final /* synthetic */ LcdSendProgramDialog a;
    public final /* synthetic */ n b;
    public final /* synthetic */ String c;

    public /* synthetic */ w(LcdSendProgramDialog lcdSendProgramDialog, n n2, String string) {
        this.a = lcdSendProgramDialog;
        this.b = n2;
        this.c = string;
    }

    @Override
    public final void a(String string, Boolean bl) {
        LcdSendProgramDialog.k1((LcdSendProgramDialog)this.a, (n)this.b, (String)this.c, (String)string, (Boolean)bl);
    }
}


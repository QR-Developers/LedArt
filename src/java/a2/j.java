/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.component.DeviceLockedPwdDialog
 *  cn.huidu.huiduapp.ledart.ui.rubik.program.RubikSendProgramFragment
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package a2;

import cn.huidu.huiduapp.ledart.ui.component.DeviceLockedPwdDialog;
import cn.huidu.huiduapp.ledart.ui.rubik.program.RubikSendProgramFragment;

public final class j
implements DeviceLockedPwdDialog.a {
    public final /* synthetic */ RubikSendProgramFragment a;
    public final /* synthetic */ String b;

    public /* synthetic */ j(RubikSendProgramFragment rubikSendProgramFragment, String string) {
        this.a = rubikSendProgramFragment;
        this.b = string;
    }

    @Override
    public final void a(String string, Boolean bl) {
        RubikSendProgramFragment.k1((RubikSendProgramFragment)this.a, (String)this.b, (String)string, (Boolean)bl);
    }
}


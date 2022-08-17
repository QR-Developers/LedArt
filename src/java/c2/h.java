/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.setting.CertificateAccountActivity
 *  java.lang.Object
 */
package c2;

import android.content.DialogInterface;
import cn.huidu.huiduapp.ledart.ui.setting.CertificateAccountActivity;

public final class h
implements DialogInterface.OnClickListener {
    public final /* synthetic */ CertificateAccountActivity a;

    public /* synthetic */ h(CertificateAccountActivity certificateAccountActivity) {
        this.a = certificateAccountActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        CertificateAccountActivity.R1((CertificateAccountActivity)this.a, (DialogInterface)dialogInterface, (int)n2);
    }
}


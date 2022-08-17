/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.cloud.ui.program.fullcolor.CloudFCProgramActivity
 *  cn.huidu.view.common.CommonHintDialog
 *  cn.huidu.view.common.CommonHintDialog$b
 *  java.lang.Object
 */
package a0;

import cn.huidu.cloud.ui.program.fullcolor.CloudFCProgramActivity;
import cn.huidu.view.common.CommonHintDialog;

public final class i0
implements CommonHintDialog.b {
    public final /* synthetic */ CloudFCProgramActivity a;

    public /* synthetic */ i0(CloudFCProgramActivity cloudFCProgramActivity) {
        this.a = cloudFCProgramActivity;
    }

    public final void cancel() {
        this.a.finish();
    }
}


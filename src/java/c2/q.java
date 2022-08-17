/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.setting.DownloadManagementActivity
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c2;

import cn.huidu.huiduapp.ledart.ui.setting.DownloadManagementActivity;

public final class q
implements Runnable {
    public final /* synthetic */ DownloadManagementActivity a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ q(DownloadManagementActivity downloadManagementActivity, boolean bl) {
        this.a = downloadManagementActivity;
        this.b = bl;
    }

    public final void run() {
        DownloadManagementActivity.T1((DownloadManagementActivity)this.a, (boolean)this.b);
    }
}


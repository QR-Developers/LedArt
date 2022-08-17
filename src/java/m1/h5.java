/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.fullcolor.hardware.FcUniversalModuleActivity
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.List
 */
package m1;

import cn.huidu.huiduapp.ledart.ui.fullcolor.hardware.FcUniversalModuleActivity;
import java.util.List;

public final class h5
implements Runnable {
    public final /* synthetic */ FcUniversalModuleActivity a;
    public final /* synthetic */ List b;

    public /* synthetic */ h5(FcUniversalModuleActivity fcUniversalModuleActivity, List list) {
        this.a = fcUniversalModuleActivity;
        this.b = list;
    }

    public final void run() {
        FcUniversalModuleActivity.j2((FcUniversalModuleActivity)this.a, (List)this.b);
    }
}


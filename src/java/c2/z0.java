/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.setting.LcdPlayerApkDownloadActivity
 *  com.huidu.applibs.entity.model.PlayerApkFileModel
 *  java.lang.Object
 *  java.util.Comparator
 */
package c2;

import cn.huidu.huiduapp.ledart.ui.setting.LcdPlayerApkDownloadActivity;
import com.huidu.applibs.entity.model.PlayerApkFileModel;
import java.util.Comparator;

public final class z0
implements Comparator {
    public static final /* synthetic */ z0 a;

    static /* synthetic */ {
        a = new z0();
    }

    private /* synthetic */ z0() {
    }

    public final int compare(Object object, Object object2) {
        return LcdPlayerApkDownloadActivity.v2((PlayerApkFileModel)((PlayerApkFileModel)object), (PlayerApkFileModel)((PlayerApkFileModel)object2));
    }
}


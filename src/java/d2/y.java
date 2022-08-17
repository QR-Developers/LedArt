/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.FirmwareActivity
 *  java.lang.Object
 *  java.util.Comparator
 */
package d2;

import cn.huidu.huiduapp.ledart.entity.model.FirmwareModel;
import cn.huidu.huiduapp.ledart.ui.singlecolor.FirmwareActivity;
import java.util.Comparator;

public final class y
implements Comparator {
    public static final /* synthetic */ y a;

    static /* synthetic */ {
        a = new y();
    }

    private /* synthetic */ y() {
    }

    public final int compare(Object object, Object object2) {
        return FirmwareActivity.Y1((FirmwareModel)((FirmwareModel)object), (FirmwareModel)((FirmwareModel)object2));
    }
}


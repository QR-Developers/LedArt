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

public final class x
implements Comparator {
    public static final /* synthetic */ x a;

    static /* synthetic */ {
        a = new x();
    }

    private /* synthetic */ x() {
    }

    public final int compare(Object object, Object object2) {
        return FirmwareActivity.W1((FirmwareModel)((FirmwareModel)object), (FirmwareModel)((FirmwareModel)object2));
    }
}


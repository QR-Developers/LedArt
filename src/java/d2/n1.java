/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.component.SelectCardDialog
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.ScreenParamActivity
 *  com.huidu.applibs.common.model.CardConfig
 *  java.lang.Object
 */
package d2;

import cn.huidu.huiduapp.ledart.ui.component.SelectCardDialog;
import cn.huidu.huiduapp.ledart.ui.singlecolor.ScreenParamActivity;
import com.huidu.applibs.common.model.CardConfig;

public final class n1
implements SelectCardDialog.b {
    public final /* synthetic */ ScreenParamActivity a;

    public /* synthetic */ n1(ScreenParamActivity screenParamActivity) {
        this.a = screenParamActivity;
    }

    @Override
    public final void a(CardConfig cardConfig) {
        ScreenParamActivity.b2((ScreenParamActivity)this.a, (CardConfig)cardConfig);
    }
}


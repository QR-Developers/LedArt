/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.view.ScWidgetMenuViewGroup
 *  java.lang.Object
 */
package g2;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.view.ScWidgetMenuViewGroup;

public final class n
implements View.OnClickListener {
    public final /* synthetic */ ScWidgetMenuViewGroup a;

    public /* synthetic */ n(ScWidgetMenuViewGroup scWidgetMenuViewGroup) {
        this.a = scWidgetMenuViewGroup;
    }

    public final void onClick(View view) {
        ScWidgetMenuViewGroup.b((ScWidgetMenuViewGroup)this.a, (View)view);
    }
}


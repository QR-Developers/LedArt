/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.rubik.view.RubikWidgetMenuViewGroup
 *  java.lang.Object
 */
package b2;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.rubik.view.RubikWidgetMenuViewGroup;

public final class b
implements View.OnClickListener {
    public final /* synthetic */ RubikWidgetMenuViewGroup a;

    public /* synthetic */ b(RubikWidgetMenuViewGroup rubikWidgetMenuViewGroup) {
        this.a = rubikWidgetMenuViewGroup;
    }

    public final void onClick(View view) {
        RubikWidgetMenuViewGroup.b((RubikWidgetMenuViewGroup)this.a, (View)view);
    }
}


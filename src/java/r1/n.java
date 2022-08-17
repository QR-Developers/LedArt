/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.huiduapp.ledart.ui.lcd.ledandroid.AndroidLedWifiSettingStationFragment
 *  java.lang.Object
 *  java.util.List
 */
package r1;

import android.view.View;
import cn.huidu.huiduapp.ledart.ui.lcd.ledandroid.AndroidLedWifiSettingStationFragment;
import java.util.List;

public final class n
implements View.OnClickListener {
    public final /* synthetic */ AndroidLedWifiSettingStationFragment a;
    public final /* synthetic */ List b;

    public /* synthetic */ n(AndroidLedWifiSettingStationFragment androidLedWifiSettingStationFragment, List list) {
        this.a = androidLedWifiSettingStationFragment;
        this.b = list;
    }

    public final void onClick(View view) {
        AndroidLedWifiSettingStationFragment.i1((AndroidLedWifiSettingStationFragment)this.a, (List)this.b, (View)view);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.WifiSettingActivity
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package d2;

import cn.huidu.huiduapp.ledart.ui.singlecolor.WifiSettingActivity;

public final class h2
implements Runnable {
    public final /* synthetic */ WifiSettingActivity a;
    public final /* synthetic */ String b;

    public /* synthetic */ h2(WifiSettingActivity wifiSettingActivity, String string2) {
        this.a = wifiSettingActivity;
        this.b = string2;
    }

    public final void run() {
        WifiSettingActivity.S1((WifiSettingActivity)this.a, (String)this.b);
    }
}


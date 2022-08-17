/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.fragment.app.FragmentManager
 *  cn.huidu.lcd.transmit.adapter.LCScreenOnOffInfo
 *  cn.huidu.lcd.transmit.adapter.LCScreenOnOffInfo$ScreenOnOffItem
 *  h2.b0
 *  java.lang.Object
 */
package h2;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import cn.huidu.lcd.transmit.adapter.LCScreenOnOffInfo;
import h2.b0;

public final class x
implements View.OnClickListener {
    public final /* synthetic */ LCScreenOnOffInfo.ScreenOnOffItem a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ FragmentManager c;

    public /* synthetic */ x(LCScreenOnOffInfo.ScreenOnOffItem screenOnOffItem, TextView textView, FragmentManager fragmentManager) {
        this.a = screenOnOffItem;
        this.b = textView;
        this.c = fragmentManager;
    }

    public final void onClick(View view) {
        b0.d((LCScreenOnOffInfo.ScreenOnOffItem)this.a, (TextView)this.b, (FragmentManager)this.c, (View)view);
    }
}


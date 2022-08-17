/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  cn.huidu.cloud.ui.program.fullcolor.adapter.CloudWeatherCityAdapter
 *  cn.huidu.cloud.ui.program.fullcolor.adapter.CloudWeatherCityAdapter$a
 *  java.lang.Object
 */
package cn.huidu.cloud.ui.program.fullcolor.adapter;

import android.view.View;
import cn.huidu.cloud.ui.program.fullcolor.adapter.CloudWeatherCityAdapter;

public final class e
implements View.OnClickListener {
    public final /* synthetic */ CloudWeatherCityAdapter.a a;

    public /* synthetic */ e(CloudWeatherCityAdapter.a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        CloudWeatherCityAdapter.a.b((CloudWeatherCityAdapter.a)this.a, (View)view);
    }
}


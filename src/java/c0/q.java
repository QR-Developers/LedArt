/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  cn.huidu.view.CustomSwitch
 *  cn.huidu.view.CustomSwitch$c
 *  com.coship.fullcolorprogram.model.Node
 *  com.coship.fullcolorprogram.model.Weather
 *  com.coship.fullcolorprogram.setting.b
 *  com.coship.fullcolorprogram.view.CircleView
 *  com.coship.fullcolorprogram.view.a
 *  com.coship.fullcolorprogram.view.widget.WeatherWidget
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  n4.g
 */
package c0;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b0.a;
import c0.p;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.R$string;
import cn.huidu.view.CustomSwitch;
import com.coship.fullcolorprogram.model.Node;
import com.coship.fullcolorprogram.model.Weather;
import com.coship.fullcolorprogram.setting.b;
import com.coship.fullcolorprogram.view.CircleView;
import com.coship.fullcolorprogram.view.widget.WeatherWidget;
import java.util.List;
import java.util.Map;
import n4.g;

public class q
extends b
implements View.OnClickListener {
    private CustomSwitch q;
    private CircleView r;
    private g s;
    private Context t;
    private WeatherWidget u;
    private Weather v;
    private List<Map<String, Object>> w;
    private a x;

    public static /* synthetic */ void Y(q q2, CustomSwitch customSwitch, boolean bl) {
        q2.Z(customSwitch, bl);
    }

    private /* synthetic */ void Z(CustomSwitch customSwitch, boolean bl) {
        this.v.setTemperatureUnit((int)bl);
        this.u.n();
    }

    private void a0() {
        if (this.w == null) {
            m5.g.g(this.t);
            this.w = m5.g.a;
        }
        if (this.x == null) {
            a a2;
            this.x = a2 = new a(this.t);
            a2.b(this.w);
        }
        this.x.c(this.v.getTemperatureColor());
        if (this.s == null) {
            g g2;
            this.s = g2 = new g();
            g2.X(this.t.getResources().getString(R$string.color_string));
        }
        this.s.F(1);
        g g3 = this.s;
        Object[] arrobject = new Object[]{this.x, this.v.getTemperatureColor()};
        g3.E(arrobject);
    }

    public /* varargs */ void A(Object ... arrobject) {
        boolean bl;
        boolean bl2;
        if (arrobject != null && (bl = arrobject.length) >= (bl2 = true)) {
            Weather weather;
            WeatherWidget weatherWidget;
            this.u = weatherWidget = (WeatherWidget)arrobject[0];
            this.v = weather = (Weather)weatherWidget.getModel();
            CustomSwitch customSwitch = this.q;
            if (weather.getTemperatureUnit() == 0) {
                bl2 = false;
            }
            customSwitch.setChecked(bl2);
            this.r.setBackgroundColor(this.v.getTemperatureColor());
        }
    }

    public /* varargs */ void C(int n2, Object ... arrobject) {
        if (arrobject != null && arrobject.length != 0) {
            if (arrobject[0] == null) {
                return;
            }
            int n3 = (Integer)arrobject[0];
            int n4 = (Integer)this.x.a(n3).get((Object)"color");
            this.v.setTemperatureColor(n4);
            this.u.n();
        }
    }

    public void onClick(View view) {
        this.a0();
        this.H((com.coship.fullcolorprogram.view.a)this.s);
    }

    public View z(Context context, ViewGroup viewGroup) {
        CustomSwitch customSwitch;
        this.t = context;
        View view = LayoutInflater.from((Context)context).inflate(R$layout.view_cloud_weather_temp_setting, null);
        this.S(view);
        this.q = customSwitch = (CustomSwitch)view.findViewById(R$id.custom_switch);
        customSwitch.setOnCheckedChangeListener((CustomSwitch.c)new p(this));
        this.r = (CircleView)view.findViewById(R$id.color_view);
        view.findViewById(R$id.item_color).setOnClickListener((View.OnClickListener)this);
        return super.z(context, viewGroup);
    }
}


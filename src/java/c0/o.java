/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  android.widget.Toast
 *  cn.huidu.view.CheckSelectColorView
 *  cn.huidu.view.CheckSelectColorView$a
 *  com.coship.fullcolorprogram.model.Node
 *  com.coship.fullcolorprogram.model.Weather
 *  com.coship.fullcolorprogram.view.a
 *  com.coship.fullcolorprogram.view.widget.WeatherWidget
 *  com.huidu.applibs.entity.model.CloudFontModel
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  l.f
 *  l4.c0
 *  l4.o0
 *  l5.f
 *  n4.g
 *  n4.i
 *  o4.h
 *  p.h0
 */
package c0;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import b0.a;
import c0.f;
import c0.g;
import c0.h;
import c0.i;
import c0.j;
import c0.k;
import c0.l;
import c0.m;
import c0.n;
import c0.q;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.R$string;
import cn.huidu.cloud.api.entity.program.WeatherCityDTO;
import cn.huidu.cloud.api.entity.program.WeatherForecastDTO;
import cn.huidu.view.CheckSelectColorView;
import com.coship.fullcolorprogram.model.Node;
import com.coship.fullcolorprogram.model.Weather;
import com.coship.fullcolorprogram.view.widget.WeatherWidget;
import com.huidu.applibs.entity.model.CloudFontModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.e;
import l4.c0;
import l4.o0;
import p.h0;

public class o
extends o0
implements View.OnClickListener {
    private CheckSelectColorView A;
    private Context B;
    private WeatherWidget C;
    private Weather D;
    private List<Map<String, Object>> E;
    private List<String> F = new ArrayList();
    private List<String> G = new ArrayList();
    private List<Integer> H;
    private List<Integer> I;
    private View[] k;
    private n4.g l;
    private a m;
    private n4.i n;
    private m4.f o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private CheckSelectColorView u;
    private CheckSelectColorView v;
    private CheckSelectColorView w;
    private CheckSelectColorView x;
    private CheckSelectColorView y;
    private CheckSelectColorView z;

    public static /* synthetic */ void N(o o2, l.f f2) {
        o2.h0(f2);
    }

    public static /* synthetic */ void O(o o2, boolean bl) {
        o2.a0(bl);
    }

    public static /* synthetic */ void P(o o2, boolean bl) {
        o2.d0(bl);
    }

    public static /* synthetic */ void Q(o o2, boolean bl) {
        o2.c0(bl);
    }

    public static /* synthetic */ void R(o o2, boolean bl) {
        o2.b0(bl);
    }

    public static /* synthetic */ void S(o o2, boolean bl) {
        o2.e0(bl);
    }

    public static /* synthetic */ void T(o o2, boolean bl) {
        o2.f0(bl);
    }

    public static /* synthetic */ void U(o o2, boolean bl) {
        o2.g0(bl);
    }

    private c0 V(int n) {
        c0 c02 = new c0();
        c02.F(n);
        if (n == 3) {
            c02.X(this.B.getString(R$string.fontsize));
            Object[] arrobject = new Object[]{this.k0(), this.H.indexOf((Object)this.D.getFontSize())};
            c02.E(arrobject);
            return c02;
        }
        if (n == 5) {
            c02.X(this.B.getString(R$string.clock_interval));
            Object[] arrobject = new Object[]{this.l0(), this.D.getSpacing()};
            c02.E(arrobject);
            return c02;
        }
        if (n == 4) {
            c02.X(this.B.getString(R$string.stop_setting));
            Object[] arrobject = new Object[]{this.l0(), this.D.getHoldTime()};
            c02.E(arrobject);
        }
        return c02;
    }

    private f W() {
        f f2 = new f();
        f2.X(this.B.getString(R$string.city_search));
        f2.F(1);
        return f2;
    }

    private q X() {
        q q2 = new q();
        q2.X(this.B.getString(R$string.temprature_style));
        q2.F(8);
        Object[] arrobject = new Object[]{this.C};
        q2.E(arrobject);
        return q2;
    }

    private void Y(View view) {
        this.p = (TextView)view.findViewById(R$id.city_txt);
        this.q = (TextView)view.findViewById(R$id.font_txt);
        this.r = (TextView)view.findViewById(R$id.font_size_txt);
        this.s = (TextView)view.findViewById(R$id.hold_time_txt);
        this.t = (TextView)view.findViewById(R$id.spacing_txt);
        view.findViewById(R$id.item_city).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.item_font).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.item_font_size).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.item_hold_time).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.item_spacing).setOnClickListener((View.OnClickListener)this);
    }

    private void Z(View view) {
        CheckSelectColorView checkSelectColorView;
        CheckSelectColorView checkSelectColorView2;
        CheckSelectColorView checkSelectColorView3;
        CheckSelectColorView checkSelectColorView4;
        CheckSelectColorView checkSelectColorView5;
        CheckSelectColorView checkSelectColorView6;
        CheckSelectColorView checkSelectColorView7;
        this.u = checkSelectColorView3 = (CheckSelectColorView)view.findViewById(R$id.city_style_item);
        checkSelectColorView3.setListener((CheckSelectColorView.a)new g(this));
        this.v = checkSelectColorView7 = (CheckSelectColorView)view.findViewById(R$id.date_style_item);
        checkSelectColorView7.setListener((CheckSelectColorView.a)new j(this));
        this.w = checkSelectColorView2 = (CheckSelectColorView)view.findViewById(R$id.temp_style_item);
        checkSelectColorView2.setListener((CheckSelectColorView.a)new i(this));
        this.x = checkSelectColorView = (CheckSelectColorView)view.findViewById(R$id.weather_style_item);
        checkSelectColorView.setListener((CheckSelectColorView.a)new h(this));
        this.y = checkSelectColorView5 = (CheckSelectColorView)view.findViewById(R$id.wind_speed_style_item);
        checkSelectColorView5.setListener((CheckSelectColorView.a)new k(this));
        this.z = checkSelectColorView4 = (CheckSelectColorView)view.findViewById(R$id.wind_direction_style_item);
        checkSelectColorView4.setListener((CheckSelectColorView.a)new l(this));
        this.A = checkSelectColorView6 = (CheckSelectColorView)view.findViewById(R$id.PM_style_item);
        checkSelectColorView6.setListener((CheckSelectColorView.a)new m(this));
        this.u.setOnClickListener((View.OnClickListener)this);
        this.v.setOnClickListener((View.OnClickListener)this);
        this.w.setOnClickListener((View.OnClickListener)this);
        this.x.setOnClickListener((View.OnClickListener)this);
        this.y.setOnClickListener((View.OnClickListener)this);
        this.z.setOnClickListener((View.OnClickListener)this);
        this.A.setOnClickListener((View.OnClickListener)this);
    }

    private /* synthetic */ void a0(boolean bl) {
        this.D.setShowCity(bl);
        this.C.n();
    }

    private /* synthetic */ void b0(boolean bl) {
        this.D.setShowDate(bl);
        this.C.n();
    }

    private /* synthetic */ void c0(boolean bl) {
        this.D.setShowTemperature(bl);
        this.C.n();
    }

    private /* synthetic */ void d0(boolean bl) {
        this.D.setShowWeather(bl);
        this.C.n();
    }

    private /* synthetic */ void e0(boolean bl) {
        this.D.setShowWindSpeed(bl);
        this.C.n();
    }

    private /* synthetic */ void f0(boolean bl) {
        this.D.setShowWindDirection(bl);
        this.C.n();
    }

    private /* synthetic */ void g0(boolean bl) {
        this.D.setShowPM2_5(bl);
        this.C.n();
    }

    private /* synthetic */ void h0(l.f f2) {
        if (f2.j()) {
            WeatherForecastDTO weatherForecastDTO = (WeatherForecastDTO)f2.c();
            if (weatherForecastDTO != null) {
                this.D.setDate(weatherForecastDTO.date);
                this.D.setCond(weatherForecastDTO.cond);
                this.D.setTmpMax(weatherForecastDTO.tmpMax);
                this.D.setTmpMin(weatherForecastDTO.tmpMin);
                this.D.setHum(weatherForecastDTO.hum);
                this.D.setWindDir(weatherForecastDTO.windDir);
                this.D.setWindSc(weatherForecastDTO.windSc);
                this.D.setPm25(weatherForecastDTO.pm25);
                this.C.n();
                return;
            }
        } else {
            Context context = this.B;
            Toast.makeText((Context)context, (CharSequence)context.getString(R$string.get_weather_info_fail), (int)1).show();
        }
    }

    private void i0(int n, int n2) {
        if (this.E == null) {
            m5.g.g(this.B);
            this.E = m5.g.a;
        }
        if (this.m == null) {
            a a2;
            this.m = a2 = new a(this.B);
            a2.b(this.E);
        }
        this.m.c(n2);
        if (this.l == null) {
            n4.g g2;
            this.l = g2 = new n4.g();
            g2.X(this.B.getResources().getString(R$string.color_string));
        }
        this.l.F(n);
        n4.g g3 = this.l;
        Object[] arrobject = new Object[]{this.m, n2};
        g3.E(arrobject);
    }

    private void j0() {
        if (this.o == null) {
            m4.f f2;
            this.o = f2 = new m4.f(this.B);
            f2.c(this.G);
        }
        int n = this.F.indexOf((Object)this.D.getFontName());
        this.o.b(n);
        if (this.n == null) {
            n4.i i2;
            this.n = i2 = new n4.i();
            i2.X(this.B.getString(R$string.font));
        }
        this.n.F(2);
        n4.i i3 = this.n;
        Object[] arrobject = new Object[]{this.o, n};
        i3.E(arrobject);
    }

    private List<Integer> k0() {
        if (this.H == null) {
            this.H = o4.h.c();
        }
        return this.H;
    }

    private List<Integer> l0() {
        if (this.I == null) {
            this.I = o4.h.d();
        }
        return this.I;
    }

    private void m0(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        h0.C((String)string2, (e)new n(this));
    }

    private void n0(int n2, int n3) {
        int n4 = (Integer)this.m.a(n3).get((Object)"color");
        if (n2 == 6) {
            this.D.setCityTextColor(n4);
            return;
        }
        if (n2 == 7) {
            this.D.setDateColor(n4);
            return;
        }
        if (n2 == 9) {
            this.D.setWeatherColor(n4);
            return;
        }
        if (n2 == 10) {
            this.D.setWindSpeedColor(n4);
            return;
        }
        if (n2 == 11) {
            this.D.setWindDirectionColor(n4);
            return;
        }
        if (n2 == 12) {
            this.D.setPm2_5Color(n4);
        }
    }

    private void o0() {
        this.u.setEnabled(this.D.isShowCity());
        this.u.setViewColor(this.D.getCityTextColor());
        this.v.setEnabled(this.D.isShowDate());
        this.v.setViewColor(this.D.getDateColor());
        this.w.setEnabled(this.D.isShowTemperature());
        this.w.setViewColor(this.D.getTemperatureColor());
        this.x.setEnabled(this.D.isShowWeather());
        this.x.setViewColor(this.D.getWeatherColor());
        this.y.setEnabled(this.D.isShowWindSpeed());
        this.y.setViewColor(this.D.getWindSpeedColor());
        this.z.setEnabled(this.D.isShowWindDirection());
        this.z.setViewColor(this.D.getWindDirectionColor());
        this.A.setEnabled(this.D.isShowPM2_5());
        this.A.setViewColor(this.D.getPm2_5Color());
        this.p.setText((CharSequence)this.D.getCityText());
        this.r.setText((CharSequence)String.valueOf((int)this.D.getFontSize()));
        this.s.setText((CharSequence)String.valueOf((int)this.D.getHoldTime()));
        this.t.setText((CharSequence)String.valueOf((int)this.D.getSpacing()));
        for (CloudFontModel cloudFontModel : l5.f.b((Context)this.B).a()) {
            this.G.add((Object)cloudFontModel.fontShowName);
            this.F.add((Object)cloudFontModel.fontTrueName);
            if (!cloudFontModel.fontTrueName.equals((Object)this.D.getFontName())) continue;
            this.q.setText((CharSequence)cloudFontModel.fontShowName);
        }
    }

    public /* varargs */ void A(Object ... arrobject) {
        if (arrobject == null) {
            return;
        }
        if (arrobject.length >= 1 && arrobject[0] != null && arrobject[0] instanceof WeatherWidget) {
            WeatherWidget weatherWidget;
            this.C = weatherWidget = (WeatherWidget)arrobject[0];
            this.D = (Weather)weatherWidget.getModel();
            this.o0();
        }
    }

    public /* varargs */ void C(int n2, Object ... arrobject) {
        if (arrobject != null) {
            if (arrobject.length < 1) {
                return;
            }
            if (n2 == 1) {
                WeatherCityDTO weatherCityDTO = (WeatherCityDTO)arrobject[0];
                this.D.setCityText(weatherCityDTO.location);
                this.D.setCityName(weatherCityDTO.location);
                this.D.setCityId(weatherCityDTO.code);
                this.m0(weatherCityDTO.code);
            } else if (n2 == 2) {
                int n3 = (Integer)arrobject[0];
                this.q.setText((CharSequence)this.G.get(n3));
                this.D.setFontName((String)this.F.get(n3));
            } else if (n2 != 8) {
                if (n2 == 3) {
                    int n4 = (Integer)arrobject[0];
                    this.D.setFontSize(((Integer)this.H.get(n4)).intValue());
                } else if (n2 == 4) {
                    int n5 = (Integer)arrobject[0];
                    this.D.setHoldTime(((Integer)this.I.get(n5)).intValue());
                } else if (n2 == 5) {
                    int n6 = (Integer)arrobject[0];
                    this.D.setSpacing(((Integer)this.I.get(n6)).intValue());
                } else {
                    this.n0(n2, (Integer)arrobject[0]);
                }
            }
            this.C.n();
        }
    }

    protected View K(int n2) {
        return this.k[n2];
    }

    protected int L() {
        return this.k.length;
    }

    protected CharSequence M(int n2, Resources resources) {
        Context context;
        int n3;
        if (n2 == 0) {
            context = this.B;
            n3 = R$string.weather;
        } else {
            context = this.B;
            n3 = R$string.style_setting;
        }
        return context.getString(n3);
    }

    public void onClick(View view) {
        int n2 = view.getId();
        if (n2 == R$id.item_city) {
            this.H((com.coship.fullcolorprogram.view.a)this.W());
            return;
        }
        if (n2 == R$id.item_font) {
            this.j0();
            this.H((com.coship.fullcolorprogram.view.a)this.n);
            return;
        }
        if (n2 == R$id.item_font_size) {
            this.H((com.coship.fullcolorprogram.view.a)this.V(3));
            return;
        }
        if (n2 == R$id.item_hold_time) {
            this.H((com.coship.fullcolorprogram.view.a)this.V(4));
            return;
        }
        if (n2 == R$id.item_spacing) {
            this.H((com.coship.fullcolorprogram.view.a)this.V(5));
            return;
        }
        if (n2 == R$id.city_style_item) {
            this.i0(6, this.D.getCityTextColor());
            this.H((com.coship.fullcolorprogram.view.a)this.l);
            return;
        }
        if (n2 == R$id.date_style_item) {
            this.i0(7, this.D.getDateColor());
            this.H((com.coship.fullcolorprogram.view.a)this.l);
            return;
        }
        if (n2 == R$id.temp_style_item) {
            this.H((com.coship.fullcolorprogram.view.a)this.X());
            return;
        }
        if (n2 == R$id.weather_style_item) {
            this.i0(9, this.D.getWeatherColor());
            this.H((com.coship.fullcolorprogram.view.a)this.l);
            return;
        }
        if (n2 == R$id.wind_speed_style_item) {
            this.i0(10, this.D.getWindSpeedColor());
            this.H((com.coship.fullcolorprogram.view.a)this.l);
            return;
        }
        if (n2 == R$id.wind_direction_style_item) {
            this.i0(11, this.D.getWindDirectionColor());
            this.H((com.coship.fullcolorprogram.view.a)this.l);
            return;
        }
        if (n2 == R$id.PM_style_item) {
            this.i0(12, this.D.getPm2_5Color());
            this.H((com.coship.fullcolorprogram.view.a)this.l);
        }
    }

    public View z(Context context, ViewGroup viewGroup) {
        this.B = context;
        this.k = new View[2];
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        this.k[0] = layoutInflater.inflate(R$layout.view_cloud_weather_setting, null);
        this.k[1] = layoutInflater.inflate(R$layout.view_cloud_weather_style_setting, null);
        this.Y(this.k[0]);
        this.Z(this.k[1]);
        return super.z(context, viewGroup);
    }
}


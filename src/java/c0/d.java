/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.TextView
 *  cn.huidu.view.CustomSwitch
 *  cn.huidu.view.CustomSwitch$c
 *  com.coship.fullcolorprogram.R
 *  com.coship.fullcolorprogram.R$string
 *  com.coship.fullcolorprogram.model.Node
 *  com.coship.fullcolorprogram.model.Time
 *  com.coship.fullcolorprogram.view.a
 *  com.coship.fullcolorprogram.view.widget.TimerWidget
 *  com.huidu.applibs.entity.model.CloudFontModel
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  l4.c0
 *  l4.n0
 *  l4.o0
 *  l5.f
 *  n4.d
 *  n4.g
 *  n4.i
 *  n4.j
 *  n4.r
 *  n4.r$a
 *  n4.s
 *  o4.h
 *  w8.b
 */
package c0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import c0.c;
import c0.d;
import cn.huidu.cloud.R$color;
import cn.huidu.cloud.R$drawable;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.R$string;
import cn.huidu.view.CustomSwitch;
import com.coship.fullcolorprogram.R;
import com.coship.fullcolorprogram.model.Node;
import com.coship.fullcolorprogram.model.Time;
import com.coship.fullcolorprogram.view.widget.TimerWidget;
import com.huidu.applibs.entity.model.CloudFontModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l4.c0;
import l4.n0;
import l4.o0;
import m4.f;
import m5.l;
import n4.g;
import n4.i;
import n4.j;
import n4.r;
import n4.s;
import o4.h;

public class d
extends o0
implements View.OnClickListener,
CustomSwitch.c {
    private View A;
    private TimerWidget B;
    private b C;
    private b0.a D;
    private List<String> E = new ArrayList();
    private List<String> F = new ArrayList();
    private List<Map<String, Object>> G;
    private List<Integer> H;
    private Context k;
    private View l;
    private View m;
    private g n;
    private i o;
    private f p;
    private CustomSwitch q;
    private CustomSwitch r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private View z;

    public static /* synthetic */ void N(d d2, String string2) {
        d2.T(string2);
    }

    private int Q() {
        return this.B.getDisplayStyle() == 3;
    }

    private void R(View view) {
        view.findViewById(R$id.layout_title_setting).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.layout_target_date).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.layout_target_time).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.layout_font_name).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.layout_font_size).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.layout_space_setting).setOnClickListener((View.OnClickListener)this);
        this.q = (CustomSwitch)view.findViewById(R$id.title_switch);
        this.s = (TextView)view.findViewById(R$id.txt_title);
        this.t = (TextView)view.findViewById(R$id.txt_tartget_date);
        this.u = (TextView)view.findViewById(R$id.txt_target_time);
        this.v = (TextView)view.findViewById(R$id.font_name_txt);
        this.w = (TextView)view.findViewById(R$id.font_size_txt);
        this.x = (TextView)view.findViewById(R$id.txt_space);
        this.q.setOnCheckedChangeListener((CustomSwitch.c)this);
    }

    private void S(View view) {
        CustomSwitch customSwitch;
        view.findViewById(R$id.layout_display_style).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.layout_timer_unit).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.layout_timer_number_font).setOnClickListener((View.OnClickListener)this);
        view.findViewById(R$id.layout_timer_unit_font).setOnClickListener((View.OnClickListener)this);
        this.z = view.findViewById(R$id.value_color_view);
        this.A = view.findViewById(R$id.unit_color_view);
        this.r = customSwitch = (CustomSwitch)view.findViewById(R$id.single_line_switch);
        customSwitch.setOnCheckedChangeListener((CustomSwitch.c)this);
        this.y = (TextView)view.findViewById(R$id.txt_display_style);
        this.C = new BaseAdapter(){

            public String a(int n) {
                if (n == 0) {
                    return d.this.k.getString(R$string.default_style);
                }
                return "00:00:00:00";
            }

            public int getCount() {
                return 2;
            }

            public long getItemId(int n) {
                return n;
            }

            public View getView(int n, View view, ViewGroup viewGroup) {
                TextView textView;
                if (view == null) {
                    view = LayoutInflater.from((Context)d.this.k).inflate(R$layout.item_simple, null);
                    textView = (TextView)view.findViewById(R$id.textView);
                    view.setTag((Object)textView);
                } else {
                    textView = (TextView)view.getTag();
                }
                textView.setText((CharSequence)this.a(n));
                if (n == d.this.Q()) {
                    view.setBackgroundResource(R$color.listview_focused);
                    return view;
                }
                view.setBackgroundResource(R$drawable.listview_selector);
                return view;
            }
        };
    }

    private /* synthetic */ void T(String string2) {
        this.B.setTargetTime(string2);
    }

    private void U(int n, int n2) {
        if (this.G == null) {
            m5.g.g(this.k);
            this.G = m5.g.a;
        }
        if (this.D == null) {
            b0.a a2;
            this.D = a2 = new b0.a(this.k);
            a2.b(this.G);
        }
        this.D.c(n2);
        if (this.n == null) {
            g g2;
            this.n = g2 = new g();
            g2.X(this.k.getResources().getString(R$string.color_string));
        }
        this.n.F(n);
        g g3 = this.n;
        Object[] arrobject = new Object[]{this.D, n2};
        g3.E(arrobject);
    }

    private void V() {
        if (this.p == null) {
            f f2;
            this.p = f2 = new f(this.k);
            f2.c(this.F);
        }
        int n = this.E.indexOf((Object)((Time)this.B.getModel()).getTopTextFontName());
        this.p.b(n);
        if (this.o == null) {
            i i2;
            this.o = i2 = new i();
            i2.X(this.k.getString(R$string.font));
        }
        this.o.F(10);
        i i3 = this.o;
        Object[] arrobject = new Object[]{this.p, n};
        i3.E(arrobject);
    }

    private List<Integer> W() {
        if (this.H == null) {
            this.H = h.c();
        }
        return this.H;
    }

    private void X(View view, int n) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float)l.a((Context)w8.b.a(), 3.0f));
        gradientDrawable.setStroke(1, Color.parseColor((String)"#d7d7d7"));
        gradientDrawable.setColor(n);
        view.setBackground((Drawable)gradientDrawable);
    }

    public /* varargs */ void A(Object ... arrobject) {
        if (arrobject == null) {
            return;
        }
        if (arrobject.length > 0) {
            TimerWidget timerWidget;
            this.B = timerWidget = (TimerWidget)arrobject[0];
            this.s.setText((CharSequence)timerWidget.getFixedText());
            this.q.setChecked(this.B.p());
            this.r.setChecked(this.B.t());
            this.w.setText((CharSequence)String.valueOf((int)this.B.getFixedTextSize()));
            this.x.setText((CharSequence)String.valueOf((int)this.B.getSpace()));
            this.y.setText((CharSequence)this.C.a(this.Q()));
            this.t.setText((CharSequence)this.B.getTargetDate());
            this.u.setText((CharSequence)this.B.getTargetTime());
            this.X(this.z, this.B.getTimeColor());
            this.X(this.A, this.B.getTimeUnitColor());
            for (CloudFontModel cloudFontModel : l5.f.b((Context)this.k).a()) {
                this.F.add((Object)cloudFontModel.fontShowName);
                this.E.add((Object)cloudFontModel.fontTrueName);
                if (!cloudFontModel.fontTrueName.equals((Object)((Time)this.B.getModel()).getTopTextFontName())) continue;
                this.v.setText((CharSequence)cloudFontModel.fontShowName);
            }
        }
    }

    public /* varargs */ void C(int n, Object ... arrobject) {
        if (arrobject != null) {
            if (arrobject.length < 1) {
                return;
            }
            switch (n) {
                default: {
                    return;
                }
                case 10: {
                    int n2 = (Integer)arrobject[0];
                    String string2 = (String)this.E.get(n2);
                    this.v.setText((CharSequence)this.F.get(n2));
                    Time time = (Time)this.B.getModel();
                    time.setTopTextFontName(string2);
                    time.setTimeUnitFontName(string2);
                    time.setTimeUnitFontName(string2);
                    return;
                }
                case 9: {
                    int n3 = (Integer)arrobject[0];
                    int n4 = (Integer)this.H.get(n3);
                    ((Time)this.B.getModel()).setTimeFontSize(n4);
                    ((Time)this.B.getModel()).setTimeUnitFontSize(n4);
                    this.B.setFixedTextSize(n4);
                    return;
                }
                case 8: {
                    int n5 = (Integer)arrobject[0];
                    int n6 = (Integer)this.D.a(n5).get((Object)"color");
                    this.B.setTimeUnitColor(n6);
                    return;
                }
                case 7: {
                    int n7 = (Integer)arrobject[0];
                    int n8 = (Integer)this.D.a(n7).get((Object)"color");
                    this.B.setTimeColor(n8);
                    return;
                }
                case 5: {
                    int n9 = (Integer)arrobject[0];
                    TimerWidget timerWidget = this.B;
                    int n10 = 0;
                    if (n9 == 1) {
                        n10 = 3;
                    }
                    timerWidget.setDisplayStyle(n10);
                    return;
                }
                case 4: 
            }
            int n11 = (Integer)arrobject[0];
            this.B.setSpace(n11);
        }
    }

    protected View K(int n) {
        if (n == 0) {
            return this.l;
        }
        return this.m;
    }

    protected int L() {
        return 2;
    }

    protected CharSequence M(int n, Resources resources) {
        Context context = this.k;
        int n2 = n == 0 ? R$string.timer : R$string.style_setting;
        return context.getString(n2);
    }

    public void onClick(View view) {
        int n = view.getId();
        if (n == R$id.layout_title_setting) {
            n0 n02 = new n0();
            n02.X(this.k.getString(R$string.fixed_text));
            n02.F(1);
            Object[] arrobject = new Object[]{this.B};
            n02.E(arrobject);
            this.H((com.coship.fullcolorprogram.view.a)n02);
            return;
        }
        if (n == R$id.layout_target_date) {
            n4.d d2 = new n4.d();
            d2.X(this.k.getString(R$string.target_date));
            d2.F(2);
            Object[] arrobject = new Object[]{this.B};
            d2.E(arrobject);
            this.H((com.coship.fullcolorprogram.view.a)d2);
            return;
        }
        if (n == R$id.layout_target_time) {
            r r2 = new r();
            r2.X(this.k.getString(R$string.target_time));
            r2.F(3);
            Object[] arrobject = new Object[]{this.B.getTargetTime()};
            r2.E(arrobject);
            r2.Z((r.a)new c(this));
            this.H((com.coship.fullcolorprogram.view.a)r2);
            return;
        }
        if (n == R$id.layout_font_name) {
            this.V();
            this.H((com.coship.fullcolorprogram.view.a)this.o);
            return;
        }
        if (n == R$id.layout_font_size) {
            c0 c02 = new c0();
            c02.F(9);
            c02.X(this.k.getString(R.string.font_size));
            Object[] arrobject = new Object[]{this.W(), this.H.indexOf((Object)this.B.getFixedTextSize())};
            c02.E(arrobject);
            this.H((com.coship.fullcolorprogram.view.a)c02);
            return;
        }
        if (n == R$id.layout_space_setting) {
            j j2 = new j();
            j2.X(this.k.getString(R$string.clock_interval));
            j2.F(4);
            Object[] arrobject = new Object[]{0, 99, this.B.getSpace()};
            j2.E(arrobject);
            this.H((com.coship.fullcolorprogram.view.a)j2);
            return;
        }
        if (n == R$id.layout_display_style) {
            i i2 = new i();
            i2.X(this.k.getResources().getString(R$string.display_style));
            i2.F(5);
            Object[] arrobject = new Object[]{this.C, this.Q()};
            i2.E(arrobject);
            this.H((com.coship.fullcolorprogram.view.a)i2);
            return;
        }
        if (n == R$id.layout_timer_unit) {
            s s2 = new s();
            s2.X(this.k.getString(R$string.timer_unit_setting));
            s2.F(6);
            Object[] arrobject = new Object[]{this.B};
            s2.E(arrobject);
            this.H((com.coship.fullcolorprogram.view.a)s2);
            return;
        }
        if (n == R$id.layout_timer_number_font) {
            this.U(7, this.B.getTimeColor());
            this.H((com.coship.fullcolorprogram.view.a)this.n);
            return;
        }
        if (n == R$id.layout_timer_unit_font) {
            this.U(8, this.B.getTimeUnitColor());
            this.H((com.coship.fullcolorprogram.view.a)this.n);
        }
    }

    public void u0(CustomSwitch customSwitch, boolean bl) {
        if (customSwitch == this.q) {
            this.B.setShowFixedText(bl);
            return;
        }
        if (customSwitch == this.r) {
            this.B.setSingleLine(bl);
        }
    }

    public View z(Context context, ViewGroup viewGroup) {
        this.k = context;
        this.l = LayoutInflater.from((Context)context).inflate(R$layout.view_cloud_timer_setting, viewGroup, false);
        this.m = LayoutInflater.from((Context)context).inflate(R$layout.view_cloud_timer_style_setting, viewGroup, false);
        this.R(this.l);
        this.S(this.m);
        return super.z(context, viewGroup);
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  cn.huidu.view.inputview.AddAndSubtractInputView
 *  cn.huidu.view.inputview.AddAndSubtractInputView$b
 *  com.coship.fullcolorprogram.enums.CleanEffectType
 *  com.coship.fullcolorprogram.enums.EffectSpeed
 *  com.coship.fullcolorprogram.enums.ShowEffectsType
 *  com.coship.fullcolorprogram.model.Image
 *  com.coship.fullcolorprogram.model.Node
 *  com.coship.fullcolorprogram.view.a
 *  com.coship.fullcolorprogram.view.widget.ImageWidget
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.math.RoundingMode
 *  java.text.DecimalFormat
 *  l4.o0
 *  n4.h
 *  n4.i
 */
package c0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import c0.a;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.R$string;
import cn.huidu.view.inputview.AddAndSubtractInputView;
import com.coship.fullcolorprogram.enums.CleanEffectType;
import com.coship.fullcolorprogram.enums.EffectSpeed;
import com.coship.fullcolorprogram.enums.ShowEffectsType;
import com.coship.fullcolorprogram.model.Image;
import com.coship.fullcolorprogram.model.Node;
import com.coship.fullcolorprogram.view.widget.ImageWidget;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import l4.o0;
import m4.d;
import m4.g;
import n4.h;
import n4.i;

public class b
extends o0
implements View.OnClickListener {
    private m4.h A;
    private Activity k;
    private ImageWidget l;
    private View m;
    private LinearLayout n;
    private LinearLayout o;
    private LinearLayout p;
    private LinearLayout q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private AddAndSubtractInputView v;
    private i w;
    private h x;
    private d y;
    private g z;

    public static /* synthetic */ void N(b b2, float f2) {
        b2.P(f2);
    }

    private i O(int n, int n2, BaseAdapter baseAdapter, int n3) {
        if (this.w == null) {
            this.w = new i();
        }
        this.w.X(this.k.getResources().getString(n));
        this.w.F(n2);
        i i2 = this.w;
        Object[] arrobject = new Object[]{baseAdapter, n3};
        i2.E(arrobject);
        return this.w;
    }

    private /* synthetic */ void P(float f2) {
        if (f2 > 999.0f) {
            f2 = 999.0f;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        float f3 = Float.parseFloat((String)decimalFormat.format((double)f2));
        ((Image)this.l.getModel()).setWebHoldTime(f3);
        this.l.setHoldTime((int)f3);
    }

    private void Q(boolean bl) {
        if (bl) {
            this.n.setAlpha(1.0f);
            this.p.setAlpha(1.0f);
            this.o.setAlpha(1.0f);
            this.q.setAlpha(1.0f);
            this.n.setClickable(true);
            this.p.setClickable(true);
            this.o.setClickable(true);
            this.q.setClickable(true);
            return;
        }
        this.n.setAlpha(0.4f);
        this.p.setAlpha(0.4f);
        this.o.setAlpha(0.4f);
        this.q.setAlpha(0.4f);
        this.n.setClickable(false);
        this.p.setClickable(false);
        this.o.setClickable(false);
        this.q.setClickable(false);
    }

    public /* varargs */ void A(Object ... arrobject) {
        if (arrobject == null) {
            return;
        }
        if (arrobject[0] != null && arrobject[0] instanceof ImageWidget) {
            ImageWidget imageWidget;
            this.l = imageWidget = (ImageWidget)arrobject[0];
            Image image = (Image)imageWidget.getModel();
            this.Q(true ^ image.isGif());
            this.r.setText(this.l.getInEffectType().getResId());
            this.t.setText(this.l.getOutEffectType().getResId());
            this.s.setText((CharSequence)String.valueOf((int)(1 + this.l.getEffectSpeed().ordinal())));
            this.u.setText((CharSequence)String.valueOf((int)(1 + this.l.getOutEffectSpeed().ordinal())));
            this.v.setCurrentValue(image.getWebHoldTime());
            this.y.b(this.l.getOutEffectType());
            this.z.b(this.l.getInEffectType());
        }
    }

    public /* varargs */ void C(int n, Object ... arrobject) {
        if (arrobject != null) {
            if (arrobject.length == 0) {
                return;
            }
            int n2 = (Integer)arrobject[0];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            return;
                        }
                        this.l.setOutEffectSpeed(this.A.a(n2));
                        return;
                    }
                    this.l.setOutEffectType(this.y.a(n2));
                    return;
                }
                this.l.setCloudEffectSpeed(this.A.a(n2));
                return;
            }
            this.l.setInEffectType(this.z.a(n2));
        }
    }

    protected View K(int n) {
        return this.m;
    }

    protected int L() {
        return 1;
    }

    protected CharSequence M(int n, Resources resources) {
        return resources.getString(R$string.effects);
    }

    public void onClick(View view) {
        int n = view.getId();
        if (n == R$id.item_show_effect) {
            this.z.b(this.l.getInEffectType());
            this.H((com.coship.fullcolorprogram.view.a)this.O(R$string.show, 1, this.z, this.l.getInEffectType().ordinal()));
            return;
        }
        if (n == R$id.item_clear_effect) {
            this.y.b(this.l.getOutEffectType());
            this.H((com.coship.fullcolorprogram.view.a)this.O(R$string.clear_screen, 3, this.y, this.l.getOutEffectType().ordinal()));
            return;
        }
        if (n == R$id.item_show_speed) {
            this.A.c(this.l.getEffectSpeed());
            this.H((com.coship.fullcolorprogram.view.a)this.O(R$string.speed_setting, 2, this.A, this.l.getEffectSpeed().ordinal()));
            return;
        }
        if (n == R$id.item_clear_speed) {
            this.A.c(this.l.getOutEffectSpeed());
            this.H((com.coship.fullcolorprogram.view.a)this.O(R$string.speed_setting, 4, this.A, this.l.getOutEffectSpeed().ordinal()));
            return;
        }
        if (n == R$id.item_hold_time) {
            h h2 = this.x;
            Object[] arrobject = new Object[]{this.l};
            h2.E(arrobject);
            this.H((com.coship.fullcolorprogram.view.a)this.x);
        }
    }

    public View z(Context context, ViewGroup viewGroup) {
        AddAndSubtractInputView addAndSubtractInputView;
        h h2;
        View view;
        this.k = (Activity)context;
        this.m = view = LayoutInflater.from((Context)context).inflate(R$layout.view_cloud_image_effect_setting, null);
        this.n = (LinearLayout)view.findViewById(R$id.item_show_effect);
        this.o = (LinearLayout)this.m.findViewById(R$id.item_show_speed);
        this.p = (LinearLayout)this.m.findViewById(R$id.item_clear_effect);
        this.q = (LinearLayout)this.m.findViewById(R$id.item_clear_speed);
        this.n.setOnClickListener((View.OnClickListener)this);
        this.o.setOnClickListener((View.OnClickListener)this);
        this.p.setOnClickListener((View.OnClickListener)this);
        this.q.setOnClickListener((View.OnClickListener)this);
        this.r = (TextView)this.m.findViewById(R$id.txt_show_effect);
        this.s = (TextView)this.m.findViewById(R$id.txt_show_speed);
        this.t = (TextView)this.m.findViewById(R$id.txt_clear_effect);
        this.u = (TextView)this.m.findViewById(R$id.txt_clear_speed);
        this.v = addAndSubtractInputView = (AddAndSubtractInputView)this.m.findViewById(R$id.hold_time_input);
        addAndSubtractInputView.setMinimumValue(0);
        this.v.setMaxValue(999);
        this.v.setSteppingValue(1);
        this.v.setOnDecimalNumChangeListener((AddAndSubtractInputView.b)new a(this));
        this.x = h2 = new h();
        h2.X(this.k.getResources().getString(R$string.stop_setting));
        this.x.F(5);
        this.w = new i();
        this.y = new d(context, CleanEffectType.values());
        this.z = new g(context, ShowEffectsType.values());
        this.A = new m4.h(context);
        return super.z(context, viewGroup);
    }
}


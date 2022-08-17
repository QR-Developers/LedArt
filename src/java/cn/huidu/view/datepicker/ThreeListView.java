/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AbsListView
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.TextView
 *  cn.huidu.view.R
 *  cn.huidu.view.R$id
 *  cn.huidu.view.R$layout
 *  cn.huidu.view.datepicker.CustomListView
 *  cn.huidu.view.datepicker.CustomListView$a
 *  cn.huidu.view.datepicker.ThreeListView$a
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.String
 *  z2.c
 */
package cn.huidu.view.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import cn.huidu.view.R;
import cn.huidu.view.datepicker.CustomListView;
import cn.huidu.view.datepicker.ThreeListView;
import z2.c;

public class ThreeListView
extends FrameLayout
implements CustomListView.a {
    protected CustomListView a;
    protected CustomListView b;
    protected CustomListView c;
    protected TextView d;
    protected TextView e;
    protected c f;
    protected c g;
    protected c h;
    private a i;

    public ThreeListView(Context context) {
        super(context);
        this.c();
    }

    public ThreeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c();
    }

    public ThreeListView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.c();
    }

    private void b() {
        this.f = new c(this.getContext());
        this.g = new c(this.getContext());
        this.h = new c(this.getContext());
        double d2 = 50.0f * this.getContext().getResources().getDisplayMetrics().density;
        Double.isNaN((double)d2);
        int n2 = (int)(d2 + 0.5);
        this.f.c(n2);
        this.g.c(n2);
        this.h.c(n2);
    }

    private void c() {
        FrameLayout.inflate((Context)this.getContext(), (int)R.layout.date_picker_view, (ViewGroup)this);
        this.d = (TextView)this.findViewById(R.id.txt_split_01);
        this.e = (TextView)this.findViewById(R.id.txt_split_02);
        this.a = (CustomListView)this.findViewById(R.id.list_view_01);
        this.b = (CustomListView)this.findViewById(R.id.list_view_02);
        this.c = (CustomListView)this.findViewById(R.id.list_view_03);
        this.a.setOnScrollEndListener((CustomListView.a)this);
        this.b.setOnScrollEndListener((CustomListView.a)this);
        this.c.setOnScrollEndListener((CustomListView.a)this);
        this.b();
        this.d();
        this.a.setAdapter((ListAdapter)this.f);
        this.b.setAdapter((ListAdapter)this.g);
        this.c.setAdapter((ListAdapter)this.h);
    }

    public void a(AbsListView absListView, int n2) {
        if (absListView == this.a) {
            this.e(n2);
            return;
        }
        if (absListView == this.b) {
            this.f(n2);
            return;
        }
        if (absListView == this.c) {
            this.g(n2);
        }
    }

    protected void d() {
    }

    protected void e(int n2) {
        a a2 = this.i;
        if (a2 != null) {
            a2.h();
        }
    }

    protected void f(int n2) {
        a a2 = this.i;
        if (a2 != null) {
            a2.h();
        }
    }

    protected void g(int n2) {
        a a2 = this.i;
        if (a2 != null) {
            a2.h();
        }
    }

    public void setOnDataChangeListener(a a2) {
        this.i = a2;
    }

    public void setSplitText(String string2) {
        this.d.setText((CharSequence)string2);
        this.e.setText((CharSequence)string2);
    }
}


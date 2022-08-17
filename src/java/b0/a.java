/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.BaseAdapter
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  cn.huidu.view.ColorRoundRect
 *  com.coship.fullcolorprogram.R
 *  com.coship.fullcolorprogram.R$drawable
 *  com.coship.fullcolorprogram.R$id
 *  com.coship.fullcolorprogram.R$layout
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  o4.r
 */
package b0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import cn.huidu.view.ColorRoundRect;
import com.coship.fullcolorprogram.R;
import java.util.List;
import java.util.Map;
import o4.r;

public class a
extends BaseAdapter {
    private Context a;
    private List<Map<String, Object>> b;
    private int c;
    private int d;

    public a(Context context) {
        this.a = context;
        int n2 = r.h((Context)context);
        int n3 = 6 * r.d((Context)context, (float)20.0f);
        this.d = (n2 / 2 - n3) / 5;
    }

    public Map<String, Object> a(int n2) {
        List<Map<String, Object>> list = this.b;
        if (list == null) {
            return null;
        }
        return (Map)list.get(n2);
    }

    public void b(List<Map<String, Object>> list) {
        this.b = list;
    }

    public void c(int n2) {
        this.c = n2;
    }

    public int getCount() {
        List<Map<String, Object>> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        ColorRoundRect colorRoundRect;
        if (view == null) {
            view = LayoutInflater.from((Context)this.a).inflate(R.layout.item_color, null);
            colorRoundRect = (ColorRoundRect)view.findViewById(R.id.colorRoundRect);
            int n3 = this.d;
            colorRoundRect.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(n3, n3));
            view.setTag((Object)colorRoundRect);
        } else {
            colorRoundRect = (ColorRoundRect)view.getTag();
        }
        int n4 = (Integer)this.a(n2).get((Object)"color");
        if (this.c == n4) {
            view.setBackgroundResource(R.drawable.color_selector_background);
        } else {
            view.setBackgroundColor(0);
        }
        int n5 = this.d;
        colorRoundRect.a(n4, n5, n5);
        if (n4 == 0) {
            colorRoundRect.setBackgroundResource(R.drawable.transparent);
        }
        return view;
    }
}


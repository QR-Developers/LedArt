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
package m4;

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

public class e
extends BaseAdapter {
    private Context a;
    private List<Map<String, Object>> b;
    private int c;
    private int d;

    public e(Context context) {
        this.a = context;
        int n5 = r.h((Context)context);
        int n6 = 6 * r.d((Context)context, (float)20.0f);
        this.d = (n5 / 2 - n6) / 5;
    }

    public Map<String, Object> a(int n5) {
        List<Map<String, Object>> list = this.b;
        if (list == null) {
            return null;
        }
        return (Map)list.get(n5);
    }

    public void b(List<Map<String, Object>> list) {
        this.b = list;
    }

    public void c(int n5) {
        this.c = n5;
    }

    public int getCount() {
        List<Map<String, Object>> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long getItemId(int n5) {
        return n5;
    }

    public View getView(int n5, View view, ViewGroup viewGroup) {
        ColorRoundRect colorRoundRect;
        if (view == null) {
            view = LayoutInflater.from((Context)this.a).inflate(R.layout.item_color, null);
            colorRoundRect = (ColorRoundRect)view.findViewById(R.id.colorRoundRect);
            int n6 = this.d;
            colorRoundRect.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(n6, n6));
            view.setTag((Object)colorRoundRect);
        } else {
            colorRoundRect = (ColorRoundRect)view.getTag();
        }
        int n7 = (Integer)this.a(n5).get((Object)"color");
        if (this.c == n7) {
            view.setBackgroundResource(R.drawable.color_selector_background);
        } else {
            view.setBackgroundColor(0);
        }
        int n8 = this.d;
        colorRoundRect.a(n7, n8, n8);
        if (n7 == 0) {
            colorRoundRect.setBackgroundResource(R.drawable.transparent);
        }
        return view;
    }
}


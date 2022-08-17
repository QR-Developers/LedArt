/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.TextView
 *  com.coship.fullcolorprogram.R
 *  com.coship.fullcolorprogram.R$color
 *  com.coship.fullcolorprogram.R$drawable
 *  com.coship.fullcolorprogram.R$id
 *  com.coship.fullcolorprogram.R$layout
 *  com.coship.fullcolorprogram.enums.BorderEffect
 *  com.coship.fullcolorprogram.view.widget.BorderLayout
 *  java.lang.Object
 */
package m4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.coship.fullcolorprogram.R;
import com.coship.fullcolorprogram.enums.BorderEffect;
import com.coship.fullcolorprogram.view.widget.BorderLayout;

public class c
extends BaseAdapter {
    private Context a;
    private BorderEffect[] b;
    private BorderLayout c;

    public c(Context context, BorderLayout borderLayout) {
        this.a = context;
        this.c = borderLayout;
        this.b = BorderEffect.values();
    }

    public BorderEffect a(int n5) {
        BorderEffect[] arrborderEffect = this.b;
        if (arrborderEffect == null) {
            return null;
        }
        return arrborderEffect[n5];
    }

    public int getCount() {
        BorderEffect[] arrborderEffect = this.b;
        if (arrborderEffect == null) {
            return 0;
        }
        return arrborderEffect.length;
    }

    public long getItemId(int n5) {
        return n5;
    }

    public View getView(int n5, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            view = LayoutInflater.from((Context)this.a).inflate(R.layout.item_simple, null);
            textView = (TextView)view.findViewById(R.id.textView);
            view.setTag((Object)textView);
        } else {
            textView = (TextView)view.getTag();
        }
        BorderEffect borderEffect = this.a(n5);
        if (borderEffect != null) {
            textView.setText(borderEffect.getResId());
        }
        if (this.c.getBorderEffect() == borderEffect) {
            view.setBackgroundResource(R.color.listview_focused);
            return view;
        }
        view.setBackgroundResource(R.drawable.listview_selector);
        return view;
    }
}


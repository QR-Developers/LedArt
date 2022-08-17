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
 *  com.coship.fullcolorprogram.enums.EffectSpeed
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package m4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.coship.fullcolorprogram.R;
import com.coship.fullcolorprogram.enums.EffectSpeed;

public class h
extends BaseAdapter {
    EffectSpeed[] a = EffectSpeed.values();
    Context b;
    private EffectSpeed c;

    public h(Context context) {
        this.b = context;
    }

    public EffectSpeed a(int n5) {
        EffectSpeed[] arreffectSpeed = this.a;
        if (arreffectSpeed == null) {
            return null;
        }
        return arreffectSpeed[n5];
    }

    public EffectSpeed b() {
        return this.c;
    }

    public void c(EffectSpeed effectSpeed) {
        this.c = effectSpeed;
    }

    public int getCount() {
        EffectSpeed[] arreffectSpeed = this.a;
        if (arreffectSpeed == null) {
            return 0;
        }
        return arreffectSpeed.length;
    }

    public long getItemId(int n5) {
        return n5;
    }

    public View getView(int n5, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            view = LayoutInflater.from((Context)this.b).inflate(R.layout.item_simple, null);
            textView = (TextView)view.findViewById(R.id.textView);
            view.setTag((Object)textView);
        } else {
            textView = (TextView)view.getTag();
        }
        EffectSpeed effectSpeed = this.a(n5);
        textView.setText((CharSequence)String.valueOf((int)(1 + effectSpeed.ordinal())));
        if (effectSpeed == this.c) {
            view.setBackgroundResource(R.color.listview_focused);
            return view;
        }
        view.setBackgroundResource(R.drawable.listview_selector);
        return view;
    }
}


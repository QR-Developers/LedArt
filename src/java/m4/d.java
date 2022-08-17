/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.coship.fullcolorprogram.R
 *  com.coship.fullcolorprogram.R$color
 *  com.coship.fullcolorprogram.R$drawable
 *  com.coship.fullcolorprogram.R$id
 *  com.coship.fullcolorprogram.R$layout
 *  com.coship.fullcolorprogram.enums.CleanEffectType
 *  java.lang.Object
 */
package m4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.coship.fullcolorprogram.R;
import com.coship.fullcolorprogram.enums.CleanEffectType;

public class d
extends BaseAdapter {
    CleanEffectType[] a;
    private CleanEffectType b;
    private Context c;

    public d(Context context, CleanEffectType[] arrcleanEffectType) {
        this.a = arrcleanEffectType;
        this.c = context;
    }

    public CleanEffectType a(int n5) {
        CleanEffectType[] arrcleanEffectType = this.a;
        if (arrcleanEffectType == null) {
            return null;
        }
        return arrcleanEffectType[n5];
    }

    public void b(CleanEffectType cleanEffectType) {
        this.b = cleanEffectType;
    }

    public int getCount() {
        CleanEffectType[] arrcleanEffectType = this.a;
        if (arrcleanEffectType == null) {
            return 0;
        }
        return arrcleanEffectType.length;
    }

    public long getItemId(int n5) {
        return n5;
    }

    public View getView(int n5, View view, ViewGroup viewGroup) {
        a a3;
        if (view == null) {
            view = LayoutInflater.from((Context)this.c).inflate(R.layout.item_effect, null);
            a3 = new a(this);
            a3.a = (TextView)view.findViewById(R.id.textView);
            a3.b = (ImageView)view.findViewById(R.id.imageView);
            view.setTag((Object)a3);
        } else {
            a3 = (a)view.getTag();
        }
        CleanEffectType cleanEffectType = this.a(n5);
        a3.a.setText(cleanEffectType.getResId());
        if (this.b == cleanEffectType) {
            view.setBackgroundResource(R.color.listview_focused);
        } else {
            view.setBackgroundResource(R.drawable.listview_selector);
        }
        if (n5 == 0) {
            a3.b.setVisibility(0);
            return view;
        }
        a3.b.setVisibility(8);
        return view;
    }

    class a {
        TextView a;
        ImageView b;

        a(d d4) {
        }
    }

}


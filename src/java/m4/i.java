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
 *  com.coship.fullcolorprogram.enums.TextEffectType
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
import com.coship.fullcolorprogram.enums.TextEffectType;

public class i
extends BaseAdapter {
    TextEffectType[] a;
    private TextEffectType b;
    private Context c;

    public i(Context context, TextEffectType[] arrtextEffectType) {
        this.a = arrtextEffectType;
        this.c = context;
    }

    public TextEffectType a(int n5) {
        TextEffectType[] arrtextEffectType = this.a;
        if (arrtextEffectType == null) {
            return null;
        }
        return arrtextEffectType[n5];
    }

    public void b(TextEffectType textEffectType) {
        this.b = textEffectType;
    }

    public int getCount() {
        TextEffectType[] arrtextEffectType = this.a;
        if (arrtextEffectType == null) {
            return 0;
        }
        return arrtextEffectType.length;
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
        TextEffectType textEffectType = this.a(n5);
        a3.a.setText(textEffectType.getResId());
        if (this.b == textEffectType) {
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

        a(i i5) {
        }
    }

}


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
 *  com.coship.fullcolorprogram.enums.ShowEffectsType
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
import com.coship.fullcolorprogram.enums.ShowEffectsType;

public class g
extends BaseAdapter {
    ShowEffectsType[] a;
    private ShowEffectsType b;
    private Context c;

    public g(Context context, ShowEffectsType[] arrshowEffectsType) {
        this.a = arrshowEffectsType;
        this.c = context;
    }

    public ShowEffectsType a(int n5) {
        ShowEffectsType[] arrshowEffectsType = this.a;
        if (arrshowEffectsType == null) {
            return null;
        }
        return arrshowEffectsType[n5];
    }

    public void b(ShowEffectsType showEffectsType) {
        this.b = showEffectsType;
    }

    public int getCount() {
        ShowEffectsType[] arrshowEffectsType = this.a;
        if (arrshowEffectsType == null) {
            return 0;
        }
        return arrshowEffectsType.length;
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
        ShowEffectsType showEffectsType = this.a(n5);
        a3.a.setText(showEffectsType.getResId());
        if (this.b == showEffectsType) {
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

        a(g g4) {
        }
    }

}


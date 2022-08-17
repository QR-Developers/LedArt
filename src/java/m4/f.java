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
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package m4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.coship.fullcolorprogram.R;
import java.util.List;

public class f
extends BaseAdapter {
    private Context a;
    private List<String> b;
    private int c;

    public f(Context context) {
        this.a = context;
    }

    public String a(int n5) {
        List<String> list = this.b;
        if (list == null) {
            return null;
        }
        return (String)list.get(n5);
    }

    public void b(int n5) {
        this.c = n5;
    }

    public void c(List<String> list) {
        this.b = list;
    }

    public int getCount() {
        List<String> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
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
        if (this.c == n5) {
            view.setBackgroundResource(R.color.listview_focused);
        } else {
            view.setBackgroundResource(R.drawable.listview_selector);
        }
        String string = this.a(n5);
        if (string != null) {
            textView.setText((CharSequence)string);
        }
        return view;
    }
}


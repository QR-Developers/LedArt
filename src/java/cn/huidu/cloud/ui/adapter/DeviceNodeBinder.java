/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  cn.huidu.cloud.ui.adapter.recycletreeview.TreeViewBinder
 *  cn.huidu.cloud.ui.adapter.recycletreeview.TreeViewBinder$ViewHolder
 *  d.i
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.List
 *  l0.b
 *  o8.c
 *  u.c
 */
package cn.huidu.cloud.ui.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cn.huidu.cloud.R$drawable;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.ui.adapter.recycletreeview.TreeViewBinder;
import cn.huidu.cloud.ui.adapter.recycletreeview.a;
import d.i;
import java.util.Iterator;
import java.util.List;
import l0.b;
import u.c;

public class DeviceNodeBinder
extends TreeViewBinder<ViewHolder> {
    public int a() {
        return R$layout.item_cloud_device_list_tree;
    }

    public void d(ViewHolder viewHolder, int n2, a a2) {
        viewHolder.d(a2);
    }

    public ViewHolder e(View view) {
        return new ViewHolder(this, view);
    }

    public class ViewHolder
    extends TreeViewBinder.ViewHolder {
        ImageView a;
        TextView b;
        TextView c;
        TextView d;
        View e;
        a f;

        public ViewHolder(DeviceNodeBinder deviceNodeBinder, View view) {
            ImageView imageView;
            super(view);
            this.a = imageView = (ImageView)view.findViewById(R$id.img_check_state);
            imageView.setOnClickListener((View.OnClickListener)new c(this));
            this.b = (TextView)view.findViewById(R$id.device_name_txt);
            this.c = (TextView)view.findViewById(R$id.device_size_txt);
            this.d = (TextView)view.findViewById(R$id.device_id_txt);
            this.e = view.findViewById(R$id.device_state_view);
        }

        public static /* synthetic */ void b(ViewHolder viewHolder, View view) {
            viewHolder.f(view);
        }

        private void d(a a2) {
            this.f = a2;
            i i2 = (i)a2.f();
            if (a2.j()) {
                this.a.setImageResource(R$drawable.checkbox_checked);
            } else {
                this.a.setImageResource(R$drawable.checkbox_unchecked);
            }
            this.b.setText((CharSequence)i2.e());
            this.d.setText((CharSequence)i2.f());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i2.h());
            stringBuilder.append("x");
            stringBuilder.append(i2.d());
            String string2 = stringBuilder.toString();
            this.c.setText((CharSequence)string2);
            View view = this.e;
            int n2 = i2.j() ? R$drawable.cloud_bg_rectangle_5_corner_00cc00 : R$drawable.cloud_bg_rectangle_5_corner_d7d7d7;
            view.setBackgroundResource(n2);
        }

        private void e(a a2, int n2) {
            a a3 = a2.h();
            if (a3 != null) {
                Iterator iterator = a3.e().iterator();
                int n3 = 0;
                while (iterator.hasNext()) {
                    boolean bl;
                    boolean bl2;
                    a a4 = (a)iterator.next();
                    boolean bl3 = a4.f() instanceof i;
                    int n4 = 1;
                    if (!(bl3 ? (bl2 = a4.j()) == (bl = n2 == n4) : a4.i() == n2)) {
                        n4 = 0;
                    }
                    if ((n3 = n4) != 0) continue;
                }
                if (n3 != 0) {
                    a3.p(n2);
                } else {
                    a3.p(0);
                }
                this.e(a3, n2);
            }
        }

        private /* synthetic */ void f(View view) {
            a a2 = this.f;
            boolean bl = a2.j();
            int n2 = 1;
            a2.o(bl ^ n2);
            a a3 = this.f;
            if (!a3.j()) {
                n2 = -1;
            }
            this.e(a3, n2);
            o8.c.c().l((Object)new b());
        }
    }

}


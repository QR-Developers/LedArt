/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  cn.huidu.cloud.ui.adapter.recycletreeview.TreeViewBinder
 *  cn.huidu.cloud.ui.adapter.recycletreeview.TreeViewBinder$ViewHolder
 *  d.g
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.cloud.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cn.huidu.cloud.R$drawable;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.R$string;
import cn.huidu.cloud.ui.adapter.recycletreeview.TreeViewBinder;
import cn.huidu.cloud.ui.adapter.recycletreeview.a;
import d.g;

public class DeviceSetGroupBinder
extends TreeViewBinder<ViewHolder> {
    private Context a;

    public int a() {
        return R$layout.item_cloud_device_group_manage;
    }

    public void e(ViewHolder viewHolder, int n2, a a2) {
        viewHolder.c(a2);
    }

    public ViewHolder f(View view) {
        this.a = view.getContext();
        return new ViewHolder(view);
    }

    public class ViewHolder
    extends TreeViewBinder.ViewHolder {
        ImageView a;
        TextView b;
        TextView c;
        ImageView d;
        a e;

        public ViewHolder(View view) {
            ImageView imageView;
            super(view);
            this.d = imageView = (ImageView)view.findViewById(R$id.img_setting);
            imageView.setVisibility(8);
            this.b = (TextView)view.findViewById(R$id.group_name_txt);
            this.c = (TextView)view.findViewById(R$id.manager_txt);
            this.a = (ImageView)view.findViewById(R$id.img_expand_state);
        }

        private void c(a a2) {
            this.e = a2;
            if (a2.j()) {
                ((RecyclerView.ViewHolder)this).itemView.setBackgroundResource(R$drawable.cloud_bg_rectangle_only_bottom_3399ff_stroke_e4);
            } else {
                ((RecyclerView.ViewHolder)this).itemView.setBackgroundResource(R$drawable.cloud_bg_rectangle_only_bottom_ff_stroke_e4);
            }
            g g2 = (g)a2.f();
            this.b.setText((CharSequence)g2.b());
            if (g2.c() == 0) {
                this.b.setText((CharSequence)DeviceSetGroupBinder.this.a.getString(R$string.ungrouped));
            }
            if (g2.d() != null) {
                this.c.setVisibility(0);
                this.c.setText((CharSequence)g2.d());
            } else {
                this.c.setVisibility(8);
            }
            this.a.setVisibility(8);
            if (a2.k()) {
                this.a.setRotation(180.0f);
                return;
            }
            this.a.setRotation(90.0f);
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewPropertyAnimator
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
 *  java.util.List
 *  l0.a
 *  o8.c
 *  u.a
 */
package cn.huidu.cloud.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.R$string;
import cn.huidu.cloud.ui.adapter.recycletreeview.TreeViewBinder;
import cn.huidu.cloud.ui.adapter.recycletreeview.a;
import d.g;
import java.util.List;
import o8.c;

public class DeviceGroupManageBinder
extends TreeViewBinder<ViewHolder> {
    private Context a;

    public int a() {
        return R$layout.item_cloud_device_group_manage;
    }

    public void e(ViewHolder viewHolder, int n2, a a2) {
        viewHolder.d(a2);
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
            imageView.setVisibility(0);
            this.d.setOnClickListener((View.OnClickListener)new u.a(this));
            this.b = (TextView)view.findViewById(R$id.group_name_txt);
            this.c = (TextView)view.findViewById(R$id.manager_txt);
            this.a = (ImageView)view.findViewById(R$id.img_expand_state);
        }

        public static /* synthetic */ void b(ViewHolder viewHolder, View view) {
            viewHolder.e(view);
        }

        private void d(a a2) {
            this.e = a2;
            g g2 = (g)a2.f();
            this.b.setText((CharSequence)g2.b());
            if (g2.c() == 0) {
                this.b.setText((CharSequence)DeviceGroupManageBinder.this.a.getString(R$string.ungrouped));
            }
            if (g2.d() != null) {
                this.c.setVisibility(0);
                this.c.setText((CharSequence)g2.d());
            } else {
                this.c.setVisibility(8);
            }
            if (a2.e().size() == 0) {
                this.a.setVisibility(4);
            } else {
                this.a.setVisibility(0);
            }
            if (a2.k()) {
                this.a.setRotation(180.0f);
                return;
            }
            this.a.setRotation(90.0f);
        }

        private /* synthetic */ void e(View view) {
            c.c().l((Object)new l0.a(view, this.e));
        }

        public void f(boolean bl) {
            int n2 = bl ? 90 : -90;
            this.a.animate().rotationBy((float)n2).start();
        }
    }

}


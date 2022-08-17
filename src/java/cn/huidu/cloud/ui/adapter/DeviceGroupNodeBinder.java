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
 *  d.h
 *  d.i
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 *  l0.b
 *  o8.c
 *  u.b
 */
package cn.huidu.cloud.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cn.huidu.cloud.R$drawable;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.R$string;
import cn.huidu.cloud.ui.adapter.recycletreeview.TreeViewBinder;
import cn.huidu.cloud.ui.adapter.recycletreeview.a;
import d.h;
import d.i;
import java.util.Iterator;
import java.util.List;
import o8.c;
import u.b;

public class DeviceGroupNodeBinder
extends TreeViewBinder<ViewHolder> {
    private Context a;

    public int a() {
        return R$layout.item_cloud_device_group_tree;
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
            this.a = imageView = (ImageView)view.findViewById(R$id.img_check_state);
            imageView.setOnClickListener((View.OnClickListener)new b(this));
            this.b = (TextView)view.findViewById(R$id.group_name_txt);
            this.c = (TextView)view.findViewById(R$id.tv_device_count);
            this.d = (ImageView)view.findViewById(R$id.img_down_arrow);
        }

        public static /* synthetic */ void b(ViewHolder viewHolder, View view) {
            viewHolder.g(view);
        }

        private void d(a a2) {
            this.e = a2;
            h h2 = (h)a2.f();
            int n2 = a2.i();
            if (n2 == -1) {
                this.a.setImageResource(R$drawable.checkbox_unchecked);
            } else if (n2 == 0) {
                this.a.setImageResource(R$drawable.checkbox_half_checked);
            } else if (n2 == 1) {
                this.a.setImageResource(R$drawable.checkbox_checked);
            }
            this.b.setText((CharSequence)h2.b());
            if (h2.c() == 0) {
                this.b.setText((CharSequence)DeviceGroupNodeBinder.this.a.getString(R$string.ungrouped));
            }
            this.c.setText((CharSequence)String.valueOf((int)h2.d()));
            if (a2.k()) {
                this.d.setRotation(180.0f);
                return;
            }
            this.d.setRotation(0.0f);
        }

        private void e(a a2, boolean bl) {
            List<a> list = a2.e();
            int n2 = bl ? 1 : -1;
            a2.p(n2);
            if (list != null) {
                if (list.isEmpty()) {
                    return;
                }
                for (a a3 : list) {
                    if (a3.f() instanceof i) {
                        a3.o(bl);
                        continue;
                    }
                    this.e(a3, bl);
                }
            }
        }

        private void f(a a2, int n2) {
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
                this.f(a3, n2);
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        private /* synthetic */ void g(View view) {
            int n2 = this.e.i();
            int n3 = -1;
            int n4 = 1;
            if (n2 == n3 || n2 == 0) {
                n3 = 1;
            }
            a a2 = this.e;
            if (n3 != n4) {
                n4 = 0;
            }
            this.e(a2, (boolean)n4);
            this.f(this.e, n3);
            c.c().l((Object)new l0.b());
        }

        public void h(boolean bl) {
            int n2 = bl ? 180 : -180;
            this.d.animate().rotationBy((float)n2).start();
        }
    }

}


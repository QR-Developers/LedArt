/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.Toast
 *  androidx.viewpager.widget.PagerAdapter
 *  androidx.viewpager.widget.ViewPager
 *  cn.huidu.view.photoview.PhotoView
 *  com.bumptech.glide.b
 *  com.bumptech.glide.h
 *  com.coship.fullcolorprogram.R
 *  com.coship.fullcolorprogram.R$drawable
 *  com.coship.fullcolorprogram.R$id
 *  com.coship.fullcolorprogram.R$layout
 *  d4.a
 *  e4.j
 *  i.b
 *  j4.a
 *  j4.d
 *  j4.e
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  l.f
 *  p.m0
 */
package b0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import b0.c;
import b0.d;
import cn.huidu.view.SViewPager;
import cn.huidu.view.photoview.PhotoView;
import com.bumptech.glide.h;
import com.coship.fullcolorprogram.R;
import e4.j;
import java.util.List;
import l.e;
import l.f;
import p.m0;

public class c
extends j4.a {
    private ViewPager d;
    private b e;
    private List<j4.e> f;
    private c g;

    public c(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
        this.l(viewGroup);
    }

    public void a(List<j4.e> list, int n2) {
        this.f = list;
        this.e.notifyDataSetChanged();
        this.d.setCurrentItem(n2);
        if (this.d.getParent() == null) {
            this.b.addView((View)this.d);
        }
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
        this.b.removeView((View)this.d);
    }

    public void l(ViewGroup viewGroup) {
        b b2;
        SViewPager sViewPager = new SViewPager(viewGroup.getContext());
        this.d = sViewPager;
        sViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.e = b2 = new b();
        this.d.setAdapter((PagerAdapter)b2);
        this.d.setOffscreenPageLimit(1);
    }

    private class b
    extends PagerAdapter {
        private b() {
        }

        public void destroyItem(ViewGroup viewGroup, int n2, Object object) {
            viewGroup.removeView((object).a);
        }

        public int getCount() {
            if (c.this.f == null) {
                return 0;
            }
            return c.this.f.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int n2) {
            View view = View.inflate((Context)viewGroup.getContext(), (int)R.layout.item_fc_big_image_page, null);
            View.OnClickListener onClickListener = new View.OnClickListener(view){
                public View a;
                public PhotoView b;
                private ImageView c;
                private ImageView d;
                public ImageView e;
                public ProgressBar f;
                public j4.e g;
                {
                    this.a = view;
                    this.b = (PhotoView)view.findViewById(R.id.image);
                    this.c = (ImageView)this.a.findViewById(R.id.static_cloud);
                    this.d = (ImageView)this.a.findViewById(R.id.upload_cloud);
                    this.e = (ImageView)this.a.findViewById(R.id.selected_mark);
                    this.f = (ProgressBar)this.a.findViewById(R.id.upload_progress);
                    this.e.setOnClickListener((View.OnClickListener)this);
                }

                public static /* synthetic */ void a(c c2, int n2, f f2) {
                    c2.c(n2, f2);
                }

                private /* synthetic */ void c(int n2, f f2) {
                    if (n2 != this.g.c) {
                        return;
                    }
                    if (f2.j()) {
                        List list = (List)f2.c();
                        if (list != null && list.size() > 0) {
                            i.b b2 = (i.b)list.get(0);
                            this.g.b = b2.e();
                        }
                    } else {
                        Toast.makeText((Context)c.this.a, (CharSequence)f2.e(), (int)0).show();
                    }
                    this.d();
                }

                private void d() {
                    j4.e e2 = this.g;
                    String string = e2.b;
                    if (string == null) {
                        string = e2.d;
                    }
                    ((h)com.bumptech.glide.b.u((Context)c.this.a).s(string).Q(R.drawable.empty_photo)).v0((ImageView)this.b);
                }

                public void b(j4.e e2) {
                    this.g = e2;
                    if (e2.b != null) {
                        this.d();
                    } else {
                        int n2 = e2.c;
                        m0.n((int)n2, (e)new d(this, n2));
                    }
                    this.e(this.g.i);
                    this.f();
                }

                public void e(boolean bl) {
                    this.g.i = bl;
                    if (bl) {
                        this.e.setImageResource(R.drawable.checked);
                        return;
                    }
                    this.e.setImageResource(R.drawable.uncheck);
                }

                public void f() {
                    this.c.setVisibility(8);
                    this.d.setVisibility(8);
                    this.f.setVisibility(8);
                }

                public void onClick(View view) {
                    j4.d d2 = c.this.c;
                    j4.e e2 = this.g;
                    this.e(d2.J0(e2, true ^ e2.i));
                }
            };
            onClickListener.b((j4.e)c.this.f.get(n2));
            viewGroup.addView(view, 0);
            return onClickListener;
        }

        public boolean isViewFromObject(View view, Object object) {
            return view.equals((Object)(object).a);
        }

        public void setPrimaryItem(ViewGroup viewGroup, int n2, Object object) {
            super.setPrimaryItem(viewGroup, n2, object);
            if (c.this.g != null) {
                c.g((c)c.this).b.c();
            }
            c.this.g = object;
        }
    }

}


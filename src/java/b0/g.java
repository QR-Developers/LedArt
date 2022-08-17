/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnErrorListener
 *  android.net.Uri
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.Toast
 *  android.widget.VideoView
 *  com.bumptech.glide.b
 *  com.bumptech.glide.h
 *  com.coship.fullcolorprogram.R
 *  com.coship.fullcolorprogram.R$drawable
 *  com.coship.fullcolorprogram.R$id
 *  com.coship.fullcolorprogram.R$layout
 *  com.coship.fullcolorprogram.R$string
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
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.VideoView;
import b0.f;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import com.coship.fullcolorprogram.R;
import d4.a;
import e4.j;
import j4.d;
import java.util.List;
import l.e;
import p.m0;

public class g
extends j4.a
implements View.OnClickListener,
MediaPlayer.OnErrorListener {
    private View d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private ProgressBar h;
    private VideoView i;
    private ImageView j;
    private ImageView k;
    private j4.e l;
    private boolean m;
    private boolean n;

    public g(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
        this.g(viewGroup);
    }

    public static /* synthetic */ void f(g g2, l.f f2) {
        g2.h(f2);
    }

    private /* synthetic */ void h(l.f f2) {
        this.c.c0(false);
        if (f2.j()) {
            List list = (List)f2.c();
            if (list != null && list.size() > 0) {
                i.b b2 = (i.b)list.get(0);
                this.l.b = b2.e();
                this.k(Uri.parse((String)this.l.b));
                return;
            }
        } else {
            Toast.makeText((Context)this.a, (CharSequence)f2.e(), (int)0).show();
        }
    }

    private void i() {
        this.m = true;
        this.j.setVisibility(0);
        this.k.setVisibility(0);
    }

    private void k(Uri uri) {
        this.n = true;
        this.i.setVideoURI(uri);
    }

    private void l() {
        if (!this.n) {
            Log.d((String)"CloudVideoShowControl", (String)"startPlay: video uri not set!");
            return;
        }
        if (this.m) {
            this.i.start();
            this.k.setVisibility(8);
            this.j.setVisibility(8);
            return;
        }
        Context context = this.a;
        Toast.makeText((Context)context, (CharSequence)context.getString(R.string.cannot_play_this_video), (int)0).show();
    }

    private void m() {
        this.i.pause();
        this.k.setVisibility(0);
    }

    public void a(List<j4.e> list, int n2) {
        j4.e e2;
        this.i();
        this.l = e2 = (j4.e)list.get(n2);
        this.j(e2.i);
        this.n();
        if (this.d.getParent() == null) {
            this.b.addView(this.d);
        }
        this.n = false;
        j4.e e3 = this.l;
        String string2 = e3.b;
        if (string2 != null) {
            this.k(Uri.parse((String)string2));
        } else {
            int n3 = e3.c;
            this.c.c0(true);
            m0.n((int)n3, (e)new f(this));
        }
        ((h)b.u((Context)this.a).s(this.l.d).Q(R.drawable.empty_photo)).v0(this.j);
    }

    public void b() {
        this.i.pause();
        this.k.setVisibility(0);
    }

    public void c() {
    }

    public void d() {
        this.i.stopPlayback();
        this.b.removeView(this.d);
        this.l = null;
    }

    public void e(d d2) {
        super.e(d2);
    }

    public void g(ViewGroup viewGroup) {
        View view;
        this.d = view = LayoutInflater.from((Context)this.a).inflate(R.layout.item_fc_video_show_page, viewGroup, false);
        this.i = (VideoView)view.findViewById(R.id.video);
        this.e = (ImageView)this.d.findViewById(R.id.static_cloud);
        this.f = (ImageView)this.d.findViewById(R.id.upload_cloud);
        this.g = (ImageView)this.d.findViewById(R.id.selected_mark);
        this.h = (ProgressBar)this.d.findViewById(R.id.upload_progress);
        this.j = (ImageView)this.d.findViewById(R.id.preview_image);
        this.k = (ImageView)this.d.findViewById(R.id.play_icon);
        this.g.setOnClickListener((View.OnClickListener)this);
        this.d.setOnClickListener((View.OnClickListener)this);
        this.i.setOnErrorListener((MediaPlayer.OnErrorListener)this);
    }

    public void j(boolean bl) {
        this.l.i = bl;
        if (bl) {
            this.g.setImageResource(R.drawable.checked);
            return;
        }
        this.g.setImageResource(R.drawable.uncheck);
    }

    public void n() {
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.h.setVisibility(8);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.selected_mark) {
            d d2 = this.c;
            j4.e e2 = this.l;
            this.j(d2.J0(e2, true ^ e2.i));
            return;
        }
        if (this.i.isPlaying()) {
            this.m();
            return;
        }
        this.l();
    }

    public boolean onError(MediaPlayer mediaPlayer, int n2, int n3) {
        this.m = false;
        return true;
    }
}


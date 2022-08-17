/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.recyclerview.widget.DefaultItemAnimator
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemAnimator
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  cn.huidu.cloud.ui.program.fullcolor.adapter.CloudWeatherCityAdapter
 *  com.coship.fullcolorprogram.setting.b
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  l.f
 *  p.h0
 */
package c0;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c0.e;
import cn.huidu.cloud.R$id;
import cn.huidu.cloud.R$layout;
import cn.huidu.cloud.R$string;
import cn.huidu.cloud.api.entity.program.WeatherCityDTO;
import cn.huidu.cloud.ui.program.fullcolor.adapter.CloudWeatherCityAdapter;
import com.coship.fullcolorprogram.setting.b;
import java.util.List;
import p.h0;

public class f
extends b
implements View.OnClickListener,
TextWatcher,
CloudWeatherCityAdapter.b {
    private EditText q;
    private ProgressBar r;
    private TextView s;
    private RecyclerView t;
    private Context u;
    private CloudWeatherCityAdapter v;
    private int w;

    public static /* synthetic */ void Y(f f2, l.f f3) {
        f2.a0(f3);
    }

    private void Z(String string2) {
        if (this.w == 0) {
            return;
        }
        this.b0(0);
        h0.A((String)string2, (l.e)new e(this));
    }

    private /* synthetic */ void a0(l.f f2) {
        if (f2.j()) {
            List list = (List)f2.c();
            if (list != null && list.size() > 0) {
                this.b0(2);
                this.v.y(list);
                return;
            }
            this.b0(1);
            this.s.setText((CharSequence)this.u.getString(R$string.no_search_city));
            return;
        }
        this.b0(1);
        this.s.setText((CharSequence)f2.e());
    }

    private void b0(int n) {
        this.w = n;
        ProgressBar progressBar = this.r;
        int n2 = n == 0 ? 0 : 4;
        progressBar.setVisibility(n2);
        TextView textView = this.s;
        int n3 = n == 1 ? 0 : 4;
        textView.setVisibility(n3);
        RecyclerView recyclerView = this.t;
        int n4 = n == 2 ? 0 : 4;
        recyclerView.setVisibility(n4);
    }

    public void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty((CharSequence)editable.toString())) {
            return;
        }
        this.Z(editable.toString());
    }

    public void beforeTextChanged(CharSequence charSequence, int n, int n2, int n3) {
    }

    @Override
    public void e(WeatherCityDTO weatherCityDTO) {
        this.G(new Object[]{weatherCityDTO});
        this.v();
    }

    public void onClick(View view) {
        String string2 = this.q.getText().toString();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            Context context = this.u;
            Toast.makeText((Context)context, (CharSequence)context.getString(R$string.key_word_not_empty), (int)1).show();
            return;
        }
        this.Z(string2);
    }

    public void onTextChanged(CharSequence charSequence, int n, int n2, int n3) {
    }

    public View z(Context context, ViewGroup viewGroup) {
        CloudWeatherCityAdapter cloudWeatherCityAdapter;
        EditText editText;
        RecyclerView recyclerView;
        this.u = context;
        this.w = 2;
        View view = LayoutInflater.from((Context)context).inflate(R$layout.view_cloud_weather_city_setting, null);
        this.S(view);
        this.q = editText = (EditText)view.findViewById(R$id.weather_city_txt);
        editText.addTextChangedListener((TextWatcher)this);
        this.r = (ProgressBar)view.findViewById(R$id.progress_view);
        this.s = (TextView)view.findViewById(R$id.msg_txt);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.t = recyclerView = (RecyclerView)view.findViewById(R$id.ryc_list);
        recyclerView.setLayoutManager((RecyclerView.LayoutManager)linearLayoutManager);
        this.t.setItemAnimator((RecyclerView.ItemAnimator)new DefaultItemAnimator());
        this.v = cloudWeatherCityAdapter = new CloudWeatherCityAdapter();
        cloudWeatherCityAdapter.z((CloudWeatherCityAdapter.b)this);
        this.t.setAdapter((RecyclerView.Adapter)this.v);
        view.findViewById(R$id.find_city_view).setOnClickListener((View.OnClickListener)this);
        return super.z(context, viewGroup);
    }
}


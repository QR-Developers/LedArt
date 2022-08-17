/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  cn.huidu.huiduapp.ledart.ui.setting.LanguageSelectActivity
 *  java.lang.Object
 */
package c2;

import android.view.View;
import android.widget.AdapterView;
import cn.huidu.huiduapp.ledart.ui.setting.LanguageSelectActivity;

public final class r0
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ LanguageSelectActivity a;

    public /* synthetic */ r0(LanguageSelectActivity languageSelectActivity) {
        this.a = languageSelectActivity;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n2, long l2) {
        LanguageSelectActivity.T1((LanguageSelectActivity)this.a, (AdapterView)adapterView, (View)view, (int)n2, (long)l2);
    }
}


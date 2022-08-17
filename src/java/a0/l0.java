/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  cn.huidu.cloud.ui.program.fullcolor.CloudFCBaseProgramFragment
 *  com.coship.fullcolorprogram.model.Area
 *  com.coship.fullcolorprogram.model.Node
 *  com.coship.fullcolorprogram.view.StackPageView
 *  com.coship.fullcolorprogram.view.screen.ScreenView
 *  com.coship.fullcolorprogram.view.widget.AreaView
 *  com.coship.fullcolorprogram.view.widget.NodeView
 *  java.lang.Object
 */
package a0;

import android.os.Bundle;
import android.view.View;
import cn.huidu.cloud.ui.program.fullcolor.CloudFCBaseProgramFragment;
import com.coship.fullcolorprogram.model.Area;
import com.coship.fullcolorprogram.model.Node;
import com.coship.fullcolorprogram.view.StackPageView;
import com.coship.fullcolorprogram.view.screen.ScreenView;
import com.coship.fullcolorprogram.view.widget.AreaView;
import com.coship.fullcolorprogram.view.widget.NodeView;

public interface l0 {
    public void A(Area var1);

    public boolean A0(boolean var1);

    public boolean C0(boolean var1);

    public ScreenView G1();

    public void M();

    public boolean M1(boolean var1);

    public void Q(CloudFCBaseProgramFragment var1, boolean var2);

    public boolean R0();

    public void fuzzyView(View var1);

    public StackPageView k();

    public AreaView m();

    public void o(NodeView var1);

    public boolean q1(boolean var1);

    public void s(int var1, Bundle var2, boolean var3);

    public /* varargs */ void t(Node ... var1);

    public void v(int var1);
}


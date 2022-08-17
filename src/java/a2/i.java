/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener
 *  cn.huidu.huiduapp.ledart.ui.rubik.program.RubikSendProgramFragment
 *  java.lang.Object
 */
package a2;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cn.huidu.huiduapp.ledart.ui.rubik.program.RubikSendProgramFragment;

public final class i
implements SwipeRefreshLayout.OnRefreshListener {
    public final /* synthetic */ RubikSendProgramFragment a;

    public /* synthetic */ i(RubikSendProgramFragment rubikSendProgramFragment) {
        this.a = rubikSendProgramFragment;
    }

    public final void onRefresh() {
        RubikSendProgramFragment.i1((RubikSendProgramFragment)this.a);
    }
}


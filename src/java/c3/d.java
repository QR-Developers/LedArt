/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  cn.huidu.view.inputview.KeyboardInputDialogFragment
 *  java.lang.Object
 */
package c3;

import android.view.ViewTreeObserver;
import cn.huidu.view.inputview.KeyboardInputDialogFragment;

public final class d
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ KeyboardInputDialogFragment a;

    public /* synthetic */ d(KeyboardInputDialogFragment keyboardInputDialogFragment) {
        this.a = keyboardInputDialogFragment;
    }

    public final void onGlobalLayout() {
        KeyboardInputDialogFragment.h1((KeyboardInputDialogFragment)this.a);
    }
}


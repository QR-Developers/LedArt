/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.ScScreenTestActivity
 *  java.lang.Object
 */
package d2;

import android.os.Handler;
import android.os.Message;
import cn.huidu.huiduapp.ledart.ui.singlecolor.ScScreenTestActivity;

public final class v0
implements Handler.Callback {
    public final /* synthetic */ ScScreenTestActivity a;

    public /* synthetic */ v0(ScScreenTestActivity scScreenTestActivity) {
        this.a = scScreenTestActivity;
    }

    public final boolean handleMessage(Message message) {
        return ScScreenTestActivity.v2((ScScreenTestActivity)this.a, (Message)message);
    }
}


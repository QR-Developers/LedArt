/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  cn.huidu.huiduapp.ledart.ui.singlecolor.RemoteActivity
 *  java.lang.Object
 */
package d2;

import android.os.Handler;
import android.os.Message;
import cn.huidu.huiduapp.ledart.ui.singlecolor.RemoteActivity;

public final class a0
implements Handler.Callback {
    public final /* synthetic */ RemoteActivity a;

    public /* synthetic */ a0(RemoteActivity remoteActivity) {
        this.a = remoteActivity;
    }

    public final boolean handleMessage(Message message) {
        return RemoteActivity.s2((RemoteActivity)this.a, (Message)message);
    }
}


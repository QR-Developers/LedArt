/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  cn.huidu.cloud.ui.resource.CloudResourcePreviewActivity
 *  java.lang.Object
 */
package h0;

import android.media.MediaPlayer;
import cn.huidu.cloud.ui.resource.CloudResourcePreviewActivity;

public final class b
implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ CloudResourcePreviewActivity a;

    public /* synthetic */ b(CloudResourcePreviewActivity cloudResourcePreviewActivity) {
        this.a = cloudResourcePreviewActivity;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        CloudResourcePreviewActivity.W1((CloudResourcePreviewActivity)this.a, (MediaPlayer)mediaPlayer);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnErrorListener
 *  cn.huidu.cloud.ui.resource.CloudResourcePreviewActivity
 *  java.lang.Object
 */
package h0;

import android.media.MediaPlayer;
import cn.huidu.cloud.ui.resource.CloudResourcePreviewActivity;

public final class a
implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ CloudResourcePreviewActivity a;

    public /* synthetic */ a(CloudResourcePreviewActivity cloudResourcePreviewActivity) {
        this.a = cloudResourcePreviewActivity;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int n2, int n3) {
        return CloudResourcePreviewActivity.Y1((CloudResourcePreviewActivity)this.a, (MediaPlayer)mediaPlayer, (int)n2, (int)n3);
    }
}


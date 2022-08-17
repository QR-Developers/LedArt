/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaScannerConnection
 *  android.media.MediaScannerConnection$MediaScannerConnectionClient
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;

public class z
implements MediaScannerConnection.MediaScannerConnectionClient {
    private MediaScannerConnection a;
    private String b;
    private String c;

    public z(Context context, String string2, String string3) {
        this.b = string2;
        this.c = string3;
        this.a = new MediaScannerConnection(context, (MediaScannerConnection.MediaScannerConnectionClient)this);
    }

    public void a() {
        this.a.connect();
    }

    public void onMediaScannerConnected() {
        this.a.scanFile(this.b, this.c);
    }

    public void onScanCompleted(String string2, Uri uri) {
        MediaScannerConnection mediaScannerConnection = this.a;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }
}


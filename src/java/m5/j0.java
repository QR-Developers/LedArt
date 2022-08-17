/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.media.ThumbnailUtils
 *  android.os.Handler
 *  android.os.Message
 *  androidx.collection.LruCache
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  m5.j0$a
 */
package m5;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Message;
import androidx.collection.LruCache;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m5.j0;

public class j0 {
    private LruCache<String, Bitmap> a = new a(this, (int)Runtime.getRuntime().maxMemory() / 8);
    private ExecutorService b = null;

    public j0(Context context) {
    }

    private void c(String string2, Bitmap bitmap) {
        if (this.f(string2) == null && bitmap != null) {
            this.a.put((Object)string2, (Object)bitmap);
        }
    }

    private Bitmap e(String string2) {
        return ThumbnailUtils.createVideoThumbnail((String)string2, (int)3);
    }

    private Bitmap f(String string2) {
        return (Bitmap)this.a.get((Object)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ExecutorService g() {
        if (this.b != null) return this.b;
        Class<ExecutorService> class_ = ExecutorService.class;
        synchronized (ExecutorService.class) {
            if (this.b != null) return this.b;
            this.b = Executors.newFixedThreadPool((int)5);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        j0 j02 = this;
        synchronized (j02) {
            ExecutorService executorService = this.b;
            if (executorService != null) {
                executorService.shutdownNow();
                this.b = null;
            }
            return;
        }
    }

    public Bitmap h(final String string2, final d d4) {
        final String string3 = string2.replaceAll("[^\\w]", "");
        Bitmap bitmap = this.f(string3);
        if (bitmap != null) {
            return bitmap;
        }
        final Handler handler = new Handler(this){

            public void handleMessage(Message message) {
                super.handleMessage(message);
                d4.a((Bitmap)message.obj, string2);
            }
        };
        this.g().execute(new Runnable(){

            public void run() {
                Bitmap bitmap = j0.this.e(string2);
                Message message = handler.obtainMessage();
                message.obj = bitmap;
                handler.sendMessage(message);
                j0.this.c(string3, bitmap);
            }
        });
        return null;
    }

    public static interface d {
        public void a(Bitmap var1, String var2);
    }

}


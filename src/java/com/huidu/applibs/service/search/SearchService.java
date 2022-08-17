/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.os.IBinder
 *  android.os.SystemClock
 *  android.util.Log
 *  com.huidu.applibs.service.search.SearchService$b
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.nio.channels.SelectableChannel
 *  java.nio.channels.SelectionKey
 *  java.nio.channels.Selector
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  v5.b
 *  w5.a
 *  w5.b
 *  w5.c
 */
package com.huidu.applibs.service.search;

import android.app.Service;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import com.huidu.applibs.service.search.SearchService;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import w5.c;

/*
 * Exception performing whole class analysis.
 */
public class SearchService
extends Service {
    private Thread a;
    private a b;
    private boolean c;

    private boolean a() {
        try {
            this.b = new a();
            ConnectivityManager connectivityManager = (ConnectivityManager)this.getSystemService("connectivity");
            this.b.c((a.a)new /* Unavailable Anonymous Inner Class!! */);
            this.b.c((a.a)new /* Unavailable Anonymous Inner Class!! */);
            return true;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
    }

    public IBinder onBind(Intent intent) {
        Log.d((String)"SearchCardService", (String)"onBind::");
        return null;
    }

    public void onCreate() {
        super.onCreate();
        Log.d((String)"SearchCardService", (String)"onCreate::");
        this.c = this.a();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d((String)"SearchCardService", (String)"onDestroy::");
        a a2 = this.b;
        if (a2 != null) {
            a2.d();
            this.b = null;
        }
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        Log.d((String)"SearchCardService", (String)"onStartCommand::");
        Thread thread = this.a;
        if (thread == null || !thread.isAlive()) {
            if (!this.c) {
                this.c = this.a();
            }
            if (this.c) {
                Thread thread2;
                this.a = thread2 = new Thread((Runnable)this.b);
                thread2.setName("SelectThread");
                this.a.start();
            }
        }
        return 1;
    }

    private static class com.huidu.applibs.service.search.SearchService$a
    implements Runnable {
        private boolean a = false;
        private Selector b = Selector.open();
        private List<a> c = new ArrayList();
        private long d;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void a() {
            long l = SystemClock.elapsedRealtime();
            if (l - this.d <= 2000L) {
                return;
            }
            this.d = l;
            v5.b.b();
            v5.b.f();
            com.huidu.applibs.service.search.SearchService$a a2 = this;
            synchronized (a2) {
                int n2 = 0;
                while (n2 < this.c.size()) {
                    ((a)this.c.get(n2)).c();
                    ++n2;
                }
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        private void b() {
            com.huidu.applibs.service.search.SearchService$a a2 = this;
            // MONITORENTER : a2
            for (int i = 0; i < this.c.size(); ++i) {
                ((a)this.c.get(i)).close();
            }
            this.c.clear();
            // MONITOREXIT : a2
            try {
                Selector selector = this.b;
                if (selector == null) return;
                selector.close();
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void c(a a2) {
            a2.b().register(this.b, 1, (Object)a2);
            com.huidu.applibs.service.search.SearchService$a a3 = this;
            synchronized (a3) {
                this.c.add((Object)a2);
                return;
            }
        }

        public void d() {
            this.a = true;
            this.b();
        }

        public void run() {
            while (!this.a) {
                try {
                    if (this.b == null) {
                        return;
                    }
                    this.a();
                    if (this.b.select(1000L) <= 0) continue;
                    Iterator iterator = this.b.selectedKeys().iterator();
                    while (iterator.hasNext()) {
                        SelectionKey selectionKey = (SelectionKey)iterator.next();
                        a a2 = (a)selectionKey.attachment();
                        if (selectionKey.isReadable()) {
                            a2.a(selectionKey);
                        }
                        iterator.remove();
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }

        public static interface a {
            public void a(SelectionKey var1);

            public SelectableChannel b();

            public void c();

            public void close();
        }

    }

}


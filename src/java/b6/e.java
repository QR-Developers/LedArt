/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.nio.channels.ClosedChannelException
 *  java.nio.channels.SelectableChannel
 *  java.nio.channels.SelectionKey
 *  java.nio.channels.Selector
 *  java.util.Iterator
 *  java.util.Set
 */
package b6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;

public class e
implements Handler.Callback {
    private static volatile e d;
    private HandlerThread a;
    private Handler b;
    private Selector c;

    private e() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a() {
        e e2 = this;
        synchronized (e2) {
            boolean bl;
            block8 : {
                HandlerThread handlerThread;
                block7 : {
                    HandlerThread handlerThread2 = this.a;
                    if (handlerThread2 == null) break block7;
                    boolean bl2 = handlerThread2.isAlive();
                    bl = false;
                    if (bl2) break block8;
                }
                this.a = handlerThread = new HandlerThread("EventLooperThread");
                handlerThread.start();
                bl = true;
            }
            if (this.b == null || bl) {
                this.b = new Handler(this.a.getLooper(), (Handler.Callback)this);
            }
            if (!this.b.hasMessages(1)) {
                this.b.sendEmptyMessage(1);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e b() {
        if (d != null) return d;
        Class<e> class_ = e.class;
        synchronized (e.class) {
            if (d != null) return d;
            d = new e();
            // ** MonitorExit[var1] (shouldn't be in output)
            return d;
        }
    }

    private boolean c() {
        if (this.c == null) {
            try {
                this.c = Selector.open();
            }
            catch (IOException iOException) {
                return false;
            }
        }
        return true;
    }

    private void f() {
        Selector selector = this.c;
        if (selector == null) {
            return;
        }
        try {
            if (selector.select(1000L) != 0) {
                Iterator iterator = this.c.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = (SelectionKey)iterator.next();
                    Object object = selectionKey.attachment();
                    if (object instanceof a) {
                        ((a)object).a(selectionKey);
                    }
                    iterator.remove();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.g();
    }

    private void g() {
        this.b.removeMessages(1);
        this.b.sendEmptyMessageDelayed(1, 10L);
    }

    public void d(Runnable runnable) {
        this.a();
        Handler handler = this.b;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void e(SelectableChannel selectableChannel, a a2) {
        if (!this.c()) {
            Log.w((String)"SocketEventLooper", (String)"register: init selector failed!");
            return;
        }
        this.a();
        try {
            selectableChannel.register(this.c, 1, (Object)a2);
            return;
        }
        catch (ClosedChannelException closedChannelException) {
            closedChannelException.printStackTrace();
            return;
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f();
        }
        return true;
    }

    public static interface a {
        public void a(SelectionKey var1);
    }

}


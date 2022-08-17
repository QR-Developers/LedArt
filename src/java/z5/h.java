/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.InetSocketAddress
 *  java.net.SocketAddress
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.channels.SelectableChannel
 *  java.nio.channels.SocketChannel
 *  java.util.Timer
 *  java.util.TimerTask
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  z5.d
 *  z5.e
 *  z5.e$a
 *  z5.g
 *  z5.h$a
 *  z5.h$b
 *  z5.h$c
 *  z5.h$d
 */
package z5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import z5.e;
import z5.g;
import z5.h;

public class h {
    public static final ExecutorService v = Executors.newSingleThreadExecutor();
    protected Handler a;
    protected int b;
    protected String c;
    protected String d;
    protected String e;
    protected boolean f;
    protected SocketChannel g = null;
    protected String h = "";
    protected int i = 0;
    protected b j = b.a;
    protected ByteBuffer k = null;
    protected ByteBuffer l = null;
    protected ByteBuffer m = null;
    protected ByteBuffer n = null;
    protected int o = 0;
    protected c p = null;
    protected Timer q = null;
    protected int r = 0;
    protected int s = 16777218;
    protected e.a t = e.a.d;
    protected e.a u = e.a.c;

    public h(Handler handler, int n2) {
        this.a = handler;
        this.b = n2;
        this.k();
    }

    public static int H(d d2) {
        return d2.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void I() {
        SocketChannel socketChannel;
        if (this.g != null) {
            this.e();
        }
        this.g = socketChannel = SocketChannel.open();
        if (socketChannel == null) return;
        try {
            z5.d.c().d(this, this.g);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            this.A(b.f);
        }
    }

    public static /* synthetic */ void a(h h2) {
        h2.I();
    }

    protected void A(b b2) {
        this.B(b2, 0);
    }

    protected void B(b b2, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SetErrorCode: ");
        stringBuilder.append((Object)b2);
        Log.d((String)"HTcpClient", (String)stringBuilder.toString());
        this.j = b2;
        this.e();
        Message message = new Message();
        message.what = this.b;
        message.arg1 = b2.ordinal();
        message.arg2 = n2;
        Bundle bundle = new Bundle();
        bundle.putString("cardId", this.c);
        message.setData(bundle);
        this.a.sendMessage(message);
    }

    protected void C() {
        int n2;
        int n3;
        block4 : {
            n3 = this.k.position();
            if (n3 < e.a.c.b()) {
                return;
            }
            n2 = 0;
            do {
                this.k.position(n2);
                short s2 = this.k.getShort();
                if (s2 <= 0 || s2 > 9216) break;
                int n4 = s2 + n2;
                if (n4 > n3) break block4;
                this.o = s2;
                this.h();
                if (n4 >= n3) {
                    n2 = n4;
                    break block4;
                }
                n2 = n4;
            } while (true);
            this.e();
            this.A(b.g);
        }
        if (n2 < n3) {
            this.n.clear();
            byte[] arrby = this.k.array();
            byte[] arrby2 = this.n.array();
            int n5 = n3 - n2;
            System.arraycopy((Object)arrby, (int)n2, (Object)arrby2, (int)0, (int)n5);
            this.k.clear();
            System.arraycopy((Object)this.n.array(), (int)0, (Object)this.k.array(), (int)0, (int)n5);
            this.k.position(n5);
            return;
        }
        this.k.clear();
    }

    protected void D() {
        try {
            v.execute((Runnable)new g(this));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.A(b.e);
            return;
        }
    }

    protected void E() {
        Timer timer;
        this.p = new c(this);
        this.q = timer = new Timer();
        c c2 = this.p;
        if (c2 != null) {
            timer.schedule((TimerTask)c2, 6000L, 6000L);
            return;
        }
        this.A(b.h);
    }

    protected void F() {
        if (this.p != null) {
            Timer timer = this.q;
            if (timer == null) {
                return;
            }
            timer.cancel();
            this.q = null;
            this.p = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void G() {
        h h2 = this;
        synchronized (h2) {
            try {
                try {
                    this.u();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    this.A(b.f);
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    public void J(String string) {
        this.c = string;
    }

    public void K(String string) {
        this.e = string;
    }

    public void L(String string) {
        this.d = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        h h2 = this;
        synchronized (h2) {
            try {
                try {
                    this.c();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    this.A(b.c);
                }
                if (this.j() != b.a) {
                    z5.d.c().f(this, this.g);
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    protected void c() {
        int n2;
        if (this.h != "" && (n2 = this.i) >= 0 && n2 <= 65535) {
            SocketChannel socketChannel = this.g;
            int n3 = 0;
            socketChannel.configureBlocking(false);
            this.g.connect((SocketAddress)new InetSocketAddress(this.h, this.i));
            while (!this.g.finishConnect()) {
                try {
                    Thread.sleep((long)1000L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                if (++n3 < 8) continue;
                this.A(b.k);
                return;
            }
            this.t = e.a.d;
            this.y();
            return;
        }
        this.A(b.b);
    }

    protected void d(boolean bl) {
    }

    public void e() {
        h h2 = this;
        synchronized (h2) {
            this.f();
            return;
        }
    }

    protected void f() {
        if (this.g == null) {
            return;
        }
        this.F();
        try {
            z5.d.c().f(this, this.g);
            this.g.close();
            this.g = null;
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            this.A(b.f);
            return;
        }
    }

    protected void g() {
        throw null;
    }

    protected void h() {
        e.a a2;
        this.u = a2 = e.a.a((short)this.k.getShort());
        int n2 = a.a[a2.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            this.r = 0;
                            this.g();
                            return;
                        }
                        this.n();
                        return;
                    }
                    this.q();
                    return;
                }
                this.p();
                return;
            }
            this.o();
            return;
        }
        this.r();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void i() {
        SocketChannel socketChannel;
        block8 : {
            h h2 = this;
            // MONITORENTER : h2
            socketChannel = this.g;
            if (socketChannel != null) break block8;
            // MONITOREXIT : h2
            return;
        }
        int n2 = socketChannel.read(this.k);
        if (n2 == -1) {
            this.f();
            this.A(b.d);
            return;
        }
        if (n2 <= 0) return;
        {
            this.C();
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            this.A(b.f);
        }
        // MONITOREXIT : h2
    }

    public b j() {
        return this.j;
    }

    protected void k() {
        this.l();
    }

    protected void l() {
        this.k = ByteBuffer.allocate((int)9216);
        this.l = ByteBuffer.allocate((int)9216);
        this.n = ByteBuffer.allocate((int)9216);
        this.m = ByteBuffer.allocate((int)e.a.N.b());
        ByteBuffer byteBuffer = this.k;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBuffer.order(byteOrder);
        this.l.order(byteOrder);
        this.n.order(byteOrder);
        this.m.order(byteOrder);
        this.k.clear();
        this.l.clear();
        this.n.clear();
        this.m.clear();
    }

    protected void m(Object object) {
        b b2;
        this.j = b2 = b.a;
        this.e();
        Message message = new Message();
        message.what = this.b;
        message.arg1 = b2.ordinal();
        message.arg2 = 0;
        message.obj = object;
        Bundle bundle = new Bundle();
        bundle.putString("cardId", this.c);
        message.setData(bundle);
        this.a.sendMessage(message);
    }

    protected void n() {
        e.a a2 = this.t;
        e.a a3 = e.a.q0;
        if (a2 != a3) {
            this.A(b.i);
            return;
        }
        if (this.o != a3.b()) {
            this.A(b.g);
            return;
        }
        if (this.k.get() == 0) {
            this.d(false);
            return;
        }
        this.d(true);
    }

    protected void o() {
        if (this.t != e.a.s0) {
            this.A(b.i);
            return;
        }
        if (this.k.get() == 1) {
            this.A(b.G);
            return;
        }
        this.w();
    }

    protected void p() {
        if (this.o != e.a.O.b()) {
            this.A(b.g);
            return;
        }
        this.r = 0;
    }

    protected void q() {
        e.a a2 = this.t;
        e.a a3 = e.a.o0;
        if (a2 != a3) {
            this.A(b.i);
            return;
        }
        if (this.o != a3.b()) {
            this.A(b.g);
            return;
        }
        if (this.k.get() != 0) {
            this.f = true;
            String string = this.d;
            if (string != null && string.length() > 0) {
                this.t = e.a.p0;
                this.s();
                return;
            }
            this.d(false);
            return;
        }
        this.f = false;
        this.d(true);
    }

    protected void r() {
        int n2;
        e.a a2 = this.t;
        e.a a3 = e.a.e;
        if (a2 != a3) {
            this.A(b.i);
            return;
        }
        if (this.o != a3.b()) {
            this.A(b.g);
            return;
        }
        this.s = n2 = this.k.getInt();
        if (n2 >= 16777223) {
            this.t = e.a.r0;
            this.t();
            return;
        }
        this.w();
    }

    protected void s() {
        if (this.t != e.a.p0) {
            this.A(b.i);
            return;
        }
        e.x().b(this.l, String.valueOf((Object)this.d));
        this.v();
        this.t = e.a.q0;
    }

    protected void t() {
        if (this.t != e.a.r0) {
            this.A(b.i);
            return;
        }
        e.x().c(this.l, String.valueOf((Object)this.e));
        this.v();
        this.t = e.a.s0;
    }

    protected void u() {
        int n2;
        if (this.g == null) {
            this.F();
            return;
        }
        this.r = n2 = 1 + this.r;
        if (n2 > 10) {
            this.A(b.j);
            this.f();
            return;
        }
        e.x().m(this.m);
        this.g.write(this.m);
    }

    protected void v() {
        if (this.g == null) {
            this.A(b.c);
            return;
        }
        while (this.l.hasRemaining()) {
            this.g.write(this.l);
        }
    }

    protected void w() {
        throw null;
    }

    protected void x() {
        if (this.t != e.a.n0) {
            this.A(b.i);
            return;
        }
        e.x().u(this.l);
        this.v();
        this.t = e.a.o0;
    }

    protected void y() {
        if (this.t != e.a.d) {
            this.A(b.i);
            return;
        }
        e.x().w(this.l);
        this.v();
        this.t = e.a.e;
    }

    public void z(String string, int n2) {
        this.h = string;
        this.i = n2;
    }
}


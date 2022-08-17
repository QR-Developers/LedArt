/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.util.Log
 *  b6.a
 *  b6.d$a
 *  b6.e
 *  b6.e$a
 *  java.io.ByteArrayOutputStream
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.SocketTimeoutException
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.channels.SelectableChannel
 *  java.nio.channels.SelectionKey
 *  java.nio.channels.SocketChannel
 *  java.util.Timer
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  org.w3c.dom.Document
 *  org.w3c.dom.Element
 *  y5.e
 */
package b6;

import android.os.SystemClock;
import android.util.Log;
import b6.b;
import b6.c;
import b6.d;
import b6.e;
import java.io.ByteArrayOutputStream;
import java.net.SocketTimeoutException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m5.o0;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class d
implements e.a {
    private String a;
    private int b = 10001;
    private a c;
    private ExecutorService d;
    private SocketChannel e;
    private int f = 0;
    private String g = null;
    private ByteBuffer h;
    private int i;
    private ByteBuffer j;
    private ByteArrayOutputStream k;
    private ByteBuffer l;
    private Timer m;
    private int n;
    private boolean o;
    private String p;

    public d() {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        this.h = byteBuffer3 = ByteBuffer.allocate((int)9216);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBuffer3.order(byteOrder);
        this.j = byteBuffer2 = ByteBuffer.allocate((int)9216);
        byteBuffer2.order(byteOrder);
        this.l = byteBuffer = ByteBuffer.allocate((int)4);
        byteBuffer.order(byteOrder);
        this.k = new ByteArrayOutputStream();
    }

    private void A(byte[] arrby) {
        int n2;
        Log.d((String)"SdkTcpClient", (String)"sendSDKCmdAsk: ");
        for (int i2 = 0; i2 < arrby.length; i2 += n2) {
            n2 = arrby.length - i2;
            if (n2 > 9204) {
                n2 = 9204;
            }
            short s2 = (short)(n2 + 12);
            this.j.clear();
            this.j.putShort(s2);
            this.j.putShort((short)8195);
            this.j.putInt(arrby.length);
            this.j.putInt(i2);
            System.arraycopy((Object)arrby, (int)i2, (Object)this.j.array(), (int)12, (int)n2);
            this.j.position(0);
            this.j.limit((int)s2);
            if (this.K(this.j) > 0) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("write channel failed, end at: ");
            stringBuilder.append(i2);
            Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
            this.G(b6.a.b);
            return;
        }
    }

    private void B() {
        Log.d((String)"SdkTcpClient", (String)"sendServiceAsk: ");
        this.j.clear();
        this.j.putShort((short)8);
        this.j.putShort((short)8193);
        this.j.putInt(16777222);
        this.j.flip();
        this.K(this.j);
    }

    private void J() {
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
    }

    public static /* synthetic */ void b(d d2, String string) {
        d2.s(string);
    }

    public static /* synthetic */ void c(d d2) {
        d2.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d() {
        this.J();
        d d2 = this;
        synchronized (d2) {
            this.f = 0;
            this.g = null;
            SocketChannel socketChannel = this.e;
            if (socketChannel != null) {
                try {
                    socketChannel.close();
                    this.e = null;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        ExecutorService executorService = this.d;
        if (executorService != null) {
            try {
                executorService.shutdown();
                this.d = null;
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void e() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl78 : ALOAD_0 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:923)
        throw new IllegalStateException("Decompilation failed");
    }

    private void i(Runnable runnable) {
        ExecutorService executorService = this.d;
        if (executorService == null || executorService.isShutdown()) {
            this.d = Executors.newSingleThreadExecutor();
        }
        try {
            this.d.execute(runnable);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private void l(ByteBuffer byteBuffer, int n2) {
        if (n2 != 6) {
            this.G(b6.a.c);
            return;
        }
        short s2 = byteBuffer.getShort();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleErrorAnswer: ");
        stringBuilder.append((int)s2);
        Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
        this.G(b6.a.e);
    }

    private void m(ByteBuffer byteBuffer, int n2) {
        Log.d((String)"SdkTcpClient", (String)"handleHeartbeatAnswer: ");
    }

    private void n(ByteBuffer byteBuffer, int n2) {
        Log.d((String)"SdkTcpClient", (String)"handleHeartbeatAsk::");
        this.y();
    }

    private void o(ByteBuffer byteBuffer, int n2) {
        if (n2 < 12) {
            this.G(b6.a.c);
            return;
        }
        int n3 = byteBuffer.getInt();
        int n4 = byteBuffer.getInt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleSDKCmdAsk:: total: ");
        stringBuilder.append(n3);
        stringBuilder.append(", index: ");
        stringBuilder.append(n4);
        Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
        if (n4 == 0) {
            this.k.reset();
        }
        int n5 = n2 - 12;
        this.k.write(byteBuffer.array(), 12, n5);
        if (this.k.size() == n3) {
            this.h(this.k.toString());
        }
    }

    private void p(ByteBuffer byteBuffer, int n2) {
        if (n2 != 8) {
            this.G(b6.a.c);
            return;
        }
        this.n = byteBuffer.getInt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleServiceAnswer: ");
        stringBuilder.append(Integer.toHexString((int)this.n));
        Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
        if (this.n >= 16777222) {
            this.C();
            return;
        }
        this.x();
    }

    private boolean r() {
        d d2 = this;
        synchronized (d2) {
            int n2 = this.f;
            boolean bl = n2 == 2;
            return bl;
        }
    }

    private /* synthetic */ void s(String string) {
        this.A(string.getBytes());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void t(SocketChannel socketChannel) {
        Log.d((String)"SdkTcpClient", (String)"onConnectSuccess: ");
        e.b().e((SelectableChannel)socketChannel, (e.a)this);
        d d2 = this;
        synchronized (d2) {
            this.e = socketChannel;
            this.f = 2;
        }
        this.B();
    }

    private void u(String string) {
        String string2;
        Document document = o0.k(string);
        if (document == null) {
            this.G(b6.a.d);
            return;
        }
        Element element = document.getDocumentElement();
        if (!"sdk".equalsIgnoreCase(element.getTagName())) {
            this.G(b6.a.d);
            return;
        }
        Element element2 = o0.c(element, "out");
        if (element2 == null) {
            this.G(b6.a.d);
            return;
        }
        if (!"GetIFVersion".equals((Object)element2.getAttribute("method"))) {
            this.G(b6.a.d);
            return;
        }
        String string3 = element2.getAttribute("result");
        if (!"0".equals((Object)string3) && !"kSuccess".equals((Object)string3)) {
            this.G(b6.a.e);
            return;
        }
        this.g = string2 = element.getAttribute("guid");
        a a2 = this.c;
        if (a2 != null) {
            a2.a(this, string2);
        }
    }

    private void y() {
        Log.d((String)"SdkTcpClient", (String)"sendHeartbeatAnswer: ");
        this.j.clear();
        this.j.putShort((short)4);
        this.j.putShort((short)96);
        this.j.flip();
        this.K(this.j);
    }

    protected void C() {
        Log.d((String)"SdkTcpClient", (String)"sendTestDeviceLockerAsk: ");
        this.j.clear();
        this.j.putShort((short)4);
        this.j.putShort((short)1034);
        this.j.flip();
        this.K(this.j);
    }

    public void D(a a2) {
        this.c = a2;
    }

    public void E(boolean bl) {
        this.o = bl;
    }

    public void F(String string) {
        this.a = string;
    }

    protected void G(int n2) {
        this.d();
        a a2 = this.c;
        if (a2 != null) {
            a2.c(this, n2);
        }
    }

    public void H(String string) {
        this.p = string;
    }

    public void I() {
        e.b().d((Runnable)new b(this));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected int K(ByteBuffer byteBuffer) {
        Throwable throwable2222;
        block11 : {
            block10 : {
                d d2 = this;
                // MONITORENTER : d2
                int n2 = this.f;
                if (n2 == 2) break block10;
                // MONITOREXIT : d2
                return -1;
            }
            int n3 = 0;
            try {
                long l2 = SystemClock.elapsedRealtime();
                while (byteBuffer.hasRemaining()) {
                    if (SystemClock.elapsedRealtime() - l2 > 30000L) throw new SocketTimeoutException();
                    n3 += this.e.write(byteBuffer);
                }
                if (n3 > 0) {
                    SystemClock.elapsedRealtime();
                }
                // MONITOREXIT : d2
                return n3;
            }
            catch (Throwable throwable2222) {
                break block11;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.f = 3;
                this.G(b6.a.b);
                // MONITOREXIT : d2
                return -1;
            }
        }
        throw throwable2222;
    }

    public void a(SelectionKey selectionKey) {
        if (!this.r()) {
            return;
        }
        int n2 = this.v(this.h);
        if (n2 <= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("disposeEvent:: read channel failed: ");
            stringBuilder.append(n2);
            Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
            this.G(b6.a.b);
            return;
        }
        this.i = n2 + this.i;
        while (this.i > 2) {
            int n3;
            this.h.position(0);
            int n4 = 65535 & this.h.getShort();
            if (n4 > 9216) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("splitPacket::packet size overflow: ");
                stringBuilder.append(n4);
                Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
                this.G(b6.a.c);
                return;
            }
            if (n4 > this.i) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("splitPacket::packet not complete: ");
                stringBuilder.append(this.i);
                stringBuilder.append("/");
                stringBuilder.append(n4);
                Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
                this.h.position(this.i);
                return;
            }
            this.g(this.h);
            this.i = n3 = this.i - n4;
            if (n3 > 0 && this.r()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("splitPacket::move remain data to front of array: ");
                stringBuilder.append(this.i);
                Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
                byte[] arrby = this.h.array();
                System.arraycopy((Object)arrby, (int)n4, (Object)arrby, (int)0, (int)this.i);
                this.h.position(this.i);
                continue;
            }
            this.i = 0;
            this.h.clear();
        }
    }

    protected void f(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("deviceLockerCheckFinish: ");
        stringBuilder.append(bl);
        Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
        if (!bl && this.o) {
            String string = this.p;
            if (string != null && string.length() != 0) {
                this.G(b6.a.h);
                return;
            }
            this.G(b6.a.g);
            return;
        }
        this.x();
    }

    protected void g(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int n2 = 65535 & byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (s2 != 95) {
            if (s2 != 96) {
                if (s2 != 1035) {
                    if (s2 != 1037) {
                        if (s2 != 8192) {
                            if (s2 != 8194) {
                                if (s2 != 8196) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("disposeCmd::invalid command: ");
                                    stringBuilder.append((int)s2);
                                    Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
                                    return;
                                }
                                this.o(byteBuffer, n2);
                                return;
                            }
                            this.p(byteBuffer, n2);
                            return;
                        }
                        this.l(byteBuffer, n2);
                        return;
                    }
                    this.k(byteBuffer, n2);
                    return;
                }
                this.q(byteBuffer, n2);
                return;
            }
            this.m(byteBuffer, n2);
            return;
        }
        this.n(byteBuffer, n2);
    }

    protected void h(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("disposeMessage: ");
        stringBuilder.append(string);
        Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
        if (this.g == null) {
            this.u(string);
            return;
        }
        a a2 = this.c;
        if (a2 != null) {
            a2.b(this, string);
        }
    }

    public void j() {
        this.d();
    }

    protected void k(ByteBuffer byteBuffer, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleCheckDeviceLockerAnswer: ");
        stringBuilder.append(n2);
        Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
        if (n2 != 5) {
            this.G(b6.a.c);
            return;
        }
        if (byteBuffer.get() == 0) {
            this.f(false);
            return;
        }
        this.f(true);
    }

    protected void q(ByteBuffer byteBuffer, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleTestDeviceLockerAnswer: ");
        stringBuilder.append(n2);
        Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
        if (n2 != 5) {
            this.G(b6.a.c);
            return;
        }
        if (byteBuffer.get() != 0) {
            String string = this.p;
            if (string != null && string.length() > 0) {
                this.w();
                return;
            }
            this.f(false);
            return;
        }
        this.f(true);
    }

    protected int v(ByteBuffer byteBuffer) {
        d d2 = this;
        synchronized (d2) {
            block9 : {
                int n2 = this.f;
                if (n2 == 2) break block9;
                return -1;
            }
            try {
                int n3 = this.e.read(byteBuffer);
                if (n3 > 0) {
                    SystemClock.elapsedRealtime();
                }
                return n3;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.f = 3;
                this.G(b6.a.b);
            }
            finally {
            }
        }
    }

    protected void w() {
        Log.d((String)"SdkTcpClient", (String)"sendCheckDeviceLockerAsk: ");
        this.j.clear();
        this.j.putShort((short)4);
        this.j.putShort((short)1036);
        byte[] arrby = y5.e.a((String)String.valueOf((Object)this.p));
        this.j.put(arrby);
        this.j.put((byte)0);
        int n2 = 4 + (1 + arrby.length);
        this.j.putShort(0, (short)n2);
        this.j.position(0);
        this.j.limit(n2);
        this.K(this.j);
    }

    protected void x() {
        this.g = null;
        this.z("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<sdk guid=\"##GUID\">\n    <in method=\"GetIFVersion\">\n        <version value=\"1000000\"/>\n    </in>\n</sdk>");
    }

    public void z(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sendMessage: ");
        stringBuilder.append(string);
        Log.d((String)"SdkTcpClient", (String)stringBuilder.toString());
        this.i(new c(this, string));
    }
}


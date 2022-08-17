/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  b8.b
 *  e8.e
 *  e8.e$a
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Deque
 *  java.util.Iterator
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.SynchronousQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicInteger
 *  u7.j
 */
package a8;

import b8.b;
import e8.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import u7.j;

public final class p {
    private int a = 64;
    private int b = 5;
    private Runnable c;
    private ExecutorService d;
    private final ArrayDeque<e.a> e = new ArrayDeque();
    private final ArrayDeque<e.a> f = new ArrayDeque();
    private final ArrayDeque<e> g = new ArrayDeque();

    private final e.a d(String string) {
        for (e.a a2 : this.f) {
            if (!j.a((Object)a2.d(), (Object)string)) continue;
            return a2;
        }
        for (e.a a3 : this.e) {
            if (!j.a((Object)a3.d(), (Object)string)) continue;
            return a3;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final <T> void e(Deque<T> deque, T t2) {
        p p2 = this;
        // MONITORENTER : p2
        if (!deque.remove(t2)) throw new AssertionError((Object)"Call wasn't in-flight!");
        Runnable runnable = this.c;
        // MONITOREXIT : p2
        if (this.h()) return;
        if (runnable == null) return;
        runnable.run();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final boolean h() {
        if (b.g && Thread.holdsLock((Object)this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            Thread thread = Thread.currentThread();
            j.b((Object)thread, (String)"Thread.currentThread()");
            stringBuilder.append(thread.getName());
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append((Object)this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        ArrayList arrayList = new ArrayList();
        p p2 = this;
        // MONITORENTER : p2
        Iterator iterator = this.e.iterator();
        j.b((Object)iterator, (String)"readyAsyncCalls.iterator()");
        while (iterator.hasNext()) {
            e.a a2 = (e.a)iterator.next();
            if (this.f.size() >= this.a) break;
            if (a2.c().get() >= this.b) continue;
            iterator.remove();
            a2.c().incrementAndGet();
            j.b((Object)a2, (String)"asyncCall");
            arrayList.add((Object)a2);
            this.f.add((Object)a2);
        }
        int n3 = this.i();
        int n2 = 0;
        boolean bl = n3 > 0;
        // MONITOREXIT : p2
        int n4 = arrayList.size();
        while (n2 < n4) {
            ((e.a)arrayList.get(n2)).a(this.c());
            ++n2;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(e.a a2) {
        j.f((Object)a2, (String)"call");
        p p2 = this;
        synchronized (p2) {
            e.a a3;
            this.e.add((Object)a2);
            if (!a2.b().k() && (a3 = this.d(a2.d())) != null) {
                a2.e(a3);
            }
        }
        this.h();
    }

    public final void b(e e2) {
        p p2 = this;
        synchronized (p2) {
            j.f((Object)e2, (String)"call");
            this.g.add((Object)e2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ExecutorService c() {
        p p2 = this;
        synchronized (p2) {
            ExecutorService executorService;
            if (this.d == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b.h);
                stringBuilder.append(" Dispatcher");
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, (BlockingQueue)synchronousQueue, b.H((String)stringBuilder.toString(), (boolean)false));
                this.d = threadPoolExecutor;
            }
            if ((executorService = this.d) == null) {
                j.m();
            }
            return executorService;
        }
    }

    public final void f(e.a a2) {
        j.f((Object)a2, (String)"call");
        a2.c().decrementAndGet();
        this.e((Deque<T>)this.f, (T)a2);
    }

    public final void g(e e2) {
        j.f((Object)e2, (String)"call");
        this.e((Deque<T>)this.g, (T)e2);
    }

    public final int i() {
        p p2 = this;
        synchronized (p2) {
            int n2 = this.f.size();
            int n3 = this.g.size();
            int n4 = n2 + n3;
            return n4;
        }
    }
}


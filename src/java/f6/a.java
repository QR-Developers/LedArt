/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e6.a
 *  f6.b
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.locks.Lock
 *  java.util.concurrent.locks.ReentrantLock
 */
package f6;

import f6.b;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a
extends Enum<a> {
    public static final /* enum */ a c;
    private static final /* synthetic */ a[] d;
    private Lock a = new ReentrantLock();
    private b b = new b();

    static {
        a a2;
        c = a2 = new a();
        d = new a[]{a2};
    }

    public static a valueOf(String string) {
        return (a)Enum.valueOf(a.class, (String)string);
    }

    public static a[] values() {
        return (a[])d.clone();
    }

    public void a(String string) {
        this.a.lock();
        try {
            this.b.l(string);
            return;
        }
        finally {
            this.a.unlock();
        }
    }

    public e6.a b(String string) {
        this.a.lock();
        try {
            e6.a a2 = this.b.m(string);
            return a2;
        }
        finally {
            this.a.unlock();
        }
    }

    public List<e6.a> c() {
        this.a.lock();
        try {
            List list = this.b.n();
            return list;
        }
        finally {
            this.a.unlock();
        }
    }

    public e6.a d(e6.a a2) {
        this.a.lock();
        try {
            this.b.j((Object)a2);
            return a2;
        }
        finally {
            this.a.unlock();
        }
    }

    public void e(e6.a a2) {
        this.a.lock();
        try {
            this.b.q(a2);
            return;
        }
        finally {
            this.a.unlock();
        }
    }
}


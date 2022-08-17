/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a9.c
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteStatement
 *  android.os.Build
 *  android.os.Build$VERSION
 *  d9.b
 *  d9.c
 *  e9.a
 *  e9.c
 *  e9.d
 *  f9.b
 *  java.io.Closeable
 *  java.io.File
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  w8.a
 *  w8.a$a
 *  w8.a$b
 *  w8.a$c
 *  w8.b
 *  z8.a
 *  z8.c
 */
package a9;

import a9.c;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import e9.d;
import java.io.Closeable;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import w8.a;

public final class b
extends e9.c {
    private static final HashMap<a.a, b> e = new HashMap();
    private SQLiteDatabase b;
    private a.a c;
    private boolean d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private b(a.a a2) {
        if (a2 == null) throw new IllegalArgumentException("daoConfig may not be null");
        this.c = a2;
        this.d = a2.g();
        this.b = this.K(a2);
        a.b b2 = a2.c();
        if (b2 == null) return;
        try {
            b2.a((a)this);
            return;
        }
        catch (Throwable throwable) {
            z8.a.b((Closeable)this.b);
            throw new f9.b(throwable.getMessage(), throwable);
        }
        catch (f9.b b3) {
            z8.a.b((Closeable)this.b);
            throw b3;
        }
    }

    private void G() {
        if (this.d) {
            if (Build.VERSION.SDK_INT >= 16 && this.b.isWriteAheadLoggingEnabled()) {
                this.b.beginTransactionNonExclusive();
                return;
            }
            this.b.beginTransaction();
        }
    }

    private void H() {
        if (this.d) {
            this.b.endTransaction();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a I(a.a a2) {
        Class<b> class_ = b.class;
        synchronized (b.class) {
            HashMap<a.a, b> hashMap;
            b b2;
            if (a2 == null) {
                a2 = new a.a();
            }
            if ((b2 = (b)((Object)(hashMap = e).get((Object)a2))) == null) {
                b2 = new b(a2);
                hashMap.put((Object)a2, (Object)b2);
            } else {
                b2.c = a2;
            }
            SQLiteDatabase sQLiteDatabase = b2.b;
            int n = sQLiteDatabase.getVersion();
            int n2 = a2.e();
            if (n != n2) {
                if (n != 0) {
                    a.c c2 = a2.d();
                    if (c2 != null) {
                        c2.a((a)b2, n, n2);
                    } else {
                        b2.D();
                    }
                }
                sQLiteDatabase.setVersion(n2);
            }
            // ** MonitorExit[var9_1] (shouldn't be in output)
            return b2;
        }
    }

    private long J(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT seq FROM sqlite_sequence WHERE name='");
        stringBuilder.append(string);
        stringBuilder.append("' LIMIT 1");
        Cursor cursor = this.c(stringBuilder.toString());
        long l = -1L;
        if (cursor != null) {
            block5 : {
                try {
                    if (!cursor.moveToNext()) break block5;
                    l = cursor.getLong(0);
                }
                catch (Throwable throwable) {
                    try {
                        throw new f9.b(throwable);
                    }
                    catch (Throwable throwable2) {
                        z8.a.a((Cursor)cursor);
                        throw throwable2;
                    }
                }
            }
            z8.a.a((Cursor)cursor);
            return l;
        }
        return l;
    }

    private SQLiteDatabase K(a.a a2) {
        File file = a2.a();
        if (file != null && (file.exists() || file.mkdirs())) {
            return SQLiteDatabase.openOrCreateDatabase((File)new File(file, a2.b()), null);
        }
        return w8.b.a().openOrCreateDatabase(a2.b(), 0, null);
    }

    private boolean L(d<?> d2, Object object) {
        e9.a a2 = d2.f();
        if (a2.f()) {
            this.i(d9.c.c(d2, (Object)object));
            long l = this.J(d2.g());
            if (l == -1L) {
                return false;
            }
            a2.h(object, l);
            return true;
        }
        this.i(d9.c.c(d2, (Object)object));
        return true;
    }

    private void M(d<?> d2, Object object) {
        e9.a a2 = d2.f();
        if (a2.f()) {
            if (a2.b(object) != null) {
                this.i(d9.c.e(d2, (Object)object, (String[])new String[0]));
                return;
            }
            this.L(d2, object);
            return;
        }
        this.i(d9.c.d(d2, (Object)object));
    }

    private void N() {
        if (this.d) {
            this.b.setTransactionSuccessful();
        }
    }

    public Cursor c(String string) {
        try {
            Cursor cursor = this.b.rawQuery(string, null);
            return cursor;
        }
        catch (Throwable throwable) {
            throw new f9.b(throwable);
        }
    }

    public void close() {
        HashMap<a.a, b> hashMap = e;
        if (hashMap.containsKey((Object)this.c)) {
            hashMap.remove((Object)this.c);
            this.b.close();
        }
    }

    public void i(d9.b b2) {
        SQLiteStatement sQLiteStatement = null;
        try {
            sQLiteStatement = b2.c(this.b);
            sQLiteStatement.execute();
        }
        catch (Throwable throwable) {
            try {
                throw new f9.b(throwable);
            }
            catch (Throwable throwable2) {
                if (sQLiteStatement != null) {
                    try {
                        sQLiteStatement.releaseReference();
                    }
                    catch (Throwable throwable3) {
                        z8.c.c((String)throwable3.getMessage(), (Throwable)throwable3);
                    }
                }
                throw throwable2;
            }
        }
        try {
            sQLiteStatement.releaseReference();
            return;
        }
        catch (Throwable throwable) {
            z8.c.c((String)throwable.getMessage(), (Throwable)throwable);
            return;
        }
    }

    public <T> c<T> q(Class<T> class_) {
        return c.c((d)this.E(class_));
    }

    public void r(String string) {
        try {
            this.b.execSQL(string);
            return;
        }
        catch (Throwable throwable) {
            throw new f9.b(throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void s(Object object) {
        try {
            this.G();
            if (object instanceof List) {
                List list = (List)object;
                boolean bl = list.isEmpty();
                if (bl) {
                    return;
                }
                d d2 = this.E(list.get(0).getClass());
                boolean bl2 = d2.i();
                if (!bl2) {
                    return;
                }
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.i(d9.c.b((d)d2, (Object)iterator.next()));
                }
            } else {
                d d3 = this.E(object.getClass());
                boolean bl = d3.i();
                if (!bl) {
                    return;
                }
                this.i(d9.c.b((d)d3, (Object)object));
            }
            this.N();
            return;
        }
        finally {
            this.H();
        }
    }

    public a.a t() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u(Object object) {
        try {
            this.G();
            if (object instanceof List) {
                List list = (List)object;
                boolean bl = list.isEmpty();
                if (bl) {
                    return;
                }
                d d2 = this.E(list.get(0).getClass());
                d2.b();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.M(d2, iterator.next());
                }
            } else {
                d d3 = this.E(object.getClass());
                d3.b();
                this.M(d3, object);
            }
            this.N();
            return;
        }
        finally {
            this.H();
        }
    }

    public SQLiteDatabase v() {
        return this.b;
    }
}


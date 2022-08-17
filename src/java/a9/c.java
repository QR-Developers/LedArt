/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  d9.d
 *  e9.d
 *  f9.b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  w8.a
 *  z8.a
 */
package a9;

import android.database.Cursor;
import d9.d;
import f9.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c<T> {
    private final e9.d<T> a;
    private d b;
    private List<a> c;
    private int d = 0;
    private int e = 0;

    private c(e9.d<T> d2) {
        this.a = d2;
    }

    static <T> c<T> c(e9.d<T> d2) {
        return new c<T>(d2);
    }

    public List<T> a() {
        if (!this.a.i()) {
            return null;
        }
        Cursor cursor = this.a.d().c(this.toString());
        if (cursor != null) {
            ArrayList arrayList;
            try {
                arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    arrayList.add(a9.a.a(this.a, cursor));
                }
            }
            catch (Throwable throwable) {
                try {
                    throw new b(throwable);
                }
                catch (Throwable throwable2) {
                    z8.a.a((Cursor)cursor);
                    throw throwable2;
                }
            }
            z8.a.a((Cursor)cursor);
            return arrayList;
        }
        return null;
    }

    public T b() {
        if (!this.a.i()) {
            return null;
        }
        this.d(1);
        Cursor cursor = this.a.d().c(this.toString());
        if (cursor != null) {
            block6 : {
                T t2;
                try {
                    if (!cursor.moveToNext()) break block6;
                    t2 = a9.a.a(this.a, cursor);
                }
                catch (Throwable throwable) {
                    try {
                        throw new b(throwable);
                    }
                    catch (Throwable throwable2) {
                        z8.a.a((Cursor)cursor);
                        throw throwable2;
                    }
                }
                z8.a.a((Cursor)cursor);
                return t2;
            }
            z8.a.a((Cursor)cursor);
            return null;
        }
        return null;
    }

    public c<T> d(int n2) {
        this.d = n2;
        return this;
    }

    public c<T> e(d d2) {
        this.b = d2;
        return this;
    }

    public c<T> f(String string, String string2, Object object) {
        this.b = d.c((String)string, (String)string2, (Object)object);
        return this;
    }

    public String toString() {
        List<a> list;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT ");
        stringBuilder.append("*");
        stringBuilder.append(" FROM ");
        stringBuilder.append("\"");
        stringBuilder.append(this.a.g());
        stringBuilder.append("\"");
        d d2 = this.b;
        if (d2 != null && d2.d() > 0) {
            stringBuilder.append(" WHERE ");
            stringBuilder.append(this.b.toString());
        }
        if ((list = this.c) != null && list.size() > 0) {
            stringBuilder.append(" ORDER BY ");
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(((a)iterator.next()).toString());
                stringBuilder.append(',');
            }
            stringBuilder.deleteCharAt(-1 + stringBuilder.length());
        }
        if (this.d > 0) {
            stringBuilder.append(" LIMIT ");
            stringBuilder.append(this.d);
            stringBuilder.append(" OFFSET ");
            stringBuilder.append(this.e);
        }
        return stringBuilder.toString();
    }

    public static class a {
        private String a;
        private boolean b;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\"");
            stringBuilder.append(this.a);
            stringBuilder.append("\"");
            String string = this.b ? " DESC" : " ASC";
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  b5.a
 *  com.google.gson.e
 *  com.google.gson.r
 *  com.google.gson.t
 *  com.google.gson.u
 *  d5.a
 *  e5.a
 *  e5.b
 *  e5.c
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  z4.e
 *  z4.j
 */
package a5;

import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import e5.b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import z4.j;

public final class c
extends t<Date> {
    public static final u b = new u(){

        public <T> t<T> a(e e2, d5.a<T> a2) {
            if (a2.c() == Date.class) {
                return new c();
            }
            return null;
        }
    };
    private final List<DateFormat> a;

    public c() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        Locale locale = Locale.US;
        arrayList.add((Object)DateFormat.getDateTimeInstance((int)2, (int)2, (Locale)locale));
        if (!Locale.getDefault().equals((Object)locale)) {
            arrayList.add((Object)DateFormat.getDateTimeInstance((int)2, (int)2));
        }
        if (z4.e.e()) {
            arrayList.add((Object)j.c((int)2, (int)2));
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Date e(String string) {
        c c2 = this;
        synchronized (c2) {
            Iterator iterator = this.a.iterator();
            if (iterator.hasNext()) {
                DateFormat dateFormat = (DateFormat)iterator.next();
                return dateFormat.parse(string);
            }
            try {
                return b5.a.c((String)string, (ParsePosition)new ParsePosition(0));
            }
            catch (ParseException parseException) {
                throw new r(string, (Throwable)parseException);
            }
        }
    }

    public Date f(e5.a a2) {
        if (a2.a0() == b.i) {
            a2.W();
            return null;
        }
        return this.e(a2.Y());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(e5.c c2, Date date) {
        c c3 = this;
        synchronized (c3) {
            if (date == null) {
                c2.P();
                return;
            }
            c2.c0(((DateFormat)this.a.get(0)).format(date));
            return;
        }
    }

}


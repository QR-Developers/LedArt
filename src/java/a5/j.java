/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
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
 *  java.sql.Date
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Date
 */
package a5;

import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import e5.b;
import e5.c;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class j
extends t<java.sql.Date> {
    public static final u b = new u(){

        public <T> t<T> a(e e2, d5.a<T> a2) {
            if (a2.c() == java.sql.Date.class) {
                return new j();
            }
            return null;
        }
    };
    private final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public java.sql.Date e(e5.a a2) {
        j j2 = this;
        synchronized (j2) {
            if (a2.a0() == b.i) {
                a2.W();
                return null;
            }
            try {
                return new java.sql.Date(this.a.parse(a2.Y()).getTime());
            }
            catch (ParseException parseException) {
                throw new r((Throwable)parseException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(c c2, java.sql.Date date) {
        j j2 = this;
        synchronized (j2) {
            String string = date == null ? null : this.a.format((Date)date);
            c2.c0(string);
            return;
        }
    }

}


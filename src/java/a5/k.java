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
 *  java.sql.Time
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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class k
extends t<Time> {
    public static final u b = new u(){

        public <T> t<T> a(e e2, d5.a<T> a2) {
            if (a2.c() == Time.class) {
                return new k();
            }
            return null;
        }
    };
    private final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Time e(e5.a a2) {
        k k2 = this;
        synchronized (k2) {
            if (a2.a0() == b.i) {
                a2.W();
                return null;
            }
            try {
                return new Time(this.a.parse(a2.Y()).getTime());
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
    public void f(c c2, Time time) {
        k k2 = this;
        synchronized (k2) {
            String string = time == null ? null : this.a.format((Date)time);
            c2.c0(string);
            return;
        }
    }

}


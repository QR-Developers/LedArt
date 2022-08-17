/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.commonsdk.config.b$1
 *  com.umeng.commonsdk.config.b$a
 *  com.umeng.commonsdk.config.d
 *  com.umeng.commonsdk.config.f
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.umeng.commonsdk.config;

import com.umeng.commonsdk.config.b;
import com.umeng.commonsdk.config.d;
import com.umeng.commonsdk.config.f;
import java.util.HashMap;
import java.util.Map;

/*
 * Exception performing whole class analysis ignored.
 */
public class b
implements f {
    private static Map<String, Boolean> a = new HashMap();
    private static Object b = new Object();

    static {
    }

    private b() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(String string) {
        Object object;
        if (!d.a((String)string)) {
            return false;
        }
        Object object2 = object = b;
        synchronized (object2) {
            if (!a.containsKey((Object)string)) return true;
            return (Boolean)a.get((Object)string);
        }
    }

    public static b b() {
        return a.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        Object object;
        Object object2 = object = b;
        synchronized (object2) {
            a.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String string, Boolean bl2) {
        Object object;
        if (!d.a((String)string)) {
            return;
        }
        Object object2 = object = b;
        synchronized (object2) {
            Map<String, Boolean> map = a;
            if (map != null) {
                map.put((Object)string, (Object)bl2);
            }
            return;
        }
    }
}


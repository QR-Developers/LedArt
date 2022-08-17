/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.vshelper.PageNameMonitor$1
 *  com.umeng.analytics.vshelper.PageNameMonitor$a
 *  com.umeng.analytics.vshelper.a
 *  java.lang.Object
 *  java.lang.String
 */
package com.umeng.analytics.vshelper;

import com.umeng.analytics.vshelper.PageNameMonitor;

/*
 * Exception performing whole class analysis ignored.
 */
public class PageNameMonitor
implements com.umeng.analytics.vshelper.a {
    private static String currentActivity;
    private static String currentCustomPage;
    private static Object lock;

    static {
        lock = new Object();
    }

    private PageNameMonitor() {
    }

    public static PageNameMonitor getInstance() {
        return a.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void activityPause(String string) {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            currentActivity = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void activityResume(String string) {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            currentActivity = string;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void customPageBegin(String string) {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            currentCustomPage = string;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void customPageEnd(String string) {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            currentCustomPage = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getCurrenPageName() {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            String string = currentCustomPage;
            if (string != null) {
                return string;
            }
            String string2 = currentActivity;
            if (string2 != null) {
                return string2;
            }
            return null;
        }
    }
}


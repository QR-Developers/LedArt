/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.umeng.commonsdk.statistics.a
 *  com.umeng.commonsdk.statistics.common.DataHelper
 *  com.umeng.commonsdk.statistics.common.d
 *  com.umeng.commonsdk.statistics.idtracking.Envelope
 *  com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a
 *  com.umeng.commonsdk.statistics.internal.d
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.commonsdk.statistics.a;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.d;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.StatTracer;

public class ImLatent
implements com.umeng.commonsdk.statistics.internal.d {
    private static ImLatent instanse;
    private final int LATENT_MAX = 1800000;
    private final int LATENT_WINDOW = 10;
    private final long _360HOURS_IN_MS = 1296000000L;
    private final long _36HOURS_IN_MS = 129600000L;
    private final int _DEFAULT_HOURS = 360;
    private final int _DEFAULT_MAX_LATENT = 1800;
    private final int _DEFAULT_MIN_HOURS = 36;
    private final int _DEFAULT_MIN_LATENT = 1;
    private final long _ONE_HOURS_IN_MS = 3600000L;
    private Context context;
    private long latentHour = 1296000000L;
    private int latentWindow = 10;
    private long mDelay = 0L;
    private long mElapsed = 0L;
    private boolean mLatentActivite = false;
    private Object mLatentLock = new Object();
    private StatTracer statTracer;
    private d storeHelper;

    private ImLatent(Context context, StatTracer statTracer) {
        this.context = context;
        this.storeHelper = d.a((Context)context);
        this.statTracer = statTracer;
    }

    public static ImLatent getService(Context context, StatTracer statTracer) {
        Class<ImLatent> class_ = ImLatent.class;
        synchronized (ImLatent.class) {
            if (instanse == null) {
                ImLatent imLatent;
                instanse = imLatent = new ImLatent(context, statTracer);
                imLatent.onImprintChanged(ImprintHandler.getImprintService(context).c());
            }
            ImLatent imLatent = instanse;
            // ** MonitorExit[var5_2] (shouldn't be in output)
            return imLatent;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long getDelayTime() {
        Object object;
        Object object2 = object = this.mLatentLock;
        synchronized (object2) {
            return this.mDelay;
        }
    }

    public long getElapsedTime() {
        return this.mElapsed;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isLatentActivite() {
        Object object;
        Object object2 = object = this.mLatentLock;
        synchronized (object2) {
            return this.mLatentActivite;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void latentDeactivite() {
        Object object;
        Object object2 = object = this.mLatentLock;
        synchronized (object2) {
            this.mLatentActivite = false;
            return;
        }
    }

    public void onImprintChanged(ImprintHandler.a a3) {
        int n2 = 360;
        int n3 = Integer.valueOf((String)a3.a("latent_hours", String.valueOf((int)n2)));
        if (n3 > 36) {
            n2 = n3;
        }
        this.latentHour = 3600000L * (long)n2;
        int n4 = Integer.valueOf((String)a3.a("latent", "0"));
        if (n4 < 1 || n4 > 1800) {
            n4 = 0;
        }
        if (n4 == 0) {
            int n5 = a.c;
            if (n5 > 0 && n5 <= 1800000) {
                this.latentWindow = n5;
                return;
            }
            this.latentWindow = 10;
            return;
        }
        this.latentWindow = n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean shouldStartLatency() {
        Object object;
        if (this.storeHelper.c()) {
            return false;
        }
        if (this.statTracer.isFirstRequest()) {
            return false;
        }
        Object object2 = object = this.mLatentLock;
        synchronized (object2) {
            if (this.mLatentActivite) {
                return false;
            }
        }
        long l2 = this.statTracer.getLastReqTime();
        long l3 = System.currentTimeMillis() - l2;
        if (l3 > this.latentHour) {
            Object object3;
            String string = Envelope.getSignature((Context)this.context);
            Object object4 = object3 = this.mLatentLock;
            synchronized (object4) {
                this.mDelay = DataHelper.random((int)this.latentWindow, (String)string);
                this.mElapsed = l3;
                this.mLatentActivite = true;
                return true;
            }
        }
        if (l3 > 129600000L) {
            Object object5;
            Object object6 = object5 = this.mLatentLock;
            synchronized (object6) {
                this.mDelay = 0L;
                this.mElapsed = l3;
                this.mLatentActivite = true;
                return true;
            }
        }
        return false;
    }
}


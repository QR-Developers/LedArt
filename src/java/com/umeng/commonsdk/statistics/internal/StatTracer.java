/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  com.umeng.commonsdk.statistics.common.MLog
 *  com.umeng.commonsdk.statistics.internal.PreferenceWrapper
 *  com.umeng.commonsdk.statistics.internal.StatTracer$1
 *  com.umeng.commonsdk.statistics.internal.StatTracer$a
 *  com.umeng.commonsdk.statistics.internal.b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.internal.b;

public class StatTracer
implements b {
    private static final String KEY_CLIENT_REQUEST_FAILED = "failed_requests ";
    private static final String KEY_CLIENT_REQUEST_LATENCY = "last_request_spent_ms";
    private static final String KEY_CLIENT_REQUEST_SUCCESS = "successful_request";
    private static final String KEY_CLIENT_REQUEST_TIME = "last_request_time";
    private static final String KEY_FIRST_ACTIVATE_TIME = "first_activate_time";
    private static final String KEY_LAST_REQ = "last_req";
    private static Context mContext;
    private final int MAX_REQUEST_LIMIT = 3600000;
    private long firstActivateTime = 0L;
    private long lastRequestTime = 0L;
    public int mFailedRequest;
    private int mLastRequestLatency;
    public long mLastSuccessfulRequestTime;
    public int mSuccessfulRequest;

    private StatTracer() {
        this.init();
    }

    public static StatTracer getInstance(Context context) {
        if (mContext == null) {
            if (context != null) {
                mContext = context.getApplicationContext();
            } else {
                MLog.e((String)"inside StatTracer. please check context. context must not be null!");
            }
        }
        return a.a;
    }

    private void init() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault((Context)mContext);
        this.mSuccessfulRequest = sharedPreferences.getInt(KEY_CLIENT_REQUEST_SUCCESS, 0);
        this.mFailedRequest = sharedPreferences.getInt(KEY_CLIENT_REQUEST_FAILED, 0);
        this.mLastRequestLatency = sharedPreferences.getInt(KEY_CLIENT_REQUEST_LATENCY, 0);
        this.mLastSuccessfulRequestTime = sharedPreferences.getLong(KEY_CLIENT_REQUEST_TIME, 0L);
        this.lastRequestTime = sharedPreferences.getLong(KEY_LAST_REQ, 0L);
    }

    public long getFirstActivateTime() {
        long l2;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault((Context)mContext);
        this.firstActivateTime = l2 = PreferenceWrapper.getDefault((Context)mContext).getLong(KEY_FIRST_ACTIVATE_TIME, 0L);
        if (l2 == 0L) {
            this.firstActivateTime = System.currentTimeMillis();
            sharedPreferences.edit().putLong(KEY_FIRST_ACTIVATE_TIME, this.firstActivateTime).commit();
        }
        return this.firstActivateTime;
    }

    public long getLastReqTime() {
        return this.lastRequestTime;
    }

    public int getLastRequestLatency() {
        int n2 = this.mLastRequestLatency;
        if (n2 > 3600000) {
            n2 = 3600000;
        }
        return n2;
    }

    public boolean isFirstRequest() {
        return this.mLastSuccessfulRequestTime == 0L;
    }

    public void logFailedRequest() {
        this.mFailedRequest = 1 + this.mFailedRequest;
    }

    public void logRequestEnd() {
        this.mLastRequestLatency = (int)(System.currentTimeMillis() - this.lastRequestTime);
    }

    public void logRequestStart() {
        this.lastRequestTime = System.currentTimeMillis();
    }

    public void logSuccessfulRequest(boolean bl2) {
        this.mSuccessfulRequest = 1 + this.mSuccessfulRequest;
        if (bl2) {
            this.mLastSuccessfulRequestTime = this.lastRequestTime;
        }
    }

    public void onRequestEnd() {
        this.logRequestEnd();
    }

    public void onRequestFailed() {
        this.logFailedRequest();
    }

    public void onRequestStart() {
        this.logRequestStart();
    }

    public void onRequestSucceed(boolean bl2) {
        this.logSuccessfulRequest(bl2);
    }

    public void saveSate() {
        PreferenceWrapper.getDefault((Context)mContext).edit().putInt(KEY_CLIENT_REQUEST_SUCCESS, this.mSuccessfulRequest).putInt(KEY_CLIENT_REQUEST_FAILED, this.mFailedRequest).putInt(KEY_CLIENT_REQUEST_LATENCY, this.mLastRequestLatency).putLong(KEY_LAST_REQ, this.lastRequestTime).putLong(KEY_CLIENT_REQUEST_TIME, this.mLastSuccessfulRequestTime).commit();
    }
}


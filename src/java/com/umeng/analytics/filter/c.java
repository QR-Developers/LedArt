/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
 *  com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
 *  java.lang.Object
 *  java.lang.String
 */
package com.umeng.analytics.filter;

import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;

public class c
implements UMImprintChangeCallback,
UMImprintPreProcessCallback {
    public void onImprintValueChanged(String string, String string2) {
    }

    public boolean onPreProcessImprintKey(String string, String string2) {
        return false;
    }
}


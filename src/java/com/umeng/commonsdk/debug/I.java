/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  com.umeng.commonsdk.debug.UInterface
 *  java.lang.Object
 *  java.lang.String
 */
package com.umeng.commonsdk.debug;

import android.util.Log;
import com.umeng.commonsdk.debug.UInterface;

public class I
implements UInterface {
    public void log(String string, String string2) {
        Log.i((String)string, (String)string2);
    }
}


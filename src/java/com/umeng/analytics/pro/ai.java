/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.umeng.analytics.pro.z
 *  com.umeng.commonsdk.debug.UMLog
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  u8.a
 */
package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.analytics.pro.z;
import com.umeng.commonsdk.debug.UMLog;
import u8.a;

class ai
implements z {
    ai() {
    }

    public String a(Context context) {
        block3 : {
            try {
                if (a.b()) break block3;
                UMLog.mutlInfo((int)2, (String[])new String[]{"\u5f53\u524d\u8bbe\u5907\u4e0d\u652f\u6301\u83b7\u53d6OAID"});
                return null;
            }
            catch (Exception exception) {
                UMLog.mutlInfo((int)2, (String[])new String[]{"\u672a\u68c0\u6d4b\u5230\u60a8\u96c6\u6210OAID SDK\u5305"});
                return null;
            }
        }
        String string = a.c((Context)context);
        return string;
    }
}


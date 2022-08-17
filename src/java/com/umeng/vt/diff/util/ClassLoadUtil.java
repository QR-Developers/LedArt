/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.umeng.vt.diff.util;

import android.text.TextUtils;

public class ClassLoadUtil {
    public static Class<?> findClass(String string2) {
        try {
            if (TextUtils.isEmpty((CharSequence)string2)) {
            }
            Class class_ = Class.forName((String)string2);
            return class_;
        }
        finally {
            return null;
        }
    }
}


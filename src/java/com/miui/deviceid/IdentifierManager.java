/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package com.miui.deviceid;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

public class IdentifierManager {
    private static final String TAG = "IdentifierManager";
    private static Class<?> sClass;
    private static Method sGetAAID;
    private static Method sGetOAID;
    private static Method sGetUDID;
    private static Method sGetVAID;
    private static Object sIdProivderImpl;

    static {
        try {
            Class class_;
            sClass = class_ = Class.forName((String)"com.android.id.impl.IdProviderImpl");
            sIdProivderImpl = class_.newInstance();
            sGetUDID = sClass.getMethod("getUDID", new Class[]{Context.class});
            sGetOAID = sClass.getMethod("getOAID", new Class[]{Context.class});
            sGetVAID = sClass.getMethod("getVAID", new Class[]{Context.class});
            sGetAAID = sClass.getMethod("getAAID", new Class[]{Context.class});
        }
        catch (Exception exception) {
            Log.e((String)TAG, (String)"reflect exception!", (Throwable)exception);
        }
    }

    public static String getAAID(Context context) {
        return IdentifierManager.invokeMethod(context, sGetAAID);
    }

    public static String getOAID(Context context) {
        return IdentifierManager.invokeMethod(context, sGetOAID);
    }

    public static String getUDID(Context context) {
        return IdentifierManager.invokeMethod(context, sGetUDID);
    }

    public static String getVAID(Context context) {
        return IdentifierManager.invokeMethod(context, sGetVAID);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String invokeMethod(Context context, Method method) {
        Object object = sIdProivderImpl;
        if (object == null) return null;
        if (method == null) return null;
        Object object2 = method.invoke(object, new Object[]{context});
        if (object2 == null) return null;
        try {
            return (String)object2;
        }
        catch (Exception exception) {
            Log.e((String)TAG, (String)"invoke exception!", (Throwable)exception);
        }
        return null;
    }

    public static boolean isSupported() {
        return sClass != null && sIdProivderImpl != null;
    }
}


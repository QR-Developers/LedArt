/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package com.vivo.identifier;

import android.content.Context;
import com.vivo.identifier.IdentifierIdClient;

public class IdentifierManager {
    public static String getAAID(Context context, String string2) {
        return IdentifierIdClient.getInstance(context).getAAID(string2);
    }

    public static String getOAID(Context context) {
        return IdentifierIdClient.getInstance(context).getOAID();
    }

    public static String getOAIDStatus(Context context) {
        return IdentifierIdClient.getInstance(context).getOAIDSTATUS();
    }

    public static String getVAID(Context context, String string2) {
        return IdentifierIdClient.getInstance(context).getVAID(string2);
    }

    public static boolean isSupported(Context context) {
        return IdentifierIdClient.getInstance(context).isSupported();
    }
}


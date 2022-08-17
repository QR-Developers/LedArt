/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a4.a$a
 *  a4.b
 *  a4.c
 *  a4.g
 *  android.content.Context
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.core.content.ContextCompat
 *  java.lang.Object
 *  java.lang.String
 */
package a4;

import a4.a;
import a4.b;
import a4.c;
import a4.g;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class d
implements b {
    @NonNull
    public a a(@NonNull Context context, @NonNull a.a a2) {
        boolean bl = ContextCompat.checkSelfPermission((Context)context, (String)"android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable((String)"ConnectivityMonitor", (int)3)) {
            String string = bl ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            Log.d((String)"ConnectivityMonitor", (String)string);
        }
        if (bl) {
            return new c(context, a2);
        }
        return new g();
    }
}


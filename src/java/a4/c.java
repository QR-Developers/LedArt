/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a4.a$a
 *  a4.c$a
 *  android.annotation.SuppressLint
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  h4.i
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.Throwable
 */
package a4;

import a4.a;
import a4.c;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import h4.i;

final class c
implements a4.a {
    private final Context a;
    final a.a b;
    boolean c;
    private boolean d;
    private final BroadcastReceiver e = new a(this);

    c(@NonNull Context context, @NonNull a.a a2) {
        this.a = context.getApplicationContext();
        this.b = a2;
    }

    private void f() {
        if (this.d) {
            return;
        }
        this.c = this.b(this.a);
        try {
            this.a.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
            return;
        }
        catch (SecurityException securityException) {
            if (Log.isLoggable((String)"ConnectivityMonitor", (int)5)) {
                Log.w((String)"ConnectivityMonitor", (String)"Failed to register", (Throwable)securityException);
            }
            return;
        }
    }

    private void l() {
        if (!this.d) {
            return;
        }
        this.a.unregisterReceiver(this.e);
        this.d = false;
    }

    @SuppressLint(value={"MissingPermission"})
    boolean b(@NonNull Context context) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager)i.d((Object)((ConnectivityManager)context.getSystemService("connectivity")));
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        catch (RuntimeException runtimeException) {
            if (Log.isLoggable((String)"ConnectivityMonitor", (int)5)) {
                Log.w((String)"ConnectivityMonitor", (String)"Failed to determine connectivity status when connectivity changed", (Throwable)runtimeException);
            }
            return true;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public void k() {
    }

    public void onStart() {
        this.f();
    }

    public void onStop() {
        this.l();
    }
}


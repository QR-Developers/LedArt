/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  g4.d
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.UUID
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 *  k3.c
 */
package g4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g4.d;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import k3.c;

public final class b {
    private static final ConcurrentMap<String, c> a = new ConcurrentHashMap();

    @Nullable
    private static PackageInfo a(@NonNull Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot resolve info for");
            stringBuilder.append(context.getPackageName());
            Log.e((String)"AppVersionSignature", (String)stringBuilder.toString(), (Throwable)nameNotFoundException);
            return null;
        }
    }

    @NonNull
    private static String b(@Nullable PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf((int)packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    @NonNull
    public static c c(@NonNull Context context) {
        ConcurrentMap<String, c> concurrentMap = a;
        String string = context.getPackageName();
        c c2 = (c)concurrentMap.get((Object)string);
        if (c2 == null) {
            c c3 = b.d(context);
            c c4 = (c)concurrentMap.putIfAbsent((Object)string, (Object)c3);
            if (c4 == null) {
                return c3;
            }
            c2 = c4;
        }
        return c2;
    }

    @NonNull
    private static c d(@NonNull Context context) {
        return new d((Object)b.b(b.a(context)));
    }
}


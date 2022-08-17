/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.InstantiationException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Set
 */
package b4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import b4.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Deprecated
public final class d {
    private final Context a;

    public d(Context context) {
        this.a = context;
    }

    private static b b(String string) {
        Class class_;
        Object object;
        try {
            class_ = Class.forName((String)string);
            object = null;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", (Throwable)classNotFoundException);
        }
        try {
            object = class_.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (InvocationTargetException invocationTargetException) {
            d.c(class_, (Exception)((Object)invocationTargetException));
            object = null;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            d.c(class_, (Exception)((Object)noSuchMethodException));
            object = null;
        }
        catch (IllegalAccessException illegalAccessException) {
            d.c(class_, (Exception)((Object)illegalAccessException));
            object = null;
        }
        catch (InstantiationException instantiationException) {
            d.c(class_, (Exception)((Object)instantiationException));
        }
        if (object instanceof b) {
            return (b)object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected instanceof GlideModule, but found: ");
        stringBuilder.append(object);
        throw new RuntimeException(stringBuilder.toString());
    }

    private static void c(Class<?> class_, Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to instantiate GlideModule implementation for ");
        stringBuilder.append(class_);
        throw new RuntimeException(stringBuilder.toString(), (Throwable)exception);
    }

    public List<b> a() {
        ApplicationInfo applicationInfo;
        ArrayList arrayList;
        block8 : {
            if (Log.isLoggable((String)"ManifestParser", (int)3)) {
                Log.d((String)"ManifestParser", (String)"Loading Glide modules");
            }
            arrayList = new ArrayList();
            applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
            if (applicationInfo.metaData != null) break block8;
            if (Log.isLoggable((String)"ManifestParser", (int)3)) {
                Log.d((String)"ManifestParser", (String)"Got null app info metadata");
                return arrayList;
            }
        }
        try {
            if (Log.isLoggable((String)"ManifestParser", (int)2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got app info metadata: ");
                stringBuilder.append((Object)applicationInfo.metaData);
                Log.v((String)"ManifestParser", (String)stringBuilder.toString());
            }
            for (String string : applicationInfo.metaData.keySet()) {
                if (!"GlideModule".equals(applicationInfo.metaData.get(string))) continue;
                arrayList.add((Object)d.b(string));
                if (!Log.isLoggable((String)"ManifestParser", (int)3)) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Loaded Glide module: ");
                stringBuilder.append(string);
                Log.d((String)"ManifestParser", (String)stringBuilder.toString());
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            RuntimeException runtimeException = new RuntimeException("Unable to find metadata to parse GlideModules", (Throwable)nameNotFoundException);
            throw runtimeException;
        }
        if (Log.isLoggable((String)"ManifestParser", (int)3)) {
            Log.d((String)"ManifestParser", (String)"Finished loading Glide modules");
        }
        return arrayList;
        return arrayList;
    }
}


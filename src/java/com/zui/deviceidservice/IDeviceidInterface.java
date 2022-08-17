/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IDeviceidInterface
extends IInterface {
    public boolean createAAIDForPackageName(String var1);

    public String getAAID(String var1);

    public String getOAID();

    public String getUDID();

    public String getVAID(String var1);

    public boolean isSupport();

}


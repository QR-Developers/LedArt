/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.a.a.a$a
 *  a.a.a.a$a$a
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
package a.a.a.a;

import a.a.a.a;
import a.a.a.a.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class c {
    public a.a.a.a a = null;
    public String b = null;
    public String c = null;
    public final Object d = new Object();
    public ServiceConnection e = new b(this);

    public /* synthetic */ c(b b2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(Context context, String string2) {
        c c2 = this;
        synchronized (c2) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            }
            if (this.a == null) {
                block16 : {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                    intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                    if (context.bindService(intent, this.e, 1)) {
                        Object object;
                        Object object2 = object = this.d;
                        synchronized (object2) {
                            try {
                                try {
                                    this.d.wait(3000L);
                                }
                                catch (InterruptedException interruptedException) {
                                    interruptedException.printStackTrace();
                                }
                                break block16;
                            }
                            catch (Throwable throwable2) {}
                            throw throwable2;
                        }
                    }
                }
                if (this.a == null) {
                    return "";
                }
                try {
                    return this.b(context, string2);
                }
                catch (RemoteException remoteException) {
                    remoteException.printStackTrace();
                    return "";
                }
            }
            try {
                return this.b(context, string2);
            }
            catch (RemoteException remoteException) {
                remoteException.printStackTrace();
                return "";
            }
        }
    }

    public boolean a(Context context) {
        block7 : {
            boolean bl;
            block8 : {
                PackageInfo packageInfo;
                block6 : {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        packageInfo = packageManager.getPackageInfo("com.heytap.openid", 0);
                        if (Build.VERSION.SDK_INT < 28) break block6;
                        if (packageInfo == null) break block7;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        nameNotFoundException.printStackTrace();
                        return false;
                    }
                    if (packageInfo.getLongVersionCode() >= 1L) {
                        return true;
                    }
                }
                bl = false;
                if (packageInfo != null) {
                    int n2 = packageInfo.versionCode;
                    bl = false;
                    if (n2 < 1) break block8;
                    bl = true;
                }
            }
            return bl;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String b(Context context, String string2) {
        String string3;
        String string4;
        a.a.a.a a2;
        String string5;
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            this.b = context.getPackageName();
        }
        if (TextUtils.isEmpty((CharSequence)this.c)) {
            Signature[] arrsignature;
            String string6 = this.b;
            try {
                arrsignature = context.getPackageManager().getPackageInfo((String)string6, (int)64).signatures;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                nameNotFoundException.printStackTrace();
                arrsignature = null;
            }
            String string7 = null;
            if (arrsignature != null) {
                int n2 = arrsignature.length;
                string7 = null;
                if (n2 > 0) {
                    byte[] arrby = arrsignature[0].toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance((String)"SHA1");
                        string7 = null;
                        if (messageDigest != null) {
                            byte[] arrby2 = messageDigest.digest(arrby);
                            StringBuilder stringBuilder = new StringBuilder();
                            int n3 = arrby2.length;
                            for (int i2 = 0; i2 < n3; ++i2) {
                                stringBuilder.append(Integer.toHexString((int)(256 | 255 & arrby2[i2])).substring(1, 3));
                            }
                            string7 = stringBuilder.toString();
                        }
                    }
                    catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                        noSuchAlgorithmException.printStackTrace();
                    }
                }
            }
            this.c = string7;
        }
        if (!TextUtils.isEmpty((CharSequence)(string5 = ((a.a)(a2 = this.a)).a(string4 = this.b, string3 = this.c, string2)))) return string5;
        return "";
    }

    private static class a {
        public static final c a = new c(null);
    }

}


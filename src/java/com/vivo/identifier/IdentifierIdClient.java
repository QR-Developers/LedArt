/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package com.vivo.identifier;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.vivo.identifier.DataBaseOperation;
import com.vivo.identifier.IdentifierIdObserver;
import java.lang.reflect.Method;

public class IdentifierIdClient {
    private static IdentifierIdObserver AAIDObserver;
    private static final String AAID_FLAG = "AAID";
    private static final String ID_APPID = "appid";
    private static final String ID_TYPE = "type";
    private static IdentifierIdObserver OAIDObserver;
    private static final String OAID_FLAG = "OAID";
    private static final String SYS_IDENTIFIERID_SUPPORTED = "persist.sys.identifierid.supported";
    private static final String TAG = "VMS_IDLG_SDK_Client";
    private static final int TIME_FOR_QUERY = 2000;
    private static final int TYPE_AAID = 2;
    private static final int TYPE_OAID = 0;
    private static final int TYPE_OAIDSTATUS = 4;
    private static final int TYPE_QUERY = 11;
    private static final int TYPE_VAID = 1;
    private static final String URI_BASE = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static IdentifierIdObserver VAIDObserver;
    private static final String VAID_FLAG = "VAID";
    private static String aaid;
    private static boolean isSupported;
    private static Context mContext;
    private static volatile DataBaseOperation mDatabase;
    private static volatile IdentifierIdClient mInstance;
    private static Object mLock;
    private static Handler mSqlHandler;
    private static HandlerThread mSqlThread;
    private static String oaid;
    private static String oaidstatus;
    private static String queryResult;
    private static String vaid;

    static {
        mLock = new Object();
    }

    private IdentifierIdClient() {
    }

    public static void checkSupported() {
        isSupported = "1".equals((Object)IdentifierIdClient.getProperty(SYS_IDENTIFIERID_SUPPORTED, "0"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static IdentifierIdClient getInstance(Context context) {
        Class<IdentifierIdClient> class_;
        if (mInstance == null) {
            class_ = IdentifierIdClient.class;
            // MONITORENTER : com.vivo.identifier.IdentifierIdClient.class
            mContext = context.getApplicationContext();
            mInstance = new IdentifierIdClient();
            // MONITOREXIT : class_
        }
        if (mDatabase != null) return mInstance;
        class_ = IdentifierIdClient.class;
        // MONITORENTER : com.vivo.identifier.IdentifierIdClient.class
        mContext = context.getApplicationContext();
        IdentifierIdClient.initSqlThread();
        mDatabase = new DataBaseOperation(mContext);
        IdentifierIdClient.checkSupported();
        // MONITOREXIT : class_
        return mInstance;
    }

    public static String getProperty(String string2, String string3) {
        try {
            Class class_ = Class.forName((String)"android.os.SystemProperties");
            String string4 = (String)class_.getMethod("get", new Class[]{String.class, String.class}).invoke((Object)class_, new Object[]{string2, "unknown"});
            return string4;
        }
        catch (Exception exception) {
            try {
                exception.printStackTrace();
            }
            catch (Throwable throwable) {}
        }
        return string3;
    }

    private static void initObserver(Context context, int n2, String string2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return;
                }
                AAIDObserver = new IdentifierIdObserver(mInstance, 2, string2);
                ContentResolver contentResolver = context.getContentResolver();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("content://com.vivo.vms.IdProvider/IdentifierId/AAID_");
                stringBuilder.append(string2);
                contentResolver.registerContentObserver(Uri.parse((String)stringBuilder.toString()), false, (ContentObserver)AAIDObserver);
                return;
            }
            VAIDObserver = new IdentifierIdObserver(mInstance, 1, string2);
            ContentResolver contentResolver = context.getContentResolver();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("content://com.vivo.vms.IdProvider/IdentifierId/VAID_");
            stringBuilder.append(string2);
            contentResolver.registerContentObserver(Uri.parse((String)stringBuilder.toString()), false, (ContentObserver)VAIDObserver);
            return;
        }
        OAIDObserver = new IdentifierIdObserver(mInstance, 0, null);
        context.getContentResolver().registerContentObserver(Uri.parse((String)"content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, (ContentObserver)OAIDObserver);
    }

    private static void initSqlThread() {
        HandlerThread handlerThread;
        mSqlThread = handlerThread = new HandlerThread("SqlWorkThread");
        handlerThread.start();
        mSqlHandler = new Handler(mSqlThread.getLooper()){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void handleMessage(Message message) {
                if (message.what == 11) {
                    Object object;
                    int n2 = message.getData().getInt(IdentifierIdClient.ID_TYPE);
                    String string2 = message.getData().getString(IdentifierIdClient.ID_APPID);
                    queryResult = mDatabase.query(n2, string2);
                    Object object2 = object = mLock;
                    synchronized (object2) {
                        mLock.notify();
                        return;
                    }
                }
                Log.e((String)IdentifierIdClient.TAG, (String)"message type valid");
            }
        };
    }

    private void sendMessageToDataBase(int n2, String string2) {
        Message message = mSqlHandler.obtainMessage();
        message.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt(ID_TYPE, n2);
        if (n2 == 1 || n2 == 2) {
            bundle.putString(ID_APPID, string2);
        }
        message.setData(bundle);
        mSqlHandler.sendMessage(message);
    }

    public String getAAID(String string2) {
        if (!this.isSupported()) {
            return null;
        }
        String string3 = aaid;
        if (string3 != null) {
            return string3;
        }
        this.queryId(2, string2);
        if (AAIDObserver == null && aaid != null) {
            IdentifierIdClient.initObserver(mContext, 2, string2);
        }
        return aaid;
    }

    public String getOAID() {
        if (!this.isSupported()) {
            return null;
        }
        String string2 = oaid;
        if (string2 != null) {
            return string2;
        }
        this.queryId(0, null);
        if (OAIDObserver == null) {
            IdentifierIdClient.initObserver(mContext, 0, null);
        }
        return oaid;
    }

    public String getOAIDSTATUS() {
        if (!this.isSupported()) {
            return null;
        }
        this.queryId(4, null);
        return oaidstatus;
    }

    public String getVAID(String string2) {
        if (!this.isSupported()) {
            return null;
        }
        String string3 = vaid;
        if (string3 != null) {
            return string3;
        }
        this.queryId(1, string2);
        if (VAIDObserver == null && vaid != null) {
            IdentifierIdClient.initObserver(mContext, 1, string2);
        }
        return vaid;
    }

    public boolean isSupported() {
        return isSupported;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void queryId(int n2, String string2) {
        Object object;
        Object object2 = object = mLock;
        synchronized (object2) {
            block13 : {
                block8 : {
                    block9 : {
                        block10 : {
                            block12 : {
                                block11 : {
                                    this.sendMessageToDataBase(n2, string2);
                                    long l2 = SystemClock.uptimeMillis();
                                    try {
                                        mLock.wait(2000L);
                                    }
                                    catch (InterruptedException interruptedException) {
                                        interruptedException.printStackTrace();
                                    }
                                    if (SystemClock.uptimeMillis() - l2 >= 2000L) break block8;
                                    if (n2 == 0) break block9;
                                    if (n2 == 1) break block10;
                                    if (n2 == 2) break block11;
                                    if (n2 == 4) break block12;
                                    break block13;
                                }
                                String string3 = queryResult;
                                if (string3 != null) {
                                    aaid = string3;
                                    queryResult = null;
                                } else {
                                    Log.e((String)TAG, (String)"get aaid failed");
                                }
                            }
                            oaidstatus = queryResult;
                            queryResult = null;
                            break block13;
                        }
                        String string4 = queryResult;
                        if (string4 != null) {
                            vaid = string4;
                            queryResult = null;
                        } else {
                            Log.e((String)TAG, (String)"get vaid failed");
                        }
                        break block13;
                    }
                    oaid = queryResult;
                    queryResult = null;
                    break block13;
                }
                Log.d((String)TAG, (String)"query timeout");
            }
            return;
        }
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 *  android.util.Log
 *  java.lang.String
 */
package com.vivo.identifier;

import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import com.vivo.identifier.IdentifierIdClient;

public class IdentifierIdObserver
extends ContentObserver {
    private static final String TAG = "VMS_IDLG_SDK_Observer";
    private String mAppId;
    private IdentifierIdClient mIdentifierIdClient;
    private int mType;

    public IdentifierIdObserver(IdentifierIdClient identifierIdClient, int n2, String string2) {
        super(null);
        this.mIdentifierIdClient = identifierIdClient;
        this.mType = n2;
        this.mAppId = string2;
    }

    public void onChange(boolean bl) {
        IdentifierIdClient identifierIdClient = this.mIdentifierIdClient;
        if (identifierIdClient != null) {
            identifierIdClient.queryId(this.mType, this.mAppId);
            return;
        }
        Log.e((String)TAG, (String)"mIdentifierIdClient is null");
    }
}


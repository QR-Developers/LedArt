/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.vivo.identifier;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class DataBaseOperation {
    private static final String AAID_FLAG = "AAID";
    private static final String ID_VALUE = "value";
    private static final String OAIDSTATUS_FLAG = "OAIDSTATUS";
    private static final String OAID_FLAG = "OAID";
    private static final String TAG = "VMS_IDLG_SDK_DB";
    private static final int TYPE_AAID = 2;
    private static final int TYPE_OAID = 0;
    private static final int TYPE_OAIDSTATUS = 4;
    private static final int TYPE_VAID = 1;
    private static final String URI_BASE = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String VAID_FLAG = "VAID";
    private Context mContext;

    public DataBaseOperation(Context context) {
        this.mContext = context;
    }

    public String query(int n2, String string2) {
        Uri uri;
        block6 : {
            Uri uri2;
            block7 : {
                block2 : {
                    block3 : {
                        block4 : {
                            block5 : {
                                if (n2 == 0) break block2;
                                if (n2 == 1) break block3;
                                if (n2 == 2) break block4;
                                if (n2 == 4) break block5;
                                uri = null;
                                break block6;
                            }
                            uri2 = Uri.parse((String)"content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                            break block7;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("content://com.vivo.vms.IdProvider/IdentifierId/AAID_");
                        stringBuilder.append(string2);
                        uri2 = Uri.parse((String)stringBuilder.toString());
                        break block7;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("content://com.vivo.vms.IdProvider/IdentifierId/VAID_");
                    stringBuilder.append(string2);
                    uri2 = Uri.parse((String)stringBuilder.toString());
                    break block7;
                }
                uri2 = Uri.parse((String)"content://com.vivo.vms.IdProvider/IdentifierId/OAID");
            }
            uri = uri2;
        }
        Cursor cursor = this.mContext.getContentResolver().query(uri, null, null, null, null);
        if (cursor != null) {
            boolean bl = cursor.moveToNext();
            String string3 = null;
            if (bl) {
                string3 = cursor.getString(cursor.getColumnIndex(ID_VALUE));
            }
            cursor.close();
            return string3;
        }
        Log.d((String)TAG, (String)"return cursor is null,return");
        return null;
    }
}


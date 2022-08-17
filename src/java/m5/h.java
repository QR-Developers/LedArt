/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.provider.MediaStore
 *  android.provider.MediaStore$Images
 *  android.provider.MediaStore$Images$Media
 *  android.provider.MediaStore$Video
 *  android.provider.MediaStore$Video$Media
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package m5;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class h {
    public static List<String> a(Context context) {
        ArrayList arrayList = new ArrayList();
        String[] arrstring = new String[]{"_id", "_data"};
        Cursor cursor = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, arrstring, null, null, "_id DESC");
        if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
            int n5 = cursor.getColumnIndex("_data");
            do {
                File file;
                String string2;
                if (!(file = new File(string2 = cursor.getString(n5))).exists() || file.length() == 0L) continue;
                arrayList.add((Object)string2);
            } while (cursor.moveToNext());
        }
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        return arrayList;
    }

    public static List<String> b(Context context) {
        ArrayList arrayList = new ArrayList();
        String[] arrstring = new String[]{"_id", "_data"};
        Cursor cursor = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, arrstring, null, null, "_id DESC");
        if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
            int n5 = cursor.getColumnIndex("_data");
            do {
                String string2;
                if (!new File(string2 = cursor.getString(n5)).exists()) continue;
                arrayList.add((Object)string2);
            } while (cursor.moveToNext());
        }
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        return arrayList;
    }
}


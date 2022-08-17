/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  i6.a
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.Throwable
 *  q6.c
 */
package f6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import i6.a;

public class c
extends SQLiteOpenHelper {
    public c() {
        super(a.g(), "okhttputils_server.db", null, 2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE download_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, taskKey VARCHAR, url VARCHAR, targetFolder VARCHAR, targetPath VARCHAR, fileName VARCHAR, progress REAL, totalLength INTEGER, downloadLength INTEGER, networkSpeed INTEGER, state INTEGER, downloadRequest BLOB)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX cache_unique_index ON download_table(\"taskKey\")");
                sQLiteDatabase.setTransactionSuccessful();
            }
            catch (Exception exception) {
                q6.c.e((Throwable)exception);
            }
        }
        catch (Throwable throwable2) {}
        sQLiteDatabase.endTransaction();
        return;
        sQLiteDatabase.endTransaction();
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void onUpgrade(SQLiteDatabase var1_1, int var2_2, int var3_3) {
        block5 : {
            block4 : {
                if (var3_3 == var2_2) return;
                var1_1.beginTransaction();
                if (var3_3 <= 2) ** GOTO lbl8
                try {
                    var1_1.execSQL("DROP INDEX cache_unique_index");
                    var1_1.execSQL("DROP TABLE download_table");
lbl8: // 2 sources:
                    var1_1.execSQL("CREATE TABLE download_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, taskKey VARCHAR, url VARCHAR, targetFolder VARCHAR, targetPath VARCHAR, fileName VARCHAR, progress REAL, totalLength INTEGER, downloadLength INTEGER, networkSpeed INTEGER, state INTEGER, downloadRequest BLOB)");
                    var1_1.execSQL("CREATE UNIQUE INDEX cache_unique_index ON download_table(\"taskKey\")");
                    var1_1.setTransactionSuccessful();
                    break block4;
                }
                catch (Throwable var5_4) {
                    break block5;
                }
                catch (Exception var4_5) {
                    q6.c.e((Throwable)var4_5);
                }
            }
            var1_1.endTransaction();
            return;
        }
        var1_1.endTransaction();
        throw var5_4;
    }
}


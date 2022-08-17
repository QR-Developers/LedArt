/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.database.Cursor
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MMSharedPreferences
implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";
    private final String[] columns = new String[]{"_id", "key", "type", "value"};
    private final ContentResolver cr;
    private REditor editor = null;
    private final HashMap<String, Object> values = new HashMap();

    public MMSharedPreferences(Context context) {
        this.cr = context.getContentResolver();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object getValue(String string2) {
        try {
            ContentResolver contentResolver = this.cr;
            Uri uri = a.a;
            String[] arrstring = this.columns;
            Cursor cursor = contentResolver.query(uri, arrstring, "key = ?", new String[]{string2}, null);
            if (cursor == null) {
                return null;
            }
            int n2 = cursor.getColumnIndex("type");
            int n3 = cursor.getColumnIndex("value");
            Object object = cursor.moveToFirst() ? com.tencent.mm.opensdk.channel.a.a.a(cursor.getInt(n2), cursor.getString(n3)) : null;
            cursor.close();
            return object;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getValue exception:");
            stringBuilder.append(exception.getMessage());
            Log.e(TAG, stringBuilder.toString());
            return null;
        }
    }

    public boolean contains(String string2) {
        return this.getValue(string2) != null;
    }

    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.cr);
        }
        return this.editor;
    }

    public Map<String, ?> getAll() {
        Cursor cursor;
        block4 : {
            cursor = this.cr.query(a.a, this.columns, null, null, null);
            if (cursor != null) break block4;
            return null;
        }
        try {
            int n2 = cursor.getColumnIndex("key");
            int n3 = cursor.getColumnIndex("type");
            int n4 = cursor.getColumnIndex("value");
            while (cursor.moveToNext()) {
                Object object = com.tencent.mm.opensdk.channel.a.a.a(cursor.getInt(n3), cursor.getString(n4));
                this.values.put((Object)cursor.getString(n2), object);
            }
            cursor.close();
            HashMap<String, Object> hashMap = this.values;
            return hashMap;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getAll exception:");
            stringBuilder.append(exception.getMessage());
            Log.e(TAG, stringBuilder.toString());
            return this.values;
        }
    }

    public boolean getBoolean(String string2, boolean bl) {
        Object object = this.getValue(string2);
        if (object != null && object instanceof Boolean) {
            bl = (Boolean)object;
        }
        return bl;
    }

    public float getFloat(String string2, float f) {
        Object object = this.getValue(string2);
        if (object != null && object instanceof Float) {
            f = ((Float)object).floatValue();
        }
        return f;
    }

    public int getInt(String string2, int n2) {
        Object object = this.getValue(string2);
        if (object != null && object instanceof Integer) {
            n2 = (Integer)object;
        }
        return n2;
    }

    public long getLong(String string2, long l) {
        Object object = this.getValue(string2);
        if (object != null && object instanceof Long) {
            l = (Long)object;
        }
        return l;
    }

    public String getString(String string2, String string3) {
        Object object = this.getValue(string2);
        if (object != null && object instanceof String) {
            string3 = (String)object;
        }
        return string3;
    }

    public Set<String> getStringSet(String string2, Set<String> set) {
        return null;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    private static class REditor
    implements SharedPreferences.Editor {
        private boolean clear = false;
        private ContentResolver cr;
        private Set<String> remove = new HashSet();
        private Map<String, Object> values = new HashMap();

        public REditor(ContentResolver contentResolver) {
            this.cr = contentResolver;
        }

        public void apply() {
        }

        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean commit() {
            var1_1 = new ContentValues();
            if (this.clear) {
                this.cr.delete(a.a, null, null);
                this.clear = false;
            }
            for (String var16_3 : this.remove) {
                this.cr.delete(a.a, "key = ?", new String[]{var16_3});
            }
            var3_4 = this.values.entrySet().iterator();
            while (var3_4.hasNext() != false) {
                block17 : {
                    var4_5 = (Map.Entry)var3_4.next();
                    var5_6 = var4_5.getValue();
                    if (var5_6 != null) break block17;
                    var9_8 = "unresolve failed, null value";
                    ** GOTO lbl38
                }
                if (var5_6 instanceof Integer) {
                    var10_9 = 1;
                } else if (var5_6 instanceof Long) {
                    var10_9 = 2;
                } else if (var5_6 instanceof String) {
                    var10_9 = 3;
                } else if (var5_6 instanceof Boolean) {
                    var10_9 = 4;
                } else if (var5_6 instanceof Float) {
                    var10_9 = 5;
                } else if (var5_6 instanceof Double) {
                    var10_9 = 6;
                } else {
                    var6_7 = new StringBuilder();
                    var6_7.append("unresolve failed, unknown type=");
                    var6_7.append(var5_6.getClass().toString());
                    var9_8 = var6_7.toString();
lbl38: // 2 sources:
                    Log.e("MicroMsg.SDK.PluginProvider.Resolver", var9_8);
                    var10_9 = 0;
                }
                if (var10_9 == 0) {
                    var11_10 = false;
                } else {
                    var1_1.put("type", Integer.valueOf((int)var10_9));
                    var1_1.put("value", var5_6.toString());
                    var11_10 = true;
                }
                if (!var11_10) continue;
                var12_11 = this.cr;
                var13_12 = a.a;
                var14_13 = new String[]{(String)var4_5.getKey()};
                var12_11.update(var13_12, var1_1, "key = ?", var14_13);
            }
            return true;
        }

        public SharedPreferences.Editor putBoolean(String string2, boolean bl) {
            this.values.put((Object)string2, (Object)bl);
            this.remove.remove((Object)string2);
            return this;
        }

        public SharedPreferences.Editor putFloat(String string2, float f) {
            this.values.put((Object)string2, (Object)Float.valueOf((float)f));
            this.remove.remove((Object)string2);
            return this;
        }

        public SharedPreferences.Editor putInt(String string2, int n2) {
            this.values.put((Object)string2, (Object)n2);
            this.remove.remove((Object)string2);
            return this;
        }

        public SharedPreferences.Editor putLong(String string2, long l) {
            this.values.put((Object)string2, (Object)l);
            this.remove.remove((Object)string2);
            return this;
        }

        public SharedPreferences.Editor putString(String string2, String string3) {
            this.values.put((Object)string2, (Object)string3);
            this.remove.remove((Object)string2);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String string2, Set<String> set) {
            return null;
        }

        public SharedPreferences.Editor remove(String string2) {
            this.remove.add((Object)string2);
            return this;
        }
    }

}


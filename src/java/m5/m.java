/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.LongSparseArray
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.util.SparseIntArray
 *  android.util.SparseLongArray
 *  androidx.collection.LongSparseArray
 *  androidx.collection.SimpleArrayMap
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.Map
 */
package m5;

import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

public final class m {
    public static boolean a(Object object) {
        if (object == null) {
            return true;
        }
        if (object instanceof CharSequence && object.toString().length() == 0) {
            return true;
        }
        if (object.getClass().isArray() && Array.getLength((Object)object) == 0) {
            return true;
        }
        if (object instanceof Collection && ((Collection)object).isEmpty()) {
            return true;
        }
        if (object instanceof Map && ((Map)object).isEmpty()) {
            return true;
        }
        if (object instanceof SimpleArrayMap && ((SimpleArrayMap)object).isEmpty()) {
            return true;
        }
        if (object instanceof SparseArray && ((SparseArray)object).size() == 0) {
            return true;
        }
        if (object instanceof SparseBooleanArray && ((SparseBooleanArray)object).size() == 0) {
            return true;
        }
        if (object instanceof SparseIntArray && ((SparseIntArray)object).size() == 0) {
            return true;
        }
        int n5 = Build.VERSION.SDK_INT;
        if (n5 >= 18 && object instanceof SparseLongArray && ((SparseLongArray)object).size() == 0) {
            return true;
        }
        if (object instanceof LongSparseArray && ((LongSparseArray)object).size() == 0) {
            return true;
        }
        return n5 >= 16 && object instanceof android.util.LongSparseArray && ((android.util.LongSparseArray)object).size() == 0;
    }
}


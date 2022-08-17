/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.List
 */
package m5;

import java.util.List;

public final class b {
    public static byte[] a(List<byte[]> list) {
        int n5 = 0;
        for (int i5 = 0; i5 < list.size(); ++i5) {
            n5 += ((byte[])list.get(i5)).length;
        }
        byte[] arrby = new byte[n5];
        int n6 = 0;
        for (int i6 = 0; i6 < list.size(); ++i6) {
            byte[] arrby2 = (byte[])list.get(i6);
            System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n6, (int)arrby2.length);
            n6 += arrby2.length;
        }
        return arrby;
    }
}


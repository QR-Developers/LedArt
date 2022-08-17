/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  l8.v
 *  u7.j
 */
package m8;

import l8.v;
import u7.j;

public final class c {
    public static final int a(int[] arrn, int n5, int n6, int n7) {
        j.f((Object)arrn, (String)"$this$binarySearch");
        int n8 = n7 - 1;
        while (n6 <= n8) {
            int n9 = n6 + n8 >>> 1;
            int n10 = arrn[n9];
            if (n10 < n5) {
                n6 = n9 + 1;
                continue;
            }
            if (n10 > n5) {
                n8 = n9 - 1;
                continue;
            }
            return n9;
        }
        return -1 + -n6;
    }

    public static final int b(v v2, int n5) {
        j.f((Object)v2, (String)"$this$segment");
        int n6 = c.a(v2.w(), n5 + 1, 0, v2.x().length);
        if (n6 >= 0) {
            return n6;
        }
        return ~n6;
    }
}


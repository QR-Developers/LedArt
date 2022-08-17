/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  u7.j
 */
package l8;

import l8.b;
import l8.h;
import u7.j;

public final class a {
    private static final byte[] a;

    static {
        h.a a3 = h.e;
        a = a3.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").e();
        a3.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").e();
    }

    public static final String a(byte[] arrby, byte[] arrby2) {
        j.f((Object)arrby, (String)"$this$encodeBase64");
        j.f((Object)arrby2, (String)"map");
        byte[] arrby3 = new byte[4 * ((2 + arrby.length) / 3)];
        int n5 = arrby.length - arrby.length % 3;
        int n6 = 0;
        int n7 = 0;
        while (n6 < n5) {
            int n8 = n6 + 1;
            byte by = arrby[n6];
            int n9 = n8 + 1;
            byte by2 = arrby[n8];
            int n10 = n9 + 1;
            byte by3 = arrby[n9];
            int n11 = n7 + 1;
            arrby3[n7] = arrby2[(by & 255) >> 2];
            int n12 = n11 + 1;
            arrby3[n11] = arrby2[(by & 3) << 4 | (by2 & 255) >> 4];
            int n13 = n12 + 1;
            arrby3[n12] = arrby2[(by2 & 15) << 2 | (by3 & 255) >> 6];
            n7 = n13 + 1;
            arrby3[n13] = arrby2[by3 & 63];
            n6 = n10;
        }
        int n14 = arrby.length - n5;
        if (n14 != 1) {
            if (n14 == 2) {
                int n15 = n6 + 1;
                byte by = arrby[n6];
                byte by4 = arrby[n15];
                int n16 = n7 + 1;
                arrby3[n7] = arrby2[(by & 255) >> 2];
                int n17 = n16 + 1;
                arrby3[n16] = arrby2[(by & 3) << 4 | (by4 & 255) >> 4];
                int n18 = n17 + 1;
                arrby3[n17] = arrby2[(by4 & 15) << 2];
                arrby3[n18] = 61;
            }
        } else {
            int n19;
            byte by = arrby[n6];
            int n20 = n7 + 1;
            arrby3[n7] = arrby2[(by & 255) >> 2];
            int n21 = n20 + 1;
            arrby3[n20] = arrby2[(by & 3) << 4];
            int n22 = n21 + 1;
            arrby3[n21] = n19 = 61;
            arrby3[n22] = n19;
        }
        return b.b(arrby3);
    }

    public static /* synthetic */ String b(byte[] arrby, byte[] arrby2, int n5, Object object) {
        if ((n5 & 1) != 0) {
            arrby2 = a;
        }
        return a.a(arrby, arrby2);
    }
}


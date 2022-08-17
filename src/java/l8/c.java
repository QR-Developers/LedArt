/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  u7.j
 */
package l8;

import m8.b;
import u7.j;

public final class c {
    public static final boolean a(byte[] arrby, int n5, byte[] arrby2, int n6, int n7) {
        j.f((Object)arrby, (String)"a");
        j.f((Object)arrby2, (String)"b");
        for (int i5 = 0; i5 < n7; ++i5) {
            if (arrby[i5 + n5] == arrby2[i5 + n6]) continue;
            return false;
        }
        return true;
    }

    public static final void b(long l3, long l5, long l6) {
        if ((l5 | l6) >= 0L && l5 <= l3 && l3 - l5 >= l6) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size=");
        stringBuilder.append(l3);
        stringBuilder.append(" offset=");
        stringBuilder.append(l5);
        stringBuilder.append(" byteCount=");
        stringBuilder.append(l6);
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public static final int c(int n5) {
        return (-16777216 & n5) >>> 24 | (16711680 & n5) >>> 8 | (65280 & n5) << 8 | (n5 & 255) << 24;
    }

    public static final short d(short s3) {
        int n5 = s3 & 65535;
        return (short)((65280 & n5) >>> 8 | (n5 & 255) << 8);
    }

    public static final String e(byte by) {
        char[] arrc = new char[]{b.f()[15 & by >> 4], b.f()[by & 15]};
        return new String(arrc);
    }

    public static final String f(int n5) {
        int n6;
        if (n5 == 0) {
            return "0";
        }
        char[] arrc = new char[8];
        char c4 = b.f()[15 & n5 >> 28];
        arrc[0] = c4;
        arrc[1] = b.f()[15 & n5 >> 24];
        arrc[2] = b.f()[15 & n5 >> 20];
        arrc[3] = b.f()[15 & n5 >> 16];
        arrc[4] = b.f()[15 & n5 >> 12];
        arrc[5] = b.f()[15 & n5 >> 8];
        arrc[6] = b.f()[15 & n5 >> 4];
        arrc[7] = b.f()[n5 & 15];
        for (n6 = 0; n6 < 8 && arrc[n6] == '0'; ++n6) {
        }
        return new String(arrc, n6, 8 - n6);
    }
}


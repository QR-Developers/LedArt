/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  l8.e
 *  u7.j
 */
package m8;

import l8.e;
import l8.h;
import u7.j;

public final class b {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final /* synthetic */ int a(byte[] arrby, int n5) {
        return b.c(arrby, n5);
    }

    public static final /* synthetic */ int b(char c4) {
        return b.e(c4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static final int c(byte[] var0, int var1_1) {
        var2_2 = var0.length;
        var3_3 = 0;
        var4_4 = 0;
        var5_5 = 0;
        block0 : do {
            if (var3_3 >= var2_2) return var4_4;
            var6_6 = var0[var3_3];
            if (var6_6 >= 0) {
                var35_35 = var5_5 + 1;
                if (var5_5 == var1_1) {
                    return var4_4;
                }
                if (var6_6 != 10 && var6_6 != 13) {
                    var41_41 = var6_6 >= 0 && 31 >= var6_6 || 127 <= var6_6 && 159 >= var6_6;
                    if (var41_41 != false) return -1;
                }
                if (var6_6 == 65533) {
                    return -1;
                }
                var36_36 = var6_6 < 65536 ? 1 : 2;
                var4_4 += var36_36;
                ++var3_3;
            } else {
                if (var6_6 >> 5 == -2) {
                    var28_28 = var3_3 + 1;
                    if (var2_2 <= var28_28) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var29_29 = var0[var3_3];
                    var30_30 = var0[var28_28];
                    var31_31 = (var30_30 & 192) == 128;
                    if (!var31_31) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var32_32 = var30_30 ^ 3968 ^ var29_29 << 6;
                    if (var32_32 < 128) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var16_16 = var5_5 + 1;
                    if (var5_5 == var1_1) {
                        return var4_4;
                    }
                    if (var32_32 != 10 && var32_32 != 13) {
                        var34_34 = var32_32 >= 0 && 31 >= var32_32 || 127 <= var32_32 && 159 >= var32_32;
                        if (var34_34 != false) return -1;
                    }
                    if (var32_32 == 65533) {
                        return -1;
                    }
                    var33_33 = var32_32 < 65536 ? 1 : 2;
                    var4_4 += var33_33;
                    var3_3 += 2;
                } else if (var6_6 >> 4 == -2) {
                    var19_19 = var3_3 + 2;
                    if (var2_2 <= var19_19) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var20_20 = var0[var3_3];
                    var21_21 = var0[var3_3 + 1];
                    var22_22 = (var21_21 & 192) == 128;
                    if (!var22_22) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var23_23 = var0[var19_19];
                    var24_24 = (var23_23 & 192) == 128;
                    if (!var24_24) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var25_25 = var23_23 ^ -123008 ^ var21_21 << 6 ^ var20_20 << 12;
                    if (var25_25 < 2048) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    if (55296 <= var25_25 && 57343 >= var25_25) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var16_16 = var5_5 + 1;
                    if (var5_5 == var1_1) {
                        return var4_4;
                    }
                    if (var25_25 != 10 && var25_25 != 13) {
                        var27_27 = var25_25 >= 0 && 31 >= var25_25 || 127 <= var25_25 && 159 >= var25_25;
                        if (var27_27 != false) return -1;
                    }
                    if (var25_25 == 65533) {
                        return -1;
                    }
                    var26_26 = var25_25 < 65536 ? 1 : 2;
                    var4_4 += var26_26;
                    var3_3 += 3;
                } else {
                    if (var6_6 >> 3 != -2) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var7_7 = var3_3 + 3;
                    if (var2_2 <= var7_7) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var8_8 = var0[var3_3];
                    var9_9 = var0[var3_3 + 1];
                    var10_10 = (var9_9 & 192) == 128;
                    if (!var10_10) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var11_11 = var0[var3_3 + 2];
                    var12_12 = (var11_11 & 192) == 128;
                    if (!var12_12) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var13_13 = var0[var7_7];
                    var14_14 = (var13_13 & 192) == 128;
                    if (!var14_14) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var15_15 = var13_13 ^ 3678080 ^ var11_11 << 6 ^ var9_9 << 12 ^ var8_8 << 18;
                    if (var15_15 > 1114111) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    if (55296 <= var15_15 && 57343 >= var15_15) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    if (var15_15 < 65536) {
                        if (var5_5 != var1_1) return -1;
                        return var4_4;
                    }
                    var16_16 = var5_5 + 1;
                    if (var5_5 == var1_1) {
                        return var4_4;
                    }
                    if (var15_15 != 10 && var15_15 != 13) {
                        var18_18 = var15_15 >= 0 && 31 >= var15_15 || 127 <= var15_15 && 159 >= var15_15;
                        if (var18_18 != false) return -1;
                    }
                    if (var15_15 == 65533) {
                        return -1;
                    }
                    var17_17 = var15_15 < 65536 ? 1 : 2;
                    var4_4 += var17_17;
                    var3_3 += 4;
                }
                var5_5 = var16_16;
                continue;
            }
            do {
                var5_5 = var35_35;
                if (var3_3 < var2_2 && var0[var3_3] >= 0) ** break;
                continue block0;
                var37_37 = var3_3 + 1;
                var38_38 = var0[var3_3];
                var35_35 = var5_5 + 1;
                if (var5_5 == var1_1) {
                    return var4_4;
                }
                if (var38_38 != 10 && var38_38 != 13) {
                    var40_40 = var38_38 >= 0 && 31 >= var38_38 || 127 <= var38_38 && 159 >= var38_38;
                    if (var40_40 != false) return -1;
                }
                if (var38_38 == 65533) {
                    return -1;
                }
                var39_39 = var38_38 < 65536 ? 1 : 2;
                var4_4 += var39_39;
                var3_3 = var37_37;
            } while (true);
            break;
        } while (true);
    }

    public static final void d(h h4, e e5, int n5, int n6) {
        j.f((Object)h4, (String)"$this$commonWrite");
        j.f((Object)e5, (String)"buffer");
        e5.g0(h4.e(), n5, n6);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static final int e(char n5) {
        if (48 <= n5 && 57 >= n5) {
            return n5 - 48;
        }
        int n6 = 97;
        if (n6 <= n5 && 102 >= n5) {
            return 10 + (n5 - n6);
        }
        n6 = 65;
        if (n6 <= n5 && 70 >= n5) {
            return 10 + (n5 - n6);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected hex digit: ");
        stringBuilder.append((char)n5);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public static final char[] f() {
        return a;
    }
}


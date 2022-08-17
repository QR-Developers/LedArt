/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  l8.e
 *  l8.p
 *  u7.j
 */
package m8;

import l8.b;
import l8.e;
import l8.p;
import l8.t;
import u7.j;

public final class a {
    private static final byte[] a = b.a("0123456789abcdef");

    public static final byte[] a() {
        return a;
    }

    public static final String b(e e5, long l3) {
        long l5;
        j.f((Object)e5, (String)"$this$readUtf8Line");
        if (l3 > 0L && e5.I(l5 = l3 - 1L) == 13) {
            String string2 = e5.Y(l5);
            e5.skip(2L);
            return string2;
        }
        String string3 = e5.Y(l3);
        e5.skip(1L);
        return string3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static final int c(e var0, p var1_1, boolean var2_2) {
        j.f((Object)var0, (String)"$this$selectPrefix");
        j.f((Object)var1_1, (String)"options");
        var3_3 = var0.a;
        if (var3_3 == null) {
            if (var2_2 == false) return -1;
            return -2;
        }
        var4_4 = var3_3.a;
        var5_5 = var3_3.b;
        var6_6 = var3_3.c;
        var7_7 = var1_1.e();
        var8_8 = var3_3;
        var9_9 = 0;
        var10_10 = -1;
        block0 : do {
            block19 : {
                var11_11 = var9_9 + 1;
                var12_12 = var7_7[var9_9];
                var13_13 = var11_11 + 1;
                var14_14 = var7_7[var11_11];
                if (var14_14 != -1) {
                    var10_10 = var14_14;
                }
                if (var8_8 == null) ** GOTO lbl41
                if (var12_12 >= 0) break block19;
                var22_22 = var13_13 + var12_12 * -1;
                do {
                    block24 : {
                        block23 : {
                            block20 : {
                                block21 : {
                                    block22 : {
                                        var23_23 = var5_5 + 1;
                                        var24_24 = 255 & var4_4[var5_5];
                                        var25_25 = var13_13 + 1;
                                        if (var24_24 != var7_7[var13_13]) {
                                            return var10_10;
                                        }
                                        var26_26 = var25_25 == var22_22;
                                        if (var23_23 != var6_6) break block20;
                                        if (var8_8 == null) {
                                            j.m();
                                        }
                                        if ((var31_31 = var8_8.f) == null) {
                                            j.m();
                                        }
                                        var29_29 = var31_31.b;
                                        var32_32 = var31_31.a;
                                        var28_28 = var31_31.c;
                                        if (var31_31 != var3_3) break block21;
                                        if (var26_26) break block22;
lbl41: // 2 sources:
                                        if (var2_2 == false) return var10_10;
                                        return -2;
                                    }
                                    var4_4 = var32_32;
                                    var30_30 = null;
                                    break block23;
                                }
                                var30_30 = var31_31;
                                var4_4 = var32_32;
                                break block23;
                            }
                            var27_27 = var8_8;
                            var28_28 = var6_6;
                            var29_29 = var23_23;
                            var30_30 = var27_27;
                        }
                        if (!var26_26) break block24;
                        var18_18 = var7_7[var25_25];
                        var15_15 = var29_29;
                        var6_6 = var28_28;
                        var8_8 = var30_30;
                        ** GOTO lbl90
                    }
                    var5_5 = var29_29;
                    var6_6 = var28_28;
                    var13_13 = var25_25;
                    var8_8 = var30_30;
                } while (true);
            }
            var15_15 = var5_5 + 1;
            var16_16 = 255 & var4_4[var5_5];
            var17_17 = var13_13 + var12_12;
            do {
                block25 : {
                    if (var13_13 == var17_17) {
                        return var10_10;
                    }
                    if (var16_16 != var7_7[var13_13]) break block25;
                    var18_18 = var7_7[var13_13 + var12_12];
                    if (var15_15 == var6_6) {
                        var8_8 = var8_8.f;
                        if (var8_8 == null) {
                            j.m();
                        }
                        var19_19 = var8_8.b;
                        var20_20 = var8_8.a;
                        var21_21 = var8_8.c;
                        var15_15 = var19_19;
                        var4_4 = var20_20;
                        var6_6 = var21_21;
                        if (var8_8 == var3_3) {
                            var8_8 = null;
                        }
                    }
lbl90: // 6 sources:
                    if (var18_18 >= 0) {
                        return var18_18;
                    }
                    var9_9 = -var18_18;
                    var5_5 = var15_15;
                    continue block0;
                }
                ++var13_13;
            } while (true);
            break;
        } while (true);
    }

    public static /* synthetic */ int d(e e5, p p2, boolean bl, int n5, Object object) {
        if ((n5 & 2) != 0) {
            bl = false;
        }
        return a.c(e5, p2, bl);
    }
}


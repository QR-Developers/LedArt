/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.a0
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.ProtocolException
 *  u7.g
 *  u7.j
 *  z7.g
 */
package f8;

import a8.a0;
import java.net.ProtocolException;
import u7.g;
import u7.j;

public final class k {
    public static final a d = new a(null);
    public final a0 a;
    public final int b;
    public final String c;

    public k(a0 a02, int n2, String string) {
        j.f((Object)a02, (String)"protocol");
        j.f((Object)string, (String)"message");
        this.a = a02;
        this.b = n2;
        this.c = string;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a == a0.b) {
            stringBuilder.append("HTTP/1.0");
        } else {
            stringBuilder.append("HTTP/1.1");
        }
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
        stringBuilder.append(' ');
        stringBuilder.append(this.c);
        String string = stringBuilder.toString();
        j.b((Object)string, (String)"StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g2) {
            this();
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final k a(String var1_1) {
            j.f((Object)var1_1, (String)"statusLine");
            var2_2 = z7.g.t((String)var1_1, (String)"HTTP/1.", (boolean)false, (int)2, null);
            var3_3 = 9;
            if (!var2_2) ** GOTO lbl21
            if (var1_1.length() >= var3_3 && var1_1.charAt(8) == ' ') {
                var25_4 = -48 + var1_1.charAt(7);
                if (var25_4 == 0) {
                    var7_5 = a0.b;
                } else {
                    if (var25_4 != 1) {
                        var26_6 = new StringBuilder();
                        var26_6.append("Unexpected status line: ");
                        var26_6.append(var1_1);
                        throw new ProtocolException(var26_6.toString());
                    }
                    var7_5 = a0.c;
                }
            } else {
                var22_7 = new StringBuilder();
                var22_7.append("Unexpected status line: ");
                var22_7.append(var1_1);
                throw new ProtocolException(var22_7.toString());
lbl21: // 1 sources:
                if (!z7.g.t((String)var1_1, (String)"ICY ", (boolean)false, (int)2, null)) {
                    var4_16 = new StringBuilder();
                    var4_16.append("Unexpected status line: ");
                    var4_16.append(var1_1);
                    throw new ProtocolException(var4_16.toString());
                }
                var7_5 = a0.b;
                var3_3 = 4;
            }
            var8_8 = var1_1.length();
            var9_9 = var3_3 + 3;
            if (var8_8 < var9_9) {
                var10_15 = new StringBuilder();
                var10_15.append("Unexpected status line: ");
                var10_15.append(var1_1);
                throw new ProtocolException(var10_15.toString());
            }
            try {
                var16_10 = var1_1.substring(var3_3, var9_9);
                j.b((Object)var16_10, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                var17_11 = Integer.parseInt((String)var16_10);
            }
            catch (NumberFormatException v0) {
                var13_14 = new StringBuilder();
                var13_14.append("Unexpected status line: ");
                var13_14.append(var1_1);
                throw new ProtocolException(var13_14.toString());
            }
            if (var1_1.length() <= var9_9) {
                var18_12 = "";
                return new k(var7_5, var17_11, var18_12);
            }
            if (var1_1.charAt(var9_9) == ' ') {
                var18_12 = var1_1.substring(var3_3 + 4);
                j.b((Object)var18_12, (String)"(this as java.lang.String).substring(startIndex)");
                return new k(var7_5, var17_11, var18_12);
            }
            var19_13 = new StringBuilder();
            var19_13.append("Unexpected status line: ");
            var19_13.append(var1_1);
            throw new ProtocolException(var19_13.toString());
        }
    }

}


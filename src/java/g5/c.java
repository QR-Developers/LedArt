/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package g5;

import java.util.HashMap;
import java.util.Map;

public final class c
extends Enum<c> {
    public static final /* enum */ c A;
    public static final /* enum */ c B;
    public static final /* enum */ c C;
    private static final Map<Integer, c> D;
    private static final Map<String, c> E;
    private static final /* synthetic */ c[] F;
    public static final /* enum */ c c;
    public static final /* enum */ c d;
    public static final /* enum */ c e;
    public static final /* enum */ c f;
    public static final /* enum */ c g;
    public static final /* enum */ c h;
    public static final /* enum */ c i;
    public static final /* enum */ c j;
    public static final /* enum */ c k;
    public static final /* enum */ c l;
    public static final /* enum */ c m;
    public static final /* enum */ c n;
    public static final /* enum */ c o;
    public static final /* enum */ c p;
    public static final /* enum */ c q;
    public static final /* enum */ c r;
    public static final /* enum */ c s;
    public static final /* enum */ c t;
    public static final /* enum */ c u;
    public static final /* enum */ c v;
    public static final /* enum */ c w;
    public static final /* enum */ c x;
    public static final /* enum */ c y;
    public static final /* enum */ c z;
    private final int[] a;
    private final String[] b;

    static {
        c c2;
        c c3;
        c c4;
        c c5;
        c c6;
        c c7;
        c c8;
        c c9;
        c c10;
        c c11;
        c c12;
        c c13;
        c c14;
        c c15;
        c c16;
        c c17;
        c c18;
        c c19;
        c c20;
        c c21;
        c c22;
        c c23;
        c c24;
        c c25;
        c c26;
        c c27;
        c c28;
        c = c23 = new c(new int[]{0, 2}, new String[0]);
        d = c24 = new c(new int[]{1, 3}, "ISO-8859-1");
        e = c19 = new c(4, "ISO-8859-2");
        f = c9 = new c(5, "ISO-8859-3");
        g = c26 = new c(6, "ISO-8859-4");
        h = c16 = new c(7, "ISO-8859-5");
        i = c7 = new c(8, "ISO-8859-6");
        j = c28 = new c(9, "ISO-8859-7");
        k = c15 = new c(10, "ISO-8859-8");
        l = c17 = new c(11, "ISO-8859-9");
        m = c25 = new c(12, "ISO-8859-10");
        n = c11 = new c(13, "ISO-8859-11");
        o = c22 = new c(15, "ISO-8859-13");
        p = c18 = new c(16, "ISO-8859-14");
        q = c5 = new c(17, "ISO-8859-15");
        r = c21 = new c(18, "ISO-8859-16");
        s = c10 = new c(20, "Shift_JIS");
        t = c3 = new c(21, "windows-1250");
        u = c12 = new c(22, "windows-1251");
        v = c6 = new c(23, "windows-1252");
        w = c2 = new c(24, "windows-1256");
        x = c14 = new c(25, "UTF-16BE", "UnicodeBig");
        y = c20 = new c(26, "UTF-8");
        z = c4 = new c(new int[]{27, 170}, "US-ASCII");
        A = c13 = new c(28);
        B = c27 = new c(29, "GB2312", "EUC_CN", "GBK");
        C = c8 = new c(30, "EUC-KR");
        F = new c[]{c23, c24, c19, c9, c26, c16, c7, c28, c15, c17, c25, c11, c22, c18, c5, c21, c10, c3, c12, c6, c2, c14, c20, c4, c13, c27, c8};
        D = new HashMap();
        E = new HashMap();
        for (c c29 : c.values()) {
            for (int n2 : c29.a) {
                D.put((Object)n2, (Object)c29);
            }
            E.put((Object)c29.name(), (Object)c29);
            for (String string : c29.b) {
                E.put((Object)string, (Object)c29);
            }
        }
    }

    private c(int n3) {
        this(new int[]{n3}, new String[0]);
    }

    private /* varargs */ c(int n3, String ... arrstring) {
        this.a = new int[]{n3};
        this.b = arrstring;
    }

    private /* varargs */ c(int[] arrn, String ... arrstring) {
        this.a = arrn;
        this.b = arrstring;
    }

    public static c a(String string) {
        return (c)((Object)E.get((Object)string));
    }

    public static c valueOf(String string) {
        return (c)Enum.valueOf(c.class, (String)string);
    }

    public static c[] values() {
        return (c[])F.clone();
    }

    public int b() {
        return this.a[0];
    }
}


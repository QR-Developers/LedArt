/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  b8.a
 *  b8.b
 *  j7.n
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URI
 *  java.net.URISyntaxException
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  l8.e
 *  u7.g
 *  u7.j
 *  w7.b
 *  w7.e
 *  z7.f
 *  z7.g
 */
package a8;

import j7.n;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import u7.g;
import u7.j;
import w7.e;
import z7.f;

public final class v {
    private static final char[] k;
    public static final b l;
    private final boolean a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final List<String> g;
    private final List<String> h;
    private final String i;
    private final String j;

    static {
        l = new b(null);
        k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public v(String string, String string2, String string3, String string4, int n2, List<String> list, List<String> list2, String string5, String string6) {
        j.f((Object)string, (String)"scheme");
        j.f((Object)string2, (String)"username");
        j.f((Object)string3, (String)"password");
        j.f((Object)string4, (String)"host");
        j.f(list, (String)"pathSegments");
        j.f((Object)string6, (String)"url");
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = n2;
        this.g = list;
        this.h = list2;
        this.i = string5;
        this.j = string6;
        this.a = j.a((Object)string, (Object)"https");
    }

    public static final v h(String string) {
        return l.e(string);
    }

    public static final v m(String string) {
        return l.g(string);
    }

    public final String b() {
        if (this.i == null) {
            return null;
        }
        int n2 = 1 + z7.g.I((CharSequence)this.j, (char)'#', (int)0, (boolean)false, (int)6, null);
        String string = this.j;
        if (string != null) {
            String string2 = string.substring(n2);
            j.b((Object)string2, (String)"(this as java.lang.String).substring(startIndex)");
            return string2;
        }
        throw new n("null cannot be cast to non-null type java.lang.String");
    }

    public final String c() {
        boolean bl = this.d.length() == 0;
        if (bl) {
            return "";
        }
        int n2 = 1 + z7.g.I((CharSequence)this.j, (char)':', (int)(3 + this.b.length()), (boolean)false, (int)4, null);
        int n3 = z7.g.I((CharSequence)this.j, (char)'@', (int)0, (boolean)false, (int)6, null);
        String string = this.j;
        if (string != null) {
            String string2 = string.substring(n2, n3);
            j.b((Object)string2, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return string2;
        }
        throw new n("null cannot be cast to non-null type java.lang.String");
    }

    public final String d() {
        int n2 = z7.g.I((CharSequence)this.j, (char)'/', (int)(3 + this.b.length()), (boolean)false, (int)4, null);
        String string = this.j;
        int n3 = b8.b.n((String)string, (String)"?#", (int)n2, (int)string.length());
        String string2 = this.j;
        if (string2 != null) {
            String string3 = string2.substring(n2, n3);
            j.b((Object)string3, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return string3;
        }
        throw new n("null cannot be cast to non-null type java.lang.String");
    }

    public final List<String> e() {
        int n2 = z7.g.I((CharSequence)this.j, (char)'/', (int)(3 + this.b.length()), (boolean)false, (int)4, null);
        String string = this.j;
        int n3 = b8.b.n((String)string, (String)"?#", (int)n2, (int)string.length());
        ArrayList arrayList = new ArrayList();
        while (n2 < n3) {
            int n4 = n2 + 1;
            int n5 = b8.b.m((String)this.j, (char)'/', (int)n4, (int)n3);
            String string2 = this.j;
            if (string2 != null) {
                String string3 = string2.substring(n4, n5);
                j.b((Object)string3, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                arrayList.add((Object)string3);
                n2 = n5;
                continue;
            }
            throw new n("null cannot be cast to non-null type java.lang.String");
        }
        return arrayList;
    }

    public boolean equals(Object object) {
        return object instanceof v && j.a((Object)((v)object).j, (Object)this.j);
    }

    public final String f() {
        if (this.h == null) {
            return null;
        }
        int n2 = 1 + z7.g.I((CharSequence)this.j, (char)'?', (int)0, (boolean)false, (int)6, null);
        String string = this.j;
        int n3 = b8.b.m((String)string, (char)'#', (int)n2, (int)string.length());
        String string2 = this.j;
        if (string2 != null) {
            String string3 = string2.substring(n2, n3);
            j.b((Object)string3, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return string3;
        }
        throw new n("null cannot be cast to non-null type java.lang.String");
    }

    public final String g() {
        boolean bl = this.c.length() == 0;
        if (bl) {
            return "";
        }
        int n2 = 3 + this.b.length();
        String string = this.j;
        int n3 = b8.b.n((String)string, (String)":@", (int)n2, (int)string.length());
        String string2 = this.j;
        if (string2 != null) {
            String string3 = string2.substring(n2, n3);
            j.b((Object)string3, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return string3;
        }
        throw new n("null cannot be cast to non-null type java.lang.String");
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public final boolean j() {
        return this.a;
    }

    public final a k() {
        a a2 = new a();
        a2.w(this.b);
        a2.t(this.g());
        a2.s(this.c());
        a2.u(this.e);
        int n2 = this.f != l.d(this.b) ? this.f : -1;
        a2.v(n2);
        a2.f().clear();
        a2.f().addAll(this.e());
        a2.e(this.f());
        a2.r(this.b());
        return a2;
    }

    public final a l(String string) {
        j.f((Object)string, (String)"link");
        try {
            a a2 = new a().j(this, string);
            return a2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public final List<String> n() {
        return this.g;
    }

    public final int o() {
        return this.f;
    }

    public final String p() {
        if (this.h == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        l.n(this.h, stringBuilder);
        return stringBuilder.toString();
    }

    public final String q() {
        a a2 = this.l("/...");
        if (a2 == null) {
            j.m();
        }
        return a2.x("").k("").c().toString();
    }

    public final v r(String string) {
        j.f((Object)string, (String)"link");
        a a2 = this.l(string);
        if (a2 != null) {
            return a2.c();
        }
        return null;
    }

    public final String s() {
        return this.b;
    }

    public final URI t() {
        String string = this.k().o().toString();
        try {
            URI uRI = new URI(string);
            return uRI;
        }
        catch (URISyntaxException uRISyntaxException) {
            try {
                URI uRI = URI.create((String)new f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b((CharSequence)string, ""));
                j.b((Object)uRI, (String)"URI.create(stripped)");
                return uRI;
            }
            catch (Exception exception) {
                throw new RuntimeException((Throwable)uRISyntaxException);
            }
        }
    }

    public String toString() {
        return this.j;
    }

    public static final class a8.v$a {
        public static final a i = new a(null);
        private String a;
        private String b = "";
        private String c = "";
        private String d;
        private int e = -1;
        private final List<String> f;
        private List<String> g;
        private String h;

        public a8.v$a() {
            ArrayList arrayList;
            this.f = arrayList = new ArrayList();
            arrayList.add((Object)"");
        }

        private final int d() {
            int n2 = this.e;
            if (n2 != -1) {
                return n2;
            }
            b b2 = v.l;
            String string = this.a;
            if (string == null) {
                j.m();
            }
            return b2.d(string);
        }

        private final boolean h(String string) {
            boolean bl = j.a((Object)string, (Object)".");
            boolean bl2 = true;
            if (!bl) {
                if (z7.g.h((String)string, (String)"%2e", (boolean)bl2)) {
                    return bl2;
                }
                bl2 = false;
            }
            return bl2;
        }

        private final boolean i(String string) {
            boolean bl = j.a((Object)string, (Object)"..");
            boolean bl2 = true;
            if (!(bl || z7.g.h((String)string, (String)"%2e.", (boolean)bl2) || z7.g.h((String)string, (String)".%2e", (boolean)bl2))) {
                if (z7.g.h((String)string, (String)"%2e%2e", (boolean)bl2)) {
                    return bl2;
                }
                bl2 = false;
            }
            return bl2;
        }

        private final void l() {
            List<String> list = this.f;
            boolean bl = ((String)list.remove(list.size() - 1)).length() == 0;
            if (bl && true ^ this.f.isEmpty()) {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, (Object)"");
                return;
            }
            this.f.add((Object)"");
        }

        private final void n(String string, int n2, int n3, boolean bl, boolean bl2) {
            String string2 = b.c(v.l, string, n2, n3, " \"<>^`{}|/\\?#", bl2, false, false, false, null, 240, null);
            if (this.h(string2)) {
                return;
            }
            if (this.i(string2)) {
                this.l();
                return;
            }
            List<String> list = this.f;
            boolean bl3 = ((CharSequence)list.get(list.size() - 1)).length() == 0;
            if (bl3) {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, (Object)string2);
            } else {
                this.f.add((Object)string2);
            }
            if (bl) {
                this.f.add((Object)"");
            }
        }

        private final void p(String string, int n2, int n3) {
            int n4;
            if (n2 == n3) {
                return;
            }
            char c2 = string.charAt(n2);
            if (c2 != '/' && c2 != '\\') {
                List<String> list = this.f;
                list.set(list.size() - 1, (Object)"");
            } else {
                this.f.clear();
                this.f.add((Object)"");
            }
            while ((n4 = ++n2) < n3) {
                n2 = b8.b.n((String)string, (String)"/\\", (int)n4, (int)n3);
                boolean bl = n2 < n3;
                this.n(string, n4, n2, bl, true);
                if (!bl) continue;
            }
        }

        public final a8.v$a a(String string, String string2) {
            List<String> list;
            j.f((Object)string, (String)"encodedName");
            if (this.g == null) {
                this.g = new ArrayList();
            }
            if ((list = this.g) == null) {
                j.m();
            }
            b b2 = v.l;
            list.add((Object)b.c(b2, string, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List<String> list2 = this.g;
            if (list2 == null) {
                j.m();
            }
            String string3 = string2 != null ? b.c(b2, string2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null;
            list2.add(string3);
            return this;
        }

        public final a8.v$a b(String string, String string2) {
            List<String> list;
            j.f((Object)string, (String)"name");
            if (this.g == null) {
                this.g = new ArrayList();
            }
            if ((list = this.g) == null) {
                j.m();
            }
            b b2 = v.l;
            list.add((Object)b.c(b2, string, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List<String> list2 = this.g;
            if (list2 == null) {
                j.m();
            }
            String string3 = string2 != null ? b.c(b2, string2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null;
            list2.add(string3);
            return this;
        }

        public final v c() {
            String string = this.a;
            if (string != null) {
                b b2 = v.l;
                String string2 = b.k(b2, this.b, 0, 0, false, 7, null);
                String string3 = b.k(b2, this.c, 0, 0, false, 7, null);
                String string4 = this.d;
                if (string4 != null) {
                    int n2 = this.d();
                    List list = b.i(b2, this.f, false, 1, null);
                    if (list != null) {
                        List<String> list2 = this.g;
                        List list3 = list2 != null ? b2.h((List<String>)list2, true) : null;
                        String string5 = this.h;
                        String string6 = string5 != null ? b.k(b2, string5, 0, 0, false, 7, null) : null;
                        String string7 = this.toString();
                        v v2 = new v(string, string2, string3, string4, n2, (List<String>)list, (List<String>)list3, string6, string7);
                        return v2;
                    }
                    throw new n("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a8.v$a e(String string) {
            b b2;
            String string2;
            List<String> list = string != null && (string2 = b.c(b2 = v.l, string, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) != null ? b2.m(string2) : null;
            this.g = list;
            return this;
        }

        public final List<String> f() {
            return this.f;
        }

        public final a8.v$a g(String string) {
            j.f((Object)string, (String)"host");
            String string2 = b8.a.e((String)b.k(v.l, string, 0, 0, false, 7, null));
            if (string2 != null) {
                this.d = string2;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected host: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /*
         * Enabled aggressive block sorting
         */
        public final a8.v$a j(v v2, String string) {
            int n2;
            j.f((Object)string, (String)"input");
            int n3 = b8.b.x((String)string, (int)0, (int)0, (int)3, null);
            int n4 = b8.b.z((String)string, (int)n3, (int)0, (int)2, null);
            a a2 = i;
            int n5 = a2.g(string, n3, n4);
            String string2 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)";
            int n6 = -1;
            if (n5 != n6) {
                if (z7.g.q((String)string, (String)"https:", (int)n3, (boolean)true)) {
                    this.a = "https";
                    n3 += 6;
                } else {
                    if (!z7.g.q((String)string, (String)"http:", (int)n3, (boolean)true)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected URL scheme 'http' or 'https' but was '");
                        String string3 = string.substring(0, n5);
                        j.b((Object)string3, (String)string2);
                        stringBuilder.append(string3);
                        stringBuilder.append("'");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    this.a = "http";
                    n3 += 5;
                }
            } else {
                if (v2 == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                    throw illegalArgumentException;
                }
                this.a = v2.s();
            }
            int n7 = a2.h(string, n3, n4);
            int n8 = 63;
            int n9 = 35;
            if (n7 < 2 && v2 != null && !(true ^ j.a((Object)v2.s(), (Object)this.a))) {
                this.b = v2.g();
                this.c = v2.c();
                this.d = v2.i();
                this.e = v2.o();
                this.f.clear();
                this.f.addAll(v2.e());
                if (n3 == n4 || string.charAt(n3) == n9) {
                    this.e(v2.f());
                }
                n2 = n4;
            } else {
                int n10;
                int n11;
                int n12;
                String string4;
                int n13 = n3 + n7;
                boolean bl = false;
                boolean bl2 = false;
                while ((n11 = (n10 = b8.b.n((String)string, (String)"@/\\?#", (int)n13, (int)n4)) != n4 ? (int)string.charAt(n10) : -1) != n6 && n11 != n9 && n11 != 47 && n11 != 92 && n11 != n8) {
                    String string5;
                    int n14;
                    if (n11 != 64) {
                        string5 = string2;
                        n14 = n4;
                    } else {
                        boolean bl3;
                        int n15;
                        if (!bl) {
                            boolean bl4;
                            int n16 = b8.b.m((String)string, (char)':', (int)n13, (int)n10);
                            b b2 = v.l;
                            int n17 = n13;
                            n14 = n4;
                            String string6 = string2;
                            String string7 = b.c(b2, string, n17, n16, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (bl2) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(this.b);
                                stringBuilder.append("%40");
                                stringBuilder.append(string7);
                                string7 = stringBuilder.toString();
                            }
                            this.b = string7;
                            if (n16 != n10) {
                                this.c = b.c(b2, string, n16 + 1, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                bl4 = true;
                            } else {
                                bl4 = bl;
                            }
                            bl = bl4;
                            string5 = string6;
                            bl3 = true;
                            n15 = n10;
                        } else {
                            n14 = n4;
                            String string8 = string2;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(this.c);
                            stringBuilder.append("%40");
                            b b3 = v.l;
                            int n18 = n13;
                            string5 = string8;
                            n15 = n10;
                            stringBuilder.append(b.c(b3, string, n18, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.c = stringBuilder.toString();
                            bl3 = bl2;
                        }
                        n13 = n15 + 1;
                        bl2 = bl3;
                    }
                    string2 = string5;
                    n4 = n14;
                    n9 = 35;
                    n8 = 63;
                    n6 = -1;
                }
                String string9 = string2;
                n2 = n4;
                a a3 = i;
                int n19 = a3.f(string, n13, n10);
                int n20 = n19 + 1;
                if (n20 < n10) {
                    int n21;
                    b b4 = v.l;
                    int n22 = n13;
                    n12 = n13;
                    this.d = b8.a.e((String)b.k(b4, string, n22, n19, false, 4, null));
                    this.e = n21 = a3.e(string, n20, n10);
                    boolean bl5 = n21 != -1;
                    if (!bl5) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid URL port: \"");
                        String string10 = string.substring(n20, n10);
                        j.b((Object)string10, (String)string9);
                        stringBuilder.append(string10);
                        stringBuilder.append('\"');
                        throw new IllegalArgumentException(stringBuilder.toString().toString());
                    }
                    string4 = string9;
                } else {
                    n12 = n13;
                    string4 = string9;
                    b b5 = v.l;
                    this.d = b8.a.e((String)b.k(b5, string, n12, n19, false, 4, null));
                    String string11 = this.a;
                    if (string11 == null) {
                        j.m();
                    }
                    this.e = b5.d(string11);
                }
                boolean bl6 = this.d != null;
                if (!bl6) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid URL host: \"");
                    String string12 = string.substring(n12, n19);
                    j.b((Object)string12, (String)string4);
                    stringBuilder.append(string12);
                    stringBuilder.append('\"');
                    throw new IllegalArgumentException(stringBuilder.toString().toString());
                }
                n3 = n10;
            }
            int n23 = n2;
            int n24 = b8.b.n((String)string, (String)"?#", (int)n3, (int)n23);
            this.p(string, n3, n24);
            if (n24 < n23 && string.charAt(n24) == '?') {
                int n25 = b8.b.m((String)string, (char)'#', (int)n24, (int)n23);
                b b6 = v.l;
                this.g = b6.m(b.c(b6, string, n24 + 1, n25, " \"'<>#", true, false, true, false, null, 208, null));
                n24 = n25;
            }
            if (n24 >= n23) return this;
            if (string.charAt(n24) != '#') return this;
            this.h = b.c(v.l, string, n24 + 1, n23, "", true, false, false, true, null, 176, null);
            return this;
        }

        public final a8.v$a k(String string) {
            j.f((Object)string, (String)"password");
            this.c = b.c(v.l, string, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a8.v$a m(int n2) {
            int n3 = 1;
            if (n3 > n2 || 65535 < n2) {
                n3 = 0;
            }
            if (n3 != 0) {
                this.e = n2;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected port: ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }

        public final a8.v$a o() {
            String string = this.d;
            String string2 = string != null ? new f("[\"<>^`{|}]").b((CharSequence)string, "") : null;
            this.d = string2;
            int n2 = this.f.size();
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                List<String> list = this.f;
                list.set(i2, (Object)b.c(v.l, (String)list.get(i2), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list = this.g;
            if (list != null) {
                int n4 = list.size();
                while (n3 < n4) {
                    String string3 = (String)list.get(n3);
                    String string4 = string3 != null ? b.c(v.l, string3, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null;
                    list.set(n3, string4);
                    ++n3;
                }
            }
            String string5 = this.h;
            String string6 = null;
            if (string5 != null) {
                string6 = b.c(v.l, string5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            this.h = string6;
            return this;
        }

        public final a8.v$a q(String string) {
            j.f((Object)string, (String)"scheme");
            if (z7.g.h((String)string, (String)"http", (boolean)true)) {
                this.a = "http";
                return this;
            }
            if (z7.g.h((String)string, (String)"https", (boolean)true)) {
                this.a = "https";
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected scheme: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final void r(String string) {
            this.h = string;
        }

        public final void s(String string) {
            j.f((Object)string, (String)"<set-?>");
            this.c = string;
        }

        public final void t(String string) {
            j.f((Object)string, (String)"<set-?>");
            this.b = string;
        }

        public String toString() {
            StringBuilder stringBuilder;
            block16 : {
                int n2;
                block17 : {
                    String string;
                    boolean bl;
                    stringBuilder = new StringBuilder();
                    String string2 = this.a;
                    if (string2 != null) {
                        stringBuilder.append(string2);
                        stringBuilder.append("://");
                    } else {
                        stringBuilder.append("//");
                    }
                    int n3 = this.b.length();
                    boolean bl2 = true;
                    boolean bl3 = n3 > 0;
                    if (bl3 || (bl = this.c.length() > 0)) {
                        stringBuilder.append(this.b);
                        if (this.c.length() <= 0) {
                            bl2 = false;
                        }
                        if (bl2) {
                            stringBuilder.append(':');
                            stringBuilder.append(this.c);
                        }
                        stringBuilder.append('@');
                    }
                    if ((string = this.d) != null) {
                        if (string == null) {
                            j.m();
                        }
                        if (z7.g.x((CharSequence)string, (char)':', (boolean)false, (int)2, null)) {
                            stringBuilder.append('[');
                            stringBuilder.append(this.d);
                            stringBuilder.append(']');
                        } else {
                            stringBuilder.append(this.d);
                        }
                    }
                    if (this.e == -1 && this.a == null) break block16;
                    n2 = this.d();
                    String string3 = this.a;
                    if (string3 == null) break block17;
                    b b2 = v.l;
                    if (string3 == null) {
                        j.m();
                    }
                    if (n2 == b2.d(string3)) break block16;
                }
                stringBuilder.append(':');
                stringBuilder.append(n2);
            }
            b b3 = v.l;
            b3.l(this.f, stringBuilder);
            if (this.g != null) {
                stringBuilder.append('?');
                List<String> list = this.g;
                if (list == null) {
                    j.m();
                }
                b3.n(list, stringBuilder);
            }
            if (this.h != null) {
                stringBuilder.append('#');
                stringBuilder.append(this.h);
            }
            String string = stringBuilder.toString();
            j.b((Object)string, (String)"StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(String string) {
            this.d = string;
        }

        public final void v(int n2) {
            this.e = n2;
        }

        public final void w(String string) {
            this.a = string;
        }

        public final a8.v$a x(String string) {
            j.f((Object)string, (String)"username");
            this.b = b.c(v.l, string, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g g2) {
                this();
            }

            /*
             * Exception decompiling
             */
            private final int e(String var1, int var2, int var3) {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
                // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
                // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
                // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
                // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
                // org.benf.cfr.reader.b.a(Driver.java:128)
                // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
                // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
                // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
                // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
                // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
                // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
                // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
                // java.lang.Thread.run(Thread.java:923)
                throw new IllegalStateException("Decompilation failed");
            }

            private final int f(String string, int n2, int n3) {
                while (n2 < n3) {
                    char c2 = string.charAt(n2);
                    if (c2 != ':') {
                        if (c2 == '[') {
                            while (++n2 < n3 && string.charAt(n2) != ']') {
                            }
                        }
                        ++n2;
                        continue;
                    }
                    return n2;
                }
                return n3;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            private final int g(String string, int n2, int n3) {
                char c2;
                int n4 = n3 - n2;
                int n5 = -1;
                if (n4 < 2) {
                    return n5;
                }
                char c3 = string.charAt(n2);
                if (c3 < 'a' || c3 > 'z') {
                    if (c3 < 'A') return n5;
                    if (c3 > 'Z') {
                        return n5;
                    }
                }
                do {
                    if (++n2 >= n3) return n5;
                } while ('a' <= (c2 = string.charAt(n2)) && 'z' >= c2 || 'A' <= c2 && 'Z' >= c2 || '0' <= c2 && '9' >= c2 || c2 == '+' || c2 == '-' || c2 == '.');
                if (c2 != ':') return n5;
                return n2;
            }

            private final int h(String string, int n2, int n3) {
                char c2;
                int n4 = 0;
                while (n2 < n3 && ((c2 = string.charAt(n2)) == '\\' || c2 == '/')) {
                    ++n4;
                    ++n2;
                }
                return n4;
            }
        }

    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g2) {
            this();
        }

        public static /* synthetic */ String c(b b2, String string, int n2, int n3, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset, int n4, Object object) {
            int n5 = (n4 & 1) != 0 ? 0 : n2;
            int n6 = (n4 & 2) != 0 ? string.length() : n3;
            boolean bl5 = (n4 & 8) != 0 ? false : bl;
            boolean bl6 = (n4 & 16) != 0 ? false : bl2;
            boolean bl7 = (n4 & 32) != 0 ? false : bl3;
            boolean bl8 = (n4 & 64) != 0 ? false : bl4;
            Charset charset2 = (n4 & 128) != 0 ? null : charset;
            return b2.b(string, n5, n6, string2, bl5, bl6, bl7, bl8, charset2);
        }

        private final boolean f(String string, int n2, int n3) {
            int n4 = n2 + 2;
            return n4 < n3 && string.charAt(n2) == '%' && b8.b.D((char)string.charAt(n2 + 1)) != -1 && b8.b.D((char)string.charAt(n4)) != -1;
        }

        private final List<String> h(List<String> list, boolean bl) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String string : list) {
                String string2 = string != null ? b.k(this, string, 0, 0, bl, 3, null) : null;
                arrayList.add(string2);
            }
            List list2 = Collections.unmodifiableList((List)arrayList);
            j.b((Object)list2, (String)"Collections.unmodifiableList(result)");
            return list2;
        }

        static /* synthetic */ List i(b b2, List list, boolean bl, int n2, Object object) {
            if ((n2 & 1) != 0) {
                bl = false;
            }
            return b2.h((List<String>)list, bl);
        }

        public static /* synthetic */ String k(b b2, String string, int n2, int n3, boolean bl, int n4, Object object) {
            if ((n4 & 1) != 0) {
                n2 = 0;
            }
            if ((n4 & 2) != 0) {
                n3 = string.length();
            }
            if ((n4 & 4) != 0) {
                bl = false;
            }
            return b2.j(string, n2, n3, bl);
        }

        private final void o(l8.e e2, String string, int n2, int n3, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
            int n4;
            l8.e e3 = null;
            for (int i2 = n2; i2 < n3; i2 += Character.charCount((int)n4)) {
                if (string != null) {
                    n4 = string.codePointAt(i2);
                    if (bl && (n4 == 9 || n4 == 10 || n4 == 12 || n4 == 13)) continue;
                    if (n4 == 43 && bl3) {
                        String string3 = bl ? "+" : "%2B";
                        e2.o0(string3);
                        continue;
                    }
                    if (!(n4 < 32 || n4 == 127 || n4 >= 128 && !bl4 || z7.g.x((CharSequence)string2, (char)((char)n4), (boolean)false, (int)2, null) || n4 == 37 && (!bl || bl2 && !this.f(string, i2, n3)))) {
                        e2.q0(n4);
                        continue;
                    }
                    if (e3 == null) {
                        e3 = new l8.e();
                    }
                    if (charset != null && !j.a((Object)charset, (Object)StandardCharsets.UTF_8)) {
                        e3.m0(string, i2, i2 + Character.charCount((int)n4), charset);
                    } else {
                        e3.q0(n4);
                    }
                    while (!e3.k()) {
                        int n5 = 255 & e3.readByte();
                        e2.h0(37);
                        e2.h0((int)k[15 & n5 >> 4]);
                        e2.h0((int)k[n5 & 15]);
                    }
                    continue;
                }
                throw new n("null cannot be cast to non-null type java.lang.String");
            }
        }

        private final void p(l8.e e2, String string, int n2, int n3, boolean bl) {
            while (n2 < n3) {
                if (string != null) {
                    int n4;
                    int n5 = string.codePointAt(n2);
                    if (n5 == 37 && (n4 = n2 + 2) < n3) {
                        int n6 = b8.b.D((char)string.charAt(n2 + 1));
                        int n7 = b8.b.D((char)string.charAt(n4));
                        if (n6 != -1 && n7 != -1) {
                            e2.h0(n7 + (n6 << 4));
                            n2 = n4 + Character.charCount((int)n5);
                            continue;
                        }
                    } else if (n5 == 43 && bl) {
                        e2.h0(32);
                        ++n2;
                        continue;
                    }
                    e2.q0(n5);
                    n2 += Character.charCount((int)n5);
                    continue;
                }
                throw new n("null cannot be cast to non-null type java.lang.String");
            }
        }

        public final String b(String string, int n2, int n3, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
            int n4;
            j.f((Object)string, (String)"$this$canonicalize");
            j.f((Object)string2, (String)"encodeSet");
            for (int i2 = n2; i2 < n3; i2 += Character.charCount((int)n4)) {
                n4 = string.codePointAt(i2);
                if (!(n4 < 32 || n4 == 127 || n4 >= 128 && !bl4 || z7.g.x((CharSequence)string2, (char)((char)n4), (boolean)false, (int)2, null) || n4 == 37 && (!bl || bl2 && !this.f(string, i2, n3)) || n4 == 43 && bl3)) {
                    continue;
                }
                l8.e e2 = new l8.e();
                e2.p0(string, n2, i2);
                this.o(e2, string, i2, n3, string2, bl, bl2, bl3, bl4, charset);
                return e2.R();
            }
            String string3 = string.substring(n2, n3);
            j.b((Object)string3, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return string3;
        }

        public final int d(String string) {
            j.f((Object)string, (String)"scheme");
            int n2 = string.hashCode();
            if (n2 != 3213448) {
                if (n2 == 99617003 && string.equals((Object)"https")) {
                    return 443;
                }
            } else if (string.equals((Object)"http")) {
                return 80;
            }
            return -1;
        }

        public final v e(String string) {
            j.f((Object)string, (String)"$this$toHttpUrl");
            return new a().j(null, string).c();
        }

        public final v g(String string) {
            j.f((Object)string, (String)"$this$toHttpUrlOrNull");
            try {
                v v2 = this.e(string);
                return v2;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }

        public final String j(String string, int n2, int n3, boolean bl) {
            j.f((Object)string, (String)"$this$percentDecode");
            for (int i2 = n2; i2 < n3; ++i2) {
                char c2 = string.charAt(i2);
                if (!(c2 == '%' || c2 == '+' && bl)) {
                    continue;
                }
                l8.e e2 = new l8.e();
                e2.p0(string, n2, i2);
                this.p(e2, string, i2, n3, bl);
                return e2.R();
            }
            String string2 = string.substring(n2, n3);
            j.b((Object)string2, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return string2;
        }

        public final void l(List<String> list, StringBuilder stringBuilder) {
            j.f(list, (String)"$this$toPathString");
            j.f((Object)stringBuilder, (String)"out");
            int n2 = list.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                stringBuilder.append('/');
                stringBuilder.append((String)list.get(i2));
            }
        }

        public final List<String> m(String string) {
            j.f((Object)string, (String)"$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int n2 = 0;
            while (n2 <= string.length()) {
                int n3 = z7.g.I((CharSequence)string, (char)'&', (int)n2, (boolean)false, (int)4, null);
                if (n3 == -1) {
                    n3 = string.length();
                }
                int n4 = n3;
                int n5 = z7.g.I((CharSequence)string, (char)'=', (int)n2, (boolean)false, (int)4, null);
                if (n5 != -1 && n5 <= n4) {
                    String string2 = string.substring(n2, n5);
                    j.b((Object)string2, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    arrayList.add((Object)string2);
                    String string3 = string.substring(n5 + 1, n4);
                    j.b((Object)string3, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    arrayList.add((Object)string3);
                } else {
                    String string4 = string.substring(n2, n4);
                    j.b((Object)string4, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    arrayList.add((Object)string4);
                    arrayList.add(null);
                }
                n2 = n4 + 1;
            }
            return arrayList;
        }

        public final void n(List<String> list, StringBuilder stringBuilder) {
            j.f(list, (String)"$this$toQueryString");
            j.f((Object)stringBuilder, (String)"out");
            w7.b b2 = e.f((w7.b)e.g((int)0, (int)list.size()), (int)2);
            int n2 = b2.a();
            int n3 = b2.b();
            int n4 = b2.c();
            if (n4 >= 0 ? n2 <= n3 : n2 >= n3) {
                do {
                    String string = (String)list.get(n2);
                    String string2 = (String)list.get(n2 + 1);
                    if (n2 > 0) {
                        stringBuilder.append('&');
                    }
                    stringBuilder.append(string);
                    if (string2 != null) {
                        stringBuilder.append('=');
                        stringBuilder.append(string2);
                    }
                    if (n2 == n3) break;
                    n2 += n4;
                } while (true);
            }
        }
    }

}


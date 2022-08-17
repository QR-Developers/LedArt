/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  b8.a
 *  b8.b
 *  f8.c
 *  j7.n
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Date
 *  java.util.GregorianCalendar
 *  java.util.List
 *  java.util.Locale
 *  java.util.TimeZone
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  k7.k
 *  org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
 *  u7.g
 *  u7.j
 *  z7.f
 *  z7.g
 */
package a8;

import a8.l;
import a8.m;
import a8.u;
import a8.v;
import b8.b;
import f8.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.k;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import u7.g;
import u7.j;
import z7.f;

public final class n {
    private static final Pattern j;
    private static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;
    public static final a n;
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    static {
        n = new a(null);
        j = Pattern.compile((String)"(\\d{2,4})[^\\d]*");
        k = Pattern.compile((String)"(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        l = Pattern.compile((String)"(\\d{1,2})[^\\d]*");
        m = Pattern.compile((String)"(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }

    private n(String string, String string2, long l, String string3, String string4, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.a = string;
        this.b = string2;
        this.c = l;
        this.d = string3;
        this.e = string4;
        this.f = bl;
        this.g = bl2;
        this.h = bl3;
        this.i = bl4;
    }

    public /* synthetic */ n(String string, String string2, long l, String string3, String string4, boolean bl, boolean bl2, boolean bl3, boolean bl4, g g2) {
        this(string, string2, l, string3, string4, bl, bl2, bl3, bl4);
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof n) {
            n n2 = (n)object;
            if (j.a((Object)n2.a, (Object)this.a) && j.a((Object)n2.b, (Object)this.b) && n2.c == this.c && j.a((Object)n2.d, (Object)this.d) && j.a((Object)n2.e, (Object)this.e) && n2.f == this.f && n2.g == this.g && n2.h == this.h && n2.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('=');
        stringBuilder.append(this.b);
        if (this.h) {
            if (this.c == Long.MIN_VALUE) {
                stringBuilder.append("; max-age=0");
            } else {
                stringBuilder.append("; expires=");
                stringBuilder.append(c.b((Date)new Date(this.c)));
            }
        }
        if (!this.i) {
            stringBuilder.append("; domain=");
            if (bl) {
                stringBuilder.append(".");
            }
            stringBuilder.append(this.d);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.e);
        if (this.f) {
            stringBuilder.append("; secure");
        }
        if (this.g) {
            stringBuilder.append("; httponly");
        }
        String string = stringBuilder.toString();
        j.b((Object)string, (String)"toString()");
        return string;
    }

    public final String g() {
        return this.b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (527 + this.a.hashCode()) + this.b.hashCode()) + l.a(this.c)) + this.d.hashCode()) + this.e.hashCode()) + m.a(this.f)) + m.a(this.g)) + m.a(this.h)) + m.a(this.i);
    }

    public String toString() {
        return this.f(false);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g2) {
            this();
        }

        private final int a(String string, int n2, int n3, boolean bl) {
            while (n2 < n3) {
                char c2 = string.charAt(n2);
                boolean bl2 = c2 < ' ' && c2 != '\t' || c2 >= '' || '0' <= c2 && '9' >= c2 || 'a' <= c2 && 'z' >= c2 || 'A' <= c2 && 'Z' >= c2 || c2 == ':';
                if (bl2 == (bl ^ true)) {
                    return n2;
                }
                ++n2;
            }
            return n3;
        }

        private final boolean b(String string, String string2) {
            if (j.a((Object)string, (Object)string2)) {
                return true;
            }
            return z7.g.g((String)string, (String)string2, (boolean)false, (int)2, null) && string.charAt(string.length() - string2.length() - 1) == '.' && !b.f((String)string);
        }

        private final String f(String string) {
            if (true ^ z7.g.g((String)string, (String)".", (boolean)false, (int)2, null)) {
                String string2 = b8.a.e((String)z7.g.X((String)string, (CharSequence)"."));
                if (string2 != null) {
                    return string2;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private final long g(String string, int n2, int n3) {
            boolean bl;
            int n4 = this.a(string, n2, n3, false);
            Matcher matcher = m.matcher((CharSequence)string);
            int n5 = -1;
            int n6 = -1;
            int n7 = -1;
            int n8 = -1;
            int n9 = -1;
            int n10 = -1;
            while (n4 < n3) {
                int n11 = this.a(string, n4 + 1, n3, true);
                matcher.region(n4, n11);
                if (n6 == -1 && matcher.usePattern(m).matches()) {
                    String string2 = matcher.group(1);
                    j.b((Object)string2, (String)"matcher.group(1)");
                    n6 = Integer.parseInt((String)string2);
                    String string3 = matcher.group(2);
                    j.b((Object)string3, (String)"matcher.group(2)");
                    n9 = Integer.parseInt((String)string3);
                    String string4 = matcher.group(3);
                    j.b((Object)string4, (String)"matcher.group(3)");
                    n10 = Integer.parseInt((String)string4);
                } else if (n7 == -1 && matcher.usePattern(l).matches()) {
                    String string5 = matcher.group(1);
                    j.b((Object)string5, (String)"matcher.group(1)");
                    n7 = Integer.parseInt((String)string5);
                } else if (n8 == -1 && matcher.usePattern(k).matches()) {
                    String string6 = matcher.group(1);
                    j.b((Object)string6, (String)"matcher.group(1)");
                    Locale locale = Locale.US;
                    j.b((Object)locale, (String)"Locale.US");
                    if (string6 == null) throw new j7.n("null cannot be cast to non-null type java.lang.String");
                    String string7 = string6.toLowerCase(locale);
                    j.b((Object)string7, (String)"(this as java.lang.String).toLowerCase(locale)");
                    String string8 = k.pattern();
                    j.b((Object)string8, (String)"MONTH_PATTERN.pattern()");
                    n8 = z7.g.J((CharSequence)string8, (String)string7, (int)0, (boolean)false, (int)6, null) / 4;
                } else if (n5 == -1 && matcher.usePattern(j).matches()) {
                    String string9 = matcher.group(1);
                    j.b((Object)string9, (String)"matcher.group(1)");
                    n5 = Integer.parseInt((String)string9);
                }
                n4 = this.a(string, n11 + 1, n3, false);
            }
            if (70 <= n5 && 99 >= n5) {
                n5 += 1900;
            }
            if (n5 >= 0 && 69 >= n5) {
                n5 += 2000;
            }
            if (bl = n5 >= 1601) {
                boolean bl2 = n8 != -1;
                if (!bl2) throw new IllegalArgumentException("Failed requirement.".toString());
                boolean bl3 = 1 <= n7 && 31 >= n7;
                if (!bl3) throw new IllegalArgumentException("Failed requirement.".toString());
                boolean bl4 = n6 >= 0 && 23 >= n6;
                if (!bl4) throw new IllegalArgumentException("Failed requirement.".toString());
                boolean bl5 = n9 >= 0 && 59 >= n9;
                if (!bl5) throw new IllegalArgumentException("Failed requirement.".toString());
                boolean bl6 = n10 >= 0 && 59 >= n10;
                if (!bl6) throw new IllegalArgumentException("Failed requirement.".toString());
                GregorianCalendar gregorianCalendar = new GregorianCalendar(b.e);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, n5);
                gregorianCalendar.set(2, n8 - 1);
                gregorianCalendar.set(5, n7);
                gregorianCalendar.set(11, n6);
                gregorianCalendar.set(12, n9);
                gregorianCalendar.set(13, n10);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed requirement.".toString());
            throw illegalArgumentException;
        }

        private final long h(String string) {
            try {
                long l = Long.parseLong((String)string);
                if (l <= 0L) {
                    return Long.MIN_VALUE;
                }
                return l;
            }
            catch (NumberFormatException numberFormatException) {
                if (new f("-?\\d+").a((CharSequence)string)) {
                    if (z7.g.t((String)string, (String)"-", (boolean)false, (int)2, null)) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw numberFormatException;
            }
        }

        public final n c(v v2, String string) {
            j.f((Object)v2, (String)"url");
            j.f((Object)string, (String)"setCookie");
            return this.d(System.currentTimeMillis(), v2, string);
        }

        /*
         * Exception decompiling
         */
        public final n d(long var1, v var3, String var4) {
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

        public final List<n> e(v v2, u u2) {
            j.f((Object)v2, (String)"url");
            j.f((Object)u2, (String)"headers");
            List<String> list = u2.g("Set-Cookie");
            int n2 = list.size();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < n2; ++i2) {
                n n3 = this.c(v2, (String)list.get(i2));
                if (n3 == null) continue;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Object)n3);
            }
            if (arrayList != null) {
                List list2 = Collections.unmodifiableList(arrayList);
                j.b((Object)list2, (String)"Collections.unmodifiableList(cookies)");
                return list2;
            }
            return k.f();
        }
    }

}


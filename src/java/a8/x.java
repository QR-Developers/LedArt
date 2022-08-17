/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j7.n
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.Locale
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  u7.g
 *  u7.j
 *  z7.g
 */
package a8;

import j7.n;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u7.g;
import u7.j;

public final class x {
    private static final Pattern e;
    private static final Pattern f;
    public static final a g;
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    static {
        g = new a(null);
        e = Pattern.compile((String)"([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
        f = Pattern.compile((String)";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }

    private x(String string, String string2, String string3, String string4) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
    }

    public /* synthetic */ x(String string, String string2, String string3, String string4, g g2) {
        this(string, string2, string3, string4);
    }

    public static /* synthetic */ Charset d(x x2, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = null;
        }
        return x2.c(charset);
    }

    public static final x e(String string) {
        return g.a(string);
    }

    public static final x f(String string) {
        return g.b(string);
    }

    /*
     * Exception decompiling
     */
    public final Charset c(Charset var1) {
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

    public boolean equals(Object object) {
        return object instanceof x && j.a((Object)((x)object).a, (Object)this.a);
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g2) {
            this();
        }

        public final x a(String string) {
            IllegalArgumentException illegalArgumentException;
            block8 : {
                block9 : {
                    block10 : {
                        j.f((Object)string, (String)"$this$toMediaType");
                        Matcher matcher = e.matcher((CharSequence)string);
                        if (!matcher.lookingAt()) break block8;
                        String string2 = matcher.group(1);
                        j.b((Object)string2, (String)"typeSubtype.group(1)");
                        Locale locale = Locale.US;
                        j.b((Object)locale, (String)"Locale.US");
                        if (string2 == null) break block9;
                        String string3 = string2.toLowerCase(locale);
                        j.b((Object)string3, (String)"(this as java.lang.String).toLowerCase(locale)");
                        String string4 = matcher.group(2);
                        j.b((Object)string4, (String)"typeSubtype.group(2)");
                        j.b((Object)locale, (String)"Locale.US");
                        if (string4 == null) break block10;
                        String string5 = string4.toLowerCase(locale);
                        j.b((Object)string5, (String)"(this as java.lang.String).toLowerCase(locale)");
                        Matcher matcher2 = f.matcher((CharSequence)string);
                        int n2 = matcher.end();
                        String string6 = null;
                        while (n2 < string.length()) {
                            block11 : {
                                block12 : {
                                    String string7;
                                    boolean bl;
                                    block14 : {
                                        block13 : {
                                            matcher2.region(n2, string.length());
                                            if (!matcher2.lookingAt()) break block11;
                                            String string8 = matcher2.group(1);
                                            if (string8 == null || !z7.g.h((String)string8, (String)"charset", (boolean)true)) break block12;
                                            string7 = matcher2.group(2);
                                            if (string7 == null) {
                                                string7 = matcher2.group(3);
                                                j.b((Object)string7, (String)"parameter.group(3)");
                                            } else if (z7.g.t((String)string7, (String)"'", (boolean)false, (int)2, null) && z7.g.g((String)string7, (String)"'", (boolean)false, (int)2, null) && string7.length() > 2) {
                                                string7 = string7.substring(1, string7.length() - 1);
                                                j.b((Object)string7, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                            }
                                            if (string6 == null) break block13;
                                            boolean bl2 = z7.g.h((String)string7, string6, (boolean)true);
                                            bl = false;
                                            if (!bl2) break block14;
                                        }
                                        bl = true;
                                    }
                                    if (bl) {
                                        int n3 = matcher2.end();
                                        string6 = string7;
                                        n2 = n3;
                                        continue;
                                    }
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Multiple charsets defined: \"");
                                    stringBuilder.append(string6);
                                    stringBuilder.append("\" and: \"");
                                    stringBuilder.append(string7);
                                    stringBuilder.append("\" for: \"");
                                    stringBuilder.append(string);
                                    stringBuilder.append('\"');
                                    throw new IllegalArgumentException(stringBuilder.toString().toString());
                                }
                                n2 = matcher2.end();
                                continue;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Parameter is not formatted correctly: \"");
                            String string9 = string.substring(n2);
                            j.b((Object)string9, (String)"(this as java.lang.String).substring(startIndex)");
                            stringBuilder.append(string9);
                            stringBuilder.append("\" for: \"");
                            stringBuilder.append(string);
                            stringBuilder.append('\"');
                            throw new IllegalArgumentException(stringBuilder.toString().toString());
                        }
                        x x2 = new x(string, string3, string5, string6, null);
                        return x2;
                    }
                    throw new n("null cannot be cast to non-null type java.lang.String");
                }
                throw new n("null cannot be cast to non-null type java.lang.String");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found for: \"");
            stringBuilder.append(string);
            stringBuilder.append('\"');
            illegalArgumentException = new IllegalArgumentException(stringBuilder.toString().toString());
            throw illegalArgumentException;
        }

        public final x b(String string) {
            j.f((Object)string, (String)"$this$toMediaTypeOrNull");
            try {
                x x2 = this.a(string);
                return x2;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
    }

}


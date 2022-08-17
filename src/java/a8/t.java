/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.g0
 *  a8.h
 *  b8.b
 *  j7.e
 *  j7.f
 *  java.lang.Object
 *  java.lang.String
 *  java.security.Principal
 *  java.security.cert.Certificate
 *  java.security.cert.X509Certificate
 *  java.util.Arrays
 *  java.util.List
 *  javax.net.ssl.SSLSession
 *  k7.k
 *  t7.a
 *  u7.g
 *  u7.j
 *  u7.m
 *  u7.n
 *  u7.s
 *  x7.c
 *  x7.e
 */
package a8;

import a8.g0;
import a8.h;
import b8.b;
import j7.f;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSession;
import k7.k;
import u7.g;
import u7.j;
import u7.m;
import u7.n;
import u7.s;
import x7.c;
import x7.e;

public final class t {
    static final /* synthetic */ e[] e;
    public static final a f;
    private final j7.e a;
    private final g0 b;
    private final h c;
    private final List<Certificate> d;

    static {
        e[] arre = new e[]{s.c((m)new n((c)s.a(t.class), "peerCertificates", "peerCertificates()Ljava/util/List;"))};
        e = arre;
        f = new a(null);
    }

    public t(g0 g02, h h2, List<? extends Certificate> list, t7.a<? extends List<? extends Certificate>> a2) {
        j.f((Object)g02, (String)"tlsVersion");
        j.f((Object)h2, (String)"cipherSuite");
        j.f(list, (String)"localCertificates");
        j.f(a2, (String)"peerCertificatesFn");
        this.b = g02;
        this.c = h2;
        this.d = list;
        this.a = f.a(a2);
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate)certificate).getSubjectDN().toString();
        }
        String string = certificate.getType();
        j.b((Object)string, (String)"type");
        return string;
    }

    public final h a() {
        return this.c;
    }

    public final List<Certificate> c() {
        return this.d;
    }

    public final List<Certificate> d() {
        j7.e e2 = this.a;
        e[0];
        return (List)e2.getValue();
    }

    public final g0 e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object instanceof t) {
            t t2 = (t)object;
            if (t2.b == this.b && j.a((Object)t2.c, (Object)this.c) && j.a(t2.d(), this.d()) && j.a(t2.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * (31 * (31 * (527 + this.b.hashCode()) + this.c.hashCode()) + this.d().hashCode()) + this.d.hashCode();
    }

    /*
     * Exception decompiling
     */
    public String toString() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl32 : NEW : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g2) {
            this();
        }

        private final List<Certificate> b(Certificate[] arrcertificate) {
            if (arrcertificate != null) {
                return b.t((Object[])((Certificate[])Arrays.copyOf((Object[])arrcertificate, (int)arrcertificate.length)));
            }
            return k.f();
        }

        /*
         * Exception decompiling
         */
        public final t a(SSLSession var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl53 : NEW : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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
    }

}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.Spanned
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextUtils
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.AlignmentSpan
 *  android.text.style.AlignmentSpan$Standard
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.BulletSpan
 *  android.text.style.CharacterStyle
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.ImageSpan
 *  android.text.style.ParagraphStyle
 *  android.text.style.QuoteSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.SubscriptSpan
 *  android.text.style.SuperscriptSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.URLSpan
 *  android.text.style.UnderlineSpan
 *  android.util.Log
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.Map
 *  m5.r$b$a
 *  m5.r$b$b
 *  m5.r$b$c
 *  m5.r$b$d
 *  m5.r$b$e
 *  m5.r$b$f
 *  m5.r$b$g
 *  m5.r$b$h
 *  m5.r$b$i
 *  m5.r$b$j
 *  m5.r$b$k
 *  m5.r$b$m
 *  m5.r$b$n
 *  m5.r$b$o
 *  m5.r$b$p
 *  m5.r$b$q
 *  m5.r$b$r
 *  m5.r$b$s
 *  m5.r$b$t
 *  n8.f
 *  n8.h
 *  org.xml.sax.Attributes
 *  org.xml.sax.ContentHandler
 *  org.xml.sax.InputSource
 *  org.xml.sax.Locator
 *  org.xml.sax.SAXException
 *  org.xml.sax.SAXNotRecognizedException
 *  org.xml.sax.SAXNotSupportedException
 *  org.xml.sax.XMLReader
 */
package m5;

import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.ParagraphStyle;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import m5.r;
import n8.f;
import n8.h;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

public class r {
    public static Spanned a(String string2) {
        return r.b(string2, 256, null);
    }

    public static Spanned b(String string2, int n5, d d4) {
        h h4 = new h();
        try {
            h4.setProperty("http://www.ccil.org/~cowan/tagsoup/properties/schema", (Object)a.a);
        }
        catch (SAXNotSupportedException sAXNotSupportedException) {
            throw new RuntimeException((Throwable)sAXNotSupportedException);
        }
        catch (SAXNotRecognizedException sAXNotRecognizedException) {
            throw new RuntimeException((Throwable)sAXNotRecognizedException);
        }
        return new b(string2, d4, h4, n5).b();
    }

    public static String c(Spanned spanned) {
        return r.d(spanned, 0);
    }

    public static String d(Spanned spanned, int n5) {
        return c.a(spanned, n5);
    }

    private static class a {
        private static final f a = new f();
    }

    /*
     * Exception performing whole class analysis.
     * Exception performing whole class analysis ignored.
     */
    private static class m5.r$b
    implements ContentHandler {
        private static final float[] g;
        private static final Map<String, Integer> h;
        private String a;
        private XMLReader b;
        private SpannableStringBuilder c;
        private m5.r$d d;
        private int e;
        private int f;

        static {
            HashMap hashMap;
            g = new float[]{1.5f, 1.4f, 1.3f, 1.2f, 1.1f, 1.0f};
            h = hashMap = new HashMap();
            Integer n5 = -5658199;
            hashMap.put((Object)"darkgray", (Object)n5);
            Integer n6 = -8355712;
            hashMap.put((Object)"gray", (Object)n6);
            Integer n7 = -2894893;
            hashMap.put((Object)"lightgray", (Object)n7);
            hashMap.put((Object)"darkgrey", (Object)n5);
            hashMap.put((Object)"grey", (Object)n6);
            hashMap.put((Object)"lightgrey", (Object)n7);
            hashMap.put((Object)"green", (Object)-16744448);
        }

        public m5.r$b(String string2, m5.r$d d4, n8.h h4, int n5) {
            this.a = string2;
            this.c = new SpannableStringBuilder();
            this.d = d4;
            this.b = h4;
            this.e = n5;
        }

        private static void A(Spannable spannable) {
            int n5 = spannable.length();
            Object[] arrobject = spannable.getSpans(0, n5, Object.class);
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < arrobject.length; ++i5) {
                if (arrayList.contains((Object)i5)) continue;
                Object object = arrobject[i5];
                int n6 = spannable.getSpanStart(object);
                int n7 = spannable.getSpanEnd(object);
                for (int i6 = i5 + 1; i6 < arrobject.length; ++i6) {
                    if (arrayList.contains((Object)i6)) continue;
                    Object object2 = arrobject[i6];
                    int n8 = spannable.getSpanStart(object2);
                    int n9 = spannable.getSpanEnd(object2);
                    if (object.getClass() != object2.getClass() || n6 > n8 || n7 < n9) continue;
                    if (object2 instanceof StyleSpan) {
                        if (((StyleSpan)object2).getStyle() != ((StyleSpan)object).getStyle()) continue;
                        arrayList.add((Object)i6);
                        continue;
                    }
                    arrayList.add((Object)i6);
                }
            }
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                spannable.removeSpan(arrobject[(Integer)iterator.next()]);
            }
        }

        private static void B(Spannable spannable) {
            Object[] arrobject = spannable.getSpans(0, spannable.length(), Object.class);
            for (int i5 = -1 + arrobject.length; i5 >= 0; --i5) {
                Object object = arrobject[i5];
                if (object instanceof l) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("reverseSpan: unexpected span: ");
                    stringBuilder.append(object);
                    Log.d((String)"HtmlConverter", (String)stringBuilder.toString());
                    spannable.removeSpan(object);
                    continue;
                }
                int n5 = spannable.getSpanStart(object);
                int n6 = spannable.getSpanEnd(object);
                int n7 = spannable.getSpanFlags(object);
                spannable.removeSpan(object);
                spannable.setSpan(object, n5, n6, n7);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("(");
                stringBuilder.append(n5);
                stringBuilder.append(", ");
                stringBuilder.append(n6);
                stringBuilder.append(") -> ");
                stringBuilder.append(m5.r$b.D(object));
                Log.d((String)"HtmlConverter", (String)stringBuilder.toString());
            }
        }

        private static /* varargs */ void C(Spannable spannable, Object object, Object ... arrobject) {
            int n5 = spannable.getSpanStart(object);
            spannable.removeSpan(object);
            int n6 = spannable.length();
            if (n5 != n6) {
                int n7 = arrobject.length;
                for (int i5 = 0; i5 < n7; ++i5) {
                    spannable.setSpan(arrobject[i5], n5, n6, 33);
                }
            }
        }

        private static String D(Object object) {
            if (object instanceof AbsoluteSizeSpan) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AbsoluteSizeSpan: ");
                stringBuilder.append(((AbsoluteSizeSpan)object).getSize());
                return stringBuilder.toString();
            }
            if (object instanceof ForegroundColorSpan) {
                int n5 = ((ForegroundColorSpan)object).getForegroundColor();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ForegroundColorSpan: ");
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{n5 & 16777215};
                stringBuilder.append(String.format((Locale)locale, (String)"#%06X", (Object[])arrobject));
                return stringBuilder.toString();
            }
            if (object instanceof BackgroundColorSpan) {
                int n6 = ((BackgroundColorSpan)object).getBackgroundColor();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("BackgroundColorSpan: ");
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{n6 & 16777215};
                stringBuilder.append(String.format((Locale)locale, (String)"#%06X", (Object[])arrobject));
                return stringBuilder.toString();
            }
            if (object instanceof StyleSpan) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("StyleSpan: ");
                stringBuilder.append(((StyleSpan)object).getStyle());
                return stringBuilder.toString();
            }
            return object.getClass().getSimpleName();
        }

        private void E(Editable editable, Object object) {
            int n5 = editable.length();
            editable.setSpan(object, n5, n5, 17);
        }

        private void F(Editable editable, Attributes attributes) {
            String string2 = attributes.getValue("", "href");
            this.E(editable, (Object)new /* Unavailable Anonymous Inner Class!! */);
        }

        private void G(Editable editable, Attributes attributes, int n5) {
            Layout.Alignment alignment;
            String string2;
            String string3;
            if (n5 > 0) {
                m5.r$b.a(editable, n5);
                this.E(editable, (Object)new /* Unavailable Anonymous Inner Class!! */);
            }
            if ((alignment = m5.r$b.x(string3 = (string2 = attributes.getValue("", "style")) != null ? this.k(string2, "text-align") : attributes.getValue("", "align"))) != null) {
                this.E(editable, (Object)new /* Unavailable Anonymous Inner Class!! */);
            }
        }

        private void H(Editable editable, Attributes attributes) {
            this.G(editable, attributes, this.o());
            this.E(editable, (Object)new /* Unavailable Anonymous Inner Class!! */);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        private void I(Editable var1_1, Attributes var2_2) {
            var3_3 = var2_2.getValue("", "style");
            if (var3_3 == null) {
                return;
            }
            var4_4 = var3_3.split("[;]");
            var5_5 = var4_4.length;
            var6_6 = 0;
            while (var6_6 < var5_5) {
                block24 : {
                    block25 : {
                        block26 : {
                            var7_7 = var4_4[var6_6].split("[:]");
                            var8_8 = var7_7.length;
                            if (var8_8 != (var9_9 = 2)) break block24;
                            var10_10 = var7_7[0].trim();
                            var11_11 = var7_7[1].trim();
                            var10_10.hashCode();
                            switch (var10_10.hashCode()) {
                                case 746232421: {
                                    if (!var10_10.equals((Object)"text-align")) break;
                                    var9_9 = 7;
                                    ** break;
                                }
                                case 605322756: {
                                    if (!var10_10.equals((Object)"background-color")) break;
                                    var9_9 = 6;
                                    ** break;
                                }
                                case 598800822: {
                                    if (!var10_10.equals((Object)"font-weight")) break;
                                    var9_9 = 5;
                                    ** break;
                                }
                                case 431477072: {
                                    if (!var10_10.equals((Object)"text-decoration")) break;
                                    var9_9 = 4;
                                    ** break;
                                }
                                case 108532386: {
                                    if (!var10_10.equals((Object)"font-family")) break;
                                    var9_9 = 3;
                                    ** break;
                                }
                                case 94842723: {
                                    if (!var10_10.equals((Object)"color")) {
                                        break;
                                    }
                                    break block25;
                                }
                                case -1586082113: {
                                    if (!var10_10.equals((Object)"font-size")) break;
                                    var9_9 = 1;
                                    ** break;
                                }
                                case -1923578189: {
                                    if (var10_10.equals((Object)"font-style")) break block26;
                                }
                            }
                            var9_9 = -1;
                            ** break;
                        }
                        var9_9 = 0;
                    }
                    switch (var9_9) {
                        default: {
                            break;
                        }
                        case 7: {
                            var16_15 = m5.r$b.x(var11_11);
                            if (var16_15 == null) break;
                            this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                            break;
                        }
                        case 6: {
                            var15_14 = this.l(var11_11);
                            if (var15_14 == -1) break;
                            this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                            break;
                        }
                        case 5: {
                            if (!"bold".equalsIgnoreCase(var11_11)) break;
                            this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                            break;
                        }
                        case 4: {
                            if ("line-through".equalsIgnoreCase(var11_11)) {
                                this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                                break;
                            }
                            if (!"underline".equalsIgnoreCase(var11_11)) break;
                            this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                            break;
                        }
                        case 3: {
                            this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                            break;
                        }
                        case 2: {
                            var14_13 = this.l(var11_11);
                            if (var14_13 == 0) break;
                            this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                            break;
                        }
                        case 1: {
                            var13_12 = m5.r$b.y(var11_11);
                            if (var13_12 == -1) break;
                            this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                            break;
                        }
                        case 0: {
                            if (!"italic".equalsIgnoreCase(var11_11) && !"oblique".equalsIgnoreCase(var11_11)) break;
                            this.E(var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                        }
                    }
                }
                ++var6_6;
            }
        }

        private void J(Editable editable, Attributes attributes) {
            int n5;
            String string2 = attributes.getValue("", "color");
            String string3 = attributes.getValue("", "face");
            if (!TextUtils.isEmpty((CharSequence)string2) && (n5 = this.l(string2)) != -1) {
                this.E(editable, (Object)new /* Unavailable Anonymous Inner Class!! */);
            }
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                this.E(editable, (Object)new /* Unavailable Anonymous Inner Class!! */);
            }
        }

        private void K(Editable editable, Attributes attributes, int n5) {
            this.G(editable, attributes, this.q());
            this.E(editable, (Object)new /* Unavailable Anonymous Inner Class!! */);
        }

        private void L(Editable editable, Attributes attributes) {
            this.G(editable, attributes, this.s());
            this.E(editable, (Object)new /* Unavailable Anonymous Inner Class!! */);
            this.I(editable, attributes);
        }

        private static void M(SpannableStringBuilder spannableStringBuilder) {
            for (int i5 = -1 + spannableStringBuilder.length(); i5 >= 0; --i5) {
                if (spannableStringBuilder.charAt(i5) != '\n') {
                    return;
                }
                spannableStringBuilder.delete(i5, i5 + 1);
            }
        }

        private static void a(Editable editable, int n5) {
            int n6 = editable.length();
            if (n6 == 0) {
                return;
            }
            int n7 = 0;
            for (int i5 = n6 - 1; i5 >= 0 && editable.charAt(i5) == '\n'; --i5) {
                ++n7;
            }
            while (n7 < n5) {
                editable.append((CharSequence)"\n");
                ++n7;
            }
        }

        private void c(Editable editable, Class class_, Object object) {
            editable.length();
            T t2 = this.m((Spanned)editable, class_);
            if (t2 != null) {
                m5.r$b.C((Spannable)editable, t2, object);
            }
        }

        private void d(Editable editable) {
            k k3 = this.m((Spanned)editable, k.class);
            if (k3 != null && k3.b != null) {
                Object[] arrobject = new Object[]{new URLSpan(k3.b)};
                m5.r$b.C((Spannable)editable, (Object)k3, arrobject);
            }
        }

        private void e(Editable editable) {
            a a3;
            o o2 = this.m((Spanned)editable, o.class);
            if (o2 != null) {
                m5.r$b.a(editable, o.a(o2));
                editable.removeSpan((Object)o2);
            }
            if ((a3 = this.m((Spanned)editable, a.class)) != null) {
                Object[] arrobject = new Object[]{new AlignmentSpan.Standard(a.a(a3))};
                m5.r$b.C((Spannable)editable, (Object)a3, arrobject);
            }
        }

        private void f(Editable editable) {
            this.e(editable);
            this.c(editable, d.class, (Object)new QuoteSpan());
        }

        private void g(Editable editable) {
            e e5;
            h h4;
            b b3;
            t t2;
            m m5;
            i i5;
            a a3;
            q q2;
            g g4 = this.m((Spanned)editable, g.class);
            if (g4 != null) {
                Object[] arrobject = new Object[]{new TypefaceSpan(g4.b)};
                m5.r$b.C((Spannable)editable, (Object)g4, arrobject);
            }
            if ((h4 = this.m((Spanned)editable, h.class)) != null) {
                Object[] arrobject = new Object[]{new AbsoluteSizeSpan(h4.b)};
                m5.r$b.C((Spannable)editable, (Object)h4, arrobject);
            }
            if ((e5 = this.m((Spanned)editable, e.class)) != null) {
                Object[] arrobject = new Object[]{new StyleSpan(1)};
                m5.r$b.C((Spannable)editable, (Object)e5, arrobject);
            }
            if ((m5 = this.m((Spanned)editable, m.class)) != null) {
                Object[] arrobject = new Object[]{new StyleSpan(2)};
                m5.r$b.C((Spannable)editable, (Object)m5, arrobject);
            }
            if ((t2 = this.m((Spanned)editable, t.class)) != null) {
                Object[] arrobject = new Object[]{new UnderlineSpan()};
                m5.r$b.C((Spannable)editable, (Object)t2, arrobject);
            }
            if ((q2 = this.m((Spanned)editable, q.class)) != null) {
                Object[] arrobject = new Object[]{new StrikethroughSpan()};
                m5.r$b.C((Spannable)editable, (Object)q2, arrobject);
            }
            if ((a3 = this.m((Spanned)editable, a.class)) != null) {
                Object[] arrobject = new Object[]{new AlignmentSpan.Standard(a.a(a3))};
                m5.r$b.C((Spannable)editable, (Object)a3, arrobject);
            }
            if ((i5 = this.m((Spanned)editable, i.class)) != null) {
                Object[] arrobject = new Object[]{new ForegroundColorSpan(i.a(i5))};
                m5.r$b.C((Spannable)editable, (Object)i5, arrobject);
            }
            if ((b3 = this.m((Spanned)editable, b.class)) != null) {
                Object[] arrobject = new Object[]{new BackgroundColorSpan(b.a(b3))};
                m5.r$b.C((Spannable)editable, (Object)b3, arrobject);
            }
        }

        private void h(Editable editable) {
            i i5;
            g g4 = this.m((Spanned)editable, g.class);
            if (g4 != null) {
                Object[] arrobject = new Object[]{new TypefaceSpan(g4.b)};
                m5.r$b.C((Spannable)editable, (Object)g4, arrobject);
            }
            if ((i5 = this.m((Spanned)editable, i.class)) != null) {
                Object[] arrobject = new Object[]{new ForegroundColorSpan(i.a(i5))};
                m5.r$b.C((Spannable)editable, (Object)i5, arrobject);
            }
        }

        private void i(Editable editable) {
            j j5 = this.m((Spanned)editable, j.class);
            if (j5 != null) {
                Object[] arrobject = new Object[]{new RelativeSizeSpan(g[j.a(j5)]), new StyleSpan(1)};
                m5.r$b.C((Spannable)editable, (Object)j5, arrobject);
            }
            this.e(editable);
        }

        private void j(Editable editable) {
            this.g(editable);
            this.e(editable);
            this.c(editable, f.class, (Object)new BulletSpan());
        }

        private String k(String string2, String string3) {
            String[] arrstring = string2.split("[;]");
            int n5 = arrstring.length;
            for (int i5 = 0; i5 < n5; ++i5) {
                String[] arrstring2 = arrstring[i5].split("[:]");
                if (arrstring2.length != 2 || !string3.equals((Object)arrstring2[0].trim())) continue;
                return arrstring2[1].trim();
            }
            return null;
        }

        private int l(String string2) {
            Integer n5;
            if ((256 & this.e) == 256 && (n5 = (Integer)h.get((Object)string2.toLowerCase(Locale.US))) != null) {
                return n5;
            }
            return m5.r$b.z(string2);
        }

        private <T extends l> T m(Spanned spanned, Class<T> class_) {
            l[] arrl = (l[])spanned.getSpans(0, spanned.length(), class_);
            for (int i5 = -1 + arrl.length; i5 >= 0; --i5) {
                l l3 = arrl[i5];
                if (l3.a != this.f) continue;
                return (T)l3;
            }
            return null;
        }

        private int n(int n5) {
            if ((n5 & this.e) != 0) {
                return 1;
            }
            return 2;
        }

        private int o() {
            return this.n(32);
        }

        private int p() {
            return 1;
        }

        private int q() {
            return this.n(2);
        }

        private int r() {
            return this.n(8);
        }

        private int s() {
            return this.n(4);
        }

        private int t() {
            return this.n(1);
        }

        private void u(Editable editable) {
            editable.append('\n');
        }

        private void v(String string2) {
            --this.f;
            if (string2.equalsIgnoreCase("br")) {
                this.u((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("p")) {
                this.g((Editable)this.c);
                this.e((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("ul")) {
                this.e((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("li")) {
                this.j((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("div")) {
                this.e((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("span")) {
                this.g((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("strong")) {
                this.c((Editable)this.c, e.class, (Object)new StyleSpan(1));
                return;
            }
            if (string2.equalsIgnoreCase("b")) {
                this.c((Editable)this.c, e.class, (Object)new StyleSpan(1));
                return;
            }
            if (string2.equalsIgnoreCase("em")) {
                this.c((Editable)this.c, m.class, (Object)new StyleSpan(2));
                return;
            }
            if (string2.equalsIgnoreCase("cite")) {
                this.c((Editable)this.c, m.class, (Object)new StyleSpan(2));
                return;
            }
            if (string2.equalsIgnoreCase("dfn")) {
                this.c((Editable)this.c, m.class, (Object)new StyleSpan(2));
                return;
            }
            if (string2.equalsIgnoreCase("i")) {
                this.c((Editable)this.c, m.class, (Object)new StyleSpan(2));
                return;
            }
            if (string2.equalsIgnoreCase("big")) {
                this.c((Editable)this.c, c.class, (Object)new RelativeSizeSpan(1.25f));
                return;
            }
            if (string2.equalsIgnoreCase("small")) {
                this.c((Editable)this.c, p.class, (Object)new RelativeSizeSpan(0.8f));
                return;
            }
            if (string2.equalsIgnoreCase("font")) {
                this.h((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("blockquote")) {
                this.f((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("tt")) {
                this.c((Editable)this.c, n.class, (Object)new TypefaceSpan("monospace"));
                return;
            }
            if (string2.equalsIgnoreCase("a")) {
                this.d((Editable)this.c);
                return;
            }
            if (string2.equalsIgnoreCase("u")) {
                this.c((Editable)this.c, t.class, (Object)new UnderlineSpan());
                return;
            }
            if (string2.equalsIgnoreCase("del")) {
                this.c((Editable)this.c, q.class, (Object)new StrikethroughSpan());
                return;
            }
            if (string2.equalsIgnoreCase("s")) {
                this.c((Editable)this.c, q.class, (Object)new StrikethroughSpan());
                return;
            }
            if (string2.equalsIgnoreCase("strike")) {
                this.c((Editable)this.c, q.class, (Object)new StrikethroughSpan());
                return;
            }
            if (string2.equalsIgnoreCase("sup")) {
                this.c((Editable)this.c, s.class, (Object)new SuperscriptSpan());
                return;
            }
            if (string2.equalsIgnoreCase("sub")) {
                this.c((Editable)this.c, r.class, (Object)new SubscriptSpan());
                return;
            }
            if (string2.length() == 2 && Character.toLowerCase((char)string2.charAt(0)) == 'h' && string2.charAt(1) >= '1' && string2.charAt(1) <= '6') {
                this.i((Editable)this.c);
                return;
            }
            m5.r$d d4 = this.d;
            if (d4 != null) {
                d4.a(false, string2, (Editable)this.c, this.b);
            }
        }

        private void w(String string2, Attributes attributes) {
            if (!string2.equalsIgnoreCase("br")) {
                if (string2.equalsIgnoreCase("p")) {
                    this.G((Editable)this.c, attributes, this.t());
                    this.I((Editable)this.c, attributes);
                } else if (string2.equalsIgnoreCase("ul")) {
                    this.G((Editable)this.c, attributes, this.r());
                } else if (string2.equalsIgnoreCase("li")) {
                    this.L((Editable)this.c, attributes);
                } else if (string2.equalsIgnoreCase("div")) {
                    this.G((Editable)this.c, attributes, this.p());
                } else if (string2.equalsIgnoreCase("span")) {
                    this.I((Editable)this.c, attributes);
                } else if (string2.equalsIgnoreCase("strong")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("b")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("em")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("cite")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("dfn")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("i")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("big")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("small")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("font")) {
                    this.J((Editable)this.c, attributes);
                } else if (string2.equalsIgnoreCase("blockquote")) {
                    this.H((Editable)this.c, attributes);
                } else if (string2.equalsIgnoreCase("tt")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("a")) {
                    this.F((Editable)this.c, attributes);
                } else if (string2.equalsIgnoreCase("u")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("del")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("s")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("strike")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("sup")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.equalsIgnoreCase("sub")) {
                    this.E((Editable)this.c, (Object)new /* Unavailable Anonymous Inner Class!! */);
                } else if (string2.length() == 2 && Character.toLowerCase((char)string2.charAt(0)) == 'h' && string2.charAt(1) >= '1' && string2.charAt(1) <= '6') {
                    this.K((Editable)this.c, attributes, string2.charAt(1) - 49);
                } else {
                    m5.r$d d4 = this.d;
                    if (d4 != null) {
                        d4.a(true, string2, (Editable)this.c, this.b);
                    }
                }
            }
            this.f = 1 + this.f;
        }

        private static Layout.Alignment x(String string2) {
            if (TextUtils.isEmpty((CharSequence)string2)) {
                return null;
            }
            if (!string2.equalsIgnoreCase("start") && !string2.equalsIgnoreCase("left")) {
                if (string2.equalsIgnoreCase("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (!string2.equalsIgnoreCase("end") && !string2.equalsIgnoreCase("right")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static int y(String string2) {
            if (string2 != null && string2.length() > 0) {
                try {
                    String string3 = string2.toLowerCase();
                    if (string3.endsWith("px")) {
                        return Integer.parseInt((String)string3.substring(0, -2 + string3.length()));
                    }
                    if (string3.endsWith("pt")) {
                        return (int)(0.5f + Float.parseFloat((String)string3.substring(0, -2 + string3.length())));
                    }
                    int n5 = Integer.parseInt((String)string3);
                    return n5;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            return -1;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private static int z(String string2) {
            int n5;
            int n6;
            int n7;
            try {
                int n8;
                boolean bl = string2.startsWith("#");
                if (bl) {
                    return -16777216 | Integer.parseInt((String)string2.replace((CharSequence)"#", (CharSequence)""), (int)16);
                }
                boolean bl2 = string2.startsWith("rgba");
                if (bl2) {
                    String[] arrstring = string2.replaceAll("[rgba()]", "").split("[,]");
                    int n9 = arrstring.length;
                    n8 = 0;
                    if (n9 != 4) return n8;
                    int n10 = Integer.parseInt((String)arrstring[0]);
                    int n11 = Integer.parseInt((String)arrstring[1]);
                    return Integer.parseInt((String)arrstring[2]) | (Integer.parseInt((String)arrstring[3]) << 24 | n10 << 16 | n11 << 8);
                }
                boolean bl3 = string2.startsWith("rgb");
                n8 = 0;
                if (!bl3) return n8;
                String[] arrstring = string2.replaceAll("[rgb()]", "").split("[,]");
                int n12 = arrstring.length;
                n8 = 0;
                if (n12 != 3) return n8;
                n6 = Integer.parseInt((String)arrstring[0]);
                n5 = Integer.parseInt((String)arrstring[1]);
                n7 = Integer.parseInt((String)arrstring[2]);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return 0;
            }
            return n7 | (-16777216 | n6 << 16 | n5 << 8);
        }

        public Spanned b() {
            this.b.setContentHandler((ContentHandler)this);
            try {
                this.b.parse(new InputSource((Reader)new StringReader(this.a)));
            }
            catch (SAXException sAXException) {
                throw new RuntimeException((Throwable)sAXException);
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
            m5.r$b.M(this.c);
            m5.r$b.A((Spannable)this.c);
            m5.r$b.B((Spannable)this.c);
            return this.c;
        }

        public void characters(char[] arrc, int n5, int n6) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i5 = 0; i5 < n6; ++i5) {
                int n7;
                char c4 = arrc[i5 + n5];
                if (c4 != ' ' && c4 != '\n') {
                    stringBuilder.append(c4);
                    continue;
                }
                int n8 = stringBuilder.length();
                int n9 = n8 == 0 ? ((n7 = this.c.length()) == 0 ? 10 : (int)this.c.charAt(n7 - 1)) : stringBuilder.charAt(n8 - 1);
                if (n9 == 32 || n9 == 10) continue;
                stringBuilder.append(' ');
            }
            this.c.append((CharSequence)stringBuilder);
        }

        public void endDocument() {
        }

        public void endElement(String string2, String string3, String string4) {
            this.v(string3);
        }

        public void endPrefixMapping(String string2) {
        }

        public void ignorableWhitespace(char[] arrc, int n5, int n6) {
        }

        public void processingInstruction(String string2, String string3) {
        }

        public void setDocumentLocator(Locator locator) {
        }

        public void skippedEntity(String string2) {
        }

        public void startDocument() {
        }

        public void startElement(String string2, String string3, String string4, Attributes attributes) {
            this.w(string3, attributes);
        }

        public void startPrefixMapping(String string2, String string3) {
        }

        private static class l {
            public int a;

            public l(int n5) {
                this.a = n5;
            }
        }

    }

    private static class c {
        public static String a(Spanned spanned, int n5) {
            StringBuilder stringBuilder = new StringBuilder();
            c.i(stringBuilder, spanned, n5);
            return stringBuilder.toString();
        }

        /*
         * Enabled aggressive block sorting
         */
        private static void b(StringBuilder stringBuilder, Spanned spanned, int n5) {
            int n6 = spanned.length();
            int n7 = 0;
            while (n7 < n6) {
                int n8 = spanned.nextSpanTransition(n7, n6, ParagraphStyle.class);
                ParagraphStyle[] arrparagraphStyle = (ParagraphStyle[])spanned.getSpans(n7, n8, ParagraphStyle.class);
                String string2 = " ";
                boolean bl = false;
                for (int i5 = 0; i5 < arrparagraphStyle.length; ++i5) {
                    if (!(arrparagraphStyle[i5] instanceof AlignmentSpan)) continue;
                    Layout.Alignment alignment = ((AlignmentSpan)arrparagraphStyle[i5]).getAlignment();
                    if (alignment == Layout.Alignment.ALIGN_CENTER) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("align=\"center\" ");
                        stringBuilder2.append(string2);
                        string2 = stringBuilder2.toString();
                    } else if (alignment == Layout.Alignment.ALIGN_OPPOSITE) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("align=\"right\" ");
                        stringBuilder3.append(string2);
                        string2 = stringBuilder3.toString();
                    } else {
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append("align=\"left\" ");
                        stringBuilder4.append(string2);
                        string2 = stringBuilder4.toString();
                    }
                    bl = true;
                }
                if (bl) {
                    stringBuilder.append("<div ");
                    stringBuilder.append(string2);
                    stringBuilder.append(">");
                }
                c.h(stringBuilder, spanned, n7, n8, n5);
                if (bl) {
                    stringBuilder.append("</div>");
                }
                n7 = n8;
            }
            return;
        }

        private static String c(Spanned spanned, int n5, int n6) {
            if (Build.VERSION.SDK_INT >= 18 && TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl((CharSequence)spanned, n5, n6 - n5)) {
                return " dir=\"rtl\"";
            }
            return " dir=\"ltr\"";
        }

        private static String d(Spanned spanned, int n5, int n6, boolean bl, boolean bl2) {
            String string2 = bl ? "margin-top:0; margin-bottom:0;" : null;
            String string3 = null;
            if (bl2) {
                AlignmentSpan[] arralignmentSpan = (AlignmentSpan[])spanned.getSpans(n5, n6, AlignmentSpan.class);
                int n7 = -1 + arralignmentSpan.length;
                do {
                    string3 = null;
                    if (n7 < 0) break;
                    AlignmentSpan alignmentSpan = arralignmentSpan[n7];
                    if ((51 & spanned.getSpanFlags((Object)alignmentSpan)) == 51) {
                        Layout.Alignment alignment = alignmentSpan.getAlignment();
                        if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                            string3 = "text-align:start;";
                            break;
                        }
                        if (alignment == Layout.Alignment.ALIGN_CENTER) {
                            string3 = "text-align:center;";
                            break;
                        }
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                        string3 = null;
                        if (alignment != alignment2) break;
                        string3 = "text-align:end;";
                        break;
                    }
                    --n7;
                } while (true);
            }
            if (string2 == null && string3 == null) {
                return "";
            }
            StringBuilder stringBuilder = new StringBuilder(" style=\"");
            if (string2 != null && string3 != null) {
                stringBuilder.append(string2);
                stringBuilder.append(" ");
                stringBuilder.append(string3);
            } else if (string2 != null) {
                stringBuilder.append(string2);
            } else if (string3 != null) {
                stringBuilder.append(string3);
            }
            stringBuilder.append("\"");
            return stringBuilder.toString();
        }

        private static void e(StringBuilder stringBuilder, Spanned spanned, int n5, int n6, int n7) {
            if ((n7 & 1) == 0) {
                c.f(stringBuilder, spanned, n5, n6);
                return;
            }
            c.g(stringBuilder, spanned, n5, n6);
        }

        private static void f(StringBuilder stringBuilder, Spanned spanned, int n5, int n6) {
            stringBuilder.append("<p");
            stringBuilder.append(c.c(spanned, n5, n6));
            stringBuilder.append(">");
            int n7 = n5;
            while (n7 < n6) {
                int n8 = TextUtils.indexOf((CharSequence)spanned, (char)'\n', (int)n7, (int)n6);
                if (n8 < 0) {
                    n8 = n6;
                }
                int n9 = 0;
                while (n8 < n6 && spanned.charAt(n8) == '\n') {
                    ++n9;
                    ++n8;
                }
                c.j(stringBuilder, spanned, n7, n8 - n9);
                if (n9 == 1) {
                    stringBuilder.append("<br>\n");
                } else {
                    for (int i5 = 2; i5 < n9; ++i5) {
                        stringBuilder.append("<br>");
                    }
                    if (n8 != n6) {
                        stringBuilder.append("</p>\n");
                        stringBuilder.append("<p");
                        stringBuilder.append(c.c(spanned, n5, n6));
                        stringBuilder.append(">");
                    }
                }
                n7 = n8;
            }
            stringBuilder.append("</p>\n");
        }

        private static void g(StringBuilder stringBuilder, Spanned spanned, int n5, int n6) {
            boolean bl = false;
            while (n5 <= n6) {
                int n7 = TextUtils.indexOf((CharSequence)spanned, (char)'\n', (int)n5, (int)n6);
                if (n7 < 0) {
                    n7 = n6;
                }
                if (n7 == n5) {
                    if (bl) {
                        stringBuilder.append("</ul>\n");
                        bl = false;
                    }
                    stringBuilder.append("<br>\n");
                } else {
                    boolean bl2;
                    block9 : {
                        for (ParagraphStyle paragraphStyle : (ParagraphStyle[])spanned.getSpans(n5, n7, ParagraphStyle.class)) {
                            if ((51 & spanned.getSpanFlags((Object)paragraphStyle)) != 51 || !(paragraphStyle instanceof BulletSpan)) continue;
                            bl2 = true;
                            break block9;
                        }
                        bl2 = false;
                    }
                    if (bl2 && !bl) {
                        stringBuilder.append("<ul");
                        stringBuilder.append(c.d(spanned, n5, n7, true, false));
                        stringBuilder.append(">\n");
                        bl = true;
                    }
                    if (bl && !bl2) {
                        stringBuilder.append("</ul>\n");
                        bl = false;
                    }
                    String string2 = bl2 ? "li" : "p";
                    stringBuilder.append("<");
                    stringBuilder.append(string2);
                    stringBuilder.append(c.c(spanned, n5, n7));
                    stringBuilder.append(c.d(spanned, n5, n7, bl2 ^ true, true));
                    stringBuilder.append(">");
                    c.j(stringBuilder, spanned, n5, n7);
                    stringBuilder.append("</");
                    stringBuilder.append(string2);
                    stringBuilder.append(">\n");
                    if (n7 == n6 && bl) {
                        stringBuilder.append("</ul>\n");
                        bl = false;
                    }
                }
                n5 = n7 + 1;
            }
        }

        private static void h(StringBuilder stringBuilder, Spanned spanned, int n5, int n6, int n7) {
            while (n5 < n6) {
                int n8 = spanned.nextSpanTransition(n5, n6, QuoteSpan.class);
                QuoteSpan[] arrquoteSpan = (QuoteSpan[])spanned.getSpans(n5, n8, QuoteSpan.class);
                int n9 = arrquoteSpan.length;
                int n10 = 0;
                for (int i5 = 0; i5 < n9; ++i5) {
                    arrquoteSpan[i5];
                    stringBuilder.append("<blockquote>");
                }
                c.e(stringBuilder, spanned, n5, n8, n7);
                int n11 = arrquoteSpan.length;
                while (n10 < n11) {
                    arrquoteSpan[n10];
                    stringBuilder.append("</blockquote>\n");
                    ++n10;
                }
                n5 = n8;
            }
        }

        private static void i(StringBuilder stringBuilder, Spanned spanned, int n5) {
            if ((n5 & 1) == 0) {
                c.b(stringBuilder, spanned, n5);
                return;
            }
            c.h(stringBuilder, spanned, 0, spanned.length(), n5);
        }

        private static void j(StringBuilder stringBuilder, Spanned spanned, int n5, int n6) {
            while (n5 < n6) {
                int n7 = spanned.nextSpanTransition(n5, n6, CharacterStyle.class);
                CharacterStyle[] arrcharacterStyle = (CharacterStyle[])spanned.getSpans(n5, n7, CharacterStyle.class);
                for (int i5 = 0; i5 < arrcharacterStyle.length; ++i5) {
                    if (arrcharacterStyle[i5] instanceof StyleSpan) {
                        int n8 = ((StyleSpan)arrcharacterStyle[i5]).getStyle();
                        if ((n8 & 1) != 0) {
                            stringBuilder.append("<b>");
                        }
                        if ((n8 & 2) != 0) {
                            stringBuilder.append("<i>");
                        }
                    }
                    if (arrcharacterStyle[i5] instanceof TypefaceSpan) {
                        String string2 = ((TypefaceSpan)arrcharacterStyle[i5]).getFamily();
                        stringBuilder.append("<span style=\"font-family:");
                        stringBuilder.append(string2);
                        stringBuilder.append(";\">");
                    }
                    if (arrcharacterStyle[i5] instanceof SuperscriptSpan) {
                        stringBuilder.append("<sup>");
                    }
                    if (arrcharacterStyle[i5] instanceof SubscriptSpan) {
                        stringBuilder.append("<sub>");
                    }
                    if (arrcharacterStyle[i5] instanceof UnderlineSpan) {
                        stringBuilder.append("<u>");
                    }
                    if (arrcharacterStyle[i5] instanceof StrikethroughSpan) {
                        stringBuilder.append("<span style=\"text-decoration:line-through;\">");
                    }
                    if (arrcharacterStyle[i5] instanceof URLSpan) {
                        stringBuilder.append("<a href=\"");
                        stringBuilder.append(((URLSpan)arrcharacterStyle[i5]).getURL());
                        stringBuilder.append("\">");
                    }
                    if (arrcharacterStyle[i5] instanceof ImageSpan) {
                        stringBuilder.append("<img src=\"");
                        stringBuilder.append(((ImageSpan)arrcharacterStyle[i5]).getSource());
                        stringBuilder.append("\">");
                        n5 = n7;
                    }
                    if (arrcharacterStyle[i5] instanceof AbsoluteSizeSpan) {
                        float f4 = ((AbsoluteSizeSpan)arrcharacterStyle[i5]).getSize();
                        Locale locale = Locale.US;
                        Object[] arrobject = new Object[]{Float.valueOf((float)f4)};
                        stringBuilder.append(String.format((Locale)locale, (String)"<span style=\"font-size:%.0fpx;\">", (Object[])arrobject));
                    }
                    if (arrcharacterStyle[i5] instanceof RelativeSizeSpan) {
                        float f5 = ((RelativeSizeSpan)arrcharacterStyle[i5]).getSizeChange();
                        Locale locale = Locale.US;
                        Object[] arrobject = new Object[]{Float.valueOf((float)f5)};
                        stringBuilder.append(String.format((Locale)locale, (String)"<span style=\"font-size:%.2fem;\">", (Object[])arrobject));
                    }
                    if (arrcharacterStyle[i5] instanceof ForegroundColorSpan) {
                        int n9 = ((ForegroundColorSpan)arrcharacterStyle[i5]).getForegroundColor();
                        Locale locale = Locale.US;
                        Object[] arrobject = new Object[]{n9 & 16777215};
                        stringBuilder.append(String.format((Locale)locale, (String)"<span style=\"color:#%06X;\">", (Object[])arrobject));
                    }
                    if (!(arrcharacterStyle[i5] instanceof BackgroundColorSpan)) continue;
                    int n10 = ((BackgroundColorSpan)arrcharacterStyle[i5]).getBackgroundColor();
                    Locale locale = Locale.US;
                    Object[] arrobject = new Object[]{n10 & 16777215};
                    stringBuilder.append(String.format((Locale)locale, (String)"<span style=\"background-color:#%06X;\">", (Object[])arrobject));
                }
                c.k(stringBuilder, (CharSequence)spanned, n5, n7);
                for (int i6 = arrcharacterStyle.length - 1; i6 >= 0; --i6) {
                    if (arrcharacterStyle[i6] instanceof BackgroundColorSpan) {
                        stringBuilder.append("</span>");
                    }
                    if (arrcharacterStyle[i6] instanceof ForegroundColorSpan) {
                        stringBuilder.append("</span>");
                    }
                    if (arrcharacterStyle[i6] instanceof RelativeSizeSpan) {
                        stringBuilder.append("</span>");
                    }
                    if (arrcharacterStyle[i6] instanceof AbsoluteSizeSpan) {
                        stringBuilder.append("</span>");
                    }
                    if (arrcharacterStyle[i6] instanceof URLSpan) {
                        stringBuilder.append("</a>");
                    }
                    if (arrcharacterStyle[i6] instanceof StrikethroughSpan) {
                        stringBuilder.append("</span>");
                    }
                    if (arrcharacterStyle[i6] instanceof UnderlineSpan) {
                        stringBuilder.append("</u>");
                    }
                    if (arrcharacterStyle[i6] instanceof SubscriptSpan) {
                        stringBuilder.append("</sub>");
                    }
                    if (arrcharacterStyle[i6] instanceof SuperscriptSpan) {
                        stringBuilder.append("</sup>");
                    }
                    if (arrcharacterStyle[i6] instanceof TypefaceSpan) {
                        stringBuilder.append("</span>");
                    }
                    if (!(arrcharacterStyle[i6] instanceof StyleSpan)) continue;
                    int n11 = ((StyleSpan)arrcharacterStyle[i6]).getStyle();
                    if ((n11 & 1) != 0) {
                        stringBuilder.append("</b>");
                    }
                    if ((n11 & 2) == 0) continue;
                    stringBuilder.append("</i>");
                }
                n5 = n7;
            }
        }

        private static void k(StringBuilder stringBuilder, CharSequence charSequence, int n5, int n6) {
            while (n5 < n6) {
                char c4 = charSequence.charAt(n5);
                if (c4 == '<') {
                    stringBuilder.append("&lt;");
                } else if (c4 == '>') {
                    stringBuilder.append("&gt;");
                } else if (c4 == '&') {
                    stringBuilder.append("&amp;");
                } else if (c4 >= '\ud800' && c4 <= '\udfff') {
                    int n7;
                    char c6;
                    if (c4 < '\udc00' && (n7 = n5 + 1) < n6 && (c6 = charSequence.charAt(n7)) >= '\udc00' && c6 <= '\udfff') {
                        int n8 = 65536 | c4 - 55296 << 10 | c6 - 56320;
                        stringBuilder.append("&#");
                        stringBuilder.append(n8);
                        stringBuilder.append(";");
                        n5 = n7;
                    }
                } else if (c4 <= '~' && c4 >= ' ') {
                    if (c4 == ' ') {
                        int n9;
                        while ((n9 = n5 + 1) < n6 && charSequence.charAt(n9) == ' ') {
                            stringBuilder.append("&nbsp;");
                            n5 = n9;
                        }
                        stringBuilder.append(' ');
                    } else {
                        stringBuilder.append(c4);
                    }
                } else {
                    stringBuilder.append("&#");
                    stringBuilder.append((int)c4);
                    stringBuilder.append(";");
                }
                ++n5;
            }
        }
    }

    public static interface d {
        public void a(boolean var1, String var2, Editable var3, XMLReader var4);
    }

}


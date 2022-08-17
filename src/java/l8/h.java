/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j7.n
 *  java.io.EOFException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.Serializable
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.security.MessageDigest
 *  java.util.Arrays
 *  k7.d
 *  l8.e
 *  u7.g
 *  u7.j
 *  z7.g
 */
package l8;

import j7.n;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import k7.d;
import l8.b;
import l8.c;
import l8.e;
import u7.g;
import u7.j;

public class h
implements Serializable,
Comparable<h> {
    public static final h d;
    public static final a e;
    private static final long serialVersionUID = 1L;
    private transient int a;
    private transient String b;
    private final byte[] c;

    static {
        e = new a(null);
        d = new h(new byte[0]);
    }

    public h(byte[] arrby) {
        j.f((Object)arrby, (String)"data");
        this.c = arrby;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int n5 = objectInputStream.readInt();
        h h4 = e.e((InputStream)objectInputStream, n5);
        Field field = h.class.getDeclaredField("c");
        j.b((Object)field, (String)"field");
        field.setAccessible(true);
        field.set((Object)this, (Object)h4.c);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public String a() {
        return l8.a.b(this.e(), null, 1, null);
    }

    public int b(h h4) {
        block6 : {
            block7 : {
                j.f((Object)h4, (String)"other");
                int n5 = this.r();
                int n6 = h4.r();
                int n7 = Math.min((int)n5, (int)n6);
                for (int i5 = 0; i5 < n7; ++i5) {
                    int n8;
                    int n9 = 255 & this.d(i5);
                    if (n9 == (n8 = 255 & h4.d(i5))) {
                        continue;
                    }
                    if (n9 >= n8) break block6;
                    break block7;
                }
                if (n5 == n6) {
                    return 0;
                }
                if (n5 >= n6) break block6;
            }
            return -1;
        }
        return 1;
    }

    public h c(String string) {
        j.f((Object)string, (String)"algorithm");
        byte[] arrby = MessageDigest.getInstance((String)string).digest(this.c);
        j.b((Object)arrby, (String)"MessageDigest.getInstance(algorithm).digest(data)");
        return new h(arrby);
    }

    public final byte d(int n5) {
        return this.k(n5);
    }

    public final byte[] e() {
        return this.c;
    }

    public boolean equals(Object object) {
        h h4;
        if (object == this) {
            return true;
        }
        return object instanceof h && (h4 = (h)object).r() == this.e().length && h4.m(0, this.e(), 0, this.e().length);
    }

    public final int f() {
        return this.a;
    }

    public int g() {
        return this.e().length;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int n5 = this.f();
        if (n5 != 0) {
            return n5;
        }
        int n6 = Arrays.hashCode((byte[])this.e());
        this.n(n6);
        return n6;
    }

    public String i() {
        char[] arrc = new char[2 * this.e().length];
        byte[] arrby = this.e();
        int n5 = arrby.length;
        int n6 = 0;
        for (int i5 = 0; i5 < n5; ++i5) {
            byte by = arrby[i5];
            int n7 = n6 + 1;
            arrc[n6] = m8.b.f()[15 & by >> 4];
            n6 = n7 + 1;
            arrc[n7] = m8.b.f()[by & 15];
        }
        return new String(arrc);
    }

    public byte[] j() {
        return this.e();
    }

    public byte k(int n5) {
        return this.e()[n5];
    }

    public boolean l(int n5, h h4, int n6, int n7) {
        j.f((Object)h4, (String)"other");
        return h4.m(n6, this.e(), n5, n7);
    }

    public boolean m(int n5, byte[] arrby, int n6, int n7) {
        j.f((Object)arrby, (String)"other");
        return n5 >= 0 && n5 <= this.e().length - n7 && n6 >= 0 && n6 <= arrby.length - n7 && c.a(this.e(), n5, arrby, n6, n7);
    }

    public final void n(int n5) {
        this.a = n5;
    }

    public final void o(String string) {
        this.b = string;
    }

    public h p() {
        return this.c("SHA-1");
    }

    public h q() {
        return this.c("SHA-256");
    }

    public final int r() {
        return this.g();
    }

    public final boolean s(h h4) {
        j.f((Object)h4, (String)"prefix");
        return this.l(0, h4, 0, h4.r());
    }

    public h t() {
        for (int i5 = 0; i5 < this.e().length; ++i5) {
            byte by;
            byte by2;
            byte by3 = this.e()[i5];
            if (by3 < (by2 = 65) || by3 > (by = 90)) continue;
            byte[] arrby = this.e();
            byte[] arrby2 = Arrays.copyOf((byte[])arrby, (int)arrby.length);
            j.b((Object)arrby2, (String)"java.util.Arrays.copyOf(this, size)");
            arrby2[i5] = (byte)(by3 + 32);
            for (int i6 = i5 + 1; i6 < arrby2.length; ++i6) {
                byte by4 = arrby2[i6];
                if (by4 < by2 || by4 > by) continue;
                arrby2[i6] = (byte)(by4 + 32);
            }
            return new h(arrby2);
        }
        return this;
    }

    public String toString() {
        int n5 = this.e().length;
        boolean bl = true;
        boolean bl2 = n5 == 0;
        if (bl2) {
            return "[size=0]";
        }
        int n6 = m8.b.a(this.e(), 64);
        if (n6 == -1) {
            if (this.e().length <= 64) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[hex=");
                stringBuilder.append(this.i());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[size=");
            stringBuilder.append(this.e().length);
            stringBuilder.append(" hex=");
            if (64 > this.e().length) {
                bl = false;
            }
            if (bl) {
                h h4 = 64 == this.e().length ? this : new h(d.e((byte[])this.e(), (int)0, (int)64));
                stringBuilder.append(h4.i());
                stringBuilder.append("\u2026]");
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("endIndex > length(");
            stringBuilder2.append(this.e().length);
            stringBuilder2.append(')');
            throw new IllegalArgumentException(stringBuilder2.toString().toString());
        }
        String string = this.u();
        if (string != null) {
            String string2 = string.substring(0, n6);
            j.b((Object)string2, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            String string3 = z7.g.p((String)z7.g.p((String)z7.g.p((String)string2, (String)"\\", (String)"\\\\", (boolean)false, (int)4, null), (String)"\n", (String)"\\n", (boolean)false, (int)4, null), (String)"\r", (String)"\\r", (boolean)false, (int)4, null);
            if (n6 < string.length()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[size=");
                stringBuilder.append(this.e().length);
                stringBuilder.append(" text=");
                stringBuilder.append(string3);
                stringBuilder.append("\u2026]");
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[text=");
            stringBuilder.append(string3);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
        throw new n("null cannot be cast to non-null type java.lang.String");
    }

    public String u() {
        String string = this.h();
        if (string == null) {
            string = b.b(this.j());
            this.o(string);
        }
        return string;
    }

    public void v(e e5, int n5, int n6) {
        j.f((Object)e5, (String)"buffer");
        m8.b.d(this, e5, n5, n6);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g4) {
            this();
        }

        public static /* synthetic */ h d(a a3, byte[] arrby, int n5, int n6, int n7, Object object) {
            if ((n7 & 1) != 0) {
                n5 = 0;
            }
            if ((n7 & 2) != 0) {
                n6 = arrby.length;
            }
            return a3.c(arrby, n5, n6);
        }

        public final h a(String string) {
            IllegalArgumentException illegalArgumentException;
            j.f((Object)string, (String)"$this$decodeHex");
            int n5 = string.length() % 2;
            boolean bl = n5 == 0;
            if (bl) {
                int n6 = string.length() / 2;
                byte[] arrby = new byte[n6];
                for (int i5 = 0; i5 < n6; ++i5) {
                    int n7 = i5 * 2;
                    arrby[i5] = (byte)((m8.b.b(string.charAt(n7)) << 4) + m8.b.b(string.charAt(n7 + 1)));
                }
                return new h(arrby);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected hex string: ");
            stringBuilder.append(string);
            illegalArgumentException = new IllegalArgumentException(stringBuilder.toString().toString());
            throw illegalArgumentException;
        }

        public final h b(String string) {
            j.f((Object)string, (String)"$this$encodeUtf8");
            h h4 = new h(b.a(string));
            h4.o(string);
            return h4;
        }

        public final h c(byte[] arrby, int n5, int n6) {
            j.f((Object)arrby, (String)"$this$toByteString");
            c.b(arrby.length, n5, n6);
            return new h(d.e((byte[])arrby, (int)n5, (int)(n6 + n5)));
        }

        public final h e(InputStream inputStream, int n5) {
            IllegalArgumentException illegalArgumentException;
            j.f((Object)inputStream, (String)"$this$readByteString");
            boolean bl = n5 >= 0;
            if (bl) {
                int n6;
                byte[] arrby = new byte[n5];
                for (int i5 = 0; i5 < n5; i5 += n6) {
                    n6 = inputStream.read(arrby, i5, n5 - i5);
                    if (n6 != -1) {
                        continue;
                    }
                    throw new EOFException();
                }
                return new h(arrby);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(n5);
            illegalArgumentException = new IllegalArgumentException(stringBuilder.toString().toString());
            throw illegalArgumentException;
        }
    }

}


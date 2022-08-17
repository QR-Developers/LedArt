/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 */
package g5;

import java.util.Arrays;

public final class a
implements Cloneable {
    private int[] a;
    private int b;

    public a() {
        this.b = 0;
        this.a = new int[1];
    }

    a(int[] arrn, int n2) {
        this.a = arrn;
        this.b = n2;
    }

    private void e(int n2) {
        if (n2 > this.a.length << 5) {
            int[] arrn = a.i(n2);
            int[] arrn2 = this.a;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            this.a = arrn;
        }
    }

    private static int[] i(int n2) {
        return new int[(n2 + 31) / 32];
    }

    public void a(boolean bl) {
        this.e(1 + this.b);
        if (bl) {
            int[] arrn = this.a;
            int n2 = this.b;
            int n3 = n2 / 32;
            arrn[n3] = arrn[n3] | 1 << (n2 & 31);
        }
        this.b = 1 + this.b;
    }

    public void b(a a2) {
        int n2 = a2.b;
        this.e(n2 + this.b);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(a2.f(i2));
        }
    }

    public void c(int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        if (n3 >= 0 && n3 <= 32) {
            this.e(n3 + this.b);
            while (n3 > 0) {
                int n4 = n2 >> n3 - 1;
                int n5 = 1;
                if ((n4 & n5) != n5) {
                    n5 = 0;
                }
                this.a((boolean)n5);
                --n3;
            }
            return;
        }
        illegalArgumentException = new IllegalArgumentException("Num bits must be between 0 and 32");
        throw illegalArgumentException;
    }

    public a d() {
        return new a((int[])this.a.clone(), this.b);
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.b == a2.b && Arrays.equals((int[])this.a, (int[])a2.a);
    }

    public boolean f(int n2) {
        return (this.a[n2 / 32] & 1 << (n2 & 31)) != 0;
    }

    public int g() {
        return this.b;
    }

    public int h() {
        return (7 + this.b) / 8;
    }

    public int hashCode() {
        return 31 * this.b + Arrays.hashCode((int[])this.a);
    }

    public void j(int n2, byte[] arrby, int n3, int n4) {
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = 0;
            for (int i3 = 0; i3 < 8; ++i3) {
                if (this.f(n2)) {
                    n5 |= 1 << 7 - i3;
                }
                ++n2;
            }
            arrby[n3 + i2] = (byte)n5;
        }
    }

    public void k(a a2) {
        IllegalArgumentException illegalArgumentException;
        if (this.b == a2.b) {
            int[] arrn;
            for (int i2 = 0; i2 < (arrn = this.a).length; ++i2) {
                arrn[i2] = arrn[i2] ^ a2.a[i2];
            }
            return;
        }
        illegalArgumentException = new IllegalArgumentException("Sizes don't match");
        throw illegalArgumentException;
    }

    public String toString() {
        int n2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(1 + (n2 + n2 / 8));
        for (int i2 = 0; i2 < this.b; ++i2) {
            if ((i2 & 7) == 0) {
                stringBuilder.append(' ');
            }
            char c2 = this.f(i2) ? (char)'X' : '.';
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}


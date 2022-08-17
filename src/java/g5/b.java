/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package g5;

import java.util.Arrays;

public final class b
implements Cloneable {
    private final int a;
    private final int b;
    private final int c;
    private final int[] d;

    public b(int n2, int n3) {
        if (n2 > 0 && n3 > 0) {
            int n4;
            this.a = n2;
            this.b = n3;
            this.c = n4 = (n2 + 31) / 32;
            this.d = new int[n4 * n3];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private b(int n2, int n3, int n4, int[] arrn) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = arrn;
    }

    private String a(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(this.b * (1 + this.a));
        for (int i2 = 0; i2 < this.b; ++i2) {
            for (int i3 = 0; i3 < this.a; ++i3) {
                String string4 = this.c(i3, i2) ? string : string2;
                stringBuilder.append(string4);
            }
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    public b b() {
        return new b(this.a, this.b, this.c, (int[])this.d.clone());
    }

    public boolean c(int n2, int n3) {
        int n4 = n3 * this.c + n2 / 32;
        return (1 & this.d[n4] >>> (n2 & 31)) != 0;
    }

    public void d(int n2, int n3, int n4, int n5) {
        IllegalArgumentException illegalArgumentException;
        if (n3 >= 0 && n2 >= 0) {
            if (n5 > 0 && n4 > 0) {
                int n6 = n4 + n2;
                int n7 = n5 + n3;
                if (n7 <= this.b && n6 <= this.a) {
                    while (n3 < n7) {
                        int n8 = n3 * this.c;
                        for (int i2 = n2; i2 < n6; ++i2) {
                            int[] arrn = this.d;
                            int n9 = n8 + i2 / 32;
                            arrn[n9] = arrn[n9] | 1 << (i2 & 31);
                        }
                        ++n3;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        illegalArgumentException = new IllegalArgumentException("Left and top must be nonnegative");
        throw illegalArgumentException;
    }

    public String e(String string, String string2) {
        return this.a(string, string2, "\n");
    }

    public boolean equals(Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        return this.a == b2.a && this.b == b2.b && this.c == b2.c && Arrays.equals((int[])this.d, (int[])b2.d);
    }

    public int hashCode() {
        int n2 = this.a;
        return 31 * (31 * (31 * (n2 + n2 * 31) + this.b) + this.c) + Arrays.hashCode((int[])this.d);
    }

    public String toString() {
        return this.e("X ", "  ");
    }
}


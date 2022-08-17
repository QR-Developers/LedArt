/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package c;

import java.util.List;

public class a<T> {
    private int a;
    private int b;
    private int c;
    private List<T> d;

    public List<T> a() {
        return this.d;
    }

    public int b() {
        List<T> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int c() {
        return this.b;
    }

    public int d() {
        int n2;
        int n3 = this.a;
        if (n3 > 0 && (n2 = this.c) > 0) {
            if (n3 % n2 == 0) {
                return n3 / n2;
            }
            return 1 + n3 / n2;
        }
        return 0;
    }

    public boolean e() {
        return this.b < this.d();
    }

    public void f(List<T> list) {
        this.d = list;
    }

    public void g(int n2) {
        this.b = n2;
    }

    public void h(int n2) {
        this.c = n2;
    }

    public void i(int n2) {
        this.a = n2;
    }
}


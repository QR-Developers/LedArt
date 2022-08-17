/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  v.a
 */
package cn.huidu.cloud.ui.adapter.recycletreeview;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a<T extends v.a>
implements Cloneable {
    private T a;
    private a b;
    private List<a> c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g = -1;
    private int h = -1;

    public a(@NonNull T t2) {
        this.a = t2;
        this.c = new ArrayList();
    }

    public a a(a a2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add((Object)a2);
        a2.b = this;
        return this;
    }

    protected a<T> b() {
        a<T> a2 = new a<T>(this.a);
        a2.d = this.d;
        return a2;
    }

    public void c() {
        if (!this.d) {
            this.d = true;
        }
    }

    public void d() {
        this.c();
        List<a> list = this.c;
        if (list != null) {
            if (list.isEmpty()) {
                return;
            }
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((a)iterator.next()).d();
            }
        }
    }

    public List<a> e() {
        return this.c;
    }

    public T f() {
        return this.a;
    }

    public int g() {
        if (this.n()) {
            this.h = 0;
        } else if (this.h == -1) {
            this.h = 1 + this.b.g();
        }
        return this.h;
    }

    public a h() {
        return this.b;
    }

    public int i() {
        return this.g;
    }

    public boolean j() {
        return this.f;
    }

    public boolean k() {
        return this.d;
    }

    public boolean l() {
        List<a> list = this.c;
        return list == null || list.isEmpty();
        {
        }
    }

    public boolean m() {
        return this.e;
    }

    public boolean n() {
        return this.b == null;
    }

    public void o(boolean bl) {
        this.f = bl;
    }

    public void p(int n2) {
        this.g = n2;
    }

    public boolean q() {
        boolean bl;
        this.d = bl = true ^ this.d;
        return bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TreeNode{content=");
        stringBuilder.append(this.a);
        stringBuilder.append(", parent=");
        a a2 = this.b;
        String string2 = "null";
        String string3 = a2 == null ? string2 : a2.f().toString();
        stringBuilder.append(string3);
        stringBuilder.append(", childList=");
        List<a> list = this.c;
        if (list != null) {
            string2 = list.toString();
        }
        stringBuilder.append(string2);
        stringBuilder.append(", isExpand=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


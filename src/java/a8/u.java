/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.u$a
 *  a8.u$b
 *  j7.i
 *  j7.m
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.TreeSet
 *  k7.k
 *  u7.b
 *  u7.g
 *  u7.j
 *  u7.u
 *  z7.g
 */
package a8;

import a8.u;
import j7.i;
import j7.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import k7.k;
import u7.g;
import u7.j;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public final class u
implements Iterable<i<? extends String, ? extends String>>,
v7.a {
    public static final b b;
    private final String[] a;

    static {
        b = new /* Unavailable Anonymous Inner Class!! */;
    }

    private u(String[] arrstring) {
        this.a = arrstring;
    }

    public /* synthetic */ u(String[] arrstring, g g2) {
        this(arrstring);
    }

    public static final /* varargs */ u e(String ... arrstring) {
        return b.g(arrstring);
    }

    public final String a(String string) {
        j.f((Object)string, (String)"name");
        return b.c(b, (String[])this.a, (String)string);
    }

    public final String b(int n2) {
        return this.a[n2 * 2];
    }

    public final Set<String> c() {
        TreeSet treeSet = new TreeSet(z7.g.i((u7.u)u7.u.a));
        int n2 = this.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            treeSet.add((Object)this.b(i2));
        }
        Set set = Collections.unmodifiableSet((Set)treeSet);
        j.b((Object)set, (String)"Collections.unmodifiableSet(result)");
        return set;
    }

    public final a d() {
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        k.q((Collection)a2.g(), (Object[])this.a);
        return a2;
    }

    public boolean equals(Object object) {
        return object instanceof u && Arrays.equals((Object[])this.a, (Object[])((u)object).a);
    }

    public final String f(int n2) {
        return this.a[1 + n2 * 2];
    }

    public final List<String> g(String string) {
        j.f((Object)string, (String)"name");
        int n2 = this.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!z7.g.h((String)string, (String)this.b(i2), (boolean)true)) continue;
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add((Object)this.f(i2));
        }
        if (arrayList != null) {
            List list = Collections.unmodifiableList(arrayList);
            j.b((Object)list, (String)"Collections.unmodifiableList(result)");
            return list;
        }
        return k.f();
    }

    public int hashCode() {
        return Arrays.hashCode((Object[])this.a);
    }

    public Iterator<i<String, String>> iterator() {
        int n2 = this.size();
        Object[] arrobject = new i[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrobject[i2] = m.a((Object)this.b(i2), (Object)this.f(i2));
        }
        return u7.b.a((Object[])arrobject);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(this.b(i2));
            stringBuilder.append(": ");
            stringBuilder.append(this.f(i2));
            stringBuilder.append("\n");
        }
        String string = stringBuilder.toString();
        j.b((Object)string, (String)"StringBuilder().apply(builderAction).toString()");
        return string;
    }
}


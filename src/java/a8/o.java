/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  k7.k
 *  u7.g
 *  u7.j
 */
package a8;

import a8.n;
import a8.v;
import java.util.List;
import k7.k;
import u7.g;
import u7.j;

public interface o {
    public static final o a;

    static {
        new a(null);
        a = new o(){

            @Override
            public void a(v v2, List<n> list) {
                j.f((Object)v2, (String)"url");
                j.f(list, (String)"cookies");
            }

            @Override
            public List<n> b(v v2) {
                j.f((Object)v2, (String)"url");
                return k.f();
            }
        };
    }

    public void a(v var1, List<n> var2);

    public List<n> b(v var1);

    public static final class a8.o$a {
        private a8.o$a() {
        }

        public /* synthetic */ a8.o$a(g g2) {
            this();
        }

    }

}


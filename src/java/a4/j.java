/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a4.f
 *  androidx.annotation.NonNull
 *  e4.i
 *  h4.j
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package a4;

import a4.f;
import androidx.annotation.NonNull;
import e4.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class j
implements f {
    private final Set<i<?>> a = Collections.newSetFromMap((Map)new WeakHashMap());

    public void b() {
        this.a.clear();
    }

    @NonNull
    public List<i<?>> f() {
        return h4.j.j(this.a);
    }

    public void k() {
        Iterator iterator = h4.j.j(this.a).iterator();
        while (iterator.hasNext()) {
            ((i)iterator.next()).k();
        }
    }

    public void l(@NonNull i<?> i2) {
        this.a.add(i2);
    }

    public void m(@NonNull i<?> i2) {
        this.a.remove(i2);
    }

    public void onStart() {
        Iterator iterator = h4.j.j(this.a).iterator();
        while (iterator.hasNext()) {
            ((i)iterator.next()).onStart();
        }
    }

    public void onStop() {
        Iterator iterator = h4.j.j(this.a).iterator();
        while (iterator.hasNext()) {
            ((i)iterator.next()).onStop();
        }
    }
}


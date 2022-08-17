/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.io.File
 *  java.lang.Object
 *  java.util.ArrayList
 *  o4.f
 *  o4.f$a
 */
package c1;

import android.graphics.Bitmap;
import c1.b;
import java.io.File;
import java.util.ArrayList;
import o4.f;

public final class a
implements f.a {
    public final /* synthetic */ File a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ a(File file, ArrayList arrayList) {
        this.a = file;
        this.b = arrayList;
    }

    public final void a(Bitmap bitmap) {
        b.a(this.a, this.b, bitmap);
    }
}


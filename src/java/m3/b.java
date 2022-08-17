/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package m3;

import android.net.Uri;
import java.util.List;

public final class b {
    public static boolean a(Uri uri) {
        return b.b(uri) && !b.e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && "content".equals((Object)uri.getScheme()) && "media".equals((Object)uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b.b(uri) && b.e(uri);
    }

    public static boolean d(int n5, int n6) {
        return n5 != Integer.MIN_VALUE && n6 != Integer.MIN_VALUE && n5 <= 512 && n6 <= 384;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains((Object)"video");
    }
}


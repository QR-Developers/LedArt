/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  u7.j
 *  z7.d
 */
package l8;

import java.nio.charset.Charset;
import u7.j;
import z7.d;

public final class b {
    public static final byte[] a(String string) {
        j.f((Object)string, (String)"$this$asUtf8ToByteArray");
        byte[] arrby = string.getBytes(d.a);
        j.b((Object)arrby, (String)"(this as java.lang.String).getBytes(charset)");
        return arrby;
    }

    public static final String b(byte[] arrby) {
        j.f((Object)arrby, (String)"$this$toUtf8String");
        return new String(arrby, d.a);
    }
}


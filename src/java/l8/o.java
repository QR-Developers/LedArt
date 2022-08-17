/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.Socket
 *  l8.f
 *  l8.g
 *  l8.n
 *  l8.q
 *  l8.r
 *  l8.s
 *  l8.x
 *  u7.j
 *  z7.g
 */
package l8;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import l8.f;
import l8.g;
import l8.n;
import l8.q;
import l8.r;
import l8.s;
import l8.w;
import l8.x;
import l8.y;
import l8.z;
import u7.j;

public final class o {
    public static final f a(w w2) {
        j.f((Object)w2, (String)"$this$buffer");
        return new r(w2);
    }

    public static final g b(y y2) {
        j.f((Object)y2, (String)"$this$buffer");
        return new s(y2);
    }

    public static final boolean c(AssertionError assertionError) {
        j.f((Object)assertionError, (String)"$this$isAndroidGetsocknameError");
        Throwable throwable = assertionError.getCause();
        boolean bl = false;
        if (throwable != null) {
            String string = assertionError.getMessage();
            boolean bl2 = string != null ? z7.g.y((CharSequence)string, (CharSequence)"getsockname failed", (boolean)false, (int)2, null) : false;
            bl = false;
            if (bl2) {
                bl = true;
            }
        }
        return bl;
    }

    public static final w d(Socket socket) {
        j.f((Object)socket, (String)"$this$sink");
        x x2 = new x(socket);
        OutputStream outputStream = socket.getOutputStream();
        j.b((Object)outputStream, (String)"getOutputStream()");
        return x2.v((w)new q(outputStream, (z)x2));
    }

    public static final y e(File file) {
        j.f((Object)file, (String)"$this$source");
        return o.f((InputStream)new FileInputStream(file));
    }

    public static final y f(InputStream inputStream) {
        j.f((Object)inputStream, (String)"$this$source");
        return new n(inputStream, new z());
    }

    public static final y g(Socket socket) {
        j.f((Object)socket, (String)"$this$source");
        x x2 = new x(socket);
        InputStream inputStream = socket.getInputStream();
        j.b((Object)inputStream, (String)"getInputStream()");
        return x2.w((y)new n(inputStream, (z)x2));
    }
}


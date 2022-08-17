/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package m3;

import java.io.File;

class a {
    a() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public File b(String string) {
        return new File(string);
    }

    public long c(File file) {
        return file.length();
    }
}


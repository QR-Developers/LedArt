/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.Throwable
 */
package f9;

import java.io.IOException;

public class a
extends IOException {
    private static final long serialVersionUID = 1L;

    public a(String string) {
        super(string);
    }

    public a(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }

    public a(Throwable throwable) {
        super(throwable.getMessage());
        this.initCause(throwable);
    }
}


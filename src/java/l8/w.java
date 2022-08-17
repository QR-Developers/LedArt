/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.Flushable
 *  java.lang.Object
 *  l8.e
 */
package l8;

import java.io.Closeable;
import java.io.Flushable;
import l8.e;
import l8.z;

public interface w
extends Closeable,
Flushable {
    public void close();

    public z f();

    public void flush();

    public void z(e var1, long var2);
}


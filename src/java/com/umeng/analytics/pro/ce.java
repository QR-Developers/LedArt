/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.cg
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.umeng.analytics.pro;

import com.umeng.analytics.pro.cg;
import com.umeng.analytics.pro.ch;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ce
extends cg {
    protected InputStream a = null;
    protected OutputStream b = null;

    protected ce() {
    }

    public ce(InputStream inputStream) {
        this.a = inputStream;
    }

    public ce(InputStream inputStream, OutputStream outputStream) {
        this.a = inputStream;
        this.b = outputStream;
    }

    public ce(OutputStream outputStream) {
        this.b = outputStream;
    }

    public int a(byte[] arrby, int n2, int n3) {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            block3 : {
                try {
                    int n4 = inputStream.read(arrby, n2, n3);
                    if (n4 < 0) break block3;
                    return n4;
                }
                catch (IOException iOException) {
                    throw new ch(0, (Throwable)iOException);
                }
            }
            throw new ch(4);
        }
        throw new ch(1, "Cannot read from null inputStream");
    }

    public boolean a() {
        return true;
    }

    public void b() {
    }

    public void b(byte[] arrby, int n2, int n3) {
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.write(arrby, n2, n3);
                return;
            }
            catch (IOException iOException) {
                throw new ch(0, (Throwable)iOException);
            }
        }
        throw new ch(1, "Cannot write to null outputStream");
    }

    public void c() {
        OutputStream outputStream;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            this.a = null;
        }
        if ((outputStream = this.b) != null) {
            try {
                outputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            this.b = null;
        }
    }

    public void d() {
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.flush();
                return;
            }
            catch (IOException iOException) {
                throw new ch(0, (Throwable)iOException);
            }
        }
        throw new ch(1, "Cannot flush null outputStream");
    }
}


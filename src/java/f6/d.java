/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j6.e
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  o6.a
 *  o6.b
 *  p6.b
 *  p6.c
 *  p6.d
 *  p6.e
 *  p6.f
 *  p6.g
 *  p6.i
 */
package f6;

import java.io.Serializable;
import o6.a;
import o6.b;
import p6.c;
import p6.e;
import p6.f;
import p6.g;
import p6.i;

public class d
implements Serializable {
    private static final long serialVersionUID = -6883956320373276785L;
    public String a;
    public String b;
    public j6.e c;
    public String d;
    public long e;
    public b f;
    public a g;

    public static p6.b a(String string, String string2) {
        if (string2.equals((Object)"get")) {
            return new p6.d(string);
        }
        if (string2.equals((Object)"post")) {
            return new g(string);
        }
        if (string2.equals((Object)"put")) {
            return new i(string);
        }
        if (string2.equals((Object)"delete")) {
            return new c(string);
        }
        if (string2.equals((Object)"options")) {
            return new f(string);
        }
        if (string2.equals((Object)"head")) {
            return new e(string);
        }
        return null;
    }

    public static String b(p6.b b2) {
        if (b2 instanceof p6.d) {
            return "get";
        }
        if (b2 instanceof g) {
            return "post";
        }
        if (b2 instanceof i) {
            return "put";
        }
        if (b2 instanceof c) {
            return "delete";
        }
        if (b2 instanceof f) {
            return "options";
        }
        if (b2 instanceof e) {
            return "head";
        }
        return "";
    }
}


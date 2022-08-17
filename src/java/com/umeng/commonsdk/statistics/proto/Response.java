/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.umeng.analytics.pro.aq
 *  com.umeng.analytics.pro.at
 *  com.umeng.analytics.pro.az
 *  com.umeng.analytics.pro.ba
 *  com.umeng.analytics.pro.bf
 *  com.umeng.analytics.pro.bg
 *  com.umeng.analytics.pro.bn
 *  com.umeng.analytics.pro.bs
 *  com.umeng.analytics.pro.bx
 *  com.umeng.analytics.pro.ca
 *  com.umeng.analytics.pro.cb
 *  com.umeng.analytics.pro.cg
 *  com.umeng.commonsdk.statistics.proto.Response$1
 *  com.umeng.commonsdk.statistics.proto.Response$a
 *  com.umeng.commonsdk.statistics.proto.Response$c
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Cloneable
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.EnumMap
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.Map
 */
package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cg;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class Response
implements at<Response, e>,
Serializable,
Cloneable {
    private static final bn IMPRINT_FIELD_DESC;
    private static final bn MSG_FIELD_DESC;
    private static final bn RESP_CODE_FIELD_DESC;
    private static final bx STRUCT_DESC;
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<e, bf> metaDataMap;
    private static final Map<Class<? extends ca>, cb> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield = 0;
    public com.umeng.commonsdk.statistics.proto.d imprint;
    public String msg;
    private e[] optionals;
    public int resp_code;

    static {
        Map map;
        HashMap hashMap;
        STRUCT_DESC = new bx("Response");
        RESP_CODE_FIELD_DESC = new bn("resp_code", 8, 1);
        MSG_FIELD_DESC = new bn("msg", 11, 2);
        IMPRINT_FIELD_DESC = new bn("imprint", 12, 3);
        schemes = hashMap = new HashMap();
        hashMap.put(cc.class, (Object)new b(null));
        hashMap.put(cd.class, (Object)new d(null));
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((Object)e.a, (Object)new bf("resp_code", 1, new bg(8)));
        enumMap.put((Object)e.b, (Object)new bf("msg", 2, new bg(11)));
        enumMap.put((Object)e.c, (Object)new bf("imprint", 2, (bg)new bk(12, com.umeng.commonsdk.statistics.proto.d.class)));
        metaDataMap = map = Collections.unmodifiableMap((Map)enumMap);
        bf.a(Response.class, (Map)map);
    }

    public Response() {
        e[] arre = new e[]{e.b, e.c};
        this.optionals = arre;
    }

    public Response(int n2) {
        this();
        this.resp_code = n2;
        this.setResp_codeIsSet(true);
    }

    public Response(Response response) {
        e[] arre = new e[]{e.b, e.c};
        this.optionals = arre;
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new com.umeng.commonsdk.statistics.proto.d(response.imprint);
        }
    }

    static /* synthetic */ bx access$300() {
        return STRUCT_DESC;
    }

    static /* synthetic */ bn access$400() {
        return RESP_CODE_FIELD_DESC;
    }

    static /* synthetic */ bn access$500() {
        return MSG_FIELD_DESC;
    }

    static /* synthetic */ bn access$600() {
        return IMPRINT_FIELD_DESC;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            this.__isset_bitfield = 0;
            this.read(new bm(new ce((InputStream)objectInputStream)));
            return;
        }
        catch (az az2) {
            throw new IOException(az2.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            this.write(new bm(new ce((OutputStream)objectOutputStream)));
            return;
        }
        catch (az az2) {
            throw new IOException(az2.getMessage());
        }
    }

    public void clear() {
        this.setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public Response deepCopy() {
        return new Response(this);
    }

    public e fieldForId(int n2) {
        return e.a(n2);
    }

    public com.umeng.commonsdk.statistics.proto.d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetResp_code() {
        return aq.a((byte)this.__isset_bitfield, (int)0);
    }

    public void read(bs bs2) {
        ((cb)schemes.get((Object)bs2.D())).b().b(bs2, (at)this);
    }

    public Response setImprint(com.umeng.commonsdk.statistics.proto.d d3) {
        this.imprint = d3;
        return this;
    }

    public void setImprintIsSet(boolean bl2) {
        if (!bl2) {
            this.imprint = null;
        }
    }

    public Response setMsg(String string) {
        this.msg = string;
        return this;
    }

    public void setMsgIsSet(boolean bl2) {
        if (!bl2) {
            this.msg = null;
        }
    }

    public Response setResp_code(int n2) {
        this.resp_code = n2;
        this.setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean bl2) {
        this.__isset_bitfield = aq.a((byte)this.__isset_bitfield, (int)0, (boolean)bl2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response(");
        stringBuilder.append("resp_code:");
        stringBuilder.append(this.resp_code);
        if (this.isSetMsg()) {
            stringBuilder.append(", ");
            stringBuilder.append("msg:");
            String string = this.msg;
            if (string == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(string);
            }
        }
        if (this.isSetImprint()) {
            stringBuilder.append(", ");
            stringBuilder.append("imprint:");
            com.umeng.commonsdk.statistics.proto.d d3 = this.imprint;
            if (d3 == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append((Object)d3);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = aq.b((byte)this.__isset_bitfield, (int)0);
    }

    public void validate() {
        com.umeng.commonsdk.statistics.proto.d d3 = this.imprint;
        if (d3 != null) {
            d3.l();
        }
    }

    public void write(bs bs2) {
        ((cb)schemes.get((Object)bs2.D())).b().a(bs2, (at)this);
    }

    /*
     * Exception performing whole class analysis.
     */
    private static class b
    implements cb {
        private b() {
        }

        /* synthetic */ b(1 var1_1) {
            this();
        }

        public a a() {
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public /* synthetic */ ca b() {
            return this.a();
        }
    }

    /*
     * Exception performing whole class analysis.
     */
    private static class d
    implements cb {
        private d() {
        }

        /* synthetic */ d(1 var1_1) {
            this();
        }

        public c a() {
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public /* synthetic */ ca b() {
            return this.a();
        }
    }

    public static final class e
    extends Enum<e>
    implements ba {
        public static final /* enum */ e a;
        public static final /* enum */ e b;
        public static final /* enum */ e c;
        private static final Map<String, e> d;
        private static final /* synthetic */ e[] g;
        private final short e;
        private final String f;

        static {
            e e3;
            e e4;
            e e5;
            a = e4 = new e(1, "resp_code");
            b = e5 = new e(2, "msg");
            c = e3 = new e(3, "imprint");
            g = new e[]{e4, e5, e3};
            d = new HashMap();
            for (e e6 : EnumSet.allOf(e.class)) {
                d.put((Object)e6.b(), (Object)e6);
            }
        }

        private e(short s2, String string2) {
            this.e = s2;
            this.f = string2;
        }

        public static e a(int n2) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return null;
                    }
                    return c;
                }
                return b;
            }
            return a;
        }

        public static e a(String string) {
            return (e)((Object)d.get((Object)string));
        }

        public static e b(int n2) {
            e e3 = e.a(n2);
            if (e3 != null) {
                return e3;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field ");
            stringBuilder.append(n2);
            stringBuilder.append(" doesn't exist!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public static e valueOf(String string) {
            return (e)Enum.valueOf(e.class, (String)string);
        }

        public static e[] values() {
            return (e[])g.clone();
        }

        public short a() {
            return this.e;
        }

        public String b() {
            return this.f;
        }
    }

}


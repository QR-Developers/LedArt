/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.c0
 *  a8.y
 *  a8.y$c
 *  j9.b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  l9.a
 *  l9.f
 *  l9.i
 *  l9.l
 *  l9.o
 *  l9.q
 *  l9.u
 */
package a;

import a8.c0;
import a8.y;
import cn.huidu.cloud.api.entity.ReplyDataDTO;
import j9.b;
import java.util.Map;
import l9.a;
import l9.f;
import l9.i;
import l9.l;
import l9.o;
import l9.q;
import l9.u;

public interface d {
    @o(value="/v1/resource/preview")
    public b<ReplyDataDTO> a(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/resource/delete")
    public b<ReplyDataDTO> b(@i(value="Authorization") String var1, @a c0 var2);

    @f(value="/v1/resource/list")
    public b<ReplyDataDTO> c(@i(value="Authorization") String var1, @u Map<String, Object> var2);

    @f(value="/v1/system/information")
    public b<ReplyDataDTO> d(@i(value="Authorization") String var1);

    @o(value="/v1/resource/upload/multipart/init")
    public b<ReplyDataDTO> e(@i(value="Authorization") String var1, @a c0 var2);

    @l
    @o(value="/v1/resource/upload/multipart/part")
    public b<ReplyDataDTO> f(@i(value="Authorization") String var1, @q y.c var2, @q y.c var3, @q y.c var4, @q y.c var5, @q y.c var6, @q y.c var7, @q y.c var8);

    @o(value="/v1/resource/upload/multipart/complete")
    public b<ReplyDataDTO> g(@i(value="Authorization") String var1, @a c0 var2);
}


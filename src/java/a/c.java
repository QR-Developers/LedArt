/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a8.c0
 *  j9.b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  l9.a
 *  l9.f
 *  l9.i
 *  l9.o
 *  l9.s
 *  l9.t
 *  l9.u
 */
package a;

import a8.c0;
import cn.huidu.cloud.api.entity.ReplyDataDTO;
import j9.b;
import java.util.Map;
import l9.a;
import l9.f;
import l9.i;
import l9.o;
import l9.s;
import l9.t;
import l9.u;

public interface c {
    @o(value="/v1/program/update/{id}")
    public b<ReplyDataDTO> a(@i(value="Authorization") String var1, @s(value="id") int var2, @a c0 var3);

    @o(value="/v1/program/group/delete/{id}")
    public b<ReplyDataDTO> b(@i(value="Authorization") String var1, @s(value="id") int var2);

    @o(value="/v1/program/group/assign")
    public b<ReplyDataDTO> c(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/program/group/rename")
    public b<ReplyDataDTO> d(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/program/group/bind")
    public b<ReplyDataDTO> e(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/program/group/add")
    public b<ReplyDataDTO> f(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/program/group/sort")
    public b<ReplyDataDTO> g(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/program/group/unassign")
    public b<ReplyDataDTO> h(@i(value="Authorization") String var1, @a c0 var2);

    @f(value="/v1/program/list")
    public b<ReplyDataDTO> i(@i(value="Authorization") String var1, @u Map<String, Object> var2);

    @f(value="/v1/weather/forecast")
    public b<ReplyDataDTO> j(@i(value="Authorization") String var1, @u Map<String, Object> var2);

    @f(value="/v1/weather/search")
    public b<ReplyDataDTO> k(@i(value="Authorization") String var1, @u Map<String, Object> var2);

    @f(value="/v1/program/{id}")
    public b<ReplyDataDTO> l(@i(value="Authorization") String var1, @s(value="id") int var2, @t(value="ver") int var3);

    @f(value="/v1/program/group/list")
    public b<ReplyDataDTO> m(@i(value="Authorization") String var1, @u Map<String, Object> var2);

    @o(value="/v1/program/add")
    public b<ReplyDataDTO> n(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/program/draw/html")
    public b<ReplyDataDTO> o(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/program/delete")
    public b<ReplyDataDTO> p(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/program/group/unbind")
    public b<ReplyDataDTO> q(@i(value="Authorization") String var1, @a c0 var2);
}


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
import l9.u;

public interface e {
    @o(value="/v1/task/add/program")
    public b<ReplyDataDTO> a(@i(value="Authorization") String var1, @a c0 var2);

    @f(value="/v1/event/list")
    public b<ReplyDataDTO> b(@i(value="Authorization") String var1, @u Map<String, Object> var2);

    @o(value="/v1/task/revoke/{id}")
    public b<ReplyDataDTO> c(@i(value="Authorization") String var1, @s(value="id") int var2);

    @o(value="/v1/event/revoke")
    public b<ReplyDataDTO> d(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="v1/task/add/command")
    public b<ReplyDataDTO> e(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/event/revokeByProgram")
    public b<ReplyDataDTO> f(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/task/add/syncProgramGroup")
    public b<ReplyDataDTO> g(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="v1/task/add/firmware")
    public b<ReplyDataDTO> h(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="v1/task/add/cancelProgram")
    public b<ReplyDataDTO> i(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/task/add/settings")
    public b<ReplyDataDTO> j(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/task/add/removeProgram")
    public b<ReplyDataDTO> k(@i(value="Authorization") String var1, @a c0 var2);

    @f(value="/v1/event/list/unfinishedProgram/{id}")
    public b<ReplyDataDTO> l(@i(value="Authorization") String var1, @s(value="id") int var2, @u Map<String, Object> var3);

    @f(value="/v1/task/list")
    public b<ReplyDataDTO> m(@i(value="Authorization") String var1, @u Map<String, Object> var2);
}


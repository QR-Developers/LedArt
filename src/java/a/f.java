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
 *  l9.u
 */
package a;

import a8.c0;
import cn.huidu.cloud.api.entity.ReplyDataDTO;
import j9.b;
import java.util.Map;
import l9.a;
import l9.i;
import l9.o;
import l9.u;

public interface f {
    @l9.f(value="/v1/account/child/list")
    public b<ReplyDataDTO> a(@i(value="Authorization") String var1, @u Map<String, Object> var2);

    @o(value="/v1/account/password/update")
    public b<ReplyDataDTO> b(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/account/register")
    public b<ReplyDataDTO> c(@i(value="Authorization") String var1, @a c0 var2);

    @l9.f(value="/v1/account/role/list")
    public b<ReplyDataDTO> d(@i(value="Authorization") String var1, @u Map<String, Object> var2);

    @o(value="/v1/account/password/reset")
    public b<ReplyDataDTO> e(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/account/update")
    public b<ReplyDataDTO> f(@i(value="Authorization") String var1, @a c0 var2);

    @l9.f(value="/v1/account/information")
    public b<ReplyDataDTO> g(@i(value="Authorization") String var1);

    @o(value="/v1/account/verificationCode")
    public b<ReplyDataDTO> h(@i(value="Authorization") String var1, @a c0 var2);

    @l9.f(value="/v1/account/checkCode")
    public b<ReplyDataDTO> i(@i(value="Authorization") String var1);

    @o(value="/v1/account/security/sign")
    public b<ReplyDataDTO> j(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/account/bind/phone")
    public b<ReplyDataDTO> k(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/account/phone/update")
    public b<ReplyDataDTO> l(@i(value="Authorization") String var1, @a c0 var2);

    @o(value="/v1/account/bind/email")
    public b<ReplyDataDTO> m(@i(value="Authorization") String var1, @a c0 var2);
}


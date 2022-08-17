/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j9.b
 *  java.lang.Object
 *  java.lang.String
 *  l9.c
 *  l9.e
 *  l9.o
 */
package a;

import cn.huidu.cloud.api.entity.OauthResultDTO;
import cn.huidu.cloud.api.entity.ReplyDataDTO;
import l9.c;
import l9.e;
import l9.o;

public interface b {
    @e
    @o(value="/oauth/token")
    public j9.b<OauthResultDTO> a(@c(value="client_id") String var1, @c(value="client_secret") String var2, @c(value="grant_type") String var3, @c(value="username") String var4, @c(value="password") String var5, @c(value="scope") String var6, @c(value="signature") String var7);

    @o(value="/oauth/key")
    public j9.b<ReplyDataDTO> b();

    @e
    @o(value="/oauth/token")
    public j9.b<OauthResultDTO> c(@c(value="client_id") String var1, @c(value="client_secret") String var2, @c(value="grant_type") String var3, @c(value="username") String var4, @c(value="password") String var5, @c(value="scope") String var6);

    @e
    @o(value="/oauth/token")
    public j9.b<OauthResultDTO> d(@c(value="client_id") String var1, @c(value="client_secret") String var2, @c(value="grant_type") String var3, @c(value="refresh_token") String var4);

    @e
    @o(value="/oauth/token")
    public j9.b<OauthResultDTO> e(@c(value="client_id") String var1, @c(value="client_secret") String var2, @c(value="grant_type") String var3, @c(value="scope") String var4);
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class WeiXinTokenModel {
    private String access_token;
    private int errcode = 0;
    private String errmsg;
    private String expires_in;
    private String openid;
    private String refresh_token;
    private String scope;
    private String unionid;

    public String getAccess_token() {
        return this.access_token;
    }

    public int getErrcode() {
        return this.errcode;
    }

    public String getErrmsg() {
        return this.errmsg;
    }

    public String getExpires_in() {
        return this.expires_in;
    }

    public String getOpenid() {
        return this.openid;
    }

    public String getRefresh_token() {
        return this.refresh_token;
    }

    public String getScope() {
        return this.scope;
    }

    public String getUnionid() {
        return this.unionid;
    }

    public void setAccess_token(String string) {
        this.access_token = string;
    }

    public void setErrcode(int n2) {
        this.errcode = n2;
    }

    public void setErrmsg(String string) {
        this.errmsg = string;
    }

    public void setExpires_in(String string) {
        this.expires_in = string;
    }

    public void setOpenid(String string) {
        this.openid = string;
    }

    public void setRefresh_token(String string) {
        this.refresh_token = string;
    }

    public void setScope(String string) {
        this.scope = string;
    }

    public void setUnionid(String string) {
        this.unionid = string;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WeiXinTokenModel{access_token='");
        stringBuilder.append(this.access_token);
        stringBuilder.append('\'');
        stringBuilder.append(", expires_in='");
        stringBuilder.append(this.expires_in);
        stringBuilder.append('\'');
        stringBuilder.append(", refresh_token='");
        stringBuilder.append(this.refresh_token);
        stringBuilder.append('\'');
        stringBuilder.append(", openid='");
        stringBuilder.append(this.openid);
        stringBuilder.append('\'');
        stringBuilder.append(", scope='");
        stringBuilder.append(this.scope);
        stringBuilder.append('\'');
        stringBuilder.append(", unionid='");
        stringBuilder.append(this.unionid);
        stringBuilder.append('\'');
        stringBuilder.append(", errcode=");
        stringBuilder.append(this.errcode);
        stringBuilder.append(", errmsg='");
        stringBuilder.append(this.errmsg);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


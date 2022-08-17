/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class WeiXinAppSecret {
    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return this.code;
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int n2) {
        this.code = n2;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMessage(String string) {
        this.message = string;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WeiXinAppSecret{code=");
        stringBuilder.append(this.code);
        stringBuilder.append(", message='");
        stringBuilder.append(this.message);
        stringBuilder.append('\'');
        stringBuilder.append(", data=");
        stringBuilder.append((Object)this.data);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class DataBean {
        private String appId;
        private String appSecret;

        public String getAppId() {
            return this.appId;
        }

        public String getAppSecret() {
            return this.appSecret;
        }

        public void setAppId(String string) {
            this.appId = string;
        }

        public void setAppSecret(String string) {
            this.appSecret = string;
        }
    }

}


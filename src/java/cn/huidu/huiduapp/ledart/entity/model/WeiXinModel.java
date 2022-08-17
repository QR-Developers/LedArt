/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class WeiXinModel {
    private String code;
    private int errorCode;
    private int type;

    public WeiXinModel(int n2, int n3, String string) {
        this.type = n2;
        this.errorCode = n3;
        this.code = string;
    }

    public String getCode() {
        return this.code;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getType() {
        return this.type;
    }

    public void setCode(String string) {
        this.code = string;
    }

    public void setErrorCode(int n2) {
        this.errorCode = n2;
    }

    public void setType(int n2) {
        this.type = n2;
    }
}


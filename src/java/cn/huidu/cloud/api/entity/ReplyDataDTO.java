/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.List
 *  k0.g
 */
package cn.huidu.cloud.api.entity;

import java.lang.reflect.Type;
import java.util.List;
import k0.g;

public class ReplyDataDTO {
    public int code;
    public Object data;
    public String message;

    public <T> List<T> parseArrayData(Type type) {
        return g.b((Object)this.data, (Type)type);
    }

    public <T> T parseData(Class<T> class_) {
        return (T)g.c((Object)this.data, class_);
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package cn.huidu.cloud.api.entity;

import java.util.List;

public abstract class ListDataDTO<T> {
    public List<T> list;
    public int pageNum;
    public int pageSize;
    public int total;

    public T get(int n2) {
        return (T)this.list.get(n2);
    }

    public int size() {
        List<T> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package cn.huidu.cloud.api.entity.program.v2;

import cn.huidu.cloud.api.entity.program.v2.V2WidgetDTO;
import java.util.List;

public class V2AreaDTO {
    public Attrs attributes;
    public List<V2WidgetDTO> dataSource;
    public String name;
    public String type;
    public String uuid;
    public List<V2WidgetDTO> widgets;

    public static class Attrs {
        public int height;
        public int width;
        public int x;
        public int y;
    }

}


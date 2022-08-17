/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package cn.huidu.cloud.api.entity.program.v2;

import cn.huidu.cloud.api.entity.program.v2.V2AreaDTO;
import java.util.List;

public class V2ProgramDTO {
    public Attrs attributes;
    public List<V2AreaDTO> children;
    public String name;
    public String uuid;
    public int version;

    public static class Attrs {
        public int height;
        public String language;
        public int width;
    }

}


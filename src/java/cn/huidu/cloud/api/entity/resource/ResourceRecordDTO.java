/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package cn.huidu.cloud.api.entity.resource;

import cn.huidu.cloud.api.entity.resource.ResourceChunkDTO;
import java.util.List;

public class ResourceRecordDTO {
    public List<ResourceChunkDTO> chunks;
    public String filename;
    public int groupId;
    public String uploadId;
    public String uuid;
}


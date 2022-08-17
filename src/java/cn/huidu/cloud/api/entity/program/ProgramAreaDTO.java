/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package cn.huidu.cloud.api.entity.program;

import java.util.List;

public class ProgramAreaDTO {
    public List<Point> points;
    public boolean polygon;
    public int radius;

    public static class Point {
        public float lat;
        public float lng;
    }

}


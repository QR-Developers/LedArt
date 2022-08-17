/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package cn.huidu.cloud.api.entity.program;

import cn.huidu.cloud.api.entity.program.TimeRangeDTO;
import cn.huidu.cloud.api.entity.program.WeekTimeRangeDTO;
import java.util.List;

public class ProgramScheduleDTO {
    public TimeRangeDTO date;
    public List<TimeRangeDTO> dates;
    public Float duration;
    public Float fixedDuration;
    public TimeRangeDTO time;
    public List<TimeRangeDTO> times;
    public List<String> week;
    public WeekTimeRangeDTO weeks;
}


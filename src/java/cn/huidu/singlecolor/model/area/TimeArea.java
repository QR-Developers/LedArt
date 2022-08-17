/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.singlecolor.model.Node
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.singlecolor.model.area;

import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.Node;
import cn.huidu.singlecolor.model.Widget;
import cn.huidu.singlecolor.model.widget.Time;

public class TimeArea
extends Area<Time> {
    @Override
    public TimeArea copy() {
        TimeArea timeArea = new TimeArea();
        this.copyTo(timeArea);
        timeArea.setTime((Time)this.getTime().copy());
        return timeArea;
    }

    @Override
    protected Time createChild(String string) {
        return new Time();
    }

    public Time getTime() {
        return (Time)this.getChild(0);
    }

    @Override
    public boolean isChildType(Object object) {
        return object instanceof Time;
    }

    public void setTime(Time time) {
        this.removeAllChild();
        this.addChild((Node)time);
    }
}


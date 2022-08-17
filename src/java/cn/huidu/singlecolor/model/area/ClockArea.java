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
import cn.huidu.singlecolor.model.widget.Clock;

public class ClockArea
extends Area<Clock> {
    @Override
    public ClockArea copy() {
        ClockArea clockArea = new ClockArea();
        this.copyTo(clockArea);
        clockArea.setClock((Clock)this.getClock().copy());
        return clockArea;
    }

    @Override
    protected Clock createChild(String string) {
        return new Clock();
    }

    public Clock getClock() {
        return (Clock)this.getChild(0);
    }

    @Override
    public boolean isChildType(Object object) {
        return object instanceof Clock;
    }

    public void setClock(Clock clock) {
        this.removeAllChild();
        this.addChild((Node)clock);
    }
}


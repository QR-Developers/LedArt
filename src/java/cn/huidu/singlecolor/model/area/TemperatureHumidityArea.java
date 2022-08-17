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
import cn.huidu.singlecolor.model.widget.TemperatureHumidity;

public class TemperatureHumidityArea
extends Area<TemperatureHumidity> {
    @Override
    public TemperatureHumidityArea copy() {
        TemperatureHumidityArea temperatureHumidityArea = new TemperatureHumidityArea();
        this.copyTo(temperatureHumidityArea);
        temperatureHumidityArea.setTemperatureHumidity((TemperatureHumidity)this.getTemperatureHumidity().copy());
        return temperatureHumidityArea;
    }

    @Override
    protected TemperatureHumidity createChild(String string) {
        return new TemperatureHumidity();
    }

    public TemperatureHumidity getTemperatureHumidity() {
        return (TemperatureHumidity)this.getChild(0);
    }

    @Override
    public boolean isChildType(Object object) {
        return object instanceof TemperatureHumidity;
    }

    public void setTemperatureHumidity(TemperatureHumidity temperatureHumidity) {
        this.removeAllChild();
        this.addChild((Node)temperatureHumidity);
    }
}


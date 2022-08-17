/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  cn.huidu.singlecolor.model.Node
 *  cn.huidu.singlecolor.model.area.AnimationWordArea
 *  cn.huidu.singlecolor.model.area.ClockArea
 *  cn.huidu.singlecolor.model.area.CountArea
 *  cn.huidu.singlecolor.model.area.ImageArea
 *  cn.huidu.singlecolor.model.area.TemperatureHumidityArea
 *  cn.huidu.singlecolor.model.area.TextArea
 *  cn.huidu.singlecolor.model.area.TimeArea
 *  cn.huidu.singlecolor.model.effect.Border
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package cn.huidu.singlecolor.model;

import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.Node;
import cn.huidu.singlecolor.model.area.AnimationWordArea;
import cn.huidu.singlecolor.model.area.ClockArea;
import cn.huidu.singlecolor.model.area.CountArea;
import cn.huidu.singlecolor.model.area.ImageArea;
import cn.huidu.singlecolor.model.area.TemperatureHumidityArea;
import cn.huidu.singlecolor.model.area.TextArea;
import cn.huidu.singlecolor.model.area.TimeArea;
import cn.huidu.singlecolor.model.effect.Border;
import m5.k;

public class Program
extends Node<Area> {
    public static final int SPLIT_MODE_DIY = 0;
    public static final int SPLIT_MODE_LEFT_RIGHT = 1;
    public static final int SPLIT_MODE_TOP_BOTTOM = 2;
    public Border border = new Border();
    public int duration = 600;
    public long endDate = 518400L + k.q(false) / 1000L;
    public int endTime = 86399;
    public int height;
    public String name;
    public boolean playByDate;
    public boolean playByDuration;
    public boolean playByTime;
    public boolean playOnFriday = true;
    public boolean playOnMonday = true;
    public boolean playOnSaturday = true;
    public boolean playOnSunday = true;
    public boolean playOnThursday = true;
    public boolean playOnTuesday = true;
    public boolean playOnWednesday = true;
    public int splitMode = 0;
    public long startDate = k.q(true) / 1000L - 86400L;
    public int startTime = 0;
    public String uuid;
    public int width;

    private void autoFitProgramBorder(Area area) {
        int n2 = this.getBorderSize();
        int n3 = area.margin;
        int n4 = n3 * 2;
        int n5 = area.width;
        int n6 = n4 + n5;
        int n7 = this.width;
        if (n6 == n7) {
            area.x = n2;
            area.width = n7 - n2 * 2;
        } else {
            int n8;
            int n9;
            if (area.x == n3) {
                area.x = n2;
                area.width = n5 + (n3 - n2);
            }
            if (n3 + ((n9 = area.x) + (n8 = area.width)) == n7) {
                area.width = n8 + (n3 - n2);
            }
        }
        int n10 = n3 * 2;
        int n11 = area.height;
        if (n10 + n11 == n7) {
            area.y = n2;
            area.height = this.height - n2 * 2;
        } else {
            int n12;
            int n13;
            if (area.y == n3) {
                area.y = n2;
                area.height = n11 + (n3 - n2);
            }
            if (n3 + ((n13 = area.y) + (n12 = area.height)) == this.height) {
                area.height = n12 + (n3 - n2);
            }
        }
        area.margin = n2;
    }

    private void copyTo(Program program) {
        program.splitMode = this.splitMode;
        program.width = this.width;
        program.height = this.height;
        program.playByDate = this.playByDate;
        program.playByTime = this.playByTime;
        program.playByDuration = this.playByDuration;
        program.startDate = this.startDate;
        program.endDate = this.endDate;
        program.startTime = this.startTime;
        program.endTime = this.endTime;
        program.duration = this.duration;
        program.playOnMonday = this.playOnMonday;
        program.playOnTuesday = this.playOnTuesday;
        program.playOnWednesday = this.playOnWednesday;
        program.playOnThursday = this.playOnThursday;
        program.playOnFriday = this.playOnFriday;
        program.playOnSaturday = this.playOnSaturday;
        program.playOnSunday = this.playOnSunday;
        program.border = this.border.copy();
    }

    private void correctAreaRect(Area area) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11 = area.x;
        int n12 = this.getBorderSize();
        if (n11 < n12) {
            area.width -= n12 - n11;
            area.x = n12;
        }
        if ((n10 = (n8 = area.x) + (n3 = area.width)) > (n7 = this.width) - n12) {
            area.width = n3 - (n8 + n3 - (n7 - n12));
        }
        if ((n9 = area.y) < n12) {
            area.height -= n12 - n9;
            area.y = n12;
        }
        if ((n4 = (n2 = area.y) + (n6 = area.height)) > (n5 = this.height) - n12) {
            area.height = n6 - (n2 + n6 - (n5 - n12));
        }
        if (area.width < 8) {
            area.width = 8;
            if (n8 + 8 > n7 - n12) {
                area.x = n7 - n12 - 8;
            }
        }
        if (area.height < 8) {
            area.height = 8;
            if (n2 + 8 > n5 - n12) {
                area.y = n5 - n12 - 8;
            }
        }
    }

    private void correctLeftRightLayout(Area area) {
        Area area2 = (Area)this.getChild(0);
        Area area3 = (Area)this.getChild(1);
        if (area2 != null && area3 != null) {
            int n2 = this.getBorderSize();
            int n3 = this.width;
            int n4 = n2 * 2;
            int n5 = n3 - n4;
            int n6 = this.height - n4;
            int n7 = area != null && area != area2 ? n5 - area3.width : area2.width;
            if (n5 > 16) {
                int n8;
                if (n7 < 8) {
                    n7 = 8;
                }
                if (n7 > (n8 = n5 - 8)) {
                    n7 = n8;
                }
            } else {
                n7 = n5 / 2;
            }
            area2.x = n2;
            area2.y = n2;
            area2.width = n7;
            area2.height = n6;
            area2.margin = n2;
            area3.x = n2 + n7;
            area3.y = n2;
            area3.height = n6;
            area3.width = n5 - n7;
            area3.margin = n2;
            this.disableBorderIfAreaIsTooSmall(area2);
            this.disableBorderIfAreaIsTooSmall(area3);
            return;
        }
        throw new RuntimeException("Must have two area for left right split mode!");
    }

    private void correctTopBottomLayout(Area area) {
        Area area2 = (Area)this.getChild(0);
        Area area3 = (Area)this.getChild(1);
        if (area2 != null && area3 != null) {
            int n2 = this.getBorderSize();
            int n3 = this.width;
            int n4 = n2 * 2;
            int n5 = n3 - n4;
            int n6 = this.height - n4;
            int n7 = area != null && area != area2 ? n6 - area3.height : area2.height;
            if (n6 > 16) {
                int n8;
                if (n7 < 8) {
                    n7 = 8;
                }
                if (n7 > (n8 = n6 - 8)) {
                    n7 = n8;
                }
            } else {
                n7 = n6 / 2;
            }
            area2.x = n2;
            area2.y = n2;
            area2.width = n5;
            area2.height = n7;
            area2.margin = n2;
            area3.x = n2;
            area3.y = n2 + n7;
            area3.width = n5;
            area3.height = n6 - n7;
            area3.margin = n2;
            this.disableBorderIfAreaIsTooSmall(area2);
            this.disableBorderIfAreaIsTooSmall(area3);
            return;
        }
        throw new RuntimeException("Must have two area for top bottom split mode!");
    }

    private void disableBorderIfAreaIsTooSmall(Area area) {
        int n2 = area.width;
        int n3 = area.getBorderSize();
        int n4 = n3 * 2;
        if (n2 - n4 < 8) {
            area.border.enable = false;
        }
        if (area.height - n4 < 8) {
            area.border.enable = false;
        }
    }

    public void checkAreasRect() {
        int n2 = this.splitMode;
        if (n2 == 1) {
            this.correctLeftRightLayout(null);
            return;
        }
        if (n2 == 2) {
            this.correctTopBottomLayout(null);
            return;
        }
        for (int i2 = 0; i2 < this.childCount(); ++i2) {
            Area area = (Area)this.getChild(i2);
            this.correctAreaRect(area);
            this.disableBorderIfAreaIsTooSmall(area);
        }
    }

    public Program copy() {
        Program program = new Program();
        this.copyTo(program);
        for (int i2 = 0; i2 < this.childCount(); ++i2) {
            program.addChild((Node)((Area)this.getChild(i2)).copy());
        }
        return program;
    }

    protected Area createChild(String string) {
        if (string.equals((Object)TextArea.class.getSimpleName())) {
            return new TextArea();
        }
        if (string.equals((Object)ClockArea.class.getSimpleName())) {
            return new ClockArea();
        }
        if (string.equals((Object)ImageArea.class.getSimpleName())) {
            return new ImageArea();
        }
        if (string.equals((Object)TemperatureHumidityArea.class.getSimpleName())) {
            return new TemperatureHumidityArea();
        }
        if (string.equals((Object)TimeArea.class.getSimpleName())) {
            return new TimeArea();
        }
        if (string.equals((Object)CountArea.class.getSimpleName())) {
            return new CountArea();
        }
        if (string.equals((Object)AnimationWordArea.class.getSimpleName())) {
            return new AnimationWordArea();
        }
        return null;
    }

    public int getBorderSize() {
        Border border = this.border;
        if (border.enable) {
            return border.size;
        }
        return 0;
    }

    public boolean isChildType(Object object) {
        return object instanceof Area;
    }

    public void onAreaRectChanged(Area area) {
        int n2 = this.splitMode;
        if (n2 == 1) {
            this.correctLeftRightLayout(area);
            return;
        }
        if (n2 == 2) {
            this.correctTopBottomLayout(area);
            return;
        }
        this.correctAreaRect(area);
        this.disableBorderIfAreaIsTooSmall(area);
    }

    public void onProgramBorderChanged() {
        int n2 = this.splitMode;
        if (n2 == 1) {
            this.correctLeftRightLayout(null);
            return;
        }
        if (n2 == 2) {
            this.correctTopBottomLayout(null);
            return;
        }
        for (int i2 = 0; i2 < this.childCount(); ++i2) {
            Area area = (Area)this.getChild(i2);
            this.autoFitProgramBorder(area);
            this.disableBorderIfAreaIsTooSmall(area);
        }
    }

    public void onScreenSizeChanged(int n2, int n3) {
        int n4;
        int n5 = this.width;
        int n6 = this.height;
        this.width = n2;
        this.height = n3;
        if (n5 != 0 && n6 != 0 && (n4 = this.splitMode) != 1 && n4 != 2) {
            int n7 = this.getBorderSize();
            int n8 = n7 * 2;
            float f2 = (float)(n2 - n8) / (float)(n5 - n8);
            float f3 = (float)(n3 - n8) / (float)(n6 - n8);
            for (int i2 = 0; i2 < this.childCount(); ++i2) {
                Area area = (Area)this.getChild(i2);
                float f4 = f2 * (float)(area.x - n7);
                float f5 = n7;
                area.x = Math.round((float)(f4 + f5));
                area.y = Math.round((float)(f5 + f3 * (float)(area.y - n7)));
                area.width = Math.round((float)(f2 * (float)area.width));
                area.height = Math.round((float)(f3 * (float)area.height));
                this.correctAreaRect(area);
                this.disableBorderIfAreaIsTooSmall(area);
            }
            return;
        }
        this.checkAreasRect();
    }
}


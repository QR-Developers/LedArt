/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 *  cn.huidu.singlecolor.R
 *  cn.huidu.singlecolor.R$string
 *  cn.huidu.singlecolor.model.Node
 *  cn.huidu.singlecolor.model.area.ClockArea
 *  cn.huidu.singlecolor.model.area.ImageArea
 *  cn.huidu.singlecolor.model.area.TextArea
 *  cn.huidu.singlecolor.model.widget.Text
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.UUID
 */
package cn.huidu.singlecolor.model;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import cn.huidu.singlecolor.R;
import cn.huidu.singlecolor.model.Area;
import cn.huidu.singlecolor.model.Node;
import cn.huidu.singlecolor.model.Program;
import cn.huidu.singlecolor.model.area.ClockArea;
import cn.huidu.singlecolor.model.area.ImageArea;
import cn.huidu.singlecolor.model.area.TextArea;
import cn.huidu.singlecolor.model.widget.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Screen
extends Node<Program> {
    public int colorLevel;
    public int grayLevel;
    public int height;
    public boolean isDoubleScreen;
    public int lastEditProgram;
    public long lastModifyTime;
    public int maxIndex;
    public String name;
    public String uuid = UUID.randomUUID().toString();
    public int width;

    private List<Integer> listProgramNumber(String string) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.childCount(); ++i2) {
            String string2;
            String string3 = ((Program)this.getChild((int)i2)).name;
            if (!string3.startsWith(string) || (string2 = string3.substring(string.length())) == null || !string2.matches("\\d+")) continue;
            arrayList.add((Object)Integer.valueOf((String)string2));
        }
        Collections.sort((List)arrayList);
        return arrayList;
    }

    public void addChild(Program program) {
        super.addChild((Node)program);
        program.width = this.width;
        program.height = this.height;
        if (program.uuid == null) {
            program.uuid = UUID.randomUUID().toString();
        }
        if (program.name == null) {
            program.name = this.getNewProgramName("New program");
        }
        program.checkAreasRect();
    }

    public /* varargs */ Screen copyWithPrograms(String ... arrstring) {
        Screen screen = new Screen();
        screen.name = this.name;
        screen.uuid = this.uuid;
        screen.width = this.width;
        screen.height = this.height;
        screen.colorLevel = this.colorLevel;
        screen.grayLevel = this.grayLevel;
        screen.isDoubleScreen = this.isDoubleScreen;
        if (arrstring != null && arrstring.length > 0) {
            int n2 = arrstring.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Program program = this.getProgramWithId(arrstring[i2]);
                if (program == null) continue;
                screen.addChild(program);
            }
        }
        return screen;
    }

    public void correctProgramSize() {
        for (int i2 = 0; i2 < this.childCount(); ++i2) {
            Program program = (Program)this.getChild(i2);
            program.width = this.width;
            program.height = this.height;
            program.checkAreasRect();
        }
    }

    protected Program createChild(String string) {
        return new Program();
    }

    public Program createDefaultProgram(Context context) {
        Program program = new Program();
        program.splitMode = 0;
        String string2 = context == null ? "New Program" : context.getString(R.string.program_name_prefix);
        program.name = this.getNewProgramName(string2);
        program.uuid = UUID.randomUUID().toString();
        program.width = this.width;
        program.height = this.height;
        TextArea textArea = new TextArea();
        textArea.setText(Text.newInstance((Context)context));
        textArea.setRect(0, 0, this.width, this.height);
        program.addChild((Node)textArea);
        return program;
    }

    public String getNewProgramName(String string2) {
        List<Integer> list = this.listProgramNumber(string2);
        int n2 = 1;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (n2 != (Integer)list.get(i2)) continue;
            ++n2;
        }
        this.maxIndex = n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(this.maxIndex);
        return stringBuilder.toString();
    }

    public Program getProgramWithId(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return null;
        }
        for (int i2 = 0; i2 < this.childCount(); ++i2) {
            Program program = (Program)this.getChild(i2);
            if (!string2.equals((Object)program.uuid)) continue;
            return program;
        }
        return null;
    }

    public boolean isChildType(Object object) {
        return object instanceof Program;
    }

    public void printContents() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Screen: ");
        for (int i2 = 0; i2 < this.childCount(); ++i2) {
            Program program = (Program)this.getChild(i2);
            if (i2 != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("Program: ");
            stringBuilder.append(program.name);
            stringBuilder.append(" {\n");
            for (int i3 = 0; i3 < program.childCount(); ++i3) {
                Area area = (Area)program.getChild(i3);
                if (i3 != 0) {
                    stringBuilder.append(", ");
                }
                if (area instanceof TextArea) {
                    stringBuilder.append("TextArea");
                    continue;
                }
                if (area instanceof ImageArea) {
                    stringBuilder.append("ImageArea");
                    continue;
                }
                if (area instanceof ClockArea) {
                    stringBuilder.append("ClockArea");
                    continue;
                }
                stringBuilder.append("Area");
            }
            stringBuilder.append("}");
        }
        Log.d((String)this.TAG, (String)stringBuilder.toString());
    }

    public void setScreenSize(int n2, int n3) {
        this.width = n2;
        this.height = n3;
        for (int i2 = 0; i2 < this.childCount(); ++i2) {
            ((Program)this.getChild(i2)).onScreenSizeChanged(n2, n3);
        }
    }
}


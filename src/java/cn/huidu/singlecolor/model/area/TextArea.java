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
import cn.huidu.singlecolor.model.widget.Text;

public class TextArea
extends Area<Text> {
    @Override
    public TextArea copy() {
        TextArea textArea = new TextArea();
        this.copyTo(textArea);
        textArea.setText((Text)this.getText().copy());
        return textArea;
    }

    @Override
    protected Text createChild(String string) {
        return new Text();
    }

    public Text getText() {
        return (Text)this.getChild(0);
    }

    @Override
    public boolean isChildType(Object object) {
        return object instanceof Text;
    }

    public void setText(Text text) {
        this.removeAllChild();
        this.addChild((Node)text);
    }
}


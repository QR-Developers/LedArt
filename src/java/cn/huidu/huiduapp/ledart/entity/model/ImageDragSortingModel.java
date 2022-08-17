/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  cn.huidu.singlecolor.model.widget.Image
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

import android.graphics.Bitmap;
import cn.huidu.singlecolor.model.widget.Image;

public class ImageDragSortingModel {
    private boolean isGif = false;
    private Bitmap mBitmap;
    private boolean mCanLongPressDrag;
    private boolean mCanShowContextMenu;
    private Image mImage;
    private int mPosition;
    private boolean mSelectState;
    private Type mType;

    public ImageDragSortingModel(int n2, boolean bl, boolean bl2, boolean bl3, Image image, Bitmap bitmap, boolean bl4) {
        this.mPosition = n2;
        this.mSelectState = bl;
        this.mCanShowContextMenu = bl2;
        this.mCanLongPressDrag = bl3;
        this.mImage = image;
        this.mBitmap = bitmap;
        this.isGif = bl4;
        this.mType = Type.COMMON;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public Image getImage() {
        return this.mImage;
    }

    public int getPosition() {
        return this.mPosition;
    }

    public Type getType() {
        return this.mType;
    }

    public boolean isCanLongPressDrag() {
        return this.mCanLongPressDrag;
    }

    public boolean isCanShowContextMenu() {
        return this.mCanShowContextMenu;
    }

    public boolean isGif() {
        return this.isGif;
    }

    public boolean isSelectState() {
        return this.mSelectState;
    }

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public void setGif(boolean bl) {
        this.isGif = bl;
    }

    public void setImage(Image image) {
        this.mImage = image;
    }

    public void setPosition(int n2) {
        this.mPosition = n2;
    }

    public void setSelectState(boolean bl) {
        this.mSelectState = bl;
    }

    public void setType(Type type) {
        this.mType = type;
    }

    public static final class Type
    extends Enum<Type> {
        private static final /* synthetic */ Type[] $VALUES;
        public static final /* enum */ Type ADD;
        public static final /* enum */ Type COMMON;

        static {
            Type type;
            Type type2;
            COMMON = type = new Type();
            ADD = type2 = new Type();
            $VALUES = new Type[]{type, type2};
        }

        public static Type valueOf(String string) {
            return (Type)Enum.valueOf(Type.class, (String)string);
        }

        public static Type[] values() {
            return (Type[])$VALUES.clone();
        }
    }

}


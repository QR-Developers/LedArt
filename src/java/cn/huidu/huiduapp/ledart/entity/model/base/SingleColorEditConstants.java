/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  m5.m0
 */
package cn.huidu.huiduapp.ledart.entity.model.base;

import android.content.Context;
import cn.huidu.huiduapp.ledart.HuiduApplication;
import m5.m0;

public class SingleColorEditConstants {
    public static final int ANIM_DURATION = 200;
    public static final int ANIM_FADE_DURATION = 200;
    public static final float ATTRS_MENU_HEIGHT;
    public static final float PROGRAM_HINT_HEIGHT;
    public static final float PROGRAM_LIST_HEIGHT;
    public static final float TEXT_MORE_SETTING_HEIGHT;
    public static final float TEXT_OPERATE_HEIGHT;
    public static final float TEXT_PREVIEW_HEIGHT;
    public static final float VIEWPAGER_HEIGHT;

    static {
        PROGRAM_HINT_HEIGHT = m0.a((Context)HuiduApplication.c(), (float)50.0f);
        PROGRAM_LIST_HEIGHT = m0.a((Context)HuiduApplication.c(), (float)60.0f);
        ATTRS_MENU_HEIGHT = m0.a((Context)HuiduApplication.c(), (float)45.0f);
        VIEWPAGER_HEIGHT = m0.a((Context)HuiduApplication.c(), (float)248.0f);
        TEXT_OPERATE_HEIGHT = m0.a((Context)HuiduApplication.c(), (float)45.0f);
        TEXT_PREVIEW_HEIGHT = m0.a((Context)HuiduApplication.c(), (float)203.0f);
        TEXT_MORE_SETTING_HEIGHT = m0.a((Context)HuiduApplication.c(), (float)248.0f);
    }
}


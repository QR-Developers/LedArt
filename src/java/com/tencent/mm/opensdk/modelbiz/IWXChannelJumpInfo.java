/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 */
package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;

public interface IWXChannelJumpInfo {
    public static final int WX_CHANNEL_JUMP_TYPE_MINI_PROGRAM = 1;
    public static final int WX_CHANNEL_JUMP_TYPE_UNKNOWN = 0;
    public static final int WX_CHANNEL_JUMP_TYPE_URL = 2;

    public boolean checkArgs();

    public void serialize(Bundle var1);

    public int type();

    public void unserialize(Bundle var1);
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  java.lang.Object
 *  java.lang.String
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

public class WXLocationObject
implements WXMediaMessage.IMediaObject {
    private static final String TAG = "MicroMsg.SDK.WXLocationObject";
    public double lat;
    public double lng;

    public WXLocationObject() {
        this(0.0, 0.0);
    }

    public WXLocationObject(double d3, double d4) {
        this.lat = d3;
        this.lng = d4;
    }

    public boolean checkArgs() {
        return true;
    }

    public void serialize(Bundle bundle) {
        bundle.putDouble("_wxlocationobject_lat", this.lat);
        bundle.putDouble("_wxlocationobject_lng", this.lng);
    }

    public int type() {
        return 30;
    }

    public void unserialize(Bundle bundle) {
        this.lat = bundle.getDouble("_wxlocationobject_lat");
        this.lng = bundle.getDouble("_wxlocationobject_lng");
    }
}


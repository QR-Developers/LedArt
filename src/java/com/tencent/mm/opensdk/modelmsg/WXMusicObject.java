/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  com.tencent.mm.opensdk.utils.Log
 *  java.lang.Object
 *  java.lang.String
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;

public class WXMusicObject
implements WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final int LYRIC_LENGTH_LIMIT = 32768;
    private static final String TAG = "MicroMsg.SDK.WXMusicObject";
    public String musicDataUrl;
    public String musicLowBandDataUrl;
    public String musicLowBandUrl;
    public String musicUrl;
    public String songAlbumUrl;
    public String songLyric;

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean checkArgs() {
        String string;
        String string2;
        String string3 = this.musicUrl;
        if (string3 != null && string3.length() != 0 || (string2 = this.musicLowBandUrl) != null && string2.length() != 0) {
            String string4 = this.musicUrl;
            if (string4 != null && string4.length() > 10240) {
                string = "checkArgs fail, musicUrl is too long";
            } else {
                String string5 = this.musicLowBandUrl;
                if (string5 != null && string5.length() > 10240) {
                    string = "checkArgs fail, musicLowBandUrl is too long";
                } else {
                    String string6 = this.songAlbumUrl;
                    if (string6 != null && string6.length() > 10240) {
                        string = "checkArgs fail, songAlbumUrl is too long";
                    } else {
                        String string7 = this.songLyric;
                        if (string7 == null) return true;
                        if (string7.length() <= 32768) return true;
                        string = "checkArgs fail, songLyric is too long";
                    }
                }
            }
        } else {
            string = "both arguments are null";
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxmusicobject_musicUrl", this.musicUrl);
        bundle.putString("_wxmusicobject_musicLowBandUrl", this.musicLowBandUrl);
        bundle.putString("_wxmusicobject_musicDataUrl", this.musicDataUrl);
        bundle.putString("_wxmusicobject_musicLowBandDataUrl", this.musicLowBandDataUrl);
        bundle.putString("_wxmusicobject_musicAlbumUrl", this.songAlbumUrl);
        bundle.putString("_wxmusicobject_musicLyric", this.songLyric);
    }

    public int type() {
        return 3;
    }

    public void unserialize(Bundle bundle) {
        this.musicUrl = bundle.getString("_wxmusicobject_musicUrl");
        this.musicLowBandUrl = bundle.getString("_wxmusicobject_musicLowBandUrl");
        this.musicDataUrl = bundle.getString("_wxmusicobject_musicDataUrl");
        this.musicLowBandDataUrl = bundle.getString("_wxmusicobject_musicLowBandDataUrl");
        this.songAlbumUrl = bundle.getString("_wxmusicobject_musicAlbumUrl");
        this.songLyric = bundle.getString("_wxmusicobject_musicLyric");
    }
}


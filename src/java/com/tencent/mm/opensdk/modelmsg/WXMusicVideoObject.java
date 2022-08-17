/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 *  com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject
 *  com.tencent.mm.opensdk.utils.Log
 *  com.tencent.mm.opensdk.utils.b
 *  java.lang.Object
 *  java.lang.String
 */
package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;

public class WXMusicVideoObject
implements WXMediaMessage.IMediaObject {
    private static final int HD_ALBUM_FILE_LENGTH = 10485760;
    private static final int LYRIC_LENGTH_LIMIT = 32768;
    private static final int STRING_LIMIT = 1024;
    private static final String TAG = "MicroMsg.SDK.WXMusicVideoObject";
    private static final int URL_LENGTH_LIMIT = 10240;
    public String albumName;
    public int duration;
    public String hdAlbumThumbFilePath;
    public String identification;
    public long issueDate;
    public String musicDataUrl;
    public String musicGenre;
    public String musicOperationUrl;
    public String musicUrl;
    public String singerName;
    public String songLyric;

    private int getFileSize(String string) {
        return b.a((String)string);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean checkArgs() {
        String string;
        if (!b.b((String)this.musicUrl) && this.musicUrl.length() <= 10240) {
            if (!b.b((String)this.musicDataUrl) && this.musicDataUrl.length() <= 10240) {
                if (!b.b((String)this.singerName) && this.singerName.length() <= 1024) {
                    if (!b.b((String)this.songLyric) && this.songLyric.length() > 32768) {
                        string = "songLyric.length exceeds the limit";
                    } else if (!b.b((String)this.hdAlbumThumbFilePath) && this.hdAlbumThumbFilePath.length() > 1024) {
                        string = "hdAlbumThumbFilePath.length exceeds the limit";
                    } else if (!b.b((String)this.hdAlbumThumbFilePath) && this.getFileSize(this.hdAlbumThumbFilePath) > 10485760) {
                        string = "hdAlbumThumbFilePath file length exceeds the limit";
                    } else if (!b.b((String)this.musicGenre) && this.musicGenre.length() > 1024) {
                        string = "musicGenre.length exceeds the limit";
                    } else if (!b.b((String)this.identification) && this.identification.length() > 1024) {
                        string = "identification.length exceeds the limit";
                    } else {
                        if (b.b((String)this.musicOperationUrl)) return true;
                        if (this.musicOperationUrl.length() <= 10240) return true;
                        string = "musicOperationUrl.length exceeds the limit";
                    }
                } else {
                    string = "singerName.length exceeds the limit";
                }
            } else {
                string = "musicDataUrl.length exceeds the limit";
            }
        } else {
            string = "musicUrl.length exceeds the limit";
        }
        Log.e((String)TAG, (String)string);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxmusicvideoobject_musicUrl", this.musicUrl);
        bundle.putString("_wxmusicvideoobject_musicDataUrl", this.musicDataUrl);
        bundle.putString("_wxmusicvideoobject_singerName", this.singerName);
        bundle.putString("_wxmusicvideoobject_songLyric", this.songLyric);
        bundle.putString("_wxmusicvideoobject_hdAlbumThumbFilePath", this.hdAlbumThumbFilePath);
        bundle.putString("_wxmusicvideoobject_albumName", this.albumName);
        bundle.putString("_wxmusicvideoobject_musicGenre", this.musicGenre);
        bundle.putLong("_wxmusicvideoobject_issueDate", this.issueDate);
        bundle.putString("_wxmusicvideoobject_identification", this.identification);
        bundle.putInt("_wxmusicvideoobject_duration", this.duration);
        bundle.putString("_wxmusicvideoobject_musicOperationUrl", this.musicOperationUrl);
    }

    public int type() {
        return 76;
    }

    public void unserialize(Bundle bundle) {
        this.musicUrl = bundle.getString("_wxmusicvideoobject_musicUrl");
        this.musicDataUrl = bundle.getString("_wxmusicvideoobject_musicDataUrl");
        this.singerName = bundle.getString("_wxmusicvideoobject_singerName");
        this.songLyric = bundle.getString("_wxmusicvideoobject_songLyric");
        this.hdAlbumThumbFilePath = bundle.getString("_wxmusicvideoobject_hdAlbumThumbFilePath");
        this.albumName = bundle.getString("_wxmusicvideoobject_albumName");
        this.musicGenre = bundle.getString("_wxmusicvideoobject_musicGenre");
        this.issueDate = bundle.getLong("_wxmusicvideoobject_issueDate", 0L);
        this.identification = bundle.getString("_wxmusicvideoobject_identification");
        this.duration = bundle.getInt("_wxmusicvideoobject_duration", 0);
        this.musicOperationUrl = bundle.getString("_wxmusicvideoobject_musicOperationUrl");
    }
}


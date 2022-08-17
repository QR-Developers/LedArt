/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package cn.huidu.huiduapp.ledart.entity.model;

public class DownloadSourceModel {
    private boolean mDownloading;
    private boolean mLocalFile;
    private String mMd5;
    private String mName;
    private String mPath;
    private String mPreview;
    private String mType;

    public String getMd5() {
        return this.mMd5;
    }

    public String getName() {
        return this.mName;
    }

    public String getPath() {
        return this.mPath;
    }

    public String getPreview() {
        return this.mPreview;
    }

    public String getType() {
        return this.mType;
    }

    public boolean isDownloading() {
        return this.mDownloading;
    }

    public boolean isLocalFile() {
        return this.mLocalFile;
    }

    public void setDownloading(boolean bl) {
        this.mDownloading = bl;
    }

    public void setLocalFile(boolean bl) {
        this.mLocalFile = bl;
    }

    public void setMd5(String string) {
        this.mMd5 = string;
    }

    public void setName(String string) {
        this.mName = string;
    }

    public void setPath(String string) {
        this.mPath = string;
    }

    public void setPreview(String string) {
        this.mPreview = string;
    }

    public void setType(String string) {
        this.mType = string;
    }
}


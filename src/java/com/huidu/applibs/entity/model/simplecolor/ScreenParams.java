/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  com.huidu.applibs.common.model.CardConfig
 *  com.huidu.applibs.entity.model.BrightModel
 *  com.huidu.applibs.entity.model.BrightModel$BrightType
 *  com.huidu.applibs.entity.model.simplecolor.SimpleColorCard
 *  java.io.Serializable
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.huidu.applibs.entity.model.simplecolor;

import android.util.Log;
import androidx.annotation.NonNull;
import com.huidu.applibs.common.model.CardConfig;
import com.huidu.applibs.entity.model.BrightModel;
import com.huidu.applibs.entity.model.simplecolor.SimpleColorCard;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import m5.k;
import m5.n;
import org.json.JSONException;
import org.json.JSONObject;

public class ScreenParams
implements Serializable {
    private int ICType;
    private int OEProperty;
    private int bottomHeight;
    private int bottomWidth;
    private int bottomX;
    private int bottomY;
    private int brightType;
    private int button1;
    private int button2;
    private int button3;
    private int button4;
    private int clkProperty;
    private int clokcFrequence;
    private int dataProperty;
    private int defaultBrightValue;
    private int firstBrightTimeSeconds;
    private int firstBrightValue;
    private boolean isFirstBrightEnable;
    private boolean isOpen;
    private boolean isSecondBrightEnable;
    private boolean isThirdBrightEnable;
    private boolean isUsing138;
    private int lineRemove;
    private int lockProperty;
    private SimpleColorCard.ColorMode mColorMode;
    private boolean mEnable;
    private SimpleColorCard.GrayMode mGrayMode;
    private boolean mIsDoubleScreen;
    private SimpleColorCard.PlayMode mPlayMode;
    private SimpleColorCard.ScreenType mScreenType;
    private int mSwitchOffTime;
    private int mSwitchOnTime;
    private int memorySize;
    private int middleHeight;
    private int middleWidth;
    private int middleX;
    private int middleY;
    private int priorityType;
    private int scanFrequence;
    private int screenStatus = -1;
    private int secondBrightTimeSeconds;
    private int secondBrightValue;
    private int singleHeight;
    private int singleWidth;
    private int thirdBrightTimeSeconds;
    private int thirdBrightValue;
    private int topHeight;
    private int topWidth;
    private int topX;
    private int topY;

    private void syncBrightness(@NonNull JSONObject jSONObject) {
        try {
            if (jSONObject.has("brightType")) {
                this.brightType = jSONObject.getInt("brightType");
            }
            if (jSONObject.has("defaultBrightValue")) {
                this.defaultBrightValue = jSONObject.getInt("defaultBrightValue");
            }
            if (jSONObject.has("isFirstBrightEnable")) {
                this.isFirstBrightEnable = jSONObject.getBoolean("isFirstBrightEnable");
            }
            if (jSONObject.has("isSecondBrightEnable")) {
                this.isSecondBrightEnable = jSONObject.getBoolean("isSecondBrightEnable");
            }
            if (jSONObject.has("isThirdBrightEnable")) {
                this.isThirdBrightEnable = jSONObject.getBoolean("isThirdBrightEnable");
            }
            if (jSONObject.has("firstBrightValue")) {
                this.firstBrightValue = jSONObject.getInt("firstBrightValue");
            }
            if (jSONObject.has("secondBrightValue")) {
                this.secondBrightValue = jSONObject.getInt("secondBrightValue");
            }
            if (jSONObject.has("thirdBrightValue")) {
                this.thirdBrightValue = jSONObject.getInt("thirdBrightValue");
            }
            if (jSONObject.has("firstBrightTimeSeconds")) {
                this.firstBrightTimeSeconds = jSONObject.getInt("firstBrightTimeSeconds");
            }
            if (jSONObject.has("secondBrightTimeSeconds")) {
                this.secondBrightTimeSeconds = jSONObject.getInt("secondBrightTimeSeconds");
            }
            if (jSONObject.has("thirdBrightTimeSeconds")) {
                this.thirdBrightTimeSeconds = jSONObject.getInt("thirdBrightTimeSeconds");
                return;
            }
        }
        catch (Exception exception) {
            Log.d((String)"Error", (String)exception.getMessage());
        }
    }

    private void syncButtonEnables(@NonNull JSONObject jSONObject) {
        try {
            if (jSONObject.has("button1")) {
                this.button1 = jSONObject.getInt("button1");
            }
            if (jSONObject.has("button2")) {
                this.button2 = jSONObject.getInt("button2");
            }
            if (jSONObject.has("button3")) {
                this.button3 = jSONObject.getInt("button3");
            }
            if (jSONObject.has("button4")) {
                this.button4 = jSONObject.getInt("button4");
                return;
            }
        }
        catch (JSONException jSONException) {
            Log.d((String)"Error", (String)jSONException.getMessage());
        }
    }

    private void syncCrossScreen(@NonNull JSONObject jSONObject) {
        try {
            if (jSONObject.has("topX")) {
                this.topX = jSONObject.getInt("topX");
            }
            if (jSONObject.has("topY")) {
                this.topY = jSONObject.getInt("topY");
            }
            if (jSONObject.has("topWidth")) {
                this.topWidth = jSONObject.getInt("topWidth");
            }
            if (jSONObject.has("topHeight")) {
                this.topHeight = jSONObject.getInt("topHeight");
            }
            if (jSONObject.has("middleX")) {
                this.middleX = jSONObject.getInt("middleX");
            }
            if (jSONObject.has("middleY")) {
                this.middleY = jSONObject.getInt("middleY");
            }
            if (jSONObject.has("middleWidth")) {
                this.middleWidth = jSONObject.getInt("middleWidth");
            }
            if (jSONObject.has("middleHeight")) {
                this.middleHeight = jSONObject.getInt("middleHeight");
            }
            if (jSONObject.has("bottomX")) {
                this.bottomX = jSONObject.getInt("bottomX");
            }
            if (jSONObject.has("bottomY")) {
                this.bottomY = jSONObject.getInt("bottomY");
            }
            if (jSONObject.has("bottomWidth")) {
                this.bottomWidth = jSONObject.getInt("bottomWidth");
            }
            if (jSONObject.has("bottomHeight")) {
                this.bottomHeight = jSONObject.getInt("bottomHeight");
                return;
            }
        }
        catch (JSONException jSONException) {
            Log.d((String)"Error", (String)jSONException.getMessage());
        }
    }

    private void syncSwitch(@NonNull JSONObject jSONObject) {
        try {
            if (jSONObject.has("mEnable")) {
                this.mEnable = jSONObject.getBoolean("mEnable");
            }
            if (jSONObject.has("mSwitchOnTime")) {
                this.mSwitchOnTime = jSONObject.getInt("mSwitchOnTime");
            }
            if (jSONObject.has("mSwitchOffTime")) {
                this.mSwitchOffTime = jSONObject.getInt("mSwitchOffTime");
                return;
            }
        }
        catch (JSONException jSONException) {
            Log.d((String)"Error", (String)jSONException.getMessage());
        }
    }

    public int getBottomHeight() {
        return this.bottomHeight;
    }

    public int getBottomWidth() {
        return this.bottomWidth;
    }

    public int getBottomX() {
        return this.bottomX;
    }

    public int getBottomY() {
        return this.bottomY;
    }

    public BrightModel.BrightType getBrightType() {
        int n = this.brightType;
        if (n == 0) {
            return BrightModel.BrightType.Default;
        }
        if (n == 1) {
            return BrightModel.BrightType.Auto;
        }
        return BrightModel.BrightType.ByTimePeriod;
    }

    public int getButton1() {
        return this.button1;
    }

    public int getButton2() {
        return this.button2;
    }

    public int getButton3() {
        return this.button3;
    }

    public int getButton4() {
        return this.button4;
    }

    public int getClkProperty() {
        return this.clkProperty;
    }

    public int getClokcFrequence() {
        return this.clokcFrequence;
    }

    public SimpleColorCard.ColorMode getColorMode() {
        if (this.mColorMode == null) {
            this.mColorMode = SimpleColorCard.ColorMode.SINGLE;
        }
        return this.mColorMode;
    }

    public int getDataProperty() {
        return this.dataProperty;
    }

    public int getDefaultBrightValue() {
        return this.defaultBrightValue;
    }

    public boolean getEnable() {
        return this.mEnable;
    }

    public int getFirstBrightTimeSeconds() {
        return this.firstBrightTimeSeconds;
    }

    public int getFirstBrightValue() {
        return this.firstBrightValue;
    }

    public SimpleColorCard.GrayMode getGrayMode() {
        if (this.mGrayMode == null) {
            this.mGrayMode = SimpleColorCard.GrayMode.OneBit;
        }
        return this.mGrayMode;
    }

    public int getICType() {
        return this.ICType;
    }

    public boolean getIsFirstBrightEnable() {
        return this.isSecondBrightEnable;
    }

    public boolean getIsSecondBrightEnable() {
        return this.isFirstBrightEnable;
    }

    public boolean getIsThirdBrightEnable() {
        return this.isThirdBrightEnable;
    }

    public boolean getIsUsing138() {
        return this.isUsing138;
    }

    public int getLineRemove() {
        return this.lineRemove;
    }

    public int getLockProperty() {
        return this.lockProperty;
    }

    public int getMemorySize() {
        return this.memorySize;
    }

    public int getMiddleHeight() {
        return this.middleHeight;
    }

    public int getMiddleWidth() {
        return this.middleWidth;
    }

    public int getMiddleX() {
        return this.middleX;
    }

    public int getMiddleY() {
        return this.middleY;
    }

    public int getOEProperty() {
        return this.OEProperty;
    }

    public SimpleColorCard.PlayMode getPlayMode() {
        if (this.mPlayMode == null) {
            this.mPlayMode = SimpleColorCard.PlayMode.DEFAULT;
        }
        return this.mPlayMode;
    }

    public int getPriorityType() {
        return this.priorityType;
    }

    public int getScanFrequence() {
        return this.scanFrequence;
    }

    public boolean getScreenStatus() {
        block7 : {
            boolean bl;
            block9 : {
                block8 : {
                    int n = this.screenStatus;
                    if (-1 != n && 2 == n) {
                        return false;
                    }
                    if (!this.mEnable) break block7;
                    Date date = new Date();
                    String string2 = new SimpleDateFormat("HH:mm").format(date);
                    int n2 = this.mSwitchOnTime;
                    boolean bl2 = n2 <= this.mSwitchOffTime;
                    if (bl2) {
                        boolean bl3 = k.a(string2, n2);
                        boolean bl4 = false;
                        if (bl3) {
                            boolean bl5 = k.t(this.mSwitchOffTime, string2);
                            bl4 = false;
                            if (bl5) {
                                bl4 = true;
                            }
                        }
                        return bl4;
                    }
                    if (k.a(string2, n2)) break block8;
                    boolean bl6 = k.t(this.mSwitchOffTime, string2);
                    bl = false;
                    if (!bl6) break block9;
                }
                bl = true;
            }
            return bl;
        }
        return true;
    }

    public int getScreenStatusVal() {
        int n = this.screenStatus;
        if (-1 != n && (4 == n || 2 == n)) {
            return n;
        }
        if (this.mEnable) {
            Date date = new Date();
            String string2 = new SimpleDateFormat("HH:mm").format(date);
            int n2 = this.mSwitchOnTime;
            boolean bl = n2 <= this.mSwitchOffTime;
            if (bl) {
                return k.a(string2, n2) && k.t(this.mSwitchOffTime, string2);
            }
            if (!k.a(string2, n2)) {
                return k.t(this.mSwitchOffTime, string2);
            }
        }
        return 1;
    }

    public SimpleColorCard.ScreenType getScreenType() {
        if (this.mScreenType == null) {
            this.mScreenType = SimpleColorCard.ScreenType.NORMAL;
        }
        return this.mScreenType;
    }

    public int getSecondBrightTimeSeconds() {
        return this.secondBrightTimeSeconds;
    }

    public int getSecondBrightValue() {
        return this.secondBrightValue;
    }

    public int getSingleHeight() {
        return this.singleHeight;
    }

    public int getSingleWidth() {
        return this.singleWidth;
    }

    public int getSwitchOffTime() {
        return this.mSwitchOffTime;
    }

    public int getSwitchOnTime() {
        return this.mSwitchOnTime;
    }

    public int getThirdBrightTimeSeconds() {
        return this.thirdBrightTimeSeconds;
    }

    public int getThirdBrightValue() {
        return this.thirdBrightValue;
    }

    public int getTopHeight() {
        return this.topHeight;
    }

    public int getTopWidth() {
        return this.topWidth;
    }

    public int getTopX() {
        return this.topX;
    }

    public int getTopY() {
        return this.topY;
    }

    public boolean isDoubleScreen() {
        return this.mIsDoubleScreen;
    }

    public void setDoubleScreen(boolean bl) {
        this.mIsDoubleScreen = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void sync(@NonNull JSONObject jSONObject) {
        try {
            if (jSONObject.has("grayMode")) {
                this.mGrayMode = SimpleColorCard.GrayMode.mapIntToValue(Integer.valueOf((String)jSONObject.getString("grayMode")));
            }
            if (jSONObject.has("colorMode")) {
                this.mColorMode = SimpleColorCard.ColorMode.mapIntToValue(Integer.valueOf((String)jSONObject.getString("colorMode")));
            }
            if (jSONObject.has("screenMode")) {
                this.mScreenType = SimpleColorCard.ScreenType.mapIntToValue(Integer.valueOf((String)jSONObject.getString("screenMode")));
            }
            if (jSONObject.has("playMode")) {
                this.mPlayMode = SimpleColorCard.PlayMode.mapIntToValue(Integer.valueOf((String)jSONObject.getString("playMode")));
            }
            if (jSONObject.has("OEProperty")) {
                this.OEProperty = jSONObject.getInt("OEProperty");
            }
            if (jSONObject.has("dataProperty")) {
                this.dataProperty = jSONObject.getInt("dataProperty");
            }
            if (jSONObject.has("isUsing138")) {
                boolean bl = jSONObject.getInt("isUsing138") == 1;
                this.isUsing138 = bl;
            }
            if (jSONObject.has("lockProperty")) {
                this.lockProperty = jSONObject.getInt("lockProperty");
            }
            if (jSONObject.has("clokcFrequence")) {
                this.clokcFrequence = jSONObject.getInt("clokcFrequence");
            }
            if (jSONObject.has("memorySize")) {
                this.memorySize = jSONObject.getInt("memorySize");
            }
            if (jSONObject.has("lineRemove")) {
                this.lineRemove = jSONObject.getInt("lineRemove");
            }
            if (jSONObject.has("priorityType")) {
                this.priorityType = jSONObject.getInt("priorityType");
            }
            if (jSONObject.has("scanFrequence")) {
                this.scanFrequence = jSONObject.getInt("scanFrequence");
            }
            if (jSONObject.has("ICType")) {
                this.ICType = jSONObject.getInt("ICType");
            }
            if (jSONObject.has("clkProperty")) {
                this.clkProperty = jSONObject.getInt("clkProperty");
            }
            if (jSONObject.has("singleWidth")) {
                this.singleWidth = jSONObject.getInt("singleWidth");
            }
            if (jSONObject.has("singleHeight")) {
                this.singleHeight = jSONObject.getInt("singleHeight");
            }
            if (jSONObject.has("brightNess")) {
                this.syncBrightness(jSONObject.getJSONObject("brightNess"));
            }
            if (jSONObject.has("switchPams")) {
                this.syncSwitch(jSONObject.getJSONObject("switchPams"));
            }
            if (jSONObject.has("buttonUsing")) {
                this.syncButtonEnables(jSONObject.getJSONObject("buttonUsing"));
            }
            if (jSONObject.has("crossScreen")) {
                this.syncCrossScreen(jSONObject.getJSONObject("crossScreen"));
            }
            if (jSONObject.has("isScreenOpen")) {
                this.screenStatus = jSONObject.getInt("isScreenOpen");
            }
            if (!jSONObject.has("isDoubleScreen")) return;
            {
                int n = jSONObject.getInt("isDoubleScreen");
                boolean bl = false;
                if (n == 1) {
                    bl = true;
                }
                this.mIsDoubleScreen = bl;
                return;
            }
        }
        catch (JSONException jSONException) {
            Log.d((String)"Error", (String)jSONException.getMessage());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void syncFromFile(@NonNull JSONObject jSONObject) {
        String string2;
        String string3;
        block33 : {
            block32 : {
                try {
                    if (!jSONObject.has("mGrayMode")) break block32;
                    String string4 = jSONObject.getString("mGrayMode");
                    string2 = "ICType";
                    this.mGrayMode = n.b(SimpleColorCard.GrayMode.class, string4);
                    break block33;
                }
                catch (JSONException jSONException) {
                    Log.d((String)"Error", (String)jSONException.getMessage());
                    return;
                }
            }
            string2 = "ICType";
        }
        if (jSONObject.has("mColorMode")) {
            this.mColorMode = n.b(SimpleColorCard.ColorMode.class, jSONObject.getString("mColorMode"));
        }
        if (jSONObject.has("mScreenType")) {
            this.mScreenType = n.b(SimpleColorCard.ScreenType.class, jSONObject.getString("mScreenType"));
        }
        if (jSONObject.has("mPlayMode")) {
            this.mPlayMode = n.b(SimpleColorCard.PlayMode.class, jSONObject.getString("mPlayMode"));
        }
        if (jSONObject.has("OEProperty")) {
            this.OEProperty = jSONObject.getInt("OEProperty");
        }
        if (jSONObject.has("dataProperty")) {
            this.dataProperty = jSONObject.getInt("dataProperty");
        }
        if (jSONObject.has("isUsing138")) {
            this.isUsing138 = jSONObject.getBoolean("isUsing138");
        }
        if (jSONObject.has("lockProperty")) {
            this.lockProperty = jSONObject.getInt("lockProperty");
        }
        if (jSONObject.has("clokcFrequence")) {
            this.clokcFrequence = jSONObject.getInt("clokcFrequence");
        }
        if (jSONObject.has("memorySize")) {
            this.memorySize = jSONObject.getInt("memorySize");
        }
        if (jSONObject.has("lineRemove")) {
            this.lineRemove = jSONObject.getInt("lineRemove");
        }
        if (jSONObject.has("priorityType")) {
            this.priorityType = jSONObject.getInt("priorityType");
        }
        if (jSONObject.has("scanFrequence")) {
            this.scanFrequence = jSONObject.getInt("scanFrequence");
        }
        if (jSONObject.has(string3 = string2)) {
            this.ICType = jSONObject.getInt(string3);
        }
        if (jSONObject.has("clkProperty")) {
            this.clkProperty = jSONObject.getInt("clkProperty");
        }
        if (jSONObject.has("singleWidth")) {
            this.singleWidth = jSONObject.getInt("singleWidth");
        }
        if (jSONObject.has("signleHeight")) {
            this.singleHeight = jSONObject.getInt("singleHeight");
        }
        if (jSONObject.has("brightType")) {
            this.brightType = jSONObject.getInt("brightType");
        }
        if (jSONObject.has("defaultBrightValue")) {
            this.defaultBrightValue = jSONObject.getInt("defaultBrightValue");
        }
        if (jSONObject.has("isFirstBrightEnable")) {
            this.isFirstBrightEnable = jSONObject.getBoolean("isFirstBrightEnable");
        }
        if (jSONObject.has("isSecondBrightEnable")) {
            this.isSecondBrightEnable = jSONObject.getBoolean("isSecondBrightEnable");
        }
        if (jSONObject.has("isThirdBrightEnable")) {
            this.isThirdBrightEnable = jSONObject.getBoolean("isThirdBrightEnable");
        }
        if (jSONObject.has("firstBrightValue")) {
            this.firstBrightValue = jSONObject.getInt("firstBrightValue");
        }
        if (jSONObject.has("secondBrightValue")) {
            this.secondBrightValue = jSONObject.getInt("secondBrightValue");
        }
        if (jSONObject.has("thirdBrightValue")) {
            this.thirdBrightValue = jSONObject.getInt("thirdBrightValue");
        }
        if (jSONObject.has("firstBrightTimeSeconds")) {
            this.firstBrightTimeSeconds = jSONObject.getInt("firstBrightTimeSeconds");
        }
        if (jSONObject.has("secondBrightTimeSeconds")) {
            this.secondBrightTimeSeconds = jSONObject.getInt("secondBrightTimeSeconds");
        }
        if (jSONObject.has("thirdBrightTimeSeconds")) {
            this.thirdBrightTimeSeconds = jSONObject.getInt("thirdBrightTimeSeconds");
        }
        if (jSONObject.has("mEnable")) {
            this.mEnable = jSONObject.getBoolean("mEnable");
        }
        if (jSONObject.has("mSwitchOnTime")) {
            this.mSwitchOnTime = jSONObject.getInt("mSwitchOnTime");
        }
        if (jSONObject.has("mSwitchOffTime")) {
            this.mSwitchOffTime = jSONObject.getInt("mSwitchOffTime");
        }
        this.syncCrossScreen(jSONObject);
    }

    public void syncFromUSBCard(CardConfig cardConfig) {
        this.mColorMode = cardConfig.getColorMode();
    }
}


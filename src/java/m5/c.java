/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.huidu.applibs.common.model.CardConfig
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 */
package m5;

import com.huidu.applibs.common.model.CardConfig;
import java.util.Comparator;

public class c
implements Comparator<CardConfig> {
    private int b(String string, String string2) {
        if (string == null && string2 == null) {
            return 0;
        }
        if (string == null) {
            return 1;
        }
        if (string2 == null) {
            return -1;
        }
        return string.compareTo(string2);
    }

    public int a(CardConfig cardConfig, CardConfig cardConfig2) {
        int n5 = this.b(cardConfig2.getIsOnline(), cardConfig.getIsOnline());
        if (cardConfig.getCardType() == cardConfig2.getCardType()) {
            if (n5 == 0) {
                if (!"true".equals((Object)cardConfig.getIsOnline())) {
                    String string = cardConfig.getIp();
                    String string2 = cardConfig2.getIp();
                    if ("0.0.0.0".equals((Object)string) && !"0.0.0.0".equals((Object)string2)) {
                        return -1;
                    }
                    if (!"0.0.0.0".equals((Object)string) && "0.0.0.0".equals((Object)string2)) {
                        return 1;
                    }
                }
                if ((n5 = this.b(cardConfig.getModelName(), cardConfig2.getModelName())) == 0) {
                    n5 = this.b(cardConfig.getCardName(), cardConfig2.getCardName());
                }
            }
            return n5;
        }
        return cardConfig2.getCardType() - cardConfig.getCardType();
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.huidu.applibs.common.model.CardConfig
 *  com.huidu.applibs.entity.a
 *  com.huidu.applibs.entity.b
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  l5.a
 *  l5.b
 */
package m5;

import com.huidu.applibs.common.model.CardConfig;
import com.huidu.applibs.entity.a;
import com.huidu.applibs.entity.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m5.c;

public class d {
    public static List<CardConfig> a() {
        ArrayList arrayList = new ArrayList();
        List list = l5.b.d().c();
        int n5 = 0;
        do {
            block7 : {
                try {
                    if (n5 < list.size()) {
                        a a3 = (a)list.get(n5);
                        if (a3.getModel() != null) {
                            arrayList.add((Object)l5.a.a((a)a3));
                        }
                        break block7;
                    }
                    if (arrayList.size() > 1) {
                        Collections.sort((List)arrayList, (Comparator)new c());
                        return arrayList;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                return arrayList;
            }
            ++n5;
        } while (true);
    }
}


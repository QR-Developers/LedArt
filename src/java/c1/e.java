/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  cn.huidu.huiduapp.ledart.entity.model.BoxMapModel
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  x0.e
 *  x0.e$a
 *  x0.e$b
 *  x0.l
 */
package c1;

import android.graphics.Rect;
import c1.d;
import cn.huidu.huiduapp.ledart.entity.model.BoxMapModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import x0.e;
import x0.l;

public class e {
    public static /* synthetic */ int a(e.a a2, e.a a3) {
        return e.j(a2, a3);
    }

    public static x0.e b(BoxMapModel boxMapModel, int n2) {
        if (boxMapModel == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 <= n2; ++i2) {
            arrayList.add((Object)e.e(i2, (List<Rect>)boxMapModel.getBoxList()));
        }
        return new x0.e((List)arrayList);
    }

    public static x0.e c(List<BoxMapModel> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (BoxMapModel boxMapModel : list) {
                arrayList.add((Object)e.e(boxMapModel.getPortNum(), (List<Rect>)boxMapModel.getBoxList()));
            }
            return new x0.e((List)arrayList);
        }
        return null;
    }

    private static e.b d(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        ArrayList arrayList;
        int n9;
        e.b b2;
        block14 : {
            block15 : {
                block11 : {
                    block12 : {
                        block13 : {
                            b2 = new e.b();
                            b2.l(n2);
                            arrayList = new ArrayList();
                            b2.j((List)arrayList);
                            if (n3 == 0 || n3 == 1) break block11;
                            if (n3 == 2 || n3 == 3) break block12;
                            if (n3 == 4 || n3 == 5) break block13;
                            if (n3 != 6 && n3 != 7) break block11;
                            n9 = 0 + n4 * (n6 - 1);
                            n8 = 0 + n5 * (n7 - 1);
                            break block14;
                        }
                        n8 = 0 + n5 * (n7 - 1);
                        n9 = 0;
                        break block14;
                    }
                    n9 = 0 + n4 * (n6 - 1);
                    break block15;
                }
                n9 = 0;
            }
            n8 = 0;
        }
        boolean bl = n3 == 0 || n3 == 1 || n3 == 4 || n3 == 5 || n3 != 2 && n3 != 3 && n3 != 6 && n3 != 7;
        boolean bl2 = n3 == 0 || n3 == 1 || n3 == 2 || n3 == 3 || n3 != 4 && n3 != 5 && n3 != 6 && n3 != 7;
        boolean bl3 = n3 == 0 || n3 == 2 || n3 == 4 || n3 == 6 || n3 != 1 && n3 != 3 && n3 != 5 && n3 != 7;
        for (int i2 = 0; i2 < n6 * n7; ++i2) {
            block22 : {
                int n10;
                block21 : {
                    block20 : {
                        block16 : {
                            block19 : {
                                int n11;
                                block18 : {
                                    block17 : {
                                        e.a a2 = new e.a();
                                        a2.h(i2);
                                        a2.j(n9);
                                        a2.k(n8);
                                        a2.i(n4);
                                        a2.g(n5);
                                        arrayList.add((Object)a2);
                                        if (!bl3) break block16;
                                        if (!bl) break block17;
                                        n11 = n9 + n4;
                                        if (n11 >= n6 * n4) {
                                            n8 = bl2 ? (n8 += n5) : (n8 -= n5);
                                            bl = false;
                                            continue;
                                        }
                                        break block18;
                                    }
                                    n11 = n9 - n4;
                                    if (n11 < 0) break block19;
                                }
                                n9 = n11;
                                continue;
                            }
                            n8 = bl2 ? (n8 += n5) : (n8 -= n5);
                            bl = true;
                            continue;
                        }
                        if (!bl2) break block20;
                        n10 = n8 + n5;
                        if (n10 >= n7 * n5) {
                            n9 = bl ? (n9 += n4) : (n9 -= n4);
                            bl2 = false;
                            continue;
                        }
                        break block21;
                    }
                    n10 = n8 - n5;
                    if (n10 < 0) break block22;
                }
                n8 = n10;
                continue;
            }
            n9 = bl ? (n9 += n4) : (n9 -= n4);
            bl2 = true;
        }
        return b2;
    }

    private static e.b e(int n2, List<Rect> list) {
        e.b b2 = new e.b();
        b2.l(n2);
        ArrayList arrayList = new ArrayList();
        b2.j((List)arrayList);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Rect rect = (Rect)list.get(i2);
            e.a a2 = new e.a();
            a2.h(i2);
            a2.j(rect.left);
            a2.k(rect.top);
            a2.i(rect.width());
            a2.g(rect.height());
            arrayList.add((Object)a2);
        }
        return b2;
    }

    private static List<Rect> f(e.b b2) {
        ArrayList arrayList = new ArrayList();
        List list = b2.d();
        if (list != null) {
            Collections.sort((List)list, (Comparator)d.a);
            for (e.a a2 : list) {
                Rect rect = new Rect();
                rect.set(a2.e(), a2.f(), a2.e() + a2.d(), a2.f() + a2.b());
                arrayList.add((Object)rect);
            }
        }
        return arrayList;
    }

    private static void g(e.b b2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = b2.d();
        int n2 = 0;
        int n3 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            e.a a2 = (e.a)list.get(i2);
            if (!arrayList.contains((Object)a2.e())) {
                arrayList.add((Object)a2.e());
            }
            if (!arrayList2.contains((Object)a2.f())) {
                arrayList2.add((Object)a2.f());
            }
            if (a2.d() == 0 || a2.b() == 0 || n2 != 0 && n3 != 0) continue;
            n2 = a2.d();
            n3 = a2.b();
        }
        b2.i(n2);
        b2.h(n3);
        b2.k(arrayList.size());
        b2.m(arrayList2.size());
    }

    public static List<BoxMapModel> h(l l2) {
        x0.e e2;
        List list = l2 != null && (e2 = l2.g()) != null ? e2.b() : null;
        ArrayList arrayList = null;
        if (list != null) {
            if (list.isEmpty()) {
                return null;
            }
            arrayList = new ArrayList();
            for (e.b b2 : list) {
                e.g(b2);
                BoxMapModel boxMapModel = new BoxMapModel();
                boxMapModel.setPortNum(b2.f());
                boxMapModel.setColumnCount(b2.e());
                boxMapModel.setRowCount(b2.g());
                boxMapModel.setBoxWidth(b2.c());
                boxMapModel.setBoxHeight(b2.b());
                boxMapModel.setConnectionType(0);
                boxMapModel.setBoxList(e.f(b2));
                arrayList.add((Object)boxMapModel);
            }
        }
        return arrayList;
    }

    public static List<BoxMapModel> i(int n2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 <= n2; ++i2) {
            BoxMapModel boxMapModel = new BoxMapModel();
            boxMapModel.setPortNum(i2);
            boxMapModel.setBoxWidth(128);
            boxMapModel.setBoxHeight(128);
            boxMapModel.setColumnCount(2);
            boxMapModel.setRowCount(1);
            boxMapModel.setConnectionType(0);
            arrayList.add((Object)boxMapModel);
        }
        return arrayList;
    }

    private static /* synthetic */ int j(e.a a2, e.a a3) {
        return a2.c() - a3.c();
    }

    public static void k(BoxMapModel boxMapModel) {
        boxMapModel.setBoxList(e.f(e.d(boxMapModel.getPortNum(), boxMapModel.getConnectionType(), boxMapModel.getBoxWidth(), boxMapModel.getBoxHeight(), boxMapModel.getColumnCount(), boxMapModel.getRowCount())));
    }
}


/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package m5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.Locale;

public class u {
    public static String a(Context context) {
        return u.c(u.b(context));
    }

    public static String b(Context context) {
        String string2 = context.getResources().getConfiguration().locale.getLanguage();
        SharedPreferences sharedPreferences = context.getSharedPreferences("language", 0);
        String string3 = sharedPreferences.getString("country", "");
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            string2 = string3;
        }
        if (sharedPreferences.getBoolean("followSystem", false)) {
            string2 = u.f();
        }
        return string2;
    }

    private static String c(String string2) {
        string2.hashCode();
        int n5 = string2.hashCode();
        int n6 = -1;
        switch (n5) {
            default: {
                break;
            }
            case 3886: {
                if (!string2.equals((Object)"zh")) break;
                n6 = 19;
                break;
            }
            case 3763: {
                if (!string2.equals((Object)"vi")) break;
                n6 = 18;
                break;
            }
            case 3715: {
                if (!string2.equals((Object)"tw")) break;
                n6 = 17;
                break;
            }
            case 3710: {
                if (!string2.equals((Object)"tr")) break;
                n6 = 16;
                break;
            }
            case 3700: {
                if (!string2.equals((Object)"th")) break;
                n6 = 15;
                break;
            }
            case 3679: {
                if (!string2.equals((Object)"sr")) break;
                n6 = 14;
                break;
            }
            case 3651: {
                if (!string2.equals((Object)"ru")) break;
                n6 = 13;
                break;
            }
            case 3588: {
                if (!string2.equals((Object)"pt")) break;
                n6 = 12;
                break;
            }
            case 3580: {
                if (!string2.equals((Object)"pl")) break;
                n6 = 11;
                break;
            }
            case 3494: {
                if (!string2.equals((Object)"ms")) break;
                n6 = 10;
                break;
            }
            case 3428: {
                if (!string2.equals((Object)"ko")) break;
                n6 = 9;
                break;
            }
            case 3383: {
                if (!string2.equals((Object)"ja")) break;
                n6 = 8;
                break;
            }
            case 3371: {
                if (!string2.equals((Object)"it")) break;
                n6 = 7;
                break;
            }
            case 3365: {
                if (!string2.equals((Object)"in")) break;
                n6 = 6;
                break;
            }
            case 3329: {
                if (!string2.equals((Object)"hi")) break;
                n6 = 5;
                break;
            }
            case 3276: {
                if (!string2.equals((Object)"fr")) break;
                n6 = 4;
                break;
            }
            case 3259: {
                if (!string2.equals((Object)"fa")) break;
                n6 = 3;
                break;
            }
            case 3246: {
                if (!string2.equals((Object)"es")) break;
                n6 = 2;
                break;
            }
            case 3239: {
                if (!string2.equals((Object)"el")) break;
                n6 = 1;
                break;
            }
            case 3201: {
                if (!string2.equals((Object)"de")) break;
                n6 = 0;
            }
        }
        switch (n6) {
            default: {
                return "English";
            }
            case 19: {
                return "\u7b80\u4f53\u4e2d\u6587";
            }
            case 18: {
                return "Vi\u1ec7t Nam";
            }
            case 17: {
                return "\u7e41\u9ad4\u4e2d\u6587";
            }
            case 16: {
                return "T\u00fcrk";
            }
            case 15: {
                return "\u0e1b\u0e23\u0e30\u0e40\u0e17\u0e28\u0e44\u0e17\u0e22";
            }
            case 14: {
                return "\u0421\u0440\u0431\u0438\u0458\u0430";
            }
            case 13: {
                return "\u0440\u0443\u0441\u0441\u043a\u0438\u0439";
            }
            case 12: {
                return "Portugal";
            }
            case 11: {
                return "polski";
            }
            case 10: {
                return "Malaysia";
            }
            case 9: {
                return "\ud55c\uad6d\uc5b4";
            }
            case 8: {
                return "\u65e5\u672c\u8a9e";
            }
            case 7: {
                return "Italia";
            }
            case 6: {
                return "Indonesian";
            }
            case 5: {
                return "Hindi";
            }
            case 4: {
                return "France";
            }
            case 3: {
                return "\u0641\u0627\u0631\u0633\u06cc";
            }
            case 2: {
                return "espa\u00f1ol";
            }
            case 1: {
                return "\u0395\u03bb\u03bb\u03ac\u03b4\u03b1";
            }
            case 0: 
        }
        return "Deutsch";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Locale d(String var0) {
        block64 : {
            var0.hashCode();
            var2_1 = var0.hashCode();
            var3_2 = "fa";
            var4_3 = "es";
            var5_4 = -1;
            switch (var2_1) {
                case 3886: {
                    if (var0.equals((Object)"zh")) {
                        var5_4 = 19;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3763: {
                    if (var0.equals((Object)"vi")) {
                        var5_4 = 18;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3715: {
                    if (var0.equals((Object)"tw")) {
                        var5_4 = 17;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3710: {
                    if (var0.equals((Object)"tr")) {
                        var5_4 = 16;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3700: {
                    if (var0.equals((Object)"th")) {
                        var5_4 = 15;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3679: {
                    if (var0.equals((Object)"sr")) {
                        var5_4 = 14;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3651: {
                    if (var0.equals((Object)"ru")) {
                        var5_4 = 13;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3588: {
                    if (var0.equals((Object)"pt")) {
                        var5_4 = 12;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3580: {
                    if (var0.equals((Object)"pl")) {
                        var5_4 = 11;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3494: {
                    if (var0.equals((Object)"ms")) {
                        var5_4 = 10;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3428: {
                    if (var0.equals((Object)"ko")) {
                        var5_4 = 9;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3383: {
                    if (var0.equals((Object)"ja")) {
                        var5_4 = 8;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3371: {
                    if (var0.equals((Object)"it")) {
                        var5_4 = 7;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3365: {
                    if (var0.equals((Object)"in")) {
                        var5_4 = 6;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3329: {
                    if (var0.equals((Object)"hi")) {
                        var5_4 = 5;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3276: {
                    if (var0.equals((Object)"fr")) {
                        var5_4 = 4;
                        ** break;
                    }
                    ** GOTO lbl98
                }
                case 3259: {
                    var8_6 = var3_2;
                    if (var0.equals((Object)var8_6)) {
                        var5_4 = 3;
                    }
                    var3_2 = var8_6;
                    ** break;
                }
                case 3246: {
                    var7_7 = var4_3;
                    if (var0.equals((Object)var7_7)) {
                        var5_4 = 2;
                    }
                    var4_3 = var7_7;
                }
lbl98: // 35 sources:
                default: {
                    var6_5 = "el";
                    ** break;
                }
                case 3239: {
                    var6_5 = "el";
                    if (var0.equals((Object)var6_5)) {
                        var5_4 = 1;
                        ** break;
                    }
                    break block64;
                }
                case 3201: 
            }
            var6_5 = "el";
            if (var0.equals((Object)"de")) {
                var5_4 = 0;
            }
        }
        switch (var5_4) {
            default: {
                return Locale.US;
            }
            case 19: {
                return Locale.SIMPLIFIED_CHINESE;
            }
            case 18: {
                return new Locale("vi");
            }
            case 17: {
                return new Locale("tw");
            }
            case 16: {
                return new Locale("tr");
            }
            case 15: {
                return new Locale("th");
            }
            case 14: {
                return new Locale("sr");
            }
            case 13: {
                return new Locale("ru");
            }
            case 12: {
                return new Locale("pt");
            }
            case 11: {
                return new Locale("pl");
            }
            case 10: {
                return new Locale("ms");
            }
            case 9: {
                return Locale.KOREAN;
            }
            case 8: {
                return Locale.JAPAN;
            }
            case 7: {
                return new Locale("it");
            }
            case 6: {
                return new Locale("in");
            }
            case 5: {
                return new Locale("hi");
            }
            case 4: {
                return new Locale("fr");
            }
            case 3: {
                return new Locale(var3_2);
            }
            case 2: {
                return new Locale(var4_3);
            }
            case 1: {
                return new Locale(var6_5);
            }
            case 0: 
        }
        return new Locale("de");
    }

    public static String e(Context context) {
        String string2 = u.b(context);
        string2.hashCode();
        int n5 = string2.hashCode();
        int n6 = -1;
        switch (n5) {
            default: {
                break;
            }
            case 3886: {
                if (!string2.equals((Object)"zh")) break;
                n6 = 20;
                break;
            }
            case 3763: {
                if (!string2.equals((Object)"vi")) break;
                n6 = 19;
                break;
            }
            case 3715: {
                if (!string2.equals((Object)"tw")) break;
                n6 = 18;
                break;
            }
            case 3710: {
                if (!string2.equals((Object)"tr")) break;
                n6 = 17;
                break;
            }
            case 3700: {
                if (!string2.equals((Object)"th")) break;
                n6 = 16;
                break;
            }
            case 3679: {
                if (!string2.equals((Object)"sr")) break;
                n6 = 15;
                break;
            }
            case 3651: {
                if (!string2.equals((Object)"ru")) break;
                n6 = 14;
                break;
            }
            case 3588: {
                if (!string2.equals((Object)"pt")) break;
                n6 = 13;
                break;
            }
            case 3580: {
                if (!string2.equals((Object)"pl")) break;
                n6 = 12;
                break;
            }
            case 3494: {
                if (!string2.equals((Object)"ms")) break;
                n6 = 11;
                break;
            }
            case 3428: {
                if (!string2.equals((Object)"ko")) break;
                n6 = 10;
                break;
            }
            case 3383: {
                if (!string2.equals((Object)"ja")) break;
                n6 = 9;
                break;
            }
            case 3371: {
                if (!string2.equals((Object)"it")) break;
                n6 = 8;
                break;
            }
            case 3365: {
                if (!string2.equals((Object)"in")) break;
                n6 = 7;
                break;
            }
            case 3329: {
                if (!string2.equals((Object)"hi")) break;
                n6 = 6;
                break;
            }
            case 3276: {
                if (!string2.equals((Object)"fr")) break;
                n6 = 5;
                break;
            }
            case 3259: {
                if (!string2.equals((Object)"fa")) break;
                n6 = 4;
                break;
            }
            case 3246: {
                if (!string2.equals((Object)"es")) break;
                n6 = 3;
                break;
            }
            case 3241: {
                if (!string2.equals((Object)"en")) break;
                n6 = 2;
                break;
            }
            case 3239: {
                if (!string2.equals((Object)"el")) break;
                n6 = 1;
                break;
            }
            case 3201: {
                if (!string2.equals((Object)"de")) break;
                n6 = 0;
            }
        }
        String string3 = "en-US";
        switch (n6) {
            default: {
                return string3;
            }
            case 20: {
                return "zh-CN";
            }
            case 19: {
                return "vi-VN";
            }
            case 18: {
                return "zh-TW";
            }
            case 17: {
                return "tr-TR";
            }
            case 16: {
                return "th-TH";
            }
            case 15: {
                return "sr-SP";
            }
            case 14: {
                return "ru-RU";
            }
            case 13: {
                return "pt-PT";
            }
            case 12: {
                return "pl-PL";
            }
            case 11: {
                return "ms-MY";
            }
            case 10: {
                return "ko-KR";
            }
            case 9: {
                return "ja-JP";
            }
            case 8: {
                return "it-IT";
            }
            case 7: {
                return "in-IN";
            }
            case 6: {
                return "hi-IN";
            }
            case 5: {
                return "fr-FR";
            }
            case 4: {
                return "fa-IR";
            }
            case 3: {
                return "es-ES";
            }
            case 1: {
                return "el-GR";
            }
            case 0: {
                string3 = "de-DE";
            }
            case 2: 
        }
        return string3;
    }

    public static String f() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        Locale locale = Build.VERSION.SDK_INT < 24 ? configuration.locale : configuration.getLocales().get(0);
        String string2 = locale.getLanguage();
        String string3 = locale.getCountry();
        if (string2.equals((Object)"zh")) {
            if (!string3.equals((Object)"TW") && !string3.equals((Object)"HK")) {
                return "zh";
            }
            return "tw";
        }
        return string2;
    }

    public static void g(Context context) {
        try {
            u.l(context, u.d(u.b(context)));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public static boolean h(Context context) {
        return "zh".equals((Object)u.b(context));
    }

    public static boolean i(Context context) {
        return "zh".equals((Object)u.b(context)) || "tw".equals((Object)u.b(context));
        {
        }
    }

    public static void j(Context context, boolean bl) {
        context.getSharedPreferences("language", 0).edit().putBoolean("followSystem", bl).apply();
    }

    public static void k(Context context, String string2) {
        context.getSharedPreferences("language", 0).edit().putString("country", string2).apply();
        u.l(context, u.d(string2));
    }

    private static void l(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        int n5 = Build.VERSION.SDK_INT;
        if (n5 >= 24) {
            configuration.setLocale(locale);
            configuration.setLocales(new LocaleList(new Locale[]{locale}));
        } else {
            configuration.locale = locale;
            if (n5 >= 17) {
                configuration.setLayoutDirection(locale);
            }
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}


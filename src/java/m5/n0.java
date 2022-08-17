/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.UUID
 *  javax.xml.parsers.DocumentBuilder
 *  javax.xml.parsers.DocumentBuilderFactory
 *  javax.xml.parsers.ParserConfigurationException
 *  javax.xml.transform.Result
 *  javax.xml.transform.Source
 *  javax.xml.transform.Transformer
 *  javax.xml.transform.TransformerConfigurationException
 *  javax.xml.transform.TransformerException
 *  javax.xml.transform.TransformerFactory
 *  javax.xml.transform.dom.DOMSource
 *  javax.xml.transform.stream.StreamResult
 *  org.w3c.dom.DOMException
 *  org.w3c.dom.Document
 *  org.w3c.dom.Element
 *  org.w3c.dom.Node
 */
package m5;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.UUID;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

@Deprecated
public class n0 {
    private static void a(Document document, Writer writer, String string2) {
        try {
            DOMSource dOMSource = new DOMSource((Node)document);
            StreamResult streamResult = new StreamResult(writer);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("encoding", string2);
            transformer.transform((Source)dOMSource, (Result)streamResult);
            return;
        }
        catch (TransformerException transformerException) {
            transformerException.printStackTrace();
            return;
        }
        catch (TransformerConfigurationException transformerConfigurationException) {
            transformerConfigurationException.printStackTrace();
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static String b(String var0, a var1_1) {
        block20 : {
            block22 : {
                block21 : {
                    block19 : {
                        var2_2 = var0.replace((CharSequence)"+", (CharSequence)"Plus");
                        var3_3 = "";
                        var4_4 = var2_2.replace((CharSequence)"-", (CharSequence)var3_3).toLowerCase();
                        var5_5 = var4_4.length();
                        if (var5_5 < 32) break block19;
                        var39_7 = var4_4.substring(0, 8);
                        var16_8 = var4_4.substring(8, 12);
                        var41_9 = var4_4.substring(12, 16);
                        var42_10 = var4_4.substring(16, 20);
                        var118_11 = new StringBuilder();
                        var118_11.append(var4_4.substring(20, 31));
                        var118_11.append(String.valueOf((int)var1_1.ordinal()));
                        var40_12 = var118_11.toString();
                        break block20;
                    }
                    if (var5_5 < 20) break block21;
                    var39_7 = var4_4.substring(0, 8);
                    var109_13 = var4_4.substring(8, 12);
                    var110_14 = var4_4.substring(12, 16);
                    var42_10 = var4_4.substring(16, 20);
                    var111_15 = var4_4.substring(20, var5_5);
                    for (var6_6 = 0; var6_6 < -1 + (32 - var5_5); ++var6_6) {
                        var112_16 = new StringBuilder();
                        var112_16.append(var111_15);
                        var112_16.append("0");
                        var111_15 = var112_16.toString();
                    }
                    var115_17 = new StringBuilder();
                    var115_17.append(var111_15);
                    var115_17.append(String.valueOf((int)var1_1.ordinal()));
                    var40_12 = var115_17.toString();
                    var41_9 = var110_14;
                    var16_8 = var109_13;
                    break block20;
                }
                if (var5_5 < 16) break block22;
                var77_18 = var4_4.substring(0, 8);
                var78_19 = var4_4.substring(8, 12);
                var96_20 = var4_4.substring(12, 16);
                var42_10 = var4_4.substring(16, var5_5);
                var97_21 = 0;
                do {
                    var98_22 = 20 - var5_5;
                    if (var97_21 >= var98_22) break;
                    var100_24 = new StringBuilder();
                    var100_24.append(var42_10);
                    var100_24.append("0");
                    var42_10 = var100_24.toString();
                    ++var97_21;
                } while (true);
                for (var99_23 = 0; var99_23 < 11; ++var99_23) {
                    var103_25 = new StringBuilder();
                    var103_25.append(var3_3);
                    var103_25.append("0");
                    var3_3 = var103_25.toString();
                }
                var106_26 = new StringBuilder();
                var106_26.append(var3_3);
                var106_26.append(String.valueOf((int)var1_1.ordinal()));
                var40_12 = var106_26.toString();
                var41_9 = var96_20;
                ** GOTO lbl96
            }
            if (var5_5 >= 12) {
                var77_18 = var4_4.substring(0, 8);
                var78_19 = var4_4.substring(8, 12);
                var79_27 = var4_4.substring(12, var5_5);
                for (var80_28 = 0; var80_28 < 16 - var5_5; ++var80_28) {
                    var81_29 = new StringBuilder();
                    var81_29.append(var79_27);
                    var81_29.append("0");
                    var79_27 = var81_29.toString();
                }
                var42_10 = var3_3;
                var84_30 = 0;
                do {
                    if (var84_30 >= 4) break;
                    var86_32 = new StringBuilder();
                    var86_32.append(var42_10);
                    var86_32.append("0");
                    var42_10 = var86_32.toString();
                    ++var84_30;
                } while (true);
                for (var85_31 = 0; var85_31 < 11; ++var85_31) {
                    var89_33 = new StringBuilder();
                    var89_33.append(var3_3);
                    var89_33.append("0");
                    var3_3 = var89_33.toString();
                }
                var92_34 = new StringBuilder();
                var92_34.append(var3_3);
                var92_34.append(String.valueOf((int)var1_1.ordinal()));
                var95_35 = var92_34.toString();
                var41_9 = var79_27;
                var40_12 = var95_35;
lbl96: // 2 sources:
                var16_8 = var78_19;
                var39_7 = var77_18;
            } else if (var5_5 >= 8) {
                var53_36 = var4_4.substring(0, 8);
                var54_37 = var4_4.substring(8, var5_5);
                for (var55_38 = 0; var55_38 < 12 - var5_5; ++var55_38) {
                    var56_39 = new StringBuilder();
                    var56_39.append(var54_37);
                    var56_39.append("0");
                    var54_37 = var56_39.toString();
                }
                var59_40 = var3_3;
                for (var60_41 = 0; var60_41 < 4; ++var60_41) {
                    var61_42 = new StringBuilder();
                    var61_42.append(var59_40);
                    var61_42.append("0");
                    var59_40 = var61_42.toString();
                }
                var64_43 = var3_3;
                var65_44 = 0;
                do {
                    if (var65_44 >= 4) break;
                    var67_46 = new StringBuilder();
                    var67_46.append(var64_43);
                    var67_46.append("0");
                    var64_43 = var67_46.toString();
                    ++var65_44;
                } while (true);
                for (var66_45 = 0; var66_45 < 11; ++var66_45) {
                    var70_47 = new StringBuilder();
                    var70_47.append(var3_3);
                    var70_47.append("0");
                    var3_3 = var70_47.toString();
                }
                var73_48 = new StringBuilder();
                var73_48.append(var3_3);
                var73_48.append(String.valueOf((int)var1_1.ordinal()));
                var76_49 = var73_48.toString();
                var41_9 = var59_40;
                var39_7 = var53_36;
                var42_10 = var64_43;
                var16_8 = var54_37;
                var40_12 = var76_49;
            } else {
                var7_50 = var4_4.substring(0, var5_5);
                for (var8_51 = 0; var8_51 < 8 - var5_5; ++var8_51) {
                    var9_52 = new StringBuilder();
                    var9_52.append(var7_50);
                    var9_52.append("0");
                    var7_50 = var9_52.toString();
                }
                var12_53 = new StringBuilder();
                var12_53.append(var7_50);
                var12_53.append("-");
                var15_54 = var12_53.toString();
                var16_8 = var3_3;
                for (var17_55 = 0; var17_55 < 4; ++var17_55) {
                    var18_56 = new StringBuilder();
                    var18_56.append(var16_8);
                    var18_56.append("0");
                    var16_8 = var18_56.toString();
                }
                var21_57 = var3_3;
                for (var22_58 = 0; var22_58 < 4; ++var22_58) {
                    var23_59 = new StringBuilder();
                    var23_59.append(var21_57);
                    var23_59.append("0");
                    var21_57 = var23_59.toString();
                }
                var26_60 = var3_3;
                var27_61 = 0;
                do {
                    if (var27_61 >= 4) break;
                    var29_63 = new StringBuilder();
                    var29_63.append(var26_60);
                    var29_63.append("0");
                    var26_60 = var29_63.toString();
                    ++var27_61;
                } while (true);
                for (var28_62 = 0; var28_62 < 11; ++var28_62) {
                    var32_64 = new StringBuilder();
                    var32_64.append(var3_3);
                    var32_64.append("0");
                    var3_3 = var32_64.toString();
                }
                var35_65 = new StringBuilder();
                var35_65.append(var3_3);
                var35_65.append(String.valueOf((int)var1_1.ordinal()));
                var38_66 = var35_65.toString();
                var39_7 = var15_54;
                var40_12 = var38_66;
                var41_9 = var21_57;
                var42_10 = var26_60;
            }
        }
        var43_67 = new StringBuilder();
        var43_67.append(var39_7);
        var43_67.append("-");
        var43_67.append(var16_8);
        var43_67.append("-");
        var43_67.append(var41_9);
        var43_67.append("-");
        var43_67.append(var42_10);
        var43_67.append("-");
        var43_67.append(var40_12);
        return var43_67.toString();
    }

    public static void c(String string2, int n5, String string3, int n6, int n7, String string4) {
        Document document;
        File file;
        block9 : {
            file = new File(string2);
            if (file.exists()) {
                file.delete();
            }
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element element = document.createElement("config.boo");
            element.setAttribute("version", "1.0");
            document.appendChild((Node)element);
            Element element2 = document.createElement("content");
            element.appendChild((Node)element2);
            Element element3 = document.createElement("channel");
            String string5 = 1 == n5 ? "add" : "remove";
            element3.setAttribute("action", string5);
            String string6 = n0.b(string3, a.b);
            element3.setAttribute("guid", string6);
            element3.setAttribute("name", "rtspDemo");
            element2.appendChild((Node)element3);
            if (1 != n5) break block9;
            Element element4 = document.createElement("background");
            element4.setAttribute("alpha", "255");
            element3.appendChild((Node)element4);
            Element element5 = document.createElement("color");
            element5.setTextContent("#000000");
            element4.appendChild((Node)element5);
            Element element6 = document.createElement("area");
            element6.setAttribute("action", "add");
            element6.setAttribute("index", "0");
            element6.setAttribute("name", "Area1");
            element3.appendChild((Node)element6);
            Element element7 = document.createElement("rectangle");
            element7.setAttribute("width", String.valueOf((int)n6));
            element7.setAttribute("x", "0");
            element7.setAttribute("y", "0");
            element7.setAttribute("height", String.valueOf((int)n7));
            element6.appendChild((Node)element7);
            Element element8 = document.createElement("render");
            element8.setAttribute("alpha", "255");
            element6.appendChild((Node)element8);
            Element element9 = document.createElement("materials");
            element6.appendChild((Node)element9);
            Element element10 = document.createElement("video");
            element10.setAttribute("action", "add");
            element10.setAttribute("name", "Test Video");
            element9.appendChild((Node)element10);
            Element element11 = document.createElement("playParams");
            element11.setAttribute("playTimes", "1");
            element10.appendChild((Node)element11);
            Element element12 = document.createElement("file");
            element12.setAttribute("size", "10240000");
            element12.setAttribute("path", string4);
            element12.setAttribute("md5", UUID.randomUUID().toString());
            element10.appendChild((Node)element12);
            Element element13 = document.createElement("auto");
            element13.setAttribute("action", "preview");
            element13.setAttribute("guid", string6);
            element2.appendChild((Node)element13);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream);
            n0.a(document, (Writer)outputStreamWriter, "utf-8");
            outputStreamWriter.close();
            fileOutputStream.close();
            return;
        }
        catch (Exception exception) {
            try {
                exception.printStackTrace();
                return;
            }
            catch (DOMException dOMException) {
                Log.d((String)"Error", (String)dOMException.getMessage());
                return;
            }
            catch (ParserConfigurationException parserConfigurationException) {
                Log.d((String)"Error", (String)parserConfigurationException.getMessage());
                return;
            }
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a;
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        public static final /* enum */ a d;
        private static final /* synthetic */ a[] e;

        static {
            a a3;
            a a4;
            a a5;
            a a6;
            a = a3 = new a();
            b = a4 = new a();
            c = a6 = new a();
            d = a5 = new a();
            e = new a[]{a3, a4, a6, a5};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])e.clone();
        }
    }

}


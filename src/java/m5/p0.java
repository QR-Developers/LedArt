/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  javax.xml.parsers.DocumentBuilder
 *  javax.xml.parsers.DocumentBuilderFactory
 *  javax.xml.parsers.ParserConfigurationException
 *  javax.xml.transform.Result
 *  javax.xml.transform.Source
 *  javax.xml.transform.Transformer
 *  javax.xml.transform.TransformerFactory
 *  javax.xml.transform.dom.DOMSource
 *  javax.xml.transform.stream.StreamResult
 *  org.w3c.dom.Document
 *  org.w3c.dom.Element
 *  org.w3c.dom.Node
 *  org.w3c.dom.NodeList
 */
package m5;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class p0 {
    public static Document a() {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            return document;
        }
        catch (ParserConfigurationException parserConfigurationException) {
            parserConfigurationException.printStackTrace();
            return null;
        }
    }

    public static boolean b(Element element, String string2) {
        if (element != null && element.hasAttribute(string2)) {
            try {
                boolean bl = Boolean.parseBoolean((String)element.getAttribute(string2));
                return bl;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return false;
    }

    public static Element c(Element element, String string2) {
        if (element != null && string2 != null) {
            NodeList nodeList = element.getElementsByTagName(string2);
            if (nodeList != null && nodeList.getLength() != 0) {
                return (Element)nodeList.item(0);
            }
            Log.d((String)"XmlDomHelper", (String)"getElementByTag::tag not found!");
            return null;
        }
        Log.w((String)"XmlDomHelper", (String)"getElementByTag::params is null!");
        return null;
    }

    public static Element[] d(Element element, String string2) {
        if (element != null && string2 != null) {
            NodeList nodeList = element.getElementsByTagName(string2);
            if (nodeList != null && nodeList.getLength() != 0) {
                Element[] arrelement = new Element[nodeList.getLength()];
                for (int i5 = 0; i5 < nodeList.getLength(); ++i5) {
                    arrelement[i5] = (Element)nodeList.item(i5);
                }
                return arrelement;
            }
            Log.d((String)"XmlDomHelper", (String)"getElementByTag::tag not found!");
            return null;
        }
        Log.w((String)"XmlDomHelper", (String)"getElementByTag::params is null!");
        return null;
    }

    public static int e(Element element, String string2) {
        if (element != null && element.hasAttribute(string2)) {
            try {
                int n5 = Integer.parseInt((String)element.getAttribute(string2));
                return n5;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return 0;
    }

    public static String f(Element element, String string2) {
        if (element != null && element.hasAttribute(string2)) {
            return element.getAttribute(string2);
        }
        return "";
    }

    public static Document g(String string2) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((InputStream)new ByteArrayInputStream(string2.getBytes()));
            return document;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static String h(Document document) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("encoding", "UTF-8");
            transformer.setOutputProperty("method", "xml");
            transformer.setOutputProperty("indent", "yes");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            transformer.transform((Source)new DOMSource((Node)document), (Result)new StreamResult((OutputStream)byteArrayOutputStream));
            String string2 = byteArrayOutputStream.toString();
            return string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }
}


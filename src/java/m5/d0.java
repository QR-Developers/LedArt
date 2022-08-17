/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.security.Key
 *  java.security.KeyFactory
 *  java.security.NoSuchAlgorithmException
 *  java.security.PublicKey
 *  java.security.interfaces.RSAPublicKey
 *  java.security.spec.InvalidKeySpecException
 *  java.security.spec.KeySpec
 *  java.security.spec.X509EncodedKeySpec
 *  javax.crypto.Cipher
 */
package m5;

import android.util.Base64;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class d0 {
    public static byte[] a(byte[] arrby, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance((String)"RSA/None/PKCS1Padding");
            cipher.init(1, (Key)publicKey);
            byte[] arrby2 = cipher.doFinal(arrby);
            return arrby2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static String b(String string, String string2) {
        try {
            RSAPublicKey rSAPublicKey = d0.c(string2);
            String string3 = Base64.encodeToString((byte[])d0.a(string.getBytes(), (PublicKey)rSAPublicKey), (int)2);
            return string3;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return string;
        }
    }

    public static RSAPublicKey c(String string) {
        try {
            byte[] arrby = Base64.decode((String)string, (int)2);
            RSAPublicKey rSAPublicKey = (RSAPublicKey)KeyFactory.getInstance((String)"RSA").generatePublic((KeySpec)new X509EncodedKeySpec(arrby));
            return rSAPublicKey;
        }
        catch (NullPointerException nullPointerException) {
            throw new Exception("\u516c\u94a5\u6570\u636e\u4e3a\u7a7a");
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new Exception("\u516c\u94a5\u975e\u6cd5");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Exception("\u65e0\u6b64\u7b97\u6cd5");
        }
    }
}


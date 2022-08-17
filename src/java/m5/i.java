/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.Key
 *  java.security.SecureRandom
 *  java.security.spec.KeySpec
 *  javax.crypto.Cipher
 *  javax.crypto.SecretKey
 *  javax.crypto.SecretKeyFactory
 *  javax.crypto.spec.DESKeySpec
 */
package m5;

import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class i {
    private static String a(byte[] arrby) {
        String string2 = "";
        for (int i5 = 0; i5 < arrby.length; ++i5) {
            String string3 = Integer.toHexString((int)(255 & arrby[i5]));
            if (string3.length() == 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("0");
                stringBuilder.append(string3);
                string2 = stringBuilder.toString();
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            string2 = stringBuilder.toString();
        }
        return string2.toUpperCase();
    }

    private static byte[] b(byte[] arrby, byte[] arrby2, boolean bl) {
        SecureRandom secureRandom = new SecureRandom();
        DESKeySpec dESKeySpec = new DESKeySpec(arrby2);
        SecretKey secretKey = SecretKeyFactory.getInstance((String)"DES").generateSecret((KeySpec)dESKeySpec);
        Cipher cipher = Cipher.getInstance((String)"DES");
        if (bl) {
            cipher.init(1, (Key)secretKey, secureRandom);
        } else {
            cipher.init(2, (Key)secretKey, secureRandom);
        }
        return cipher.doFinal(arrby);
    }

    public static String c(String string2, String string3) {
        try {
            String string4 = new String(i.d(i.g(string2.getBytes()), string3.getBytes()));
            return string4;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    private static byte[] d(byte[] arrby, byte[] arrby2) {
        return i.b(arrby, arrby2, false);
    }

    public static String e(String string2, String string3) {
        byte[] arrby;
        try {
            arrby = i.f(string2.getBytes(), string3.getBytes());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            arrby = null;
        }
        if (arrby != null) {
            return i.a(arrby);
        }
        return "";
    }

    private static byte[] f(byte[] arrby, byte[] arrby2) {
        return i.b(arrby, arrby2, true);
    }

    private static byte[] g(byte[] arrby) {
        IllegalArgumentException illegalArgumentException;
        if (arrby.length % 2 == 0) {
            byte[] arrby2 = new byte[arrby.length / 2];
            for (int i5 = 0; i5 < arrby.length; i5 += 2) {
                String string2 = new String(arrby, i5, 2);
                arrby2[i5 / 2] = (byte)Integer.parseInt((String)string2, (int)16);
            }
            return arrby2;
        }
        illegalArgumentException = new IllegalArgumentException("length not even");
        throw illegalArgumentException;
    }
}


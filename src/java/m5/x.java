/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
package m5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class x {
    private static String a(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder();
        int n5 = arrby.length;
        for (int i5 = 0; i5 < n5; ++i5) {
            String string2 = Integer.toHexString((int)(255 & arrby[i5]));
            if (string2.length() == 1) {
                stringBuilder.append("0");
            }
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String b(File file) {
        FileInputStream fileInputStream;
        void var3_11;
        block16 : {
            FileInputStream fileInputStream2;
            void var1_8;
            block15 : {
                int n5;
                if (file == null) return null;
                if (!file.isFile()) return null;
                if (!file.exists()) {
                    return null;
                }
                byte[] arrby = new byte[1024];
                MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
                fileInputStream2 = new FileInputStream(file);
                while ((n5 = fileInputStream2.read(arrby, 0, 1024)) != -1) {
                    messageDigest.update(arrby, 0, n5);
                }
                try {
                    fileInputStream2.close();
                    return x.a(messageDigest.digest());
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
                return x.a(messageDigest.digest());
                catch (Exception exception) {
                    break block15;
                }
                catch (Throwable throwable) {
                    fileInputStream = null;
                    break block16;
                }
                catch (Exception exception) {
                    fileInputStream2 = null;
                }
            }
            var1_8.printStackTrace();
            if (fileInputStream2 == null) return null;
            try {
                fileInputStream2.close();
                return null;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return null;
            catch (Throwable throwable) {
                fileInputStream = fileInputStream2;
            }
        }
        if (fileInputStream == null) throw var3_11;
        try {
            fileInputStream.close();
            throw var3_11;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        throw var3_11;
    }

    public static String c(byte[] arrby) {
        if (arrby != null) {
            if (arrby.length == 0) {
                return null;
            }
            try {
                String string2 = x.a(MessageDigest.getInstance((String)"MD5").digest(arrby));
                return string2;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                noSuchAlgorithmException.printStackTrace();
            }
        }
        return null;
    }
}


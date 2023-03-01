package cardService;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class DES {
    private final SecretKey key;
    private Cipher encCipher;
    private Cipher decCipher;

    public DES(SecretKey key) throws Exception {
        this.key = key;
        initCipher();
    }
    private void initCipher() throws Exception {
        encCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        decCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        encCipher.init(Cipher.ENCRYPT_MODE, key);
        decCipher.init(Cipher.DECRYPT_MODE, key);
    }

    public byte[] encrypt(String message) throws Exception {
        return encCipher.doFinal(message.getBytes());
    }

    public String decrypt(byte[] message) throws Exception {
        return new String(decCipher.doFinal(message));
    }

    public static SecretKey generateKey() throws Exception {
        return KeyGenerator.getInstance("DES").generateKey();
    }

    public static String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    public static byte[] decoder(String data) {
        return Base64.getDecoder().decode(data);
    }
}

package cardService;

import javax.crypto.SecretKey;

import java.math.BigDecimal;

import static cardService.DES.decoder;
import static cardService.DES.encode;

public class MainDES {
    public static void main(String[] args) throws Exception {
        SecretKey key = DES.generateKey();
        BankAccountDTO bankAccountDTO = new BankAccountDTO(1, new BigDecimal(1000),
                "123456789", "7777", "123", "11/25");
        BankAccountDTOString bankAccountDTOString = new BankAccountDTOString();

        String bankString = bankAccountDTO.toString();
//        String message = " \"id\": 1,\n" +
//                "          \"balance\": 100,\n" +
//                "          \"cardNumber\":\"4731172447241584\",\n" +
//                "          \"pin\": \"3452\",\n" +
//                "          \"cvv\": \"288\",\n" +
//                "          \"endDate\": \"10/25\"";

        String message ="09/25";
//
//        new BankAccountEncryptedDTO("TUl4ubq312E=", "gUxeFnIIP5A=", "Aa06AHCMk6vOj0xxgfMx2dBYp3rtekXg", "KzTfPSnblno=",
//                "CFfS9+cKF8A=", "7iPzlCa0eCI=");
        DES des = new DES(key);
        String encryptedMessage = encode(des.encrypt(message));
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + des.decrypt(decoder(encryptedMessage)));

        String encryptedMessage2 = encode(des.encrypt(bankString));
        System.out.println("Encrypted message: " + encryptedMessage2);
        System.out.println("Decrypted message: " + des.decrypt(decoder(encryptedMessage2)));
    }

//    public static String encode(byte[] data) {
//        return Base64.getEncoder().encodeToString(data);
//    }
//
//    public static byte[] decoder(String data) {
//        return Base64.getDecoder().decode(data);
//    }
}

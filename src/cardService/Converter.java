package cardService;
import java.util.Base64;

public class Converter {
    public static void main(String[] args) {
        Converter converter = new Converter();
        String str1 = converter.base64Encoder("7777");
        System.out.println("Encoded data:" + str1);
        String str2 = converter.base64Decoder(str1);
        System.out.println("Decoded data: "+ str2);
    }

    public String base64Encoder(String data) {
        String str = Base64.getEncoder().encodeToString(data.getBytes());
        return str;
    }

    public String base64Decoder(String data) {
        byte[] byteArr = Base64.getDecoder().decode(data);
        String str = new String(byteArr);
        return str;
    }
}
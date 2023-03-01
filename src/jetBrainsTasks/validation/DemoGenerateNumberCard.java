package jetBrainsTasks.validation;

import java.util.Random;

public class DemoGenerateNumberCard {
    private static final String BANK_BIN = "473117";
    private static final int CARD_NUMBER_LENGTH = 16;
    private static final int PIN_CODE_LENGTH = 4;
    private static final int CVV_LENGTH = 3;
    private static final int DIGIT_UPPER_LIMIT = 10;
    private static final Random RNG = new Random(System.currentTimeMillis());
    public static void main(String[] args) {
        System.out.println(generate("",4));

    }

    private static String generate(String bin, int length) {

        int randomNumberLength = length - (bin.length() + 1);

        StringBuilder builder = new StringBuilder(bin);
        for (int i = 0; i < randomNumberLength; i++) {
            int digit = RNG.nextInt(DIGIT_UPPER_LIMIT);
            builder.append(digit);
        }
        int checkDigit = getCheckDigit(builder.toString());
        builder.append(checkDigit);

        return builder.toString();
    }

    private  static int getCheckDigit(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(number.substring(i, (i + 1)));

            if ((i % 2) == 0) {
                digit = digit * 2;
                if (digit > 9) {
                    digit = (digit / DIGIT_UPPER_LIMIT) + (digit % DIGIT_UPPER_LIMIT);
                }
            }
            sum += digit;
        }
        int mod = sum % DIGIT_UPPER_LIMIT;
        return ((mod == 0) ? 0 : DIGIT_UPPER_LIMIT - mod);
    }
}
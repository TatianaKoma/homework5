package jetBrainsTasks;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Random;

public class CreditCardNumberGenerator {
    public static void main(String[] args) {
        CreditCardNumberGenerator cr = new CreditCardNumberGenerator();
        System.out.println(cr.generate("2720",16));
//        OffsetDateTime date = OffsetDateTime.parse(DateTimeFormatter.ofPattern("MM/yy").format(OffsetDateTime.now().plusYears(3)));
//        System.out.println(date);
//      String date =LocalDate.now().format(DateTimeFormatter.ofPattern("MM/yy"));
        String date= DateTimeFormatter.ofPattern("MM/yy").format(OffsetDateTime.now().plusYears(3));
        System.out.println(date);
    }

    private final Random random = new Random(System.currentTimeMillis());

    public String generate(String bin, int length) {

        int randomNumberLength = length - (bin.length() + 1);

        StringBuilder builder = new StringBuilder(bin);
        for (int i = 0; i < randomNumberLength; i++) {
            int digit = this.random.nextInt(10);
            builder.append(digit);
        }
        int checkDigit = this.getCheckDigit(builder.toString());
        builder.append(checkDigit);

        return builder.toString();
    }

    private int getCheckDigit(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(number.substring(i, (i + 1)));

            if ((i % 2) == 0) {
                digit = digit * 2;
                if (digit > 9) {
                    digit = (digit / 10) + (digit % 10);
                }
            }
            sum += digit;
        }
        int mod = sum % 10;
        return ((mod == 0) ? 0 : 10 - mod);
    }
}

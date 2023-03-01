package jetBrainsTasks.validation;

public class Main {
    public static void main(String[] args) {
        final String masterCard = "4731174753057007";
        CardNumberValidator validator = CardNumberValidator.createValidatorsChain(new StringNumberValidator(), new LuhnNumberValidator());
        System.out.println(validator.validateCard(masterCard));
        System.out.println(isValidCardNumber(masterCard));

    }
    private static boolean isValidCardNumber(String number) {
        if (number == null
                || number.trim().length() !=16
                || !number.matches("\\d+")) {
            return false;
        }
        int sum = Character.getNumericValue(number.charAt(number.length() - 1));
        int parity = number.length() % 2;
        for (int i = number.length() - 2; i >= 0; i--) {
            int summand = Character.getNumericValue(number.charAt(i));
            if (i % 2 == parity) {
                int product = summand * 2;
                summand = (product > 9) ? (product - 9) : product;
            }
            sum += summand;
        }
        return (sum % 10) == 0;
    }
}

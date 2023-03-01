package exceptions.ownException;

import java.util.Scanner;

public class OwnException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        try {
            int number = scanner.nextInt();
            validate(number);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validate(int number) throws InvalidNumberException {
        if (number < 1 || number > 10) {
            throw new InvalidNumberException();
        }
    }
}

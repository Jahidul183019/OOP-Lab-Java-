import java.util.Scanner;

class NotIntegerException extends Exception {
    public NotIntegerException(String message) {
        super(message);
    }
}

public class Five {
    private Scanner sc = new Scanner(System.in);

    public int readInteger() throws NotIntegerException {
        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        if (input.contains(".")) {
            throw new NotIntegerException("Floating‑point number entered: " + input);
        }

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NotIntegerException("Invalid integer input: " + input);
        }
    }

    public static void main(String[] args) {
        Five reader = new Five();
        try {
            int value = reader.readInteger();
            System.out.println("You entered integer: " + value);
        } catch (NotIntegerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

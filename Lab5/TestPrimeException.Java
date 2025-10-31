import java.util.Scanner;

class NotPrimeException extends Exception {
    private int value;

    public NotPrimeException(int value) {
        super("Not a prime: " + value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class TestPrimeException {

    public boolean testPrime(int a) throws NotPrimeException {
        if (a < 2) {
            throw new NotPrimeException(a);
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                throw new NotPrimeException(a);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TestPrimeException tester = new TestPrimeException();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try {
            if (tester.testPrime(a)) {
                System.out.println(a + " is prime.");
            }
        } catch (NotPrimeException e) {
            System.out.println("Caught exception: " + e.getMessage() + " (value = " + e.getValue() + ")");
        }
    }
}
import java.util.Scanner;

class Three {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x, n = sc.nextInt();
            int a[] = new int[n];
            a[5] = 99;
            x = n / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("THE END");
        }
    }
}

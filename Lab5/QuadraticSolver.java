import java.util.Scanner;

public class QuadraticSolver {
    static double root(double A, double B, double C) throws IllegalArgumentException {
        if (A == 0) {
            throw new IllegalArgumentException("A can't be zero.");
        }
        double disc = B * B - 4 * A * C;
        if (disc < 0) {
            throw new IllegalArgumentException("Discriminant < zero.");
        }
        return (-B + Math.sqrt(disc)) / (2 * A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;

        while (again) {
            System.out.print("Enter A: ");
            double A = sc.nextDouble();
            System.out.print("Enter B: ");
            double B = sc.nextDouble();
            System.out.print("Enter C: ");
            double C = sc.nextDouble();

            try {
                double solver = root(A, B, C);
                System.out.println("The solution is: " + solver);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Do you want to solve another equation? (yes/no): ");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                again = false;
            }
        }
    }
}

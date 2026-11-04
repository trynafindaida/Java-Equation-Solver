
import java.util.Scanner;

class EquationSolver {

    // Solve linear equation: ax + b = 0
    public void solveLinear(double a, double b) {

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("Answer: x = " + x);
        }
    }

    // Solve quadratic equation: ax^2 + bx + c = 0
    public void solveQuadratic(double a, double b, double c) {

        if (a == 0) {
            System.out.println("This is a linear equation.");
            solveLinear(b, c);
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Two real roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("One real root: x = " + x);

        } else {
            System.out.println("No real roots.");
        }
    }
}

public class EquationSolverDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EquationSolver solver = new EquationSolver();

        System.out.println("Equation Solver");
        System.out.println("1. Linear Equation");
        System.out.println("2. Quadratic Equation");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();

        if (choice == 1) {

            System.out.print("Enter a: ");
            double a = input.nextDouble();

            System.out.print("Enter b: ");
            double b = input.nextDouble();

            solver.solveLinear(a, b);

        } else if (choice == 2) {

            System.out.print("Enter a: ");
            double a = input.nextDouble();

            System.out.print("Enter b: ");
            double b = input.nextDouble();

            System.out.print("Enter c: ");
            double c = input.nextDouble();

            solver.solveQuadratic(a, b, c);

        } else {
            System.out.println("Invalid option!");
        }

        input.close();
    }
}

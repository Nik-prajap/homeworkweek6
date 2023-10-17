package HomeWorkWeek6;

import java.util.Scanner;

/**
 * a program executed for a calculator with addition, subtraction,
 * multiplication and division
 * methods all with parameters and use string concatenation methods
 */

public class Programme05 {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the method (+. -, *, /): ");
        String operation = scanner.next();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        Programme05 cal = new Programme05();
        double result = 0.0;
        if (operation.equals("+")) {
            result = add(num1, num2);
        } else if (operation.equals("-")) {
            result = subtract(num1, num2);
        } else if (operation.equals("*")) {
            result = cal.multiply(num1, num2);
        } else if (operation.equals("/")) {
            result = cal.division(num1, num2);
        } else {
            System.out.println("invalid operation.");
        }
        System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);

        scanner.close();
    }
}



package HomeWorkWeek6;

import java.util.Scanner;

/**
 * Take 3 numbers as input
 * to calculate and
 * print the average of the numbers
 */

public class Programme13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the 2nd number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the 3rd number: ");
        double c = scanner.nextDouble();

        double avg = (a + b + c) / 3;

        System.out.print("\" The Average of all the three number is:  " + avg + " \"");
        scanner.close();
    }
}

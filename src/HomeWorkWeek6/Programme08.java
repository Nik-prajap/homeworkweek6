package HomeWorkWeek6;

import java.util.Scanner;

// Calculate the area of triangle

public class Programme08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the Triangle: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the Height of the Triangle: ");
        double b = scanner.nextDouble();

        double area = 0.5 * a * b;
        System.out.println("The area of the Triangle is :" + area);

        scanner.close();
    }
}

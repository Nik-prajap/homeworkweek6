package HomeWorkWeek6;

import java.util.Scanner;

/**
 * Enter any radius value of the circle
 * and
 * find out the area
 * (Formula - Area A = PI * r * r)
 */
public class Programme06 {

    public static void main(String[] args) {

        double PI = 3.142;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = scanner.nextDouble();
        double areaA = (PI * r * r);
        System.out.println("Area of Circle is : " + areaA);

        scanner.close();
    }

}

package HomeWorkWeek6;

import java.util.Scanner;

// Print the area and perimeter of a rectangle

public class Programme14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input width :  ");
        float w = scanner.nextFloat();

        System.out.println(" Input Height :  ");
        float h = scanner.nextFloat();

        float area = w * h;
        float perimeter = 2 * (w + h);

        System.out.println(" Expected Output :  ");
        System.out.println(" Area of Rectangle : " + area);
        System.out.println(" Perimeter of a rectangle : " + perimeter);

        scanner.close();
    }
}

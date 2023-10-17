package HomeWorkWeek6;

import java.util.Scanner;

// Convert a decimal number to binary number

public class Programme17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number : ");
        int Programme17 = scanner.nextInt();
        String binary = Integer.toBinaryString(Programme17);
        System.out.println("Binary is :   " + binary);

        scanner.close();
    }

}

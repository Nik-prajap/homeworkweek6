package HomeWorkWeek6;

import java.util.Scanner;

//Multiplication table upto 10.

public class Programme10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number :  ");
        int number = scanner.nextInt();
        System.out.println("Multiplication table for " + number + " : ");
        for (int i = 1; i <= 10; i++) {

            System.out.println(number + "  x  " + i + "  =  " + (number * i));
        }
        scanner.close();
    }
}

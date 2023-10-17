package HomeWorkWeek6;

import java.util.Scanner;

// Print the Sum (addition), Multiply, Subtract, Divide and Remainder of two numbers

public class Programme18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the 2nd number : ");
        int num2 = scanner.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int pert = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + multi);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " mod " + num2 + " = " + pert);

        scanner.close();

    }
}

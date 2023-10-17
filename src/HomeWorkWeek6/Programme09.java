package HomeWorkWeek6;

import java.util.Scanner;

// Convert upper case to lower case

public class Programme09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an upper case sentence:");
        String upper = scanner.nextLine();
        String lower = upper.toLowerCase();

        System.out.println("Converted to lower case: " +  lower );

        scanner.close();
    }
}

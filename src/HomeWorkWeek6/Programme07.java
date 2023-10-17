package HomeWorkWeek6;

import java.util.Scanner;

/**
 * insert any temperature value in degree fahrenheit
 * and
 * convert to degree celsius
 * formula ( ( F - 32 ) * 5 / 9 = 0°C )
 */
public class Programme07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in degree Fahrenheit : ");
        int f = scanner.nextShort();
        int c = ( f - 32 ) * 5 / 9;
        System.out.print(" The temperature in degree celsius is : " + c + "°C");
        scanner.close();
    }
}

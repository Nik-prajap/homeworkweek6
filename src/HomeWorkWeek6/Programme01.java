package HomeWorkWeek6;

/**
 * Declare two instance variable
 * Declare one instance method
 * Call both instance variable into the instance method inside the print statement
 * Declare the Main method
 * Call the above instance method into the Main method and Run the Program
 */

public class Programme01 {
    int a;
    int b;

    public void printNumber() {
        System.out.println("a :  " + a);
        System.out.println("b :  " + b);
    }

    public static void main(String[] args) {
        Programme01 obj = new Programme01();
        //values for the instance variables
        obj.a = 50;
        obj.b = 100;
        obj.printNumber();
    }


}

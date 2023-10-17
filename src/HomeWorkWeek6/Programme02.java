package HomeWorkWeek6;

public class Programme02 {
    //Declare static variable
    static String brand = "Toyota";
    static int price = 15000;

    //Declare one static method
    static void print() {
        //Call both static variables into the static method inside the print statement
        System.out.println("Static variable 1st: " + brand);
        System.out.println("Static variable 2nd: " + price);
    }

    //Declare the main method
    public static void main(String[] args) {
        //Call the static method into the Main method and Run the programme
        print();
    }
}

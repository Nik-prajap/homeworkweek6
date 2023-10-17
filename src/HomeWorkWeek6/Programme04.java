package HomeWorkWeek6;

public class Programme04 {
    // Declare two instance variables
    String product1 = "T-Shirt";
    String product2 = "Jeans";
    // and two static variables
    static int price1 = 35;
    static int price2 = 65;

    // Declare one instance method
    public void insMethod() {
        // Call all four instance and static variables into the instance method
        System.out.println(" Inside the Instance Method : ");
        System.out.println(" Instance variable one : " + product1);
        System.out.println(" Instance variable two : " + product2);
        System.out.println(" Static variable one : " + price1);
        System.out.println(" Static variable two : " + price2);
    }

    // Declare one static method
    public static void staMethod() {
        // Call all four instance and static variables into static method
        Programme04 obj1 = new Programme04();
        System.out.println(" Inside the Static Method");
        System.out.println(" Instance variable one : " + obj1.product1);
        System.out.println(" Instance variable two : " + obj1.product2);
        System.out.println(" Static variable one : " + price1);
        System.out.println(" Static variable two : " + price2);
    }

    // Declare the main method
    public static void main(String[] args) {
        // Call both instance and static methods into the main method and run the program
        Programme04 obj = new Programme04();
        obj.insMethod();
        staMethod();
    }


}

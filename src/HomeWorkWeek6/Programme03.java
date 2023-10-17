package HomeWorkWeek6;

public class Programme03 {
    // Declare one instance and one static variable
    String brand = "Audi";
    static int price = 25000;

    // Declare one instance method
    public void inMethod() {
        // Call both instance and static variables into instance method inside the print statement
        System.out.println("Print inside instance method: ");
        System.out.println("Instance variable : " + brand);
        System.out.println("Static variable : " + price);
    }

    // Declare one static method
    public static void staMethod() {
        // Call both instance and static variables into static method inside the print statement
        Programme03 obj1 = new Programme03();
        System.out.println("Print inside Static method : ");
        System.out.println("Static variable : " + price);
        System.out.println("Instance variable : " + obj1.brand);
    }

    //Declare the Main method
    public static void main(String[] args) {
        //Call both instance and static methods into the Main method and run the programme
        Programme03 obj = new Programme03();
        obj.inMethod();
        staMethod();
    }
}

package HomeWorkWeek6;

// swap two variables

public class Programme15 {
    public static void main(String[] args) {
        int a = 989;
        int b = 898;

        System.out.println(" Before swap :  ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println(" After swapped :  ");
        System.out.println(" a =  " + a);
        System.out.println(" b =  " + b);
    }
}

package HomeWorkWeek6;

// Compute the Specified Expression and print output

public class Programme12 {

    public double specifiedExpression() {
        return ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }

    public static void main(String[] args) {
        System.out.println("Test Data : ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))");
        Programme12 cal = new Programme12();
        double expectedOutput = cal.specifiedExpression();
        System.out.println("Result : " + expectedOutput);
    }
}

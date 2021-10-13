package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum value = " +myMinFloatValue);
        System.out.println("Maximum value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum value = " +myMinDoubleValue);
        System.out.println("Maximum value = " +myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue =(double) 5/3;
        System.out.println("MyIntValue = " +myIntValue);
        System.out.println("MyFloatValue = " +myFloatValue);
        System.out.println("MyDoubleValue = " +myDoubleValue);

        double kilograms = 200d;
        double pounds =(double) (0.45359237 * kilograms);
        System.out.println("no. of pounds = " +pounds);
    }
}

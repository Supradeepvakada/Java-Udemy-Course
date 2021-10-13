package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        String isAlien = "false";
        if (isAlien == "true")
            System.out.println(true);
        else
            System.out.println(false);

        double variable = 20.00;
        double secondvariable = 80.00;
        double total = (double) (variable + secondvariable) * 100.00;
        System.out.println(total);
        double remainder = total % 40.00;
        System.out.println(remainder);
        boolean noremainder = (remainder == 0) ? true : false;
        System.out.println(noremainder);
        if (!noremainder)
            System.out.println("got some remainder");
        else
            System.out.println("no remainder");
    }
}

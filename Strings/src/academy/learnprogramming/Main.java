package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a String";
        System.out.println(myString);
        myString = myString + ", and this is more";
        System.out.println("myString = " +myString);
        myString = myString + " \u00A9 2021";
        System.out.println("myString = " +myString);
        String numberstring = "250.55";
        numberstring = numberstring + " 49.95";
        System.out.println(numberstring);

    }
}

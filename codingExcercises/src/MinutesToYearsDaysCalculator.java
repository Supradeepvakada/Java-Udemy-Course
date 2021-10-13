public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        } else {
            long years = minutes/(365*24*60);
            long remainingminutes = minutes%(365*24*60);
            long days = remainingminutes/(24*60);
            System.out.println(minutes+" min = "+years+
                    " y and "+days+" d");
        }
    }
}

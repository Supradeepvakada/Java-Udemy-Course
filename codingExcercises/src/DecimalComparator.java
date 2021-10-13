public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int one =(int) (a*1000);
        int two =(int) (b*1000);
        if ( one == two){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
}

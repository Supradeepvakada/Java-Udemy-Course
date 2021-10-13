public class LastDigitChecker {
//    public static void main(String[] args) {
//        System.out.println(hasSameLastDigit(23,32,42));
//    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if (a<10 || a>1000 || b<10 || b>1000 || c<10 || c>1000)
            return false;
        else  return  ((a%10==b%10) || (b%10==c%10) || (c%10==a%10));
    }
}

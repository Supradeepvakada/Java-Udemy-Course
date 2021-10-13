public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number<0)
            return -1;
        int copy=number;
        int reverse=0;
        int lastDigit=copy%10;
        while (copy>0){
            int digit=copy%10;
            reverse=(reverse*10)+digit;
            copy=copy/10;
        }
        int firstdigit=reverse%10;
        return lastDigit+firstdigit;
    }
}

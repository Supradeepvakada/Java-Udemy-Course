public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(256));
    }

    private static int sumDigits(int number){
        if (number<10)
            return -1;
        int sum=0;
        while (number>0){
            int digit = number%10;
            sum = sum+ digit;
            number = number /10;
        }
        return sum;
    }
}

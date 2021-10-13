public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number){
        if (number<0)
            number=number*-1;
        int reverse=0;
        int a=number;
        while (a>0){
            int digit=a%10;
            reverse=(reverse*10)+digit;
            a=a/10;
        }
        System.out.println(reverse);
        if (number==reverse)
            return true;
        return false;
   }
}

//public class NumberToWords {
//    public static void main(String[] args) {
//        numberToWords(256);
//        printNumberInWord(256);
//    }
//    public static void numberToWords(int number){
//        int reverse=0;
//        int copy=number;
//        if (number<0)
//            System.out.println("Invalid Value");
//        while (copy!=0){
//            int digit=copy%10;
//            reverse=(reverse*10)+digit;
//            copy=copy/10;
//        }
//        int copyReverse=reverse;
//        while (copyReverse>0){
//            int digit=copyReverse%10;
//            System.out.println(printNumberInWord(digit));
//            copyReverse=copyReverse/10;
//        }
//        }
//        private static boolean printNumberInWord(int number){
//            switch (number){
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//                default:
//                    break;
//            }
//            return false;
//        }
//}
public class NumberToWords {
    public static void numberToWords(int number)
    {
        if(number<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int digitcount = getDigitCount(number);
            int received = reverse(number);
            for (int i = digitcount; i > 0; i--)
            {
                switch(received % 10)
                {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
                received /= 10;
            }
        }
    }
    public static int reverse(int a)
    {
        int reversenum = 0;
        int digit = 0;
        while(a!=0)
        {
            digit = a%10;
            reversenum = (reversenum*10)+digit;
            a = a/10;
        }
        return reversenum;
    }
    public static int getDigitCount(int b)
    {
        int digitcount = 0;
        if(b<0)
        {
            return -1;
        }
        else
        {
            while(b!=0)
            {
                digitcount++;
                b /= 10;
            }
        }
        if(digitcount == 0)
        {
            digitcount++;
        }
        return digitcount;
    }
}
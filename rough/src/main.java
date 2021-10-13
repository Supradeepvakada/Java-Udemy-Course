public class main {
    public static void main(String[] args) {
        for (int i=1; i<3; i++){
            System.out.println("10000 at "+i+"% interest = "+
                    String.format("%.2f",calculateInterest(10000,i)));
        }
        int count =0;
        for (int i=2; i<1000; i++){
            if (isPrime(i)){
                count++;
                System.out.println("number "+i+" is a prime number");
//                if (count==5){
//                    System.out.println("exit");
//                    break;
//                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n==1)
            return false;
        for (int i=2;i<n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}

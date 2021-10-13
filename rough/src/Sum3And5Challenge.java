public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum=0, count=0;
        for (int i=1; i<1000; i++){
            if (i%3==0 && i%5==0){
                count++;
                sum=sum+i;
                System.out.println("number is "+i);
                if (count==5)
                    break;
            }
        }
        System.out.println("sum is "+ sum);
    }
}

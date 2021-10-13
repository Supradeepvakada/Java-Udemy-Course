public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }
    public static boolean isOdd(int n){
        if (n>0 && n%2!=0)
            return true;
        return false;
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        if (start>0 && end>0 && end>=start){
            for (int i=start;i<=end;i++){
                if (isOdd(i)){
                    sum=sum+i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}

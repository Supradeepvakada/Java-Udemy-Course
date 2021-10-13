public class section5_68 {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(20));

        int number=4;
        int finishedNumber=20;
        int evenNumbersFound=0;

        while (number<=finishedNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("even number is "+number);
            evenNumbersFound++;
            if (evenNumbersFound==5)
                break;
        }
        System.out.println("total even numbers = "+ evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        if (number%2==0){
            return true;
        }
        return false;
    }
}

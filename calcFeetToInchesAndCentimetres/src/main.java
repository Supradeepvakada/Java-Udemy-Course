public class main {

        public static void main(String[] args) {
            calcFeetAndInchesToCentimetres(6,0);
            calcFeetAndInchesToCentimetres(100);
        }

        public static double calcFeetAndInchesToCentimetres(double feet, double inches){
            if ((feet<0) || (inches<0 || inches>12)){
                System.out.println("Invalid");
                return -1;
            }
                double centimetres=(double) (inches*2.54+(feet*12)*2.54);
                System.out.println(centimetres);
                return centimetres;
        }

        public static double calcFeetAndInchesToCentimetres(double inches){
            if (inches<0){
                System.out.println("Invalid");
                return -1;
            } else {
                double feet=(int) inches/12;
                double remainingInches=(int) inches%12;
                System.out.println(inches+" in = "+ feet+" ft "+ remainingInches +" inches ");
                return calcFeetAndInchesToCentimetres(feet, remainingInches);
            }
        }
        public static void grtboink

}

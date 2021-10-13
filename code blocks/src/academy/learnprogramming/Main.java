package academy.learnprogramming;

public class Main {

    public static void main(String[] args){
        boolean gameover = true;
        int score = 10000;
        int levelcompleted = 8;
        int bonus = 200;

        calculateScore();

        if (gameover){
            int finalscore=score+(levelcompleted*bonus);
            System.out.println(finalscore);
        }
    }

    private static void calculateScore() {
    }

    public static void calculateScore(int score){
        boolean gameover = true;
        int score = 10000;
        int levelcompleted = 8;
        int bonus = 200;
        if (gameover==true){
            int finalscore=score+(levelcompleted*bonus);
            System.out.println(finalscore);
        }
    }
}

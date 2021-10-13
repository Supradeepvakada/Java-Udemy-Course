package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        car porsche = new car();
        car holden = new car();
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
    }
}

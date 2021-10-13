public class main {

    public static void main(String[] args) {
        BankAccount bob = new BankAccount(123 );
        bob.withdrawAmount(100);
        bob.deposit(500);
        bob.withdrawAmount(100);
    }
}

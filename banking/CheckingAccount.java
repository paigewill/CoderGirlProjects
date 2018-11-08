package banking;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit = 200;


    @Override
    public void withdraw(double amount) {
        if (this.balance + overdraftLimit >= amount) {
            this.balance -= amount;
        }
    }

    public static void main(String[] args) {
    }
}

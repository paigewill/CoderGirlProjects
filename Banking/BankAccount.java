package Banking;

public class BankAccount {
    protected double balance;
    protected int accountNumber;
    protected static int nextAccountNumber = 1;

    public BankAccount() {
        this.balance = 0;
        this.accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
        }
    }
}

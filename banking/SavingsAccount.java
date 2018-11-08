package banking;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public void compoundInterest() {
        this.balance = this.balance + (this.balance  * this.interestRate);
    }
}

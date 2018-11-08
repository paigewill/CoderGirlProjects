package banking;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount a) {
        this.accounts.add(a);
    }
    public static void main(String[] args) {
        Bank commerceBank = new Bank();
        CheckingAccount paigesChecking = new CheckingAccount();
        SavingsAccount paigesSaving = new SavingsAccount(.01);
        commerceBank.addAccount(paigesChecking);
        commerceBank.addAccount(paigesSaving);
    }
}

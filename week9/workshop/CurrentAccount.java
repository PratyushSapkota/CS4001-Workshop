package week9.workshop;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount {
    private double overdraftLimit;


    public CurrentAccount(long accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance() + this.overdraftLimit) {
            super.balance -= amount;
        } else {
            System.out.println("Cannot withdraw");
        }
    }
}
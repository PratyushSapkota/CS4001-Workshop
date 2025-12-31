package week9.workshop;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount {
    protected long accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
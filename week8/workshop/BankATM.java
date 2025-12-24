package week8.workshop;


/**
 * Write a description of class BankATM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankATM {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123981293L, 45000, "name1");

        bankAccount.deposit(500.2);
        System.out.println(bankAccount.getBalance());

        boolean transactionStatus1 = bankAccount.withdraw(3000);
        System.out.println("First withdraw: " + transactionStatus1);
        System.out.println(bankAccount.getBalance());

        boolean transactionStatus2 = bankAccount.withdraw(600000);
        System.out.println("Second withdraw: " + transactionStatus2);
        System.out.println(bankAccount.getBalance());

    }
}
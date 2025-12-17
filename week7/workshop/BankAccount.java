package week7.workshop;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount {
    long number;
    String holder;
    float balance;

    BankAccount(long accountNumber, String holderName) {
        this.number = accountNumber;
        this.holder = holderName;
    }

    void depositMoney(float amount) {
        this.balance += amount;
    }

    void withdrawMoney(float amount) {
        this.balance -= amount;
    }

    void balance() {
        System.out.println("Rs " +balance);
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1233243212312312L, "Aryan");
        BankAccount account2 = new BankAccount(131287934319819023L, "Sethi");

        account1.depositMoney(50000);
        account1.withdrawMoney(4000);


        account2.withdrawMoney(500);


        System.out.println("Balance for " + account1.number + " is: ");
        account1.balance();

        System.out.println("Balance for " + account2.number + " is: ");
        account2.balance();

    }
}
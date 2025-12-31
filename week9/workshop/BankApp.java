package week9.workshop;


public class BankApp {
    public static void main(String[] args) {
        System.out.println("Savings Account");
        SavingsAccount savingsAccount = new SavingsAccount(132413984093L, "Aryan", 5000, 3.2);
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(5000);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());

        System.out.println("Current Account");
        CurrentAccount currentAccount = new CurrentAccount(132413984093L, "Aryan", 300, 50);
        System.out.println("Balance: " + currentAccount.getBalance());
        currentAccount.withdraw(400);
        currentAccount.withdraw(20);
        System.out.println("Balance after withdraw proper amount: " + currentAccount.getBalance());
    }
}
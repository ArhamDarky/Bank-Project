import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;
    private boolean isActive;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        this.isActive = true;
    }

    public void withdraw(double amount) {
        if (balance == 0) {
            System.out.println("Withdrawal denied. Balance is zero.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrawal: -" + amount);
    }
    

    public void deposit(double amount) {
        double interest = amount * 0.01;
        amount += interest;
        balance += amount;
        transactionHistory.add("Deposit (with 1% interest): +" + amount);
    }
}

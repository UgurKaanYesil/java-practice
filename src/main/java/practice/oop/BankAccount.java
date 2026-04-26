package practice.oop;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private Double balance;

    public BankAccount(String accountNumber, String holderName, Double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

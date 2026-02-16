package lab_1.problem2;

public class BankAccount {
    private static int nextAccountNumber;

    private final int accountNumber;
    private final String ownerName;
    private final AccountLevel level;

    private double balance;

    {
        nextAccountNumber++;
    }

    public BankAccount(int accountNumber, String ownerName, AccountLevel level) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.level = level;
    }

    public void deposit(double amount){
        this.deposit(amount, "standard deposit");
    }

    public void deposit(double amount, String description){
        if(amount > 0){
            balance += amount;
            System.out.println(description + " : " + amount);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public AccountLevel getLevel() {
        return level;
    }

    public double getBalance() {
        return balance;
    }
}

package lab2.problem3;

public class CheckingAccount extends Account {
    private static final int FREE_TRANSACTIONS = 3;
    private static final double FEE_PER_TRANSACTION = 0.02;
    private int transactionCount;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    private void recordTransaction() {
        transactionCount++;
        if (transactionCount > FREE_TRANSACTIONS) {
            deductFee();
        }
    }

    public void deductFee() {
        if (getBalance() >= FEE_PER_TRANSACTION) {
            super.withdraw(FEE_PER_TRANSACTION);
        }
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        recordTransaction();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        recordTransaction();
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public String toString() {
        return "CheckingAccount #" + getAccountNumber() +
                " | Balance: $" + String.format("%.2f", getBalance()) +
                " | Transactions: " + transactionCount +
                " | Free Transactions: " + FREE_TRANSACTIONS;
    }
}
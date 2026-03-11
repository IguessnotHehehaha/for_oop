package lab2.problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount #" + getAccountNumber() +
                " | Balance: $" + String.format("%.2f", getBalance()) +
                " | Interest Rate: " + interestRate + "%";
    }
}

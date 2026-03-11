package lab2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        this.accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Opened: " + account);
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(a -> a.getAccountNumber() == accNumber);
        System.out.println("Closed account #" + accNumber);
    }

    public Account findAccount(int accNumber) {
        for (Account a : accounts) {
            if (a.getAccountNumber() == accNumber) {
                return a;
            }
        }
        return null;
    }

    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingsAccount) {
                ((SavingsAccount) a).addInterest();
            } else if (a instanceof CheckingAccount) {
                ((CheckingAccount) a).deductFee();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== Bank Accounts ===\n");
        for (Account a : accounts) {
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
}
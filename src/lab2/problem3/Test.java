package lab2.problem3;

public class Test{
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings1 = new SavingsAccount(1001, 5.0);
        SavingsAccount savings2 = new SavingsAccount(1002, 3.5);
        CheckingAccount checking1 = new CheckingAccount(2001);
        CheckingAccount checking2 = new CheckingAccount(2002);

        bank.openAccount(savings1);
        bank.openAccount(savings2);
        bank.openAccount(checking1);
        bank.openAccount(checking2);

        System.out.println();

        savings1.deposit(1000.00);
        savings2.deposit(500.00);

        checking1.deposit(200.00);
        checking1.withdraw(50.00);
        checking1.deposit(30.00);
        checking1.withdraw(10.00);
        checking1.deposit(20.00);

        System.out.println("\nBefore update");
        System.out.print(bank);

        bank.update();

        System.out.println("After update");
        System.out.print(bank);

        System.out.println("Transfer $100 from savings1 to checking2");
        savings1.transfer(100.00, checking2);
        System.out.print(bank);

        bank.closeAccount(1002);
        System.out.println();
        System.out.print(bank);
    }
}
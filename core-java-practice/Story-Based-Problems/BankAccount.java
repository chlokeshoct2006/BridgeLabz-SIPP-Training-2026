class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;

    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println(holder +
                    " withdrawal of ₹" + amount +
                    " failed (Insufficient Balance)");
        }
    }

    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("-----------------------------");
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("ACC101", "Lokesh", 10000);
        BankAccount acc2 = new BankAccount("ACC102", "Aman", 15000);
        BankAccount acc3 = new BankAccount("ACC103", "Mahak", 20000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(10000);

        acc2.deposit(5000);
        acc2.withdraw(2000);
        acc2.withdraw(1000);
        acc2.deposit(3000);
        acc2.withdraw(25000);

        acc3.withdraw(5000);
        acc3.deposit(10000);
        acc3.withdraw(2000);
        acc3.deposit(1500);
        acc3.withdraw(1000);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println("\nTotal Accounts Created: "
                + BankAccount.getTotalAccounts());
    }
}
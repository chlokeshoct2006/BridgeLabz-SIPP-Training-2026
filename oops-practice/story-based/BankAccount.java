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
            System.out.println(holder + " deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew: " + amount);
        } else {
            System.out.println(holder + " withdrawal failed. Insufficient balance.");
        }
    }

    public void getStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }


    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("ACC101", "Lokesh", 10000);
        BankAccount a2 = new BankAccount("ACC102", "Riya", 15000);
        BankAccount a3 = new BankAccount("ACC103", "Aman", 20000);

        a1.deposit(2000);
        a1.withdraw(1500);
        a1.deposit(1000);
        a1.withdraw(5000);
        a1.withdraw(7000);

        a2.deposit(3000);
        a2.withdraw(2000);
        a2.deposit(500);
        a2.withdraw(10000);
        a2.withdraw(8000);

        a3.deposit(4000);
        a3.withdraw(3000);
        a3.deposit(2500);
        a3.withdraw(10000);
        a3.withdraw(15000);

        System.out.println("\nFinal Statements:\n");
        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
    }
}
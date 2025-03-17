public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance);
        setAccountHolderName(accountHolderName);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Deposit " + amount + "$ to Account Number: " + accountNumber);
            balance += amount;
        }
        else System.out.println("Amount should be positive");
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw " + amount + "$ from " + accountNumber);
        }
        else System.out.println("Amount should be positive and less than balance");
    }

    @Override
    public String toString() {
        return "User: '" + accountHolderName + "' with account number: '" + accountNumber + "' has: " + balance + "$";
    }

}

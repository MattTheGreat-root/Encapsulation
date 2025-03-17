public class TransactionAccount extends BankAccount{
    private final double overdraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest rate available for this Transaction account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdraw " + amount + "$ from " + super.getAccountNumber());
        }
        else System.out.println("Amount should be positive and less than balance + overdraft limit");
    }
}

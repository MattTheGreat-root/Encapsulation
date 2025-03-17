public class Main {
    public static void printLine(){
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        TransactionAccount transactionAccount1 = new TransactionAccount("1234", "Jane", 100);
        TransactionAccount transactionAccount2 = new TransactionAccount("9876", "John", 200);
        TransactionAccount transactionAccount3 = new TransactionAccount("5678", "Jack", 300);
        SavingAccount savingAccount1 = new SavingAccount("123", "June", 500);
        SavingAccount savingAccount2 = new SavingAccount("987", "Jinx", 600);
        SavingAccount savingAccount3 = new SavingAccount("567", "Jeff", 1000);

        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(transactionAccount3);
        bank.addAccount(savingAccount1);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);

        bank.findAccount("1234");
        bank.findAccount("111");
        printLine();
        System.out.println(transactionAccount1.getBalance());
        transactionAccount1.deposit(100);
        System.out.println(transactionAccount1.getBalance());
        printLine();
        transactionAccount2.deposit(-50);
        printLine();
        transactionAccount3.calculateInterest();
        savingAccount1.calculateInterest();
        printLine();
        System.out.println(savingAccount1.getBalance());
        System.out.println(transactionAccount3.getBalance());
        printLine();
        transactionAccount1.withdraw(50);
        transactionAccount2.withdraw(-10);
        transactionAccount3.withdraw(5000);
        printLine();
        savingAccount1.withdraw(50);
        savingAccount2.withdraw(-10);
        savingAccount3.withdraw(5000);
        printLine();
        bank.showAllBalances();
    }
}
